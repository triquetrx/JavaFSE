package com.cts.handson.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.cts.handson.model.EBill;

@Service
@ComponentScan("com.cts.handson")
public class EBillDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	PlatformTransactionManager txManager;
	
	public void deleteBill(long...billNumbers) {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = txManager.getTransaction(def);
		try {
			//delete business logic here
			for(long billNumber:billNumbers) {
				if(billNumber>=100) {
					String sql = "delete from ebill where billnumber=?";
					jdbcTemplate.update(sql,billNumber);
					txManager.commit(status);
				} else {
					throw new RuntimeException();
				}
			}
		}catch(Exception ex) {
			//roll back logic here
			txManager.rollback(status);
		}
	}

	public List<EBill> getAllBill() {
		//retrieve business logic here
		BeanPropertyRowMapper<EBill> beanPropertyRowMapper = BeanPropertyRowMapper.newInstance(EBill.class); 
		List<EBill> result = new ArrayList<>();
		String sql = "select * from ebill;";
		result.add(jdbcTemplate.queryForObject(sql, beanPropertyRowMapper));
		return result;
	}
}

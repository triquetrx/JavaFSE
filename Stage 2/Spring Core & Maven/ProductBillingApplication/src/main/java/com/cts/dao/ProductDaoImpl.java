package com.cts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	// wire dependency
	@Autowired
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public Product getProductDetails(int product_code) {
		// add your code here
		String sql = "select * from product where product_code=?";
		BeanPropertyRowMapper<Product> rowMapper= BeanPropertyRowMapper.newInstance(Product.class);
		return template.queryForObject(sql, new Object[]{product_code}, rowMapper);
	}

}

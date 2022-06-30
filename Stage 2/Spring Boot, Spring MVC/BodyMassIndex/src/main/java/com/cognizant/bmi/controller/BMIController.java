package com.cognizant.bmi.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bmi.bean.User;
import com.cognizant.bmi.service.BMIService;
;

public class BMIController {
//add the code as per the requirement
	
	public String showBMIForm(@ModelAttribute("user") User user) {
		return "bmiCalculatorForm";
	}

	public String getBMIStatus(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap map) {
		return null;

	}

	public List<String> populateGenderList() {
	return null;
	}
}
package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Construction;
import com.service.ConstructionService;

//use appropriate annotation to configure ConstructionController as Controller
@Controller
public class ConstructionController {

	//invoke the service class - calculateConstructionCost method.
	@Autowired
	private ConstructionService service;
	
	//Main Page for estimation
	@RequestMapping(value = "/estimatorPage",method=RequestMethod.GET)
	public String estimatorPage(@ModelAttribute("construction") Construction construction) {
		return "estimatorpage";
	}
	
	//Bricks list	
	@ModelAttribute("buildList")
	public Map<String,String> buildState(){
		Map<String,String> serviceMap = new HashMap<>();
		serviceMap.put("UnburntClayBricks", "UnburntClayBricks");
		serviceMap.put("BurntClayBricks", "BurntClayBricks");
		serviceMap.put("ConcreteBricks", "ConcreteBricks");
		return serviceMap;
	}
	
	
	//Result in the post method
	@RequestMapping(value="/result",method=RequestMethod.POST)
	public String calculateConstructionCost(@Valid @ModelAttribute("construction") Construction construction, 
			BindingResult result,ModelMap map)
	{
		//If the validation fails then stay on the same page
		if(result.hasErrors()) {
			return "estimatorpage";
		} else {
			//Else display the result
			double cost = service.calculateConstructionCost(construction);
			map.addAttribute("cost", cost);
			return "result";	
		}
	}
	
	

}

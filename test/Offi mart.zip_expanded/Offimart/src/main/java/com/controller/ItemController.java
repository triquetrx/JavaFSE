package com.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exception.InvalidItemException;
import com.model.Item;
import com.service.ItemService;

//use appropriate annotation to configure ItemController as Controller
@Controller
public class ItemController {

//Use appropriate Annotation
	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("item") Item item) {
		return "showPage";
	}

	@ModelAttribute("itemList")
	public ArrayList<String> populateItems() {
		ArrayList<String> itemList = new ArrayList<>();
		for (Item item : itemService.getItemList()) {
			itemList.add(item.getItemName());
		}
		return itemList;
	}

	// invoke the service class - calculateCostAndUpdate method.
	@RequestMapping(value = "/billDesk", method = RequestMethod.POST)
	public ModelAndView calculateCostAndUpdate(@ModelAttribute("item") @Valid Item item, BindingResult result,
			ModelAndView mv) throws InvalidItemException {

		// fill the code
		if (result.hasErrors()) {
			mv.setViewName("showPage");
		} else {
			Item obj = itemService.getItemFromList(item.getItemName());
			boolean flag = itemService.performUpdate(obj, item.getQuantity());
			if (flag) {
				double cost = itemService.calculateCost(obj.getCostPerItem(), item.getQuantity());
				mv.addObject("cost", cost);
				mv.addObject("costPerItem", obj.getCostPerItem());
				mv.addObject("itemName", item.getItemName());
				mv.addObject("quantity", item.getQuantity());

			}
			mv.setViewName("billDesk");
		}
		return mv;
	}

//Use appropriate annotation to handle the exception
	@ExceptionHandler(InvalidItemException.class)
	public ModelAndView exceptionHandler(Exception e) {

		// fill the code
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", e.getMessage());
		mav.setViewName("exceptionPage");
		return mav;
	}

}

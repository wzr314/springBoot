package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;	//Json dada
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Bike;


@Controller
public class BikeController {
	
	//test
	@RequestMapping("/hi")
	@ResponseBody
	public String hello(String mgs) {
		return "hello " + mgs;
	}
	
	//add bike data to server side
	@RequestMapping("/addBike")
	@ResponseBody
	public String add(@RequestBody Bike bike) {
		System.out.print(bike);
		
		return "end";
	}
}
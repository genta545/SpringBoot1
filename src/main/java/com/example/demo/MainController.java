package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
	
@Controller
public class MainController {
@RequestMapping("/")
public ModelAndView index(ModelAndView mv) {
	mv.setViewName("index");
	return mv;
}
//課題用の表示
@RequestMapping("/homework")
public ModelAndView homework(ModelAndView rt) {
	rt.setViewName("homework");
	return rt;
}
}
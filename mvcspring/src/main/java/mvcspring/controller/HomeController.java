package mvcspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("hello from home");

		model.addAttribute("name", "mukesh");
		List<String> list = new ArrayList<String>();
		list.add("mukesh");
		list.add("arvind");
		list.add("ramesh");
		list.add("rakesh");
		model.addAttribute("names", "list");

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("about you ???");

		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is landing help page");
		ModelAndView modelandView = new ModelAndView();
		modelandView.addObject("name", "jack");
		modelandView.setViewName("help");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		modelandView.addObject("ids",list);

		return modelandView;
	}

}

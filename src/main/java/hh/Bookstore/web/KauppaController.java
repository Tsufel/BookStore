package hh.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hh.Bookstore.domain.BookRepository;



@Controller
public class KauppaController {

	@Autowired /*Kun Spring sovellus käynnistyy se luo itseStudentRepositoryn
	-rajapinna toteuttavan luokan olion ja kytkee sen tämän controlleriluokan olion attribuutti olioksi*/
	private BookRepository BookRepository;
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/allbooks")
	public String getAllStudents(Model model) {
		//List<Student> students = (List<Student>)studentRepository.findAll();
		//model.addAttribute("students",students);
		model.addAttribute("books",BookRepository.findAll());
		return "studentlist"; //studentlist.html
	}
	
}

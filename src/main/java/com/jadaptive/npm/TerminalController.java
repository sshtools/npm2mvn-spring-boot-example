package com.jadaptive.npm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TerminalController {

	@GetMapping("/term")
	public String term(Model model) {
		return "term";
	}

}
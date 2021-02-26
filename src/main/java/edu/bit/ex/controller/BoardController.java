package edu.bit.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@AllArgsConstructor
@Log4j
@Controller
public class BoardController {
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list");
		model.addAttribute("list", boardService.getList());
		
		return "list";
	}
	
	@GetMapping("/write_view")
	public String writeView(Model model) {
		log.info("write_view");
		
		return "write_view";
	}
	
	@PostMapping("/write")
	public String write(BoardVO boardVO, Model model) {
		log.info("write()");
		boardService.write(boardVO);
		
		return "redirect:list";
	}
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view");
		model.addAttribute("content_view", boardService.content(boardVO));
		
		return "content_view";
	}
	


	
	
}

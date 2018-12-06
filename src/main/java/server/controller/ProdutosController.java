package server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/produto")
public class ProdutosController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		return new ModelAndView("/WEB-INF/views/produto/list.jsp");
	}

}

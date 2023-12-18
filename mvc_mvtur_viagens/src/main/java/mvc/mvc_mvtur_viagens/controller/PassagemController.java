package mvc.mvc_mvtur_viagens.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.mvc_mvtur_viagens.model.Passagens;
import mvc.mvc_mvtur_viagens.repository.PassagemRepository;

@Controller
@RequestMapping("/passagens")
public class PassagemController {

	@Autowired
	private PassagemRepository passagemRepository;
	
	@GetMapping
	public ModelAndView passagem() {
		ModelAndView modelAndView = new ModelAndView("views/passagens/index.html");		
		modelAndView.addObject("passagens", passagemRepository.findAll());
		
		modelAndView.addObject("passagem", new Passagens());
		
		return modelAndView;
	}
	
	@PostMapping({"/cadastrar"})
	public String cadastrar(Passagens passagem) {
		passagemRepository.save(passagem);
		
		return "redirect:/passagens";
	}
	
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		passagemRepository.deleteById(id);
		
		return "redirect:/passagens";
	}
	@PutMapping({"/editar/{id}"})
	public String editar(@PathVariable Long id, Passagens passagem) {
		passagemRepository.save(passagem);
		
		return "redirect:/passagem";
	}
	
}
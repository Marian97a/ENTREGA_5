package mvc.mvc_mvtur_viagens.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.mvc_mvtur_viagens.model.Destinos;
import mvc.mvc_mvtur_viagens.repository.DestinoRepository;

@Controller
@RequestMapping("/destinos")
public class DestinoController {

	@Autowired
	private DestinoRepository destinoRepository;
	
	@GetMapping
	public ModelAndView destino() {
		ModelAndView modelAndView = new ModelAndView("views/destinos/index.html");		
		modelAndView.addObject("destinos", destinoRepository.findAll());
		
		modelAndView.addObject("destino", new Destinos());
		
		return modelAndView;
	}
	
	@PostMapping({"/cadastrar"})
	public String cadastrar(Destinos destino) {
		destinoRepository.save(destino);
		
		return "redirect:/destinos";
	}
	
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		destinoRepository.deleteById(id);
		
		return "redirect:/destinos";
	}
	@PutMapping({"/editar/{id}"})
	public String editar(@PathVariable Long id, Destinos destino) {
		destinoRepository.save(destino);
		
		return "redirect:/destino";
	}
	
}
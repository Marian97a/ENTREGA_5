package mvc.mvc_mvtur_viagens.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.mvc_mvtur_viagens.model.Clientes;
import mvc.mvc_mvtur_viagens.repository.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public ModelAndView cliente() {
		ModelAndView modelAndView = new ModelAndView("views/clientes/index.html");		
		modelAndView.addObject("clientes", clienteRepository.findAll());
		
		modelAndView.addObject("cliente", new Clientes());
		
		return modelAndView;
	}
	
	@PostMapping({"/cadastrar"})
	public String cadastrar(Clientes cliente) {
		clienteRepository.save(cliente);
		
		return "redirect:/clientes";
	}
	
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		clienteRepository.deleteById(id);
		
		return "redirect:/clientes";
	}
	@PutMapping({"/editar/{id}"})
	public String editar(@PathVariable Long id, Clientes cliente) {
		clienteRepository.save(cliente);
		
		return "redirect:/cliente";
	}
	
}
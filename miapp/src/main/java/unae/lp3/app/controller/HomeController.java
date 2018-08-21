package unae.lp3.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.models.Pelicula;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET ) 
	public String mostrarPrincipal(Model model) 
	{
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");	
	List<Pelicula> peliculas=getLista();
	model.addAttribute("peliculas", peliculas);
		return "home";	
	}
	
	private List<Pelicula> getLista() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		lista= new LinkedList<>();
		Pelicula peli1= new Pelicula(1, "Power Rangers",105, "A", "Accion", "cinema.png");
		Pelicula peli2= new Pelicula(2, "El engendro",105, "A", "Terror", "cinema.png");
		Pelicula peli3= new Pelicula(3, "Oean 16",145, "A", "Accion", "cinema.png");
		Pelicula peli4= new Pelicula(4, "Indiana Jones VI",125, "A", "Aventura", "cinema.png");
		lista.add(peli1);
		lista.add(peli3);
		lista.add(peli2);
		lista.add(peli4);
		return lista;

	}
	
}
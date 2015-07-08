package it.polimi.awt.mpcs.controller;

import it.polimi.awt.mpcs.service.GalleryService;
import it.polimi.awt.mpcs.service.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class PersonalGalleryController {
	
	@Autowired
	private PersonalService personalService;
	
	@Autowired
	private GalleryService galleryService;
	
	@RequestMapping("/map")
	public String myMapGallery(){
		return "personalGallery";
	}
	@RequestMapping("/classic")
	public String myClassicGallery(){
		return "personalGallery";
	}
	
	public String photoDetail(){
		return null;
	}
	
	public String deletePhoto(){
		return null;
	}
	@RequestMapping("/save/{id}")
	public String savePhoto(Model model, @PathVariable("id") int id, RedirectAttributes redirectAttributes){
		
		personalService.savePhoto(id);
		
		model.addAttribute("mountain", galleryService.getPhoto(id));
		
		redirectAttributes.addFlashAttribute("esitoPositivo", "Photo saved on your personal gallery!");
		
		return "redirect:/photo/"+id;
	}
}

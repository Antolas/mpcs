package it.polimi.awt.mpcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/gallery")
public class PersonalGalleryController {
	
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
	
	public String savePhoto(){
		return null;
	}
}

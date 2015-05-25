package it.polimi.awt.mpcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	
	@RequestMapping("/map")
	public String mapGallery(){
		return "mapGallery";
	}
	@RequestMapping("/classic")
	public String classicGallery(){
		return "classicGallery";
	}
	
	public String photoDetail(){
		return null;
	}
	@RequestMapping("/search")
	public String searchGallery(){
		return "mapGallery";
	}

}

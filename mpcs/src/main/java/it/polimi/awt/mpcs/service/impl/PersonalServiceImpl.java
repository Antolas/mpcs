package it.polimi.awt.mpcs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.polimi.awt.mpcs.domain.MountainPhoto;
import it.polimi.awt.mpcs.repository.PhotoRepository;
import it.polimi.awt.mpcs.service.PersonalService;

@Service
public class PersonalServiceImpl implements PersonalService{

	@Autowired
	private PhotoRepository photoRepository;
	
	public void personalGallery() {
		// TODO Auto-generated method stub
		
	}

	public void personalPhoto() {
		// TODO Auto-generated method stub
		
	}

	public void savePhoto(int id) {

		MountainPhoto photo = photoRepository.getPhotoByID(id);
		photo.setSaved(true);
		photoRepository.updatePhoto(photo);
		
	}

	public void deletePhoto() {
		// TODO Auto-generated method stub
		
	}

}

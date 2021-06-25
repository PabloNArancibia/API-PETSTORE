package cl.pablone.api.petstore.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.pablone.api.petstore.viewmodel.ModelApiResponse;
import cl.pablone.api.petstore.viewmodel.Pet;

@Controller
@RequestMapping("${openapi.animales.base-path:/v2}")
public class PetApiController implements PetApi {

	@Override
	public ResponseEntity<ModelApiResponse> addPet(@Valid Pet body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Valid List<String> status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Pet> getPetById(Long petId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> updatePet(@Valid Pet body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
		// TODO Auto-generated method stub
		return null;
	}

 

}

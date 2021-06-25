package cl.pablone.api.petstore.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.pablone.api.petstore.viewmodel.PetsResponse;
import cl.pablone.api.petstore.viewmodel.RegisterRequest;
import cl.pablone.api.petstore.viewmodel.RegisterResponse;
import cl.pablone.api.petstore.viewmodel.User;
import cl.pablone.api.petstore.viewmodel.UsersResponse;

@Controller
@RequestMapping("${openapi.animales.base-path:/v2}")
public class UserApiController implements UserApi {

	@Override
	public ResponseEntity<RegisterResponse> addUser(@Valid RegisterRequest body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PetsResponse> listPetUser(String idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UsersResponse> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> updateUser(@Valid User body) {
		// TODO Auto-generated method stub
		return null;
	}


}

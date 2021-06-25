package cl.pablone.api.petstore.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.pablone.api.petstore.viewmodel.LoginRequest;
import cl.pablone.api.petstore.viewmodel.LoginResponse;

@Controller
@RequestMapping("${openapi.animales.base-path:/v2}")
public class AuthenticationApiController implements AuthenticationApi {
	
	private static final Logger log = LoggerFactory.getLogger(AuthenticationApiController.class);
	
	@Override
	public ResponseEntity<LoginResponse> logUser(@Valid LoginRequest body) {
	
		log.info("onlogUser");
		log.info("request:"+body.toString());
		return null;
	}

	@Override
	public ResponseEntity<Void> logoutUser() {
		// TODO Auto-generated method stub
		return null;
	}


}

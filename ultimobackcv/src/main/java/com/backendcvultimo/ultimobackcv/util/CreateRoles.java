package com.backendcvultimo.ultimobackcv.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.backendcvultimo.ultimobackcv.models.Role;
import com.backendcvultimo.ultimobackcv.security.services.RolService;

@Component
public class CreateRoles implements CommandLineRunner {

	@Autowired
	RolService rolService;
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Role rolAdmin = new Role(ERole.ROLE_ADMIN);
		Role rolUser = new Role(ERole.ROLE_USER);
		Role rolModerator = new Role(ERole.ROLE_MODERATOR);

		rolService.save(rolAdmin);
		rolService.save(rolUser);
		rolService.save(rolModerator);

	}
*/

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

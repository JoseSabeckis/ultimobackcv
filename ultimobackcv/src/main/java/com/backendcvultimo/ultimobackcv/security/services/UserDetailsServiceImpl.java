package com.backendcvultimo.ultimobackcv.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backendcvultimo.ultimobackcv.models.User;
import com.backendcvultimo.ultimobackcv.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findByUsername(username)
		        .orElseThrow(() -> new UsernameNotFoundException("Usuario No Encontrado: " + username));

		    return UserDetailsImpl.build(user);
	}

}

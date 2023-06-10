/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioServicio;

    @Override
    public UserDetails loadUserByUsername(String alias) throws UsernameNotFoundException {
       Usuario usuario = usuarioServicio.getByalias(alias).get();
       return  UsuarioPrincipal.build(usuario);
    }
}

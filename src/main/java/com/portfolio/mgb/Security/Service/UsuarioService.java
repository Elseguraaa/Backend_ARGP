/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Service;

import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired 
    iUsuarioRepository iusuarioRepositorio;
    
    
    public  Optional<Usuario> getByalias(String alias){
        return iusuarioRepositorio.findByalias(alias);
    }
    
    
    
    
    public boolean  existsbyalias(String alias){
        return iusuarioRepositorio.existsByalias(alias);
    }
    
     public boolean  existsbyEmail(String Email){
        return iusuarioRepositorio.existsByEmail(Email);
    }
     
     
     public void save (Usuario usuario){
         iusuarioRepositorio.save(usuario);
     }

  
}


package com.porfolio_jpa.argprograma.Security.Dto;

import jakarta.validation.constraints.NotBlank;

public class LoginUsuario {
    @NotBlank
    private String nombreusuario;
    @NotBlank
    private String password;
    
    //Getters y setters

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}

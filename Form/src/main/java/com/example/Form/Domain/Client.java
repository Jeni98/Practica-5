package com.example.Form.Domain;


import javax.validation.constraints.*;

public class Client {

    @NotEmpty
    private String Nombre;
    @Email @NotEmpty
    private String email;
    @NotEmpty
    private String sexo;
    @NotEmpty
    private String pregunta;
    @NotEmpty
    private String comentario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Nombre='" + Nombre + '\'' +
                ", email='" + email + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pregunta='" + pregunta + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}

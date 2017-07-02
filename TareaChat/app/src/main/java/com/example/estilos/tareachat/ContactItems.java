package com.example.estilos.tareachat;


public class ContactItems {
    public int id;
    public String nombre;
    ContactItems(int id,String nombre){
        this.nombre = nombre;
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getIdContacto(){
        return id;
    }
}

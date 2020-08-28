/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_danielalvarado;

import java.awt.Color;
import java.util.Date;

public class Pais {
    
    private String nombre;
    private Date fechaFundacion;
    private String nombreHimno;
    private Color colorBandera;

    public Pais() {
    }

    public Pais(String nombre, Date fechaFundacion, String nombreHimno, Color colorBandera) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.nombreHimno = nombreHimno;
        this.colorBandera = colorBandera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombreHimno() {
        return nombreHimno;
    }

    public void setNombreHimno(String nombreHimno) {
        this.nombreHimno = nombreHimno;
    }

    public Color getColorBandera() {
        return colorBandera;
    }

    public void setColorBandera(Color colorBandera) {
        this.colorBandera = colorBandera;
    }

    @Override
    public String toString() {
        return ""+nombre;
    }
    
    
    
}

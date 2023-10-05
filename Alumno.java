/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumnos;

import java.util.Calendar;

/**
 *
 * @author HUMGARDEL
 */
public class Alumno extends Persona{
    private String GPA;
    private Calendar matricula;
    private String facultad;
    private String numeroDeCreditosAprobados;
    private String carrera;
    
    public Alumno(String GPA_, Calendar matricula_, String facultad_, String numeroDeCreditosAprobados_, String carrera_){
        super();
        this.GPA=GPA_;
        this.matricula=matricula_;
        this.facultad=facultad_;
        this.numeroDeCreditosAprobados=numeroDeCreditosAprobados_;
        this.carrera=carrera_;
    }
    
    public Calendar getFecha_inicial() {
        return matricula;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumnos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author HUMGARDEL
 */
public class Universidad {
    
    private ArrayList<Alumno> alumnos;
    
    public Universidad(){
        this.alumnos=new ArrayList<Alumno>();
    }
    
    public Universidad(String direccion_archivo){
        this.alumnos=new ArrayList<Alumno>();
        this.cargar(direccion_archivo);
    }
    
    public ArrayList<Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    
    public void ordenar_alumnos()
    {
        for(int i = 0; i < alumnos.size() - 1; i++)
        {
            for(int j = 0; j < alumnos.size() - 1; j++)
            {
                if (alumnos.get(j).getFecha_inicial().after(alumnos.get(j+1).getFecha_inicial()))
                {
                    Alumno tmp = alumnos.get(j+1);
                    alumnos.set(j+1, alumnos.get(j));
                    alumnos.set(j, tmp);
                }
            }
        }       
    }
    
    
    
    public void cargar(String direccion_archivo){
        try{
            File fichero=new File(direccion_archivo);
            FileReader flujoLectura=new FileReader(fichero);
            BufferedReader flujoBuffer=new BufferedReader(flujoLectura);
            String linea;
            String id;
            String nombre;
            String apellido;
            String telefono;
            String direccion;
            String GPA;
            int dia;
            int mes;
            int anno;
            Calendar matricula;
            String facultad;
            String numeroDeCreditosAprobados;
            String carrera;
            Alumno alumno;
            
            String[] atributos;
           
            while((linea=flujoBuffer.readLine())!=null){
                try{
                    atributos=linea.split(",");
                    
                    id=extraer_valor(atributos[0]);
                    nombre=extraer_valor(atributos[1]);
                    apellido=extraer_valor(atributos[2]);
                    telefono=extraer_valor(atributos[3]);
                    direccion=extraer_valor(atributos[4]);
                    GPA=extraer_valor(atributos[5]);
                    dia=Integer.parseInt(extraer_valor(atributos[6]));
                    mes=Integer.parseInt(extraer_valor(atributos[7]));
                    anno=Integer.parseInt(extraer_valor(atributos[8]));
                    matricula=Calendar.getInstance();
                    matricula.set(anno, mes, dia);
                    facultad=extraer_valor(atributos[9]);
                    numeroDeCreditosAprobados=extraer_valor(atributos[10]);;                    
                    
                    }
                        
                   
                    alumno=new Alumno(id, nombre, apellido, telefono, direccion, GPA, matricula, facultad, numeroDeCreditosAprobados, carrera);
                    
                    alumnos.add(alumno);
                }
                catch(Exception e){
                    System.out.println("El formato del archivo es incorrecto o no incluye toda la informacion esperada");
                }
            }
            
            
            flujoBuffer.close();
        }
        catch(FileNotFoundException e){
            System.out.println("El archivo no fue encontrado");
        }         
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    
    
    
}



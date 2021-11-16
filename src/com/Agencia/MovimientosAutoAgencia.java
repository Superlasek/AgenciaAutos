package com.Agencia;
import java.util.ArrayList;
public class MovimientosAutoAgencia
{
    String nombreAgencia, Direccion;
    ArrayList<Automovil> automovilInventario = new ArrayList<Automovil>();

    public MovimientosAutoAgencia(String ANombre, String Anadir)
    {
        nombreAgencia = ANombre;
        Direccion = Anadir;
    }

    public Boolean agregarInventario(Automovil automovil)
    {
        for(int i = 0; i < automovilInventario.size(); i++)
        {
            if(automovilInventario.get(i).mismoAuto(automovil))
                return false;
        }
        automovilInventario.add(automovil);
        return true;
    } //Añade el automovil al array list el cual guarda todos los autos

    public boolean compraAuto(Automovil automovil)
    {
        if(automovil.esComprado())
            return false;
        else
        {
            automovil.setCompra(true);
            return true;
        }
    } //Simula cuando alguien compra un auto

    public boolean devolverAuto(Automovil automovil)
    {
        if(automovil.esComprado())
        {
            automovil.setCompra(false);
            return true;
        }
        else
            return false;
    }   //Simula el regreso de un automovil

    public void printInventario()
    {
        System.out.println("Nombre Agencia: " + nombreAgencia);
        System.out.println("Direccion de la Agencia: " + Direccion);
        System.out.println("\n\t\t\t====== VEHÍCULOS  ======");
        System.out.println("Modelo y Marca   |  Año-Color  |     VIN       |    Categoria");
        System.out.println("------------------ ----------- ----------------- ------------------");
        for(int i = 0; i < automovilInventario.size(); i++)
        {
            System.out.println(automovilInventario.get(i).toString());
        }
    }       //Imprime toda la informacion acerca de la agencia de auos y la lista de autos
}

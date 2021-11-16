package com.Agencia;
public class Automovil implements Comparable
{
    String marca, modelo, color, anio, VIN;
    int numPuertas, numAsientos, numMaletero, numBolsos;
    boolean comprado;

    public Automovil(String Cmarca, String Cmodelo, String Ccolor, String Canio)
    {
        marca = Cmarca;
        modelo = Cmodelo;
        color = Ccolor;
        anio = Canio;
        comprado = false;
    }

    public void setVIN(String vin)
    {
        VIN = vin;
    }  // Permite añadir la serie VIN del auto

    public void setTamanio(int puerta, int asiento)
    {
        numPuertas = puerta;
        numAsientos = asiento;
    }  // Permite añadir el numero de puertas y asientos

    public void setEquipaje(int maletero, int bolso)
    {
        numMaletero = maletero;
        numBolsos = bolso;
    }  // Permte al usuario añadir el numero de maletero y bolsos

    public void setCompra(boolean estado)
    {
        comprado = estado;
    }

    public String getAutoInfo()
    {
        return marca + ", " + modelo + " " + anio + "-" + color;
    } // Hace return de la informacion basica del auto

    public boolean mismoAuto(Automovil automovil)
    {
        if(automovil.VIN == this.VIN)
            return true;
        else
            return false;
    } // Verifica si los autos son el mismo

    public String getCategoria()
    {
        if(numPuertas == 4 && numAsientos == 4 && numMaletero == 1 && numBolsos ==1)
            return "Economico";
        else if(numPuertas == 4 && numAsientos == 5 && numMaletero == 1 && numBolsos ==2)
            return "Compacto";
        else if(numPuertas == 4 && numAsientos == 5 && numMaletero == 2 && numBolsos ==1)
            return "Medio(Standard)";
        else if(numPuertas == 4 && numAsientos == 5 && numMaletero == 2 && numBolsos ==2)
            return "Completo(Premium)";
        else
            return "Convertible";
    }   // Determina la categoria de cada auto

    public boolean esComprado()
    {
        return comprado;
    }

    public String toString()
    {
        String MarcayModelo = String.format("%-19s",modelo + ", " + marca);
        String AnioyColor = String.format("%-12s",anio + "-" + color);
        String vin = String.format("%-18s",VIN);
        String Cat = String.format("%-18s", getCategoria());
        return MarcayModelo + AnioyColor + vin + Cat;
    }   // Creacion de cadena usando el formato de string para hacer el espacio uniforme
}

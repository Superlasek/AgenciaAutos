package com.Agencia;
public class AgenciaAutosDemo
{
    public static void main(String[] args)
    {
        System.out.println("\n\t\t\t==== AGENCIAS DE AUTOS ====\n");
        // Creacion de dos agencias
        MovimientosAutoAgencia primeraAgencia = new MovimientosAutoAgencia("Autos Ibarra", "Av. Enrique Diaz de Leon 563");
        MovimientosAutoAgencia segundaAgencia = new MovimientosAutoAgencia("Agencia Camacho", "Av. Avila Camacho 231");

        // CREACION DE LOS VEHICULOS
        Automovil economico1 = new Automovil("Ford", "Fiesta", "Blanco", "2020");
        economico1.setTamanio(4, 5);
        economico1.setEquipaje(1, 1);
        economico1.setVIN("1HGCM56415A005624");
        
        Automovil economico2 = new Automovil("Chevrolet", "Spark", "Negro", "2020");
        economico2.setTamanio(4, 5);
        economico2.setEquipaje(1, 1);
        economico2.setVIN("WBADT43403G034950");
        
        Automovil economico3 = new Automovil("Mitsubishi", "Mirage", "Blanco", "2019");
        economico3.setTamanio(4, 5);
        economico3.setEquipaje(1, 1);
        economico3.setVIN("2HGFG11879H560138");
        
        Automovil compacto1 = new Automovil("Nissan", "Versa", "Rojo", "2019");
        compacto1.setTamanio(4, 5);
        compacto1.setEquipaje(1, 2);
        compacto1.setVIN("1G1ZS58F77F128386");
        
        Automovil compacto2 = new Automovil("Ford", "Focus", "Blanco", "2020");
        compacto2.setTamanio(4, 5);
        compacto2.setEquipaje(1, 2);
        compacto2.setVIN("1FDAW57SX1ED49643");
        
        Automovil compacto3 = new Automovil("Chevrolet", "Volt", "Silver", "2020");
        compacto3.setTamanio(4, 5);
        compacto3.setEquipaje(1, 2);
        compacto3.setVIN("3HGCM56417G721802");
        
        Automovil standard1 = new Automovil("Hyundai", "Fiesta", "Amarillo", "2020");
        standard1.setTamanio(4, 5);
        standard1.setEquipaje(2, 1);
        standard1.setVIN("2GNFLDE35E6206836");
        
        Automovil standard2 = new Automovil("VW", "Jetta", "Azul", "2019");
        standard2.setTamanio(4, 5);
        standard2.setEquipaje(2, 1);
        standard2.setVIN("1N4BA41E94C855149");
        
        Automovil standard3 = new Automovil("Honda", "Accord", "Cafe", "2020");
        standard3.setTamanio(4, 5);
        standard3.setEquipaje(2, 1);
        standard3.setVIN("KMHFC46D87A299420");
        
        Automovil standard4 = new Automovil("Toyota", "Camry", "Verde", "2018");
        standard4.setTamanio(4, 5);
        standard4.setEquipaje(2, 1);
        standard4.setVIN("3HGCM56417G721802");
        
        Automovil premium1 = new Automovil("Hyundai", "Sonata", "Blanco", "2020");
        premium1.setTamanio(4, 5);
        premium1.setEquipaje(2, 2);
        premium1.setVIN("1VWBP7A38CC023418");
        
        Automovil premium2 = new Automovil("Nissan", "Maxima", "Negro", "2018");
        premium2.setTamanio(4, 5);
        premium2.setEquipaje(2, 2);
        premium2.setVIN("2T1BR32E37C728114");
        
        Automovil premium3 = new Automovil("Chevrolet", "Impala", "Gray", "2021");
        premium3.setTamanio(4, 5);
        premium3.setEquipaje(2, 2);
        premium3.setVIN("1GCVKREC0EZ103056");
        
        Automovil premium4 = new Automovil("Toyota", "Avalon", "Rojo", "2018");
        premium4.setTamanio(4, 5);
        premium4.setEquipaje(2, 2);
        premium4.setVIN("JTKDE167570187929");
        
        Automovil premium5 = new Automovil("Chrysler", "300", "Negro", "2020");
        premium5.setTamanio(4, 5);
        premium5.setEquipaje(2, 2);
        premium5.setVIN("2MEBM74F5JX656278");
        
        Automovil premium6 = new Automovil("Audi", "A-5", "Blanco", "2018");
        premium6.setTamanio(4, 5);
        premium6.setEquipaje(2, 2);
        premium6.setVIN("19VDE3F78DE390473");
        Automovil premium7 = new Automovil("BMW", "5-series", "Rojo", "2021");
        premium7.setTamanio(4, 5);
        premium7.setEquipaje(2, 2);
        premium7.setVIN("1YVGE22D6S5427386");
        
        Automovil convertible1 = new Automovil("Ford", "Mustang", "Amarillo", "2021");
        convertible1.setTamanio(2, 4);
        convertible1.setEquipaje(1, 1);
        convertible1.setVIN("2XKADR9X9KM569615");
        
        Automovil convertible2 = new Automovil("Chevrolet", "Camaro", "Blanco", "2020");
        convertible2.setTamanio(2, 4);
        convertible2.setEquipaje(1, 1);
        convertible2.setVIN("3GNFK16R3WG121908");
        
        Automovil convertible3 = new Automovil("BMW", "4-series", "Rojo", "2021");
        convertible3.setTamanio(2, 4);
        convertible3.setEquipaje(1, 1);
        convertible3.setVIN("1FMZU32E2WZA30946");

        // Agrega los autos a la primera agencia
        primeraAgencia.agregarInventario(economico1);
        primeraAgencia.agregarInventario(economico3);
        primeraAgencia.agregarInventario(compacto1);
        primeraAgencia.agregarInventario(compacto3);
        primeraAgencia.agregarInventario(standard1);
        primeraAgencia.agregarInventario(standard2);
        primeraAgencia.agregarInventario(premium1);
        primeraAgencia.agregarInventario(premium2);
        primeraAgencia.agregarInventario(premium3);
        primeraAgencia.agregarInventario(premium4);
        primeraAgencia.agregarInventario(premium5);
        primeraAgencia.agregarInventario(convertible1);
        primeraAgencia.agregarInventario(convertible2);

        // Agrega los autos a la segund agencia
        segundaAgencia.agregarInventario(economico2);
        segundaAgencia.agregarInventario(compacto2);
        segundaAgencia.agregarInventario(standard3);
        segundaAgencia.agregarInventario(standard4);
        segundaAgencia.agregarInventario(premium6);
        segundaAgencia.agregarInventario(premium7);
        segundaAgencia.agregarInventario(convertible3);

        // Imprime la lista de inventario de la primera agencia
        primeraAgencia.printInventario();
        System.out.println();

        // Imprime la lista de inventario de la segunda agencia
        segundaAgencia.printInventario();
        System.out.println();

        // ESTADOS DE LOS VEHICULOS {}
        System.out.println("\n\t\t\t==== ESTADOS ====\n");

        // Intento de rentar un auto dos veces
        System.out.println("Compra de vehículo: " + economico1.getAutoInfo());
        if (primeraAgencia.compraAuto(economico1))
            System.out.println("La compra se ha completado correctamente.");
        else
            System.out.println("El vehículo no se encuentra disponible.");
        System.out.println();

        System.out.println("Compra de vehículo: " + economico1.getAutoInfo() + " ( X2 )");
        if (primeraAgencia.compraAuto(economico1))
            System.out.println("La compra se ha completado correctamente.");
        else
            System.out.println("Lo sentimos, el vehículo no está disponible.");
        System.out.println();

        // Intenta devolver un auto
        System.out.println("Devolución del vehículo: " + economico1.getAutoInfo() );
        if (primeraAgencia.devolverAuto(economico1))
            System.out.println("El vehículo es devuelto con éxito.");
        else
            System.out.println("Error: el vehículo no se encuentra o no es propiedad de la agencia.");
        System.out.println();

        System.out.println("Compra del vehículo: " + economico1.getAutoInfo() + " ( X2 )");
        if (primeraAgencia.compraAuto(economico1))
            System.out.println("La compra se ha completado correctamente.");
        else
            System.out.println("Lo sentimos, el vehículo no está disponible.");
        System.out.println();

        // Prueba agencia 2 (Compra)
/*        System.out.println("Compra del vehículo: " + economico2.getAutoInfo() );
        if (segundaAgencia.compraAuto(economico2))
            System.out.println("La compra se ha completado correctamente.");
        else
            System.out.println("Lo sentimos, el vehículo no está disponible.");
        System.out.println();*/

        // Prueba agencia 2 (devolucion)
        System.out.println("Devolución del vehículo: " + economico2.getAutoInfo() );
        if (segundaAgencia.devolverAuto(economico2))
            System.out.println("El vehículo es devuelto con éxito.");
        else
            System.out.println("Error: el vehículo no se encuentra o no es propiedad de la agencia.");
        System.out.println();
    }
}
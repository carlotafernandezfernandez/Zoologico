import Visitantes.*;
import Animales.*;
import Habitats.*;
import java.util.*;
import Inventario.*;

public class Principal {
    public static void main(String[] args) {
        BufferReader buffer = new BufferReader(new InputStreamReader(System.in));
        String nombre;
        int edad;

        Animal tigre = new Animal_terrestre("carnivoro", "carne", true, "bueno");
        Animal caballo = new Animal_terrestre("herbivoro", "hierba", true, "intenso");
        Animal delfin = new Animal_acuatico("mamifero", "peces", true, "gracioso");
        Animal pinguino = new Animal_acuatico("mamifero", "peces", true, "tranquilo");
        Animal aguila = new Animal_aviario("carnivoro", "roedores", true, "malo");
        Animal loro = new Animal_aviario("omnivoro", "frutas", true, "hablador");

        Habitat habitat_peligrosa = new HTerrestre(45.8, 15, false);
        Habitat habitat_segura = new HTerrestre(25.5, 50, true);
        Habitat habitat_acuatico1 = new HAcuatico(30.5, 80, true);
        Habitat habitat_acuatico2 = new HAcuatico(25.5, 60, false);
        Habitat habitat_aviario1 = new HAviario(20.5, 40, false);
        Habitat habitat_aviario2 = new HAviario(25.5, 60, true);

        Quioscos quiosco1 = new Quioscos("Doña Manolita", "habitat_peligrosa");
        Quioscos quiosco2 = new Quioscos("Don Juan", "habitat_segura");
        Quioscos quiosco3 = new Quioscos("Doña Maria", "habitat_acuatico1");
        Quioscos quiosco4 = new Quioscos("Don Pedro", "habitat_acuatico2");
        Quioscos quiosco5 = new Quioscos("Doña Juana", "habitat_aviario1");
        Quioscos quiosco6 = new Quioscos("Don Jose", "habitat_aviario2");

        Medicinas medicina1 = new Medicinas("Paracetamol", 100, "2045-12-02");
        Medicinas medicina2 = new Medicinas ("Calmante", 450, "2028-10-12");
        Equipamiento eq1= new Equipamiento ("Cuerdas", 500, true);
        Equipamiento eq2= new Equipamiento ("Arneses", 250, false);
        Alimentos a1= new Alimentos ("Carne", 100, "carnivoro");
        Alimentos a2= new Alimentos ("Heno", 200, "herbivoro");

        Proovedor medicinas = new Proovedor ("Julian", "Medicinas", 673578121);
        Proovedor equipamiento = new Proovedor ("Maria", "Equipamiento", 621090238);
        Proovedor alimentos = new Proovedor ("Pedro", "Alimentos", 608571218);

        Mantenimiento mantenimiento1 = new Mantenimiento("Urgente", "Jaula tigre");
        Mantenimiento mantenimiento2 = new Mantenimiento("Regular", "Hípica");

        System.out.println("Bienvenido al zoologico");
        System.out.println("Introduzca su nombre");
        nombre = buffer.readLine();
        System.out.println("Introduzca su edad");
        edad = Integer.parseInt(buffer.readLine());
        Visitante visitante1= new Visitante(nombre, edad);
        if (edad >= 18){
            System.out.println("Introduzca que clase de tour le gustaria tomar:");
            System.out.println("1. Tour por el habitat acuatico");
            System.out.println("2. Tour por el habitat aviario");
            System.out.println("3. Tour por el habitat terrestre");
            System.out.println("0. SALIR");
        } else {
            System.out.println("Introduzca que clase de tour le gustaria tomar:");
            System.out.println("a. Jugar con los pinguinos");
            System.out.println("b. Alimentar a las aves");
            System.out.println("c. Montar a caballo");
            System.out.println("0. SALIR");
        }
        int opcion = Integer.parseInt(buffer.readLine());

        do {
            switch (opcion){
                case 1:
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoManolita(habitat_acuatico1, delfin);
                }else{
                    continue;
                }
                    System.out.println("Tour por el habitat acuatico");
                    visitante1.visitarHabitatAcuatico(habitat_acuatico1, delfin);
                    System.out.println("¿Le gustaria interactuar con el animal? (si/no)");
                    int interaccion = buffer.readLine();
                    if (interaccion == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                case 2:
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoJuan(habitat_aviario1, aguila);
                }else{
                    continue;
                }
                    System.out.println("Tour por el habitat aviario");
                    visitante1.visitarHabitatAviario(habitat_aviario1, aguila);
                    System.out.println("¿Le gustaria interactuar con el animal? (si/no)");
                    int interaccion1 = buffer.readLine();
                    if (interaccion1 == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                case 3:
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoMaria(habitat_peligroso, tigre);
                }else{
                    continue;
                }
                    System.out.println("Tour por el habitat terrestre");
                    visitante1.visitarHabitatTerrestre(habitat_peligroso, tigre);
                    System.out.println("¿Le gustaria interactuar con el animal? (si/no)");
                    int interaccion2 = buffer.readLine();
                    if (interaccion2 == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                case 'a':
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoPedro(habitat_acuatico2, pinguino);
                }else{
                    continue;
                }
                    System.out.println("Jugar con los pinguinos");
                    visitante1.jugarConPinguinos(habitat_acuatico2, pinguino);
                    System.out.println("Te gustaria interactuar con el animal? (si/no)");
                    int interaccion3 = buffer.readLine();
                    if (interaccion3 == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                case 'b':
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoJuana(habitat_aviario2, loro);
                }else{
                    continue;
                }
                    System.out.println("Alimentar a las aves");
                    visitante1.alimentarAves(habitat_aviario2, loro);
                    System.out.println("¿Le gustaria interactuar con el loro? (si/no)");
                    int interaccion4 = buffer.readLine();
                    if (interaccion4 == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                case 'c':
                System.out.println("Antes de comenzar, le gustaria obtener informacion sobre los animales de este habitat y sobre el habitat en el que se encuentra en el quiosco?");
                if(buffer.readLine=="si"){
                    visitante1.quioscoJose(habitat_segura, caballo);
                }else{
                    continue;
                }
                    System.out.println("Montar a caballo");
                    visitante1.alimentarAves(habitat_segura, caballo);
                    System.out.println("¿Le gustaria interactuar con el caballo? (si/no)");
                    int interaccion5 = buffer.readLine();
                    if (interaccion5 == "si"){
                        visitante1.interactuarConAnimal();
                    } else{
                        break;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida, Introduzca otra opcion");
                    break;
            }
        }while (opcion != 0);        
            }

            public void relacionadoConInventario (){
                System.out.println(imprimirInventario());
                if (listaMedicinas.size() < 10){
                    System.out.println("Se necesitan mas medicinas");
                    System.out.println("El proovedor de medicinas es: " + medicinas.getNombre());
                    System.out.println("El telefono del proovedor es: " + medicinas.getTelefono());
                    agregarMedicinas(medicina1, medicinas);
                    agregarMedicinas(medicina2, medicinas);
                }else{
                    if(listaMedicinas.size() == 0){
                        System.out.println("No hay medicinas");
                        agregarMedicinas(medicina1, medicinas);
                        agregarMedicinas(medicina2, medicinas);
                    }else{
                        System.out.println("Hay suficientes medicinas");
                    }
                }

                if (listaEquipamiento.size() < 10){
                    System.out.println("Se necesitan mas equipamiento");
                    System.out.println("El proovedor de equipamiento es: " + equipamiento.getNombre());
                    System.out.println("El telefono del proovedor es: " + equipamiento.getTelefono());
                    agregarEquipamiento(eq1, equipamiento);
                    agregarEquipamiento(eq2, equipamiento);
            } else{
                if(listaMedicinas.size() == 0){
                    System.out.println("No hay medicinas");
                    agregarEquipamiento(eq1, equipamiento);
                    agregarEquipamiento(eq2, equipamiento);
                }else{
                    System.out.println("Hay suficiente equipamiento");
                }
            }
            if (listaAlimentos.size() < 10){
                System.out.println("Se necesitan mas alimentos");
                System.out.println("El proovedor de alimentos es: " + alimentos.getNombre());
                System.out.println("El telefono del proovedor es: " + alimentos.getTelefono());
                agregarAlimentos(a1, alimentos);
                agregarAlimentos(a2, alimentos);
        } else{
            if(listaAlimentos.size() == 0){
                System.out.println("No hay alimentos");
                agregarAlimentos(a1, alimentos);
                agregarAlimentos(a2, alimentos);
            }else{
                System.out.println("Hay suficientes alimentos");
            }
    }
}
public static void revisiones (){
    
}

}

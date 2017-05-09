package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BarranquillaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejorichdad on 30/7/16.
 */
public class ContentBarranquilla {

    public static List<BarranquillaModel> contentBarranquilla =  new ArrayList<>();

    public static String titulo1 = "Spa Lily Tovar";
    public static int imageFile1 = R.drawable.lily1;
    public static String description1 = "Centro integral de belleza";

    public static String titulo2 = "Elite";
    public static int imageFile2 = R.drawable.elite;
    public static String description2 = "Academia de Conducción";

    public static String titulo3 = "Restaurante la Marina ";
    public static int imageFile3 = R.drawable.marina;
    public static String description3 = "Restaurante (comida marina e internacional)";

    public static String titulo4 = "Academia del Caribe";
    public static int imageFile4 = R.drawable.aca;
    public static String description4 = "Programas Técnico Laborales:";

    public static String titulo5 = "Artes Gráficas del Norte";
    public static int imageFile5 = R.drawable.agn;
    public static String description5 = "Impresión y articulos Publicitarios.";

    public static String titulo6 = "Novasys";
    public static int imageFile6 = R.drawable.novasys;
    public static String description6 = "Venta computadores portatiles y de mesa ";

    public static String titulo7 = "Speed Way";
    public static int imageFile7 = R.drawable.speed;
    public static String description7 = "Accesorios de lujo para vehiculo";

    public static String titulo8 = "Union";
    public static int imageFile8 = R.drawable.union;
    public static String description8 = "Diseño, desarrollo y producción de soluciones de comunicaciones gráficas";

    public static String titulo9 = "Aprisa";
    public static int imageFile9 = R.drawable.aprisa;
    public static String description9 = "Domicilios; todo en diligencias personales, notariales y empresariales.";

    public static String titulo10 = "Parque del Sol";
    public static int imageFile10 = R.drawable.parque;
    public static String description10 = "Centro recreacional (Alquiler Canchas de Futbol)";

    public static String titulo11 = "La Taquillera";
    public static int imageFile11 = R.drawable.tequilera;
    public static String description11 = "Comercializacion de Espectaculos.";

    public static String titulo12 = "Electro Aceite";
    public static int imageFile12 = R.drawable.electro1;
    public static String description12 = "Repuestos para automotores";


    public static String titulo13 = "Club Deportivo Instenalco";
    public static int imageFile13 = R.drawable.instenalco;
    public static String description13 = "Formación deportiva";

    public static String titulo14 = "Colegio Inca";
    public static int imageFile14 = R.drawable.incacole;
    public static String description14 = "Entidad educativa ";

    public static String titulo15 = "Centro Inca";
    public static int imageFile15 = R.drawable.centrinca;
    public static String description15 = "Educación para el trabajo y el desarrollo humano,";

    public static String titulo16 = "Falab";
    public static int imageFile16 = R.drawable.falab;
    public static String description16 = "Grupo integral de salud";

    public static String titulo17 = "Lam";
    public static int imagenFile17 = R.drawable.lam;
    public static String description17 = "Mejoramiento de la fuerza de ventas";

    public static String titulo18 = "Edwin Ramos";
    public static int imagenFile18 = R.drawable.lam;
    public static String description18 = "Consultoría en temas tributarios";





    public static void addContentBarranquilla(){
        contentBarranquilla.add(new BarranquillaModel(imageFile1, titulo1, description1));
        contentBarranquilla.add(new BarranquillaModel(imageFile2, titulo2, description2));
        contentBarranquilla.add(new BarranquillaModel(imageFile3, titulo3, description3));
        contentBarranquilla.add(new BarranquillaModel(imageFile4, titulo4, description4));
        contentBarranquilla.add(new BarranquillaModel(imageFile5, titulo5, description5));
        contentBarranquilla.add(new BarranquillaModel(imageFile6, titulo6, description6));
        contentBarranquilla.add(new BarranquillaModel(imageFile7, titulo7, description7));
        contentBarranquilla.add(new BarranquillaModel(imageFile8, titulo8, description8));
        contentBarranquilla.add(new BarranquillaModel(imageFile9, titulo9, description9));
        contentBarranquilla.add(new BarranquillaModel(imageFile10, titulo10, description10));
        contentBarranquilla.add(new BarranquillaModel(imageFile11, titulo11, description11));
        contentBarranquilla.add(new BarranquillaModel(imageFile12, titulo12, description12));
        contentBarranquilla.add(new BarranquillaModel(imageFile13, titulo13, description13));
        contentBarranquilla.add(new BarranquillaModel(imageFile14, titulo14, description14));
        contentBarranquilla.add(new BarranquillaModel(imageFile15, titulo15, description15));
        contentBarranquilla.add(new BarranquillaModel(imageFile16, titulo16, description16));
        contentBarranquilla.add(new BarranquillaModel(imagenFile17, titulo17, description17));
        contentBarranquilla.add(new BarranquillaModel(imagenFile18, titulo18, description18));

    }

    public static List<BarranquillaModel> getContentBarranquilla(){

        addContentBarranquilla();
        return contentBarranquilla;
    }
}

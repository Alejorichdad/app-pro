package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.CartagenaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentCartagena {

    public static List<CartagenaModel> contentCartagena =  new ArrayList<>();

    public static String titulo1 = "Cararin";
    public static int imageFile1 = R.drawable.cararin;
    public static String description1 = "Club deportivo de beisbol";

    public static String titulo2 = "Icosald";
    public static int imageFile2 = R.drawable.ics;
    public static String description2 = "Educación técnica laboral para el desarrollo humano";

    public static String titulo3 = "Acción de Gracias";
    public static int imageFile3 = R.drawable.accion;
    public static String description3 = "Suministro de comidas y bebidas alcoholicas y no alcoholicas.";

    public static String titulo4 = "Chelisha";
    public static int imageFile4 = R.drawable.shelsa;
    public static String description4 = "Casa de eventos.";

    public static String titulo5 = "CompuWorking";
    public static int imageFile5 = R.drawable.compuw;
    public static String description5 = "Compra y venta de partes y equipo de computación, ";

    public static String titulo6 = "Mendoza Masrter";
    public static int imageFile6 = R.drawable.mendoza;
    public static String description6 = "Diseño, fotograbado en metal, prensado, estampado y laminado de metal.";

    public static String titulo7 = "City trolley tour";
    public static int imageFile7 = R.drawable.troley;
    public static String description7 = "Disfruta de Cartagena y sus destinos a través de una experiencia única.";

    public static String titulo8 = "Hotel Playa Club";
    public static int imageFile8 = R.drawable.tressesenta;
    public static String description8 = "Hotelería, creación y ejecución de paquetes turísticos.";

    public static String titulo9 = "Camino Tours";
    public static int imageFile9 = R.drawable.camino;
    public static String description9 = "Operación se servicios turísticos";

    public static String titulo10 = "item title cartagena 10";
    public static int imageFile10 = R.drawable.tienda;
    public static String description10 = "item description cartagena 10";

    public static String titulo11 = "item title cartagena 11";
    public static int imageFile11 = R.drawable.tienda;
    public static String description11 = "item description cartagena 11";

    public static String titulo12 = "item title cartagena 12";
    public static int imageFile12 = R.drawable.tienda;
    public static String description12 = "item description cartagena 12";

    public static String titulo13 = "item title cartagena 13";
    public static int imageFile13 = R.drawable.tienda;
    public static String description13 = "item description cartagena 13";

    public static String titulo14 = "item title cartagena 14";
    public static int imageFile14 = R.drawable.tienda;
    public static String description14 = "item description cartagena 14";

    public static String titulo15 = "item title cartagena 15";
    public static int imageFile15 = R.drawable.tienda;
    public static String description15 = "item description cartagena 15";

    public static void addContentCartagena(){
        contentCartagena.add(new CartagenaModel(imageFile1, titulo1, description1));
        contentCartagena.add(new CartagenaModel(imageFile2, titulo2, description2));
        contentCartagena.add(new CartagenaModel(imageFile3, titulo3, description3));
        contentCartagena.add(new CartagenaModel(imageFile4, titulo4, description4));
        contentCartagena.add(new CartagenaModel(imageFile5, titulo5, description5));
        contentCartagena.add(new CartagenaModel(imageFile6, titulo6, description6));
        contentCartagena.add(new CartagenaModel(imageFile7, titulo7, description7));
        contentCartagena.add(new CartagenaModel(imageFile8, titulo8, description8));
        contentCartagena.add(new CartagenaModel(imageFile9, titulo9, description9));
       // contentCartagena.add(new CartagenaModel(imageFile10, titulo10, description10));
       // contentCartagena.add(new CartagenaModel(imageFile11, titulo11, description11));
       // contentCartagena.add(new CartagenaModel(imageFile12, titulo12, description12));
       // contentCartagena.add(new CartagenaModel(imageFile13, titulo13, description13));
       // contentCartagena.add(new CartagenaModel(imageFile14, titulo14, description14));
       // contentCartagena.add(new CartagenaModel(imageFile15, titulo15, description15));
    }

    public static List<CartagenaModel> getContentCartagena(){

        addContentCartagena();
        return contentCartagena;
    }
}

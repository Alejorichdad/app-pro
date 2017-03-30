package com.clubrecordar.recordar2016.helpers.cities;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.CaliModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willians on 30/7/16.
 */
public class ContentCali {
    public static List<CaliModel> contentCali =  new ArrayList<>();

    public static String titulo1 = "Human Tecnology";
    public static int imageFile1 = R.drawable.human;
    public static String description1 = "Ortodoncia y odontología integral";

    public static String titulo2 = "Giant´s gym";
    public static int imageFile2 = R.drawable.gian;
    public static String description2 = "La naturaleza de tu piel";

    public static String titulo3 = "Estrellas Del Norte";
    public static int imageFile3 = R.drawable.estrellas;
    public static String description3 = "Institución de formación para el trabajo y el desarrollo humano";

    public static String titulo4 = "CCED";
    public static int imageFile4 = R.drawable.ccedd;
    public static String description4 = "Formamos los mejores técnicos laborales en programas con calidad certificada.";

    public static String titulo5 = "Human Help";
    public static int imageFile5 = R.drawable.hhelp;
    public static String description5 = "Consultoría en procesos de gestión humana.";

    public static String titulo6 = "Carva de Colombia";
    public static int imageFile6 = R.drawable.carva;
    public static String description6 = "Empresa prestadora de bienes y servicios (EPS Hogar)";

    public static String titulo7 = "Extreme World";
    public static int imageFile7 = R.drawable.extrem;
    public static String description7 = "Ventas y mantenimiento de equipos de gimnasio. Accesorios y repuestos para bicicletas.";

    public static String titulo8 = "Alta Peluquería New Life";
    public static int imageFile8 = R.drawable.pelu;
    public static String description8 = "Peluqueria, spa, estetica y reflexologia.";

    public static String titulo9 = "Yanoconas Motor";
    public static int imageFile9 = R.drawable.yanac;
    public static String description9 = "Compra y venta de Vehículos, taller, accesorios, repuestos para automóviles.";

    public static String titulo10 = "Ortho Oral";
    public static int imageFile10 = R.drawable.ortho;
    public static String description10 = "Institución integral en servicios odontológicos, ";

    public static String titulo11 = "Boca Nostra";
    public static int imageFile11 = R.drawable.boca;
    public static String description11 = "Ortodoncia y diseño dental";

    public static String titulo12 = "Angel";
    public static int imageFile12 = R.drawable.angel;
    public static String description12 = "Brindamos servicios de laboratorio clínico";

    public static String titulo13 = "DentAH";
    public static int imageFile13 = R.drawable.dentah;
    public static String description13 = "Clínica odontológica, Centro de Estética y Spa";

    public static String titulo14 = "Elyon";
    public static int imageFile14 = R.drawable.elion;
    public static String description14 = "Lentes progresivos en todas las gamas, lentes transitions y antirreflejo";


    public static String titulo15 = "OptiColor";
    public static int imageFile15= R.drawable.opti;
    public static String description15 = "Compra y venta de gafas, lentes de contacto";


    public static String titulo16 = "Hotel Torre de Cali";
    public static int imageFile16= R.drawable.torre;
    public static String description16 = "Hoteliría. Nuestra felicidad es permanecer en el corazón de nuestros huéspedes y visitantes,";


    public static String titulo17 = "Korin Tours";
    public static int imageFile17= R.drawable.korin;
    public static String description17 = "Creamos su plan de turismo de acuerdo a su presupuesto.";



    public static String titulo18 = "Lago grande";
    public static int imageFile18= R.drawable.lago;
    public static String description18 = "Prestacion de servicios hoteleros, pasadías, eventos y recreación";

    public static void addContentCali(){

        contentCali.add(new CaliModel(imageFile1, titulo1, description1));
        contentCali.add(new CaliModel(imageFile2, titulo2, description2));
        contentCali.add(new CaliModel(imageFile3, titulo3, description3));
        contentCali.add(new CaliModel(imageFile4, titulo4, description4));
        contentCali.add(new CaliModel(imageFile5, titulo5, description5));
        contentCali.add(new CaliModel(imageFile6, titulo6, description6));
        contentCali.add(new CaliModel(imageFile7, titulo7, description7));
        contentCali.add(new CaliModel(imageFile8, titulo8, description8));
        contentCali.add(new CaliModel(imageFile9, titulo9, description9));
        contentCali.add(new CaliModel(imageFile10, titulo10, description10));
        contentCali.add(new CaliModel(imageFile11, titulo11, description11));
        contentCali.add(new CaliModel(imageFile12, titulo12, description12));
        contentCali.add(new CaliModel(imageFile13, titulo13, description13));
        contentCali.add(new CaliModel(imageFile14, titulo14, description14));
        contentCali.add(new CaliModel(imageFile15, titulo15, description15));
        contentCali.add(new CaliModel(imageFile16, titulo16, description16));
        contentCali.add(new CaliModel(imageFile17, titulo17, description17));
        contentCali.add(new CaliModel(imageFile18, titulo18, description18));
    }

    public static List<CaliModel> getContentCali(){

        addContentCali();
        return contentCali;
    }
}

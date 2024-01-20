import java.util.*;
import java.util.Calendar;
    public class canlendario {
    public static void main (String[]args)
{
 Calendar ahora = Calendar.getinstance ();
 int hora = ahora.get(Calendar.HOUR_OF_DAY);
 int minuto = ahora.get(Calendar.MINUTE);
 int mes = ahora.get(Calendar.MONTH) + 1;
 int dia = ahora.get(Calendar.DAY_OF_MONTH);
 int an = ahora.get(Calendar.YEAR);
 if (hora < 12 ){
   System.out.print ("Buenos dias\n");
}else if (hora < 17 ){
    System.out.print ("Buenas tardes\n");
    }
    else{
    System.out.print ("Buenas noches\n");
    }

System.out.print("Son las");
System.out.print(" ");
System.out.print((hora > 12)? (hora - 12) : hora);
System.out.print(" horas ");

    if (minuto != 0){
        System.out.print ( minuto + " " );
        System.out.print ( (minuto !=1) ? "minutos": "minutos" );
        System.out.print ( "Del dia " + dia+ "de" );

        switch(mes){
            case 1:
                System.out.print ("Enero" );
                break;
            case 2: 
                System.out.print ( "Febrero " );
                break;
            case 3: 
                System.out.print ( "Marzo " );
                break;
            case 4: 
                System.out.print ( "Abril " );
                break;
            case 5: 
                System.out.print ( " Mayo " );
                break;
            case 6: 
                System.out.print ( "Junio " );
                break;
            case 7: 
                System.out.print ( "Julio " );
                break;
            case 8: 
                System.out.print ( "Agosto " );
                break;
            case 9: 
                System.out.print ( "Septiembre " );
                break;
            case 10: 
                System.out.print ( "Octubre" );
                break;
            case 11: 
                System.out.print ( "Noviembre " );
                break;
            case 12: 
                System.out.print ( "Dicembre " );
                break;
            }
        System.out.print ( "del"+ an +".");
        }  
    }     
}
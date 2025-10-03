import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvidenciaFinal.CitasManejo {
    private static BufferedReader datoCaptura = new BufferedReader(new InputStreamReader(System.in));
    public static void MuestraMenuCitas(){
        String sOpcion = "";
        try {
            System.out.println(" ** Manejo de Concultas Medicas - Citas**");
            System.out.println("     1 Altas ");
            System.out.println("     2 Cambios");
            System.out.println("     3 Bajas");
            System.out.println("     X/x Regresar a Menu Consulta Medica");
            System.out.println("     X/x Elegir la opcion que desea");

            sOpcion = datoCaptura.readLine().toString().trim().toUpperCase();

            switch (sOpcion) {
                case "1":
                    Alta();
                    break;
                    case "2":
                        Cambios();
                        break;
                        case "3":
                            Borrar();
                            break;
                            default:
                                System.out.println("");
                                System.out.println("El dato es incorrecto, ingresar uno valido");
                                System.out.println("");
                                MuestraMenuCitas();
                                break;
            }
        }
        catch (Exception ex){}
        finally {}
    }
    public static void Cambios(){
        try {
    }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }
    public static void Consulta(){
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }

}

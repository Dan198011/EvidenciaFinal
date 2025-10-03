package EvidenciaFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientesManejo {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void MuestraMenuPacientes() {
        String sOpcion = "";
        try {
            System.out.println(" ** Consultas Medicas - Administra Pacientes **");
            System.out.println("    1 Altas");
            System.out.println("    2 Cambios");
            System.out.println("    3 Bajas");
            System.out.println("    X/x Regresar a Menu Consulta Medica");
            System.out.println("Especificar la Opcion");

            sOpcion = datoCaptura.readLine().toString().trim().toUpperCse();

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
                    case "X":
                        System.out.println("");
                        System.out.println("El dato es incorrecto, ingresar uno valido");
                        System.out.println("");
                        MuestraMenuPacientes();
            }
        }
        catch (Exception ex){}
        finally {}
    }
    public static void Alta() {
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }
    public static void Cambios() {
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }
    public static void Borrar() {
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }
    public static void ConsultaMedicas() {
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
    }
}

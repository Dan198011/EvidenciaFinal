package EvidenciaFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsuariosManejo {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String Valida(String sUser, String sPass) {
        String sResult = "";
        try {
            sResult = "";
        }
        catch (Exception ex){
            sResult = "Usuario o Contraseña  incorrecto";
        }
        return sResult;
    }
    public static void MuestraMenuUsuarios(){
        String sOpcion = "";
        try {
            System.out.print("** Consultas Medicas Usuarios ** ");
            System.out.print("1. Altas");
            System.out.print("2. Cambios");
            System.out.print("3. Bajas");
            System.out.print("X/x Regresar a Menu de Consulta Medica");
            System.out.print("Especificar Opcion");

            sOpcion = datoCaptura.readLine().toString().trim().toUpperCase();

            switch(sOpcion) {
                case "1":
                    Alta();
                    break;
                case "2":
                    Cambios();
                    break;
                case "3":
                    Bajas();
                    break;
                case "X":
                    break;
                    default:
                        System.out.println("");
                        System.out.println("Dato incorrecto, ingresar uno correcto");
                        System.out.println("");
                        MuestraMenuUsuarios();
                        break;
            }
            }
        catch (Exception ex){}
        finally {}
        }
        public static void Alta(){
        try {
    }
        catch (Exception ex){
        System.out.println(" ERROR" + ex.getMessage());
        }

        }
        public static void Cambios(){
        try {
        }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }
        }
        public static void Bajas(){
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

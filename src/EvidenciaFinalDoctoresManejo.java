import java.io.BufferedReader;

public class EvidenciaFinal.DoctoresManejo {
    private static BufferedReader datoCaptura = new BufferedReader(new BufferedReader());
    public static void MuestraMenuDoctores() {
        String sOpcion = "";
        try {
            System.out.println(" ** Manejo de Consultas Medicas - Doctores  **");
            System.out.println(" 1. Altas");
            System.out.println(" 2. Cambios");
            System.out.println(" 3. Bajas");
            System.out.println(" X/x Regresar a Menu de Consulta Medica");
            System.out.println("Especificar la Opcion");

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
                case "X":
                    break;
                default:
                    System.out.println("");
                    System.out.println("Dato incorrecto, ingresar uno valido");
                    System.out.println("");
                    MuestraMenuDoctores();
                    break;
            }
            }
        catch (Exception);
        finally {}

    }
    public static void Alta(){
        try {
    }
        catch (Exception ex){
            System.out.println(" ERROR" + ex.getMessage());
        }


        public static void Cambios(){
            try {
        }
            catch (Exception ex){
                System.out.println(" ERROR" + ex.getMessage());
            }
            public static void Borrar(){
                try {
            }
                catch (Exception ex){
                System.out.println(" ERROR" + ex.getMessage());}
            }
            public static void Consulta() {
                try {
            }
                catch (Exception ex){
                System.out.println(" ERROR" + ex.getMessage());}}
            }

}

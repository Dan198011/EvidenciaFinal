import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvidenciaFinal {
    private static EvidenciaFinal datoCapturaCitas = new BufferedReader(new InputStreamReader(System.in));

    private static  String getUserName(String prompt){
        String userName = null;
        System.out.print(prompt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            userName = br.readLine().trim();
        }
        catch (IIOException e){
            System.out.println("Error al ingresar tu nombre");
            System.exit(1);
        }
        return userName;
    }
    private static String getUserPassword(String prompt){
        String userPassword = "";
        //consoleEraser.halt();
        System.out.print(prompt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ConsoleEraser.start();
        try {
            userPassword = int.readLine();
        }
        catch (IOException e){
            System.out.println("Error al ingresar tu contraseña");
            System.exit(1);
        }
        //consoleEraser.halt();
        System.out.println("\b");
        return userPassword;
    }
    private static class ConsoleEraser extends Thread{
        private static Object ex;
        private boolean running = true;
        public void run() {
            while (running) {
                System.out.println("\b");
                try {
                    try {
                        Thread.currentThread().sleep(1);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
            public synchronized void halt() {
                running = false;
            }
        }
        public static void ValidaUsuario() {
            String sUsuario = "", sPassword = "";
            String sMensajeUsuario = "";
            try {
                sUsuario = getUserName("Favor de ingresar el Usuario:");
                sPassword = getUserPassword("Favor de ingresar la Contraseña:");

                sMensajeUsuario = EvidenciaFinal_UsuariosManejo.Valida(sUsuario, sPassword);
                if (sMensajeUsuario == "") {
                    System.out.println("Usuario y Contraseña correctas");
                    MuestraMenuAplicacion();
                }
                else {
                    CredencialesIncorrectas(sMensajeUsuario + "Desea continuar Consulta Medica: Si/S o No/N"):
                }
            } catch (Exception ex) {
                System.out.println("Error" + ex.getMessage() + "");
            }
            finally {
                ValidaUsuario();
            }
            private static void CredencialesIncorrectas(String sMensaje){
                System sContinuar ="";
                try {
                    System.out.println();
                    System.out.println(sMensaje);
                    sContinuar = datoCapturaCitas.readLine().toString().ToUpperCase();

                    switch (sContinuar){
                        case "Si":
                        case "S":
                            ValidaUsuario();
                            break;
                        case "NO":
                        case "N":
                            break;
                        default:
                            CredencialesIncorrectas(sMensaje);
                            break;
                    }
                }
                catch (Exception ex){}
                finally {}

                }
            private static void MuestraMenuAplicacion(){
                String sOpcionCitas = "";
                boolean bolSigeEvidencia = true;
                try{
                    do{
                        System.out.println("\n");
                        System.out.println(" ** Manejo de Consultas Medicas **\n");
                        System.out.println("    1 Administra Pacientes");
                        System.out.println("    2 Administra Doctores");
                        System.out.println("    3 Administra Citas");
                        System.out.println("    4 Administra Usuarios");
                        System.out.println("    X/x Regresar a Menu Principal. \n");

                        sOpcionCitas = datoCapturaCitas.readLine(),toString().trim().toUpperCase();

                        switch (sOpcionCitas){
                            case "1":
                                EvidenciaFinal.ClientesManejo.MuestraMenuPacientes();
                                break;
                                case "2":
                                    EvidenciaFinal.DoctoresManejo.MuestraMenuDoctores();
                                    break;
                                    case "3":
                                        EvidenciaFinal.CitasManejo.MuestraMenuCitas();
                                        break;
                                        case "4":
                                            EvidenciaFinal.UsuariosManejo.MuestraMenuUsuarios();
                                            break;
                                            case "X":
                                                bolSigeEvidencia = false;
                                                break;
                                                default:
                                                    System.out.println("");
                                                    System.out.println("El tipo de dato es incorrecto, ingresar uno valido");
                                                    System.out.println("");
                                                    MuestraMenuAplicacion();
                                                    break;
                        }
                        while(bolSigeEvidencia);
                }
                    catch (Exception ex);
                    finally {}
                }
            }
        }
    }
}

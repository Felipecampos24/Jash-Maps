import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tome referencia de una ia para entender mejor el preceso
        HashMap<Integer, Estudiante> mapaEstudiantes = new HashMap<>();


        Estudiante estudiante1 = new Estudiante("Juan", 1001, 4.5);
        Estudiante estudiante2 = new Estudiante("María", 1002, 3.8);

        mapaEstudiantes.put(estudiante1.getId(), estudiante1);
        mapaEstudiantes.put(estudiante2.getId(), estudiante2);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el ID del estudiante que deseas buscar: ");
        int idBuscado = scanner.nextInt();

        Estudiante estudianteEncontrado = mapaEstudiantes.get(idBuscado);
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado);
        } else {
            System.out.println("Estudiante con ID " + idBuscado + " no encontrado.");
        }
    }
}
//BRAYAN FELIPE CAMPOS CRISTANCHO   ID: 901132
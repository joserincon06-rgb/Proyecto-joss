import java.util.Scanner;

public class VideojuegoEducativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        String nombreEstudiante;

        System.out.println("=== PLATAFORMA DE VIDEOJUEGOS EDUCATIVOS ===");
        System.out.println("Modulo: Ortografia");
        System.out.print("Ingresa tu nombre: ");
        nombreEstudiante = sc.nextLine();

        System.out.println("\nHola " + nombreEstudiante + ", selecciona tu grado:");
        System.out.println("1. Primer grado");
        System.out.println("2. Segundo grado");
        System.out.println("3. Tercer grado");
        System.out.print("Opcion: ");
        int grado = sc.nextInt();
        sc.nextLine();

        System.out.println("\nSelecciona el nivel:");
        System.out.println("1. Uso de mayusculas");
        System.out.println("2. Signos de puntuacion");
        System.out.println("3. Palabras con B y V");
        System.out.println("4. Palabras con C, S y Z");
        System.out.println("5. Evaluacion final");
        System.out.print("Opcion: ");
        int nivel = sc.nextInt();
        sc.nextLine();

        // Arreglos de preguntas y respuestas segun el nivel elegido
        String[] preguntas;
        String[] respuestas;

        switch (nivel) {
            case 1:
                preguntas = new String[]{
                    "Escribe correctamente el nombre de la ciudad: (bogota / Bogota)",
                    "Escribe correctamente el nombre: (juan / Juan)",
                    "Escribe correctamente al inicio de una oracion: (lunes / Lunes)"
                };
                respuestas = new String[]{"Bogota", "Juan", "Lunes"};
                break;

            case 2:
                preguntas = new String[]{
                    "Que signo va al final de una pregunta: (. / ?)",
                    "Que signo se usa para separar elementos en una lista: (; / ,)",
                    "Que signo indica sorpresa: (! / ,)"
                };
                respuestas = new String[]{"?", ",", "!"};
                break;

            case 3:
                preguntas = new String[]{
                    "Completa la palabra: a__ion (b/v)",
                    "Completa la palabra: nue__o (b/v)",
                    "Completa la palabra: __urro (b/v)"
                };
                respuestas = new String[]{"b", "v", "b"};
                break;

            case 4:
                preguntas = new String[]{
                    "Completa la palabra: cora__on (z/s/c)",
                    "Completa la palabra: __apato (z/s/c)",
                    "Completa la palabra: e__cuela (z/s/c)"
                };
                respuestas = new String[]{"z", "z", "s"};
                break;

            default:
                preguntas = new String[]{
                    "Escribe correctamente: (haci / asi)",
                    "Escribe correctamente: (aver / a ver)",
                    "Escribe correctamente (participio de hacer): (echo / hecho)"
                };
                respuestas = new String[]{"asi", "a ver", "hecho"};
                break;
        }

        System.out.println("\n--- Comienza el juego ---");

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("\nPregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Tu respuesta: ");
            String respuestaUsuario = sc.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuestas[i])) {
                System.out.println("Correcto! +10 puntos");
                puntos = puntos + 10;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + respuestas[i]);
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Estudiante: " + nombreEstudiante);
        System.out.println("Grado: " + grado);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntaje obtenido: " + puntos);

        // Sistema sencillo de insignias segun el puntaje final
        if (puntos >= 30) {
            System.out.println("Insignia obtenida: ORO");
        } else if (puntos >= 20) {
            System.out.println("Insignia obtenida: PLATA");
        } else if (puntos >= 10) {
            System.out.println("Insignia obtenida: BRONCE");
        } else {
            System.out.println("Sigue practicando para obtener una insignia");
        }

        sc.close();
    }
}
import java.util.*;

public class FilaBanco {
    public static void main(String[] args) {
        String[] nombres = {
                "Sofía", "Mateo","Valentina", "Santiago","Isabella", "Nicolás","Camila", "Daniel",
                "Lucía", "Samuel","Mariana", "Pablo","Gabriela", "Martín","Elena", "Alejandro",
                "Julia", "Javier","Ana", "Gabriel","Laura", "Maximiliano","Sara", "Felipe",
                "Clara", "Diego","Natalia", "Adrián","Paula", "Bruno","Teresa", "Raúl",
                "Renata", "Gonzalo","Jimena", "Tomás", "Violeta", "Erik","Noa", "Emiliano",
                "Emma", "Axel","Agustina", "Joaquín","Salome", "César","Bianca",
                "Felipe","Pedro", "Tomás"
        };

        Queue<String> listaNombres = new LinkedList<>();
        Set<Integer> indicesUtilizados = new HashSet<>();
        Random random = new Random();

        while (listaNombres.size() < 25) {
            int indiceAleatorio = random.nextInt(nombres.length);
            if (!indicesUtilizados.contains(indiceAleatorio)) {
                listaNombres.add(nombres[indiceAleatorio]);
                indicesUtilizados.add(indiceAleatorio);
            }
        }
        
        List<String> ordenadoAlfabeticamente = ordernarAlfabeticamente(listaNombres);
       imprimirLista(ordenadoAlfabeticamente);
        // Mostrar la lista de nombres aleatorios
        
    }

    private static void imprimirLista(List<String> ordenadoAlfabeticamente) {
        for(String nombre : ordenadoAlfabeticamente){
            System.out.println(nombre);
        }
    }

    private static List<String> ordernarAlfabeticamente(Queue<String> listaNombres) {
        List<String> listaOrdenada = new ArrayList<>(listaNombres);

        for(int i = 0; i < listaOrdenada.size(); i++){
            for(int j = 0; j < listaOrdenada.size(); j++){
                if(listaOrdenada.get(i).compareTo(listaOrdenada.get(j)) < 0){
                    String pivot = listaOrdenada.get(i);
                    listaOrdenada.set(i, listaOrdenada.get(j));
                    listaOrdenada.set(j, pivot);
                }
            }
        }
        
        return listaOrdenada;
    }


}


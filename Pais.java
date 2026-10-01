public class Pais {
    public static void main(String[] args) {
        double popA = 80000;
        double taxaA = 0.03;
        double popB = 200000;
        double taxaB = 0.015;
        int anos = 0;

        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++;
        }

        System.out.println("Anos necessários para o País A alcançar/ultrapassar o País B: " + anos);
        System.out.println("População final de A: " + (int) popA);
        System.out.println("População final de B: " + (int) popB);
    }
}
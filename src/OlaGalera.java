public class OlaGalera {
    public static void main(String[] args) {
        System.out.print("\n\n\nOlá Galera do Curso de Java");

        double caixaDeBombom1 = 6.90;
        double caixaDeBombom2 = 7.55;
        double caixaDeBombom3 = 7.10;

        double salarioMinimo = 1320;
        double valorQueElePodeSacar = salarioMinimo * 1.5;

        double media = (caixaDeBombom1+caixaDeBombom2+ caixaDeBombom3) / 3;

        double cocaCola = 2.80;
        double aguaMineral = 1.25;
        double cervejaBrahma = 2.30;

        double novoCocaCola = cocaCola * 2.10;
        double novaAguaMineral = aguaMineral * 1.5;
        double novoCervejaBrehma = cervejaBrahma * 1.8;

        System.out.printf("A média do valor vendido é: %.2f\n\n\n", media);

        System.out.printf("O novo valor da Coca-Cola é %.2f, \n" +
                "o novo valor da Agua Mineral é %.2f, \n" +
                "o novo valor da Cerveja Brahma é %.2f.", novoCocaCola, novaAguaMineral, novoCervejaBrehma);

        System.out.printf("\n\n\nO valor que o senhor pode sacar é de: R$ %.2f\n\n\n", valorQueElePodeSacar);
    }
}

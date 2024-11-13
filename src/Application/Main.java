package Application;

import Entities.Produtos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos que serão inseridas: ");
        int n = sc.nextInt();

        List<Produtos> list = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Digite os dados do #" + i + " Produto: ");
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double preço = sc.nextDouble();
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = sc.nextInt();

            Produtos produtos = new Produtos(nome, preço, quantidade);

            list.add(produtos);
        }

        System.out.println("\nProdutos cadastrados");
        for (Produtos produtos: list){
            System.out.println(produtos);
        }

        String path = "C:\\Users\\Abc Technology\\Documents\\File\\produtos.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                bw.write("Nome do Produto,Valor Total em Estoque");
                bw.newLine();


                for (Produtos produtos: list){
                    double valorTotal = produtos.total();

                    bw.write(produtos.getNome() + ", " + valorTotal);
                    bw.newLine();
                }
                System.out.println("Produtos salvos com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
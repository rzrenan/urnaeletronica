package application;

import entities.Candidato;
import entities.Urna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Urna urna = new Urna();

        System.out.println("----------------------------------");
        System.out.println("------CADASTRO DE CANDIDATOS------");
        System.out.println("----------------------------------");
        System.out.println("Digite o nome do candidato: ");
        String nome1 = br.readLine();
        System.out.println("Digite o código do candidato: ");
        int codigo1 = Integer.parseInt(br.readLine());

        Candidato candidato1 = new Candidato(nome1, codigo1);

        System.out.println("----------------------------------");
        System.out.println("------CADASTRO DE CANDIDATOS------");
        System.out.println("----------------------------------");
        System.out.println("Digite o nome do candidato: ");
        String nome2 = br.readLine();
        System.out.println("Digite o código do candidato: ");
        int codigo2 = Integer.parseInt(br.readLine());

        Candidato candidato2 = new Candidato(nome2, codigo2);

        System.out.println("----------------------------------");
        System.out.println("------CADASTRO DE CANDIDATOS------");
        System.out.println("----------------------------------");
        System.out.println("Digite o nome do candidato: ");
        String nome3 = br.readLine();
        System.out.println("Digite o código do candidato: ");
        int codigo3 = Integer.parseInt(br.readLine());

        Candidato candidato3 = new Candidato(nome3, codigo3);

        urna.setCandidato1(candidato1);
        urna.setCandidato2(candidato2);
        urna.setCandidato3(candidato3);

        int voto = -1;

        while (voto != 0) {

            System.out.println(urna.exibirMenu());
            voto = Integer.parseInt(br.readLine());

            urna.votar(voto);
        }

        System.out.println(urna.exibirResultado());

    }
}
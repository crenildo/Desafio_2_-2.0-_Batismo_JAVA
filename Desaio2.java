package NivelFacil.Desafios;

import java.util.Scanner;

public class Desaio2 {
    public static void main(String[] args) {

        /*
    *
    * Permita ao usuário cadastrar
        o nome de um ninja.
        *
         Exiba a lista de todos os
        ninjas cadastrados.
        *
         Imprima os dados: Use
        System.out.println para
        mostrar as informações.
        *
         O usuário pode encerrar o
        programa a qualquer
        momento.
        *
         descrição DO DESAFIO
         *
         Você foi encarregado pelo Hokage para gerenciar o
        cadastro de ninjas na Vila da Folha. Sua missão é criar
        um sistema simples em Java para cadastrar novos
        ninjas e listar todos os ninjas cadastrados.
        *
         Tópicos a serem utilizados:
         *
         Quer mais dificuldade?
         Arrays: Para armazenar os nomes dos ninjas.
         *
         Switch Cases: Para implementar um menu
        interativo.
        *
         Loops: Para navegar pelas opções do menu e
        iterar sobre os ninjas cadastrados.
        *
         Condicionais: Para controlar a execução das
        opções do menu e validar o número de ninjas
        cadastrados
    * */

        /*
        * Aprendi que o scanner.nextInt é uma armadilha ardilosa, pois ele após ler o número, deixa um espaço em branco
        * isso mesmo, digitamos o número e damos ENTER, este ENTER fica como TEXTO para o proximo leitor, e acaba gerando
        * um erro safadão!
        * O ideial é usar um Integer.parseInt para converter um scanner.nextLine(), fica desta forma:
        * String entrada = scanner.nextLine();
        * int n = Integer.parseInt(entrada)
        * Assim você asegura que não vai dar erro por conta de um ENTER.
        *
        * */
        boolean onOff =  true;
        boolean onOff2 =  true;

        Scanner scanner = new Scanner(System.in);

        String texto = "Você foi redirecionado ao menu anterior! \n. \n. \n.)";

        String[] ninjas = new String[10];
        //System.out.println(ninjas.length);

        while(onOff){

            System.out.println("Seja bem-vindo ao sistema de gerenciamento de " +
                    "cadastro de ninjas de Konoha, escolhe as opções abaixo: " +
                    "\nO sistema atual trabalha apenas com 10 cadastros simultâneos, agradecemos pela compreessão!" +
                    "\n \n 1 - Cadastre um novo ninja! \n 2 - Liste os ninjas existentes! \n 3 - Altere o nome de um ninja! \n 4 - Apague um ninja!");

            int n1 = Integer.parseInt(scanner.nextLine());
            switch (n1) {

                case 1:
                    while (onOff2) {

                        System.out.println("Deseja criar um novo ninja ? Caso sim, digite 1, caso não digite 0 (Zero): ");
                        /*Não estou usando o scanner.nextInt pois ele deixa um espaço sobrando e buga o sistema,
                        * logo, minha preferencia é usar o metodo que evita erros ou problemas*/
                        int n2 = Integer.parseInt(scanner.nextLine());
                        if(n2 == 0){
                            break;
                        } else{
                            System.out.println("Digite um nome de ninja: ");
                            for (int i = 0; i < ninjas.length; i++) {
                                if (ninjas[i] == null) {
                                    ninjas[i] = scanner.nextLine();
                                    break;
                                } else if (ninjas[9] != null ){
                                    System.out.println("Atualmente você já tem 10 ninjas cadastrados, " +
                                            "apague ou substitua um ninja!");
                                    break;
                                }
                            }
                        }
                    }
                    System.out.println(texto);
                    break;

                case 2:
                    if (ninjas.length == 0){
                        System.out.println("Você ainda não tem um ninja cadastrado!");
                        System.out.println(texto);
                        break;

                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if(ninjas[i] != null){
                                System.out.println(ninjas[i]);
                            }
                        }
                        System.out.println(texto);
                        break;
                    }

                case 3:
                    if (ninjas.length == 0){
                        System.out.println("Você ainda não tem um ninja cadastrado!");
                        System.out.println(texto);
                        break;

                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            if(ninjas[i] != null){
                                System.out.println(i + " - " + ninjas[i]);
                            }
                        }
                        System.out.println("Digite o numero do ninja que deseja alterar: ");
                        int n3 = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o novo nome do ninja: ");
                        ninjas[n3] = scanner.nextLine();
                        System.out.println("Ninja alterado com sucesso!");
                        System.out.println(texto);
                        break;
                    }

                case 4:
                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] != null){
                            System.out.println(i + " - " + ninjas[i]);
                        }
                    }
                    System.out.println("Digite o numero do ninja que deseja apagar: ");
                    int n4 = Integer.parseInt(scanner.nextLine());
                    ninjas[n4] = null;
                    System.out.println("Ninja apagado com sucesso!");
                    System.out.println(texto);
                    break;

                default:
                    System.out.println("Você digitou uma opção invalida!");
                    break;
            }
        }
    }
}

package NivelIntermediario.Desafios;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        boolean onOff = true;
        boolean onOff2 = true;

        Scanner scanner = new Scanner(System.in);

        String texto = "Você foi redirecionado ao menu anterior! \n. \n. \n.)";

        String[][] ninjas = new String[5][10];

        String[] textoNome = new String[5];
        textoNome[0] = "Nome: ";
        textoNome[1] = "Idade: ";
        textoNome[2] = "Missão: ";
        textoNome[3] = "Nivel de Dificuldade: ";
        textoNome[4] = "Status da Missão: ";

        //System.out.println(ninjas.length);

        while (onOff) {

            System.out.println("Seja bem-vindo ao sistema de gerenciamento de " +
                    "cadastro de ninjas de Konoha, escolhe as opções abaixo: " +
                    "\nO sistema atual trabalha apenas com 10 cadastros simultâneos, agradecemos pela compreessão!" +
                    "\n \n 1 - Cadastre um novo ninja! \n 2 - Liste os ninjas existentes! \n 3 - Altere o nome de um ninja! \n 4 - Atualizar Habilidade Especial! \n 5 - Apague um ninja!");

            int n1 = Integer.parseInt(scanner.nextLine());
            switch (n1) {

                case 1:
                    while (onOff2) {

                        System.out.println("Deseja criar um novo ninja ? Caso sim, digite 1, caso não digite 0 (Zero): ");
                        /*Não estou usando o scanner.nextInt pois ele deixa um espaço sobrando e buga o sistema,
                         * logo, minha preferencia é usar o metodo que evita erros ou problemas*/
                        int n2 = Integer.parseInt(scanner.nextLine());
                        if (n2 == 0) {
                            break;
                        } else {
                            for (int i = 0; i < ninjas[0].length; i++) {

                                if (ninjas[0][i] == null) {
                                for (int j = 0; j < ninjas.length; j++) {
                                        System.out.println("Digite o " + textoNome[j]);
                                        ninjas[j][i] = scanner.nextLine();
                                }

                                break;

                                } else if (ninjas[0][9] != null) {
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
                    if (ninjas[0][0] == null) {
                        System.out.println("Você ainda não tem um ninja cadastrado!");
                        System.out.println(texto);
                        break;

                    } else {
                        for (int i = 0; i < ninjas[0].length; i++) {
                            for (int j = 0; j < ninjas.length; j++) {
                                if (ninjas[j][i] != null) {
                                    System.out.println(textoNome[j] + ninjas[j][i]);
                                }
                            }
                        }
                        System.out.println(texto);
                        break;
                    }

                default:
                    System.out.println("Você digitou uma opção invalida!");
                    break;
            }
        }
    }
}

class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    void mostrarInformacoes(){
        System.out.println(nome + "\n" + idade + "\n" + missao + "\n" + nivelDeDificuldade + "\n" + statusMissao + "\n");
    }
}

class kekkeiGenkai extends Ninja {

    String habilidadeEspecial;

    void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    @Override
    void mostrarInformacoes() {
        System.out.println(nome + "\n" + idade + "\n" + missao + "\n" + nivelDeDificuldade + "\n" + statusMissao + "\n" + habilidadeEspecial);
    }
}
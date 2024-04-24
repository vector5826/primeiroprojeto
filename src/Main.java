public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen match");
        System.out.println("Filme: Top Gun: maverick");


        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double nota = 8.2;

//        Media calculada pela 3 notas da Jack, paulo e suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
//      converta oq vem a frente
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

//        String nome = "Maria";
//        int idade = 30;
//        double valor = 55.9999;
//        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

//        String nome = "João";
//        int aulas = 4;
//
//        String mensagem = """
//                  Olá, %s!
//                  Boas vindas ao curso de Java.
//                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
//                  """.formatted(nome, aulas);

//        System.out.println(mensagem);


    }

}



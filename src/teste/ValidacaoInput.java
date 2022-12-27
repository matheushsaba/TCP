package teste;

import java.util.Scanner;

public class ValidacaoInput
{
    public enum Eixo
    {
        x,
        y
    }   

    public static void solicitarCoordenada(PosicaoMapa4x4 ponto, Eixo eixo)
    {
        
        boolean coordenadaValida = false;

        while (!coordenadaValida)
        {
            Scanner scanner = new Scanner(System.in);
            mostrarMensagem(eixo);

            if (!scanner.hasNextInt())                  //Se nao for um int, continua o loop
                continue;
            
            int novaCoodernada = scanner.nextInt();     //Se for um int, coleta o valor
            
            if (ehPossivelsetarCoordenada(ponto, eixo, novaCoodernada))     //Se o valor estiver entre 0 e 3, seta a coordenada e encerra o loop
                coordenadaValida = true;
                
            //scanner.close();                          //Nao pode fechar o scanner, pois ele esta vinculado ao System.in
        }
    }

    public static boolean ehPossivelsetarCoordenada(PosicaoMapa4x4 ponto, Eixo eixo, int valor)
    {
        switch (eixo)
        {
            case x:
                return ponto.setX(valor);
            
            case y:
                return ponto.setY(valor);
            
            default:
                return false;
        }
    }

    public static void mostrarMensagem(Eixo eixo)
    {
        String mensagemPadrao = "Digite um valor positivo inteiro entre 0 e 3 para a posicao do drone na coordenada ";

        switch (eixo)
        {
            case x:
                mensagemPadrao += "x:";
                break;
            
            case y:
                mensagemPadrao += "y:";
                break;
        }

        System.out.println(mensagemPadrao);
    }

}
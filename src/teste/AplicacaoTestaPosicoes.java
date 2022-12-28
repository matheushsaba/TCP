package teste;

import java.util.ArrayList;
import java.util.HashSet;

import posicoes.PosicaoMapa4x4;
import posicoes.ValidacaoInput;

public class AplicacaoTestaPosicoes
{
    //CONSTANTS
    static final int MAP_WIDTH = 4;
    static final int MAP_HEIGHT = 4;

    //MAIN
    public static void main(String[] args) 
    {
        //Criaçao de p1
        PosicaoMapa4x4 p1 = new PosicaoMapa4x4();
        ValidacaoInput.solicitarCoordenada(p1, ValidacaoInput.Eixo.x);
        ValidacaoInput.solicitarCoordenada(p1, ValidacaoInput.Eixo.y);
        System.out.print("Coordenadas de p1: ");
        p1.imprime();
        

        //Criaçao de p2
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();
        ValidacaoInput.solicitarCoordenada(p2, ValidacaoInput.Eixo.x);
        ValidacaoInput.solicitarCoordenada(p2, ValidacaoInput.Eixo.y);
        System.out.print("Coordenadas de p2: ");
        p2.imprime();
        System.out.println("Distancia entre p1 e p2: " + p1.distancia(p2));


        //Criaçao de p3
        PosicaoMapa4x4 p3 = p1.copy();
        System.out.print("Coordenadas de p3: ");
        p3.imprime();


        //Verificaçao se p1, p2 e p3 estao sobrepostos
        System.out.println("Ha sobreposiçao entre p1 e p2: " + PosicaoMapa4x4.estaoNaMesmaPosicao(p1, p2));
        System.out.println("Ha sobreposiçao entre p2 e p3: " + PosicaoMapa4x4.estaoNaMesmaPosicao(p2, p3));
        System.out.println("Ha sobreposiçao entre p1 e p3: " + PosicaoMapa4x4.estaoNaMesmaPosicao(p1, p3));


        //Criaçao da lista e impressao do mapa
        ArrayList<PosicaoMapa4x4> arrayDePontos = new ArrayList<>();
        arrayDePontos.add(p1);
        arrayDePontos.add(p2);
        arrayDePontos.add(p3);
        imprimeMapa(arrayDePontos);
    }

    public static void imprimeMapa(ArrayList<PosicaoMapa4x4> pontos)
    {
        HashSet<String> coordenadasDosDrones = new HashSet<>();

        for (PosicaoMapa4x4 ponto : pontos)             //Cria um hashset com as coordenadas dos drones em formato "x,y"
        {
            String coordenada = ponto.getX() + "," + ponto.getY();
            coordenadasDosDrones.add(coordenada);
        }

        for (int i = 0; i < MAP_HEIGHT; i++)            //Faz um loop na matriz de posiçoes e imprime o valor de cada uma
        {
            for (int j = 0; j < MAP_WIDTH; j++)
            {
                String coordenada = i + "," + j;
                String valorPosicao = (coordenadasDosDrones.contains(coordenada)) ? "X " : "- ";    //Se o hashset tiver alguma coordenada, imprime X, senao, imprime -
                System.out.print(valorPosicao);
            }
            System.out.println();
        }
    }

}
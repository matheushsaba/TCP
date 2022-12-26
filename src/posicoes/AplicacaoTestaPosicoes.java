package posicoes;

import java.util.ArrayList;
import java.util.HashSet;

import teste.PosicaoMapa4x4;
import teste.ValidacaoInput;

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
        p1.imprime();
        

        //Criaçao de p2
        PosicaoMapa4x4 p2 = new PosicaoMapa4x4();
        ValidacaoInput.solicitarCoordenada(p2, ValidacaoInput.Eixo.x);
        ValidacaoInput.solicitarCoordenada(p2, ValidacaoInput.Eixo.y);
        p2.imprime();
        p1.distancia(p2);


        //Criaçao de p3
        PosicaoMapa4x4 p3 = p1.copy();


        //Verificaçao se p1, p2 e p3 estao sobrepostos
        PosicaoMapa4x4.estaoNaMesmaPosicao(p1, p2);
        PosicaoMapa4x4.estaoNaMesmaPosicao(p2, p3);
        PosicaoMapa4x4.estaoNaMesmaPosicao(p1, p3);


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

        for (PosicaoMapa4x4 ponto : pontos) 
        {
            String coordenada = ponto.getX() + "," + ponto.getY();
            coordenadasDosDrones.add(coordenada);
        }


        for (int i = 0; i < MAP_HEIGHT; i++)
        {
            for (int j = 0; j < MAP_WIDTH; j++)
            {
                String coordenada = i + "," + j;

                if (coordenadasDosDrones.contains(coordenada))
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }

}
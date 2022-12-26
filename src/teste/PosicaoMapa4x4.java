package teste;

public class PosicaoMapa4x4
{
    //PROPERTIES
    private int x;
    private int y;
    private static int numPosicoesOcupadas;

    
    //CONSTRUCTORS
    public PosicaoMapa4x4()
    {
        this.reset();
    }

    public PosicaoMapa4x4(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    //METHODS
    public boolean setX(int newX)
    {
        if(newX >= 0 && newX < 4)
        {
            this.x = newX;
            return true;
        }
        
        this.reset();
        return false;
    }

    public boolean setY(int newY)
    {
        if(newY >= 0 && newY < 4)
        {
            this.y = newY;
            return true;
        }
        
        this.reset();
        return false;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public static int getNumPosicoesOcupadas()
    {
        return numPosicoesOcupadas;
    }

    public PosicaoMapa4x4 copy()
    {
        return new PosicaoMapa4x4(this.x, this.y);
    }

    public void imprime()
    {
        System.out.println(String.format("(%i, %i)", this.x, this.y));
    }

    public int distancia(PosicaoMapa4x4 posicao)
    {
        int diferencaAbsolutaX = Math.abs(this.x - posicao.x);
        int diferencaAbsolutaY = Math.abs(this.y - posicao.y);

        return diferencaAbsolutaX + diferencaAbsolutaY;
    }

    private void reset()
    {
        this.setX(0);
        this.setY(0);
    }

    public static boolean estaoNaMesmaPosicao(PosicaoMapa4x4 primeiraPosicao, PosicaoMapa4x4 segundaPosicao)
    {
        boolean equalX = primeiraPosicao.x == segundaPosicao.x;
        boolean equalY = primeiraPosicao.y == segundaPosicao.y;
        return (equalX && equalY) ? true : false;
    }

}
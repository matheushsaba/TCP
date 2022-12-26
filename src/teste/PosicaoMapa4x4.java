public class Posicao4x4()
{
    //PROPERTIES
    private int x { get; set; }
    private int y { get; set; }
    private static int numPosicoesOcupadas { get; private set; }

    //CONSTRUCTORS
    public PosicaoMapa4x4()
    {
        this.reset();

        
    }

    public PosicaoMapa4x4(int x, int y)
    {

    }


    //METHODS
    public boolean setX(int newX)
    {
        if(newX >= 0 && newX < 4)
        {
            this.x = newX;
            return true;
        }
            
        return false;
    }

    public boolean setY(int newY)
    {
        if(newY >= 0 && newY < 4)
        {
            this.y = newY;
            return true;
        }
            
        return false;
    }

    public int getX()
    {

    }

    public int getY()
    {
        
    }

    


    public PosicaoMapa4x4 copy()
    {
        return new PosicaoMapa4x4(this.x, this.y);
    }

    public void imprime()
    {

    }

    public int distancia(PosicaoMapa4x4 posicao)
    {

    }

    private void reset()
    {

    }

    public static boolean estaoNaMesmaPosicao(PosicaoMapa4x4 primeiraPosicao, PosicaoMapa4x4 segundaPosicao)
    {
        boolean equalX = primeiraPosicao.x == segundaPosicao.x;
        boolean equalY = primeiraPosicao.y == segundaPosicao.y;
        return (equalX && equalY) ? true : false;
    }

}
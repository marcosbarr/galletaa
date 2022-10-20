public class galleta {
    String tipo;
   String sabor;
   int cantidad;
}

public class Persona
{
   
    private String tipo;
    private String sabor;
    private int cantidad;
   
    public String getTipo()
    {
        return tipo;
    }

    public String getSabor()
    {
        return sabor;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setTipo(String t)
    {
        tipo = t;
    }

    public void setCantidad(int c)
    {
        cantidad = c;
    }

    public void SetSabor(String s)
    {
        sabor = s;
    }
}

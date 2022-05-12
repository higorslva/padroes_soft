abstract class Veiculo {
    protected Oficina oficina1;
    protected Oficina oficina2;
 
    protected Veiculo(Oficina oficina1, Oficina oficina2)
    {
        this.oficina1 = oficina1;
        this.oficina2 = oficina2;
    }
 
    abstract public void fabricar();
}
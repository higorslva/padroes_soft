class Bicicleta extends Veiculo {
    public Bicicleta(Oficina oficina1, Oficina oficina2)
    {
        super(oficina1, oficina2);
    }
 
    @Override
    public void fabricar()
    {
        System.out.print("Bicicleta ");
        oficina1.work();
        oficina2.work();
    }
}
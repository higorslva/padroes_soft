class Carro extends Veiculo {
    public Carro(Oficina oficina1, Oficina oficina2)
    {
        super(oficina1, oficina2);
    }
 
    @Override
    public void fabricar()
    {
        System.out.print("Carro ");
        oficina1.work();
        oficina2.work();
    }
}
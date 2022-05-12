class PadraoBridge {
    public static void main(String[] args)
    {
        Veiculo Veiculo1 = new Carro(new Produzir(), new Montar());
        Veiculo1.fabricar();
        Veiculo Veiculo2 = new Bicicleta(new Produzir(), new Montar());
        Veiculo2.fabricar();
    }
}

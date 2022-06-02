public abstract class DecoratorFormato implements Formato {

    // Protected variable
    protected Formato decoratedFormato;

    // Method 1
    // Abstract class method
    public DecoratorFormato (Formato decoratedFormato)
    {
        // This keywordd refers to current object itself
        this.decoratedFormato = decoratedFormato;
    }

    // Method 2 - draw()
    // Outside abstract class
    public void desenhe(){
      decoratedFormato.desenhe();
    }
}

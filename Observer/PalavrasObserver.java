public class PalavrasObserver extends Observer {
    public PalavrasObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void update() {
        System.out.println("Palavras: " + countPalavras());
    }
    private int countPalavras(){
        String str = subject.getEstado();
        int count = 1;

        if(str.isEmpty())
            return 0;
            for (int i = 0; i <= str.length() - 1; i++){
                if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
                count++;
        }
        return count;
    }
}
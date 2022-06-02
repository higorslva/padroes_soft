public class CapsObserver extends Observer{

    public CapsObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    public void update() {
        System.out.println("Caracteres maiúsculas: " + countMaiuscula());
        System.out.println("Caracteres minúsculos: " + countMinuscula());
    }
    private int countMinuscula(){
        String str = subject.getEstado();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                count++;
        }
        return count;
    }
    private int countMaiuscula(){
        String str = subject.getEstado();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }
        return count;
    }
}


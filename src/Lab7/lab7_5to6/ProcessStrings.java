package Lab7.lab7_5to6;

public class ProcessStrings implements StrOp{
    private String s;

    public ProcessStrings(String s) {
        this.s = s;
    }

    @Override
    public int chPerSt() {
        return this.s.length();
    }

    @Override
    public String oddStr() {
        String result="";
        for (int i=0; i<this.s.length(); i+=2){
            result+=this.s.charAt(i);
        }
        return result;
    }

    @Override
    public String invert() {
        String result="";
        for (int i=this.s.length()-1; i>=0; i--){
            result+=this.s.charAt(i);
        }
        return result;
    }
}

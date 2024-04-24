import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        }
    public static class AsciiCharSequence implements  CharSequence{
        private byte[] vales;
        AsciiCharSequence(byte[] vales){
            this.vales = vales;

        }

        @Override
        public int length() {
            return vales.length;
        }

        @Override
        public char charAt(int index) {
            return (char) vales[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(vales,start,end));
        }
        public String toString(){
            return new String(vales);
        }
    }

}

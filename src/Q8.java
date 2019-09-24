public class Q8 {
    public static void main(String[] args) {
        int[] x = new int[0];
        try{
            x = new int[-1];
        } catch (NegativeArraySizeException ex){
            System.out.println("Message: "+ex.getMessage());
        }
        try{
            int p = x[2];
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Message: "+ex.getMessage());
        }
        try{
            int[] y = null;
            int z = y[2];
        } catch (NullPointerException ex){
            System.out.println("Message: "+ex.getMessage());
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        try{
            throw new CustomException("Custom exception!!!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here");
        }
    }
}
class CustomException extends Exception{
    private String message = "";
    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
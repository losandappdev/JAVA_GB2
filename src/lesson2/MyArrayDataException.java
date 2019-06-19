package lesson2;

public class MyArrayDataException extends NumberFormatException {
   private String arayElement;

    public String getAraayElement() {
        return arayElement;
    }
    public MyArrayDataException(String s, String arayElement) {
        super(s);
        this.arayElement = arayElement;
    }
}

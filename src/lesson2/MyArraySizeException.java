package lesson2;

public class MyArraySizeException extends Exception {

    private String[][] arr;

    public String[][] getArr() {
        return arr;
    }

    public MyArraySizeException(String s, String[][] arr) {
        super(s);
        this.arr = arr;
    }
}

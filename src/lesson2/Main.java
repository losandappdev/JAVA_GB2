package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1","1","1","1"},
                            {"1","1","1","1"},
                            {"1","1","1","1"},
                            {"1","1","1","1"}};


        summArray(array);
    }

    public static  void summArray(String[][] array) throws MyArraySizeException{
        if (array[0].length != 4 || array.length != 4) {
            throw new MyArraySizeException("Заданный двумерный строковый массив размером не соответствует размеру 4х4", array);
        }
    }
}

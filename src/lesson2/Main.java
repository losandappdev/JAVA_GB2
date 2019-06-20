package lesson2;

public class Main {
    public static void main(String[] args) {
//        String[][] array = {{"2","2","2","2"},
//                            {"2","2","2","2"},
//                            {"2","2","2","2"},
//                            {"2","2","2","2"}};

//        String[][] array = {{"1","1","1","1"},
//                            {"1","1","1","1"},
//                            {"1","1","1","1"},
//                            };

//        String[][] array = {{"1","1","1","1"},
//                            {"1","1","1","1"},
//                            {"1","1","1","1"},
//                            {"1","1","1"}};

        String[][] array = {{"1","1","1","1"},
                            {"1","1","1","1"},
                            {"1","m","1","1"},
                            {"1","1","1","1"}};


        try {
            summArray(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static  void summArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        for (String[] arr: array) {
           if (arr.length != 4){throw  new MyArraySizeException("Заданный двумерный строковый массив соответствует размеру 4х4", array); }
        }
        if (array.length != 4) {
            throw  new MyArraySizeException("Заданный двумерный строковый массив размером не соответствует размеру 4х4", array);
        }

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int arrEl = Integer.parseInt(array[i][j]);
                    summ += arrEl;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Элемент с индексом " + (i+1)+ " " + (j+1) + " не число", array[i][j]);

                }
            }
        }
//
//        for (String[] i: array)
//            for (String j : i) {
//                try {
//                    int arrEl = Integer.parseInt(j);
//                    summ += arrEl;
//                }catch (NumberFormatException e){
//                    throw new MyArrayDataException("этот элемент" + i + j + " не число", j);
//
//                }



//
        System.out.println("Сумма всех элементов массива равна: " + summ);

    }
}

package geekbrains.lesson2_2_homework;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException() {
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}


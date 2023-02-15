// update the class
class MyException extends Throwable {

    public MyException(String message) {
        super(message);
    }
    
    // other way to do the same program (without using superclass)
    // public String message;
    // public MyException(String message) {
    //     this.message = message;
    // }
    // public String getMessage() {
    //     return message;
    // }
    
}

//do not change the code
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}

package dupradosantini.myfirstapi.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L; //required

    public ObjectNotFoundException(String message) { //constructor 1
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {//constructor 2
        super(message, cause);
    }
}

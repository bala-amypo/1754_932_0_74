

public class GlobalExceptionHandler{
    @Exceptionhandler(ResourceNotFoundException.java)
    public ResponseEntity<String>GlobalExceptionHandler (ResourceNotFoundException ex){
        return ResponseEntity.status(404).body(ex.)
    }
}
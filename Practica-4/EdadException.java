public class EdadException extends Exception{
    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }

    public EdadException(int edad) throws EdadException{
        
    }

    public void validadEdad(int edad) throws EdadException {
        if(!(edad>=18 && edad<=45)){
            throw new EdadException("Error en la edad, es menor a 18 o mayor a 45");
        }
    }

}

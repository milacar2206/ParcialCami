

public interface Entregable {
	 public static void entregar() {
	        boolean entregado = true;
	 }
	 
	    
	  public static void devolver() {
	        boolean entregado = false;
	    }
	
	
    public default boolean isEntregado() {
        if(isEntregado()){
            return true;
        }
        return false;
   
}
    
   
		
		
    }

		
	



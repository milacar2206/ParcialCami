
public class Ejecutable {
	private static final int MAYOR = 0;
	private static final int IGUAL = 0;
	private static final String HORAS_ESTIMADAS_DEF = null;
	private int horasEstimadas;
	private static String compañia;
	private String titulo;
	private String genero;
	private boolean entregado;

	public int compareTo(Object a) {
        int MENOR = 0;
		int estado=MENOR;
  
        
        VideoJuegos ref=(VideoJuegos)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
  
        return estado;
    }
	 public String toString(String titulo, String genero, String compañia){
	        return "Informacion del videojuego: \n" +
	                "\tTitulo: "+titulo+"\n" +
	                "\tHoras estimadas: "+horasEstimadas+"\n" +
	                "\tGenero: "+genero+"\n" +
	                "\tcompañia: "+compañia;
	    }
	 public boolean equals(VideoJuegos a){
	        String titulo = null;
			if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
	            return true;
	        }
	        return false;
	        
	 }
	 
	   
	   
	 
	 public void Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
	        this.titulo=titulo;
	        this.horasEstimadas=horasEstimadas;
	        this.genero=genero;
	        this.compañia=compañia;
	        this.entregado=false;
	    }
	 
	  
	}


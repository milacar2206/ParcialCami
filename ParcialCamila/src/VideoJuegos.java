
public class VideoJuegos {
	private final static int HORAS_ESTIMADAS_DEF=100;
	  public final static int MAYOR=1;
	  public final static int MENOR=-1;
	  public final static int IGUAL=0;
private String titulo;
private int horasEstimadas;
private boolean entregado;
private String genero;
private String compañia;

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public int getHorasEstimadas() {
    return horasEstimadas;
}

public void setHorasEstimadas(int horasEstimadas) {
    this.horasEstimadas = horasEstimadas;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public String getcompañia() {
    return compañia;
}
public void setcompañia(String compañia) {
    this.compañia = compañia;
}
@Override
public String toString() {
	return "VideoJuegos [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
			+ ", genero=" + genero + ", compañia=" + compañia + "]";
}

}



	


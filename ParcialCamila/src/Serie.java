
public class Serie {

	private String titulo;
       private int NumeroTemporadas;
       private boolean entregado;
       private String genero;
       private String creador;
	
public void serie() {
}

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public void setnumeroTemporadas(int numeroTemporadas) {
    this.NumeroTemporadas = numeroTemporadas;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public String getcreador() {
    return creador;
}
public void setcreador(String creador) {
    this.creador = creador;
}

@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", NumeroTemporadas=" + NumeroTemporadas + ", entregado=" + entregado
			+ ", genero=" + genero + ", creador=" + creador + "]";
}

public void entregar() {
    entregado=true;
}
public void devolver() {
    entregado=false;
}
public boolean isEntregado() {
    if(entregado){
        return true;
    }
    return false;
}
}



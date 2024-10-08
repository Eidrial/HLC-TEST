package ejercicios;

public class Libro {
	
	private String isbn;
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro(String isbn, String titulo, String autor, int numPag) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "El libro '" + titulo + "' con ISBN " + isbn + " y creado por " + autor + " tiene " + numPag + " páginas.\n";
	}

}

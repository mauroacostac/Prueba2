package repaso;

public class abstraccion_encapsulamiento {
	//forma,color,tama�o,precio,dise�o.
	
	//ABSTRACCION Y ENCAPSULAMIENTO
	private String forma;
	private String color;
	private String tamaño;
	private double precio;
	private String diseño;
	
	//GETTERS Y SETTERS
	public void setForma(String forma){
		this.forma = forma;
	}
	
	public String getForma(){
		return this.forma;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDiseño() {
		return diseño;
	}

	public void setDiseño(String diseño) {
		this.diseño = diseño;
	}
	
	
	
}

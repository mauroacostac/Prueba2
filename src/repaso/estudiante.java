package repaso;

public class estudiante extends israel {
	private String codigo;
	private String curso;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void LlenadoDatos(){
		raza = "negra";
		edad = 21;
		sexo = "femenino";
		nombre = "Joseline";
		apellido = "Vivas Solis";
		
	}
	
	public void Llenadokfc(){
		codigo = "09482";
		curso = "4to semestre";
		System.out.println(raza);
		System.out.println(edad);
		System.out.println(sexo);
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(codigo);
		System.out.println(curso);
	}
	
        public void Saludo(){
            System.out.println("Me llamo Joseline");
        }

	
	
}

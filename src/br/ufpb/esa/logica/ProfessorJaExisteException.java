package br.ufpb.esa.logica;


public class ProfessorJaExisteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProfessorJaExisteException(String msg){
		super(msg);
	}
	public ProfessorJaExisteException(){
		super();
	}

}

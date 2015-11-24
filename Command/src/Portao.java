
public class Portao {
	public final static int aberto = 1;
	public final static int fechado = 0;
    private int estado = 0;
      
      
    public int getEstado(){
    	return estado;
 
     }
    
    public void setEstado(int estado){
    	this.estado = estado;
    }
    
    public void abrir(){
    	this.estado = aberto;
    	System.out.println("O Portão abriu!");
    }
    
    public void fechar(){
    	this.estado = fechado;
    	System.out.println("O Portão fechou!");
    }

}

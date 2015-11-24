


public class abrirCommand implements Command {
	
private Portao portao;
	
	public abrirCommand(Portao portao){
		this.portao = portao;
	}
	
	
	@Override
	public void execute() {
		portao.abrir();
		
	}

	@Override
	public void undo() {
		portao.fechar();
	}

}

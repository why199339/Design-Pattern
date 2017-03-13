package CommandPattern;

public class CeilingFanOffCommnd implements Command{

	CeilingFan ceilingFan;
	
	public CeilingFanOffCommnd(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.on();
		
	}
	
	
}

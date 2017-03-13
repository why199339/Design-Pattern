package CommandPattern;

public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offComand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offComand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("---------------Remote Control------------\n");
		for (int i = 0; i < offCommands.length; i++) {
			stringBuff.append("slot[" + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}

package lab4;
import lab4.client.GomokuClient;
import lab4.data.GomokuGameState;
import lab4.gui.GomokuGUI;

public class GomokuMain{

	public static void main(String[] args){ //Port Number as argument.
		int portNumber = (args.length<1) ? 9001 : Integer.parseInt(args[0]);
		GomokuClient GC = new GomokuClient(portNumber);
		GomokuGameState GGS = new GomokuGameState(GC);
		GomokuGUI GGUI = new GomokuGUI(GGS,GC);
	}
}

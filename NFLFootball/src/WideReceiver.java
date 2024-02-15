
public class WideReceiver extends Offense{
	private String position = "Wide Receiver";
	private String play = "catch";

	public WideReceiver(String name, int playerId) {
		super(name, playerId);
	
	}

	@Override
	public String getPlayerPosition() {
		return position;
	}

	@Override
	public String play() {
		return play;
	}

	@Override
	public String toString() {
		String result = "Name: "+getName()+
				"\nNumber: "+getPlayerId()+
				"\nPosition: "+getPlayerPosition()+
				"\nPlay: "+play();
		return result;
	}

}


public class TightEnd extends Offense{
	private String position = "Tight End";
	private String play = "blocker or receiver.";

	public TightEnd(String name, int playerId) {
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

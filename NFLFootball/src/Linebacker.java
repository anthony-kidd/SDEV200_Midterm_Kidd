
public class Linebacker extends Defense{
	private String position = "Linebacker";
	private String play = "tackle";

	public Linebacker(String name, int playerId) {
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


public class RunningBack extends Offense{
	private String position = "Running Back";
	private String play = "rush or receive";

	public RunningBack(String name,int playerId) {
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


public abstract class SpecialTeams extends Player{
	String positionType = "Special Teams";

	public SpecialTeams(String name, String playerId, String positionType) {
		super(name, playerId);
		this.positionType = positionType;
	}

}

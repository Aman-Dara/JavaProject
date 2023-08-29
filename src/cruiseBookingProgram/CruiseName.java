package cruiseBookingProgram;

public enum CruiseName {
	
	SCENICCRUISE("Scenic_Cruise"),
	SUNSETCRUISE("Sunset_Cruise"),
	DISCOVERYCRUISE("Discovery_Cruise"),
	MYSTERYCRUISE("Mystery_Cruise");
	
	String cruiseName;
	
	CruiseName(String cruiseName){
		this.cruiseName = cruiseName;
	}
	
	String getCruiseName() {
		return cruiseName;
	}

}

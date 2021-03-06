package callcenter;

/**
 * Enumeration of employee type and call type, call type indicates the type of employees who
 * handle this call, call type might change when an employee can not handle the call and escalate
 * it to the upper level employee.
 * 
 * Three types of employees Fresher, Technical Leader(TL), Product Manager(PM) 
 * @author wish
 */
public enum Level {
	/**
	 * Fresher, Technical Leader(TL), Product Manager(PM)
	 */
	Fresher(0), TechnicalLeader(1), Manager(2);
	
	private int value;
	
	private Level(int v) {
		this.value = v;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString(int value) {
		switch(value) {
			case 0 :
				return "Fresher";
			case 1:
				return "Techinical Lead";
			case 2:
				return "Manager";
			default:
				return "";
		}
	}
	
	
}

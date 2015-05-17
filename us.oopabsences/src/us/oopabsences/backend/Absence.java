/**
 * 
 */
package us.oopabsences.backend;

import java.util.ArrayList;

/**
 * @author Zinadore
 *
 */
public class Absence {

	private Unit unit;
	private ArrayList<SpecificAbsence> specAbs;
	
	/**
	 * @param unit the Unit related to this Absence
	 */
	public Absence(Unit unit) {
		this.unit = unit;
		this.specAbs = new ArrayList<SpecificAbsence>();
	}
	
	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}
	
	public void addSpecificAbsence(SpecificAbsence sa) {
		specAbs.add(sa);
	}

	public String getUnitName() {
		return this.unit.getName();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Absence [unit=" + unit + ", specAbs=" + specAbs + "]";
	}
	
}

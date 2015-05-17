package us.oopabsences.frontend;

import java.util.ArrayList;

import us.oopabsences.backend.Absence;
import us.oopabsences.backend.SpecificAbsence;
import us.oopabsences.backend.Unit;

public class tester {

	private static Unit invalidTestUnit;
	private static Unit testUnit;
	private static ArrayList<Absence> absences;

	public static void main(String[] args) {
		invalidTestUnit = new Unit();
		testUnit = new Unit("Object Oriented Programing", "CPP1700", "Ioannis Boutsikas", 30);
		absences  = new ArrayList<Absence>();
		
		absences.add(new Absence(testUnit));
		absences.get(0).addSpecificAbsence(new SpecificAbsence("L6"));;
		
		
		System.out.println(invalidTestUnit);
		System.out.println(testUnit);
		System.out.println(absences);
		System.out.println(absences.get(0));
		System.out.println(absences.get(0).getUnitName());
	}

}

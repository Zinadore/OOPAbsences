package us.oopabsences.backend;

import java.util.Date;

public class SpecificAbsence {
	
	private Date date;
	private String classroom;
	
	/**
	 * @param classroom the classroom the absence was taken on
	 */
	public SpecificAbsence(String classroom) {
		this.classroom = classroom;
		this.date = new Date();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpecificAbcence [date=" + date + ", classroom=" + classroom
				+ "]";
	}
	
}

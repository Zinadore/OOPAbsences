/**
 * 
 */
package us.oopabsences.backend;

/**
 * @author Zinadore
 *
 */
public class Unit {

		private String name;
		private String id;
		private String tutor;
		private int maxAbsences;
		
		/**
		 * Creates a unit with "INVALID_DATA" on all fields. Should never be used.
		 */
		public Unit() {
			this("INAVLID_DATA", "INVALID_DATA", "INVALID_DATA", 0);
		}
		
		/**
		 * @param name the name of the Unit
		 * @param id the id of the unit
		 * @param tutor the tutor of the unit
		 * @param maxAbs number of maximum absences allowed
		 */
		public Unit(String name, String id, String tutor, int maxAbs) {
			this.name = name;
			this.id = id;
			this.tutor = tutor;
			this.maxAbsences = maxAbs;
		}
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		
		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}
		
		/**
		 * @return the tutor
		 */
		public String getTutor() {
			return tutor;
		}
		
		/**
		 * @param tutor the tutor to set
		 */
		public void setTutor(String tutor) {
			this.tutor = tutor;
		}
		
		/**
		 * @return the maxAbsences
		 */
		public int getMaxAbsences() {
			return maxAbsences;
		}
		
		/**
		 * @param maxAbsences the maxAbsences to set
		 */
		public void setMaxAbsences(int maxAbsences) {
			this.maxAbsences = maxAbsences;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Unit [name=" + name + ", id=" + id + ", tutor=" + tutor
					+ ", maxAbsences=" + maxAbsences + "]";
		}
}

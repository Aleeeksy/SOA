package model;

public class Piwo {
	private
		String marka;
		String typ;
		
		public Piwo(String typ, String marka) {
			super();
			this.marka = marka;
			this.typ = typ;
		}

		public String getMarka() {
			return marka;
		}

		public void setMarka(String marka) {
			this.marka = marka;
		}

		public String getTyp() {
			return typ;
		}

		public void setTyp(String typ) {
			this.typ = typ;
		}
		

}

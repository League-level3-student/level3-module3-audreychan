package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixed = "";
		for(int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
				mixed += s.toLowerCase().charAt(i);
			}
			else {
				mixed += s.toUpperCase().charAt(i);
			}
		}
		return mixed;
	}

}

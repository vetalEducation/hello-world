public class Code {
	private long code;

	public Code(long code) {
		this.code = code;
	}	

	public long getCode() {
		return code;
	}
	
	@Override
	public String toString() {
		return "Code {" + "code = " + code + '}';
	}
}
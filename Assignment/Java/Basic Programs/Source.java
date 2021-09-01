class Source{
	public static String retString(){
		return "Parent";
}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SourceSubClass s =new SourceSubClass();
		s.retString();
	}
}
class SourceSubClass extends Source{
	public static String retString(){
		return "Child";
	}
}
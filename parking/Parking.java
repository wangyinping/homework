public class Parking {
	private int s;
	
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int park(){
        if (s==0) {
            System.out.println("No parking space,parking failed");
            return s;
 }
        return --s;
	}
   public int take(String str){
		return ++s;
	}

}


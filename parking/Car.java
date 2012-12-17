
public class Car {
	private String CarNum;
    private String VPC;
    private int counter=1;
    private String InVPC;
    public String getCarNum() {
		return CarNum;
	}

	public void setCarNum(String carNum) {
         CarNum = carNum;
        }
    public String getVPC() {
        counter--;
        if (counter<0 )
           System.out.println("You've taken your car");
        return VPC;
    }
    public void setVPC(String certificate) {
        VPC= certificate;
    }

    public boolean getInVPC() {
       boolean result=VPC.equals(InVPC);
        System.out.println("This is an invalid parking certificate");
        return result;

    }
    public void setInVPC(String invalid) {
        InVPC= invalid;

    }

}

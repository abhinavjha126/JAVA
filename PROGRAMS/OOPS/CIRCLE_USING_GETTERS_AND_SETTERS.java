package OOPS;
class Cylinder
{
	private int R=18;
	private int H=12;
	public int getR() {
		return R;
	}
	public void setR(int R) {
		this.R = R;
	}
	public int getH() {
		return H;
	}
	public void setH(int H) {
		this.H = H;
	}
}
    public class CIRCLE_USING_GETTERS_AND_SETTERS 
    {
	public static void main(String[] args) 
	  {
		Cylinder obj=new Cylinder();
		obj.setR(15);
		obj.setH(10);
		System.out.println("The Radius of the Cylinder is: "+obj.getR());
		System.out.println("The Height of the Cylinder is: "+obj.getH());
	  }

   }

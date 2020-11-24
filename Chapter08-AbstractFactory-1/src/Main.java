import Sam.SamFactory;
import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtBikeFactory;

public class Main {

	public static void main(String[] args) {


		BikeFactory factory = new SamFactory();  //		new GtBikeFactory() ; 로 쉽게 변경할 수 있다 !
		
		Body body = factory.createBody();
		Wheel wheel = factory.creatWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}
}

package ex;

public class TvEx0 {

	public static void main(String[] args) {
		
		
//		Tv[] tvArr = new Tv[3];
		
		Tv[] tvArr = {new Tv(), new Tv(), new Tv()};
		
//		tvArr[0] = new Tv();
		tvArr[0].channel =7;
		
//		tvArr[1] = new Tv();
		tvArr[1].channel=11;
				
//		tvArr[2] = new Tv();
		tvArr[2].channel=23;

		System.out.println(tvArr[0].channel);
		System.out.println(tvArr[1].channel);
		System.out.println(tvArr[2].channel);
	}

}


class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	
	void channelup() {channel++;}
	void channeldown() {channel--;}
}


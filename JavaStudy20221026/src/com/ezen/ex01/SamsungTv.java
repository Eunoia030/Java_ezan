package com.ezen.ex01;

public class SamsungTv implements Tv {
	
	@Override
	public void powerOn() {
		System.out.println("삼성티비 전원 온!");
	}
	
	@Override
	public void powerOff() {
		System.out.println("삼성티비 전원 오프!");
	}
	@Override
	public void volumeUp() {
		System.out.println("삼성티비 볼륨 업!");
	}
	@Override
	public void volumeDown() {
		System.out.println("삼성티비 볼륨 다운");
	}

}

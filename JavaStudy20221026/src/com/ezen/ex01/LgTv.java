package com.ezen.ex01;

public class LgTv implements Tv {
	@Override
	public void powerOff() {
		System.out.println("Lgtv 파워오프");
	}
	@Override
	public void powerOn() {
		System.out.println("Lgtv 파워온");
		}
	@Override
	public void volumeDown() {
		System.out.println("Lgtv 볼륨다운");}
	@Override
	public void volumeUp() {
		System.out.println("Lgtv 볼륨 업");}
}

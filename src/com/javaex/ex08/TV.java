package com.javaex.ex08;

public class TV {
	
	//필드 - private로 접근 제어를 하고,
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자 - 기본 생성자; 오버로딩
	public TV() {}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//getter만 작성???
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}

	
	//메소드 일반
	
	public void power(boolean on) {
		if(on==true) {
			this.power=true;
		}else {
			this.power=false;
			
		}
	}
	
	
	public void channel( int channel ) {//메소드 구현 (1~255 유지)
		if(channel>=255) {
			//System.out.println(channel);
			this.channel = 255;
		}else if(channel<=1) {
			this.channel = 1;
			//System.out.println(channel);
		}
	}
	
	
	/////
	public void channel(boolean up) {
		if(up==true) {
			this.channel += 1;
		}else {
			this.channel-=1;
		}
	}
	
	
	
	public void volume( int volume ) { //메소드 구현 ( 0 ~ 100 유지 )
		if(volume>=100) {
			this.volume=100;
			//System.out.println(volume);
		}else if(volume<=0){
			this.volume=0;
			//System.out.println(volume);
		}
	} 
	public void volume( boolean up ) { //메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		if(up==true) {
			this.volume +=1;
		}else {
			this.volume-=1;
		}
	}
	
	
	public void status() {
		//System.out.println("현재 채널: " + channel + " 소리: " + volume + " " + power);
		if(power==false) {
			System.out.println("TV OFF");
		}else {
			System.out.println("TV ON");
			System.out.println("현재 채널: " + channel);
			System.out.println("현재 볼륨: " + volume);
		}
		
	}

}
	
	



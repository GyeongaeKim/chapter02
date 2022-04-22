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
			System.out.println("TV를 켭니다.");
			this.power=true;
		}else {
			System.out.println("TV를 끕니다.");
			this.power=false;
			
		}
	}
	
	
	void channel( int channel ) {//메소드 구현 (1~255 유지)
		if(1<=channel && channel<=255) {
			System.out.println(channel);
		}else {
			this.channel=255;
			System.out.println(channel);
		}
	}
	
	
	
	void channel( boolean up ) { //메소드 오버로딩 (1~255 유지, 1씩 증감)
		while(true) {
			if(1<=channel && channel<255) {
				channel++;
				System.out.println(channel);
			}else {return;}
		}
	}
	
	
	
	void volume( int volume ) { //메소드 구현 ( 0 ~ 100 유지 )
		if(0<=volume && volume<=100) {
			System.out.println(volume);
		}else {
			this.volume=100;
			System.out.println(volume);
		}
	} 
	void volume( boolean up ) { //메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		while(true) {
			if(0<=volume && volume<100) {
				volume++;
				System.out.println(volume);
			}else {return;}
		}
	}
	
	
	void status() {
		System.out.println("현재 채널: " + channel + " 소리: " + volume + " " + power);
	}





}
	
	



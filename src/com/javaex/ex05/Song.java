package com.javaex.ex05;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	
	//메소드 gs
	public void setTitle(String songtitle) {
		title = songtitle;
	}
	public void setArtist(String songartist) {
		artist = songartist;
	}
	public void setAlbum(String songalbum) {
		album = songalbum;
	}
	public void setComposer(String songcomposer) {
		composer = songcomposer;
	}
	public void setYear(int songyear) {
		year = songyear;
	}
	public void setTrack(int songtrack) {
		track = songtrack;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}

	
	
	
	
	
	
	
}

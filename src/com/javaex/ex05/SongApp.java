package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song();
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수");
		iu.setYear(2010);
		iu.setTrack(3);
		
		Song s2 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		/*
		Song bigbang = new Song();
		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setComposer("G-DRAGON");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		*/
		
		Song s3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
		/*
		Song busker = new Song();
		busker.setTitle("벚꽃엔딩");
		busker.setArtist("버스커버스커");
		busker.setAlbum("버스커버스커1집");
		busker.setComposer("장범준");
		busker.setYear(2012);
		busker.setTrack(4);
		*/
		
		
		
		
		
		
		
		System.out.println(iu.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println("=======================================================");
		
		iu.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		
		
		
		
		
	}

}

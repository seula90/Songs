package Songs;

public class SongsMain {

	public static void main(String[] args) {

		/*
		 * Songs iu = new Songs();
		 * 
		 * iu.setTitle("좋은날"); iu.setArtist("아이유"); iu.setAlbum("Real");
		 * iu.setComposer("이민수"); iu.setTrack(3); iu.setYear(2010);
		 * 
		 * iu.show();
		 */

		Songs iu = new Songs("좋은날", "아이유", "Real", "이민수", 3, 2010);
		Songs sistar = new Songs( "러빙유", "씨스타", "", null, 0, 0 );
	    Songs busker = new Songs( "여수 밤바다", "버스커 버스커", "", null, 0, 0 );         
	    Songs wonder = new Songs( "Like This", "원더걸스" );  
		
	    iu.show();
		sistar.show();
		busker.show();
		wonder.show();
	}
}

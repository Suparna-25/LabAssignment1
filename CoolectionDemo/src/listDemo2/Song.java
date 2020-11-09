package listDemo2;

public class Song implements Comparable<Song> {
	private String title;
	private String singer;
	private String rating;
	private String year;

	public Song(String title, String singer, String rating, String year) {

		this.title = title;
		this.singer = singer;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + "]";
	}

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(o.getTitle());
	}

}

package day24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Item{
	int itemNo;
	int name;
	int stock;
}
@Getter
@Setter
class Book extends Item{
	String writer;
	String isbm;
	public Book(int itemNo, int name, int stock, String writer, String isbm) {
		super(itemNo, name, stock);
		this.writer = writer;
		this.isbm = isbm;
	}
}
@Getter
@Setter
class Movie extends Item{
	String director;
	String actor;
	public Movie(int itemNo, int name, int stock, String director, String actor) {
		super(itemNo, name, stock);
		this.director = director;
		this.actor = actor;
	}
}
@Getter
@Setter
class Music extends Item{
	String artist;
	public Music(int itemNo, int name, int stock, String artist) {
		super(itemNo, name, stock);
		this.artist = artist;
	}
}
public class InheritanceTest {

}

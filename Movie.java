import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.zip.DataFormatException;

public class Movie  implements MovieInterface{

	private String title;
	private String original_title;
	private Integer year;
	private List<String> genres;
	private Integer duration;
	private String country;
	private String language;
	private String director;
	private String writer;
	private String production;
	private String actors;
	private String description;
	private Float avg_vote;
	
	public Movie()
	{
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getOriginal_title() {
		return original_title;
	}
	
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public List<String> getGenres() {
		return genres;
	}
	
	public void setGenre(List<String> strings) {
		this.genres = strings;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getAvgVote() {
		return avg_vote;
	}
	public void setAvgVote(float avg_vote) {
		this.avg_vote = avg_vote;
	}
	
	@Override
	public int compareTo(MovieInterface otherMovie) {
	
		boolean results = true;
		
		if(!this.getTitle().equals(otherMovie.getTitle()))
		{
			results = false;
		}
		
		
		if(!this.getAvgVote().equals(otherMovie.getAvgVote()))
		{
			results = false;
		}
		
		
		if(!this.getDescription().equals(otherMovie.getDescription()))
		{
			results = false;
		}
		
		if(!this.getDirector().equals(otherMovie.getDirector()))
		{
			results = false;
		}
		
		if(!this.getGenres().equals(otherMovie.getGenres()))
		{
			results = false;
		}
		
		if(!this.getYear().equals(otherMovie.getYear()))
		{
			results = false;
		}
		
		if(results == true)
			return 0;
		else 
			return 1;
		
	}
	
	
	
}

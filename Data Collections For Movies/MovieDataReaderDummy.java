import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MovieDataReaderDummy implements MovieDataReaderInterface {

    /**
     * Method that readers movie data in CSV format from the Redaer provided. The dummy implementations
     * will always return the same 3 sets of movies.
     */
	
    @Override
    public List<MovieInterface> readDataSet(Reader inputFileReader) throws FileNotFoundException, IOException {
        ArrayList<MovieInterface> movies = new ArrayList<MovieInterface>();
        
        movies.add(new MovieInterface() {
//        	InputStreamReader in;
//        	
//        	File file = new File("/CS 400 Project 1/src/movies.csv");
//        	Reader file2 = new Reader(in, "UTF-8");
        

            @Override
            public String getTitle() {
                return "The Source of Shadows";
            }
            //The Source of Shadows
            //Plan 9 from Outer Spacce

            @Override
            public Integer getYear() {
                return 1959;
            }

            @Override
            public List<String> getGenres() {
                return Arrays.asList(new String[] {"Horror"});
            }

            @Override
            public String getDirector() {
                return "Ryan Bury";
            }

            @Override
            public String getDescription() {
                return "Residents of California's San Fernando Valley are under attack by flying saucers from outer space.";
            }

            @Override
            public Float getAvgVote() {
                return 3.5f;
            }

            @Override
            public int compareTo(MovieInterface otherMovie) {
                if (this.getTitle().equals(otherMovie.getTitle())) {
                    return 0;
                    // sort by rating
                } else if (this.getAvgVote() < otherMovie.getAvgVote()) {
                    return +1;
                } else {
                    return -1;
                }
            }
            
        });
        
        movies.add(new MovieInterface() {

            @Override
            public String getTitle() {
                return "The Insurrection";
            }

            @Override
            public Integer getYear() {
                return 2014;
            }

            @Override
            public List<String> getGenres() {
                return Arrays.asList(new String[] { "Action" });
            }

            @Override
            public String getDirector() {
                return "Rene Perez";
            }

            @Override
            public String getDescription() {
                return "Breaking the norms of a Uptopia to find true freedom";
            }

            @Override
            public Float getAvgVote() {
                return 2.9f;
            }

            @Override
            public int compareTo(MovieInterface otherMovie) {
                if (this.getTitle().equals(otherMovie.getTitle())) {
                    return 0;
                    // sort by rating
                } else if (this.getAvgVote() < otherMovie.getAvgVote()) {
                    return +1;
                } else {
                    return -1;
                }
            }
            
        });
        
        
        movies.add(new MovieInterface() {

            @Override
            public String getTitle() {
                return "Valley Girl";
            }

            @Override
            public Integer getYear() {
                return 2017;
            }

            @Override
            public List<String> getGenres() {
                return Arrays.asList(new String[] { "Comedy"});
            }

            @Override
            public String getDirector() {
                return "Rachel Lee Goldenberg";
            }

            @Override
            public String getDescription() {
                return "Breaking the rules of a futuristic world whereonly one child is allowed per family";
            }

            @Override
            public Float getAvgVote() {
                return 5.4f;
            }

            @Override
            public int compareTo(MovieInterface otherMovie) {
                if (this.getTitle().equals(otherMovie.getTitle())) {
                    return 0;
                    // sort by rating
                } else if (this.getAvgVote() < otherMovie.getAvgVote()) {
                    return +1;
                } else {
                    return -1;
                }
            }
            
        });
        
        
        
       
        // TODO: Fixme! Add two more example movies to the list before returning it (could be
        //       ficticious ones).
        
        
        return movies;
    }
   
}


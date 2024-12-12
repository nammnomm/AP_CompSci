package pkg;

public class Movie{
    String movieName; 
    double rating;
    int numRatings;
    int revenue; 
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0; 
        numRatings = 33;
        revenue = 623357910; 
    }
    
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b; 
        numRatings = c;
        revenue = d; 
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println(""); 
    }
    public String getMovieName(){
        return movieName; 
    }
    public int getRevenue(){
        return revenue; 
    }
    public double getRating(){
        return rating; 
    }
    public void addRating(double addedRating){
        rating = ((rating*numRatings) + addedRating) / (numRatings + 1); 
        numRatings++; 
    }
    
    public boolean compareRatings(Movie a) {
        Movie b = new Movie();
        double x = a.getRating();
        double y = b.getRating();
        
        if(y>x){
            return true;
        }
        else {
            return false; 
        }
    }
}


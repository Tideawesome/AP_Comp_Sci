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
    
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public double addRating(double addr){
        rating = (rating*numRatings+addr)/(numRatings+1);
        numRatings++;
        return rating;
    }
    
    public boolean compareRatings(Movie m){
        if(m.getRating()>rating){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.print("\n");
    }
    
    public String revenueToString(){
        
        int f = revenue/1000000;
        int notRevenue = revenue-f*1000000;
        int s = notRevenue/1000;
        notRevenue = notRevenue-s*1000;
        return f + "," + s + "," + notRevenue;
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
}

ublic class Newsfeed{

 String[] trendingArticles;
 int[] views;
 double[] ratings;
 public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
  trendinArticles=initialArticles;
  views=initialViews;
  ratings=initialRatings;

 }
 public String getTopArticle(){
  return trendingArticles[0];

 }
 public void viewArticle(int articleNumber){
 views[articleNumber]=views[ArticleNumber]+1;
 System.out.println("The article"+ trendingArticles[ArticleNumber]+"has now been viewed"+ views[ArticleNumber]+"times!" );

 }

 public void changeRating(int articleNumber, double newRating){
 if(newRating>5|| newRating<0){

  System.out.println("The rating must be between 0 and 5 stars!");
  }else{
   ratings[articleNumber]=newRating;
   System.out.println("The article"+trendingArticles[articleNumber]+"is now rated"+"stars!");

   }
 }

 public static void main(String[] args){

  String[] robotArticles={"Oil News","Innovate Motors","Humans:Examinate or Not?","Organic Eye Implants","Path finding in an Unknown World"};
  int[] robotViewers={87,32,13,11,7};
  double[] robotRatings={2.5, 3.2,5.0,1.7,4.3};
  Newsfeed robotTimes= new Newsfeed(robotArticles, robotViewers,robotRatings);
  robotTimes.viewArticle(2);
  robotTimes.viewArticle(2);
  System.out.println("The top article is"+ robotTImes.getTopArticle());
  robotTimes.changeRating();  

 }
}
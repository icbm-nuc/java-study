package class1;

public class MovieReviewMain{
    public static void main(String[] args) {

        MovieReview inception = new MovieReview();
        MovieReview aboutTime = new MovieReview();
        MovieReview[] movieReviews = new MovieReview[]{inception,aboutTime};

        movieReviews[0].title = "인셉션";
        movieReviews[0].review = "인생은 무한루프";
        movieReviews[1].title = "어바웃타임";
        movieReviews[1].review = "인생 시간 영화!";

        for (MovieReview m : movieReviews) {
            System.out.println("영화제목 : " + m.title + " 리뷰 : "+ m.review);
        }

    }
}

package shashwat.com.task4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String movie_name;
    String director_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent i = getIntent();
        movie_name= i.getStringExtra("movie name");
        director_name= i.getStringExtra("director name");

        TextView tv_movie_name = (TextView ) findViewById(R.id.text_movie_name);
        TextView tv_director_name = (TextView ) findViewById(R.id.text_director_name);

        tv_movie_name.setText(movie_name.toString());
        tv_director_name.setText(director_name.toString());


    }

}

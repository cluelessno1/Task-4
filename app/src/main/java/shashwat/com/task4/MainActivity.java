package shashwat.com.task4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        CharSequence text = "Application Started";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();}




    public void StartingSecondActivity(View v){

        EditText et_movie_name = (EditText) findViewById(R.id.plain_text_input_1);
        EditText et_director_name = (EditText) findViewById(R.id.plain_text_input_2);
        String movie_name = et_movie_name.getText().toString();
        String director_name = et_director_name.getText().toString();

        Intent i=new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("movie name", movie_name);
        i.putExtra("director name", director_name);
        startActivity(i);

    }

}

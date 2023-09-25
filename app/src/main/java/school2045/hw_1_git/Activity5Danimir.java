package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity5Danimir extends AppCompatActivity {
    private String name;
    private int score; //для записи очков

    MediaPlayer B1;
    MediaPlayer B2;
    MediaPlayer B3;
    MediaPlayer B4;
    EditText number;

    String otvet = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_danimir);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");
        B1 = MediaPlayer.create(this, R.raw.dn);
        B2 = MediaPlayer.create(this, R.raw.fa);
        B3 = MediaPlayer.create(this, R.raw.mi);
        B4 = MediaPlayer.create(this, R.raw.si);
        number = findViewById(R.id.Number);
    }
    public void sound1(View view){
        B1.start();
    }
    public void sound2(View view){
        B2.start();
    }
    public void sound3(View view){
        B3.start();
    }
    public void sound4(View view){
        B4.start();
    }
    public void check (View view) {
        //метод требует доработки согласно заданию
        if(number.getText().toString() == otvet){
            score+=1;
        }
        Intent intent = new Intent(Activity5Danimir.this, Activity6Marina.class);
        intent.putExtra("name", name);
        intent.putExtra("points", score);
        startActivity(intent);
    }
}
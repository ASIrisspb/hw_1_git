package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Activity4Dima extends AppCompatActivity {
    private String name;
    private int score; //для записи очков
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4_dima);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
    }

    public void check (View view) {
        //метод требует доработки согласно заданию
        if (checkBox.isChecked() && checkBox3.isChecked()  && !(checkBox2.isChecked())  && !(checkBox4.isChecked())) score+=1;
        Intent intent = new Intent(Activity4Dima.this, Activity5Danimir.class);
        intent.putExtra("name", name);
        intent.putExtra("points", score);
        startActivity(intent);
    }
}
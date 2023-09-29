package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2Varya extends AppCompatActivity {
    private String name;
    private int score; //для записи очков
Button check;
TextView question;
EditText otvet;
String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_varya);
        check = findViewById(R.id.check);
        question = findViewById(R.id.question);
        otvet = findViewById(R.id.otvet);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");
    }

    public void check (View view) {
        //метод требует доработки согласно заданию
answer = otvet.getText().toString();
     if (answer.contains("да")){
         score += 1;
     }
        Intent intent = new Intent(Activity2Varya.this, Activity3Artem.class);
        intent.putExtra("name", name);
        intent.putExtra("points", score);
        startActivity(intent);
    }
}
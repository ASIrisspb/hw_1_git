package school2045.hw_1_git;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity6Marina extends AppCompatActivity {

    private String name;
    private int score; //для записи очков
    private final int[] logos = {R.drawable.tesla, R.drawable.netflix, R.drawable.amazon,
            R.drawable.whatsapp, R.drawable.land_rover, R.drawable.meta};
    private int countClick = -1;

    private ImageView imgView; // объект, на котором будут сменятся картинки
    private EditText editTextAnswer;
    private Button buttonNext, buttonCheck; // кнопки для "перелистывания" img и перехода на след экр
    private TextView textViewQuestion, textViewHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity6_marina);
        name = getIntent().getExtras().getString("name");
        score = getIntent().getExtras().getInt("points");

        imgView = findViewById(R.id.imageViewLogos);
        editTextAnswer = findViewById(R.id.EditTextScreen6);
        buttonNext = findViewById(R.id.buttonNextScreen6);
        buttonCheck = findViewById(R.id.buttonCheckScreen6);
        textViewQuestion = findViewById(R.id.textViewQuestionScreen6);
        textViewHint = findViewById(R.id.textViewHint);
        // замена картинки на ее уменшенную версию
        imgView.setImageBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                R.drawable.apple), 500, 500, false));

    }

    public void check (View view) {
        //метод требует доработки согласно заданию
        if (editTextAnswer.getText().toString().equals("134")) {
            score++;
        }
        Intent intent = new Intent(Activity6Marina.this, ActivityFinal.class);
        intent.putExtra("name", name);
        intent.putExtra("points", score);
        startActivity(intent);
    }

    public void onClickNext(View view) {
        /** меод, реализующий переход от одной фотографии к другой */
        countClick++;
        if (countClick == 5) { // если юзер посмотрел последнюю картинку
            imgView.setImageBitmap(null);
            imgView.setVisibility(View.GONE);
            buttonNext.setVisibility(View.GONE);
            editTextAnswer.setVisibility(View.VISIBLE);
            textViewQuestion.setVisibility(View.VISIBLE);
            buttonCheck.setVisibility(View.VISIBLE);
            textViewHint.setVisibility(View.VISIBLE);
        } else { // создание уменьшенной картинки логотипа
            Bitmap bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(),
                    logos[countClick]), 500, 500, false);
            imgView.setImageBitmap(bitmap);
        }
    }
}
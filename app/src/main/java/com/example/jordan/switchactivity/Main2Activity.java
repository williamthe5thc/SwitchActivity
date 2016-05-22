package com.example.jordan.switchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        //String message = intent.getStringExtra("book");
        Bundle bundle = intent.getExtras();

        String bookString = bundle.getString("book");
        TextView bookView = (TextView) findViewById(R.id.bookId);
        bookView.setText(bookString);


        String chapterString = bundle.getString("chapter");
        TextView chapterView = (TextView) findViewById(R.id.chapterId);
        chapterView.setText(chapterString);

        String verseString = bundle.getString("verse");
        TextView verseView = (TextView) findViewById(R.id.verseId);
        verseView.setText(verseString);

    }
}

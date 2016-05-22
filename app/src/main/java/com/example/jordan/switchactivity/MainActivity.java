package com.example.jordan.switchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareButtonOnClick(View v) {
        //do something
        EditText chapter = (EditText) findViewById(R.id.chapterId);
        EditText book = (EditText) findViewById(R.id.bookId);
        EditText verse = (EditText) findViewById(R.id.verseId);

        String chapterString = chapter.getText().toString();
        String bookString = book.getText().toString();
        String verseString = verse.getText().toString();

        Bundle bundle = new Bundle();

        bundle.putString("chapter", chapterString);
        bundle.putString("book", bookString);
        bundle.putString("verse", verseString);

        Button shareButton = (Button) v;

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtras(bundle);
        startActivity(i);

    }
}

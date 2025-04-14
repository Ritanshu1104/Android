package com.example.slip30;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewBooks;
    private List<Book> bookList;
    private BookAdapter bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewBooks = findViewById(R.id.listViewBooks);

        // Sample Data
        bookList = new ArrayList<>();
        bookList.add(new Book("The Alchemist", "Paulo Coelho"));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book("1984", "George Orwell"));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book("Moby Dick", "Herman Melville"));
        bookList.add(new Book("War and Peace", "Leo Tolstoy"));

        // Set Adapter
        bookAdapter = new BookAdapter(this, bookList);
        listViewBooks.setAdapter(bookAdapter);
    }
}

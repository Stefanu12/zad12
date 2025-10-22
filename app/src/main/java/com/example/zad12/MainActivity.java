package com.example.zad12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView usersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Znajdź RecyclerView w layoucie
        usersRecyclerView = findViewById(R.id.usersRecyclerView);

        // 2. Przygotuj źródło danych
        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski"));
        users.add(new User("Anna", "Nowak"));
        users.add(new User("Piotr", "Zieliński"));



        // ... dodaj więcej użytkowników

        // 3. Stwórz Adapter i przekaż mu dane
        UserAdapter adapter = new UserAdapter(users);

        // 4. Ustaw Adapter i LayoutManager dla RecyclerView
        usersRecyclerView.setAdapter(adapter);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
package com.example.zad12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

        usersRecyclerView = findViewById(R.id.usersRecyclerView);

        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski", R.drawable.avatar1));
        users.add(new User("Anna", "Nowak", R.drawable.avatar2));
        users.add(new User("Piotr", "Zieliński", R.drawable.avatar3));

        UserAdapter adapter = new UserAdapter(users);
        usersRecyclerView.setAdapter(adapter);
        usersRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}

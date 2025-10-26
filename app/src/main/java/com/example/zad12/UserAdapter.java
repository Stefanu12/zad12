package com.example.zad12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = userList.get(position);
        holder.firstNameText.setText(currentUser.getFirstName());
        holder.lastNameText.setText(currentUser.getLastName());
        holder.avatarImage.setImageResource(currentUser.getAvatarId());

        holder.itemView.setOnClickListener(v -> {
            Context context = v.getContext();
            String message = currentUser.getFirstName() + " " + currentUser.getLastName();
            Toast.makeText(context, "Kliknięto: " + message, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public TextView firstNameText, lastNameText;
        public ImageView avatarImage;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            firstNameText = itemView.findViewById(R.id.firstNameText);
            lastNameText = itemView.findViewById(R.id.lastNameText);
            avatarImage = itemView.findViewById(R.id.avatarImage);
        }
    }
}

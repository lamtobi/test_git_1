package com.example.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Userviewhoder>{
    @NonNull
    @Override
    public Userviewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Userviewhoder holder, int position) {

    }

    @Override
    public int getItemCount() {

        String test="đây là dữ liệu mới cập nhật";
        return 0;
    }

    public  class Userviewhoder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView txt;
        public Userviewhoder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            txt=itemView.findViewById(R.id.txt);
        }

    }
}

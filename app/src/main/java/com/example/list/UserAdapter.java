package com.example.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Userviewhoder>{
    private Context context;
    private List<User> users;

    public UserAdapter(Context context) {
        this.context = context;
    }
    public  void  setdata(List<User> list){
        this.users=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Userviewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Userviewhoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Userviewhoder holder, int position) {
User user=users.get(position);
if(user==null){
    return;
}else{
    holder.img.setImageResource(user.getSrc());
    holder.txt.setText(user.text);
}
    }

    @Override
    public int getItemCount() {

        if(users!=null){
            return users.size();
        }
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

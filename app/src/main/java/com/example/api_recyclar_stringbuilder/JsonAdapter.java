package com.example.api_recyclar_stringbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class JsonAdapter extends RecyclerView.Adapter<JsonAdapter.JsonHolder> {
    Context  context;
    List<JsonModel>jsonModelList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public JsonAdapter(Context context, List<JsonModel> jsonModelList) {
        this.context = context;
        this.jsonModelList = jsonModelList;
        layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public JsonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return new JsonHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull JsonHolder holder, int position) {
        holder.ID.setText(""+jsonModelList.get(position).getId());
        holder.Name.setText(""+jsonModelList.get(position).getName());
        holder.Mobile.setText(""+jsonModelList.get(position).getMobile());
        holder.DateInfo.setText(""+jsonModelList.get(position).getDateinfo());
        holder.Password.setText(""+jsonModelList.get(position).getPassword());
        holder.Email.setText(""+jsonModelList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return jsonModelList.size();
    }

    public class JsonHolder extends RecyclerView.ViewHolder {
        TextView ID,Name,Mobile,DateInfo,Password,Email;
        public JsonHolder(@NonNull View itemView) {
            super(itemView);
            ID=itemView.findViewById(R.id.Id);
            Name=itemView.findViewById(R.id.Name);
            Mobile=itemView.findViewById(R.id.Mobile);
            DateInfo=itemView.findViewById(R.id.DateInfo);
            Password=itemView.findViewById(R.id.Password);
            Email=itemView.findViewById(R.id.Email);
        }
    }
}

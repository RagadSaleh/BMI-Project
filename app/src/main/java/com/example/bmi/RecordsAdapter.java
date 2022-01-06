package com.example.bmi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.ViewHolder> {
    private ArrayList<Record> records = new ArrayList<Record>();

    public RecordsAdapter(ArrayList<Record> records) {
        this.records = records;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDate;
        TextView tvWeight;
        TextView tvStatus;
        TextView tvLength;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.oldstatus_date);
            tvWeight = itemView.findViewById(R.id.oldstatus_weight);
            tvStatus = itemView.findViewById(R.id.oldstatus_status);
            tvLength = itemView.findViewById(R.id.oldstatus_length);
        }
    }

    public RecordsAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bmi_customitem, null, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Record record = records.get(position);
        holder.tvDate.setText(record.getDate());
        holder.tvWeight.setText(Double.toString(record.getWeight()));
        holder.tvStatus.setText(record.getStatus());
        holder.tvLength.setText(record.getLength());

    }

    @Override
    public int getItemCount() {
        return records.size();

    }
}

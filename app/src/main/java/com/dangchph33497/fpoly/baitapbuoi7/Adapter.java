package com.dangchph33497.fpoly.baitapbuoi7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final Context context;
    private ArrayList<DTO> list;

    public Adapter(Context context, ArrayList<DTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTenXe,tvGiaXe,tvLoaiXe;
        ImageView ivAnhXe;
        ImageButton btnXoa,btnSua;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenXe = itemView.findViewById(R.id.tvTenXe);
            tvGiaXe = itemView.findViewById(R.id.tvGiaXe);
            tvLoaiXe = itemView.findViewById(R.id.tvLoaiXe);
            ivAnhXe = itemView.findViewById(R.id.ivAnhXe);
            btnSua = itemView.findViewById(R.id.btnSua);
            btnXoa = itemView.findViewById(R.id.btnXoa);
        }
    }
}

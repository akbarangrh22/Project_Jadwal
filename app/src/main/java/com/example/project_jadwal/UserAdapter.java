package com.example.project_jadwal;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_jadwal.User;
import com.example.project_jadwal.UserAdapter;

import java.util.List;

    public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
        private Context context;
        private List<User> list;
        private Dialog dialog;

        public interface Dialog{
            void onClick(int pos);
        }
        public void setDialog(Dialog dialog) {
            this.dialog = dialog;
        }

        public UserAdapter(Context context, List<User> list) {
            this.context = context;
            this.list = list;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_daftar, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.tvNama.setText(list.get(position).getNama());
            holder.tvPassword.setText(list.get(position).getPassword());
            holder.tvWaktuSholat.setText(list.get(position).getWaktusholat());
            holder.tvSubuh.setText(list.get(position).getSubuh());
            holder.tvDzuhur.setText(list.get(position).getDzuhur());
            holder.tvAshar.setText(list.get(position).getAshar());
            holder.tvMaghrib.setText(list.get(position).getMaghrib());
            holder.tvIsya.setText(list.get(position).getIsya());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tvNama, tvPassword, tvWaktuSholat, tvSubuh, tvDzuhur, tvAshar, tvMaghrib, tvIsya;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                tvNama   = itemView.findViewById(R.id.Nama);
                tvPassword  = itemView.findViewById(R.id.Password);
                tvWaktuSholat = itemView.findViewById(R.id.tvRLokasi);
                tvSubuh= itemView.findViewById(R.id.tvLShubuh);
                tvDzuhur = itemView.findViewById(R.id.tvLDzuhur);
                tvAshar = itemView.findViewById(R.id.tvLAshar);
                tvMaghrib = itemView.findViewById(R.id.tvLMagrib);
                tvIsya = itemView.findViewById(R.id.tvLIsya);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (dialog != null) {
                            dialog.onClick(getLayoutPosition());
                        }
                    }
                });

            }
        }
    }


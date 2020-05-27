package com.example.dialogfragmentreyclerviewv3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RechargeChecxBoxAdapter extends RecyclerView.Adapter<RechargeChecxBoxAdapter.RechargeChecxBoxViewHolder> {
    private List<RechargeCheckBox> mData;
    private Context mContext;

    public RechargeChecxBoxAdapter(List<RechargeCheckBox> mDara, Context mContext) {
        this.mData = mDara;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RechargeChecxBoxViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_view, parent, false);
        RechargeChecxBoxViewHolder rechargeChecxBoxViewHolder = new RechargeChecxBoxViewHolder(view);
        return rechargeChecxBoxViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RechargeChecxBoxViewHolder holder, int position) {
        holder.name.setText(mData.get(position).getName());
        holder.bankNum.setText(mData.get(position).getBankNum());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class RechargeChecxBoxViewHolder extends RecyclerView.ViewHolder{
        private TextView name,bankNum;

        public RechargeChecxBoxViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txt_bank_name);
            bankNum = itemView.findViewById(R.id.txt_bank_num);
        }
    }
}

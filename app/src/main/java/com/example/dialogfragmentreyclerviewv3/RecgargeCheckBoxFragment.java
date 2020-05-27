package com.example.dialogfragmentreyclerviewv3;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecgargeCheckBoxFragment extends DialogFragment {
    private RecyclerView recyclerView;
    private View view;
    private List<RechargeCheckBox> rechargeCheckBoxList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.view, container);
        recyclerView = view.findViewById(R.id.recycle_view);
        RechargeChecxBoxAdapter rechargeChecxBoxAdapter = new RechargeChecxBoxAdapter(rechargeCheckBoxList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(rechargeChecxBoxAdapter);

        getDialog().setTitle("哈摟~");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rechargeCheckBoxList = new ArrayList<>();
        rechargeCheckBoxList.add(new RechargeCheckBox("中国银行储蓄卡", "3827"));
        rechargeCheckBoxList.add(new RechargeCheckBox("招商银行储蓄卡", "1200"));
        rechargeCheckBoxList.add(new RechargeCheckBox("建设银行储蓄卡", "1801"));
        rechargeCheckBoxList.add(new RechargeCheckBox("建设银行储蓄卡", "1801"));
        rechargeCheckBoxList.add(new RechargeCheckBox("建设银行储蓄卡", "1801"));

    }
}

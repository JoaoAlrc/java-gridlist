package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

public class ProdutoAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<String> dados;

    public ProdutoAdapter(Context mContext, List<String> dados) {
        this.mContext = mContext;
        this.dados = dados;
    }


    // 2
    @Override
    public int getCount() {
        return dados.size();
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText("asdfasdfasdf");
        return dummyTextView;
    }
}

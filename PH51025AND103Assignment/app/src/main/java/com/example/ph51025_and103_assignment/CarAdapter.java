package com.example.ph51025_and103_assignment;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CarAdapter extends BaseAdapter {

    List<CarModel> carModelList;

    Context context;
    public CarAdapter(Context context, List<CarModel> carModelList){
        this.carModelList= carModelList;
        this.context= context;
    }

    @Override
    public int getCount() {
        return carModelList.size();
    }

    @Override
    public Object getItem(int i) {
        return carModelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_car, viewGroup, false);

        TextView tvID = (TextView) rowView.findViewById(R.id.tvId);
        ImageView imgAvatar = (ImageView) rowView.findViewById(R.id.imgAvatatr);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);

        TextView tvNamSX = (TextView) rowView.findViewById(R.id.tvNamSX);

        TextView tvHang = (TextView) rowView.findViewById(R.id.tvHang);

        TextView tvGia = (TextView) rowView.findViewById(R.id.tvGia);

        tvName.setText(String.valueOf(carModelList.get(i).getTen()));

        tvNamSX.setText(String.valueOf(carModelList.get(i).getNamSX()));

        tvHang.setText(String.valueOf(carModelList.get(i).getHang()));

        tvGia.setText(String.valueOf(carModelList.get(i).getGia()));

        return rowView;
    }
}

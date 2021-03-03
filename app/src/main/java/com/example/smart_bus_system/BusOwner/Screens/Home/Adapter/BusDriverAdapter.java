package com.example.smart_bus_system.BusOwner.Screens.Home.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smart_bus_system.BusOwner.Screens.Home.Model.Driver_Time_Model;
import com.example.smart_bus_system.R;
import com.example.smart_bus_system.User.Screens.AvailableBuses.Adapter.BusInfoAdpater;
import com.example.smart_bus_system.User.Screens.AvailableBuses.Model.Bus_info_model;

import java.util.List;

public class BusDriverAdapter extends RecyclerView.Adapter<BusDriverAdapter.MyViewHolder>{


    private Context context;
    private List<Driver_Time_Model> time_modelList;

    public BusDriverAdapter(Context context, List<Driver_Time_Model> time_modelList) {
        this.context = context;
        this.time_modelList = time_modelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate( R.layout.bus_time_row,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return time_modelList.size();
    }


    public  class MyViewHolder extends RecyclerView.ViewHolder {


        TextView bus_name;
        TextView bus_no;
        TextView bus_condtions;
        TextView start_time;
        TextView bus_contact_number;
        TextView bus_avb_seats;
        TextView end_time;
        ImageView post_image;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

//            bus_name=itemView.findViewById(R.id.bus_name);
//            bus_no=itemView.findViewById(R.id.bus_no);
//            bus_condtions=itemView.findViewById(R.id.bus_condtions);
//            start_time=itemView.findViewById(R.id.start_time);
//            bus_contact_number=itemView.findViewById(R.id.bus_contact_number);
//            bus_avb_seats=itemView.findViewById(R.id.bus_avb_seats);
//            end_time=itemView.findViewById(R.id.end_time);
//            post_image=itemView.findViewById(R.id.post_image);


        }
    }
}

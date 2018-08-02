package com.mine.milkyway.spacexnow.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class Missions_RecyclerView_ItemAdapter extends RecyclerView.Adapter<Missions_RecyclerView_ItemAdapter.Missions_RecyclerView_ItemViewHolder> {

    private Context mContext;
    private List<Missions_RecyclerView_Item> MissionsItemList;

    public Missions_RecyclerView_ItemAdapter(Context mContext, List<Missions_RecyclerView_Item> missionsItemList) {
        this.mContext = mContext;
        MissionsItemList = missionsItemList;
    }

    @NonNull
    @Override
    public Missions_RecyclerView_ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.missions_list_item_template,parent,false);
        //View   view = inflater.inflate(R.layout.missions_list_item_template,null  );
        return new Missions_RecyclerView_ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Missions_RecyclerView_ItemViewHolder holder, int position) {
        Missions_RecyclerView_Item missions_recyclerView_item = MissionsItemList.get(position);

        holder.missionsTitle.setText(missions_recyclerView_item.getTitle());
        holder.missionsClientCompanyName.setText(missions_recyclerView_item.getClient_copany_name());
        holder.missionsLaunchComplex.setText(missions_recyclerView_item.getLaunch_complex());
        holder.missionsLaunchTime.setText(missions_recyclerView_item.getLaunch_time());
        holder.missions_time_to_launch.setText(missions_recyclerView_item.getTime_remaining());

        holder.missionImage.setImageDrawable(mContext.getResources().getDrawable(missions_recyclerView_item.getImage()));
    }

    @Override
    public int getItemCount() {
        return MissionsItemList.size();
    }

    class Missions_RecyclerView_ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView missionImage;
        TextView  missionsTitle;
        TextView  missionsClientCompanyName;
        TextView  missionsLaunchComplex;
        TextView  missionsLaunchTime;
        TextView  missions_time_to_launch;

        public Missions_RecyclerView_ItemViewHolder(View itemView) {
            super(itemView);
            missionImage  =(ImageView) itemView.findViewById(R.id.missions_item_imageview);
            missionsTitle =(TextView) itemView.findViewById(R.id.missions_item_title);
            missionsClientCompanyName =  (TextView) itemView.findViewById(R.id.missions_client_company_name);
            missionsLaunchComplex  = (TextView) itemView.findViewById(R.id.missions_launch_complex);
            missionsLaunchTime = (TextView) itemView.findViewById(R.id.missions_launch_time);
            missions_time_to_launch = (TextView) itemView.findViewById(R.id.missions_time_to_launch);


        }
    }
}

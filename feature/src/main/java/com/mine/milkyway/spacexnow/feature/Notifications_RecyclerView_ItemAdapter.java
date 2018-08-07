package com.mine.milkyway.spacexnow.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Notifications_RecyclerView_ItemAdapter extends RecyclerView.Adapter<Notifications_RecyclerView_ItemAdapter.Notification_RecyclerView_ItemViewHolder> {
private Context mcontext;
private List<Notifications_RecyclerView_Item> NotificationsItemList;

    public Notifications_RecyclerView_ItemAdapter(Context mcontext, List<Notifications_RecyclerView_Item> notificationsItemList) {
        this.mcontext = mcontext;
        NotificationsItemList = notificationsItemList;
    }

    @NonNull
    @Override
    public Notification_RecyclerView_ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notifications_list_item_template,parent, false);

        return  new Notification_RecyclerView_ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Notification_RecyclerView_ItemViewHolder holder, int position) {

        Notifications_RecyclerView_Item notifications_recyclerView_item = NotificationsItemList.get(position);

        holder.NotificationsImage.setImageDrawable(mcontext.getResources().getDrawable(notifications_recyclerView_item.getImage()));
        holder.NotificationsDescription.setText(notifications_recyclerView_item.getDescription());
        holder.NotificationsDateTime.setText(notifications_recyclerView_item.getDate());
    }

    @Override
    public int getItemCount() {
        return NotificationsItemList.size();
    }

    public class Notification_RecyclerView_ItemViewHolder extends  RecyclerView.ViewHolder {

        ImageView NotificationsImage;
        TextView  NotificationsDescription;
        TextView  NotificationsDateTime;


        public Notification_RecyclerView_ItemViewHolder(View itemView) {
            super(itemView);

            NotificationsImage = (ImageView) itemView.findViewById(R.id.notifications_imageview);
            NotificationsDescription = (TextView) itemView.findViewById(R.id.notifications_description);
            NotificationsDateTime = (TextView) itemView.findViewById(R.id.notifications_datetime);
        }
    }
}

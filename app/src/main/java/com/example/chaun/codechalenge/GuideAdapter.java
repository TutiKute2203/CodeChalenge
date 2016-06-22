package com.example.chaun.codechalenge;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by chau.n on 22/06/2016.
 */
public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.GuideObjectViewHolder> {

    private List<GuideObject> guideObjectList;
    private Context context;

    public class GuideObjectViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTV, cityTV, stateTV, endDateTV;
        public ImageView avatarImageView;

        public GuideObjectViewHolder(View view) {
            super(view);
            nameTV = (TextView) view.findViewById(R.id.name_tv);
            cityTV = (TextView) view.findViewById(R.id.city_tv);
            stateTV = (TextView) view.findViewById(R.id.state_tv);
            endDateTV = (TextView) view.findViewById(R.id.end_date_tv);
            avatarImageView = (ImageView) view.findViewById(R.id.avatar_iv);
        }
    }

    public GuideAdapter(List<GuideObject> guideObjectList, Context context) {
        this.guideObjectList = guideObjectList;
        this.context = context;
    }

    @Override
    public GuideAdapter.GuideObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.guide_list_row, parent, false);

        return new GuideObjectViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GuideAdapter.GuideObjectViewHolder holder, int position) {
        GuideObject guideObject = guideObjectList.get(position);
        holder.nameTV.setText("Name: " + guideObject.getName());
        if (guideObject.getVanue().getCity() != null) {
            holder.cityTV.setText("City: " + guideObject.getVanue().getCity());
        }
        if (guideObject.getVanue().getState() != null) {
            holder.stateTV.setText("State: " + guideObject.getVanue().getState());
        }
        holder.endDateTV.setText("End date: " + guideObject.getStartDate());
        Picasso.with(context).load(guideObject.getUrlIcon()).into(holder.avatarImageView);
    }

    @Override
    public int getItemCount() {
        return guideObjectList.size();
    }
}

package com.example.men3m.test;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileAdapter.MobileHolder> {
    private List<Mobilemodel> mobileList;
    private Context context;



    public MobileAdapter(List<Mobilemodel> mobileList, Context context) {
        this.mobileList = mobileList;
        this.context = context;
    }

    @NonNull
    @Override
    public MobileAdapter.MobileHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View row = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowdesign,viewGroup,false);
        MobileHolder holder = new MobileHolder(row);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MobileAdapter.MobileHolder mobileHolder, int i) {
        final Mobilemodel mobilemodel=mobileList.get(i);
        mobileHolder.mobilename.setText(mobilemodel.getMobilename());
        mobileHolder.mobiledes.setText(mobilemodel.getMobiledes());
        mobileHolder.mobileimag.setImageResource(mobilemodel.getMobileImg());
        mobileHolder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Main2Activity.class);
                intent.putExtra("name",mobilemodel.getMobilename());
                intent.putExtra("des",mobilemodel.getMobiledes());
                intent.putExtra("img",mobilemodel.getMobileImg());
                context.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mobileList.size();
    }

    public class MobileHolder extends RecyclerView.ViewHolder {
        TextView mobilename,mobiledes;
        ImageView mobileimag;
        ConstraintLayout constraintLayout;

        public MobileHolder(View itemView) {
            super(itemView);
            mobilename=itemView.findViewById(R.id.mobilename);
            mobiledes=itemView.findViewById(R.id.mobiledes);
            mobileimag=itemView.findViewById(R.id.mobielimage);
            constraintLayout=itemView.findViewById(R.id.row);



        }
    }
}

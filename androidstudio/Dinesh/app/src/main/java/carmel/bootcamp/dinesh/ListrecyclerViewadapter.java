package carmel.bootcamp.dinesh;

import android.content.Context;
import android.media.AudioTrack;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ListrecyclerViewadapter extends RecyclerView.Adapter {

    private String[] texts1,texts2;
    private Context context;

    public ListrecyclerViewadapter(Context context, String[] text1, String[] text2) {
        this.context=context;
        this.texts1=text1;
        this.texts2=text2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view= LayoutInflater.from(context).inflate(R.layout.recylerviewlist,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder=(MyViewHolder) holder;
        myViewHolder.setUpData(String.valueOf(texts1[position]),String.valueOf(texts2[position]));
    }

    @Override
    public int getItemCount() {
        return texts1.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView text1,text2;
        public ImageView ivDelete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text1=itemView.findViewById(R.id.tvText1);
            text2=itemView.findViewById(R.id.tvText2);
            ivDelete=itemView.findViewById(R.id.ivDeleteImage);
        }


        public void setUpData(final String texts1, final String texts2) {
            text1.setText(texts1);
            text2.setText(texts2);
            ivDelete.setImageResource(R.drawable.deleteicon);

            ivDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    deleteItem(getAdapterPosition());


                }
            });
        }
        void deleteItem(int index) {
            text1.endBatchEdit();
            notifyItemRemoved(index);
        }
//        public void remove(int position) {
//            text1.remove(position);
//            notifyItemRemoved(position);
//            notifyItemRangeChanged(position, text1.size());
        }

    }


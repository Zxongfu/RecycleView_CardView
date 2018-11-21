package com.fu.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContext;

    // Store a member variable for the Persons
    private List<Person> mPersonList;


    // Provide a suitable constructor (depends on the kind of dataset)
    // Pass in the person array into the constructor
    public MyAdapter(Context context, List<Person> personList) {
        mContext = context;
        mPersonList = personList;
    }


    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflate the custom layout
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Person person = mPersonList.get(position);
        holder.txtName.setText(person.getName());
    }

    @Override
    public int getItemCount() {
        if (mPersonList == null) {
            return 0;
        } else {
            return mPersonList.size();
        }
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView txtName;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }


    }
}

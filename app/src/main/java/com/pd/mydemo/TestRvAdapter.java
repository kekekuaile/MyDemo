package com.pd.mydemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TestRvAdapter extends RecyclerView.Adapter<TestRvAdapter.TestViewHolder> {

    private Context context;
    private String type;

    public TestRvAdapter(Context context) {
        this.context = context;
    }

    public TestRvAdapter(Context context, String type) {
        this.context = context;
        this.type = type;
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tv_test, parent, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, int position) {
        holder.tv_test.setText("测试数据" + position);
    }

    @Override
    public int getItemCount() {
//        if ("1".equals(type) || "3".equals(type)) {
//            return 10;
//
//        } else {
//            return 100;
//        }
return 10;
    }

    class TestViewHolder extends RecyclerView.ViewHolder {
        TextView tv_test;

        TestViewHolder(View itemView) {
            super(itemView);
            tv_test = (TextView) itemView.findViewById(R.id.tv_test);
        }
    }
}


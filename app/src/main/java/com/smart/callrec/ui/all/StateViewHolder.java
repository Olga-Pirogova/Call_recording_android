package com.smart.callrec.ui.all;


import android.content.Context;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import com.smart.callrec.R;
import com.smart.callrec.recycle.viewholder.BaseViewHolder;
import com.smart.callrec.util.StringUtils;

public class StateViewHolder extends BaseViewHolder<Object> {
    public static final int LAYOUT_ID = R.layout.item_header;

    @BindView(R.id.txtDate)
    TextView txtDate;

    public StateViewHolder(View itemView) {
        super(itemView);
    }

    public StateViewHolder(View itemView, Context context) {
        super(itemView, context);
    }

    public void fillData(TextViewItem item, int position) {
        super.fillData(item, position);
        StringUtils.setText(item.getHeader(), txtDate);
    }
}

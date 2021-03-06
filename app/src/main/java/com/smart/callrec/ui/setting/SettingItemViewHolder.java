package com.smart.callrec.ui.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import com.smart.callrec.R;
import com.smart.callrec.entity.DrawerBean;
import com.smart.callrec.recycle.viewholder.BaseViewHolder;
import com.smart.callrec.util.ImageUtil;
import com.smart.callrec.util.StringUtils;

/**
 * Created by Harry_Hai on 2/14/2018.
 */

public class SettingItemViewHolder extends BaseViewHolder<DrawerBean> {
    public static final int LAYOUT_ID = R.layout.item_setting;
    @BindView(R.id.txtTitle)
    TextView tvTitle;
    @BindView(R.id.ivSetting)
    ImageView imgIcon;

    public SettingItemViewHolder(View itemView) {
        super(itemView);
    }

    public void fillData(DrawerBean item, int position) {
        super.fillData(item, position);
        ImageUtil.setImageView(itemView.getContext(), item.getResId(), imgIcon);
        StringUtils.setText(item.getTitle(), tvTitle);
    }
}

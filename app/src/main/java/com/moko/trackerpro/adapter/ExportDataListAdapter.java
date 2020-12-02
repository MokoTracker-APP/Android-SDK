package com.moko.trackerpro.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.moko.trackerpro.R;
import com.moko.support.entity.ExportData;

public class ExportDataListAdapter extends BaseQuickAdapter<ExportData, BaseViewHolder> {
    private int isSavedRawData;

    public ExportDataListAdapter() {
        super(R.layout.item_export_data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ExportData item) {
        final String rssi = String.format("%ddBm", item.rssi);
        helper.setText(R.id.tv_rssi, rssi);
        helper.setText(R.id.tv_time, item.time);
        helper.setText(R.id.tv_mac, item.mac);
        helper.setGone(R.id.ll_raw_data, isSavedRawData == 1);
        helper.setText(R.id.tv_raw_data, item.rawData);
    }

    public void setSavedRawData(int isSavedRawData) {
        this.isSavedRawData = isSavedRawData;
    }
}

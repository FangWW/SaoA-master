/*
 * mail:1065680448@qq.com
 */
package com.github.obsessive.simplifyreader.ui.fragment;

import android.view.View;
import android.widget.Button;

import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.simplifyreader.R;
import com.github.obsessive.simplifyreader.ui.activity.base.BaseFragment;
import com.github.obsessive.simplifyreader.ui.activity.qrcode.CaptureActivity;

import butterknife.InjectView;

/**
 * @Duthor FangJW
 * @Date 16/1/6
 */
public class QrcodeFragment extends BaseFragment implements View.OnClickListener {


    @InjectView(R.id.btn_scan)
    Button mBtnScan;

    @InjectView(R.id.btn_scan_a)
    Button mBtnScanA;


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_scan:
                readyGo(CaptureActivity.class);
                break;
            case R.id.btn_scan_a:

                break;
            default:
                break;
        }
    }

    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initViewsAndEvents() {
        mBtnScan.setOnClickListener(this);
        mBtnScanA.setOnClickListener(this);
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_qrcode;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

}

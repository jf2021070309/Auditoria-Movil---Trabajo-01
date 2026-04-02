package com.me.game.pmupdatesdk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.me.game.pmupdatesdk.bean.GameUpdateNoticeBean;
import com.me.game.pmupdatesdk.dialog.BaseAlertDialog;
import com.me.game.pmupdatesdk.dialog.DlgGameUpdateNotice;
import com.me.game.pmupdatesdk.helper.GameUpdateNoticeHelper;
import com.me.game.pmupdatesdk.interfaces.OnDialogCloseListener;
import com.me.game.pmupdatesdk.interfaces.OnGameUpdateReqResultListener;
import com.me.game.pmupdatesdk.network.ProtocolEventReported;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
/* loaded from: classes7.dex */
public class MainActivity extends Activity implements OnGameUpdateReqResultListener {
    private DlgGameUpdateNotice mDlgGameUpdateNotice;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoggerUtils.e("hhhhh", "MainActivity-onCreate");
        if (PMUpdateSDK.mIsShowNotice.equals(PMUpdateSDK.mIsShowNotice)) {
            PMUpdateSDK.attachApplication(this);
            GameUpdateNoticeHelper.getIns().addListener(this);
            GameUpdateNoticeHelper.getIns().requestData();
            return;
        }
        startActivity();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        GameUpdateNoticeHelper.getIns().removeListener(this);
        DlgGameUpdateNotice dlgGameUpdateNotice = this.mDlgGameUpdateNotice;
        if (dlgGameUpdateNotice != null) {
            dlgGameUpdateNotice.dismiss();
        }
    }

    void startActivity() {
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            String MAIN_ACTIVITY = applicationInfo.metaData.getString("pm_update_start");
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), MAIN_ACTIVITY);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showUpdateNoticeDialog(GameUpdateNoticeBean gameUpdateNoticeBean) {
        LoggerUtils.e("hhhhh", "showUpdateNoticeDialog");
        if (this.mDlgGameUpdateNotice == null) {
            DlgGameUpdateNotice gameUpdateNoticeBean2 = new DlgGameUpdateNotice(this).setGameUpdateNoticeBean(gameUpdateNoticeBean);
            this.mDlgGameUpdateNotice = gameUpdateNoticeBean2;
            gameUpdateNoticeBean2.setOnDialogCloseListener(new OnDialogCloseListener() { // from class: com.me.game.pmupdatesdk.MainActivity.1
                @Override // com.me.game.pmupdatesdk.interfaces.OnDialogCloseListener
                public void closeDialog(BaseAlertDialog alertDialog) {
                    MainActivity.this.startActivity();
                }
            });
        }
        this.mDlgGameUpdateNotice.show();
        ProtocolEventReported.updateEvent(ProtocolEventReported.UPDATE_SDK_SHOW);
    }

    @Override // com.me.game.pmupdatesdk.interfaces.OnGameUpdateReqResultListener
    public void onGameUpdateNoticeResult(GameUpdateNoticeBean gameUpdateNoticeBean) {
        if (gameUpdateNoticeBean != null && gameUpdateNoticeBean.show) {
            showUpdateNoticeDialog(gameUpdateNoticeBean);
        } else {
            startActivity();
        }
    }
}

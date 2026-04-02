package com.me.game.pmadsdk;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.me.game.pmadsdk.bean.GameAdBean;
import com.me.game.pmadsdk.dialog.BaseAlertDialog;
import com.me.game.pmadsdk.dialog.DlgGameAd;
import com.me.game.pmadsdk.dialog.DlgGameAdNonFullScreen;
import com.me.game.pmadsdk.helper.GameAdHelper;
import com.me.game.pmadsdk.helper.LocalAdListHelper;
import com.me.game.pmadsdk.interfaces.OnDialogCloseListener;
import com.me.game.pmadsdk.interfaces.OnGameAdReqResultListener;
import com.me.game.pmadsdk.network.ProtocolEventReported;
import com.me.game.pmadsdk.utils.LoggerUtils;
import java.util.List;
/* loaded from: classes6.dex */
public class MainActivity extends Activity implements OnGameAdReqResultListener {
    private DlgGameAd mDlgGameAd;
    private DlgGameAdNonFullScreen mDlgGameAdNonFullScreen;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (PMAdSDK.mIsShowNotice.equals(PMAdSDK.mIsShowNotice)) {
            PMAdSDK.attachApplication(this);
            GameAdHelper.getIns().addListener(this);
            GameAdHelper.getIns().requestData();
            return;
        }
        startActivity();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        GameAdHelper.getIns().removeListener(this);
        DlgGameAd dlgGameAd = this.mDlgGameAd;
        if (dlgGameAd != null) {
            dlgGameAd.dismiss();
        }
        DlgGameAdNonFullScreen dlgGameAdNonFullScreen = this.mDlgGameAdNonFullScreen;
        if (dlgGameAdNonFullScreen != null) {
            dlgGameAdNonFullScreen.dismiss();
        }
    }

    void startActivity() {
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 128);
            String MAIN_ACTIVITY = applicationInfo.metaData.getString("pm_ad_start");
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), MAIN_ACTIVITY);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAdDialog(GameAdBean gameAdBean) {
        if (this.mDlgGameAd == null) {
            DlgGameAd gameAdBean2 = new DlgGameAd(this).setGameAdBean(gameAdBean);
            this.mDlgGameAd = gameAdBean2;
            gameAdBean2.setOnDialogCloseListener(new OnDialogCloseListener() { // from class: com.me.game.pmadsdk.MainActivity.1
                @Override // com.me.game.pmadsdk.interfaces.OnDialogCloseListener
                public void closeDialog(BaseAlertDialog alertDialog) {
                    MainActivity.this.startActivity();
                }
            });
        }
        this.mDlgGameAd.show();
        ProtocolEventReported.updateEvent(gameAdBean.id, ProtocolEventReported.AD_SDK_SHOW);
    }

    private void showAdNonFullScreenDialog(GameAdBean gameAdBean) {
        if (this.mDlgGameAdNonFullScreen == null) {
            DlgGameAdNonFullScreen gameAdBean2 = new DlgGameAdNonFullScreen(this).setGameAdBean(gameAdBean);
            this.mDlgGameAdNonFullScreen = gameAdBean2;
            gameAdBean2.setOnDialogCloseListener(new OnDialogCloseListener() { // from class: com.me.game.pmadsdk.MainActivity.2
                @Override // com.me.game.pmadsdk.interfaces.OnDialogCloseListener
                public void closeDialog(BaseAlertDialog alertDialog) {
                    MainActivity.this.startActivity();
                }
            });
        }
        this.mDlgGameAdNonFullScreen.show();
        ProtocolEventReported.updateEvent(gameAdBean.id, ProtocolEventReported.AD_SDK_SHOW);
    }

    @Override // com.me.game.pmadsdk.interfaces.OnGameAdReqResultListener
    public void onGameAdResult(List<GameAdBean> gameAdBeanList) {
        if (gameAdBeanList == null) {
            startActivity();
            return;
        }
        LoggerUtils.i("wxx", "ad list size=" + gameAdBeanList.size());
        LocalAdListHelper.getInstance().update(gameAdBeanList);
        GameAdBean gameAdBean = LocalAdListHelper.getInstance().getShowAdBean();
        if (gameAdBean != null) {
            if (gameAdBean.styleType == 1) {
                showAdNonFullScreenDialog(gameAdBean);
                return;
            } else {
                showAdDialog(gameAdBean);
                return;
            }
        }
        LoggerUtils.i("可展示广告为null", new Object[0]);
        startActivity();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        DlgGameAd dlgGameAd = this.mDlgGameAd;
        if (dlgGameAd != null && dlgGameAd.mIsClickAd && this.mDlgGameAd.isShowing()) {
            DlgGameAd dlgGameAd2 = this.mDlgGameAd;
            dlgGameAd2.closeDialog(dlgGameAd2);
        }
        DlgGameAdNonFullScreen dlgGameAdNonFullScreen = this.mDlgGameAdNonFullScreen;
        if (dlgGameAdNonFullScreen != null && dlgGameAdNonFullScreen.mIsClickAd && this.mDlgGameAdNonFullScreen.isShowing()) {
            DlgGameAdNonFullScreen dlgGameAdNonFullScreen2 = this.mDlgGameAdNonFullScreen;
            dlgGameAdNonFullScreen2.closeDialog(dlgGameAdNonFullScreen2);
        }
    }
}

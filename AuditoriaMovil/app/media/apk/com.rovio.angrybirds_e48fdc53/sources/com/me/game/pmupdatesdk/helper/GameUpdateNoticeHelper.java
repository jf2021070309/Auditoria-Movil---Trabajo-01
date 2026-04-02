package com.me.game.pmupdatesdk.helper;

import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.bean.GameUpdateNoticeBean;
import com.me.game.pmupdatesdk.interfaces.OnGameUpdateReqResultListener;
import com.me.game.pmupdatesdk.network.ProtocolUpdateNotice;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.me.game.pmupdatesdk.utils.Observers;
/* loaded from: classes7.dex */
public class GameUpdateNoticeHelper extends Observers<OnGameUpdateReqResultListener> implements OnGameUpdateReqResultListener {
    private static volatile GameUpdateNoticeHelper mIns;

    public static GameUpdateNoticeHelper getIns() {
        if (mIns == null) {
            synchronized (GameUpdateNoticeHelper.class) {
                if (mIns == null) {
                    mIns = new GameUpdateNoticeHelper();
                }
            }
        }
        return mIns;
    }

    @Override // com.me.game.pmupdatesdk.interfaces.OnGameUpdateReqResultListener
    public void onGameUpdateNoticeResult(final GameUpdateNoticeBean gameUpdateNoticeBean) {
        execuRunnable(this.mListeners, new Observers.DoClass<OnGameUpdateReqResultListener>() { // from class: com.me.game.pmupdatesdk.helper.GameUpdateNoticeHelper.1
            @Override // com.me.game.pmupdatesdk.utils.Observers.DoClass
            public void run(OnGameUpdateReqResultListener action) {
                action.onGameUpdateNoticeResult(gameUpdateNoticeBean);
            }
        });
    }

    public void requestData() {
        if (!PMUpdateSDK.mPMUpdateSDK.hasPackage()) {
            onGameUpdateNoticeResult(null);
            return;
        }
        String packageName = PMUpdateSDK.mPMUpdateSDK.getRealPackageName();
        String versionName = PMUpdateSDK.mPMUpdateSDK.getVersionName();
        int versionCode = PMUpdateSDK.mPMUpdateSDK.getVersionCode();
        LoggerUtils.e("hhhhh", "packageName = " + packageName);
        LoggerUtils.e("hhhhh", "versionName = " + versionName);
        LoggerUtils.e("hhhhh", "versionCode = " + versionCode);
        ProtocolUpdateNotice.getIns().setPackageName(packageName).setVersionName(versionName).setVersionCode(versionCode).setResultListener(new ProtocolUpdateNotice.onResultListener() { // from class: com.me.game.pmupdatesdk.helper.GameUpdateNoticeHelper.2
            @Override // com.me.game.pmupdatesdk.network.ProtocolUpdateNotice.onResultListener
            public void doResult(GameUpdateNoticeBean bean) {
                GameUpdateNoticeHelper.this.onGameUpdateNoticeResult(bean);
            }
        }).postRequest();
    }
}

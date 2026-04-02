package com.me.game.pmadsdk.helper;

import com.me.game.pmadsdk.PMAdSDK;
import com.me.game.pmadsdk.bean.GameAdBean;
import com.me.game.pmadsdk.interfaces.OnGameAdReqResultListener;
import com.me.game.pmadsdk.network.ProtocolAd;
import com.me.game.pmadsdk.utils.Observers;
import java.util.List;
/* loaded from: classes6.dex */
public class GameAdHelper extends Observers<OnGameAdReqResultListener> implements OnGameAdReqResultListener {
    private static volatile GameAdHelper mIns;

    public static GameAdHelper getIns() {
        if (mIns == null) {
            synchronized (GameAdHelper.class) {
                if (mIns == null) {
                    mIns = new GameAdHelper();
                }
            }
        }
        return mIns;
    }

    @Override // com.me.game.pmadsdk.interfaces.OnGameAdReqResultListener
    public void onGameAdResult(final List<GameAdBean> gameAdBean) {
        execuRunnable(this.mListeners, new Observers.DoClass<OnGameAdReqResultListener>() { // from class: com.me.game.pmadsdk.helper.GameAdHelper.1
            @Override // com.me.game.pmadsdk.utils.Observers.DoClass
            public void run(OnGameAdReqResultListener action) {
                action.onGameAdResult(gameAdBean);
            }
        });
    }

    public void requestData() {
        String packageName = PMAdSDK.mPmAdSDK.getRealPackageName();
        ProtocolAd.getIns().setPackageName(packageName).setResultListener(new ProtocolAd.onResultListener() { // from class: com.me.game.pmadsdk.helper.GameAdHelper.2
            @Override // com.me.game.pmadsdk.network.ProtocolAd.onResultListener
            public void doResult(List<GameAdBean> bean) {
                GameAdHelper.this.onGameAdResult(bean);
            }
        }).postRequest();
    }
}

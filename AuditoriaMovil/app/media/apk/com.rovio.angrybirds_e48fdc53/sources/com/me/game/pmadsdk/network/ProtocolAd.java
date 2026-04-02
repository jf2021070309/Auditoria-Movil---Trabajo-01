package com.me.game.pmadsdk.network;

import com.facebook.share.internal.ShareConstants;
import com.me.game.pmadsdk.bean.GameAdBean;
import com.me.game.pmadsdk.utils.LoggerUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class ProtocolAd extends RequestBase {
    private static volatile ProtocolAd mIns;
    private onResultListener mListener;

    /* loaded from: classes6.dex */
    public interface onResultListener {
        void doResult(List<GameAdBean> list);
    }

    public static ProtocolAd getIns() {
        if (mIns == null) {
            synchronized (ProtocolAd.class) {
                if (mIns == null) {
                    mIns = new ProtocolAd();
                }
            }
        }
        return mIns;
    }

    private ProtocolAd() {
        this.ACTION_NAME = "sdkAd/getList";
    }

    public ProtocolAd setPackageName(String packageName) {
        this.mPackageName = packageName;
        return this;
    }

    public ProtocolAd setVersionName(String versionName) {
        this.mVersionName = versionName;
        return this;
    }

    public ProtocolAd setVersionCode(int versionCode) {
        this.mVersionCode = versionCode;
        return this;
    }

    public ProtocolAd setResultListener(onResultListener listener) {
        this.mListener = listener;
        return this;
    }

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void setKvMap(TreeMap<String, Object> kvMap) {
        kvMap.put("realPackageName", this.mPackageName);
        kvMap.put("versionName", this.mVersionName);
        kvMap.put("versionCode", Integer.valueOf(this.mVersionCode));
    }

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void onSuccess(String str) {
        onResultListener onresultlistener;
        LoggerUtils.e("jjjjj", "ad-onSuccess = " + str);
        List<GameAdBean> gameAdBeanList = new ArrayList<>();
        try {
            try {
                JSONObject jsonObject = new JSONObject(str);
                JSONArray jsonArray = jsonObject.getJSONArray(ShareConstants.WEB_DIALOG_PARAM_DATA);
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject data = jsonArray.getJSONObject(i);
                    if (data != null) {
                        GameAdBean gameAdBean = GameAdBean.parse(data);
                        gameAdBeanList.add(gameAdBean);
                    }
                }
                onresultlistener = this.mListener;
                if (onresultlistener == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                onresultlistener = this.mListener;
                if (onresultlistener == null) {
                    return;
                }
            }
            onresultlistener.doResult(gameAdBeanList);
        } catch (Throwable th) {
            onResultListener onresultlistener2 = this.mListener;
            if (onresultlistener2 != null) {
                onresultlistener2.doResult(gameAdBeanList);
            }
            throw th;
        }
    }

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void onFailure(String msg) {
        super.onFailure(msg);
        LoggerUtils.e("jjjjj", "ad-onFailure = " + msg);
        onResultListener onresultlistener = this.mListener;
        if (onresultlistener != null) {
            onresultlistener.doResult(null);
        }
    }
}

package com.me.game.pmupdatesdk.network;

import com.facebook.share.internal.ShareConstants;
import com.me.game.pmupdatesdk.bean.GameUpdateNoticeBean;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.TreeMap;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class ProtocolUpdateNotice extends RequestBase {
    private static volatile ProtocolUpdateNotice mIns;
    private onResultListener mListener;

    /* loaded from: classes7.dex */
    public interface onResultListener {
        void doResult(GameUpdateNoticeBean gameUpdateNoticeBean);
    }

    public static ProtocolUpdateNotice getIns() {
        if (mIns == null) {
            synchronized (ProtocolUpdateNotice.class) {
                if (mIns == null) {
                    mIns = new ProtocolUpdateNotice();
                }
            }
        }
        return mIns;
    }

    private ProtocolUpdateNotice() {
        this.ACTION_NAME = "sdk/api/update/show";
    }

    public ProtocolUpdateNotice setPackageName(String packageName) {
        this.mPackageName = packageName;
        return this;
    }

    public ProtocolUpdateNotice setVersionName(String versionName) {
        this.mVersionName = versionName;
        return this;
    }

    public ProtocolUpdateNotice setVersionCode(int versionCode) {
        this.mVersionCode = versionCode;
        return this;
    }

    public ProtocolUpdateNotice setResultListener(onResultListener listener) {
        this.mListener = listener;
        return this;
    }

    @Override // com.me.game.pmupdatesdk.network.RequestBase
    protected void setKvMap(TreeMap<String, Object> kvMap) {
        kvMap.put(DBDefinition.PACKAGE_NAME, this.mPackageName);
        kvMap.put("versionName", this.mVersionName);
        kvMap.put("versionCode", Integer.valueOf(this.mVersionCode));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.network.RequestBase
    public void onSuccess(String str) {
        onResultListener onresultlistener;
        LoggerUtils.e("jjjjj", "UpdateNotice-onSuccess = " + str);
        try {
            try {
                JSONObject jsonObject = new JSONObject(str);
                JSONObject data = jsonObject.getJSONObject(ShareConstants.WEB_DIALOG_PARAM_DATA);
                gameUpdateNoticeBean = data != null ? GameUpdateNoticeBean.parse(data) : null;
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
            onresultlistener.doResult(gameUpdateNoticeBean);
        } catch (Throwable th) {
            onResultListener onresultlistener2 = this.mListener;
            if (onresultlistener2 != null) {
                onresultlistener2.doResult(null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.network.RequestBase
    public void onFailure(String msg) {
        super.onFailure(msg);
        LoggerUtils.e("jjjjj", "UpdateNotice-onFailure = " + msg);
        onResultListener onresultlistener = this.mListener;
        if (onresultlistener != null) {
            onresultlistener.doResult(null);
        }
    }
}

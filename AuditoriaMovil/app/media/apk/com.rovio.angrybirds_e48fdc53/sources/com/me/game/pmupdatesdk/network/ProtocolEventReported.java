package com.me.game.pmupdatesdk.network;

import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import java.util.TreeMap;
/* loaded from: classes7.dex */
public class ProtocolEventReported extends RequestBase {
    public static final String UPDATE_SDK_CLICK = "update_sdk_click";
    public static final String UPDATE_SDK_SHOW = "update_sdk_show";
    private static volatile ProtocolEventReported mIns;
    private String mEventCode;

    public static ProtocolEventReported getIns() {
        if (mIns == null) {
            synchronized (ProtocolEventReported.class) {
                if (mIns == null) {
                    mIns = new ProtocolEventReported();
                }
            }
        }
        return mIns;
    }

    private ProtocolEventReported() {
        this.ACTION_NAME = "www/sdk_event/reported";
    }

    public ProtocolEventReported setPackageName(String packageName) {
        this.mPackageName = packageName;
        return this;
    }

    public ProtocolEventReported setEventCode(String eventCode) {
        this.mEventCode = eventCode;
        return this;
    }

    public ProtocolEventReported setBaseUrl(String url) {
        this.BASE_URL = url;
        return this;
    }

    @Override // com.me.game.pmupdatesdk.network.RequestBase
    protected void setKvMap(TreeMap<String, Object> kvMap) {
        kvMap.put("realPackageName", this.mPackageName);
        kvMap.put("eventCode", this.mEventCode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.network.RequestBase
    public void onSuccess(String str) {
        super.onSuccess(str);
        LoggerUtils.e("jjjjj", "reported-onSuccess = " + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.network.RequestBase
    public void onFailure(String msg) {
        super.onFailure(msg);
        LoggerUtils.e("jjjjj", "reported-onFailure = " + msg);
    }

    public static void updateEvent(String eventCode) {
        getIns().setPackageName(PMUpdateSDK.mPMUpdateSDK.getRealPackageName()).setEventCode(eventCode).setBaseUrl("https://www.playmods.live/%s").postRequest();
    }
}

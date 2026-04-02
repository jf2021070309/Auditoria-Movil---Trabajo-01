package com.me.game.pmadsdk.network;

import com.me.game.pmadsdk.utils.LoggerUtils;
import java.util.TreeMap;
/* loaded from: classes6.dex */
public class ProtocolEventReported extends RequestBase {
    public static final String AD_SDK_CLICK = "ad_sdk_click";
    public static final String AD_SDK_SHOW = "ad_sdk_show";
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

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void setKvMap(TreeMap<String, Object> kvMap) {
        kvMap.put("realPackageName", this.mPackageName);
        kvMap.put("eventCode", this.mEventCode);
    }

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void onSuccess(String str) {
        super.onSuccess(str);
        LoggerUtils.e("jjjjj", "reported-onSuccess = " + str);
    }

    @Override // com.me.game.pmadsdk.network.RequestBase
    protected void onFailure(String msg) {
        super.onFailure(msg);
        LoggerUtils.e("jjjjj", "reported-onFailure = " + msg);
    }

    public static void updateEvent(int id, String eventCode) {
        getIns().setPackageName(String.valueOf(id)).setEventCode(eventCode).setBaseUrl("https://www.playmods.live/%s").postRequest();
    }
}

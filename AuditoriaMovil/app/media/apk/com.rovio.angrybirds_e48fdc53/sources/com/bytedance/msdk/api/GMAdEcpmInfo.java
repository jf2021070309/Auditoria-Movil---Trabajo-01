package com.bytedance.msdk.api;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GMAdEcpmInfo {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Map<String, String> p = new HashMap();

    public String getAbTestId() {
        return this.n;
    }

    @Deprecated
    public int getAdNetworkPlatformId() {
        return this.a;
    }

    public String getAdNetworkPlatformName() {
        return this.b;
    }

    public String getAdNetworkRitId() {
        return this.d;
    }

    public String getAdnName() {
        return TextUtils.isEmpty(this.c) ? this.b : this.c;
    }

    public String getChannel() {
        return this.l;
    }

    public String getCustomAdNetworkPlatformName() {
        return this.c;
    }

    public Map<String, String> getCustomData() {
        return this.p;
    }

    public String getErrorMsg() {
        return this.h;
    }

    public String getLevelTag() {
        return this.e;
    }

    public String getPreEcpm() {
        return this.f;
    }

    public int getReqBiddingType() {
        return this.g;
    }

    public String getRequestId() {
        return this.i;
    }

    public String getRitType() {
        return this.j;
    }

    public String getScenarioId() {
        return this.o;
    }

    public String getSegmentId() {
        return this.k;
    }

    public String getSubChannel() {
        return this.m;
    }

    public void setAbTestId(String str) {
        this.n = str;
    }

    public void setAdNetworkPlatformId(int i) {
        this.a = i;
    }

    public void setAdNetworkPlatformName(String str) {
        this.b = str;
    }

    public void setAdNetworkRitId(String str) {
        this.d = str;
    }

    public void setChannel(String str) {
        this.l = str;
    }

    public void setCustomAdNetworkPlatformName(String str) {
        this.c = str;
    }

    public void setCustomData(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.p.clear();
        this.p.putAll(map);
    }

    public void setErrorMsg(String str) {
        this.h = str;
    }

    public void setLevelTag(String str) {
        this.e = str;
    }

    public void setPreEcpm(String str) {
        this.f = str;
    }

    public void setReqBiddingType(int i) {
        this.g = i;
    }

    public void setRequestId(String str) {
        this.i = str;
    }

    public void setRitType(String str) {
        this.j = str;
    }

    public void setScenarioId(String str) {
        this.o = str;
    }

    public void setSegmentId(String str) {
        this.k = str;
    }

    public void setSubChannel(String str) {
        this.m = str;
    }

    public String toString() {
        return "{mSdkNum='" + this.a + "', mSlotId='" + this.d + "', mLevelTag='" + this.e + "', mEcpm=" + this.f + ", mReqBiddingType=" + this.g + "', mRequestId=" + this.i + '}';
    }
}

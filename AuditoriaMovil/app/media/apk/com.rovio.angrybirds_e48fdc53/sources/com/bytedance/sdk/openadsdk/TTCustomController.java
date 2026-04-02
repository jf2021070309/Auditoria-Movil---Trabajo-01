package com.bytedance.sdk.openadsdk;
/* loaded from: classes.dex */
public abstract class TTCustomController {
    public boolean isCanUseLocation() {
        return true;
    }

    public LocationProvider getTTLocation() {
        return null;
    }

    public boolean alist() {
        return true;
    }

    public boolean isCanUsePhoneState() {
        return true;
    }

    public String getDevImei() {
        return null;
    }

    public boolean isCanUseWifiState() {
        return true;
    }

    public String getMacAddress() {
        return null;
    }

    public boolean isCanUseWriteExternal() {
        return true;
    }

    public String getDevOaid() {
        return null;
    }

    public boolean isCanUseAndroidId() {
        return true;
    }

    public String getAndroidId() {
        return null;
    }

    public boolean isCanUsePermissionRecordAudio() {
        return true;
    }
}

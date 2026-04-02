package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.ss.android.download.api.model.DownloadShortInfo;
/* loaded from: classes.dex */
public class g implements Bridge {
    private DownloadShortInfo dr;

    public g(DownloadShortInfo downloadShortInfo) {
        this.dr = downloadShortInfo;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bytedance.sdk.openadsdk.api.g.dr().dr(223702, dr()).dr(223703, ge()).dr(223704, o()).dr(223705, g()).dr(223706, q()).dr(223707, bn()).dr(223708, rb()).ge();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        switch (i) {
            case 223700:
                return (T) Boolean.valueOf(equals(valueSet.objectValue(223709, Object.class)));
            case 223701:
                hashCode();
                return null;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.hashCode();
        }
        return 0;
    }

    public long dr() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.id;
        }
        return -1L;
    }

    public int ge() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.status;
        }
        return -1;
    }

    public long o() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.totalBytes;
        }
        return -1L;
    }

    public long g() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.currentBytes;
        }
        return -1L;
    }

    public String q() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.fileName;
        }
        return "";
    }

    public int bn() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.failStatus;
        }
        return 0;
    }

    public boolean rb() {
        DownloadShortInfo downloadShortInfo = this.dr;
        if (downloadShortInfo != null) {
            return downloadShortInfo.onlyWifi;
        }
        return false;
    }
}

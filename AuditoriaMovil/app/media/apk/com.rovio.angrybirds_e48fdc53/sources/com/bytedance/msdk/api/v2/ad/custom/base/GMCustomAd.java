package com.bytedance.msdk.api.v2.ad.custom.base;

import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomTTBaseAd;
import java.util.Map;
/* loaded from: classes.dex */
public class GMCustomAd {
    protected GMCustomTTBaseAd a = new GMCustomTTBaseAd();

    public ITTAdatperCallback getTTAdapterCallback() {
        return this.a.getTTAdapterCallback();
    }

    public GMCustomTTBaseAd getTTBaseAd() {
        return this.a;
    }

    public void putExtraMsg(Map<String, Object> map) {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd != null) {
            gMCustomTTBaseAd.putExtraMsg(map);
        }
    }

    public void setAdType(int i) {
        this.a.setAdType(i);
    }

    public void setCpm(double d) {
        this.a.setCpm(d);
    }

    public void setGMCustomBaseAdapter(GMCustomBaseAdapter gMCustomBaseAdapter) {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd != null) {
            gMCustomTTBaseAd.setGMCustomBaseAdapter(gMCustomBaseAdapter);
        }
    }

    public void setMediaExtraInfo(Map<String, Object> map) {
        GMCustomTTBaseAd gMCustomTTBaseAd;
        if (map == null || (gMCustomTTBaseAd = this.a) == null) {
            return;
        }
        gMCustomTTBaseAd.setMediaExtraInfo(map);
    }
}

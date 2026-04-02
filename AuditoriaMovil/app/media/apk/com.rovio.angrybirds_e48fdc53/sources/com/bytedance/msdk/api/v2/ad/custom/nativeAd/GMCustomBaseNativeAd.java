package com.bytedance.msdk.api.v2.ad.custom.nativeAd;

import android.view.View;
import com.bytedance.msdk.api.v2.GMReceiveBidResultCallback;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomTTBaseAd;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomAd;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdAppInfo;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMCustomBaseNativeAd extends GMCustomAd {
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private int g;
    private String h;
    private int i;
    private int j;
    private String k;
    private double l;
    private List<String> m;
    private String n;
    private int o;
    private int p;
    private GMNativeAdAppInfo q;
    private double r;
    private GMReceiveBidResultCallback s = new GMReceiveBidResultCallback() { // from class: com.bytedance.msdk.api.v2.ad.custom.nativeAd.GMCustomBaseNativeAd.1
        @Override // com.bytedance.msdk.api.v2.GMReceiveBidResultCallback
        public void bidResult(boolean z, double d, int i, Map<String, Object> map) {
            GMCustomBaseNativeAd.this.receiveBidResult(z, d, i, map);
        }
    };

    public GMCustomBaseNativeAd() {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd != null) {
            gMCustomTTBaseAd.setGmReceiveBidResultCallback(this.s);
        }
    }

    public String getActionText() {
        return this.h;
    }

    public int getAdImageMode() {
        return this.o;
    }

    public double getBiddingPrice() {
        return this.r;
    }

    public String getDescription() {
        return this.c;
    }

    public View getExpressView() {
        return null;
    }

    public String getIconUrl() {
        return this.d;
    }

    public int getImageHeight() {
        return this.g;
    }

    public List<String> getImageList() {
        return this.m;
    }

    public String getImageUrl() {
        return this.e;
    }

    public int getImageWidth() {
        return this.f;
    }

    public int getInteractionType() {
        return this.p;
    }

    public GMNativeAdAppInfo getNativeAdAppInfo() {
        return this.q;
    }

    public String getPackageName() {
        return this.k;
    }

    public String getSource() {
        return this.n;
    }

    public double getStarRating() {
        return this.l;
    }

    public String getTitle() {
        return this.b;
    }

    public int getVideoHeight() {
        return this.j;
    }

    public String getVideoUrl() {
        return null;
    }

    public final String getVideoUrlInner() {
        try {
            return getVideoUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getVideoWidth() {
        return this.i;
    }

    public boolean isServerBidding() {
        return this.a.getAdNetworkSlotType() == 2;
    }

    public final boolean isUseCustomVideo() {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd != null) {
            return gMCustomTTBaseAd.isUseCustomVideo();
        }
        return false;
    }

    public void receiveBidResult(boolean z, double d, int i, Map<String, Object> map) {
    }

    public void setActionText(String str) {
        this.h = str;
    }

    public void setAdImageMode(int i) {
        this.o = i;
    }

    public void setBiddingPrice(double d) {
        this.r = d;
    }

    public void setDescription(String str) {
        this.c = str;
    }

    public final void setDislikeDialogCallBack(IGMCustomNativeDislikeDialog iGMCustomNativeDislikeDialog) {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd == null || iGMCustomNativeDislikeDialog == null) {
            return;
        }
        gMCustomTTBaseAd.setDislikeDialogCallBack(iGMCustomNativeDislikeDialog);
    }

    public void setExpressAd(boolean z) {
        GMCustomTTBaseAd gMCustomTTBaseAd = this.a;
        if (gMCustomTTBaseAd != null) {
            gMCustomTTBaseAd.setExpressAd(z);
        }
    }

    public void setIconUrl(String str) {
        this.d = str;
    }

    public void setImageHeight(int i) {
        this.g = i;
    }

    public void setImageList(List<String> list) {
        this.m = list;
    }

    public void setImageUrl(String str) {
        this.e = str;
    }

    public void setImageWidth(int i) {
        this.f = i;
    }

    public void setInteractionType(int i) {
        this.p = i;
    }

    public void setNativeAdAppInfo(GMNativeAdAppInfo gMNativeAdAppInfo) {
        this.q = gMNativeAdAppInfo;
    }

    public void setPackageName(String str) {
        this.k = str;
    }

    public void setSource(String str) {
        this.n = str;
    }

    public void setStarRating(double d) {
        this.l = d;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setVideoHeight(int i) {
        this.j = i;
    }

    public void setVideoWidth(int i) {
        this.i = i;
    }
}

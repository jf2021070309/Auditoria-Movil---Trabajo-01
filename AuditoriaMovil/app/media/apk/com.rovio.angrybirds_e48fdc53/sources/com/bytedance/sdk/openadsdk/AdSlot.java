package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.ge;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdSlot implements TTAdSlot {
    private TTAdLoadType at;
    private int bn;
    private int cu;

    /* renamed from: de  reason: collision with root package name */
    private int[] f4de;
    private String dr;
    private float g;
    private int ge;
    private String i;
    private String ii;
    private int il;
    private String j;
    private int ll;
    private boolean lp;
    private String m;
    private String n;
    private int o;
    private float q;
    private boolean rb;
    private String t;
    private String tb;
    private String uq;
    private int v;
    private String wb;
    private int x;
    private boolean xu;
    private String yk;
    private int z;

    private AdSlot() {
        this.cu = 2;
        this.lp = true;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getAdId() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getCreativeId() {
        return this.n;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getExt() {
        return this.m;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getCodeId() {
        return this.dr;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public boolean isAutoPlay() {
        return this.lp;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getImgAcceptedWidth() {
        return this.ge;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getImgAcceptedHeight() {
        return this.o;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public float getExpressViewAcceptedWidth() {
        return this.g;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public float getExpressViewAcceptedHeight() {
        return this.q;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public boolean isSupportDeepLink() {
        return this.rb;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public boolean isSupportRenderConrol() {
        return this.xu;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getAdCount() {
        return this.bn;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public void setAdCount(int i) {
        this.bn = i;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getMediaExtra() {
        return this.t;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getUserID() {
        return this.yk;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getOrientation() {
        return this.cu;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getNativeAdType() {
        return this.il;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public void setNativeAdType(int i) {
        this.il = i;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public void setDurationSlotType(int i) {
        this.x = i;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getDurationSlotType() {
        return this.x;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int[] getExternalABVid() {
        return this.f4de;
    }

    public void setExternalABVid(int... iArr) {
        this.f4de = iArr;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getAdloadSeq() {
        return this.z;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getPrimeRit() {
        String str = this.tb;
        return str == null ? "" : str;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getAdType() {
        return this.v;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getBidAdm() {
        return this.ii;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getExtraSmartLookParam() {
        return this.i;
    }

    public void setUserData(String str) {
        this.j = str;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getUserData() {
        return this.j;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public TTAdLoadType getAdLoadType() {
        return this.at;
    }

    public void setAdLoadType(TTAdLoadType tTAdLoadType) {
        this.at = tTAdLoadType;
    }

    public void setGroupLoadMore(int i) {
        this.t = dr(this.t, i);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public String getRewardName() {
        return this.wb;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdSlot
    public int getRewardAmount() {
        return this.ll;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.dr + "', mImgAcceptedWidth=" + this.ge + ", mImgAcceptedHeight=" + this.o + ", mExpressViewAcceptedWidth=" + this.g + ", mExpressViewAcceptedHeight=" + this.q + ", mAdCount=" + this.bn + ", mSupportDeepLink=" + this.rb + ", mSupportRenderControl=" + this.xu + ", mMediaExtra='" + this.t + "', mUserID='" + this.yk + "', mOrientation=" + this.cu + ", mNativeAdType=" + this.il + ", mIsAutoPlay=" + this.lp + ", mPrimeRit" + this.tb + ", mAdloadSeq" + this.z + ", mAdId" + this.uq + ", mCreativeId" + this.n + ", mExt" + this.m + ", mUserData" + this.j + ", mAdLoadType" + this.at + ", mRewardName" + this.wb + ", mRewardAmount" + this.ll + '}';
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.dr);
            jSONObject.put("mIsAutoPlay", this.lp);
            jSONObject.put("mImgAcceptedWidth", this.ge);
            jSONObject.put("mImgAcceptedHeight", this.o);
            jSONObject.put("mExpressViewAcceptedWidth", this.g);
            jSONObject.put("mExpressViewAcceptedHeight", this.q);
            jSONObject.put("mAdCount", this.bn);
            jSONObject.put("mSupportDeepLink", this.rb);
            jSONObject.put("mSupportRenderControl", this.xu);
            jSONObject.put("mMediaExtra", this.t);
            jSONObject.put("mUserID", this.yk);
            jSONObject.put("mOrientation", this.cu);
            jSONObject.put("mNativeAdType", this.il);
            jSONObject.put("mAdloadSeq", this.z);
            jSONObject.put("mPrimeRit", this.tb);
            jSONObject.put("mExtraSmartLookParam", this.i);
            jSONObject.put("mAdId", this.uq);
            jSONObject.put("mCreativeId", this.n);
            jSONObject.put("mExt", this.m);
            jSONObject.put("mBidAdm", this.ii);
            jSONObject.put("mUserData", this.j);
            jSONObject.put("mAdLoadType", this.at);
            jSONObject.put("mRewardName", this.wb);
            jSONObject.put("mRewardAmount", this.ll);
        } catch (Exception e) {
        }
        return jSONObject;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private float cu;

        /* renamed from: de  reason: collision with root package name */
        private String f5de;
        private String dr;
        private String i;
        private String ii;
        private String j;
        private int lp;
        private String m;
        private String n;
        private String rb;
        private String t;
        private int tb;
        private float v;
        private int wb;
        private int[] x;
        private int yk;
        private String z;
        private int ge = 640;
        private int o = 320;
        private boolean g = true;
        private boolean q = false;
        private int bn = 1;
        private String xu = "defaultUser";
        private int ll = 2;
        private boolean il = true;
        private TTAdLoadType uq = TTAdLoadType.UNKNOWN;

        public Builder setExtraParam(String str) {
            this.t = str;
            return this;
        }

        public Builder setAdType(int i) {
            this.yk = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.n = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.m = str;
            return this;
        }

        public Builder setExt(String str) {
            this.j = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.il = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.dr = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.ge = i;
            this.o = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.cu = f;
            this.v = f2;
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            this.g = z;
            return this;
        }

        public Builder supportRenderControl() {
            this.q = true;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
                ge.o("TT_AD_SDK", "setAdCount: adCount must greater than 0 ");
            }
            if (i > 20) {
                ge.o("TT_AD_SDK", "setAdCount: adCount must less than or equal to 20 ");
                i = 20;
            }
            this.bn = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.rb = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.xu = str;
            return this;
        }

        public Builder setOrientation(int i) {
            this.ll = i;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.wb = i;
            return this;
        }

        public Builder setAdloadSeq(int i) {
            this.lp = i;
            return this;
        }

        public Builder setPrimeRit(String str) {
            this.f5de = str;
            return this;
        }

        public Builder setExternalABVid(int... iArr) {
            this.x = iArr;
            return this;
        }

        public Builder setUserData(String str) {
            this.z = str;
            return this;
        }

        public Builder setRewardName(String str) {
            this.ii = str;
            return this;
        }

        public Builder setRewardAmount(int i) {
            this.tb = i;
            return this;
        }

        public Builder setAdLoadType(TTAdLoadType tTAdLoadType) {
            this.uq = tTAdLoadType;
            return this;
        }

        public Builder withBid(String str) {
            if (str == null) {
                return this;
            }
            this.i = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.dr = this.dr;
            adSlot.bn = this.bn;
            adSlot.rb = this.g;
            adSlot.xu = this.q;
            adSlot.ge = this.ge;
            adSlot.o = this.o;
            float f = this.cu;
            if (f <= 0.0f) {
                adSlot.g = this.ge;
                adSlot.q = this.o;
            } else {
                adSlot.g = f;
                adSlot.q = this.v;
            }
            adSlot.t = this.rb;
            adSlot.yk = this.xu;
            adSlot.cu = this.ll;
            adSlot.il = this.wb;
            adSlot.lp = this.il;
            adSlot.f4de = this.x;
            adSlot.z = this.lp;
            adSlot.tb = this.f5de;
            adSlot.i = this.t;
            adSlot.uq = this.n;
            adSlot.n = this.m;
            adSlot.m = this.j;
            adSlot.v = this.yk;
            adSlot.ii = this.i;
            adSlot.j = this.z;
            adSlot.at = this.uq;
            adSlot.ll = this.tb;
            adSlot.wb = this.ii;
            return adSlot;
        }
    }

    private String dr(String str, int i) {
        JSONObject jSONObject;
        if (i < 1) {
            return str;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            jSONObject.put("_tt_group_load_more", i);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }
}

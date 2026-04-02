package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10;

import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.t;
import com.bytedance.msdk.api.AdSlot;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    private String a;
    private int b;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int c = 1;
    private int d = 0;
    public int ifTest = 0;

    public static AdSlot getShallowCopy(AdSlot adSlot) {
        if (adSlot == null) {
            return null;
        }
        AdSlot.Builder builder = new AdSlot.Builder();
        builder.setImageAdSize(adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight()).setSupportDeepLink(adSlot.isSupportDeepLink()).setAdCount(adSlot.getAdCount()).setRewardName(adSlot.getRewardName()).setRewardAmount(adSlot.getRewardAmount()).setMediaExtra(adSlot.getMediaExtra()).setCustomData(adSlot.getCustomData()).setUserID(adSlot.getUserID()).setOrientation(adSlot.getOrientation()).setTTVideoOption(adSlot.getTTVideoOption()).setTTRequestExtraParams(adSlot.getReuestParam()).setAdType(adSlot.getAdType()).setBannerSize(adSlot.getBannerSize()).setAdmobNativeAdOptions(adSlot.getAdmobNativeAdOptions()).setGdtNativeAdLogoParams(adSlot.getGdtNativeAdLogoParams()).setSplashButtonType(adSlot.getSplashButtonType()).setDownloadType(adSlot.getDownloadType()).setBidNotify(adSlot.isBidNotify()).setForceLoadBottom(adSlot.isForceLoadBottom()).setTestSlotId(adSlot.getTestSlotId()).setV2Request(adSlot.isV2Request());
        AdSlot build = builder.build();
        List<String> a = l.a();
        l.b(a, "mAdWidth");
        l.b(a, "mAdHeight");
        l.b(a, "mSupportDeepLink");
        l.b(a, "mAdCount");
        l.b(a, "mRewardName");
        l.b(a, "mRewardAmount");
        l.b(a, "mMediaExtra");
        l.b(a, "mCustomData");
        l.b(a, "mUserID");
        l.b(a, "mOrientation");
        l.b(a, "mAdType");
        l.b(a, "mTTVideoOption");
        l.b(a, "mRequestParams");
        l.b(a, "mAdStyleType");
        l.b(a, "mBannerSize");
        l.b(a, "mAdmobNativeAdOptions");
        l.b(a, "gdtNativeAdLogoParams");
        l.b(a, "mSplashButtonType");
        l.b(a, "mDownloadType");
        l.b(a, "mBidNotify");
        l.b(a, "mForceLoadBottom");
        l.b(a, "mTestSlotId");
        l.b(a, "mV2Request");
        build.setAdUnitId(adSlot.getAdUnitId());
        l.b(a, "mAdUnitId");
        build.setVersion(adSlot.getVersion());
        l.b(a, "version");
        build.setWaterfallId(adSlot.getWaterfallId());
        l.b(a, "waterfallId");
        build.setAdloadSeq(adSlot.getAdloadSeq());
        l.b(a, "mAdloadSeq");
        build.setLinkedId(adSlot.getLinkedId());
        l.b(a, "mLinkedId");
        build.setSegmentId(adSlot.getSegmentId());
        l.b(a, "segmentId");
        build.setSegmentVersion(adSlot.getSegmentVersion());
        l.b(a, "segmentVersion");
        build.setReqType(adSlot.getReqType());
        l.b(a, "reqType");
        build.setmWaterfallExtra(adSlot.getmWaterfallExtra());
        l.b(a, "mWaterfallExtra");
        build.setTransparentParams(adSlot.getTransparentParams());
        l.b(a, "mTransparentParams");
        build.setIfTest(adSlot.getIfTest());
        l.b(a, "ifTest");
        build.setBidFloor(adSlot.getBidFloor());
        l.b(a, "mBidFloor");
        build.setParalleType(adSlot.getParalleType());
        l.b(a, "mParalleType");
        build.setReqParallelNum(adSlot.getReqParallelNum());
        l.b(a, "mReqParallelNum");
        build.setSplashShakeButton(adSlot.getSplashShakeButton());
        l.b(a, "mSplashShakeButton");
        build.setNetWorkNum("network_ad_num_" + adSlot.getNetWorkNum());
        l.b(a, "mNetWorkNum");
        build.setScenarioId(adSlot.getScenarioId());
        l.b(a, "mScenarioId");
        build.setWaterfallABTest(adSlot.getWaterfallABTest());
        l.b(a, "mWaterfallABTest");
        build.setIsRa(adSlot.getIsRa());
        l.b(a, "isRa");
        l.a(a, "AdSlot");
        return build;
    }

    public int getAdloadSeq() {
        return this.b;
    }

    public int getIfTest() {
        return this.ifTest;
    }

    public int getIsRa() {
        return this.j;
    }

    public String getLinkedId() {
        return this.a;
    }

    public int getNetWorkNum() {
        return this.i;
    }

    public int getPrimeRitReqType() {
        return this.c;
    }

    public int getReqType() {
        return this.d;
    }

    public int getSegmentId() {
        return this.e;
    }

    public String getSegmentVersion() {
        return this.f;
    }

    public String getTransparentParams() {
        return this.g;
    }

    public String getmWaterfallExtra() {
        return this.h;
    }

    public void setAdloadSeq(int i) {
        this.b = i;
    }

    public void setIfTest(int i) {
        this.ifTest = i;
    }

    public void setIsRa(int i) {
        this.j = i;
    }

    public void setLinkedId(String str) {
        this.a = str;
    }

    public void setNetWorkNum(String str) {
        this.i = t.a(str);
    }

    public void setPrimeRitReqType(int i) {
        this.c = i;
    }

    public void setReqType(int i) {
        this.d = i;
    }

    public void setSegmentId(int i) {
        this.e = i;
    }

    public void setSegmentVersion(String str) {
        this.f = str;
    }

    public void setTransparentParams(String str) {
        this.g = str;
    }

    public void setmWaterfallExtra(String str) {
        this.h = str;
    }
}

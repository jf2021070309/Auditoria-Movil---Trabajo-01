package com.bytedance.msdk.api.v2.ad.custom;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.msdk.api.v2.GMReceiveBidResultCallback;
import com.bytedance.msdk.api.v2.ad.GMAdAppDownloadListener;
import com.bytedance.msdk.api.v2.ad.custom.banner.GMCustomBannerAdapter;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter;
import com.bytedance.msdk.api.v2.ad.custom.base.GMCustomVideoAdapter;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeCustomizeVideoConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeDislikeConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeDislikeDialog;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeDownloadStatusControllerConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeExpressConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeIsReadyStatusConvert;
import com.bytedance.msdk.api.v2.ad.custom.nativeAd.IGMCustomNativeLifecycleConvert;
import com.bytedance.msdk.api.v2.ad.custom.splash.GMCustomSplashAdapter;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GMCustomTTBaseAd extends TTBaseAd {
    private GMCustomBaseAdapter a;
    private GMDislikeCallback b;
    private IGMCustomNativeDislikeDialog c;
    private GMReceiveBidResultCallback d;
    private IGMCustomNativeConvert e;
    private IGMCustomNativeExpressConvert f;
    private IGMCustomNativeLifecycleConvert g;
    private IGMCustomNativeDislikeConvert h;
    private IGMCustomNativeIsReadyStatusConvert i;
    private IGMCustomNativeCustomizeVideoConvert j;
    private IGMCustomNativeDownloadStatusControllerConvert k;

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void bidLoseNotify(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        int lossReason = GMAdConstant.BiddingLossReason.OTHER.getLossReason();
        try {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            if (obj instanceof GMAdConstant.BiddingLossReason) {
                lossReason = ((GMAdConstant.BiddingLossReason) obj).getLossReason();
            }
        } catch (Exception e) {
        }
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            gMCustomBaseAdapter.receiveBidResult(false, -1.0d, lossReason, null);
        }
        GMReceiveBidResultCallback gMReceiveBidResultCallback = this.d;
        if (gMReceiveBidResultCallback != null) {
            gMReceiveBidResultCallback.bidResult(false, -1.0d, lossReason, null);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void bidWinNotify(Map<String, Object> map) {
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            gMCustomBaseAdapter.receiveBidResult(true, getCpm(), -1, null);
        }
        GMReceiveBidResultCallback gMReceiveBidResultCallback = this.d;
        if (gMReceiveBidResultCallback != null) {
            gMReceiveBidResultCallback.bidResult(true, getCpm(), -1, null);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void cancelDownload() {
        IGMCustomNativeDownloadStatusControllerConvert iGMCustomNativeDownloadStatusControllerConvert = this.k;
        if (iGMCustomNativeDownloadStatusControllerConvert != null) {
            iGMCustomNativeDownloadStatusControllerConvert.cancelDownload();
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void dislikeClick(String str, Map<String, Object> map) {
        super.dislikeClick(str, map);
        IGMCustomNativeDislikeDialog iGMCustomNativeDislikeDialog = this.c;
        if (iGMCustomNativeDislikeDialog != null) {
            iGMCustomNativeDislikeDialog.dislikeClick(str, map);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public View getAdView() {
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter == null || !(gMCustomBaseAdapter instanceof GMCustomBannerAdapter)) {
            IGMCustomNativeExpressConvert iGMCustomNativeExpressConvert = this.f;
            if (iGMCustomNativeExpressConvert != null) {
                return iGMCustomNativeExpressConvert.getExpressViewInner();
            }
            return null;
        }
        return ((GMCustomBannerAdapter) gMCustomBaseAdapter).getAdViewInner();
    }

    public GMDislikeCallback getDislikeCallback() {
        return this.b;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map) {
        IGMCustomNativeDislikeDialog iGMCustomNativeDislikeDialog = this.c;
        return iGMCustomNativeDislikeDialog != null ? iGMCustomNativeDislikeDialog.getDislikeDialog(activity, map) : super.getDislikeDialog(activity, map);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public int getDownloadStatus() {
        IGMCustomNativeDownloadStatusControllerConvert iGMCustomNativeDownloadStatusControllerConvert = this.k;
        if (iGMCustomNativeDownloadStatusControllerConvert != null) {
            return iGMCustomNativeDownloadStatusControllerConvert.getDownloadStatus();
        }
        return -1;
    }

    public GMAdAppDownloadListener getGMAdAppDownloadListener() {
        return this.mTTAdAppDownloadListener;
    }

    public GMDrawAdListener getGMDrawAdListener() {
        return this.mGMDrawAdListener;
    }

    public GMNativeAdListener getGMNativeAdListener() {
        return this.mTTNativeAdListener;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMNativeCustomVideoReporter getGMNativeCustomVideoReporter() {
        IGMCustomNativeCustomizeVideoConvert iGMCustomNativeCustomizeVideoConvert = this.j;
        if (iGMCustomNativeCustomizeVideoConvert != null) {
            return iGMCustomNativeCustomizeVideoConvert.getGMNativeCustomVideoReporter();
        }
        return null;
    }

    public GMVideoListener getGMVideoListener() {
        return this.mTTVideoListener;
    }

    public ITTAdatperCallback getTTAdapterCallback() {
        return this.mTTAdatperCallback;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public String getVideoUrl() {
        IGMCustomNativeCustomizeVideoConvert iGMCustomNativeCustomizeVideoConvert = this.j;
        if (iGMCustomNativeCustomizeVideoConvert != null) {
            return iGMCustomNativeCustomizeVideoConvert.getVideoUrl();
        }
        return null;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public boolean hasDestroyed() {
        return false;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public boolean hasDislike() {
        IGMCustomNativeDislikeConvert iGMCustomNativeDislikeConvert = this.h;
        return iGMCustomNativeDislikeConvert != null ? iGMCustomNativeDislikeConvert.hasDislike() : super.hasDislike();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public final GMAdConstant.AdIsReadyStatus isReadyStatus() {
        IGMCustomNativeIsReadyStatusConvert iGMCustomNativeIsReadyStatusConvert = this.i;
        if (iGMCustomNativeIsReadyStatusConvert != null) {
            return iGMCustomNativeIsReadyStatusConvert.isReadyStatus();
        }
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        return gMCustomBaseAdapter != null ? gMCustomBaseAdapter.isReadyStatusInner() : super.isReadyStatus();
    }

    public final void nativeDislikeClick(String str) {
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            gMCustomBaseAdapter.nativeDislikeClick(this, str);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onDestroy() {
        super.onDestroy();
        IGMCustomNativeLifecycleConvert iGMCustomNativeLifecycleConvert = this.g;
        if (iGMCustomNativeLifecycleConvert != null) {
            iGMCustomNativeLifecycleConvert.onDestroyInner();
            return;
        }
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            try {
                gMCustomBaseAdapter.onDestroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onPause() {
        super.onPause();
        IGMCustomNativeLifecycleConvert iGMCustomNativeLifecycleConvert = this.g;
        if (iGMCustomNativeLifecycleConvert != null) {
            iGMCustomNativeLifecycleConvert.onPauseInner();
            return;
        }
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            try {
                gMCustomBaseAdapter.onPause();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onResume() {
        super.onResume();
        IGMCustomNativeLifecycleConvert iGMCustomNativeLifecycleConvert = this.g;
        if (iGMCustomNativeLifecycleConvert != null) {
            iGMCustomNativeLifecycleConvert.onResumeInner();
            return;
        }
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter != null) {
            try {
                gMCustomBaseAdapter.onResume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void pauseAppDownload() {
        IGMCustomNativeDownloadStatusControllerConvert iGMCustomNativeDownloadStatusControllerConvert = this.k;
        if (iGMCustomNativeDownloadStatusControllerConvert != null) {
            iGMCustomNativeDownloadStatusControllerConvert.pauseAppDownload();
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, GMViewBinder gMViewBinder) {
        IGMCustomNativeConvert iGMCustomNativeConvert = this.e;
        if (iGMCustomNativeConvert != null) {
            iGMCustomNativeConvert.registerViewForInteractionInner(activity, viewGroup, list, list2, list3, gMViewBinder);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder) {
        registerViewForInteraction(null, viewGroup, list, list2, null, gMViewBinder);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void render() {
        IGMCustomNativeExpressConvert iGMCustomNativeExpressConvert = this.f;
        if (iGMCustomNativeExpressConvert != null) {
            iGMCustomNativeExpressConvert.renderInner();
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void resumeAppDownload() {
        IGMCustomNativeDownloadStatusControllerConvert iGMCustomNativeDownloadStatusControllerConvert = this.k;
        if (iGMCustomNativeDownloadStatusControllerConvert != null) {
            iGMCustomNativeDownloadStatusControllerConvert.resumeAppDownload();
        }
    }

    public void setCustomNativeConvert(IGMCustomNativeConvert iGMCustomNativeConvert) {
        this.e = iGMCustomNativeConvert;
    }

    public void setCustomNativeCustomizeVideoConvert(IGMCustomNativeCustomizeVideoConvert iGMCustomNativeCustomizeVideoConvert) {
        this.j = iGMCustomNativeCustomizeVideoConvert;
    }

    public void setCustomNativeDownloadStatusControllerConvert(IGMCustomNativeDownloadStatusControllerConvert iGMCustomNativeDownloadStatusControllerConvert) {
        this.k = iGMCustomNativeDownloadStatusControllerConvert;
    }

    public void setCustomNativeExpressConvert(IGMCustomNativeExpressConvert iGMCustomNativeExpressConvert) {
        this.f = iGMCustomNativeExpressConvert;
    }

    public void setCustomNativeLifecycleConvert(IGMCustomNativeLifecycleConvert iGMCustomNativeLifecycleConvert) {
        this.g = iGMCustomNativeLifecycleConvert;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void setDislikeCallback(Activity activity, GMDislikeCallback gMDislikeCallback) {
        super.setDislikeCallback(activity, gMDislikeCallback);
        this.b = gMDislikeCallback;
    }

    public void setDislikeDialogCallBack(IGMCustomNativeDislikeDialog iGMCustomNativeDislikeDialog) {
        this.c = iGMCustomNativeDislikeDialog;
    }

    public void setGMCustomBaseAdapter(GMCustomBaseAdapter gMCustomBaseAdapter) {
        this.a = gMCustomBaseAdapter;
    }

    public void setGmReceiveBidResultCallback(GMReceiveBidResultCallback gMReceiveBidResultCallback) {
        this.d = gMReceiveBidResultCallback;
    }

    public void setIGMCustomNativeDislikeConvert(IGMCustomNativeDislikeConvert iGMCustomNativeDislikeConvert) {
        this.h = iGMCustomNativeDislikeConvert;
    }

    public void setIGMCustomNativeIsReadyStatusConvert(IGMCustomNativeIsReadyStatusConvert iGMCustomNativeIsReadyStatusConvert) {
        this.i = iGMCustomNativeIsReadyStatusConvert;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter == null || !(gMCustomBaseAdapter instanceof GMCustomVideoAdapter)) {
            return;
        }
        ((GMCustomVideoAdapter) gMCustomBaseAdapter).showAdInner(activity);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showSplashAd(ViewGroup viewGroup) {
        GMCustomBaseAdapter gMCustomBaseAdapter = this.a;
        if (gMCustomBaseAdapter == null || !(gMCustomBaseAdapter instanceof GMCustomSplashAdapter)) {
            return;
        }
        ((GMCustomSplashAdapter) gMCustomBaseAdapter).showAdInner(viewGroup);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void unregisterView() {
        IGMCustomNativeConvert iGMCustomNativeConvert = this.e;
        if (iGMCustomNativeConvert != null) {
            iGMCustomNativeConvert.unregisterViewInner();
        }
    }
}

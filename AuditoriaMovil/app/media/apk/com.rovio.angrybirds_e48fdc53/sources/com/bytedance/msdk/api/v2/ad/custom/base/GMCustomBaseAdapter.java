package com.bytedance.msdk.api.v2.ad.custom.base;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.j;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.ad.custom.GMCustomTTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.v2.ad.custom.bean.GMCustomServiceConfig;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class GMCustomBaseAdapter {
    public static final int CLICK_TIMES = 60;
    public static final int SHOW_TIMES = 2;
    protected k b;
    protected TTAbsAdLoaderAdapter c;
    protected GMCustomAd d;
    protected Map<String, Object> g;
    protected boolean a = false;
    protected int e = 0;
    protected int f = 0;

    /* loaded from: classes.dex */
    public interface CheckCallback {
        void callback();
    }

    public final void checkClick(CheckCallback checkCallback) {
        int i = this.f;
        if (i >= 60) {
            Logger.e("TTMediationSDK", "自定义Adapter click方法回调次数需要小于60次");
            return;
        }
        this.f = i + 1;
        if (checkCallback != null) {
            checkCallback.callback();
        }
    }

    public final void checkLoadSuccess(CheckCallback checkCallback) {
        if (!isCallLoadSuccessCall()) {
            Logger.e("TTMediationSDK", "自定义Adapter 调用错误需要在load成功之后才可以调用");
        } else if (checkCallback != null) {
            checkCallback.callback();
        }
    }

    public final void checkShow(CheckCallback checkCallback) {
        String str;
        if (this.a) {
            int i = this.e;
            if (i < 2) {
                this.e = i + 1;
                if (checkCallback != null) {
                    checkCallback.callback();
                    return;
                }
                return;
            }
            str = "自定义Adapter show方法回调次数需要小于2次";
        } else {
            str = "自定义Adapter show方法回调必须由GroMore触发show时才会生效";
        }
        Logger.e("TTMediationSDK", str);
    }

    public final String getAdm() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        return tTAbsAdLoaderAdapter == null ? "" : tTAbsAdLoaderAdapter.getAdm();
    }

    public final int getBiddingType() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter == null) {
            return 0;
        }
        return tTAbsAdLoaderAdapter.getReqBiddingType();
    }

    public final String getCustomADNName() {
        k kVar = this.b;
        return kVar == null ? "" : kVar.e();
    }

    public final Object getExtraDataNoParse() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter == null) {
            return null;
        }
        return tTAbsAdLoaderAdapter.getExtraDataNoParse();
    }

    public final boolean isCallLoadFailCall() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            return tTAbsAdLoaderAdapter.hasNotifyFail();
        }
        return false;
    }

    public final boolean isCallLoadSuccessCall() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            return tTAbsAdLoaderAdapter.hasNotifySuccess();
        }
        return false;
    }

    public GMAdConstant.AdIsReadyStatus isReadyStatus() {
        return GMAdConstant.AdIsReadyStatus.ADN_NO_READY_API;
    }

    public final GMAdConstant.AdIsReadyStatus isReadyStatusInner() {
        try {
            return isReadyStatus();
        } catch (Exception e) {
            e.printStackTrace();
            return GMAdConstant.AdIsReadyStatus.ADN_NO_READY_API;
        }
    }

    public abstract void loadCustom(Context context, GMAdSlotBase gMAdSlotBase, GMCustomServiceConfig gMCustomServiceConfig);

    public final void loadInner(Context context, AdSlot adSlot, final GMAdSlotBase gMAdSlotBase, final k kVar, Map<String, Object> map, j jVar, int i, TTAbsAdLoaderAdapter.AdapterLoaderListener adapterLoaderListener) {
        Logger.e("TTMediationSDK_SDK_Init", "自定义ADN 开始加载广告对象 ----------   adSlot = " + kVar.d());
        this.b = kVar;
        map.put("const_is_custom", true);
        GMCustomTTAbsAdLoaderAdapter gMCustomTTAbsAdLoaderAdapter = new GMCustomTTAbsAdLoaderAdapter() { // from class: com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.1
            @Override // com.bytedance.msdk.api.v2.ad.custom.GMCustomTTAbsAdLoaderAdapter, com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
            public String getAdNetWorkName() {
                k kVar2 = kVar;
                return kVar2 != null ? kVar2.e() : super.getAdNetWorkName();
            }

            @Override // com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter
            public void loadAd(final Context context2, Map<String, Object> map2) {
                final GMCustomServiceConfig gMCustomServiceConfig = new GMCustomServiceConfig(GMCustomBaseAdapter.this.getCustomADNName(), kVar.d(), kVar.s(), kVar.z(), kVar.g());
                GMCustomAdapterConfiguration a = b.a(kVar.e());
                this.w = a != null ? a.getNetworkSdkVersion() : "";
                ThreadHelper.runOnThreadPool(new Runnable() { // from class: com.bytedance.msdk.api.v2.ad.custom.base.GMCustomBaseAdapter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        GMCustomBaseAdapter.this.loadCustom(context2, gMAdSlotBase, gMCustomServiceConfig);
                    }
                });
            }
        };
        this.c = gMCustomTTAbsAdLoaderAdapter;
        gMCustomTTAbsAdLoaderAdapter.setAdapterListener(adapterLoaderListener);
        this.c.loadAdInter(context, kVar, map, adSlot, jVar, i, gMAdSlotBase);
    }

    public final void nativeDislikeClick(TTBaseAd tTBaseAd, String str) {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.c;
        if (tTAbsAdLoaderAdapter != null) {
            tTAbsAdLoaderAdapter.nativeDislikeClick(tTBaseAd, str, null);
        }
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void receiveBidResult(boolean z, double d, int i, Map<String, Object> map) {
    }
}

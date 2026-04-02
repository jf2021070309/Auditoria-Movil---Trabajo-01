package com.bytedance.msdk.adapter.gdt;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.msdk.api.v2.slot.paltform.GMAdSlotGDTOption;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.qq.e.ads.cfg.DownAPPConfirmPolicy;
import com.qq.e.ads.cfg.VideoOption;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeUnifiedAD;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtNativeLoader extends MediationAdLoaderImpl {
    private static Map<NativeExpressADView, GdtNativeExpressAd> e = new HashMap();
    private Context a;
    private MediationAdSlotValueSet b;
    private NativeExpressAD.NativeExpressADListener c = new NativeExpressAD.NativeExpressADListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtNativeLoader.1
        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClicked(NativeExpressADView nativeExpressADView) {
            GdtNativeExpressAd gdtNativeExpressAd;
            if (GdtNativeLoader.e == null || (gdtNativeExpressAd = (GdtNativeExpressAd) GdtNativeLoader.e.get(nativeExpressADView)) == null) {
                return;
            }
            gdtNativeExpressAd.notifyOnClickAd();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADClosed(NativeExpressADView nativeExpressADView) {
            if (GdtNativeLoader.e != null) {
                GdtNativeExpressAd gdtNativeExpressAd = (GdtNativeExpressAd) GdtNativeLoader.e.get(nativeExpressADView);
                if (gdtNativeExpressAd != null) {
                    gdtNativeExpressAd.onCloseAd();
                }
                GdtNativeLoader.e.remove(nativeExpressADView);
            }
            if (nativeExpressADView != null) {
                nativeExpressADView.destroy();
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADExposure(NativeExpressADView nativeExpressADView) {
            GdtNativeExpressAd gdtNativeExpressAd;
            if (GdtNativeLoader.e == null || (gdtNativeExpressAd = (GdtNativeExpressAd) GdtNativeLoader.e.get(nativeExpressADView)) == null) {
                return;
            }
            gdtNativeExpressAd.notifyOnShowAd();
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onADLoaded(List<NativeExpressADView> list) {
            if (list == null || list.size() == 0) {
                GdtNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "list is empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NativeExpressADView nativeExpressADView : list) {
                if (nativeExpressADView != null && nativeExpressADView.getBoundData() != null) {
                    Bridge gMBridge = GdtNativeLoader.this.getGMBridge();
                    GdtNativeLoader.e.put(nativeExpressADView, new GdtNativeExpressAd(GdtNativeLoader.this, gMBridge, nativeExpressADView));
                    arrayList.add(gMBridge);
                }
            }
            GdtNativeLoader.this.notifyAdSuccess(arrayList);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                GdtNativeLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                GdtNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "adError is null");
            }
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderFail(NativeExpressADView nativeExpressADView) {
            GdtNativeExpressAd gdtNativeExpressAd;
            if (GdtNativeLoader.e == null || (gdtNativeExpressAd = (GdtNativeExpressAd) GdtNativeLoader.e.get(nativeExpressADView)) == null) {
                return;
            }
            gdtNativeExpressAd.notifyRenderFail(nativeExpressADView, MediationConstant.ErrorCode.ADN_AD_RENDER_FAIL, com.bytedance.msdk.api.AdError.ERROR_MEDIA_RENDER_MSG);
        }

        @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
        public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
            GdtNativeExpressAd gdtNativeExpressAd;
            if (GdtNativeLoader.e == null || (gdtNativeExpressAd = (GdtNativeExpressAd) GdtNativeLoader.e.get(nativeExpressADView)) == null) {
                return;
            }
            gdtNativeExpressAd.notifyRenderSuccess(-1.0f, -2.0f);
        }
    };
    private NativeADUnifiedListener d = new NativeADUnifiedListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtNativeLoader.2
        @Override // com.qq.e.ads.nativ.NativeADUnifiedListener
        public void onADLoaded(List<NativeUnifiedADData> list) {
            FrameLayout.LayoutParams layoutParams;
            if (list == null || list.size() <= 0) {
                GdtNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, com.bytedance.msdk.api.AdError.ERROR_MEDIA_REQUEST_SUCCESS_NO_ADS_MSG);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (NativeUnifiedADData nativeUnifiedADData : list) {
                if (nativeUnifiedADData != null) {
                    Bridge gMBridge = GdtNativeLoader.this.getGMBridge();
                    if (GdtNativeLoader.this.b != null) {
                        Object gdtNativeLogoParams = GdtNativeLoader.this.b.getGdtNativeLogoParams();
                        if (gdtNativeLogoParams instanceof FrameLayout.LayoutParams) {
                            layoutParams = (FrameLayout.LayoutParams) gdtNativeLogoParams;
                            new GdtNative(GdtNativeLoader.this.a, GdtNativeLoader.this, gMBridge, nativeUnifiedADData, layoutParams);
                            arrayList.add(gMBridge);
                        }
                    }
                    layoutParams = null;
                    new GdtNative(GdtNativeLoader.this.a, GdtNativeLoader.this, gMBridge, nativeUnifiedADData, layoutParams);
                    arrayList.add(gMBridge);
                }
            }
            GdtNativeLoader.this.notifyAdSuccess(arrayList);
        }

        @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
        public void onNoAD(AdError adError) {
            if (adError != null) {
                GdtNativeLoader.this.notifyAdFailed(adError.getErrorCode(), adError.getErrorMsg());
            } else {
                GdtNativeLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "请求失败");
            }
        }
    };

    private ADSize a(MediationAdSlotValueSet mediationAdSlotValueSet) {
        return mediationAdSlotValueSet.getExpressWidth() > 0.0f ? new ADSize((int) mediationAdSlotValueSet.getExpressWidth(), -2) : new ADSize(-1, -2);
    }

    private void a(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        VideoOption build;
        DownAPPConfirmPolicy downAPPConfirmPolicy;
        int intValue;
        NativeExpressAD nativeExpressAD = isServerBidding() ? new NativeExpressAD(context, a(mediationAdSlotValueSet), mediationAdSlotValueSet.getADNId(), this.c, getAdm()) : new NativeExpressAD(context, a(mediationAdSlotValueSet), mediationAdSlotValueSet.getADNId(), this.c);
        int gdtMaxVideoDuration = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = mediationAdSlotValueSet.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeExpressAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeExpressAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        if (mediationAdSlotValueSet.getGdtVideoOption() instanceof VideoOption) {
            nativeExpressAD.setVideoOption((VideoOption) mediationAdSlotValueSet.getGdtVideoOption());
        }
        if (mediationAdSlotValueSet.getGdtVideoOption() instanceof GMAdSlotGDTOption) {
            GMAdSlotGDTOption gMAdSlotGDTOption = (GMAdSlotGDTOption) mediationAdSlotValueSet.getGdtVideoOption();
            VideoOption.Builder builder = new VideoOption.Builder();
            if (gMAdSlotGDTOption != null) {
                builder.setAutoPlayPolicy(gMAdSlotGDTOption.getGDTAutoPlayPolicy());
                builder.setAutoPlayMuted(gMAdSlotGDTOption.isGDTAutoPlayMuted());
                builder.setDetailPageMuted(gMAdSlotGDTOption.isGDTDetailPageMuted());
                builder.setEnableDetailPage(gMAdSlotGDTOption.isGDTEnableDetailPage());
                builder.setEnableUserControl(gMAdSlotGDTOption.isGDTEnableUserControl());
            }
            build = builder.build();
        } else {
            build = new VideoOption.Builder().build();
        }
        nativeExpressAD.setVideoOption(build);
        if (mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy() instanceof DownAPPConfirmPolicy) {
            downAPPConfirmPolicy = (DownAPPConfirmPolicy) mediationAdSlotValueSet.getGdtVideoOption();
        } else if ((mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy() instanceof Integer) && (intValue = ((Integer) mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy()).intValue()) != 0) {
            if (intValue == 1) {
                downAPPConfirmPolicy = DownAPPConfirmPolicy.NOConfirm;
            }
            nativeExpressAD.loadAD(mediationAdSlotValueSet.getAdCount());
        } else {
            downAPPConfirmPolicy = DownAPPConfirmPolicy.Default;
        }
        nativeExpressAD.setDownAPPConfirmPolicy(downAPPConfirmPolicy);
        nativeExpressAD.loadAD(mediationAdSlotValueSet.getAdCount());
    }

    private void b(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        DownAPPConfirmPolicy downAPPConfirmPolicy;
        int intValue;
        NativeUnifiedAD nativeUnifiedAD = isServerBidding() ? new NativeUnifiedAD(context, getAdnId(), this.d, getAdm()) : new NativeUnifiedAD(context, getAdnId(), this.d);
        int gdtMaxVideoDuration = mediationAdSlotValueSet.getGdtMaxVideoDuration();
        int gdtMinVideoDuration = mediationAdSlotValueSet.getGdtMinVideoDuration();
        if (gdtMinVideoDuration > 0) {
            nativeUnifiedAD.setMinVideoDuration(gdtMinVideoDuration);
        }
        if (gdtMaxVideoDuration > 0) {
            nativeUnifiedAD.setMaxVideoDuration(gdtMaxVideoDuration);
        }
        if (mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy() instanceof DownAPPConfirmPolicy) {
            downAPPConfirmPolicy = (DownAPPConfirmPolicy) mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy();
        } else if ((mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy() instanceof Integer) && (intValue = ((Integer) mediationAdSlotValueSet.getGdtDownAPPConfirmPolicy()).intValue()) != 0) {
            if (intValue == 1) {
                downAPPConfirmPolicy = DownAPPConfirmPolicy.NOConfirm;
            }
            nativeUnifiedAD.loadData(mediationAdSlotValueSet.getAdCount());
        } else {
            downAPPConfirmPolicy = DownAPPConfirmPolicy.Default;
        }
        nativeUnifiedAD.setDownAPPConfirmPolicy(downAPPConfirmPolicy);
        nativeUnifiedAD.loadData(mediationAdSlotValueSet.getAdCount());
    }

    public Map<NativeExpressADView, GdtNativeExpressAd> getListenerMap() {
        return e;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        this.a = context;
        this.b = mediationAdSlotValueSet;
        if (mediationAdSlotValueSet.isExpress()) {
            a(context, mediationAdSlotValueSet);
        } else {
            b(context, mediationAdSlotValueSet);
        }
    }
}

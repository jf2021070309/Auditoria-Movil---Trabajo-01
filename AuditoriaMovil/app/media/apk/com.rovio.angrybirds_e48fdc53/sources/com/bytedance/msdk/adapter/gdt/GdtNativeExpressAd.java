package com.bytedance.msdk.adapter.gdt;

import android.os.Handler;
import android.os.Looper;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.ads.nativ.NativeExpressMediaListener;
import com.qq.e.comm.pi.AdData;
import com.qq.e.comm.util.AdError;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class GdtNativeExpressAd extends MediationNativeAd {
    private NativeExpressADView a;
    private volatile boolean b;
    private GdtNativeLoader c;
    private NativeExpressMediaListener d;

    public GdtNativeExpressAd(GdtNativeLoader gdtNativeLoader, Bridge bridge, NativeExpressADView nativeExpressADView) {
        super(gdtNativeLoader, bridge);
        this.b = false;
        this.d = new NativeExpressMediaListener() { // from class: com.bytedance.msdk.adapter.gdt.GdtNativeExpressAd.1
            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoCached(NativeExpressADView nativeExpressADView2) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoComplete(NativeExpressADView nativeExpressADView2) {
                GdtNativeExpressAd.this.notifyOnVideoComplete();
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoError(NativeExpressADView nativeExpressADView2, AdError adError) {
                GdtNativeExpressAd gdtNativeExpressAd = GdtNativeExpressAd.this;
                if (adError != null) {
                    gdtNativeExpressAd.notifyOnVideoError(adError.getErrorCode(), adError.getErrorMsg());
                } else {
                    gdtNativeExpressAd.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "aderror is null");
                }
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoInit(NativeExpressADView nativeExpressADView2) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoLoading(NativeExpressADView nativeExpressADView2) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoPageClose(NativeExpressADView nativeExpressADView2) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoPageOpen(NativeExpressADView nativeExpressADView2) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoPause(NativeExpressADView nativeExpressADView2) {
                GdtNativeExpressAd.this.notifyOnVideoPause();
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoReady(NativeExpressADView nativeExpressADView2, long j) {
            }

            @Override // com.qq.e.ads.nativ.NativeExpressMediaListener
            public void onVideoStart(NativeExpressADView nativeExpressADView2) {
                GdtNativeExpressAd.this.notifyOnVideoStart();
            }
        };
        this.a = nativeExpressADView;
        this.c = gdtNativeLoader;
        a();
    }

    private void a() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        AdData boundData = this.a.getBoundData();
        if (boundData.getAdPatternType() == 2) {
            this.a.setMediaListener(this.d);
            create.add(8060, 5);
        } else if (boundData.getAdPatternType() == 4 || boundData.getAdPatternType() == 1 || boundData.getAdPatternType() != 3) {
            create.add(8060, 3);
        } else {
            create.add(8060, 4);
        }
        create.add(8033, true);
        create.add(8045, boundData.getTitle());
        create.add(8046, boundData.getDesc());
        create.add(8059, 3);
        if (isClientBidding()) {
            create.add(8016, Math.max(boundData.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
        } else if (isMultiBidding()) {
            create.add(8058, boundData.getECPMLevel());
        }
        create.add(8033, true);
        notifyNativeValue(create.build());
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        Map map;
        if (i == 6083) {
            NativeExpressADView nativeExpressADView = this.a;
            if (nativeExpressADView != null) {
                nativeExpressADView.render();
            }
        } else if (i == 6081) {
            if (isServerBidding()) {
                NativeExpressADView nativeExpressADView2 = this.a;
                nativeExpressADView2.setBidECPM(nativeExpressADView2.getECPM());
            }
            return (T) this.a;
        } else if (i == 8135) {
            return (T) true;
        } else {
            if (i == 8109) {
                this.b = true;
                if (this.c.getListenerMap() != null) {
                    this.c.getListenerMap().remove(this.a);
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.msdk.adapter.gdt.GdtNativeExpressAd.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (GdtNativeExpressAd.this.a != null) {
                            GdtNativeExpressAd.this.a.destroy();
                        }
                    }
                });
            } else if (i == 8120) {
                return (T) Boolean.valueOf(this.b);
            } else {
                try {
                    if (i == 8142) {
                        NativeExpressADView nativeExpressADView3 = this.a;
                        if (nativeExpressADView3 != null) {
                            nativeExpressADView3.sendWinNotification((int) getCpm());
                        }
                    } else if (i == 8144 && (map = (Map) valueSet.objectValue(8006, Map.class)) != null && this.a != null) {
                        Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
                        if (obj instanceof MediationConstant.BiddingLossReason) {
                            this.a.sendLossNotification(0, GDTAdapterUtils.getBiddingLossReason((MediationConstant.BiddingLossReason) obj), null);
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    public void onCloseAd() {
        notifyDislikeClick("gdt信息流模板dislike接口无关闭原因", new HashMap());
        notifyDislikeSelect(-1, "gdt信息流模板dislike接口无关闭原因");
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}

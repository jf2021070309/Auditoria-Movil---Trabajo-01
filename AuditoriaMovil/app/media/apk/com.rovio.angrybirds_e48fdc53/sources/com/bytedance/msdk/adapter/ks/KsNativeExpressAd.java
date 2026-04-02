package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.AdError;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsFeedAd;
import java.util.HashMap;
/* loaded from: classes.dex */
public class KsNativeExpressAd extends MediationNativeAd {
    private KsFeedAd a;
    private MediationAdSlotValueSet b;
    private Context c;

    public KsNativeExpressAd(Context context, KsFeedAd ksFeedAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge, KsNativeLoader ksNativeLoader) {
        super(ksNativeLoader, bridge);
        this.a = ksFeedAd;
        this.c = context;
        this.b = mediationAdSlotValueSet;
        a();
    }

    private void a() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        if (isClientBidding()) {
            create.add(8016, Math.max(this.a.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
        }
        create.add(8033, true);
        notifyNativeValue(create.build());
        this.a.setAdInteractionListener(new KsFeedAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsNativeExpressAd.1
            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdClicked() {
                KsNativeExpressAd.this.notifyOnClickAd();
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onAdShow() {
                KsNativeExpressAd.this.notifyOnShowAd();
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDislikeClicked() {
                KsNativeExpressAd.this.notifyDislikeClick("ks信息流模板dislike接口无关闭原因", new HashMap());
                KsNativeExpressAd.this.notifyDislikeSelect(-1, "ks信息流模板dislike接口无关闭原因");
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogDismiss() {
            }

            @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
            public void onDownloadTipsDialogShow() {
            }
        });
        if (this.b != null) {
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
            kSAdVideoPlayConfigImpl.setVideoSoundEnable(!this.b.isMuted());
            this.a.setVideoPlayConfig(kSAdVideoPlayConfigImpl);
        }
    }

    private void a(int i, String str) {
        notifyRenderFail(null, i, str);
    }

    private void b() {
        notifyRenderSuccess(-1.0f, -2.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 6083) {
            KsFeedAd ksFeedAd = this.a;
            if (ksFeedAd == null || ksFeedAd.getFeedView(this.c) == null) {
                a(MediationConstant.ErrorCode.ADN_AD_RENDER_FAIL, AdError.ERROR_MEDIA_RENDER_MSG);
            } else {
                b();
            }
        } else if (i == 6081) {
            KsFeedAd ksFeedAd2 = this.a;
            if (ksFeedAd2 != null) {
                return (T) ksFeedAd2.getFeedView(this.c);
            }
        } else if (i == 8135) {
            return (T) true;
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}

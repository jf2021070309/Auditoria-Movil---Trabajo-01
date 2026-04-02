package com.bytedance.msdk.adapter.ks;

import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.sdk.api.KsDrawAd;
/* loaded from: classes.dex */
public class KsDrawExpressAd extends MediationNativeAd {
    private KsDrawAd a;
    private Context b;
    private View c;
    private MediationAdSlotValueSet d;

    public KsDrawExpressAd(Context context, MediationAdLoaderImpl mediationAdLoaderImpl, Bridge bridge, KsDrawAd ksDrawAd, MediationAdSlotValueSet mediationAdSlotValueSet) {
        super(mediationAdLoaderImpl, bridge);
        this.a = ksDrawAd;
        this.b = context;
        this.d = mediationAdSlotValueSet;
        a();
    }

    private void a() {
        MediationValueSetBuilder create = MediationValueSetBuilder.create();
        create.add(8055, this.a.getInteractionType() == 1);
        create.add(8060, this.a.getInteractionType() == 1 ? 4 : this.a.getInteractionType() == 2 ? 3 : -1);
        if (isClientBidding()) {
            create.add(8016, Math.max(this.a.getECPM(), (double) PangleAdapterUtils.CPM_DEFLAUT_VALUE));
        }
        create.add(8033, true);
        notifyNativeValue(create.build());
        this.a.setAdInteractionListener(new KsDrawAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.ks.KsDrawExpressAd.1
            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onAdClicked() {
                KsDrawExpressAd.this.notifyOnClickAd();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onAdShow() {
                KsDrawExpressAd.this.notifyOnShowAd();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayEnd() {
                KsDrawExpressAd.this.notifyOnVideoComplete();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayError() {
                KsDrawExpressAd.this.notifyOnVideoError(MediationConstant.ErrorCode.ADN_AD_VIDEO_ERROR, "no msg");
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayPause() {
                KsDrawExpressAd.this.notifyOnVideoPause();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayResume() {
                KsDrawExpressAd.this.notifyOnVideoResume();
            }

            @Override // com.kwad.sdk.api.KsDrawAd.AdInteractionListener
            public void onVideoPlayStart() {
                KsDrawExpressAd.this.notifyOnVideoStart();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.native_ad.MediationNativeAd, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 6083) {
            KsDrawAd ksDrawAd = this.a;
            if (ksDrawAd != null) {
                this.c = ksDrawAd.getDrawView(this.b);
                notifyRenderSuccess(this.d.getWidth(), this.d.getHeight());
            }
        } else if (i == 6081) {
            return (T) this.c;
        } else {
            if (i == 8120) {
                return (T) Boolean.valueOf(this.a == null);
            } else if (i == 8109) {
                this.a = null;
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }
}

package com.bytedance.msdk.adapter.ks;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.sdk.api.KsAdSDK;
import com.kwad.sdk.api.KsFeedAd;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.KsScene;
import java.util.List;
/* loaded from: classes.dex */
public class KsBannerLoader extends KsBaseLoader {
    private Context a;
    private MediationAdSlotValueSet b;
    private Bridge c;

    /* loaded from: classes.dex */
    class TTKsExpressAd extends MediationBaseAdBridge {
        KsFeedAd a;

        public TTKsExpressAd(KsFeedAd ksFeedAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            this.a = ksFeedAd;
            if (KsBannerLoader.this.isClientBidding()) {
                int ecpm = ksFeedAd.getECPM();
                setCpm(ecpm > 0 ? ecpm : PangleAdapterUtils.CPM_DEFLAUT_VALUE);
            }
            this.a.setAdInteractionListener(new KsFeedAd.AdInteractionListener(KsBannerLoader.this) { // from class: com.bytedance.msdk.adapter.ks.KsBannerLoader.TTKsExpressAd.1
                @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
                public void onAdClicked() {
                    Bridge bridge2 = TTKsExpressAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1009, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
                public void onAdShow() {
                    Bridge bridge2 = TTKsExpressAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1008, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
                public void onDislikeClicked() {
                    Bridge bridge2 = TTKsExpressAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1014, null, Void.class);
                    }
                }

                @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
                public void onDownloadTipsDialogDismiss() {
                }

                @Override // com.kwad.sdk.api.KsFeedAd.AdInteractionListener
                public void onDownloadTipsDialogShow() {
                }
            });
            if (KsBannerLoader.this.b != null) {
                KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = new KSAdVideoPlayConfigImpl();
                kSAdVideoPlayConfigImpl.setVideoSoundEnable(!KsBannerLoader.this.b.isMuted());
                ksFeedAd.setVideoPlayConfig(kSAdVideoPlayConfigImpl);
            }
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8033, true);
            bridge.call(8140, create.build(), Void.class);
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 6081) {
                return (T) getAdView();
            }
            if (i == 8121) {
                return (T) isReadyStatus();
            }
            if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i == 8109) {
                onDestroy();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @JProtect
        public View getAdView() {
            KsFeedAd ksFeedAd = this.a;
            if (ksFeedAd != null) {
                return ksFeedAd.getFeedView(KsBannerLoader.this.a);
            }
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return false;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
        }

        public void render() {
            KsBannerLoader ksBannerLoader;
            String str;
            KsFeedAd ksFeedAd = this.a;
            if (ksFeedAd == null) {
                ksBannerLoader = KsBannerLoader.this;
                str = "render fail, ksFeedAd is null";
            } else if (ksFeedAd.getFeedView(KsBannerLoader.this.a) != null) {
                KsBannerLoader.this.notifyAdSuccess(this, this.mGMAd);
                return;
            } else {
                ksBannerLoader = KsBannerLoader.this;
                str = "render fail, expressView is null";
            }
            ksBannerLoader.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, str);
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class TTKsNativeAd extends MediationBaseAdBridge {
        KsNativeAd a;
        KsNativeAd.AdInteractionListener b;
        KsNativeAd.VideoPlayListener c;

        /* JADX WARN: Code restructure failed: missing block: B:55:0x01f5, code lost:
            if (r11 != null) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TTKsNativeAd(com.kwad.sdk.api.KsNativeAd r12, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r13, com.bykv.vk.openvk.api.proto.Bridge r14) {
            /*
                Method dump skipped, instructions count: 527
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsBannerLoader.TTKsNativeAd.<init>(com.bytedance.msdk.adapter.ks.KsBannerLoader, com.kwad.sdk.api.KsNativeAd, com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet, com.bykv.vk.openvk.api.proto.Bridge):void");
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
            if (i == 8121) {
                return (T) isReadyStatus();
            }
            if (i == 8120) {
                return (T) Boolean.valueOf(hasDestroyed());
            }
            if (i == 8159) {
                Activity activity = (Activity) valueSet.objectValue(20033, Activity.class);
                ViewGroup viewGroup = (ViewGroup) valueSet.objectValue(8067, ViewGroup.class);
                List<View> list = (List) valueSet.objectValue(8068, List.class);
                List<View> list2 = (List) valueSet.objectValue(8069, List.class);
                List list3 = (List) valueSet.objectValue(8070, List.class);
                registerView(activity, viewGroup, list, list2, (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
            } else if (i == 8109) {
                onDestroy();
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.a == null;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            KsNativeAd ksNativeAd = this.a;
            if (ksNativeAd != null) {
                ksNativeAd.setVideoPlayListener(null);
                this.a = null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[PHI: r8 
          PHI: (r8v4 boolean) = (r8v3 boolean), (r8v5 boolean) binds: [B:34:0x00c2, B:31:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c2 -> B:39:0x00cc). Please submit an issue!!! */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void registerView(android.app.Activity r6, android.view.ViewGroup r7, java.util.List<android.view.View> r8, java.util.List<android.view.View> r9, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder r10) {
            /*
                r5 = this;
                if (r8 == 0) goto L7
                if (r9 == 0) goto L7
                r8.addAll(r9)
            L7:
                com.kwad.sdk.api.KsNativeAd r6 = r5.a
                if (r6 == 0) goto L10
                com.kwad.sdk.api.KsNativeAd$AdInteractionListener r9 = r5.b
                r6.registerViewForInteraction(r7, r8, r9)
            L10:
                com.kwad.sdk.api.KsNativeAd r6 = r5.a
                r8 = -1
                r9 = 0
                r0 = 1
                if (r6 == 0) goto L74
                java.lang.String r6 = r6.getAdSourceLogoUrl(r0)
                if (r6 == 0) goto L74
                int r6 = r10.logoLayoutId
                android.view.View r6 = r7.findViewById(r6)
                if (r6 == 0) goto L74
                r6.setVisibility(r9)
                boolean r1 = r6 instanceof android.view.ViewGroup
                if (r1 == 0) goto L57
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r6.removeAllViews()
                android.widget.ImageView r1 = new android.widget.ImageView
                com.bytedance.msdk.adapter.ks.KsBannerLoader r2 = com.bytedance.msdk.adapter.ks.KsBannerLoader.this
                android.content.Context r2 = com.bytedance.msdk.adapter.ks.KsBannerLoader.c(r2)
                r1.<init>(r2)
                com.bytedance.msdk.adapter.ks.DownloadImageTask r2 = new com.bytedance.msdk.adapter.ks.DownloadImageTask
                r2.<init>(r1)
                java.lang.String[] r3 = new java.lang.String[r0]
                com.kwad.sdk.api.KsNativeAd r4 = r5.a
                java.lang.String r4 = r4.getAdSourceLogoUrl(r0)
                r3[r9] = r4
                r2.execute(r3)
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE
                r1.setScaleType(r2)
                r6.addView(r1, r8, r8)
                goto L74
            L57:
                boolean r1 = r6 instanceof android.widget.ImageView
                if (r1 == 0) goto L74
                com.bytedance.msdk.adapter.ks.DownloadImageTask r1 = new com.bytedance.msdk.adapter.ks.DownloadImageTask
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r1.<init>(r6)
                java.lang.String[] r2 = new java.lang.String[r0]
                com.kwad.sdk.api.KsNativeAd r3 = r5.a
                java.lang.String r3 = r3.getAdSourceLogoUrl(r0)
                r2[r9] = r3
                r1.execute(r2)
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
                r6.setScaleType(r1)
            L74:
                int r6 = r10.mediaViewId
                android.view.View r6 = r7.findViewById(r6)
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                com.kwad.sdk.api.KsNativeAd r7 = r5.a
                if (r7 == 0) goto Lcf
                r7 = 41
                if (r6 == 0) goto Lbf
                com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl r10 = new com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl
                r10.<init>()
                com.bytedance.msdk.adapter.ks.KsBannerLoader r1 = com.bytedance.msdk.adapter.ks.KsBannerLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.ks.KsBannerLoader.a(r1)
                if (r1 == 0) goto L9e
                com.bytedance.msdk.adapter.ks.KsBannerLoader r1 = com.bytedance.msdk.adapter.ks.KsBannerLoader.this
                com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r1 = com.bytedance.msdk.adapter.ks.KsBannerLoader.a(r1)
                boolean r1 = r1.isMuted()
                if (r1 != 0) goto L9e
                r9 = r0
            L9e:
                r10.setVideoSoundEnable(r9)
                com.kwad.sdk.api.KsNativeAd r9 = r5.a
                com.bytedance.msdk.adapter.ks.KsBannerLoader r0 = com.bytedance.msdk.adapter.ks.KsBannerLoader.this
                android.content.Context r0 = com.bytedance.msdk.adapter.ks.KsBannerLoader.c(r0)
                android.view.View r9 = r9.getVideoView(r0, r10)
                if (r9 != 0) goto Lb3
                r6 = 62
                r8 = r6
                goto Lcc
            Lb3:
                com.bytedance.msdk.adapter.ks.KsBannerLoader r7 = com.bytedance.msdk.adapter.ks.KsBannerLoader.this
                r7.removeSelfFromParent(r9)
                r6.removeAllViews()
                r6.addView(r9, r8, r8)
                goto Lcf
            Lbf:
                r6 = 53
                r8 = r7
            Lc2:
                switch(r6) {
                    case 51: goto Lcb;
                    case 52: goto Lcb;
                    case 53: goto Lc6;
                    default: goto Lc5;
                }
            Lc5:
                goto Lcc
            Lc6:
                if (r8 == r7) goto Lcf
                r6 = 42
                goto Lcf
            Lcb:
                return
            Lcc:
                r6 = 51
                goto Lc2
            Lcf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.ks.KsBannerLoader.TTKsNativeAd.registerView(android.app.Activity, android.view.ViewGroup, java.util.List, java.util.List, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder):void");
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    @JProtect
    private void a(KsScene ksScene) {
        KsAdSDK.getLoadManager().loadConfigFeedAd(ksScene, new KsLoadManager.FeedAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsBannerLoader.1
            @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
            public void onError(int i, String str) {
                KsBannerLoader.this.notifyAdFailed(i, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.FeedAdListener
            public void onFeedAdLoad(List<KsFeedAd> list) {
                if (list == null || list.isEmpty()) {
                    KsBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功，list为空");
                    return;
                }
                for (KsFeedAd ksFeedAd : list) {
                    if (ksFeedAd != null) {
                        KsBannerLoader ksBannerLoader = KsBannerLoader.this;
                        new TTKsExpressAd(ksFeedAd, ksBannerLoader.b, KsBannerLoader.this.c).render();
                        return;
                    }
                }
            }
        });
    }

    @JProtect
    private void b(KsScene ksScene) {
        KsAdSDK.getLoadManager().loadNativeAd(ksScene, new KsLoadManager.NativeAdListener() { // from class: com.bytedance.msdk.adapter.ks.KsBannerLoader.2
            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onError(int i, String str) {
                KsBannerLoader.this.notifyAdFailed(i, str);
            }

            @Override // com.kwad.sdk.api.KsLoadManager.NativeAdListener
            public void onNativeAdLoad(List<KsNativeAd> list) {
                if (list == null || list.isEmpty()) {
                    KsBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load成功，list为空");
                    return;
                }
                for (KsNativeAd ksNativeAd : list) {
                    if (ksNativeAd != null) {
                        KsBannerLoader ksBannerLoader = KsBannerLoader.this;
                        ksBannerLoader.notifyAdSuccess(new TTKsNativeAd(ksNativeAd, ksBannerLoader.b, KsBannerLoader.this.c), KsBannerLoader.this.c);
                        return;
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl
    public void realLoader(Context context, MediationAdSlotValueSet mediationAdSlotValueSet) {
        String str;
        if (context == null || mediationAdSlotValueSet == null) {
            str = "context is null or adSlotValueSet is null";
        } else {
            this.a = context;
            this.b = mediationAdSlotValueSet;
            this.c = getGMBridge();
            try {
                KsScene build = new KsScene.Builder(Long.valueOf(getAdnId()).longValue()).adNum(1).build();
                if (mediationAdSlotValueSet.getAdSubType() == 4) {
                    int originType = mediationAdSlotValueSet.getOriginType();
                    if (originType == 1) {
                        float expressWidth = mediationAdSlotValueSet.getExpressWidth();
                        if (context != null && expressWidth > 0.0f) {
                            int dip2Px = (int) Utils.dip2Px(context, expressWidth);
                            Log.i("TTMediationSDK", "ks banner native express widthDp:" + expressWidth + "  width:" + dip2Px);
                            build.setWidth(dip2Px);
                        }
                        a(build);
                        return;
                    } else if (originType == 2) {
                        b(build);
                        return;
                    } else {
                        str = "广告类型错误";
                    }
                } else {
                    str = "ks不支持banner";
                }
            } catch (Exception e) {
                notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "广告位id错误");
                return;
            }
        }
        notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, str);
    }
}

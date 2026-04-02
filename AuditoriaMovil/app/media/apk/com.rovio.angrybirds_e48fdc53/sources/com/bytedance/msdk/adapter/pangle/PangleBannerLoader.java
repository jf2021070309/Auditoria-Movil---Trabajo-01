package com.bytedance.msdk.adapter.pangle;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.JProtect;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.adapter.util.ThreadHelper;
import com.bytedance.msdk.api.UIUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ComplianceInfo;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationAdLoaderImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class PangleBannerLoader extends MediationAdLoaderImpl {
    private Context a;
    private MediationAdSlotValueSet b;
    private Bridge c;

    /* loaded from: classes.dex */
    class PangleNativeAd extends MediationBaseAdBridge {
        private TTFeedAd a;
        private volatile boolean b;
        TTNativeAd.AdInteractionListener c;

        PangleNativeAd(TTFeedAd tTFeedAd) {
            super(PangleBannerLoader.this.b, PangleBannerLoader.this.c);
            Map<String, Object> mediaExtraInfo;
            this.b = false;
            this.c = new TTNativeAd.AdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeAd.3
                @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
                @JProtect
                public void onAdClicked(View view, TTNativeAd tTNativeAd) {
                    Bridge bridge = PangleNativeAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
                @JProtect
                public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
                    Bridge bridge = PangleNativeAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
                @JProtect
                public void onAdShow(TTNativeAd tTNativeAd) {
                    Bridge bridge = PangleNativeAd.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }
            };
            this.a = tTFeedAd;
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            ComplianceInfo complianceInfo = tTFeedAd.getComplianceInfo();
            if (complianceInfo != null) {
                create.add(8056, complianceInfo.getAppName());
                create.add(8057, complianceInfo.getDeveloperName());
                create.add(8080, complianceInfo.getPrivacyUrl());
                create.add(8081, complianceInfo.getAppVersion());
                HashMap hashMap = new HashMap();
                Map<String, String> permissionsMap = complianceInfo.getPermissionsMap();
                if (permissionsMap != null && permissionsMap.size() > 0) {
                    hashMap.putAll(permissionsMap);
                }
                create.add(8427, hashMap);
            }
            create.add(8045, tTFeedAd.getTitle());
            create.add(8046, tTFeedAd.getDescription());
            create.add(8061, tTFeedAd.getButtonText());
            create.add(8048, tTFeedAd.getIcon() != null ? tTFeedAd.getIcon().getImageUrl() : null);
            create.add(8059, tTFeedAd.getInteractionType());
            create.add(8049, tTFeedAd.getSource());
            create.add(8082, tTFeedAd.getAppScore());
            create.add(8055, tTFeedAd.getInteractionType() == 4);
            create.add(8033, false);
            if (tTFeedAd.getImageMode() == 16 || tTFeedAd.getImageMode() == 3 || tTFeedAd.getImageMode() == 2) {
                if (tTFeedAd.getImageList() != null && !tTFeedAd.getImageList().isEmpty() && tTFeedAd.getImageList().get(0) != null) {
                    TTImage tTImage = tTFeedAd.getImageList().get(0);
                    create.add(8050, tTImage.getImageUrl());
                    create.add(8052, tTImage.getWidth());
                    create.add(8051, tTImage.getHeight());
                }
            } else if (tTFeedAd.getImageMode() == 4 && tTFeedAd.getImageList() != null && tTFeedAd.getImageList().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (TTImage tTImage2 : tTFeedAd.getImageList()) {
                    arrayList.add(tTImage2.getImageUrl());
                }
                create.add(8053, arrayList);
            }
            this.mGMAd.call(8140, create.build(), Void.class);
            setImageMode(tTFeedAd.getImageMode());
            if (!PangleBannerLoader.this.isClientBidding() || (mediaExtraInfo = tTFeedAd.getMediaExtraInfo()) == null) {
                return;
            }
            double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
            Logger.d("TTMediationSDK_ECMP", "pangle native 返回的 cpm价格：" + value);
            setCpm(value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE ? 0.0d : value);
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
                registerViewForInteraction(activity, viewGroup, list, list2, (MediationViewBinder) valueSet.objectValue(8071, MediationViewBinder.class));
            } else if (i == 8109) {
                onDestroy();
            } else if (i == 8147) {
                return (T) getReqId();
            } else {
                if (i == 8239) {
                    return (T) getMediaExtraInfo();
                }
                if (i == 8245) {
                    return (T) Long.valueOf(getCreativeId());
                }
                if (i == 8246) {
                    return (T) Long.valueOf(getAdId());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return PangleAdapterUtils.getAdId(tTFeedAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public long getCreativeId() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return PangleAdapterUtils.getCreativeId(tTFeedAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd == null || (mediaExtraInfo = tTFeedAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTFeedAd tTFeedAd = this.a;
            return tTFeedAd != null ? PangleAdapterUtils.getReqId(tTFeedAd.getMediaExtraInfo()) : "";
        }

        public int getVideoHeight() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return tTFeedAd.getAdViewHeight();
            }
            return 0;
        }

        public int getVideoWidth() {
            TTFeedAd tTFeedAd = this.a;
            if (tTFeedAd != null) {
                return tTFeedAd.getAdViewWidth();
            }
            return 0;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.b;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.b = true;
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeAd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (PangleNativeAd.this.a != null) {
                        PangleNativeAd.this.a.setVideoAdListener(null);
                        PangleNativeAd.this.a.destroy();
                    }
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a8 -> B:31:0x00ad). Please submit an issue!!! */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void registerViewForInteraction(android.app.Activity r5, android.view.ViewGroup r6, java.util.List<android.view.View> r7, java.util.List<android.view.View> r8, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder r9) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.bytedance.msdk.api.format.TTNativeAdView
                if (r0 == 0) goto Lb0
                com.bytedance.sdk.openadsdk.TTFeedAd r0 = r4.a
                if (r0 == 0) goto L17
                com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r1 = r4.c
                r0.registerViewForInteraction(r6, r7, r8, r1)
                com.bytedance.sdk.openadsdk.TTFeedAd r7 = r4.a
                com.bytedance.msdk.adapter.pangle.PangleBannerLoader$PangleNativeAd$1 r8 = new com.bytedance.msdk.adapter.pangle.PangleBannerLoader$PangleNativeAd$1
                r8.<init>()
                r7.setDislikeCallback(r5, r8)
            L17:
                com.bytedance.sdk.openadsdk.TTFeedAd r5 = r4.a
                r7 = -1
                if (r5 == 0) goto L85
                android.graphics.Bitmap r5 = r5.getAdLogo()
                if (r5 == 0) goto L85
                int r5 = r9.logoLayoutId
                android.view.View r5 = r6.findViewById(r5)
                if (r5 == 0) goto L85
                r8 = 0
                r5.setVisibility(r8)
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L76
                r8 = r5
                android.view.ViewGroup r8 = (android.view.ViewGroup) r8
                r8.removeAllViews()
                android.widget.ImageView r0 = new android.widget.ImageView
                com.bytedance.msdk.adapter.pangle.PangleBannerLoader r1 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.this
                android.content.Context r1 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.c(r1)
                r0.<init>(r1)
                com.bytedance.sdk.openadsdk.TTFeedAd r1 = r4.a
                android.graphics.Bitmap r1 = r1.getAdLogo()
                r0.setImageBitmap(r1)
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
                r0.setScaleType(r1)
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.bytedance.msdk.adapter.pangle.PangleBannerLoader r2 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.this
                android.content.Context r2 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.c(r2)
                r3 = 1108869120(0x42180000, float:38.0)
                int r2 = com.bytedance.msdk.adapter.util.UIUtils.dp2px(r2, r3)
                r1.width = r2
                com.bytedance.msdk.adapter.pangle.PangleBannerLoader r2 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.this
                android.content.Context r2 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.c(r2)
                int r2 = com.bytedance.msdk.adapter.util.UIUtils.dp2px(r2, r3)
                r1.height = r2
                r5.setLayoutParams(r1)
                r8.addView(r0, r7, r7)
                goto L85
            L76:
                boolean r8 = r5 instanceof android.widget.ImageView
                if (r8 == 0) goto L85
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                com.bytedance.sdk.openadsdk.TTFeedAd r8 = r4.a
                android.graphics.Bitmap r8 = r8.getAdLogo()
                r5.setImageBitmap(r8)
            L85:
                int r5 = r9.mediaViewId
                android.view.View r5 = r6.findViewById(r5)
                com.bytedance.msdk.api.format.TTMediaView r5 = (com.bytedance.msdk.api.format.TTMediaView) r5
                if (r5 == 0) goto Lb0
                com.bytedance.sdk.openadsdk.TTFeedAd r6 = r4.a
                if (r6 == 0) goto La6
                android.view.View r6 = r6.getAdView()
                if (r6 != 0) goto L9a
                goto Lac
            L9a:
                com.bytedance.msdk.adapter.pangle.PangleBannerLoader r8 = com.bytedance.msdk.adapter.pangle.PangleBannerLoader.this
                r8.removeSelfFromParent(r6)
                r5.removeAllViews()
                r5.addView(r6, r7, r7)
                goto Lad
            La6:
                r5 = 23
            La8:
                switch(r5) {
                    case 21: goto Lac;
                    case 22: goto Lb0;
                    case 23: goto Lb0;
                    default: goto Lab;
                }
            Lab:
                goto Lad
            Lac:
                return
            Lad:
                r5 = 22
                goto La8
            Lb0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeAd.registerViewForInteraction(android.app.Activity, android.view.ViewGroup, java.util.List, java.util.List, com.bytedance.sdk.openadsdk.mediation.ad.MediationViewBinder):void");
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class PangleNativeExpressAd extends MediationBaseAdBridge {
        TTNativeExpressAd a;
        private volatile boolean b;
        TTNativeExpressAd.ExpressAdInteractionListener c;

        PangleNativeExpressAd(TTNativeExpressAd tTNativeExpressAd, MediationAdSlotValueSet mediationAdSlotValueSet, Bridge bridge) {
            super(mediationAdSlotValueSet, bridge);
            Map<String, Object> mediaExtraInfo;
            this.b = false;
            TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeExpressAd.3
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdClicked(View view, int i) {
                    Bridge bridge2 = PangleNativeExpressAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1009, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdShow(View view, int i) {
                    Bridge bridge2 = PangleNativeExpressAd.this.mGMAd;
                    if (bridge2 != null) {
                        bridge2.call(1008, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderFail(View view, String str, int i) {
                    PangleBannerLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderSuccess(View view, float f, float f2) {
                    PangleNativeExpressAd pangleNativeExpressAd = PangleNativeExpressAd.this;
                    PangleBannerLoader.this.notifyAdSuccess(pangleNativeExpressAd, pangleNativeExpressAd.mGMAd);
                }
            };
            this.c = expressAdInteractionListener;
            this.a = tTNativeExpressAd;
            tTNativeExpressAd.setExpressInteractionListener(expressAdInteractionListener);
            if (PangleBannerLoader.this.a instanceof Activity) {
                this.a.setDislikeCallback((Activity) PangleBannerLoader.this.a, new TTAdDislike.DislikeInteractionCallback(PangleBannerLoader.this) { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeExpressAd.1
                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onCancel() {
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onSelected(int i, String str, boolean z) {
                        Bridge bridge2 = PangleNativeExpressAd.this.mGMAd;
                        if (bridge2 != null) {
                            bridge2.call(1014, null, Void.class);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onShow() {
                    }
                });
            }
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8059, this.a.getInteractionType());
            create.add(8033, true);
            bridge.call(8140, create.build(), Void.class);
            setImageMode(this.a.getImageMode());
            if (!PangleBannerLoader.this.isClientBidding() || (mediaExtraInfo = this.a.getMediaExtraInfo()) == null) {
                return;
            }
            double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
            Logger.d("TTMediationSDK_ECMP", "banner混存 pangle 模板native 返回的 cpm价格：" + value);
            setCpm(value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE ? 0.0d : value);
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
            } else if (i == 8147) {
                return (T) getReqId();
            } else {
                if (i == 8239) {
                    return (T) getMediaExtraInfo();
                }
                if (i == 8245) {
                    return (T) Long.valueOf(getCreativeId());
                }
                if (i == 8246) {
                    return (T) Long.valueOf(getAdId());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getAdId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public View getAdView() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return tTNativeExpressAd.getExpressAdView();
            }
            return null;
        }

        public long getCreativeId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getCreativeId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd == null || (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            return tTNativeExpressAd != null ? PangleAdapterUtils.getReqId(tTNativeExpressAd.getMediaExtraInfo()) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.b;
        }

        public boolean hasDislike() {
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.b = true;
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.PangleNativeExpressAd.2
                @Override // java.lang.Runnable
                public void run() {
                    TTNativeExpressAd tTNativeExpressAd = PangleNativeExpressAd.this.a;
                    if (tTNativeExpressAd != null) {
                        tTNativeExpressAd.destroy();
                    }
                }
            });
        }

        public void render() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                tTNativeExpressAd.render();
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class TTBannerView extends MediationBaseAdBridge {
        TTNativeExpressAd a;
        View b;
        final Object c;
        private boolean d;
        private volatile boolean e;
        TTNativeExpressAd.ExpressAdInteractionListener f;

        TTBannerView() {
            super(PangleBannerLoader.this.b, PangleBannerLoader.this.c);
            this.c = new Object();
            this.e = false;
            this.f = new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.TTBannerView.3
                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdClicked(View view, int i) {
                    Bridge bridge = TTBannerView.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1009, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onAdShow(View view, int i) {
                    Bridge bridge = TTBannerView.this.mGMAd;
                    if (bridge != null) {
                        bridge.call(1008, null, Void.class);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderFail(View view, String str, int i) {
                    TTBannerView.this.d = false;
                    Logger.e("TTMediationSDK_banner", TTLogUtil.getTagThirdLevelById(PangleBannerLoader.this.getRitId(), PangleBannerLoader.this.getAdnId()) + "TTBannerView onRenderFail -> code=" + i + ",msg=" + str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
                @JProtect
                public void onRenderSuccess(View view, float f, float f2) {
                    Logger.e("TTMediationSDK_banner", TTLogUtil.getTagThirdLevelById(PangleBannerLoader.this.getRitId(), PangleBannerLoader.this.getAdnId()) + "TTBannerView onRenderSuccess 渲染成功！！");
                    if (TTBannerView.this.b instanceof FrameLayout) {
                        UIUtils.removeFromParent(view);
                        ((FrameLayout) TTBannerView.this.b).addView(view, new ViewGroup.LayoutParams(-1, -1));
                    }
                    TTBannerView.this.d = true;
                }
            };
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
            } else if (i == 8147) {
                return (T) getReqId();
            } else {
                if (i == 8239) {
                    return (T) getMediaExtraInfo();
                }
                if (i == 8245) {
                    return (T) Long.valueOf(getCreativeId());
                }
                if (i == 8246) {
                    return (T) Long.valueOf(getAdId());
                }
            }
            return (T) MediationValueUtil.checkClassType(cls);
        }

        public long getAdId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getAdId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
            r0 = r6.c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
            if (r6.b != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
            r1 = android.os.SystemClock.uptimeMillis();
            r3 = 2000 + r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
            if (r6.d != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
            if (r1 >= r3) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
            r6.c.wait(r3 - r1);
            r1 = android.os.SystemClock.uptimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
            r1.printStackTrace();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0001, code lost:
            continue;
         */
        @com.bytedance.JProtect
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized android.view.View getAdView() {
            /*
                r6 = this;
                monitor-enter(r6)
            L1:
                r0 = 95
                r1 = r0
            L4:
                switch(r0) {
                    case 94: goto Lf;
                    case 95: goto L8;
                    case 96: goto Lb;
                    default: goto L7;
                }
            L7:
                goto L45
            L8:
                switch(r1) {
                    case 94: goto L1;
                    case 95: goto L45;
                    case 96: goto L1;
                    default: goto Lb;
                }
            Lb:
                switch(r1) {
                    case 55: goto L45;
                    case 56: goto L45;
                    case 57: goto L45;
                    default: goto Le;
                }
            Le:
                goto L14
            Lf:
                r0 = 39
                if (r1 != r0) goto L14
                goto L1
            L14:
                java.lang.Object r0 = r6.c     // Catch: java.lang.Throwable -> L42
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L42
                android.view.View r1 = r6.b     // Catch: java.lang.Throwable -> L3f
                if (r1 != 0) goto L3a
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L3f
                r3 = 2000(0x7d0, double:9.88E-321)
                long r3 = r3 + r1
            L22:
                boolean r5 = r6.d     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L3f
                if (r5 != 0) goto L3a
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L3a
                java.lang.Object r5 = r6.c     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L3f
                long r1 = r3 - r1
                r5.wait(r1)     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L3f
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L3f
                goto L22
            L36:
                r1 = move-exception
                r1.printStackTrace()     // Catch: java.lang.Throwable -> L3f
            L3a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
                android.view.View r0 = r6.b     // Catch: java.lang.Throwable -> L42
                monitor-exit(r6)
                return r0
            L3f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
                throw r1     // Catch: java.lang.Throwable -> L42
            L42:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L45:
                r0 = 94
                r1 = 125(0x7d, float:1.75E-43)
                goto L4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.TTBannerView.getAdView():android.view.View");
        }

        public long getCreativeId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd != null) {
                return PangleAdapterUtils.getCreativeId(tTNativeExpressAd.getMediaExtraInfo());
            }
            return 0L;
        }

        public Map<String, Object> getMediaExtraInfo() {
            Map<String, Object> mediaExtraInfo;
            TTNativeExpressAd tTNativeExpressAd = this.a;
            if (tTNativeExpressAd == null || (mediaExtraInfo = tTNativeExpressAd.getMediaExtraInfo()) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_COUPON, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_COUPON));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_LIVE_ROOM));
            hashMap.put(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT, mediaExtraInfo.get(PangleAdapterUtils.MEDIA_EXTRA_PRODUCT));
            return hashMap;
        }

        public String getReqId() {
            TTNativeExpressAd tTNativeExpressAd = this.a;
            return tTNativeExpressAd != null ? PangleAdapterUtils.getReqId(tTNativeExpressAd.getMediaExtraInfo()) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public boolean hasDestroyed() {
            return this.e;
        }

        @JProtect
        public void loadAd() {
            TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(PangleBannerLoader.this.a);
            AdSlot.Builder buildPangleAdSlot = PangleAdapterUtils.buildPangleAdSlot(PangleBannerLoader.this.b, PangleBannerLoader.this.getAdnId(), PangleBannerLoader.this.getAdm(), false);
            buildPangleAdSlot.setExpressViewAcceptedSize(PangleBannerLoader.this.b.getExpressWidth(), PangleBannerLoader.this.b.getExpressHeight());
            createAdNative.loadBannerExpressAd(buildPangleAdSlot.build(), new TTAdNative.NativeExpressAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.TTBannerView.1
                @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
                public void onError(int i, String str) {
                    PangleBannerLoader.this.notifyAdFailed(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
                public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                    Map<String, Object> mediaExtraInfo;
                    if (list == null || list.size() == 0 || PangleBannerLoader.this.a == null) {
                        PangleBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is null or empty");
                        return;
                    }
                    TTBannerView.this.a = list.get(0);
                    TTBannerView tTBannerView = TTBannerView.this;
                    tTBannerView.a.setExpressInteractionListener(tTBannerView.f);
                    if (PangleBannerLoader.this.a instanceof Activity) {
                        TTBannerView tTBannerView2 = TTBannerView.this;
                        tTBannerView2.a.setDislikeCallback((Activity) PangleBannerLoader.this.a, new TTAdDislike.DislikeInteractionCallback() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.TTBannerView.1.1
                            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                            public void onCancel() {
                            }

                            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                            public void onSelected(int i, String str, boolean z) {
                                Bridge bridge = TTBannerView.this.mGMAd;
                                if (bridge != null) {
                                    bridge.call(1014, null, Void.class);
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                            public void onShow() {
                            }
                        });
                    }
                    MediationValueSetBuilder create = MediationValueSetBuilder.create();
                    create.add(8033, true);
                    create.add(8059, TTBannerView.this.a.getInteractionType());
                    create.add(8060, TTBannerView.this.a.getImageMode());
                    TTBannerView.this.mGMAd.call(8140, create.build(), Void.class);
                    if (PangleBannerLoader.this.isClientBidding() && (mediaExtraInfo = TTBannerView.this.a.getMediaExtraInfo()) != null) {
                        double value = PangleAdapterUtils.getValue(mediaExtraInfo.get(InAppPurchaseMetaData.KEY_PRICE));
                        Logger.d("TTMediationSDK_ECMP", TTLogUtil.getTagThirdLevelById(PangleBannerLoader.this.getRitId(), PangleBannerLoader.this.getAdnId()) + "pangle banner 返回的 cpm价格：" + value);
                        TTBannerView tTBannerView3 = TTBannerView.this;
                        if (value <= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                            value = 0.0d;
                        }
                        tTBannerView3.setCpm(value);
                    }
                    TTBannerView.this.a.render();
                    TTBannerView tTBannerView4 = TTBannerView.this;
                    tTBannerView4.b = new FrameLayout(PangleBannerLoader.this.a);
                    TTBannerView tTBannerView5 = TTBannerView.this;
                    PangleBannerLoader.this.notifyAdSuccess(tTBannerView5, tTBannerView5.mGMAd);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.mediation.bridge.MediationBaseAdBridge
        public void onDestroy() {
            this.e = true;
            ThreadHelper.runOnUiThread(new Runnable() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.TTBannerView.2
                @Override // java.lang.Runnable
                public void run() {
                    TTNativeExpressAd tTNativeExpressAd = TTBannerView.this.a;
                    if (tTNativeExpressAd != null) {
                        tTNativeExpressAd.setExpressInteractionListener((TTNativeExpressAd.AdInteractionListener) null);
                        TTBannerView.this.a.destroy();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return null;
        }
    }

    private void a() {
        TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(this.a);
        AdSlot.Builder buildPangleAdSlot = PangleAdapterUtils.buildPangleAdSlot(this.b, getAdnId(), getAdm(), false);
        buildPangleAdSlot.setImageAcceptedSize(this.b.getWidth(), this.b.getHeight());
        createAdNative.loadFeedAd(buildPangleAdSlot.build(), new TTAdNative.FeedAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.2
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
            public void onError(int i, String str) {
                PangleBannerLoader.this.notifyAdFailed(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.FeedAdListener
            public void onFeedAdLoad(List<TTFeedAd> list) {
                if (list == null || list.isEmpty()) {
                    PangleBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is null or empty");
                    return;
                }
                PangleBannerLoader pangleBannerLoader = PangleBannerLoader.this;
                pangleBannerLoader.notifyAdSuccess(new PangleNativeAd(list.get(0)), PangleBannerLoader.this.c);
            }
        });
    }

    private void b() {
        TTAdNative createAdNative = TTAdSdk.getAdManager().createAdNative(this.a);
        AdSlot.Builder buildPangleAdSlot = PangleAdapterUtils.buildPangleAdSlot(this.b, getAdnId(), getAdm(), false);
        buildPangleAdSlot.setImageAcceptedSize(this.b.getWidth(), this.b.getHeight());
        float expressWidth = this.b.getExpressWidth();
        float expressHeight = this.b.getExpressHeight();
        boolean isExpressNativeAutoHeight = PangleAdapterUtils.isExpressNativeAutoHeight(this.b);
        Log.i("TTMediationSDK", "pangle banner native express autoHeight:" + isExpressNativeAutoHeight + " width:" + expressWidth + "  height:" + expressHeight);
        if (expressHeight <= 0.0f || isExpressNativeAutoHeight) {
            buildPangleAdSlot.setExpressViewAcceptedSize(expressWidth, 0.0f);
        } else {
            buildPangleAdSlot.setExpressViewAcceptedSize(expressWidth, expressHeight);
        }
        createAdNative.loadNativeExpressAd(buildPangleAdSlot.build(), new TTAdNative.NativeExpressAdListener() { // from class: com.bytedance.msdk.adapter.pangle.PangleBannerLoader.1
            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener, com.bytedance.sdk.openadsdk.common.CommonListener
            public void onError(int i, String str) {
                PangleBannerLoader.this.notifyAdFailed(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.TTAdNative.NativeExpressAdListener
            public void onNativeExpressAdLoad(List<TTNativeExpressAd> list) {
                if (list == null || list.size() == 0) {
                    PangleBannerLoader.this.notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, "load list is null or empty");
                    return;
                }
                for (TTNativeExpressAd tTNativeExpressAd : list) {
                    if (tTNativeExpressAd != null) {
                        PangleBannerLoader pangleBannerLoader = PangleBannerLoader.this;
                        new PangleNativeExpressAd(tTNativeExpressAd, pangleBannerLoader.b, PangleBannerLoader.this.c).render();
                        return;
                    }
                }
            }
        });
    }

    public String getAdNetWorkName() {
        return "pangle";
    }

    public String getSdkVersion() {
        try {
            return TTAdSdk.getAdManager().getSDKVersion();
        } catch (Exception e) {
            return "0.0";
        }
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
            if (mediationAdSlotValueSet.getAdSubType() != 4) {
                new TTBannerView().loadAd();
                return;
            }
            int originType = mediationAdSlotValueSet.getOriginType();
            if (originType == 1) {
                b();
                return;
            } else if (originType == 2) {
                a();
                return;
            } else {
                str = "originType is mismatch";
            }
        }
        notifyAdFailed(MediationConstant.ErrorCode.ADN_AD_LOAD_FAIL, str);
    }
}

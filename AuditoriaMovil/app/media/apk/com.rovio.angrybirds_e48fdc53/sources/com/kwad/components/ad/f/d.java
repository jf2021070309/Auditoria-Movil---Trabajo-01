package com.kwad.components.ad.f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.internal.AnalyticsEvents;
import com.kwad.components.ad.f.b;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.e.d.c;
import com.kwad.components.core.internal.api.KSAdVideoPlayConfigImpl;
import com.kwad.components.core.widget.a;
import com.kwad.components.core.widget.c;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.R;
import com.kwad.sdk.api.KsAdVideoPlayConfig;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.api.KsImage;
import com.kwad.sdk.api.KsNativeAd;
import com.kwad.sdk.api.core.AbstractKsNativeAd;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bi;
import com.kwad.sdk.utils.bj;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends AbstractKsNativeAd implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, com.kwad.components.core.internal.api.a {
    private Vibrator dP;
    private KsNativeAd.AdInteractionListener mA;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private f mB;
    private e mC;
    private KsNativeAd.VideoPlayListener mD;
    private bi mTimerHelper;
    private b.c mv;
    private boolean mz;
    private boolean mE = false;
    private com.kwad.components.core.internal.api.c bP = new com.kwad.components.core.internal.api.c();
    private int mF = 0;
    private int mG = 0;
    private KsNativeAd.VideoPlayListener mH = new KsNativeAd.VideoPlayListener() { // from class: com.kwad.components.ad.f.d.8
        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayComplete() {
            if (d.this.mD != null) {
                d.this.mD.onVideoPlayComplete();
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayError(int i, int i2) {
            if (d.this.mD != null) {
                d.this.mD.onVideoPlayError(i, i2);
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayPause() {
            if (d.this.mD != null) {
                try {
                    d.this.mD.onVideoPlayPause();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayReady() {
            if (d.this.mD != null) {
                try {
                    d.this.mD.onVideoPlayReady();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayResume() {
            if (d.this.mD != null) {
                try {
                    d.this.mD.onVideoPlayResume();
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.sdk.api.KsNativeAd.VideoPlayListener
        public final void onVideoPlayStart() {
            if (d.this.mD != null) {
                d.this.mD.onVideoPlayStart();
            }
        }
    };
    private a mI = new a() { // from class: com.kwad.components.ad.f.d.9
        @Override // com.kwad.components.ad.f.d.a
        public final void eL() {
            if (d.this.mA != null) {
                d.this.mA.onAdShow(d.this);
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
            if (d.this.mA != null) {
                try {
                    return d.this.mA.handleDownloadDialog(onClickListener);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void l(View view) {
            if (d.this.mA != null) {
                d.this.mA.onAdClicked(new FrameLayout(l.dv(view.getContext())), d.this);
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void onDownloadTipsDialogDismiss() {
            if (d.this.mA != null) {
                try {
                    d.this.mA.onDownloadTipsDialogDismiss();
                } catch (Throwable th) {
                }
            }
        }

        @Override // com.kwad.components.ad.f.d.a
        public final void onDownloadTipsDialogShow() {
            if (d.this.mA != null) {
                try {
                    d.this.mA.onDownloadTipsDialogShow();
                } catch (Throwable th) {
                }
            }
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void eL();

        boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener);

        void l(View view);

        void onDownloadTipsDialogDismiss();

        void onDownloadTipsDialogShow();
    }

    public d(AdTemplate adTemplate) {
        this.mAdTemplate = adTemplate;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mAdInfo = ck;
        if (com.kwad.sdk.core.response.b.a.ax(ck)) {
            com.kwad.components.core.e.d.c cVar = new com.kwad.components.core.e.d.c(this.mAdTemplate);
            this.mApkDownloadHelper = cVar;
            cVar.setOnShowListener(this);
            this.mApkDownloadHelper.setOnDismissListener(this);
            this.mApkDownloadHelper.a(new c.a() { // from class: com.kwad.components.ad.f.d.1
                @Override // com.kwad.components.core.e.d.c.a
                public final boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener) {
                    return d.this.mI.handleDownloadDialog(onClickListener);
                }
            });
        }
        KSImageLoader.preloadImage(com.kwad.sdk.core.response.b.a.I(this.mAdInfo), this.mAdTemplate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Vibrator F(Context context) {
        if (this.dP == null) {
            this.dP = (Vibrator) context.getSystemService("vibrator");
        }
        return this.dP;
    }

    private View a(Context context, KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl) {
        com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
        if (aVar == null || !aVar.oi()) {
            return null;
        }
        if (this.mC == null) {
            e eVar = new e(context);
            this.mC = eVar;
            eVar.setInnerAdInteractionListener(this.mI);
            this.mC.setVideoPlayListener(this.mH);
            this.mC.a(context, this.mAdTemplate, this.mApkDownloadHelper, kSAdVideoPlayConfigImpl);
        }
        return this.mC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.app.Activity r3, final android.view.View r4, final com.kwad.sdk.utils.ac.a r5, int r6, boolean r7, final int r8) {
        /*
            r2 = this;
            if (r3 != 0) goto L6
            android.content.Context r3 = r4.getContext()
        L6:
            android.content.Context r3 = com.kwad.sdk.m.l.wrapContextIfNeed(r3)
            com.kwad.components.core.e.d.a$a r0 = new com.kwad.components.core.e.d.a$a
            r0.<init>(r3)
            com.kwad.sdk.core.response.model.AdTemplate r3 = r2.mAdTemplate
            com.kwad.components.core.e.d.a$a r3 = r0.S(r3)
            com.kwad.components.core.e.d.c r0 = r2.mApkDownloadHelper
            com.kwad.components.core.e.d.a$a r3 = r3.b(r0)
            com.kwad.components.core.e.d.a$a r3 = r3.ap(r6)
            r6 = 1
            com.kwad.components.core.e.d.a$a r3 = r3.al(r6)
            com.kwad.components.ad.f.e r6 = r2.mC
            if (r6 == 0) goto L35
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r6 = r6.eF
            if (r6 == 0) goto L35
            com.kwad.components.ad.f.e r6 = r2.mC
            com.kwad.components.offline.api.core.adlive.IAdLivePlayModule r6 = r6.eF
            long r0 = r6.getPlayDuration()
            goto L37
        L35:
            r0 = 0
        L37:
            com.kwad.components.core.e.d.a$a r3 = r3.s(r0)
            com.kwad.components.core.e.d.a$a r3 = r3.as(r7)
            com.kwad.components.ad.f.d$4 r6 = new com.kwad.components.ad.f.d$4
            r6.<init>()
            com.kwad.components.core.e.d.a$a r3 = r3.a(r6)
            com.kwad.components.core.e.d.a.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.f.d.a(android.app.Activity, android.view.View, com.kwad.sdk.utils.ac$a, int, boolean, int):void");
    }

    private void a(final Activity activity, final ViewGroup viewGroup, final int i, final View view, final boolean z) {
        final ac.a aVar = new ac.a();
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.kwad.components.ad.f.d.2
            private int[] mK = new int[2];

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    aVar.x(viewGroup.getWidth(), viewGroup.getHeight());
                    viewGroup.getLocationOnScreen(this.mK);
                    aVar.f(Math.abs(motionEvent.getRawX() - this.mK[0]), Math.abs(motionEvent.getRawY() - this.mK[1]));
                } else if (action == 1) {
                    aVar.g(Math.abs(motionEvent.getRawX() - this.mK[0]), Math.abs(motionEvent.getRawY() - this.mK[1]));
                    if (d.this.b(aVar)) {
                        view.setPressed(false);
                        d.this.a(activity, view2, aVar, i, z, 153);
                    }
                }
                return false;
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.ad.f.d.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                d.this.a(activity, view2, aVar, i, z, 0);
            }
        });
    }

    private void a(Activity activity, ViewGroup viewGroup, List<View> list) {
        for (View view : list) {
            a(activity, viewGroup, 0, view, false);
        }
    }

    private void a(Activity activity, ViewGroup viewGroup, Map<View, Integer> map) {
        for (View view : map.keySet()) {
            if (map.get(view) != null) {
                a(activity, viewGroup, map.get(view).intValue(), view, true);
            }
        }
    }

    private void a(final ViewGroup viewGroup) {
        if (!this.mz) {
            this.mz = true;
            KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_NATIVE, "callShow").report();
        }
        if (!com.kwad.sdk.core.config.d.zI() && com.kwad.sdk.core.config.d.zH() >= 0.0f) {
            c(viewGroup);
            com.kwad.components.core.widget.a aVar = new com.kwad.components.core.widget.a(viewGroup.getContext(), viewGroup);
            viewGroup.addView(aVar);
            aVar.setViewCallback(new a.InterfaceC0223a() { // from class: com.kwad.components.ad.f.d.5
                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void aa() {
                    com.kwad.components.ad.h.b.fc().a(d.this);
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void ab() {
                    if (d.this.mAdTemplate.mPvReported && d.this.mE) {
                        com.kwad.sdk.core.report.a.a(d.this.mAdTemplate, d.this.getTimerHelper().Kb(), (JSONObject) null);
                        d.this.mE = false;
                    }
                    d.this.getTimerHelper().Kb();
                    d.this.bP.i(d.this);
                    b.eF().a(d.this.mv);
                    com.kwad.components.ad.h.b.fc().b(d.this);
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void eJ() {
                    if (d.this.mAdTemplate.mPvReported && d.this.mE) {
                        com.kwad.sdk.core.report.a.a(d.this.mAdTemplate, d.this.getTimerHelper().Kb(), (JSONObject) null);
                        d.this.mE = false;
                        b.eF().a(d.this.mv);
                    }
                }

                @Override // com.kwad.components.core.widget.a.InterfaceC0223a
                public final void k(View view) {
                    if (!d.this.mAdTemplate.mPvReported) {
                        d.this.mI.eL();
                        d.this.eI();
                        j jVar = new j();
                        jVar.t(viewGroup.getHeight(), viewGroup.getWidth());
                        if (com.kwad.sdk.core.response.b.a.cw(d.this.mAdInfo)) {
                            z.a aVar2 = new z.a();
                            aVar2.showLiveStyle = d.this.mG;
                            aVar2.showLiveStatus = d.this.mF;
                            jVar.a(aVar2);
                        }
                        com.kwad.components.core.t.b.ql().a(d.this.mAdTemplate, null, jVar);
                    }
                    if (!d.this.mE) {
                        d.this.j(view);
                        d.this.getTimerHelper().startTiming();
                        d.this.bP.h(d.this);
                    }
                    d.this.mE = true;
                }
            });
            aVar.so();
            return;
        }
        com.kwad.components.core.widget.c b = b(viewGroup);
        if (b == null) {
            b = new com.kwad.components.core.widget.c(viewGroup.getContext(), viewGroup);
            viewGroup.addView(b);
        }
        b.setViewCallback(new c.a() { // from class: com.kwad.components.ad.f.d.6
            @Override // com.kwad.components.core.widget.c.a
            public final void eK() {
                if (!d.this.mAdTemplate.mPvReported) {
                    d.this.mI.eL();
                }
                d.this.eI();
                j jVar = new j();
                jVar.t(viewGroup.getHeight(), viewGroup.getWidth());
                if (com.kwad.sdk.core.response.b.a.cw(d.this.mAdInfo)) {
                    z.a aVar2 = new z.a();
                    aVar2.showLiveStyle = d.this.mG;
                    aVar2.showLiveStatus = d.this.mF;
                    jVar.a(aVar2);
                }
                com.kwad.components.core.t.b.ql().a(d.this.mAdTemplate, null, jVar);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_NATIVE, "adShowSuccess").report();
            }
        });
        b.setNeedCheckingShow(true);
    }

    private View b(Context context, KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl) {
        if (TextUtils.isEmpty(getVideoUrl())) {
            com.kwad.sdk.core.e.c.w("KsNativeAdControl", "videoUrl is empty");
            return null;
        }
        if (this.mB == null) {
            f fVar = new f(context);
            this.mB = fVar;
            fVar.setInnerAdInteractionListener(this.mI);
            this.mB.setVideoPlayListener(this.mH);
            this.mB.a(this.mAdTemplate, this.mApkDownloadHelper, kSAdVideoPlayConfigImpl);
        }
        return this.mB;
    }

    private static com.kwad.components.core.widget.c b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.kwad.components.core.widget.c) {
                return (com.kwad.components.core.widget.c) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ac.a aVar) {
        return ((Math.abs(aVar.IG() - aVar.II()) > 20) || (Math.abs(aVar.IH() - aVar.IJ()) > 20)) && com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate);
    }

    private static void c(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.kwad.components.core.widget.a) {
                viewGroup.removeView(childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.api.KsNativeAd
    /* renamed from: eH */
    public com.kwad.components.core.internal.api.d getVideoCoverImage() {
        AdInfo.AdMaterialInfo.MaterialFeature aN = com.kwad.sdk.core.response.b.a.aN(this.mAdInfo);
        if (TextUtils.isEmpty(aN.coverUrl)) {
            return null;
        }
        return new com.kwad.components.core.internal.api.d(aN.width, aN.height, aN.coverUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eI() {
        try {
            this.mF = this.mAdTemplate.mAdScene.nativeAdExtraData.showLiveStatus;
            this.mG = this.mAdTemplate.mAdScene.nativeAdExtraData.showLiveStyle;
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final View view) {
        if (com.kwad.sdk.core.response.b.a.aa(this.mAdInfo)) {
            this.mv = new b.c() { // from class: com.kwad.components.ad.f.d.7
                @Override // com.kwad.components.ad.f.b.c
                public final void f(final double d) {
                    if (d.this.mAdInfo.status == 3 || d.this.mAdInfo.status == 2) {
                        return;
                    }
                    com.kwad.components.core.e.d.a.a(new a.C0197a(l.wrapContextIfNeed(view.getContext())).S(d.this.mAdTemplate).b(d.this.mApkDownloadHelper).as(false).a(new a.b() { // from class: com.kwad.components.ad.f.d.7.1
                        @Override // com.kwad.components.core.e.d.a.b
                        public final void onAdClicked() {
                            com.kwad.sdk.core.report.a.a(d.this.mAdTemplate, new j().cg(157).i(d), (JSONObject) null);
                            d.this.mI.l(view);
                        }
                    }));
                    bj.a(view.getContext(), d.this.F(view.getContext()));
                }
            };
            b.eF().a(com.kwad.sdk.core.response.b.a.ab(this.mAdInfo), view, this.mv);
        }
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b bVar) {
        this.bP.a(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean ae() {
        return true;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b bVar) {
        this.bP.b(bVar);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getActionDescription() {
        return com.kwad.sdk.core.response.b.a.aw(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAdDescription() {
        return com.kwad.sdk.core.response.b.a.an(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAdSource() {
        return com.kwad.sdk.core.response.b.a.av(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAdSourceLogoUrl(int i) {
        AdInfo adInfo = this.mAdInfo;
        if (adInfo == null) {
            return null;
        }
        return i != 1 ? adInfo.adBaseInfo.adMarkIcon : adInfo.adBaseInfo.adGrayMarkIcon;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppDownloadCountDes() {
        return com.kwad.sdk.core.response.b.a.ar(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppIconUrl() {
        return com.kwad.sdk.core.response.b.a.bQ(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppName() {
        return com.kwad.sdk.core.response.b.a.ao(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppPackageName() {
        return com.kwad.sdk.core.response.b.a.aq(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final long getAppPackageSize() {
        return com.kwad.sdk.core.response.b.a.bu(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppPrivacyUrl() {
        return com.kwad.sdk.core.response.b.a.bs(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final float getAppScore() {
        return com.kwad.sdk.core.response.b.a.as(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getAppVersion() {
        return com.kwad.sdk.core.response.b.a.bt(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getCorporationName() {
        return com.kwad.sdk.core.response.b.a.bp(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getECPM() {
        return com.kwad.sdk.core.response.b.a.aJ(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final List<KsImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        int aW = com.kwad.sdk.core.response.b.a.aW(this.mAdInfo);
        if (aW == 2 || aW == 3) {
            for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : ck.adMaterialInfo.materialFeatureList) {
                if (materialFeature.featureType == 2 && !TextUtils.isEmpty(materialFeature.materialUrl)) {
                    arrayList.add(new com.kwad.components.core.internal.api.d(materialFeature.width, materialFeature.height, materialFeature.materialUrl));
                }
            }
        }
        return arrayList;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aI(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.aW(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public final Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.zs()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getPermissionInfo() {
        return com.kwad.sdk.core.response.b.a.bq(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getPermissionInfoUrl() {
        return com.kwad.sdk.core.response.b.a.br(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getProductName() {
        return com.kwad.sdk.core.response.b.a.ap(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final Bitmap getSdkLogo() {
        Context context = KsAdSDKImpl.get().getContext();
        if (context == null) {
            return null;
        }
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.ksad_sdk_logo);
    }

    public final bi getTimerHelper() {
        if (this.mTimerHelper == null) {
            this.mTimerHelper = new bi();
        }
        return this.mTimerHelper;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoDuration() {
        return com.kwad.sdk.core.response.b.a.G(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoHeight() {
        return com.kwad.sdk.core.response.b.a.cw(this.mAdInfo) ? TTAdConstant.EXT_PLUGIN_UNINSTALL : com.kwad.sdk.core.response.b.a.aN(this.mAdInfo).videoHeight;
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final String getVideoUrl() {
        return com.kwad.sdk.core.response.b.a.F(this.mAdInfo);
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final View getVideoView2(Context context, KsAdVideoPlayConfig ksAdVideoPlayConfig) {
        View view = null;
        if (context == null || !KsAdSDKImpl.get().hasInitFinish()) {
            return null;
        }
        try {
            context = l.wrapContextIfNeed(context);
            com.kwad.sdk.i.a.ae(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, TTLogUtil.TAG_EVENT_SHOW);
            KSAdVideoPlayConfigImpl kSAdVideoPlayConfigImpl = ksAdVideoPlayConfig instanceof KSAdVideoPlayConfigImpl ? (KSAdVideoPlayConfigImpl) ksAdVideoPlayConfig : new KSAdVideoPlayConfigImpl();
            view = com.kwad.sdk.core.response.b.a.cw(this.mAdInfo) ? a(context, kSAdVideoPlayConfigImpl) : b(context, kSAdVideoPlayConfigImpl);
            com.kwad.sdk.i.a.af(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, TTLogUtil.TAG_EVENT_SHOW);
            return view;
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("getVideoView fail--context:" + context.getClass().getName() + "--classloader:" + context.getClassLoader().getClass().getName());
            if (KsAdSDKImpl.get().getIsExternal()) {
                if (Build.VERSION.SDK_INT >= 19) {
                    runtimeException.addSuppressed(th);
                }
                com.kwad.components.core.d.a.b(runtimeException);
                return view;
            }
            throw th;
        }
    }

    @Override // com.kwad.sdk.api.core.AbstractKsNativeAd
    public final View getVideoView2(Context context, boolean z) {
        if (context == null || !KsAdSDKImpl.get().hasInitFinish()) {
            return null;
        }
        return getVideoView2(context, new KsAdVideoPlayConfig.Builder().videoSoundEnable(z).build());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final int getVideoWidth() {
        if (com.kwad.sdk.core.response.b.a.cw(this.mAdInfo)) {
            return 720;
        }
        return com.kwad.sdk.core.response.b.a.aN(this.mAdInfo).videoWidth;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.mI.onDownloadTipsDialogDismiss();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        a aVar = this.mI;
        if (aVar != null) {
            aVar.onDownloadTipsDialogShow();
        }
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, KsNativeAd.AdInteractionListener adInteractionListener) {
        this.mA = adInteractionListener;
        a(viewGroup);
        a(activity, viewGroup, list);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(Activity activity, ViewGroup viewGroup, Map<View, Integer> map, KsNativeAd.AdInteractionListener adInteractionListener) {
        this.mA = adInteractionListener;
        a(viewGroup);
        a(activity, viewGroup, map);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void registerViewForInteraction(ViewGroup viewGroup, List<View> list, KsNativeAd.AdInteractionListener adInteractionListener) {
        registerViewForInteraction((Activity) null, viewGroup, list, adInteractionListener);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayEnd() {
        com.kwad.sdk.core.report.a.aE(getAdTemplate());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void reportAdVideoPlayStart() {
        com.kwad.sdk.core.report.a.aD(getAdTemplate());
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(int i) {
        setBidEcpm(i, -1L);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setBidEcpm(long j, long j2) {
        this.mAdTemplate.mBidEcpm = j;
        com.kwad.sdk.core.report.a.j(this.mAdTemplate, j2);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setDownloadListener(KsAppDownloadListener ksAppDownloadListener) {
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar == null || ksAppDownloadListener == null) {
            return;
        }
        cVar.b(ksAppDownloadListener);
    }

    @Override // com.kwad.sdk.api.KsNativeAd
    public final void setVideoPlayListener(KsNativeAd.VideoPlayListener videoPlayListener) {
        this.mD = videoPlayListener;
    }
}

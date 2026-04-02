package com.kwad.components.ad.splashscreen;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.kwad.components.core.response.model.AdResultData;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsScene;
import com.kwad.sdk.api.KsSplashScreenAd;
import com.kwad.sdk.api.core.AbstrackKsSplashScreenAd;
import com.kwad.sdk.api.core.KsAdSdkDynamicApi;
import com.kwad.sdk.api.core.fragment.KsFragment;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class KsSplashScreenAdControl extends AbstrackKsSplashScreenAd implements com.kwad.components.core.internal.api.a {
    private AdResultData BS;
    private KsScene BT;
    private final AdTemplate mAdTemplate;
    private com.kwad.components.core.internal.api.c bP = new com.kwad.components.core.internal.api.c();
    private com.kwad.sdk.core.h.b bJ = new com.kwad.sdk.core.h.b() { // from class: com.kwad.components.ad.splashscreen.KsSplashScreenAdControl.1
        @Override // com.kwad.sdk.core.h.b
        public final void af() {
            KsSplashScreenAdControl.this.bP.h(KsSplashScreenAdControl.this);
        }

        @Override // com.kwad.sdk.core.h.b
        public final void ag() {
            KsSplashScreenAdControl.this.bP.i(KsSplashScreenAdControl.this);
        }
    };

    public KsSplashScreenAdControl(KsScene ksScene, AdResultData adResultData) {
        this.BS = adResultData;
        this.BT = ksScene;
        this.mAdTemplate = adResultData.getAdTemplateList().get(0);
        com.kwad.components.ad.h.b.fc().a(this);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void a(com.kwad.components.core.internal.api.b bVar) {
        this.bP.a(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final boolean ae() {
        return false;
    }

    @Override // com.kwad.components.core.internal.api.a
    public final void b(com.kwad.components.core.internal.api.b bVar) {
        this.bP.b(bVar);
    }

    @Override // com.kwad.components.core.internal.api.a
    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getECPM() {
        return com.kwad.sdk.core.response.b.a.aJ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @KsAdSdkDynamicApi
    protected KsFragment getFragment2(KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_SPLASH, "callShow").report();
        com.kwad.components.ad.splashscreen.a.a aVar = (com.kwad.components.ad.splashscreen.a.a) com.kwad.sdk.components.c.f(com.kwad.components.ad.splashscreen.a.a.class);
        if (aVar != null) {
            return aVar.a(this.mAdTemplate, this.bJ, splashScreenAdInteractionListener);
        }
        return null;
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getInteractionType() {
        return com.kwad.sdk.core.response.b.a.aI(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public int getMaterialType() {
        return com.kwad.sdk.core.response.b.a.aW(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
    }

    @Override // com.kwad.sdk.api.BaseKSAd
    public Map<String, Object> getMediaExtraInfo() {
        HashMap hashMap = new HashMap();
        if (com.kwad.sdk.core.config.d.zs()) {
            hashMap.put("llsid", Long.valueOf(this.mAdTemplate.llsid));
        }
        return hashMap;
    }

    @Override // com.kwad.sdk.api.core.AbstrackKsSplashScreenAd
    public View getView2(Context context, KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener) {
        if (context == null || !KsAdSDKImpl.get().hasInitFinish()) {
            return null;
        }
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(BusinessType.AD_SPLASH, "callShow").report();
        return c.a(context, this.mAdTemplate, true, this.bJ, splashScreenAdInteractionListener);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public boolean isAdEnable() {
        if (SplashPreloadManager.kD().c(this.BS)) {
            return true;
        }
        SplashPreloadManager.kD();
        return SplashPreloadManager.d(this.BS);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public boolean isVideo() {
        return com.kwad.sdk.core.response.b.a.aU(com.kwad.sdk.core.response.b.d.ck(this.BS.getAdTemplateList().get(0)));
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void reportAdExposureFailed(int i, AdExposureFailedReason adExposureFailedReason) {
        com.kwad.sdk.core.report.a.a(this.mAdTemplate, i, adExposureFailedReason);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void setBidEcpm(int i) {
        setBidEcpm(i, -1L);
    }

    @Override // com.kwad.sdk.api.KsSplashScreenAd
    public void setBidEcpm(long j, long j2) {
        this.mAdTemplate.mBidEcpm = j;
        com.kwad.sdk.core.report.a.j(this.mAdTemplate, j2);
    }

    public boolean showSplashMiniWindowIfNeeded(Context context, KsSplashScreenAd.SplashScreenAdInteractionListener splashScreenAdInteractionListener, Rect rect) {
        return false;
    }
}

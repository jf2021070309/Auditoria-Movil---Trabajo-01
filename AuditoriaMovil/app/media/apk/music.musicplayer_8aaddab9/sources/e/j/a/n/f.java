package e.j.a.n;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import e.j.a.b;
import e.j.d.k;
import h.o.c.j;
import n.a.a;
/* loaded from: classes2.dex */
public final class f implements NativeAd.OnNativeAdLoadedListener {
    public final /* synthetic */ NativeAd.OnNativeAdLoadedListener a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f8481b;

    /* loaded from: classes2.dex */
    public static final class a implements OnPaidEventListener {
        public final /* synthetic */ h a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NativeAd f8482b;

        public a(h hVar, NativeAd nativeAd) {
            this.a = hVar;
            this.f8482b = nativeAd;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void onPaidEvent(AdValue adValue) {
            k.a aVar = k.a;
            e.j.d.b.g(aVar.a().f8813j, b.a.NATIVE, null, 2);
            e.j.d.b bVar = aVar.a().f8813j;
            String str = this.a.a;
            j.d(adValue, "adValue");
            ResponseInfo responseInfo = this.f8482b.getResponseInfo();
            bVar.j(str, adValue, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
        }
    }

    public f(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener, h hVar) {
        this.a = onNativeAdLoadedListener;
        this.f8481b = hVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        j.e(nativeAd, "ad");
        n.a.a.b("PremiumHelper").a(j.i("AdMobNative: forNativeAd ", nativeAd.getHeadline()), new Object[0]);
        nativeAd.setOnPaidEventListener(new a(this.f8481b, nativeAd));
        a.c b2 = n.a.a.b("PremiumHelper");
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        b2.a(j.i("AdMobNative: loaded ad from ", responseInfo == null ? null : responseInfo.getMediationAdapterClassName()), new Object[0]);
        this.a.onNativeAdLoaded(nativeAd);
    }
}

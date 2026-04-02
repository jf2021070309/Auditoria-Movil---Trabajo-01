package e.j.a.n;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class c implements OnPaidEventListener {
    public final /* synthetic */ e a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f8479b;

    public c(e eVar, InterstitialAd interstitialAd) {
        this.a = eVar;
        this.f8479b = interstitialAd;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        e.j.d.b bVar = k.a.a().f8813j;
        String str = this.a.a;
        j.d(adValue, "adValue");
        bVar.j(str, adValue, this.f8479b.getResponseInfo().getMediationAdapterClassName());
    }
}

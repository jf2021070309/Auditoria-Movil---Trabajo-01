package e.j.a.n;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import e.j.d.k;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class a implements OnPaidEventListener {
    public final /* synthetic */ AdView a;

    public a(AdView adView) {
        this.a = adView;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        e.j.d.b bVar = k.a.a().f8813j;
        String adUnitId = this.a.getAdUnitId();
        j.d(adUnitId, "adUnitId");
        j.d(adValue, "adValue");
        ResponseInfo responseInfo = this.a.getResponseInfo();
        bVar.j(adUnitId, adValue, responseInfo == null ? null : responseInfo.getMediationAdapterClassName());
    }
}

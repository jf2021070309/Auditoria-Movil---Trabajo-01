package e.j.a.n;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import e.j.d.c0.a0;
import h.k;
import i.a.j;
import n.a.a;
/* loaded from: classes2.dex */
public final class g extends AdListener {
    public final /* synthetic */ j<a0<k>> a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AdListener f8483b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(j<? super a0<k>> jVar, AdListener adListener) {
        this.a = jVar;
        this.f8483b = adListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        AdListener adListener = this.f8483b;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        h.o.c.j.e(loadAdError, "error");
        a.c b2 = n.a.a.b("PremiumHelper");
        StringBuilder y = e.a.d.a.a.y("AdMobNative: Failed to load ");
        y.append(loadAdError.getCode());
        y.append(" (");
        y.append(loadAdError.getMessage());
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        b2.b(y.toString(), new Object[0]);
        if (this.a.a()) {
            this.a.resumeWith(new a0.b(new IllegalStateException(loadAdError.getMessage())));
        }
        this.f8483b.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        if (this.a.a()) {
            this.a.resumeWith(new a0.c(k.a));
        }
        AdListener adListener = this.f8483b;
    }
}

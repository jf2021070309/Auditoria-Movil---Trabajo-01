package e.j.a.n;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import e.j.d.c0.a0;
import i.a.j;
import n.a.a;
/* loaded from: classes2.dex */
public final class b extends AdListener {
    public final /* synthetic */ AdListener a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j<a0<? extends View>> f8477b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AdView f8478c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(AdListener adListener, j<? super a0<? extends View>> jVar, AdView adView) {
        this.a = adListener;
        this.f8477b = jVar;
        this.f8478c = adView;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        AdListener adListener = this.a;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        this.a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        a.c b2 = n.a.a.b("PremiumHelper");
        StringBuilder y = e.a.d.a.a.y("AdMobBanner: Failed to load ");
        y.append(loadAdError == null ? null : Integer.valueOf(loadAdError.getCode()));
        y.append(" (");
        y.append((Object) (loadAdError == null ? null : loadAdError.getMessage()));
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        b2.b(y.toString(), new Object[0]);
        if (this.f8477b.a()) {
            this.a.onAdFailedToLoad(loadAdError == null ? new LoadAdError(-1, "", AdError.UNDEFINED_DOMAIN, null, null) : loadAdError);
            this.f8477b.resumeWith(new a0.b(new IllegalStateException(loadAdError != null ? loadAdError.getMessage() : null)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        a.c b2 = n.a.a.b("PremiumHelper");
        ResponseInfo responseInfo = this.f8478c.getResponseInfo();
        b2.a(h.o.c.j.i("AdMobBanner: loaded ad from ", responseInfo == null ? null : responseInfo.getMediationAdapterClassName()), new Object[0]);
        if (this.f8477b.a()) {
            AdListener adListener = this.a;
            this.f8477b.resumeWith(new a0.c(this.f8478c));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        this.a.onAdOpened();
    }
}

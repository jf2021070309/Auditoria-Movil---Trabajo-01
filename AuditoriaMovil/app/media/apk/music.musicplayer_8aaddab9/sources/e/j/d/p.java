package e.j.d;

import com.google.android.gms.ads.AdListener;
import e.j.a.b;
/* loaded from: classes2.dex */
public final class p extends AdListener {
    public final /* synthetic */ k a;

    public p(k kVar) {
        this.a = kVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        b.g(this.a.f8813j, b.a.BANNER, null, 2);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        b.e(this.a.f8813j, b.a.BANNER, null, 2);
    }
}

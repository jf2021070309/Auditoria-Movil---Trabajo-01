package e.j.a.o;

import com.google.android.gms.ads.AdListener;
import e.j.a.b;
/* loaded from: classes2.dex */
public final class g extends AdListener {
    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        e.j.d.k.a.a().f8813j.f(b.a.BANNER, "exit_ad");
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        e.j.d.k.a.a().f8813j.d(b.a.BANNER, "exit_ad");
    }
}

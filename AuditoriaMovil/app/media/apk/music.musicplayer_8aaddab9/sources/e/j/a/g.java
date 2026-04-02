package e.j.a;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import e.j.d.c0.a0;
import e.j.d.w;
import h.o.b.p;
import i.a.e0;
@h.m.i.a.e(c = "com.zipoapps.ads.AdManager$showInterstitialAd$1", f = "AdManager.kt", l = {398, 404}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends h.m.i.a.h implements p<e0, h.m.d<? super h.k>, Object> {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public int f8469b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f8470c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FullScreenContentCallback f8471d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f8472e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f8473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, FullScreenContentCallback fullScreenContentCallback, boolean z, Activity activity, h.m.d<? super g> dVar) {
        super(2, dVar);
        this.f8470c = bVar;
        this.f8471d = fullScreenContentCallback;
        this.f8472e = z;
        this.f8473f = activity;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new g(this.f8470c, this.f8471d, this.f8472e, this.f8473f, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        return new g(this.f8470c, this.f8471d, this.f8472e, this.f8473f, dVar).invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        String message;
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.f8469b;
        if (i2 == 0) {
            w.E0(obj);
            i.a.h2.i iVar = new i.a.h2.i(this.f8470c.f8436f);
            this.f8469b = 1;
            obj = w.E(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                interstitialAd2 = (InterstitialAd) this.a;
                w.E0(obj);
                interstitialAd = interstitialAd2;
                interstitialAd.show(this.f8473f);
                this.f8470c.f();
                return h.k.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.E0(obj);
        }
        a0 a0Var = (a0) obj;
        if (!(a0Var instanceof a0.c)) {
            if (a0Var instanceof a0.b) {
                FullScreenContentCallback fullScreenContentCallback = this.f8471d;
                if (fullScreenContentCallback != null) {
                    Exception exc = ((a0.b) a0Var).f8618b;
                    String str = "";
                    if (exc != null && (message = exc.getMessage()) != null) {
                        str = message;
                    }
                    fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(-1, str, AdError.UNDEFINED_DOMAIN));
                }
                this.f8470c.f();
            }
            return h.k.a;
        }
        interstitialAd = (InterstitialAd) ((a0.c) a0Var).f8619b;
        interstitialAd.setFullScreenContentCallback(this.f8471d);
        if (this.f8472e) {
            this.a = interstitialAd;
            this.f8469b = 2;
            if (w.z(1000L, this) == aVar) {
                return aVar;
            }
            interstitialAd2 = interstitialAd;
            interstitialAd = interstitialAd2;
        }
        interstitialAd.show(this.f8473f);
        this.f8470c.f();
        return h.k.a;
    }
}

package e.j.d;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import e.j.a.b;
import e.j.d.c0.f0;
import e.j.d.k;
/* loaded from: classes2.dex */
public final class u extends FullScreenContentCallback {
    public final /* synthetic */ FullScreenContentCallback a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8849b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f8850c;

    /* loaded from: classes2.dex */
    public static final class a extends h.o.c.k implements h.o.b.l<Activity, h.k> {
        public final /* synthetic */ k a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FullScreenContentCallback f8851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, FullScreenContentCallback fullScreenContentCallback) {
            super(1);
            this.a = kVar;
            this.f8851b = fullScreenContentCallback;
        }

        @Override // h.o.b.l
        public h.k invoke(Activity activity) {
            h.o.c.j.e(activity, "it");
            k kVar = this.a;
            k.a aVar = k.a;
            kVar.c().k(4, null, "Update interstitial capping time", new Object[0]);
            ((f0) this.a.u.getValue()).b();
            if (this.a.f8812i.e(e.j.d.y.b.x) == b.EnumC0180b.GLOBAL) {
                this.a.f8811h.j("interstitial_capping_timestamp", Long.valueOf(System.currentTimeMillis()));
            }
            FullScreenContentCallback fullScreenContentCallback = this.f8851b;
            if (fullScreenContentCallback != null) {
                fullScreenContentCallback.onAdDismissedFullScreenContent();
            }
            return h.k.a;
        }
    }

    public u(FullScreenContentCallback fullScreenContentCallback, k kVar, Activity activity) {
        this.a = fullScreenContentCallback;
        this.f8849b = kVar;
        this.f8850c = activity;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        b.e(this.f8849b.f8813j, b.a.INTERSTITIAL, null, 2);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback == null) {
            return;
        }
        if (adError == null) {
            adError = new AdError(-1, "", AdError.UNDEFINED_DOMAIN);
        }
        fullScreenContentCallback.onAdFailedToShowFullScreenContent(adError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [e.j.d.c0.e, android.app.Application$ActivityLifecycleCallbacks, T] */
    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        b.g(this.f8849b.f8813j, b.a.INTERSTITIAL, null, 2);
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
        Application application = this.f8849b.f8807d;
        Class<?> cls = this.f8850c.getClass();
        a aVar = new a(this.f8849b, this.a);
        h.o.c.j.e(application, "<this>");
        h.o.c.j.e(cls, "activityClass");
        h.o.c.j.e(aVar, "action");
        h.o.c.q qVar = new h.o.c.q();
        ?? eVar = new e.j.d.c0.e(cls, new e.j.d.c0.f(cls, application, qVar, aVar));
        qVar.a = eVar;
        application.registerActivityLifecycleCallbacks(eVar);
    }
}

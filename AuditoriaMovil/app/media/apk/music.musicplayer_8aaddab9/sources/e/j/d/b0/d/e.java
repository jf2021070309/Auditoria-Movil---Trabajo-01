package e.j.d.b0.d;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import e.j.a.b;
import e.j.d.c0.a0;
import e.j.d.k;
import e.j.d.w;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e {
    public static final a a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ h.r.f<Object>[] f8584b;

    /* renamed from: c  reason: collision with root package name */
    public final Application f8585c;

    /* renamed from: d  reason: collision with root package name */
    public final e.j.d.i f8586d;

    /* renamed from: e  reason: collision with root package name */
    public final e.j.d.y.b f8587e;

    /* renamed from: f  reason: collision with root package name */
    public final e.j.d.z.d f8588f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8589g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a(h.o.c.f fVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.o.c.k implements h.o.b.p<Activity, Application.ActivityLifecycleCallbacks, h.k> {
        public final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f8590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, e eVar) {
            super(2);
            this.a = z;
            this.f8590b = eVar;
        }

        @Override // h.o.b.p
        public h.k i(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            Activity activity2 = activity;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = activityLifecycleCallbacks;
            h.o.c.j.e(activity2, "act");
            h.o.c.j.e(activityLifecycleCallbacks2, "callbacks");
            if (activity2 instanceof d) {
                ((d) activity2).m(this.a);
                this.f8590b.f8585c.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks2);
            }
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends FullScreenContentCallback {
        public final /* synthetic */ h.o.b.a<h.k> a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f8591b;

        public c(h.o.b.a<h.k> aVar, String str) {
            this.a = aVar;
            this.f8591b = str;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            e.j.d.k.a.a().f8813j.d(b.a.INTERSTITIAL, this.f8591b);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.a.invoke();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            this.a.invoke();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            e.j.d.k.a.a().f8813j.f(b.a.INTERSTITIAL, this.f8591b);
        }
    }

    static {
        h.o.c.n nVar = new h.o.c.n(e.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(h.o.c.r.a);
        f8584b = new h.r.f[]{nVar};
        a = new a(null);
    }

    public e(Application application, e.j.d.i iVar, e.j.d.y.b bVar) {
        h.o.c.j.e(application, "application");
        h.o.c.j.e(iVar, "preferences");
        h.o.c.j.e(bVar, "configuration");
        this.f8585c = application;
        this.f8586d = iVar;
        this.f8587e = bVar;
        this.f8588f = new e.j.d.z.d("PremiumHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(e.j.d.b0.d.e r4, android.app.Activity r5) {
        /*
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r5 instanceof com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L69
            boolean r4 = e.d.b.d.a.J(r5)
            if (r4 != 0) goto L69
            boolean r4 = r5 instanceof c.b.c.l
            if (r4 == 0) goto L6a
            e.j.d.k$a r2 = e.j.d.k.a
            e.j.d.k r3 = r2.a()
            e.j.d.b0.c.g r3 = r3.f8817n
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "activity"
            h.o.c.j.e(r5, r3)
            if (r4 == 0) goto L35
            c.b.c.l r5 = (c.b.c.l) r5
            androidx.fragment.app.FragmentManager r4 = r5.getSupportFragmentManager()
            java.lang.String r5 = "RATE_DIALOG"
            androidx.fragment.app.Fragment r4 = r4.F(r5)
            if (r4 == 0) goto L5b
            r4 = 1
            goto L5c
        L35:
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "Please use AppCompatActivity for "
            java.lang.String r4 = h.o.c.j.i(r5, r4)
            java.lang.String r5 = "message"
            h.o.c.j.e(r4, r5)
            e.j.d.k r5 = r2.a()
            e.j.d.y.b r5 = r5.f8812i
            boolean r5 = r5.j()
            if (r5 != 0) goto L5f
            java.lang.Object[] r5 = new java.lang.Object[r1]
            n.a.a$c r2 = n.a.a.f9946d
            r2.b(r4, r5)
        L5b:
            r4 = 0
        L5c:
            if (r4 == 0) goto L6a
            goto L69
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L69:
            r0 = 0
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.b0.d.e.a(e.j.d.b0.d.e, android.app.Activity):boolean");
    }

    public static final void b(e eVar, c.b.c.l lVar) {
        Objects.requireNonNull(eVar);
        e.j.d.k.a.a().f8817n.f(lVar, w.K(lVar), true, new l(eVar, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r0 < 5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (r0 < 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
        if (r0 != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(e.j.d.b0.d.e r11, c.b.c.l r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.b0.d.e.c(e.j.d.b0.d.e, c.b.c.l):void");
    }

    public static /* synthetic */ void g(e eVar, Activity activity, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            activity = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        eVar.f(activity, z);
    }

    public final e.j.d.z.c d() {
        return this.f8588f.a(this, f8584b[0]);
    }

    public final boolean e() {
        boolean z = false;
        if (this.f8586d.e() >= ((Number) this.f8587e.f(e.j.d.y.b.f8879m)).longValue()) {
            if (((CharSequence) this.f8587e.f(e.j.d.y.b.f8870d)).length() > 0) {
                long f2 = this.f8586d.f();
                if (f2 > 0 && f2 + 86400000 < System.currentTimeMillis()) {
                    z = true;
                }
                return !z;
            }
        }
        return false;
    }

    public final void f(Activity activity, boolean z) {
        if (this.f8589g) {
            return;
        }
        this.f8589g = true;
        if (activity instanceof d) {
            ((d) activity).m(z);
        } else {
            this.f8585c.registerActivityLifecycleCallbacks(new f(new b(z, this)));
        }
    }

    public final void h(Activity activity, String str, h.o.b.a<h.k> aVar) {
        if (this.f8586d.g()) {
            aVar.invoke();
            return;
        }
        k.a aVar2 = e.j.d.k.a;
        a0<InterstitialAd> value = aVar2.a().f8815l.f8435e.getValue();
        boolean z = value == null ? false : value instanceof a0.c;
        if (!z) {
            g(this, activity, false, 2);
        }
        aVar2.a().j(activity, new c(aVar, str), !z);
    }
}

package e.j.a.o;

import android.app.Application;
import ch.qos.logback.classic.Level;
/* loaded from: classes2.dex */
public final class f {
    public final e.j.a.b a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f8488b;

    /* renamed from: c  reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f8489c;

    /* loaded from: classes.dex */
    public interface a {
    }

    @h.m.i.a.e(c = "com.zipoapps.ads.exitads.ExitAds", f = "ExitAds.kt", l = {204}, m = "getNativeAdView")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8490b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f8491c;

        /* renamed from: e  reason: collision with root package name */
        public int f8493e;

        public b(h.m.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8491c = obj;
            this.f8493e |= Level.ALL_INT;
            return f.this.b(null, null, this);
        }
    }

    public f(e.j.a.b bVar, Application application) {
        h.o.c.j.e(bVar, "adManager");
        h.o.c.j.e(application, "application");
        this.a = bVar;
        this.f8488b = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(e.j.a.o.f r8, android.app.Activity r9, h.m.d r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.o.f.a(e.j.a.o.f, android.app.Activity, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:12:0x002d, B:23:0x0065, B:25:0x006b, B:27:0x0079, B:28:0x0086, B:29:0x008d, B:17:0x003c, B:20:0x0056), top: B:32:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r7, android.view.ViewGroup r8, h.m.d<? super android.view.View> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof e.j.a.o.f.b
            if (r0 == 0) goto L13
            r0 = r9
            e.j.a.o.f$b r0 = (e.j.a.o.f.b) r0
            int r1 = r0.f8493e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8493e = r1
            goto L18
        L13:
            e.j.a.o.f$b r0 = new e.j.a.o.f$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8491c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8493e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f8490b
            r8 = r7
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r7 = r0.a
            android.content.Context r7 = (android.content.Context) r7
            e.j.d.w.E0(r9)     // Catch: java.lang.Exception -> L8e
            goto L65
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            e.j.d.w.E0(r9)
            e.j.a.b r9 = r6.a     // Catch: java.lang.Exception -> L8e
            e.j.a.b$a r2 = e.j.a.b.a.NATIVE     // Catch: java.lang.Exception -> L8e
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = "adType"
            h.o.c.j.e(r2, r5)     // Catch: java.lang.Exception -> L8e
            java.lang.String r9 = r9.a(r2, r4)     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = "disabled"
            boolean r9 = h.o.c.j.a(r9, r2)     // Catch: java.lang.Exception -> L8e
            r9 = r9 ^ r4
            if (r9 != 0) goto L56
            return r3
        L56:
            e.j.a.b r9 = r6.a     // Catch: java.lang.Exception -> L8e
            r0.a = r7     // Catch: java.lang.Exception -> L8e
            r0.f8490b = r8     // Catch: java.lang.Exception -> L8e
            r0.f8493e = r4     // Catch: java.lang.Exception -> L8e
            java.lang.Object r9 = r9.c(r4, r0)     // Catch: java.lang.Exception -> L8e
            if (r9 != r1) goto L65
            return r1
        L65:
            e.j.d.c0.a0 r9 = (e.j.d.c0.a0) r9     // Catch: java.lang.Exception -> L8e
            boolean r0 = r9 instanceof e.j.d.c0.a0.c     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L8e
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)     // Catch: java.lang.Exception -> L8e
            r0 = 2131493022(0x7f0c009e, float:1.8609512E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)     // Catch: java.lang.Exception -> L8e
            if (r7 == 0) goto L86
            com.google.android.gms.ads.nativead.NativeAdView r7 = (com.google.android.gms.ads.nativead.NativeAdView) r7     // Catch: java.lang.Exception -> L8e
            e.j.d.c0.a0$c r9 = (e.j.d.c0.a0.c) r9     // Catch: java.lang.Exception -> L8e
            T r8 = r9.f8619b     // Catch: java.lang.Exception -> L8e
            com.google.android.gms.ads.nativead.NativeAd r8 = (com.google.android.gms.ads.nativead.NativeAd) r8     // Catch: java.lang.Exception -> L8e
            e.j.a.p.a.a(r8, r7)     // Catch: java.lang.Exception -> L8e
            r3 = r7
            goto L8e
        L86:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L8e
            java.lang.String r8 = "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView"
            r7.<init>(r8)     // Catch: java.lang.Exception -> L8e
            throw r7     // Catch: java.lang.Exception -> L8e
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.o.f.b(android.content.Context, android.view.ViewGroup, h.m.d):java.lang.Object");
    }

    public final boolean c() {
        e.j.d.k a2 = e.j.d.k.a.a();
        return !a2.e() && ((Boolean) a2.f8812i.f(e.j.d.y.b.u)).booleanValue();
    }
}

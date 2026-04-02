package e.h.g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.jrtstudio.tools.VisibilityHelper;
import e.h.g.j0;
import e.h.g.q0;
import e.h.g.s1;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class x0 extends c.s.b {

    /* renamed from: d  reason: collision with root package name */
    public static x0 f8405d;

    /* renamed from: e  reason: collision with root package name */
    public static ActivityManager f8406e;

    /* renamed from: f  reason: collision with root package name */
    public static r0 f8407f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8408g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f8409h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f8410i;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f8412k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f8413l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8414m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8415n;
    public static final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, Boolean> f8403b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8404c = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Object f8411j = new Object();

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
            r8 = new java.lang.String[]{"ForceStopRunnable", "android.media.AudioTrack.play", "com.mopub", "com.google.firebase", "com.facebook.ads", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, "com.google.android.gms.internal", "com.google.android.gms.common", "android.media.MediaPlayer.getInbandTrackInfo", "android.app.LoadedApk.makeApplication", "java.lang.Thread.nativeCreate", "com.amazon.device.ads"};
            r9 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
            if (r9 >= 12) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
            if (r5.contains(r8[r9]) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
            if (r6.contains("Bad notification for startForeground") != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
            if (r6.contains("Thread starting during runtime shutdown") == false) goto L64;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread.UncaughtExceptionHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void uncaughtException(java.lang.Thread r21, java.lang.Throwable r22) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.g.x0.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }

    public x0() {
        f8405d = this;
        l();
        s1.d s = s();
        if (s != null) {
            s1.i(s);
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    public static void C() {
        if (f8405d != null) {
            t1.f("Start crash reporting");
            f8405d.j();
        }
    }

    public static void F(z0 z0Var, final Class<?> cls, final Intent intent) {
        if (!v0.j()) {
            x0 x0Var = f8405d;
            if (x0Var != null) {
                try {
                    x0Var.startService(intent);
                    return;
                } catch (Throwable th) {
                    s1.l(th, true);
                    return;
                }
            }
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.l("start foreground service from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        if (z0Var == null) {
            j0.d(new j0.b() { // from class: e.h.g.r
                @Override // e.h.g.j0.b
                public final void a() {
                    r0 r0Var;
                    Class cls2 = cls;
                    Intent intent2 = intent;
                    long nanoTime = System.nanoTime();
                    do {
                        if (x0.f8405d != null && x0.f8408g && (r0Var = x0.f8407f) != null && r0Var.c() >= 3) {
                            t1.l("OK, we are as primed as we can be, try to start service");
                            HashMap<String, Boolean> hashMap = x0.f8403b;
                            synchronized (hashMap) {
                                hashMap.put(cls2.getName(), Boolean.TRUE);
                            }
                            x0.f8405d.bindService(new Intent(x0.f8405d, cls2), new w0(intent2), 1);
                            return;
                        }
                        if (!x0.f8408g && x0.f8405d != null) {
                            j0.h(new j0.c() { // from class: e.h.g.m
                                @Override // e.h.g.j0.c
                                public final void a() {
                                    x0.f8405d.D();
                                }
                            });
                        }
                        j1.n(50, new r0());
                    } while ((System.nanoTime() - nanoTime) / 1000000000 <= 10);
                    t1.l("We couldn't get started. :-(");
                }
            });
            return;
        }
        try {
            f8405d.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public static void l() {
        if (!v0.k() || f8410i) {
            return;
        }
        if (!j1.e()) {
            WebView.disableWebView();
        }
        f8410i = true;
    }

    public static long n() {
        x0 x0Var = f8405d;
        if (x0Var != null) {
            l0 h2 = l0.h(x0Var);
            long f2 = h2.f("93bccf3e", 0L);
            if (f2 == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                h2.o("93bccf3e", currentTimeMillis);
                return currentTimeMillis;
            }
            return f2;
        }
        return 0L;
    }

    public static String q(int i2) {
        return q1.e(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(final boolean z) {
        u();
        j0.h(new j0.c() { // from class: e.h.g.p
            @Override // e.h.g.j0.c
            public final void a() {
                x0.this.B(z);
            }
        });
    }

    public abstract void A(Throwable th);

    public final void B(final boolean z) {
        if (!f8412k) {
            j0.e(new j0.b() { // from class: e.h.g.q
                @Override // e.h.g.j0.b
                public final void a() {
                    x0.this.z(z);
                }
            }, 100);
        } else if (this.f8414m) {
            if (this.f8415n || !z) {
                return;
            }
            this.f8415n = true;
        } else {
            this.f8414m = true;
            E();
            if (z) {
                this.f8415n = true;
            }
            i();
        }
    }

    public abstract void D();

    public void E() {
        if (f8409h) {
            return;
        }
        if (j1.f()) {
            j0.f(new j0.b() { // from class: e.h.g.n
                @Override // e.h.g.j0.b
                public final void a() {
                    x0 x0Var = x0.this;
                    Objects.requireNonNull(x0Var);
                    try {
                        e.h.e.g.a();
                    } catch (Throwable unused) {
                    }
                    synchronized (x0.f8404c) {
                        if (!x0.f8409h) {
                            x0.f8409h = x0Var.k();
                        }
                    }
                }
            });
            return;
        }
        synchronized (f8404c) {
            if (!f8409h) {
                f8409h = k();
            }
        }
    }

    @Override // c.s.b, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f8407f = new r0();
        f8405d = this;
        try {
            if (VisibilityHelper.a == null) {
                VisibilityHelper.a = new VisibilityHelper();
            }
            j0.e(new i0(this), 100);
            l();
            q0.b m2 = m();
            if (m2 != null) {
                q0.f8373b = m2;
            }
            v();
            w();
            x();
        } catch (Exception e2) {
            s1.l(e2, true);
        }
    }

    public abstract void g();

    @Override // android.content.ContextWrapper, android.content.Context
    public abstract String getPackageName();

    public abstract void i();

    public abstract void j();

    public abstract boolean k();

    public abstract q0.b m();

    public abstract a1[] o();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        j0.e(new i0(this), 100);
        if (VisibilityHelper.a == null) {
            VisibilityHelper.a = new VisibilityHelper();
        }
        l();
        q0.b m2 = m();
        if (m2 != null) {
            q0.f8373b = m2;
        }
        v();
        w();
        x();
        j0.e(new j0.b() { // from class: e.h.g.o
            @Override // e.h.g.j0.b
            public final void a() {
                Handler handler = x0.a;
                try {
                    j1.e();
                    x0.n();
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }, 100);
        t1.l("JRT app onCreate called");
        j0.j(new j0.c() { // from class: e.h.g.s
            @Override // e.h.g.j0.c
            public final void a() {
                x0.this.B(false);
            }
        }, 1000L);
    }

    public abstract Locale p();

    public abstract boolean r();

    public abstract s1.d s();

    public abstract boolean t(String str, String str2, Throwable th);

    public void u() {
        if (f8412k) {
            return;
        }
        synchronized (f8411j) {
            g();
            f8412k = true;
            s1.d s = s();
            if (s != null) {
                s1.i(s);
            }
        }
    }

    public abstract void v();

    public abstract void w();

    public abstract void x();
}

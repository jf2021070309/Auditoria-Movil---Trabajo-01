package com.flurry.sdk;

import android.content.Context;
import android.os.SystemClock;
import com.flurry.sdk.ln;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class jz {
    static final String a = jz.class.getSimpleName();
    WeakReference<lm> b;
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = -1;
    public volatile long f = 0;
    private final kj<ln> g = new kj<ln>() { // from class: com.flurry.sdk.jz.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(ln lnVar) {
            ln lnVar2 = lnVar;
            if (jz.this.b == null || lnVar2.b == jz.this.b.get()) {
                switch (AnonymousClass4.a[lnVar2.c - 1]) {
                    case 1:
                        final jz jzVar = jz.this;
                        lm lmVar = lnVar2.b;
                        Context context = lnVar2.a.get();
                        jzVar.b = new WeakReference<>(lmVar);
                        jzVar.c = System.currentTimeMillis();
                        jzVar.d = SystemClock.elapsedRealtime();
                        if (lmVar == null || context == null) {
                            ko.a(3, jz.a, "Flurry session id cannot be created.");
                        } else {
                            ko.a(3, jz.a, "Flurry session id started:" + jzVar.c);
                            ln lnVar3 = new ln();
                            lnVar3.a = new WeakReference<>(context);
                            lnVar3.b = lmVar;
                            lnVar3.c = ln.a.b;
                            lnVar3.b();
                        }
                        ka.a().b(new mc() { // from class: com.flurry.sdk.jz.3
                            @Override // com.flurry.sdk.mc
                            public final void a() {
                                jr.a().e();
                            }
                        });
                        return;
                    case 2:
                        jz jzVar2 = jz.this;
                        lnVar2.a.get();
                        jzVar2.a();
                        return;
                    case 3:
                        jz jzVar3 = jz.this;
                        lnVar2.a.get();
                        jzVar3.e = SystemClock.elapsedRealtime() - jzVar3.d;
                        return;
                    case 4:
                        kk.a().b("com.flurry.android.sdk.FlurrySessionEvent", jz.this.g);
                        jz.b();
                        return;
                    default:
                        return;
                }
            }
        }
    };
    private volatile long h = 0;
    private String i;
    private String j;
    private Map<String, String> k;

    /* renamed from: com.flurry.sdk.jz$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[ln.a.a().length];

        static {
            try {
                a[ln.a.a - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[ln.a.c - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[ln.a.d - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[ln.a.e - 1] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public jz() {
        kk.a().a("com.flurry.android.sdk.FlurrySessionEvent", this.g);
        this.k = new LinkedHashMap<String, String>() { // from class: com.flurry.sdk.jz.2
            @Override // java.util.LinkedHashMap
            protected final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                return size() > 10;
            }
        };
    }

    public final synchronized void a() {
        long j = lo.a().a;
        if (j > 0) {
            this.f = (System.currentTimeMillis() - j) + this.f;
        }
    }

    public static void b() {
    }

    public final synchronized long c() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        if (elapsedRealtime <= this.h) {
            elapsedRealtime = this.h + 1;
            this.h = elapsedRealtime;
        }
        this.h = elapsedRealtime;
        return this.h;
    }

    public final synchronized String d() {
        return this.i;
    }

    public final synchronized void a(String str) {
        this.i = str;
    }

    public final synchronized String e() {
        return this.j;
    }

    public final synchronized void b(String str) {
        this.j = str;
    }

    public final synchronized void a(String str, String str2) {
        this.k.put(str, str2);
    }

    public final synchronized Map<String, String> f() {
        return this.k;
    }
}

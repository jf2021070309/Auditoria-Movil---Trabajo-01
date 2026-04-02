package com.amazon.aps.iva.ts;

import com.amazon.aps.iva.sv.o2;
import java.util.concurrent.TimeUnit;
/* compiled from: ConfigurationImpl.kt */
/* loaded from: classes2.dex */
public final class a implements o2, c, com.amazon.aps.iva.ve.a, com.amazon.aps.iva.co.a {
    public static final a a = new a();
    public static final long b;
    public static final long c;
    public static final boolean d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final boolean s;
    public static final long t;
    public static final String u;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = timeUnit.toMillis(2L);
        c = timeUnit.toMillis(7L);
        d = true;
        e = "cr-production";
        f = "e0vemjple0l1luii7h5vlu5no";
        g = "/skip-events/production/";
        h = ".prd.crunchyrollsvc.com";
        i = "https://beta-api.crunchyroll.com";
        j = "https://www.crunchyroll.com/";
        k = "https://static.crunchyroll.com";
        l = "https://pl.crunchyroll.com";
        m = "oedarmxstlh1jvawimnq";
        n = "9lEhvHZJD32juV5dW9VOS57dopdJpgo1";
        o = "CR-AndroidMobile-SSAI-Prod";
        p = "6B9FA461";
        q = "https://eec.crunchyroll.com/";
        r = "app-config-default-production.json";
        s = true;
        t = 400L;
        timeUnit.toMillis(7L);
        timeUnit.toMillis(7L);
        u = "";
    }

    @Override // com.amazon.aps.iva.ts.c
    public final String a() {
        return h;
    }

    @Override // com.amazon.aps.iva.ts.c
    public final String b() {
        return i;
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final void c() {
    }

    @Override // com.amazon.aps.iva.co.a
    public final void d() {
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final long e() {
        return t;
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final void f() {
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final long g() {
        return b;
    }

    @Override // com.amazon.aps.iva.ts.c
    public final String getClientId() {
        return m;
    }

    @Override // com.amazon.aps.iva.ts.c
    public final String getClientSecret() {
        return n;
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final void h() {
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final long i() {
        return c;
    }

    @Override // com.amazon.aps.iva.sv.o2
    public final boolean j() {
        return d;
    }

    @Override // com.amazon.aps.iva.ve.a
    public final void k() {
    }

    @Override // com.amazon.aps.iva.ts.c
    public final void l() {
    }
}

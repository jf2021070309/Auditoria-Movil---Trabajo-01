package com.amazon.aps.iva.w5;

import android.net.Uri;
import com.amazon.aps.iva.q5.c0;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DataSpec.java */
/* loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ int k = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    /* compiled from: DataSpec.java */
    /* loaded from: classes.dex */
    public static final class a {
        public Uri a;
        public long d;
        public String f;
        public int g;
        public int b = 1;
        public Map<String, String> c = Collections.emptyMap();
        public long e = -1;

        public final i a() {
            com.amazon.aps.iva.cq.b.E(this.a, "The uri must be set.");
            return new i(this.a, 0L, this.b, null, this.c, this.d, this.e, this.f, this.g, null);
        }

        @CanIgnoreReturnValue
        public final void b(int i) {
            this.g = i;
        }

        @CanIgnoreReturnValue
        public final void c(ImmutableMap immutableMap) {
            this.c = immutableMap;
        }

        @CanIgnoreReturnValue
        public final void d(String str) {
            this.f = str;
        }
    }

    static {
        c0.a("media3.datasource");
    }

    public i(Uri uri) {
        this(uri, 0L, -1L);
    }

    public final i a(long j) {
        long j2 = this.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return b(j, j3);
    }

    public final i b(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return defpackage.e.f(sb, this.i, "]");
    }

    public i(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    public i(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        com.amazon.aps.iva.cq.b.t(j + j2 >= 0);
        com.amazon.aps.iva.cq.b.t(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }
}

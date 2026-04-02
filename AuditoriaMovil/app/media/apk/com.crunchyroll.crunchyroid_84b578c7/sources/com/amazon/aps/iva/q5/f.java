package com.amazon.aps.iva.q5;

import android.media.AudioAttributes;
import android.os.Bundle;
/* compiled from: AudioAttributes.java */
/* loaded from: classes.dex */
public final class f implements k {
    public static final f h = new f(0, 0, 1, 1, 0);
    public static final String i = com.amazon.aps.iva.t5.g0.L(0);
    public static final String j = com.amazon.aps.iva.t5.g0.L(1);
    public static final String k = com.amazon.aps.iva.t5.g0.L(2);
    public static final String l = com.amazon.aps.iva.t5.g0.L(3);
    public static final String m = com.amazon.aps.iva.t5.g0.L(4);
    public static final e n = new e(0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public c g;

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final AudioAttributes a;

        public c(f fVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(fVar.b).setFlags(fVar.c).setUsage(fVar.d);
            int i = com.amazon.aps.iva.t5.g0.a;
            if (i >= 29) {
                a.a(usage, fVar.e);
            }
            if (i >= 32) {
                b.a(usage, fVar.f);
            }
            this.a = usage.build();
        }
    }

    public f(int i2, int i3, int i4, int i5, int i6) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final c a() {
        if (this.g == null) {
            this.g = new c(this);
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        bundle.putInt(m, this.f);
        return bundle;
    }
}

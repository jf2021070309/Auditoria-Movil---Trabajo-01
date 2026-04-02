package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: Tracks.java */
/* loaded from: classes.dex */
public final class v0 implements k {
    public static final v0 c = new v0(ImmutableList.of());
    public static final String d = com.amazon.aps.iva.t5.g0.L(0);
    public static final b e = new b(4);
    public final ImmutableList<a> b;

    /* compiled from: Tracks.java */
    /* loaded from: classes.dex */
    public static final class a implements k {
        public static final String g = com.amazon.aps.iva.t5.g0.L(0);
        public static final String h = com.amazon.aps.iva.t5.g0.L(1);
        public static final String i = com.amazon.aps.iva.t5.g0.L(3);
        public static final String j = com.amazon.aps.iva.t5.g0.L(4);
        public static final e k = new e(4);
        public final int b;
        public final s0 c;
        public final boolean d;
        public final int[] e;
        public final boolean[] f;

        public a(s0 s0Var, boolean z, int[] iArr, boolean[] zArr) {
            boolean z2;
            int i2 = s0Var.b;
            this.b = i2;
            boolean z3 = false;
            if (i2 == iArr.length && i2 == zArr.length) {
                z2 = true;
            } else {
                z2 = false;
            }
            com.amazon.aps.iva.cq.b.t(z2);
            this.c = s0Var;
            if (z && i2 > 1) {
                z3 = true;
            }
            this.d = z3;
            this.e = (int[]) iArr.clone();
            this.f = (boolean[]) zArr.clone();
        }

        public final a a(String str) {
            return new a(this.c.a(str), this.d, this.e, this.f);
        }

        public final s0 b() {
            return this.c;
        }

        public final v c(int i2) {
            return this.c.e[i2];
        }

        public final int d(int i2) {
            return this.e[i2];
        }

        public final int e() {
            return this.c.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.d == aVar.d && this.c.equals(aVar.c) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return Booleans.contains(this.f, true);
        }

        public final boolean g() {
            for (int i2 = 0; i2 < this.e.length; i2++) {
                if (i(i2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(int i2) {
            return this.f[i2];
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.e);
            return Arrays.hashCode(this.f) + ((hashCode + (((this.c.hashCode() * 31) + (this.d ? 1 : 0)) * 31)) * 31);
        }

        public final boolean i(int i2) {
            if (this.e[i2] != 4) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(g, this.c.toBundle());
            bundle.putIntArray(h, this.e);
            bundle.putBooleanArray(i, this.f);
            bundle.putBoolean(j, this.d);
            return bundle;
        }
    }

    public v0(ImmutableList immutableList) {
        this.b = ImmutableList.copyOf((Collection) immutableList);
    }

    public final ImmutableList<a> a() {
        return this.b;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList<a> immutableList = this.b;
            if (i2 >= immutableList.size()) {
                return false;
            }
            a aVar = immutableList.get(i2);
            if (aVar.f() && aVar.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean c() {
        int i = 0;
        while (true) {
            ImmutableList<a> immutableList = this.b;
            if (i >= immutableList.size()) {
                return false;
            }
            if (immutableList.get(i).e() == 2 && immutableList.get(i).g()) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            return this.b.equals(((v0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(d, com.amazon.aps.iva.t5.c.b(this.b));
        return bundle;
    }
}

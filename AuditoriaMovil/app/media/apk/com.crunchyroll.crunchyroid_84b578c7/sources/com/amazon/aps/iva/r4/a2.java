package com.amazon.aps.iva.r4;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;
/* compiled from: RemoteViewsTranslator.kt */
/* loaded from: classes.dex */
public final class a2 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final o0 d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final n0 h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final int l;
    public final boolean m;
    public final Integer n;
    public final boolean o;
    public final boolean p;

    public a2(Context context, int i, boolean z, o0 o0Var, int i2, boolean z2, AtomicInteger atomicInteger, n0 n0Var, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, boolean z4, boolean z5) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = o0Var;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = n0Var;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = i4;
        this.m = z3;
        this.n = num;
        this.o = z4;
        this.p = z5;
    }

    public static a2 b(a2 a2Var, int i, boolean z, AtomicInteger atomicInteger, n0 n0Var, int i2, boolean z2, Integer num, boolean z3, boolean z4, int i3) {
        Context context;
        int i4;
        boolean z5;
        o0 o0Var;
        int i5;
        boolean z6;
        AtomicInteger atomicInteger2;
        n0 n0Var2;
        long j;
        int i6;
        int i7;
        boolean z7;
        Integer num2;
        boolean z8;
        boolean z9;
        AtomicBoolean atomicBoolean = null;
        if ((i3 & 1) != 0) {
            context = a2Var.a;
        } else {
            context = null;
        }
        if ((i3 & 2) != 0) {
            i4 = a2Var.b;
        } else {
            i4 = 0;
        }
        if ((i3 & 4) != 0) {
            z5 = a2Var.c;
        } else {
            z5 = false;
        }
        if ((i3 & 8) != 0) {
            o0Var = a2Var.d;
        } else {
            o0Var = null;
        }
        if ((i3 & 16) != 0) {
            i5 = a2Var.e;
        } else {
            i5 = i;
        }
        if ((i3 & 32) != 0) {
            z6 = a2Var.f;
        } else {
            z6 = z;
        }
        if ((i3 & 64) != 0) {
            atomicInteger2 = a2Var.g;
        } else {
            atomicInteger2 = atomicInteger;
        }
        if ((i3 & 128) != 0) {
            n0Var2 = a2Var.h;
        } else {
            n0Var2 = n0Var;
        }
        if ((i3 & 256) != 0) {
            atomicBoolean = a2Var.i;
        }
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        if ((i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            j = a2Var.j;
        } else {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 1024) != 0) {
            i6 = a2Var.k;
        } else {
            i6 = i2;
        }
        if ((i3 & 2048) != 0) {
            i7 = a2Var.l;
        } else {
            i7 = 0;
        }
        if ((i3 & 4096) != 0) {
            z7 = a2Var.m;
        } else {
            z7 = z2;
        }
        if ((i3 & 8192) != 0) {
            num2 = a2Var.n;
        } else {
            num2 = num;
        }
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            z8 = a2Var.o;
        } else {
            z8 = z3;
        }
        if ((i3 & 32768) != 0) {
            z9 = a2Var.p;
        } else {
            z9 = z4;
        }
        a2Var.getClass();
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(atomicInteger2, "lastViewId");
        com.amazon.aps.iva.yb0.j.f(n0Var2, "parentContext");
        com.amazon.aps.iva.yb0.j.f(atomicBoolean2, "isBackgroundSpecified");
        return new a2(context, i4, z5, o0Var, i5, z6, atomicInteger2, n0Var2, atomicBoolean2, j2, i6, i7, z7, num2, z8, z9);
    }

    public final a2 a() {
        return b(this, 0, false, null, null, 0, true, null, false, false, 61439);
    }

    public final a2 c() {
        return b(this, 0, false, null, null, 0, false, null, true, false, 49151);
    }

    public final a2 d(n0 n0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(n0Var, "parent");
        return b(this, i, false, null, n0Var, 0, false, null, false, false, 65391);
    }

    public final a2 e() {
        return b(this, 0, false, null, null, 0, false, null, false, true, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, a2Var.a) && this.b == a2Var.b && this.c == a2Var.c && com.amazon.aps.iva.yb0.j.a(this.d, a2Var.d) && this.e == a2Var.e && this.f == a2Var.f && com.amazon.aps.iva.yb0.j.a(this.g, a2Var.g) && com.amazon.aps.iva.yb0.j.a(this.h, a2Var.h) && com.amazon.aps.iva.yb0.j.a(this.i, a2Var.i) && com.amazon.aps.iva.o2.g.a(this.j, a2Var.j) && this.k == a2Var.k && this.l == a2Var.l && this.m == a2Var.m && com.amazon.aps.iva.yb0.j.a(this.n, a2Var.n) && this.o == a2Var.o && this.p == a2Var.p) {
            return true;
        }
        return false;
    }

    public final a2 f(int i) {
        return b(this, 0, true, null, null, i, false, null, false, false, 64479);
    }

    public final a2 g(int i) {
        return b(this, 0, false, new AtomicInteger(1048576), null, i, false, null, false, false, 64447);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int a = com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31);
        int i = 1;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (a + i2) * 31;
        int i4 = 0;
        o0 o0Var = this.d;
        if (o0Var == null) {
            hashCode = 0;
        } else {
            hashCode = o0Var.hashCode();
        }
        int a2 = com.amazon.aps.iva.a0.r.a(this.e, (i3 + hashCode) * 31, 31);
        boolean z2 = this.f;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int hashCode2 = this.g.hashCode();
        int hashCode3 = this.h.hashCode();
        int hashCode4 = this.i.hashCode();
        int i6 = com.amazon.aps.iva.o2.g.d;
        int a3 = com.amazon.aps.iva.a0.r.a(this.l, com.amazon.aps.iva.a0.r.a(this.k, com.amazon.aps.iva.b8.i.a(this.j, (hashCode4 + ((hashCode3 + ((hashCode2 + ((a2 + i5) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
        boolean z3 = this.m;
        int i7 = z3;
        if (z3 != 0) {
            i7 = 1;
        }
        int i8 = (a3 + i7) * 31;
        Integer num = this.n;
        if (num != null) {
            i4 = num.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        boolean z4 = this.o;
        int i10 = z4;
        if (z4 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z5 = this.p;
        if (!z5) {
            i = z5 ? 1 : 0;
        }
        return i11 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslationContext(context=");
        sb.append(this.a);
        sb.append(", appWidgetId=");
        sb.append(this.b);
        sb.append(", isRtl=");
        sb.append(this.c);
        sb.append(", layoutConfiguration=");
        sb.append(this.d);
        sb.append(", itemPosition=");
        sb.append(this.e);
        sb.append(", isLazyCollectionDescendant=");
        sb.append(this.f);
        sb.append(", lastViewId=");
        sb.append(this.g);
        sb.append(", parentContext=");
        sb.append(this.h);
        sb.append(", isBackgroundSpecified=");
        sb.append(this.i);
        sb.append(", layoutSize=");
        sb.append((Object) com.amazon.aps.iva.o2.g.d(this.j));
        sb.append(", layoutCollectionViewId=");
        sb.append(this.k);
        sb.append(", layoutCollectionItemId=");
        sb.append(this.l);
        sb.append(", canUseSelectableGroup=");
        sb.append(this.m);
        sb.append(", actionTargetId=");
        sb.append(this.n);
        sb.append(", isAdapterView=");
        sb.append(this.o);
        sb.append(", isCompoundButton=");
        return defpackage.a.b(sb, this.p, ')');
    }
}

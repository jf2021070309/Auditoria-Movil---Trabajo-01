package com.amazon.aps.iva.i1;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.i0;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.o2.h;
import com.amazon.aps.iva.o2.k;
import com.amazon.aps.iva.ob0.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BitmapPainter.kt */
/* loaded from: classes.dex */
public final class a extends c {
    public final i0 b;
    public final long c;
    public final long d;
    public int e;
    public final long f;
    public float g;
    public y h;

    public a(i0 i0Var, long j, long j2) {
        int i;
        j.f(i0Var, "image");
        this.b = i0Var;
        this.c = j;
        this.d = j2;
        boolean z = true;
        this.e = 1;
        int i2 = h.c;
        if ((((int) (j >> 32)) < 0 || h.b(j) < 0 || (i = (int) (j2 >> 32)) < 0 || com.amazon.aps.iva.o2.j.b(j2) < 0 || i > i0Var.getWidth() || com.amazon.aps.iva.o2.j.b(j2) > i0Var.getHeight()) ? false : false) {
            this.f = j2;
            this.g = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyAlpha(float f) {
        this.g = f;
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyColorFilter(y yVar) {
        this.h = yVar;
        return true;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(this.b, aVar.b) || !h.a(this.c, aVar.c) || !com.amazon.aps.iva.o2.j.a(this.d, aVar.d)) {
            return false;
        }
        if (this.e == aVar.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.i1.c
    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public final long mo16getIntrinsicSizeNHjbRc() {
        return k.b(this.f);
    }

    public final int hashCode() {
        int i = h.c;
        return Integer.hashCode(this.e) + i.a(this.d, i.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    @Override // com.amazon.aps.iva.i1.c
    public final void onDraw(e eVar) {
        j.f(eVar, "<this>");
        e.I(eVar, this.b, this.c, this.d, 0L, k.a(f.a(g.d(eVar.h())), f.a(g.b(eVar.h()))), this.g, null, this.h, 0, this.e, 328);
    }

    public final String toString() {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.b);
        sb.append(", srcOffset=");
        sb.append((Object) h.c(this.c));
        sb.append(", srcSize=");
        sb.append((Object) com.amazon.aps.iva.o2.j.c(this.d));
        sb.append(", filterQuality=");
        int i = this.e;
        boolean z4 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "None";
        } else {
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = "Low";
            } else {
                if (i == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = "Medium";
                } else {
                    if (i == 3) {
                        z4 = true;
                    }
                    if (z4) {
                        str = "High";
                    } else {
                        str = "Unknown";
                    }
                }
            }
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public a(i0 i0Var) {
        this(i0Var, h.b, k.a(i0Var.getWidth(), i0Var.getHeight()));
    }
}

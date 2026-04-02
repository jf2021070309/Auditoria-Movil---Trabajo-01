package com.amazon.aps.iva.i1;

import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.e;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ColorPainter.kt */
/* loaded from: classes.dex */
public final class b extends c {
    public final long b;
    public y d;
    public float c = 1.0f;
    public final long e = g.c;

    public b(long j) {
        this.b = j;
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyAlpha(float f) {
        this.c = f;
        return true;
    }

    @Override // com.amazon.aps.iva.i1.c
    public final boolean applyColorFilter(y yVar) {
        this.d = yVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (x.c(this.b, ((b) obj).b)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.i1.c
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo16getIntrinsicSizeNHjbRc() {
        return this.e;
    }

    public final int hashCode() {
        int i = x.h;
        return Long.hashCode(this.b);
    }

    @Override // com.amazon.aps.iva.i1.c
    public final void onDraw(e eVar) {
        j.f(eVar, "<this>");
        e.H(eVar, this.b, 0L, 0L, this.c, this.d, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) x.i(this.b)) + ')';
    }
}

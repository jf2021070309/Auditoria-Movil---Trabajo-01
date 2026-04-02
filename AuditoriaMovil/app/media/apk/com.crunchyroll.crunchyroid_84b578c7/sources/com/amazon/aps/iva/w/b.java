package com.amazon.aps.iva.w;

import android.content.Context;
import android.content.res.ColorStateList;
import com.amazon.aps.iva.w.a;
/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public final class b implements d {
    public static e o(c cVar) {
        return (e) ((a.C0812a) cVar).a;
    }

    @Override // com.amazon.aps.iva.w.d
    public final void a(c cVar) {
        g(cVar, l(cVar));
    }

    @Override // com.amazon.aps.iva.w.d
    public final float b(c cVar) {
        return a.this.getElevation();
    }

    @Override // com.amazon.aps.iva.w.d
    public final void c(c cVar) {
        float f;
        a.C0812a c0812a = (a.C0812a) cVar;
        if (!a.this.getUseCompatPadding()) {
            c0812a.a(0, 0, 0, 0);
            return;
        }
        float l = l(c0812a);
        float h = h(c0812a);
        a aVar = a.this;
        if (aVar.getPreventCornerOverlap()) {
            f = (float) (((1.0d - f.a) * h) + l);
        } else {
            int i = f.b;
            f = l;
        }
        int ceil = (int) Math.ceil(f);
        int ceil2 = (int) Math.ceil(f.a(l, h, aVar.getPreventCornerOverlap()));
        c0812a.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.amazon.aps.iva.w.d
    public final float d(c cVar) {
        return h(cVar) * 2.0f;
    }

    @Override // com.amazon.aps.iva.w.d
    public final void e(a.C0812a c0812a, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        e eVar = new e(f, colorStateList);
        c0812a.a = eVar;
        a aVar = a.this;
        aVar.setBackgroundDrawable(eVar);
        aVar.setClipToOutline(true);
        aVar.setElevation(f2);
        g(c0812a, f3);
    }

    @Override // com.amazon.aps.iva.w.d
    public final void f(c cVar, ColorStateList colorStateList) {
        e o = o(cVar);
        o.b(colorStateList);
        o.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.w.d
    public final void g(c cVar, float f) {
        e o = o(cVar);
        a.C0812a c0812a = (a.C0812a) cVar;
        boolean useCompatPadding = a.this.getUseCompatPadding();
        boolean preventCornerOverlap = a.this.getPreventCornerOverlap();
        if (f != o.e || o.f != useCompatPadding || o.g != preventCornerOverlap) {
            o.e = f;
            o.f = useCompatPadding;
            o.g = preventCornerOverlap;
            o.c(null);
            o.invalidateSelf();
        }
        c(c0812a);
    }

    @Override // com.amazon.aps.iva.w.d
    public final float h(c cVar) {
        return o(cVar).a;
    }

    @Override // com.amazon.aps.iva.w.d
    public final float i(c cVar) {
        return h(cVar) * 2.0f;
    }

    @Override // com.amazon.aps.iva.w.d
    public final void j(c cVar, float f) {
        a.this.setElevation(f);
    }

    @Override // com.amazon.aps.iva.w.d
    public final void k(c cVar) {
        g(cVar, l(cVar));
    }

    @Override // com.amazon.aps.iva.w.d
    public final float l(c cVar) {
        return o(cVar).e;
    }

    @Override // com.amazon.aps.iva.w.d
    public final ColorStateList m(c cVar) {
        return o(cVar).h;
    }

    @Override // com.amazon.aps.iva.w.d
    public final void n(c cVar, float f) {
        e o = o(cVar);
        if (f != o.a) {
            o.a = f;
            o.c(null);
            o.invalidateSelf();
        }
    }
}

package com.amazon.aps.iva.ba;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public final class o implements d, l, i, a.InterfaceC0165a, j {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final d0 c;
    public final com.amazon.aps.iva.ia.b d;
    public final String e;
    public final boolean f;
    public final com.amazon.aps.iva.ca.d g;
    public final com.amazon.aps.iva.ca.d h;
    public final com.amazon.aps.iva.ca.q i;
    public c j;

    public o(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.k kVar) {
        this.c = d0Var;
        this.d = bVar;
        this.e = kVar.a;
        this.f = kVar.e;
        com.amazon.aps.iva.ca.a<Float, Float> d = kVar.b.d();
        this.g = (com.amazon.aps.iva.ca.d) d;
        bVar.g(d);
        d.a(this);
        com.amazon.aps.iva.ca.a<Float, Float> d2 = kVar.c.d();
        this.h = (com.amazon.aps.iva.ca.d) d2;
        bVar.g(d2);
        d2.a(this);
        com.amazon.aps.iva.ga.k kVar2 = kVar.d;
        kVar2.getClass();
        com.amazon.aps.iva.ca.q qVar = new com.amazon.aps.iva.ca.q(kVar2);
        this.i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        Path b = this.j.b();
        Path path = this.b;
        path.reset();
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i >= 0) {
                Matrix matrix = this.a;
                matrix.set(this.i.e(i + floatValue2));
                path.addPath(b, matrix);
            } else {
                return path;
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        this.j.c(list, list2);
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
        for (int i2 = 0; i2 < this.j.h.size(); i2++) {
            b bVar = this.j.h.get(i2);
            if (bVar instanceof j) {
                com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, (j) bVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        this.j.f(rectF, matrix, z);
    }

    @Override // com.amazon.aps.iva.ba.i
    public final void g(ListIterator<b> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new c(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.f().floatValue();
        float floatValue2 = this.h.f().floatValue();
        com.amazon.aps.iva.ca.q qVar = this.i;
        float floatValue3 = qVar.m.f().floatValue() / 100.0f;
        float floatValue4 = qVar.n.f().floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.a;
                matrix2.set(matrix);
                float f = i2;
                matrix2.preConcat(qVar.e(f + floatValue2));
                PointF pointF = com.amazon.aps.iva.ma.f.a;
                this.j.h(canvas, matrix2, (int) ((((floatValue4 - floatValue3) * (f / floatValue)) + floatValue3) * i));
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (this.i.c(cVar, obj)) {
            return;
        }
        if (obj == h0.u) {
            this.g.k(cVar);
        } else if (obj == h0.v) {
            this.h.k(cVar);
        }
    }
}

package com.amazon.aps.iva.ba;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public final class s extends a {
    public final com.amazon.aps.iva.ia.b r;
    public final String s;
    public final boolean t;
    public final com.amazon.aps.iva.ca.b u;
    public com.amazon.aps.iva.ca.r v;

    public s(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.q qVar) {
        super(d0Var, bVar, qVar.g.toPaintCap(), qVar.h.toPaintJoin(), qVar.i, qVar.e, qVar.f, qVar.c, qVar.b);
        this.r = bVar;
        this.s = qVar.a;
        this.t = qVar.j;
        com.amazon.aps.iva.ca.a<Integer, Integer> d = qVar.d.d();
        this.u = (com.amazon.aps.iva.ca.b) d;
        d.a(this);
        bVar.g(d);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.ba.a, com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        com.amazon.aps.iva.ca.b bVar = this.u;
        int l = bVar.l(bVar.b(), bVar.d());
        com.amazon.aps.iva.aa.a aVar = this.i;
        aVar.setColor(l);
        com.amazon.aps.iva.ca.r rVar = this.v;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.f());
        }
        super.h(canvas, matrix, i);
    }

    @Override // com.amazon.aps.iva.ba.a, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        Integer num = h0.b;
        com.amazon.aps.iva.ca.b bVar = this.u;
        if (obj == num) {
            bVar.k(cVar);
        } else if (obj == h0.K) {
            com.amazon.aps.iva.ca.r rVar = this.v;
            com.amazon.aps.iva.ia.b bVar2 = this.r;
            if (rVar != null) {
                bVar2.q(rVar);
            }
            if (cVar == null) {
                this.v = null;
                return;
            }
            com.amazon.aps.iva.ca.r rVar2 = new com.amazon.aps.iva.ca.r(cVar, null);
            this.v = rVar2;
            rVar2.a(this);
            bVar2.g(bVar);
        }
    }
}

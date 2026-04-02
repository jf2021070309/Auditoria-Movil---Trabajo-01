package com.amazon.aps.iva.ia;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.amazon.aps.iva.ha.o;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.ka.j;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public final class g extends b {
    public final com.amazon.aps.iva.ba.c C;
    public final c D;

    public g(com.amazon.aps.iva.z9.h hVar, d0 d0Var, c cVar, e eVar) {
        super(d0Var, eVar);
        this.D = cVar;
        com.amazon.aps.iva.ba.c cVar2 = new com.amazon.aps.iva.ba.c(d0Var, this, new o("__container", eVar.a, false), hVar);
        this.C = cVar2;
        cVar2.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        this.C.f(rectF, this.n, z);
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void l(Canvas canvas, Matrix matrix, int i) {
        this.C.h(canvas, matrix, i);
    }

    @Override // com.amazon.aps.iva.ia.b
    public final i0 m() {
        i0 i0Var = this.p.w;
        if (i0Var != null) {
            return i0Var;
        }
        return this.D.p.w;
    }

    @Override // com.amazon.aps.iva.ia.b
    public final j n() {
        j jVar = this.p.x;
        if (jVar != null) {
            return jVar;
        }
        return this.D.p.x;
    }

    @Override // com.amazon.aps.iva.ia.b
    public final void r(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        this.C.d(eVar, i, arrayList, eVar2);
    }
}

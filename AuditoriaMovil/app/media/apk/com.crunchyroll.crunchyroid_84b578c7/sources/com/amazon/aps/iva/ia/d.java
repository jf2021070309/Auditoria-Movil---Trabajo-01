package com.amazon.aps.iva.ia;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.r;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.e0;
import com.amazon.aps.iva.z9.h0;
/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public final class d extends b {
    public final com.amazon.aps.iva.aa.a C;
    public final Rect D;
    public final Rect E;
    public final e0 F;
    public r G;
    public r H;

    public d(d0 d0Var, e eVar) {
        super(d0Var, eVar);
        e0 e0Var;
        this.C = new com.amazon.aps.iva.aa.a(3);
        this.D = new Rect();
        this.E = new Rect();
        com.amazon.aps.iva.z9.h hVar = d0Var.b;
        if (hVar == null) {
            e0Var = null;
        } else {
            e0Var = hVar.d.get(eVar.g);
        }
        this.F = e0Var;
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        super.f(rectF, matrix, z);
        e0 e0Var = this.F;
        if (e0Var != null) {
            float c = com.amazon.aps.iva.ma.g.c();
            rectF.set(0.0f, 0.0f, e0Var.a * c, e0Var.b * c);
            this.n.mapRect(rectF);
        }
    }

    @Override // com.amazon.aps.iva.ia.b, com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        super.i(cVar, obj);
        if (obj == h0.K) {
            if (cVar == null) {
                this.G = null;
            } else {
                this.G = new r(cVar, null);
            }
        } else if (obj == h0.N) {
            if (cVar == null) {
                this.H = null;
            } else {
                this.H = new r(cVar, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    @Override // com.amazon.aps.iva.ia.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r15, android.graphics.Matrix r16, int r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ia.d.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}

package com.amazon.aps.iva.a0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.v1.w1 implements com.amazon.aps.iva.c1.h {
    public final b d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(com.amazon.aps.iva.a0.b r3) {
        /*
            r2 = this;
            com.amazon.aps.iva.v1.t1$a r0 = com.amazon.aps.iva.v1.t1.a
            java.lang.String r1 = "overscrollEffect"
            com.amazon.aps.iva.yb0.j.f(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            r2.<init>(r0)
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.z.<init>(com.amazon.aps.iva.a0.b):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.d, ((z) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.d + ')';
    }

    @Override // com.amazon.aps.iva.c1.h
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        cVar.f1();
        b bVar = this.d;
        bVar.getClass();
        if (!com.amazon.aps.iva.e1.g.e(bVar.o)) {
            com.amazon.aps.iva.f1.u a = cVar.R0().a();
            bVar.l.getValue();
            Canvas canvas = com.amazon.aps.iva.f1.h.a;
            com.amazon.aps.iva.yb0.j.f(a, "<this>");
            Canvas canvas2 = ((com.amazon.aps.iva.f1.g) a).a;
            EdgeEffect edgeEffect = bVar.j;
            boolean z6 = true;
            if (a0.b(edgeEffect) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bVar.h(cVar, edgeEffect, canvas2);
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = bVar.e;
            if (!edgeEffect2.isFinished()) {
                z2 = bVar.g(cVar, edgeEffect2, canvas2);
                a0.c(edgeEffect, a0.b(edgeEffect2));
            } else {
                z2 = false;
            }
            EdgeEffect edgeEffect3 = bVar.h;
            if (a0.b(edgeEffect3) == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                bVar.f(cVar, edgeEffect3, canvas2);
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = bVar.c;
            boolean isFinished = edgeEffect4.isFinished();
            n1 n1Var = bVar.a;
            if (!isFinished) {
                int save = canvas2.save();
                canvas2.translate(0.0f, cVar.P0(n1Var.b.d()));
                boolean draw = edgeEffect4.draw(canvas2);
                canvas2.restoreToCount(save);
                if (!draw && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                a0.c(edgeEffect3, a0.b(edgeEffect4));
            }
            EdgeEffect edgeEffect5 = bVar.k;
            if (a0.b(edgeEffect5) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                bVar.g(cVar, edgeEffect5, canvas2);
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = bVar.f;
            if (!edgeEffect6.isFinished()) {
                if (!bVar.h(cVar, edgeEffect6, canvas2) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                a0.c(edgeEffect5, a0.b(edgeEffect6));
            }
            EdgeEffect edgeEffect7 = bVar.i;
            if (a0.b(edgeEffect7) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                int save2 = canvas2.save();
                canvas2.translate(0.0f, cVar.P0(n1Var.b.d()));
                edgeEffect7.draw(canvas2);
                canvas2.restoreToCount(save2);
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = bVar.d;
            if (!edgeEffect8.isFinished()) {
                if (!bVar.f(cVar, edgeEffect8, canvas2) && !z2) {
                    z6 = false;
                }
                a0.c(edgeEffect7, a0.b(edgeEffect8));
                z2 = z6;
            }
            if (z2) {
                bVar.i();
            }
        }
    }
}

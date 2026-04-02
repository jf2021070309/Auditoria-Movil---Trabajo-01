package com.amazon.aps.iva.h1;

import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.f1.i0;
import com.amazon.aps.iva.f1.m;
import com.amazon.aps.iva.f1.m0;
import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.o2.k;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
/* compiled from: DrawScope.kt */
/* loaded from: classes.dex */
public interface e extends com.amazon.aps.iva.o2.c {
    static /* synthetic */ void D(e eVar, long j, float f, long j2, f fVar, int i) {
        float f2;
        long j3;
        float f3;
        h hVar;
        int i2;
        if ((i & 2) != 0) {
            f2 = com.amazon.aps.iva.e1.g.c(eVar.h()) / 2.0f;
        } else {
            f2 = f;
        }
        if ((i & 4) != 0) {
            j3 = eVar.Z0();
        } else {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        float f4 = f3;
        if ((i & 16) != 0) {
            hVar = h.a;
        } else {
            hVar = fVar;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.U0(j, f2, j3, f4, hVar, null, i2);
    }

    static /* synthetic */ void E(e eVar, m0 m0Var, s sVar, float f, i iVar, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        h hVar = iVar;
        if ((i & 8) != 0) {
            hVar = h.a;
        }
        f fVar = hVar;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.F(m0Var, sVar, f2, fVar, null, i2);
    }

    static void H(e eVar, long j, long j2, long j3, float f, y yVar, int i) {
        long j4;
        long j5;
        float f2;
        h hVar;
        y yVar2;
        int i2;
        if ((i & 2) != 0) {
            j4 = com.amazon.aps.iva.e1.c.b;
        } else {
            j4 = j2;
        }
        if ((i & 4) != 0) {
            j5 = J0(eVar.h(), j4);
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            hVar = h.a;
        } else {
            hVar = null;
        }
        if ((i & 32) != 0) {
            yVar2 = null;
        } else {
            yVar2 = yVar;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.X0(j, j4, j5, f2, hVar, yVar2, i2);
    }

    static void I(e eVar, i0 i0Var, long j, long j2, long j3, long j4, float f, f fVar, y yVar, int i, int i2, int i3) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        h hVar;
        y yVar2;
        int i4;
        int i5;
        if ((i3 & 2) != 0) {
            j5 = com.amazon.aps.iva.o2.h.b;
        } else {
            j5 = j;
        }
        if ((i3 & 4) != 0) {
            j6 = k.a(i0Var.getWidth(), i0Var.getHeight());
        } else {
            j6 = j2;
        }
        if ((i3 & 8) != 0) {
            j7 = com.amazon.aps.iva.o2.h.b;
        } else {
            j7 = j3;
        }
        if ((i3 & 16) != 0) {
            j8 = j6;
        } else {
            j8 = j4;
        }
        if ((i3 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i3 & 64) != 0) {
            hVar = h.a;
        } else {
            hVar = fVar;
        }
        if ((i3 & 128) != 0) {
            yVar2 = null;
        } else {
            yVar2 = yVar;
        }
        if ((i3 & 256) != 0) {
            i4 = 3;
        } else {
            i4 = i;
        }
        if ((i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        eVar.n0(i0Var, j5, j6, j7, j8, f2, hVar, yVar2, i4, i5);
    }

    private static long J0(long j, long j2) {
        return r.d(com.amazon.aps.iva.e1.g.d(j) - com.amazon.aps.iva.e1.c.c(j2), com.amazon.aps.iva.e1.g.b(j) - com.amazon.aps.iva.e1.c.d(j2));
    }

    static /* synthetic */ void K0(e eVar, s sVar, long j, long j2, float f, float f2, int i) {
        float f3;
        float f4;
        int i2;
        if ((i & 8) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        if ((i & 256) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.A0(sVar, j, j2, f3, 0, null, f4, null, i2);
    }

    static void L0(e eVar, s sVar, long j, long j2, long j3, i iVar, int i) {
        long j4;
        long j5;
        long j6;
        float f;
        h hVar;
        int i2;
        if ((i & 2) != 0) {
            j4 = com.amazon.aps.iva.e1.c.b;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            j5 = J0(eVar.h(), j4);
        } else {
            j5 = j2;
        }
        if ((i & 8) != 0) {
            j6 = com.amazon.aps.iva.e1.a.b;
        } else {
            j6 = j3;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            hVar = h.a;
        } else {
            hVar = iVar;
        }
        if ((i & 128) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.E0(sVar, j4, j5, j6, f2, hVar, null, i2);
    }

    static void N(e eVar, i0 i0Var, y yVar) {
        eVar.T(i0Var, com.amazon.aps.iva.e1.c.b, 1.0f, h.a, yVar, 3);
    }

    static /* synthetic */ void m0(e eVar, long j, long j2, long j3, float f, int i, int i2) {
        float f2;
        int i3;
        int i4;
        float f3 = 0.0f;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 64) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if ((i2 & 256) != 0) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        eVar.c0(j, j2, j3, f2, i3, null, f4, null, i4);
    }

    static void q0(e eVar, long j, float f, float f2, long j2, long j3, f fVar) {
        eVar.B0(j, f, f2, j2, j3, 1.0f, fVar, null, 3);
    }

    static void t0(e eVar, s sVar, long j, long j2, float f, f fVar, int i) {
        long j3;
        long j4;
        float f2;
        h hVar;
        int i2;
        if ((i & 2) != 0) {
            j3 = com.amazon.aps.iva.e1.c.b;
        } else {
            j3 = j;
        }
        if ((i & 4) != 0) {
            j4 = J0(eVar.h(), j3);
        } else {
            j4 = j2;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            hVar = h.a;
        } else {
            hVar = fVar;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        eVar.B(sVar, j3, j4, f2, hVar, null, i2);
    }

    void A0(s sVar, long j, long j2, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, y yVar, int i2);

    void B(s sVar, long j, long j2, float f, f fVar, y yVar, int i);

    void B0(long j, float f, float f2, long j2, long j3, float f3, f fVar, y yVar, int i);

    void E0(s sVar, long j, long j2, long j3, float f, f fVar, y yVar, int i);

    void F(m0 m0Var, s sVar, float f, f fVar, y yVar, int i);

    void Q(long j, long j2, long j3, long j4, f fVar, float f, y yVar, int i);

    a.b R0();

    void T(i0 i0Var, long j, float f, f fVar, y yVar, int i);

    void U0(long j, float f, long j2, float f2, f fVar, y yVar, int i);

    void X0(long j, long j2, long j3, float f, f fVar, y yVar, int i);

    default long Z0() {
        return r.j(R0().h());
    }

    void c0(long j, long j2, long j3, float f, int i, com.amazon.aps.iva.cq.b bVar, float f2, y yVar, int i2);

    l getLayoutDirection();

    default long h() {
        return R0().h();
    }

    void j0(m mVar, long j, float f, f fVar, y yVar, int i);

    default void n0(i0 i0Var, long j, long j2, long j3, long j4, float f, f fVar, y yVar, int i, int i2) {
        j.f(i0Var, "image");
        j.f(fVar, "style");
        I(this, i0Var, j, j2, j3, j4, f, fVar, yVar, i, 0, AdRequest.MAX_CONTENT_URL_LENGTH);
    }
}

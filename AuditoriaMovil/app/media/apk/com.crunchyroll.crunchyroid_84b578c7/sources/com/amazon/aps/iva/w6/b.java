package com.amazon.aps.iva.w6;

import com.amazon.aps.iva.a6.l;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.u1.g0;
import java.nio.ByteBuffer;
/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.a6.e {
    public final com.amazon.aps.iva.z5.f p;
    public final v q;
    public long r;
    public a s;
    public long t;

    public b() {
        super(6);
        this.p = new com.amazon.aps.iva.z5.f(1);
        this.q = new v();
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void C() {
        a aVar = this.s;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void E(long j, boolean z) {
        this.t = Long.MIN_VALUE;
        a aVar = this.s;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void J(com.amazon.aps.iva.q5.v[] vVarArr, long j, long j2) {
        this.r = j2;
    }

    @Override // com.amazon.aps.iva.a6.p1
    public final int c(com.amazon.aps.iva.q5.v vVar) {
        if ("application/x-camera-motion".equals(vVar.m)) {
            return p1.s(4, 0, 0);
        }
        return p1.s(0, 0, 0);
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final boolean g() {
        return true;
    }

    @Override // com.amazon.aps.iva.a6.o1, com.amazon.aps.iva.a6.p1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.l1.b
    public final void l(int i, Object obj) throws l {
        if (i == 8) {
            this.s = (a) obj;
        }
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void w(long j, long j2) {
        float[] fArr;
        while (!h() && this.t < 100000 + j) {
            com.amazon.aps.iva.z5.f fVar = this.p;
            fVar.k();
            g0 g0Var = this.d;
            g0Var.a();
            if (K(g0Var, fVar, 0) == -4 && !fVar.i(4)) {
                this.t = fVar.f;
                if (this.s != null && !fVar.j()) {
                    fVar.n();
                    ByteBuffer byteBuffer = fVar.d;
                    int i = com.amazon.aps.iva.t5.g0.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        v vVar = this.q;
                        vVar.D(limit, array);
                        vVar.F(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(vVar.h());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.s.b(fArr, this.t - this.r);
                    }
                }
            } else {
                return;
            }
        }
    }
}

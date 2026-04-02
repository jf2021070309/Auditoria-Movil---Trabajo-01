package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.p7.h;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.t;
import com.amazon.aps.iva.x6.u;
import com.amazon.aps.iva.x6.v;
import com.amazon.aps.iva.x6.w;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
/* compiled from: FlacReader.java */
/* loaded from: classes.dex */
public final class b extends h {
    public w n;
    public a o;

    /* compiled from: FlacReader.java */
    /* loaded from: classes.dex */
    public static final class a implements f {
        public final w a;
        public final w.a b;
        public long c = -1;
        public long d = -1;

        public a(w wVar, w.a aVar) {
            this.a = wVar;
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.p7.f
        public final long a(com.amazon.aps.iva.x6.i iVar) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // com.amazon.aps.iva.p7.f
        public final d0 b() {
            boolean z;
            if (this.c != -1) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            return new v(this.a, this.c);
        }

        @Override // com.amazon.aps.iva.p7.f
        public final void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[g0.f(jArr, j, true)];
        }
    }

    @Override // com.amazon.aps.iva.p7.h
    public final long b(com.amazon.aps.iva.t5.v vVar) {
        boolean z;
        byte[] bArr = vVar.a;
        if (bArr[0] == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return -1L;
        }
        int i = (bArr[2] & UnsignedBytes.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            vVar.G(4);
            vVar.A();
        }
        int b = t.b(i, vVar);
        vVar.F(0);
        return b;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final boolean c(com.amazon.aps.iva.t5.v vVar, long j, h.a aVar) {
        boolean z;
        byte[] bArr = vVar.a;
        w wVar = this.n;
        if (wVar == null) {
            w wVar2 = new w(bArr, 17);
            this.n = wVar2;
            aVar.a = wVar2.c(Arrays.copyOfRange(bArr, 9, vVar.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Ascii.DEL) == 3) {
            w.a a2 = u.a(vVar);
            w wVar3 = new w(wVar.a, wVar.b, wVar.c, wVar.d, wVar.e, wVar.g, wVar.h, wVar.j, a2, wVar.l);
            this.n = wVar3;
            this.o = new a(wVar3, a2);
            return true;
        }
        if (b == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.c = j;
            aVar.b = aVar2;
        }
        aVar.a.getClass();
        return false;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}

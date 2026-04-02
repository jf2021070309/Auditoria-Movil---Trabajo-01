package com.amazon.aps.iva.b7;

import com.amazon.aps.iva.b7.e;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.v;
import com.amazon.aps.iva.x6.f0;
import com.google.common.primitives.UnsignedBytes;
/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes.dex */
public final class f extends e {
    public final v b;
    public final v c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public f(f0 f0Var) {
        super(f0Var);
        this.b = new v(com.amazon.aps.iva.u5.d.a);
        this.c = new v(4);
    }

    public final boolean a(v vVar) throws e.a {
        int u = vVar.u();
        int i = (u >> 4) & 15;
        int i2 = u & 15;
        if (i2 == 7) {
            this.g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new e.a(c0.a("Video format not supported: ", i2));
    }

    public final boolean b(long j, v vVar) throws h0 {
        int i;
        int i2;
        int u = vVar.u();
        byte[] bArr = vVar.a;
        int i3 = vVar.b;
        int i4 = i3 + 1;
        int i5 = (((bArr[i3] & UnsignedBytes.MAX_VALUE) << 24) >> 8) | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 8);
        vVar.b = i4 + 1 + 1;
        long j2 = (((bArr[i] & UnsignedBytes.MAX_VALUE) | i5) * 1000) + j;
        f0 f0Var = this.a;
        if (u == 0 && !this.e) {
            v vVar2 = new v(new byte[vVar.c - vVar.b]);
            vVar.d(0, vVar2.a, vVar.c - vVar.b);
            com.amazon.aps.iva.x6.d a = com.amazon.aps.iva.x6.d.a(vVar2);
            this.d = a.b;
            v.a aVar = new v.a();
            aVar.k = "video/avc";
            aVar.h = a.i;
            aVar.p = a.c;
            aVar.q = a.d;
            aVar.t = a.h;
            aVar.m = a.a;
            f0Var.c(new com.amazon.aps.iva.q5.v(aVar));
            this.e = true;
            return false;
        } else if (u != 1 || !this.e) {
            return false;
        } else {
            if (this.g == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!this.f && i2 == 0) {
                return false;
            }
            com.amazon.aps.iva.t5.v vVar3 = this.c;
            byte[] bArr2 = vVar3.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.d;
            int i7 = 0;
            while (vVar.c - vVar.b > 0) {
                vVar.d(i6, vVar3.a, this.d);
                vVar3.F(0);
                int x = vVar3.x();
                com.amazon.aps.iva.t5.v vVar4 = this.b;
                vVar4.F(0);
                f0Var.a(4, vVar4);
                f0Var.a(x, vVar);
                i7 = i7 + 4 + x;
            }
            this.a.d(j2, i2, i7, 0, null);
            this.f = true;
            return true;
        }
    }
}

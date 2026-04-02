package com.amazon.aps.iva.p7;

import com.amazon.aps.iva.p7.h;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.v;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: OpusReader.java */
/* loaded from: classes.dex */
public final class g extends h {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(v vVar, byte[] bArr) {
        int i = vVar.c;
        int i2 = vVar.b;
        if (i - i2 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        vVar.d(0, bArr2, bArr.length);
        vVar.F(i2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.amazon.aps.iva.p7.h
    public final long b(v vVar) {
        byte[] bArr = vVar.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (this.i * com.amazon.aps.iva.cq.b.V(b2, b)) / 1000000;
    }

    @Override // com.amazon.aps.iva.p7.h
    public final boolean c(v vVar, long j, h.a aVar) throws h0 {
        if (e(vVar, o)) {
            byte[] copyOf = Arrays.copyOf(vVar.a, vVar.c);
            int i = copyOf[9] & UnsignedBytes.MAX_VALUE;
            ArrayList q = com.amazon.aps.iva.cq.b.q(copyOf);
            if (aVar.a != null) {
                return true;
            }
            v.a aVar2 = new v.a();
            aVar2.k = "audio/opus";
            aVar2.x = i;
            aVar2.y = 48000;
            aVar2.m = q;
            aVar.a = new com.amazon.aps.iva.q5.v(aVar2);
            return true;
        } else if (e(vVar, p)) {
            com.amazon.aps.iva.cq.b.D(aVar.a);
            if (this.n) {
                return true;
            }
            this.n = true;
            vVar.G(8);
            f0 a = com.amazon.aps.iva.x6.h0.a(ImmutableList.copyOf(com.amazon.aps.iva.x6.h0.b(vVar, false, false).a));
            if (a == null) {
                return true;
            }
            com.amazon.aps.iva.q5.v vVar2 = aVar.a;
            vVar2.getClass();
            v.a aVar3 = new v.a(vVar2);
            f0 f0Var = aVar.a.k;
            if (f0Var != null) {
                a = a.a(f0Var.b);
            }
            aVar3.i = a;
            aVar.a = new com.amazon.aps.iva.q5.v(aVar3);
            return true;
        } else {
            com.amazon.aps.iva.cq.b.D(aVar.a);
            return false;
        }
    }

    @Override // com.amazon.aps.iva.p7.h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}

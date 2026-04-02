package com.amazon.aps.iva.c6;

import com.amazon.aps.iva.r5.b;
import com.amazon.aps.iva.t5.g0;
import java.nio.ByteBuffer;
/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.r5.d {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = g0.e;
    public int n;
    public long o;

    @Override // com.amazon.aps.iva.r5.d, com.amazon.aps.iva.r5.b
    public final ByteBuffer a() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer j = j(length);
        int i3 = g0.i(length, 0, this.n);
        j.put(this.m, 0, i3);
        int i4 = g0.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        j.flip();
    }

    @Override // com.amazon.aps.iva.r5.d, com.amazon.aps.iva.r5.b
    public final boolean d() {
        if (super.d() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r5.d
    public final b.a f(b.a aVar) throws b.C0666b {
        if (aVar.c == 2) {
            this.k = true;
            if (this.i == 0 && this.j == 0) {
                return b.a.e;
            }
            return aVar;
        }
        throw new b.C0666b(aVar);
    }

    @Override // com.amazon.aps.iva.r5.d
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.amazon.aps.iva.r5.d
    public final void h() {
        int i;
        if (this.k) {
            if (this.n > 0) {
                this.o += i / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.amazon.aps.iva.r5.d
    public final void i() {
        this.m = g0.e;
    }
}

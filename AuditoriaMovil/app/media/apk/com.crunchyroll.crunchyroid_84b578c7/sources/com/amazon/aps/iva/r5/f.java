package com.amazon.aps.iva.r5;

import com.amazon.aps.iva.r5.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes.dex */
public final class f implements b {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public b.a e;
    public b.a f;
    public b.a g;
    public b.a h;
    public boolean i;
    public e j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public f() {
        b.a aVar = b.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = b.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final ByteBuffer a() {
        e eVar = this.j;
        if (eVar != null) {
            int i = eVar.m;
            int i2 = eVar.b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i2, eVar.m);
                int i4 = min * i2;
                shortBuffer.put(eVar.l, 0, i4);
                int i5 = eVar.m - min;
                eVar.m = i5;
                short[] sArr = eVar.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = b.a;
        return byteBuffer;
    }

    @Override // com.amazon.aps.iva.r5.b
    @CanIgnoreReturnValue
    public final b.a b(b.a aVar) throws b.C0666b {
        if (aVar.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = aVar.a;
            }
            this.e = aVar;
            b.a aVar2 = new b.a(i, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new b.C0666b(aVar);
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        e eVar = this.j;
        eVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = eVar.b;
        int i2 = remaining2 / i;
        short[] b = eVar.b(eVar.j, eVar.k, i2);
        eVar.j = b;
        asShortBuffer.get(b, eVar.k * i, ((i2 * i) * 2) / 2);
        eVar.k += i2;
        eVar.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.amazon.aps.iva.r5.b
    public final boolean d() {
        e eVar;
        if (this.p && ((eVar = this.j) == null || eVar.m * eVar.b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void e() {
        e eVar = this.j;
        if (eVar != null) {
            int i = eVar.k;
            float f = eVar.c;
            float f2 = eVar.d;
            int i2 = eVar.m + ((int) ((((i / (f / f2)) + eVar.o) / (eVar.e * f2)) + 0.5f));
            short[] sArr = eVar.j;
            int i3 = eVar.h * 2;
            eVar.j = eVar.b(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = eVar.b;
                if (i4 >= i3 * i5) {
                    break;
                }
                eVar.j[(i5 * i) + i4] = 0;
                i4++;
            }
            eVar.k = i3 + eVar.k;
            eVar.e();
            if (eVar.m > i2) {
                eVar.m = i2;
            }
            eVar.k = 0;
            eVar.r = 0;
            eVar.o = 0;
        }
        this.p = true;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void flush() {
        if (isActive()) {
            b.a aVar = this.e;
            this.g = aVar;
            b.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new e(this.c, aVar.a, this.d, aVar.b, aVar2.a);
            } else {
                e eVar = this.j;
                if (eVar != null) {
                    eVar.k = 0;
                    eVar.m = 0;
                    eVar.o = 0;
                    eVar.p = 0;
                    eVar.q = 0;
                    eVar.r = 0;
                    eVar.s = 0;
                    eVar.t = 0;
                    eVar.u = 0;
                    eVar.v = 0;
                }
            }
        }
        this.m = b.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final boolean isActive() {
        if (this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.r5.b
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        b.a aVar = b.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = b.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}

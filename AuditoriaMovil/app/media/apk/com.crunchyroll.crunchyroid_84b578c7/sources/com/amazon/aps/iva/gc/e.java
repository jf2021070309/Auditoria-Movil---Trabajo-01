package com.amazon.aps.iva.gc;

import android.graphics.Bitmap;
import android.util.Log;
import com.amazon.aps.iva.gc.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements a {
    public int[] a;
    public final a.InterfaceC0299a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public int[] j;
    public int k;
    public c l;
    public Bitmap m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(com.amazon.aps.iva.yc.b bVar, c cVar, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.c = bVar;
        this.l = new c();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = cVar;
                this.k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = cVar.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = highestOneBit;
                int i2 = cVar.f;
                this.r = i2 / highestOneBit;
                int i3 = cVar.g;
                this.q = i3 / highestOneBit;
                int i4 = i2 * i3;
                com.amazon.aps.iva.oc.b bVar2 = ((com.amazon.aps.iva.yc.b) this.c).b;
                if (bVar2 == null) {
                    bArr = new byte[i4];
                } else {
                    bArr = (byte[]) bVar2.c(byte[].class, i4);
                }
                this.i = bArr;
                a.InterfaceC0299a interfaceC0299a = this.c;
                int i5 = this.r * this.q;
                com.amazon.aps.iva.oc.b bVar3 = ((com.amazon.aps.iva.yc.b) interfaceC0299a).b;
                if (bVar3 == null) {
                    iArr = new int[i5];
                } else {
                    iArr = (int[]) bVar3.c(int[].class, i5);
                }
                this.j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        }
    }

    @Override // com.amazon.aps.iva.gc.a
    public final synchronized Bitmap a() {
        b bVar;
        byte[] bArr;
        if (this.l.c <= 0 || this.k < 0) {
            if (Log.isLoggable("e", 3)) {
                int i = this.l.c;
            }
            this.o = 1;
        }
        int i2 = this.o;
        if (i2 != 1 && i2 != 2) {
            this.o = 0;
            if (this.e == null) {
                com.amazon.aps.iva.oc.b bVar2 = ((com.amazon.aps.iva.yc.b) this.c).b;
                if (bVar2 == null) {
                    bArr = new byte[255];
                } else {
                    bArr = (byte[]) bVar2.c(byte[].class, 255);
                }
                this.e = bArr;
            }
            b bVar3 = (b) this.l.e.get(this.k);
            int i3 = this.k - 1;
            if (i3 >= 0) {
                bVar = (b) this.l.e.get(i3);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.k;
            if (iArr == null) {
                iArr = this.l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                Log.isLoggable("e", 3);
                this.o = 1;
                return null;
            }
            if (bVar3.f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[bVar3.h] = 0;
                if (bVar3.g == 2 && this.k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return i(bVar3, bVar);
        }
        Log.isLoggable("e", 3);
        return null;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final int c() {
        return this.l.c;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final void clear() {
        com.amazon.aps.iva.oc.b bVar;
        com.amazon.aps.iva.oc.b bVar2;
        com.amazon.aps.iva.oc.b bVar3;
        this.l = null;
        byte[] bArr = this.i;
        a.InterfaceC0299a interfaceC0299a = this.c;
        if (bArr != null && (bVar3 = ((com.amazon.aps.iva.yc.b) interfaceC0299a).b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null && (bVar2 = ((com.amazon.aps.iva.yc.b) interfaceC0299a).b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            ((com.amazon.aps.iva.yc.b) interfaceC0299a).a.d(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null && (bVar = ((com.amazon.aps.iva.yc.b) interfaceC0299a).b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // com.amazon.aps.iva.gc.a
    public final int d() {
        int i;
        c cVar = this.l;
        int i2 = cVar.c;
        if (i2 > 0 && (i = this.k) >= 0) {
            if (i >= 0 && i < i2) {
                return ((b) cVar.e.get(i)).i;
            }
            return -1;
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final int e() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final int f() {
        return (this.j.length * 4) + this.d.limit() + this.i.length;
    }

    public final Bitmap g() {
        Bitmap.Config config;
        Boolean bool = this.s;
        if (bool != null && !bool.booleanValue()) {
            config = this.t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c = ((com.amazon.aps.iva.yc.b) this.c).a.c(this.r, this.q, config);
        c.setHasAlpha(true);
        return c;
    }

    @Override // com.amazon.aps.iva.gc.a
    public final ByteBuffer getData() {
        return this.d;
    }

    public final void h(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3.j == r36.h) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap i(com.amazon.aps.iva.gc.b r36, com.amazon.aps.iva.gc.b r37) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gc.e.i(com.amazon.aps.iva.gc.b, com.amazon.aps.iva.gc.b):android.graphics.Bitmap");
    }
}

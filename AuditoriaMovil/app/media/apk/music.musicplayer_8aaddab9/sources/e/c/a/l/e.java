package e.c.a.l;

import android.graphics.Bitmap;
import android.util.Log;
import e.c.a.l.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e implements a {
    public static final String a = "e";

    /* renamed from: b  reason: collision with root package name */
    public int[] f5540b;

    /* renamed from: d  reason: collision with root package name */
    public final a.InterfaceC0111a f5542d;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f5543e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f5544f;

    /* renamed from: g  reason: collision with root package name */
    public short[] f5545g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5546h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f5547i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f5548j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f5549k;

    /* renamed from: l  reason: collision with root package name */
    public int f5550l;

    /* renamed from: m  reason: collision with root package name */
    public c f5551m;

    /* renamed from: n  reason: collision with root package name */
    public Bitmap f5552n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Boolean t;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f5541c = new int[256];
    public Bitmap.Config u = Bitmap.Config.ARGB_8888;

    public e(a.InterfaceC0111a interfaceC0111a, c cVar, ByteBuffer byteBuffer, int i2) {
        this.f5542d = interfaceC0111a;
        this.f5551m = new c();
        synchronized (this) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
            int highestOneBit = Integer.highestOneBit(i2);
            this.p = 0;
            this.f5551m = cVar;
            this.f5550l = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f5543e = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f5543e.order(ByteOrder.LITTLE_ENDIAN);
            this.o = false;
            Iterator<b> it = cVar.f5530e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f5522g == 3) {
                    this.o = true;
                    break;
                }
            }
            this.q = highestOneBit;
            int i3 = cVar.f5531f;
            this.s = i3 / highestOneBit;
            int i4 = cVar.f5532g;
            this.r = i4 / highestOneBit;
            this.f5548j = ((e.c.a.m.u.g.b) this.f5542d).a(i3 * i4);
            a.InterfaceC0111a interfaceC0111a2 = this.f5542d;
            int i5 = this.s * this.r;
            e.c.a.m.s.c0.b bVar = ((e.c.a.m.u.g.b) interfaceC0111a2).f5912b;
            this.f5549k = bVar == null ? new int[i5] : (int[]) bVar.e(i5, int[].class);
        }
    }

    @Override // e.c.a.l.a
    public synchronized Bitmap a() {
        if (this.f5551m.f5528c <= 0 || this.f5550l < 0) {
            if (Log.isLoggable(a, 3)) {
                int i2 = this.f5551m.f5528c;
            }
            this.p = 1;
        }
        int i3 = this.p;
        if (i3 != 1 && i3 != 2) {
            this.p = 0;
            if (this.f5544f == null) {
                this.f5544f = ((e.c.a.m.u.g.b) this.f5542d).a(255);
            }
            b bVar = this.f5551m.f5530e.get(this.f5550l);
            int i4 = this.f5550l - 1;
            b bVar2 = i4 >= 0 ? this.f5551m.f5530e.get(i4) : null;
            int[] iArr = bVar.f5526k;
            if (iArr == null) {
                iArr = this.f5551m.a;
            }
            this.f5540b = iArr;
            if (iArr == null) {
                Log.isLoggable(a, 3);
                this.p = 1;
                return null;
            }
            if (bVar.f5521f) {
                System.arraycopy(iArr, 0, this.f5541c, 0, iArr.length);
                int[] iArr2 = this.f5541c;
                this.f5540b = iArr2;
                iArr2[bVar.f5523h] = 0;
                if (bVar.f5522g == 2 && this.f5550l == 0) {
                    this.t = Boolean.TRUE;
                }
            }
            return j(bVar, bVar2);
        }
        Log.isLoggable(a, 3);
        return null;
    }

    @Override // e.c.a.l.a
    public void b() {
        this.f5550l = (this.f5550l + 1) % this.f5551m.f5528c;
    }

    @Override // e.c.a.l.a
    public int c() {
        return this.f5551m.f5528c;
    }

    @Override // e.c.a.l.a
    public void clear() {
        e.c.a.m.s.c0.b bVar;
        e.c.a.m.s.c0.b bVar2;
        e.c.a.m.s.c0.b bVar3;
        this.f5551m = null;
        byte[] bArr = this.f5548j;
        if (bArr != null && (bVar3 = ((e.c.a.m.u.g.b) this.f5542d).f5912b) != null) {
            bVar3.d(bArr);
        }
        int[] iArr = this.f5549k;
        if (iArr != null && (bVar2 = ((e.c.a.m.u.g.b) this.f5542d).f5912b) != null) {
            bVar2.d(iArr);
        }
        Bitmap bitmap = this.f5552n;
        if (bitmap != null) {
            ((e.c.a.m.u.g.b) this.f5542d).a.d(bitmap);
        }
        this.f5552n = null;
        this.f5543e = null;
        this.t = null;
        byte[] bArr2 = this.f5544f;
        if (bArr2 == null || (bVar = ((e.c.a.m.u.g.b) this.f5542d).f5912b) == null) {
            return;
        }
        bVar.d(bArr2);
    }

    @Override // e.c.a.l.a
    public int d() {
        int i2;
        c cVar = this.f5551m;
        int i3 = cVar.f5528c;
        if (i3 <= 0 || (i2 = this.f5550l) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.f5530e.get(i2).f5524i;
    }

    @Override // e.c.a.l.a
    public ByteBuffer e() {
        return this.f5543e;
    }

    @Override // e.c.a.l.a
    public int f() {
        return this.f5550l;
    }

    @Override // e.c.a.l.a
    public int g() {
        return (this.f5549k.length * 4) + this.f5543e.limit() + this.f5548j.length;
    }

    public final Bitmap h() {
        Boolean bool = this.t;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u;
        Bitmap c2 = ((e.c.a.m.u.g.b) this.f5542d).a.c(this.s, this.r, config);
        c2.setHasAlpha(true);
        return c2;
    }

    public void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r3.f5535j == r36.f5523h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap j(e.c.a.l.b r36, e.c.a.l.b r37) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.l.e.j(e.c.a.l.b, e.c.a.l.b):android.graphics.Bitmap");
    }
}

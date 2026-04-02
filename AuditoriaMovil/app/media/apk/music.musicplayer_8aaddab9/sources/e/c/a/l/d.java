package e.c.a.l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f5537b;

    /* renamed from: c  reason: collision with root package name */
    public c f5538c;
    public final byte[] a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f5539d = 0;

    public final boolean a() {
        return this.f5538c.f5527b != 0;
    }

    public c b() {
        if (this.f5537b != null) {
            if (a()) {
                return this.f5538c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (sb.toString().startsWith("GIF")) {
                this.f5538c.f5531f = f();
                this.f5538c.f5532g = f();
                int c2 = c();
                c cVar = this.f5538c;
                cVar.f5533h = (c2 & 128) != 0;
                cVar.f5534i = (int) Math.pow(2.0d, (c2 & 7) + 1);
                this.f5538c.f5535j = c();
                c cVar2 = this.f5538c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.f5538c.f5533h && !a()) {
                    c cVar3 = this.f5538c;
                    cVar3.a = e(cVar3.f5534i);
                    c cVar4 = this.f5538c;
                    cVar4.f5536k = cVar4.a[cVar4.f5535j];
                }
            } else {
                this.f5538c.f5527b = 1;
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.f5538c.f5528c <= Integer.MAX_VALUE) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 == 1) {
                            g();
                        } else if (c4 == 249) {
                            this.f5538c.f5529d = new b();
                            c();
                            int c5 = c();
                            b bVar = this.f5538c.f5529d;
                            int i3 = (c5 & 28) >> 2;
                            bVar.f5522g = i3;
                            if (i3 == 0) {
                                bVar.f5522g = 1;
                            }
                            bVar.f5521f = (c5 & 1) != 0;
                            int f2 = f();
                            if (f2 < 2) {
                                f2 = 10;
                            }
                            b bVar2 = this.f5538c.f5529d;
                            bVar2.f5524i = f2 * 10;
                            bVar2.f5523h = c();
                            c();
                        } else if (c4 == 254) {
                            g();
                        } else if (c4 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i4 = 0; i4 < 11; i4++) {
                                sb2.append((char) this.a[i4]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.a;
                                    if (bArr[0] == 1) {
                                        byte b2 = bArr[1];
                                        byte b3 = bArr[2];
                                        Objects.requireNonNull(this.f5538c);
                                    }
                                    if (this.f5539d > 0) {
                                    }
                                } while (!a());
                            } else {
                                g();
                            }
                        }
                    } else if (c3 == 44) {
                        c cVar5 = this.f5538c;
                        if (cVar5.f5529d == null) {
                            cVar5.f5529d = new b();
                        }
                        cVar5.f5529d.a = f();
                        this.f5538c.f5529d.f5517b = f();
                        this.f5538c.f5529d.f5518c = f();
                        this.f5538c.f5529d.f5519d = f();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (c6 & 7) + 1);
                        b bVar3 = this.f5538c.f5529d;
                        bVar3.f5520e = (c6 & 64) != 0;
                        if (z2) {
                            bVar3.f5526k = e(pow);
                        } else {
                            bVar3.f5526k = null;
                        }
                        this.f5538c.f5529d.f5525j = this.f5537b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f5538c;
                            cVar6.f5528c++;
                            cVar6.f5530e.add(cVar6.f5529d);
                        }
                    } else if (c3 != 59) {
                        this.f5538c.f5527b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.f5538c;
                if (cVar7.f5528c < 0) {
                    cVar7.f5527b = 1;
                }
            }
            return this.f5538c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f5537b.get() & 255;
        } catch (Exception unused) {
            this.f5538c.f5527b = 1;
            return 0;
        }
    }

    public final void d() {
        int c2 = c();
        this.f5539d = c2;
        if (c2 <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.f5539d;
                if (i2 >= i3) {
                    return;
                }
                int i4 = i3 - i2;
                this.f5537b.get(this.a, i2, i4);
                i2 += i4;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f5538c.f5527b = 1;
                return;
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[i2 * 3];
        int[] iArr = null;
        try {
            this.f5537b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f5538c.f5527b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f5537b.getShort();
    }

    public final void g() {
        int c2;
        do {
            c2 = c();
            this.f5537b.position(Math.min(this.f5537b.position() + c2, this.f5537b.limit()));
        } while (c2 > 0);
    }
}

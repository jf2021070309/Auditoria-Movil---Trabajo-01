package com.amazon.aps.iva.gc;

import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public final class d {
    public ByteBuffer b;
    public c c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        if (this.c.b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        boolean z4;
        if (this.b != null) {
            if (a()) {
                return this.c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.c.b = 1;
            } else {
                this.c.f = f();
                this.c.g = f();
                int c = c();
                c cVar = this.c;
                if ((c & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                cVar.h = z;
                cVar.i = (int) Math.pow(2.0d, (c & 7) + 1);
                this.c.j = c();
                c cVar2 = this.c;
                c();
                cVar2.getClass();
                if (this.c.h && !a()) {
                    c cVar3 = this.c;
                    cVar3.a = e(cVar3.i);
                    c cVar4 = this.c;
                    cVar4.k = cVar4.a[cVar4.j];
                }
            }
            if (!a()) {
                boolean z5 = false;
                while (!z5 && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c2 = c();
                    if (c2 != 33) {
                        if (c2 != 44) {
                            if (c2 != 59) {
                                this.c.b = 1;
                            } else {
                                z5 = true;
                            }
                        } else {
                            c cVar5 = this.c;
                            if (cVar5.d == null) {
                                cVar5.d = new b();
                            }
                            this.c.d.a = f();
                            this.c.d.b = f();
                            this.c.d.c = f();
                            this.c.d.d = f();
                            int c3 = c();
                            if ((c3 & 128) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c3 & 7) + 1);
                            b bVar = this.c.d;
                            if ((c3 & 64) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bVar.e = z3;
                            if (z2) {
                                bVar.k = e(pow);
                            } else {
                                bVar.k = null;
                            }
                            this.c.d.j = this.b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.c;
                                cVar6.c++;
                                cVar6.e.add(cVar6.d);
                            }
                        }
                    } else {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 != 249) {
                                if (c4 != 254) {
                                    if (c4 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb2 = new StringBuilder();
                                        int i2 = 0;
                                        while (true) {
                                            bArr = this.a;
                                            if (i2 >= 11) {
                                                break;
                                            }
                                            sb2.append((char) bArr[i2]);
                                            i2++;
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b = bArr[1];
                                                    byte b2 = bArr[2];
                                                    this.c.getClass();
                                                }
                                                if (this.d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.c.d = new b();
                                c();
                                int c5 = c();
                                b bVar2 = this.c.d;
                                int i3 = (c5 & 28) >> 2;
                                bVar2.g = i3;
                                if (i3 == 0) {
                                    bVar2.g = 1;
                                }
                                if ((c5 & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                bVar2.f = z4;
                                int f = f();
                                if (f < 2) {
                                    f = 10;
                                }
                                b bVar3 = this.c.d;
                                bVar3.i = f * 10;
                                bVar3.h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.c;
                if (cVar7.c < 0) {
                    cVar7.b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.b.get() & UnsignedBytes.MAX_VALUE;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.b.get(this.a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 16) | (-16777216) | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i5] & UnsignedBytes.MAX_VALUE);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.b.getShort();
    }

    public final void g() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}

package com.fyber.inneractive.sdk.player.c.d.b;

import com.fyber.inneractive.sdk.player.c.d.g;
import com.fyber.inneractive.sdk.player.c.l;
import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;
/* loaded from: classes.dex */
final class a implements b {
    private final byte[] a = new byte[8];
    private final Stack<C0054a> b = new Stack<>();
    private final f c = new f();
    private c d;
    private int e;
    private int f;
    private long g;

    @Override // com.fyber.inneractive.sdk.player.c.d.b.b
    public final void a(c cVar) {
        this.d = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.b.b
    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.b.b
    public final boolean a(g gVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int a;
        int a2;
        com.fyber.inneractive.sdk.player.c.k.a.b(this.d != null);
        while (true) {
            if (!this.b.isEmpty() && gVar.c() >= this.b.peek().b) {
                this.d.c(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                long a3 = this.c.a(gVar, true, false, 4);
                if (a3 == -2) {
                    gVar.a();
                    while (true) {
                        gVar.c(this.a, 0, 4);
                        a = f.a(this.a[0]);
                        if (a != -1 && a <= 4) {
                            a2 = (int) f.a(this.a, a, false);
                            if (this.d.b(a2)) {
                                break;
                            }
                        }
                        gVar.b(1);
                    }
                    gVar.b(a);
                    a3 = a2;
                }
                if (a3 == -1) {
                    return false;
                }
                this.f = (int) a3;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.a(gVar, false, true, 8);
                this.e = 2;
            }
            int a4 = this.d.a(this.f);
            if (a4 != 0) {
                if (a4 == 1) {
                    long c = gVar.c();
                    this.b.add(new C0054a(this.f, this.g + c, (byte) 0));
                    this.d.a(this.f, c, this.g);
                    this.e = 0;
                    return true;
                } else if (a4 == 2) {
                    long j = this.g;
                    if (j > 8) {
                        throw new l("Invalid integer size: " + this.g);
                    }
                    this.d.a(this.f, a(gVar, (int) j));
                    this.e = 0;
                    return true;
                } else if (a4 == 3) {
                    long j2 = this.g;
                    if (j2 > 2147483647L) {
                        throw new l("String element size: " + this.g);
                    }
                    c cVar = this.d;
                    int i = this.f;
                    int i2 = (int) j2;
                    if (i2 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i2];
                        gVar.b(bArr, 0, i2);
                        str = new String(bArr);
                    }
                    cVar.a(i, str);
                    this.e = 0;
                    return true;
                } else if (a4 == 4) {
                    this.d.a(this.f, (int) this.g, gVar);
                    this.e = 0;
                    return true;
                } else if (a4 == 5) {
                    long j3 = this.g;
                    if (j3 != 4 && j3 != 8) {
                        throw new l("Invalid float size: " + this.g);
                    }
                    c cVar2 = this.d;
                    int i3 = this.f;
                    int i4 = (int) this.g;
                    long a5 = a(gVar, i4);
                    if (i4 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) a5);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(a5);
                    }
                    cVar2.a(i3, longBitsToDouble);
                    this.e = 0;
                    return true;
                } else {
                    throw new l("Invalid element type " + a4);
                }
            }
            gVar.b((int) this.g);
            this.e = 0;
        }
    }

    private long a(g gVar, int i) throws IOException, InterruptedException {
        gVar.b(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0054a {
        final int a;
        final long b;

        /* synthetic */ C0054a(int i, long j, byte b) {
            this(i, j);
        }

        private C0054a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }
}

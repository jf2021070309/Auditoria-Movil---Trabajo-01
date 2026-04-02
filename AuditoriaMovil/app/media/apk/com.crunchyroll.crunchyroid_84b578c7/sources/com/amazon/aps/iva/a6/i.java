package com.amazon.aps.iva.a6;
/* compiled from: DefaultLoadControl.java */
/* loaded from: classes.dex */
public final class i implements t0 {
    public final com.amazon.aps.iva.t6.f b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public int k;
    public boolean l;

    public i(com.amazon.aps.iva.t6.f fVar, int i, int i2, int i3, int i4) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.b = fVar;
        this.c = com.amazon.aps.iva.t5.g0.Q(i);
        this.d = com.amazon.aps.iva.t5.g0.Q(i2);
        this.e = com.amazon.aps.iva.t5.g0.Q(i3);
        this.f = com.amazon.aps.iva.t5.g0.Q(i4);
        this.g = -1;
        this.k = 13107200;
        this.h = false;
        this.i = com.amazon.aps.iva.t5.g0.Q(0);
        this.j = false;
    }

    public static void a(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.v(z, str + " cannot be less than " + str2);
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void b() {
        g(true);
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean c() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void d(com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.e0 e0Var, o1[] o1VarArr, com.amazon.aps.iva.o6.o0 o0Var, com.amazon.aps.iva.s6.r[] rVarArr) {
        int i = this.g;
        boolean z = false;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < o1VarArr.length) {
                    if (rVarArr[i2] != null) {
                        switch (o1VarArr[i2].p()) {
                            case -2:
                                i4 = 0;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = 144310272;
                                break;
                            case 1:
                                break;
                            case 2:
                                i4 = 131072000;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                break;
                        }
                        i3 += i4;
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        this.k = i;
        com.amazon.aps.iva.t6.f fVar = this.b;
        synchronized (fVar) {
            if (i < fVar.c) {
                z = true;
            }
            fVar.c = i;
            if (z) {
                fVar.a();
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final long e() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        boolean z2;
        int i = this.g;
        if (i == -1) {
            i = 13107200;
        }
        this.k = i;
        this.l = false;
        if (z) {
            com.amazon.aps.iva.t6.f fVar = this.b;
            synchronized (fVar) {
                if (fVar.a) {
                    synchronized (fVar) {
                        if (fVar.c > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fVar.c = 0;
                        if (z2) {
                            fVar.a();
                        }
                    }
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final com.amazon.aps.iva.t6.b i() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final void k() {
        g(true);
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean l(long j, long j2, float f) {
        int i;
        boolean z;
        com.amazon.aps.iva.t6.f fVar = this.b;
        synchronized (fVar) {
            i = fVar.d * fVar.b;
        }
        boolean z2 = true;
        if (i >= this.k) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j3 = this.d;
        long j4 = this.c;
        if (i2 > 0) {
            j4 = Math.min(com.amazon.aps.iva.t5.g0.x(j4, f), j3);
        }
        if (j2 < Math.max(j4, 500000L)) {
            if (!this.h && z) {
                z2 = false;
            }
            this.l = z2;
            if (!z2 && j2 < 500000) {
                com.amazon.aps.iva.t5.p.g();
            }
        } else if (j2 >= j3 || z) {
            this.l = false;
        }
        return this.l;
    }

    @Override // com.amazon.aps.iva.a6.t0
    public final boolean m(com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.e0 e0Var, long j, float f, boolean z, long j2) {
        long j3;
        int i;
        long B = com.amazon.aps.iva.t5.g0.B(j, f);
        if (z) {
            j3 = this.f;
        } else {
            j3 = this.e;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 > 0 && B < j3) {
            if (!this.h) {
                com.amazon.aps.iva.t6.f fVar = this.b;
                synchronized (fVar) {
                    i = fVar.d * fVar.b;
                }
                if (i >= this.k) {
                }
            }
            return false;
        }
        return true;
    }
}

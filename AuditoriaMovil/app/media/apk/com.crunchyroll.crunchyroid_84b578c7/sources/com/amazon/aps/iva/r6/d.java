package com.amazon.aps.iva.r6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.a6.e;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q7.f;
import com.amazon.aps.iva.q7.g;
import com.amazon.aps.iva.q7.h;
import com.amazon.aps.iva.r6.b;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.u1.g0;
import com.google.common.collect.ImmutableList;
/* compiled from: TextRenderer.java */
/* loaded from: classes.dex */
public final class d extends e implements Handler.Callback {
    public h A;
    public h B;
    public int C;
    public long D;
    public long E;
    public long F;
    public final Handler p;
    public final c q;
    public final b r;
    public final g0 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public v x;
    public com.amazon.aps.iva.q7.e y;
    public g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Looper looper) {
        super(3);
        Handler handler;
        b.a aVar = b.a;
        this.q = cVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = com.amazon.aps.iva.t5.g0.a;
            handler = new Handler(looper, this);
        }
        this.p = handler;
        this.r = aVar;
        this.s = new g0();
        this.D = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void C() {
        this.x = null;
        this.D = -9223372036854775807L;
        L();
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        O();
        com.amazon.aps.iva.q7.e eVar = this.y;
        eVar.getClass();
        eVar.release();
        this.y = null;
        this.w = 0;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void E(long j, boolean z) {
        this.F = j;
        L();
        this.t = false;
        this.u = false;
        this.D = -9223372036854775807L;
        if (this.w != 0) {
            O();
            com.amazon.aps.iva.q7.e eVar = this.y;
            eVar.getClass();
            eVar.release();
            this.y = null;
            this.w = 0;
            this.v = true;
            v vVar = this.x;
            vVar.getClass();
            this.y = ((b.a) this.r).a(vVar);
            return;
        }
        O();
        com.amazon.aps.iva.q7.e eVar2 = this.y;
        eVar2.getClass();
        eVar2.flush();
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void J(v[] vVarArr, long j, long j2) {
        this.E = j2;
        v vVar = vVarArr[0];
        this.x = vVar;
        if (this.y != null) {
            this.w = 1;
            return;
        }
        this.v = true;
        vVar.getClass();
        this.y = ((b.a) this.r).a(vVar);
    }

    public final void L() {
        com.amazon.aps.iva.s5.b bVar = new com.amazon.aps.iva.s5.b(ImmutableList.of(), N(this.F));
        Handler handler = this.p;
        if (handler != null) {
            handler.obtainMessage(0, bVar).sendToTarget();
            return;
        }
        ImmutableList<com.amazon.aps.iva.s5.a> immutableList = bVar.b;
        c cVar = this.q;
        cVar.e(immutableList);
        cVar.g(bVar);
    }

    public final long M() {
        if (this.C == -1) {
            return Long.MAX_VALUE;
        }
        this.A.getClass();
        if (this.C >= this.A.f()) {
            return Long.MAX_VALUE;
        }
        return this.A.c(this.C);
    }

    public final long N(long j) {
        boolean z;
        boolean z2 = true;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (this.E == -9223372036854775807L) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        return j - this.E;
    }

    public final void O() {
        this.z = null;
        this.C = -1;
        h hVar = this.A;
        if (hVar != null) {
            hVar.k();
            this.A = null;
        }
        h hVar2 = this.B;
        if (hVar2 != null) {
            hVar2.k();
            this.B = null;
        }
    }

    @Override // com.amazon.aps.iva.a6.p1
    public final int c(v vVar) {
        int i;
        if (((b.a) this.r).b(vVar)) {
            if (vVar.H == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return p1.s(i, 0, 0);
        } else if (com.amazon.aps.iva.q5.g0.l(vVar.m)) {
            return p1.s(1, 0, 0);
        } else {
            return p1.s(0, 0, 0);
        }
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.o1
    public final boolean d() {
        return this.u;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final boolean g() {
        return true;
    }

    @Override // com.amazon.aps.iva.a6.o1, com.amazon.aps.iva.a6.p1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            com.amazon.aps.iva.s5.b bVar = (com.amazon.aps.iva.s5.b) message.obj;
            ImmutableList<com.amazon.aps.iva.s5.a> immutableList = bVar.b;
            c cVar = this.q;
            cVar.e(immutableList);
            cVar.g(bVar);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void w(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        h hVar;
        g0 g0Var = this.s;
        this.F = j;
        if (this.m) {
            long j4 = this.D;
            if (j4 != -9223372036854775807L && j >= j4) {
                O();
                this.u = true;
            }
        }
        if (this.u) {
            return;
        }
        h hVar2 = this.B;
        b bVar = this.r;
        if (hVar2 == null) {
            com.amazon.aps.iva.q7.e eVar = this.y;
            eVar.getClass();
            eVar.b(j);
            try {
                com.amazon.aps.iva.q7.e eVar2 = this.y;
                eVar2.getClass();
                this.B = eVar2.c();
            } catch (f e) {
                p.d("Subtitle decoding failed. streamFormat=" + this.x, e);
                L();
                O();
                com.amazon.aps.iva.q7.e eVar3 = this.y;
                eVar3.getClass();
                eVar3.release();
                this.y = null;
                this.w = 0;
                this.v = true;
                v vVar = this.x;
                vVar.getClass();
                this.y = ((b.a) bVar).a(vVar);
                return;
            }
        }
        if (this.h != 2) {
            return;
        }
        if (this.A != null) {
            long M = M();
            z = false;
            while (M <= j) {
                this.C++;
                M = M();
                z = true;
            }
        } else {
            z = false;
        }
        h hVar3 = this.B;
        if (hVar3 != null) {
            if (hVar3.i(4)) {
                if (!z && M() == Long.MAX_VALUE) {
                    if (this.w == 2) {
                        O();
                        com.amazon.aps.iva.q7.e eVar4 = this.y;
                        eVar4.getClass();
                        eVar4.release();
                        this.y = null;
                        this.w = 0;
                        this.v = true;
                        v vVar2 = this.x;
                        vVar2.getClass();
                        this.y = ((b.a) bVar).a(vVar2);
                    } else {
                        O();
                        this.u = true;
                    }
                }
            } else if (hVar3.c <= j) {
                h hVar4 = this.A;
                if (hVar4 != null) {
                    hVar4.k();
                }
                this.C = hVar3.a(j);
                this.A = hVar3;
                this.B = null;
                z = true;
            }
        }
        if (z) {
            this.A.getClass();
            int a = this.A.a(j);
            if (a != 0 && this.A.f() != 0) {
                if (a == -1) {
                    j3 = this.A.c(hVar.f() - 1);
                } else {
                    j3 = this.A.c(a - 1);
                }
            } else {
                j3 = this.A.c;
            }
            com.amazon.aps.iva.s5.b bVar2 = new com.amazon.aps.iva.s5.b(this.A.b(j), N(j3));
            Handler handler = this.p;
            if (handler != null) {
                handler.obtainMessage(0, bVar2).sendToTarget();
            } else {
                ImmutableList<com.amazon.aps.iva.s5.a> immutableList = bVar2.b;
                c cVar = this.q;
                cVar.e(immutableList);
                cVar.g(bVar2);
            }
        }
        if (this.w == 2) {
            return;
        }
        while (!this.t) {
            try {
                g gVar = this.z;
                if (gVar == null) {
                    com.amazon.aps.iva.q7.e eVar5 = this.y;
                    eVar5.getClass();
                    gVar = eVar5.d();
                    if (gVar == null) {
                        return;
                    }
                    this.z = gVar;
                }
                if (this.w == 1) {
                    gVar.b = 4;
                    com.amazon.aps.iva.q7.e eVar6 = this.y;
                    eVar6.getClass();
                    eVar6.a(gVar);
                    this.z = null;
                    this.w = 2;
                    return;
                }
                int K = K(g0Var, gVar, 0);
                if (K == -4) {
                    if (gVar.i(4)) {
                        this.t = true;
                        this.v = false;
                    } else {
                        v vVar3 = (v) g0Var.c;
                        if (vVar3 == null) {
                            return;
                        }
                        gVar.j = vVar3.q;
                        gVar.n();
                        boolean z3 = this.v;
                        if (!gVar.i(1)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.v = z3 & z2;
                    }
                    if (!this.v) {
                        com.amazon.aps.iva.q7.e eVar7 = this.y;
                        eVar7.getClass();
                        eVar7.a(gVar);
                        this.z = null;
                    }
                } else if (K == -3) {
                    return;
                }
            } catch (f e2) {
                p.d("Subtitle decoding failed. streamFormat=" + this.x, e2);
                L();
                O();
                com.amazon.aps.iva.q7.e eVar8 = this.y;
                eVar8.getClass();
                eVar8.release();
                this.y = null;
                this.w = 0;
                this.v = true;
                v vVar4 = this.x;
                vVar4.getClass();
                this.y = ((b.a) bVar).a(vVar4);
                return;
            }
        }
    }
}

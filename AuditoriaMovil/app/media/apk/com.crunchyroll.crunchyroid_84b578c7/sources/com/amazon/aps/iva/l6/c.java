package com.amazon.aps.iva.l6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.a6.e;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.l6.a;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: MetadataRenderer.java */
/* loaded from: classes.dex */
public final class c extends e implements Handler.Callback {
    public final a p;
    public final b q;
    public final Handler r;
    public final com.amazon.aps.iva.d7.b s;
    public com.amazon.aps.iva.d7.a t;
    public boolean u;
    public boolean v;
    public long w;
    public f0 x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Looper looper) {
        super(5);
        Handler handler;
        a.C0470a c0470a = a.a;
        this.q = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = g0.a;
            handler = new Handler(looper, this);
        }
        this.r = handler;
        this.p = c0470a;
        this.s = new com.amazon.aps.iva.d7.b();
        this.y = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void C() {
        this.x = null;
        this.t = null;
        this.y = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void E(long j, boolean z) {
        this.x = null;
        this.u = false;
        this.v = false;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void J(v[] vVarArr, long j, long j2) {
        this.t = this.p.a(vVarArr[0]);
        f0 f0Var = this.x;
        if (f0Var != null) {
            long j3 = this.y;
            long j4 = f0Var.c;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                f0Var = new f0(j5, f0Var.b);
            }
            this.x = f0Var;
        }
        this.y = j2;
    }

    public final void L(f0 f0Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            f0.b[] bVarArr = f0Var.b;
            if (i < bVarArr.length) {
                v k = bVarArr[i].k();
                if (k != null) {
                    a aVar = this.p;
                    if (aVar.c(k)) {
                        com.amazon.aps.iva.ab.a a = aVar.a(k);
                        byte[] B = bVarArr[i].B();
                        B.getClass();
                        com.amazon.aps.iva.d7.b bVar = this.s;
                        bVar.k();
                        bVar.m(B.length);
                        ByteBuffer byteBuffer = bVar.d;
                        int i2 = g0.a;
                        byteBuffer.put(B);
                        bVar.n();
                        f0 a2 = a.a(bVar);
                        if (a2 != null) {
                            L(a2, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(bVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long M(long j) {
        boolean z;
        boolean z2 = true;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (this.y == -9223372036854775807L) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        return j - this.y;
    }

    @Override // com.amazon.aps.iva.a6.p1
    public final int c(v vVar) {
        int i;
        if (this.p.c(vVar)) {
            if (vVar.H == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return p1.s(i, 0, 0);
        }
        return p1.s(0, 0, 0);
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.o1
    public final boolean d() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final boolean g() {
        return true;
    }

    @Override // com.amazon.aps.iva.a6.o1, com.amazon.aps.iva.a6.p1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.q.t((f0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.a6.o1
    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.u && this.x == null) {
                com.amazon.aps.iva.d7.b bVar = this.s;
                bVar.k();
                com.amazon.aps.iva.u1.g0 g0Var = this.d;
                g0Var.a();
                int K = K(g0Var, bVar, 0);
                if (K == -4) {
                    if (bVar.i(4)) {
                        this.u = true;
                    } else {
                        bVar.j = this.w;
                        bVar.n();
                        com.amazon.aps.iva.d7.a aVar = this.t;
                        int i = g0.a;
                        f0 a = aVar.a(bVar);
                        if (a != null) {
                            ArrayList arrayList = new ArrayList(a.b.length);
                            L(a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.x = new f0(M(bVar.f), (f0.b[]) arrayList.toArray(new f0.b[0]));
                            }
                        }
                    }
                } else if (K == -5) {
                    v vVar = (v) g0Var.c;
                    vVar.getClass();
                    this.w = vVar.q;
                }
            }
            f0 f0Var = this.x;
            if (f0Var != null && f0Var.c <= M(j)) {
                f0 f0Var2 = this.x;
                Handler handler = this.r;
                if (handler != null) {
                    handler.obtainMessage(0, f0Var2).sendToTarget();
                } else {
                    this.q.t(f0Var2);
                }
                this.x = null;
                z = true;
            } else {
                z = false;
            }
            if (this.u && this.x == null) {
                this.v = true;
            }
        }
    }
}

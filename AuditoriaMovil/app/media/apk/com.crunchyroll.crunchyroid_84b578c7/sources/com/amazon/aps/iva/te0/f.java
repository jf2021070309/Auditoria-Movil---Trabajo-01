package com.amazon.aps.iva.te0;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.se0.w1;
import com.amazon.aps.iva.xe0.k;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.CancellationException;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class f extends g {
    private volatile f _immediate;
    public final Handler c;
    public final String d;
    public final boolean e;
    public final f f;

    public f() {
        throw null;
    }

    public f(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this._immediate = z ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.f = fVar;
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final boolean B() {
        if (this.e && j.a(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.se0.t1
    public final t1 C() {
        return this.f;
    }

    public final void L(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        com.amazon.aps.iva.a60.b.j(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        r0.b.x(gVar, runnable);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f) && ((f) obj).c == this.c) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.te0.g, com.amazon.aps.iva.se0.o0
    public final t0 h(long j, final Runnable runnable, com.amazon.aps.iva.ob0.g gVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new t0() { // from class: com.amazon.aps.iva.te0.c
                @Override // com.amazon.aps.iva.se0.t0
                public final void dispose() {
                    f.this.c.removeCallbacks(runnable);
                }
            };
        }
        L(gVar, runnable);
        return w1.b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // com.amazon.aps.iva.se0.t1, com.amazon.aps.iva.se0.d0
    public final String toString() {
        t1 t1Var;
        String str;
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        t1 t1Var2 = k.a;
        if (this == t1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                t1Var = t1Var2.C();
            } catch (UnsupportedOperationException unused) {
                t1Var = null;
            }
            if (this == t1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.d;
            if (str2 == null) {
                str2 = this.c.toString();
            }
            if (this.e) {
                return com.amazon.aps.iva.c80.a.f(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // com.amazon.aps.iva.se0.o0
    public final void v(long j, n nVar) {
        d dVar = new d(nVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(dVar, j)) {
            nVar.w(new e(this, dVar));
        } else {
            L(nVar.f, dVar);
        }
    }

    @Override // com.amazon.aps.iva.se0.d0
    public final void x(com.amazon.aps.iva.ob0.g gVar, Runnable runnable) {
        if (!this.c.post(runnable)) {
            L(gVar, runnable);
        }
    }

    public f(Handler handler) {
        this(handler, null, false);
    }
}

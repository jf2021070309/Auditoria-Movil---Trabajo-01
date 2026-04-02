package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.we0.c;
import java.util.Arrays;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes4.dex */
public abstract class b<S extends c<?>> {
    public S[] b;
    public int c;
    public int d;
    public t e;

    public final S d() {
        S s;
        t tVar;
        synchronized (this) {
            S[] sArr = this.b;
            if (sArr == null) {
                sArr = (S[]) h();
                this.b = sArr;
            } else if (this.c >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, newSize)");
                this.b = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i = this.d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = e();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.a(this));
            this.d = i;
            this.c++;
            tVar = this.e;
        }
        if (tVar != null) {
            synchronized (tVar) {
                Object[] objArr = tVar.i;
                com.amazon.aps.iva.yb0.j.c(objArr);
                tVar.b(Integer.valueOf(((Number) objArr[((int) ((tVar.j + ((int) ((tVar.p() + tVar.l) - tVar.j))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return s;
    }

    public abstract S e();

    public final u0<Integer> f() {
        t tVar;
        synchronized (this) {
            tVar = this.e;
            if (tVar == null) {
                tVar = new t(this.c);
                this.e = tVar;
            }
        }
        return tVar;
    }

    public abstract c[] h();

    public final void i(S s) {
        t tVar;
        int i;
        com.amazon.aps.iva.ob0.d[] b;
        Object[] objArr;
        synchronized (this) {
            int i2 = this.c - 1;
            this.c = i2;
            tVar = this.e;
            if (i2 == 0) {
                this.d = 0;
            }
            b = s.b(this);
        }
        for (com.amazon.aps.iva.ob0.d dVar : b) {
            if (dVar != null) {
                dVar.resumeWith(com.amazon.aps.iva.kb0.q.a);
            }
        }
        if (tVar != null) {
            synchronized (tVar) {
                com.amazon.aps.iva.yb0.j.c(tVar.i);
                tVar.b(Integer.valueOf(((Number) objArr[((int) ((tVar.j + ((int) ((tVar.p() + tVar.l) - tVar.j))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }
}

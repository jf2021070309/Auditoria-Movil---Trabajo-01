package com.amazon.aps.iva.se0;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public abstract class x0 extends d0 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public com.amazon.aps.iva.x6.k e;

    public final void C(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j3 = j2 - j;
        this.c = j3;
        if (j3 <= 0 && this.d) {
            shutdown();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[], java.io.Serializable] */
    public final void L(q0<?> q0Var) {
        com.amazon.aps.iva.x6.k kVar = this.e;
        if (kVar == null) {
            kVar = new com.amazon.aps.iva.x6.k();
            this.e = kVar;
        }
        Object[] objArr = (Object[]) kVar.c;
        int i = kVar.b;
        objArr[i] = q0Var;
        int length = (objArr.length - 1) & (i + 1);
        kVar.b = length;
        int i2 = kVar.a;
        if (length == i2) {
            int length2 = objArr.length;
            ?? r1 = new Object[length2 << 1];
            com.amazon.aps.iva.lb0.m.H(objArr, r1, 0, i2, 0, 10);
            Object[] objArr2 = (Object[]) kVar.c;
            int length3 = objArr2.length;
            int i3 = kVar.a;
            com.amazon.aps.iva.lb0.m.H(objArr2, r1, length3 - i3, 0, i3, 4);
            kVar.c = r1;
            kVar.a = 0;
            kVar.b = length2;
        }
    }

    public final void M(boolean z) {
        long j;
        long j2 = this.c;
        if (z) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.c = j + j2;
        if (!z) {
            this.d = true;
        }
    }

    public final boolean V() {
        if (this.c >= 4294967296L) {
            return true;
        }
        return false;
    }

    public long Z() {
        if (!a0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean a0() {
        com.amazon.aps.iva.x6.k kVar = this.e;
        if (kVar == null) {
            return false;
        }
        int i = kVar.a;
        q0 q0Var = null;
        if (i != kVar.b) {
            ?? r3 = (Object[]) kVar.c;
            ?? r6 = r3[i];
            r3[i] = 0;
            kVar.a = (i + 1) & (r3.length - 1);
            if (r6 != 0) {
                q0Var = r6;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        q0 q0Var2 = q0Var;
        if (q0Var2 == null) {
            return false;
        }
        q0Var2.run();
        return true;
    }

    public void shutdown() {
    }
}

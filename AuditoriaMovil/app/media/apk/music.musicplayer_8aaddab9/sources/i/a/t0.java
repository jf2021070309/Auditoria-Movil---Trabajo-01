package i.a;

import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class t0 extends c0 {

    /* renamed from: b  reason: collision with root package name */
    public long f9161b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9162c;

    /* renamed from: d  reason: collision with root package name */
    public i.a.i2.a<n0<?>> f9163d;

    public final void h0(boolean z) {
        long i0 = this.f9161b - i0(z);
        this.f9161b = i0;
        if (i0 <= 0 && this.f9162c) {
            shutdown();
        }
    }

    public final long i0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void j0(n0<?> n0Var) {
        i.a.i2.a<n0<?>> aVar = this.f9163d;
        if (aVar == null) {
            aVar = new i.a.i2.a<>();
            this.f9163d = aVar;
        }
        Object[] objArr = aVar.a;
        int i2 = aVar.f9059c;
        objArr[i2] = n0Var;
        int length = (objArr.length - 1) & (i2 + 1);
        aVar.f9059c = length;
        int i3 = aVar.f9058b;
        if (length == i3) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            h.l.c.d(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = aVar.a;
            int length3 = objArr3.length;
            int i4 = aVar.f9058b;
            h.l.c.d(objArr3, objArr2, length3 - i4, 0, i4, 4);
            aVar.a = objArr2;
            aVar.f9058b = 0;
            aVar.f9059c = length2;
        }
    }

    public final void k0(boolean z) {
        this.f9161b = i0(z) + this.f9161b;
        if (z) {
            return;
        }
        this.f9162c = true;
    }

    public final boolean l0() {
        return this.f9161b >= i0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    public final boolean m0() {
        i.a.i2.a<n0<?>> aVar = this.f9163d;
        if (aVar == null) {
            return false;
        }
        int i2 = aVar.f9058b;
        n0 n0Var = null;
        if (i2 != aVar.f9059c) {
            ?? r3 = aVar.a;
            ?? r6 = r3[i2];
            r3[i2] = 0;
            aVar.f9058b = (i2 + 1) & (r3.length - 1);
            Objects.requireNonNull(r6, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            n0Var = r6;
        }
        n0 n0Var2 = n0Var;
        if (n0Var2 == null) {
            return false;
        }
        n0Var2.run();
        return true;
    }

    public void shutdown() {
    }
}

package com.amazon.aps.iva.cd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.x;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.yb0.j;
import java.util.Set;
/* compiled from: JavaTypeAttributes.kt */
/* loaded from: classes4.dex */
public final class a extends x {
    public final r1 b;
    public final b c;
    public final boolean d;
    public final boolean e;
    public final Set<y0> f;
    public final m0 g;

    public /* synthetic */ a(r1 r1Var, boolean z, boolean z2, Set set, int i) {
        this(r1Var, (i & 2) != 0 ? b.INFLEXIBLE : null, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static a e(a aVar, b bVar, boolean z, Set set, m0 m0Var, int i) {
        r1 r1Var;
        boolean z2;
        if ((i & 1) != 0) {
            r1Var = aVar.b;
        } else {
            r1Var = null;
        }
        r1 r1Var2 = r1Var;
        if ((i & 2) != 0) {
            bVar = aVar.c;
        }
        b bVar2 = bVar;
        if ((i & 4) != 0) {
            z = aVar.d;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = aVar.e;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            set = aVar.f;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            m0Var = aVar.g;
        }
        aVar.getClass();
        j.f(r1Var2, "howThisTypeIsUsed");
        j.f(bVar2, "flexibility");
        return new a(r1Var2, bVar2, z3, z4, set2, m0Var);
    }

    @Override // com.amazon.aps.iva.ee0.x
    public final m0 a() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ee0.x
    public final r1 b() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ee0.x
    public final Set<y0> c() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.ee0.x
    public final x d(y0 y0Var) {
        Set H;
        Set<y0> set = this.f;
        if (set != null) {
            H = com.amazon.aps.iva.lb0.m0.R(set, y0Var);
        } else {
            H = l1.H(y0Var);
        }
        return e(this, null, false, H, null, 47);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(aVar.g, this.g) || aVar.b != this.b || aVar.c != this.c || aVar.d != this.d || aVar.e != this.e) {
            return false;
        }
        return true;
    }

    public final a f(b bVar) {
        j.f(bVar, "flexibility");
        return e(this, bVar, false, null, null, 61);
    }

    @Override // com.amazon.aps.iva.ee0.x
    public final int hashCode() {
        int i;
        m0 m0Var = this.g;
        if (m0Var != null) {
            i = m0Var.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode() + (i * 31) + i;
        int hashCode2 = this.c.hashCode() + (hashCode * 31) + hashCode;
        int i2 = (hashCode2 * 31) + (this.d ? 1 : 0) + hashCode2;
        return (i2 * 31) + (this.e ? 1 : 0) + i2;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.b + ", flexibility=" + this.c + ", isRaw=" + this.d + ", isForAnnotationParameter=" + this.e + ", visitedTypeParameters=" + this.f + ", defaultType=" + this.g + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(r1 r1Var, b bVar, boolean z, boolean z2, Set<? extends y0> set, m0 m0Var) {
        super(r1Var, set, m0Var);
        j.f(r1Var, "howThisTypeIsUsed");
        j.f(bVar, "flexibility");
        this.b = r1Var;
        this.c = bVar;
        this.d = z;
        this.e = z2;
        this.f = set;
        this.g = m0Var;
    }
}

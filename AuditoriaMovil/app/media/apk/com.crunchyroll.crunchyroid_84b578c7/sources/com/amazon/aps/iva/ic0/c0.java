package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.k;
import com.amazon.aps.iva.ic0.p0;
import com.amazon.aps.iva.ic0.r0;
import com.amazon.aps.iva.oc0.c1;
import java.lang.annotation.Annotation;
import java.util.List;
/* compiled from: KParameterImpl.kt */
/* loaded from: classes4.dex */
public final class c0 implements com.amazon.aps.iva.fc0.k {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(c0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(c0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    public final h<?> b;
    public final int c;
    public final k.a d;
    public final p0.a e;

    /* compiled from: KParameterImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends Annotation>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends Annotation> invoke() {
            return v0.d(c0.this.h());
        }
    }

    public c0(h<?> hVar, int i, k.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.oc0.k0> aVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "callable");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        this.b = hVar;
        this.c = i;
        this.d = aVar;
        this.e = p0.c(aVar2);
        p0.c(new a());
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final boolean a() {
        com.amazon.aps.iva.oc0.k0 h = h();
        if ((h instanceof c1) && ((c1) h).p0() != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, c0Var.b)) {
                if (this.c == c0Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final int getIndex() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final k.a getKind() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final String getName() {
        c1 c1Var;
        com.amazon.aps.iva.oc0.k0 h = h();
        if (h instanceof c1) {
            c1Var = (c1) h;
        } else {
            c1Var = null;
        }
        if (c1Var == null || c1Var.d().c0()) {
            return null;
        }
        com.amazon.aps.iva.nd0.f name = c1Var.getName();
        com.amazon.aps.iva.yb0.j.e(name, "valueParameter.name");
        if (name.c) {
            return null;
        }
        return name.b();
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final k0 getType() {
        com.amazon.aps.iva.ee0.e0 type = h().getType();
        com.amazon.aps.iva.yb0.j.e(type, "descriptor.type");
        return new k0(type, new d0(this));
    }

    public final com.amazon.aps.iva.oc0.k0 h() {
        com.amazon.aps.iva.fc0.l<Object> lVar = f[0];
        Object invoke = this.e.invoke();
        com.amazon.aps.iva.yb0.j.e(invoke, "<get-descriptor>(...)");
        return (com.amazon.aps.iva.oc0.k0) invoke;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.fc0.k
    public final boolean l() {
        c1 c1Var;
        com.amazon.aps.iva.oc0.k0 h = h();
        if (h instanceof c1) {
            c1Var = (c1) h;
        } else {
            c1Var = null;
        }
        if (c1Var != null) {
            return com.amazon.aps.iva.ud0.b.a(c1Var);
        }
        return false;
    }

    public final String toString() {
        String b;
        com.amazon.aps.iva.pd0.d dVar = r0.a;
        StringBuilder sb = new StringBuilder();
        int i = r0.a.a[this.d.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    sb.append("parameter #" + this.c + ' ' + getName());
                }
            } else {
                sb.append("instance parameter");
            }
        } else {
            sb.append("extension receiver parameter");
        }
        sb.append(" of ");
        com.amazon.aps.iva.oc0.b o = this.b.o();
        if (o instanceof com.amazon.aps.iva.oc0.n0) {
            b = r0.c((com.amazon.aps.iva.oc0.n0) o);
        } else if (o instanceof com.amazon.aps.iva.oc0.v) {
            b = r0.b((com.amazon.aps.iva.oc0.v) o);
        } else {
            throw new IllegalStateException(("Illegal callable: " + o).toString());
        }
        sb.append(b);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

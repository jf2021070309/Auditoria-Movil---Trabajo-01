package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.fc0.k;
import com.amazon.aps.iva.oc0.c1;
import java.util.List;
/* compiled from: ReflectionObjectRenderer.kt */
/* loaded from: classes4.dex */
public final class r0 {
    public static final com.amazon.aps.iva.pd0.d a = com.amazon.aps.iva.pd0.c.a;

    /* compiled from: ReflectionObjectRenderer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<c1, CharSequence> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(c1 c1Var) {
            com.amazon.aps.iva.pd0.d dVar = r0.a;
            com.amazon.aps.iva.ee0.e0 type = c1Var.getType();
            com.amazon.aps.iva.yb0.j.e(type, "it.type");
            return r0.d(type);
        }
    }

    public static void a(StringBuilder sb, com.amazon.aps.iva.oc0.a aVar) {
        boolean z;
        com.amazon.aps.iva.oc0.q0 g = v0.g(aVar);
        com.amazon.aps.iva.oc0.q0 M = aVar.M();
        if (g != null) {
            com.amazon.aps.iva.ee0.e0 type = g.getType();
            com.amazon.aps.iva.yb0.j.e(type, "receiver.type");
            sb.append(d(type));
            sb.append(".");
        }
        if (g != null && M != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append("(");
        }
        if (M != null) {
            com.amazon.aps.iva.ee0.e0 type2 = M.getType();
            com.amazon.aps.iva.yb0.j.e(type2, "receiver.type");
            sb.append(d(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    public static String b(com.amazon.aps.iva.oc0.v vVar) {
        com.amazon.aps.iva.yb0.j.f(vVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, vVar);
        com.amazon.aps.iva.nd0.f name = vVar.getName();
        com.amazon.aps.iva.yb0.j.e(name, "descriptor.name");
        sb.append(a.t(name, true));
        List<c1> f = vVar.f();
        com.amazon.aps.iva.yb0.j.e(f, "descriptor.valueParameters");
        com.amazon.aps.iva.lb0.x.A0(f, sb, ", ", "(", ")", b.h, 48);
        sb.append(": ");
        com.amazon.aps.iva.ee0.e0 returnType = vVar.getReturnType();
        com.amazon.aps.iva.yb0.j.c(returnType);
        sb.append(d(returnType));
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String c(com.amazon.aps.iva.oc0.n0 n0Var) {
        String str;
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        if (n0Var.L()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        a(sb, n0Var);
        com.amazon.aps.iva.nd0.f name = n0Var.getName();
        com.amazon.aps.iva.yb0.j.e(name, "descriptor.name");
        sb.append(a.t(name, true));
        sb.append(": ");
        com.amazon.aps.iva.ee0.e0 type = n0Var.getType();
        com.amazon.aps.iva.yb0.j.e(type, "descriptor.type");
        sb.append(d(type));
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static String d(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
        return a.u(e0Var);
    }
}

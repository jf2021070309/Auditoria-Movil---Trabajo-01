package com.amazon.aps.iva.pd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.a0;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.d1;
import com.amazon.aps.iva.oc0.e0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.j0;
import com.amazon.aps.iva.oc0.l0;
import com.amazon.aps.iva.oc0.m0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.o0;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.t;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.oc0.x0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.oc0.z0;
import com.amazon.aps.iva.pd0.c;
import com.amazon.aps.iva.sd0.t;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.pd0.c implements j {
    public final k d;
    public final com.amazon.aps.iva.kb0.m e = com.amazon.aps.iva.kb0.f.b(new c());

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes4.dex */
    public final class a implements com.amazon.aps.iva.oc0.m<com.amazon.aps.iva.kb0.q, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: com.amazon.aps.iva.pd0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0612a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[q.values().length];
                try {
                    iArr[q.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a() {
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q a(o0 o0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(o0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            o(o0Var, sb2, "getter");
            return com.amazon.aps.iva.kb0.q.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
        @Override // com.amazon.aps.iva.oc0.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q b(com.amazon.aps.iva.oc0.j r20, java.lang.StringBuilder r21) {
            /*
                Method dump skipped, instructions count: 351
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd0.d.a.b(com.amazon.aps.iva.oc0.j, java.lang.Object):java.lang.Object");
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q c(q0 q0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(q0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            sb2.append(q0Var.getName());
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q d(com.amazon.aps.iva.oc0.e eVar, StringBuilder sb) {
            boolean z;
            com.amazon.aps.iva.oc0.d D;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            String str;
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(eVar, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d dVar = d.this;
            dVar.getClass();
            if (eVar.getKind() == com.amazon.aps.iva.oc0.f.ENUM_ENTRY) {
                z = true;
            } else {
                z = false;
            }
            if (!dVar.A()) {
                dVar.G(sb2, eVar, null);
                List<q0> V = eVar.V();
                com.amazon.aps.iva.yb0.j.e(V, "klass.contextReceivers");
                dVar.J(V, sb2);
                if (!z) {
                    com.amazon.aps.iva.oc0.r visibility = eVar.getVisibility();
                    com.amazon.aps.iva.yb0.j.e(visibility, "klass.visibility");
                    dVar.l0(visibility, sb2);
                }
                if ((eVar.getKind() != com.amazon.aps.iva.oc0.f.INTERFACE || eVar.o() != b0.ABSTRACT) && (!eVar.getKind().isSingleton() || eVar.o() != b0.FINAL)) {
                    b0 o = eVar.o();
                    com.amazon.aps.iva.yb0.j.e(o, "klass.modality");
                    dVar.R(o, sb2, d.E(eVar));
                }
                dVar.Q(eVar, sb2);
                if (dVar.z().contains(i.INNER) && eVar.z()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.T(sb2, z2, "inner");
                if (dVar.z().contains(i.DATA) && eVar.s()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                dVar.T(sb2, z3, "data");
                if (dVar.z().contains(i.INLINE) && eVar.isInline()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                dVar.T(sb2, z4, "inline");
                if (dVar.z().contains(i.VALUE) && eVar.f0()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                dVar.T(sb2, z5, "value");
                if (dVar.z().contains(i.FUN) && eVar.a0()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                dVar.T(sb2, z6, "fun");
                if (eVar instanceof x0) {
                    str = "typealias";
                } else if (eVar.X()) {
                    str = "companion object";
                } else {
                    switch (c.k.a.a[eVar.getKind().ordinal()]) {
                        case 1:
                            str = "class";
                            break;
                        case 2:
                            str = "interface";
                            break;
                        case 3:
                            str = "enum class";
                            break;
                        case 4:
                            str = "object";
                            break;
                        case 5:
                            str = "annotation class";
                            break;
                        case 6:
                            str = "enum entry";
                            break;
                        default:
                            throw new com.amazon.aps.iva.kb0.h();
                    }
                }
                sb2.append(dVar.O(str));
            }
            boolean l = com.amazon.aps.iva.qd0.i.l(eVar);
            k kVar = dVar.d;
            if (!l) {
                if (!dVar.A()) {
                    d.c0(sb2);
                }
                dVar.U(eVar, sb2, true);
            } else {
                if (((Boolean) kVar.F.getValue(kVar, k.W[30])).booleanValue()) {
                    if (dVar.A()) {
                        sb2.append("companion object");
                    }
                    d.c0(sb2);
                    com.amazon.aps.iva.oc0.k d = eVar.d();
                    if (d != null) {
                        sb2.append("of ");
                        com.amazon.aps.iva.nd0.f name = d.getName();
                        com.amazon.aps.iva.yb0.j.e(name, "containingDeclaration.name");
                        sb2.append(dVar.t(name, false));
                    }
                }
                if (dVar.D() || !com.amazon.aps.iva.yb0.j.a(eVar.getName(), com.amazon.aps.iva.nd0.h.b)) {
                    if (!dVar.A()) {
                        d.c0(sb2);
                    }
                    com.amazon.aps.iva.nd0.f name2 = eVar.getName();
                    com.amazon.aps.iva.yb0.j.e(name2, "descriptor.name");
                    sb2.append(dVar.t(name2, true));
                }
            }
            if (!z) {
                List<y0> n = eVar.n();
                com.amazon.aps.iva.yb0.j.e(n, "klass.declaredTypeParameters");
                dVar.h0(n, sb2, false);
                dVar.H(eVar, sb2);
                if (!eVar.getKind().isSingleton() && ((Boolean) kVar.i.getValue(kVar, k.W[7])).booleanValue() && (D = eVar.D()) != null) {
                    sb2.append(" ");
                    dVar.G(sb2, D, null);
                    com.amazon.aps.iva.oc0.r visibility2 = D.getVisibility();
                    com.amazon.aps.iva.yb0.j.e(visibility2, "primaryConstructor.visibility");
                    dVar.l0(visibility2, sb2);
                    sb2.append(dVar.O("constructor"));
                    List<c1> f = D.f();
                    com.amazon.aps.iva.yb0.j.e(f, "primaryConstructor.valueParameters");
                    dVar.k0(f, D.c0(), sb2);
                }
                if (!((Boolean) kVar.w.getValue(kVar, k.W[21])).booleanValue() && !com.amazon.aps.iva.lc0.k.F(eVar.m())) {
                    Collection<e0> g = eVar.h().g();
                    com.amazon.aps.iva.yb0.j.e(g, "klass.typeConstructor.supertypes");
                    if (!g.isEmpty() && (g.size() != 1 || !com.amazon.aps.iva.lc0.k.y(g.iterator().next()))) {
                        d.c0(sb2);
                        sb2.append(": ");
                        x.A0(g, sb2, ", ", null, null, new h(dVar), 60);
                    }
                }
                dVar.m0(n, sb2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q e(y0 y0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(y0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d.this.f0(y0Var, sb2, true);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q f(p0 p0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(p0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            o(p0Var, sb2, "setter");
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q g(j0 j0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(j0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d dVar = d.this;
            dVar.getClass();
            dVar.Y(j0Var.c(), "package", sb2);
            if (dVar.h()) {
                sb2.append(" in context of ");
                dVar.U(j0Var.x0(), sb2, false);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q h(c1 c1Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(c1Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d.this.j0(c1Var, true, sb2, true);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q i(v vVar, StringBuilder sb) {
            n(vVar, sb);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q j(n0 n0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d.w(d.this, n0Var, sb2);
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q k(f0 f0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(f0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d dVar = d.this;
            dVar.getClass();
            dVar.Y(f0Var.c(), "package-fragment", sb2);
            if (dVar.h()) {
                sb2.append(" in ");
                dVar.U(f0Var.d(), sb2, false);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final com.amazon.aps.iva.kb0.q l(x0 x0Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            com.amazon.aps.iva.yb0.j.f(x0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb2, "builder");
            d dVar = d.this;
            dVar.G(sb2, x0Var, null);
            com.amazon.aps.iva.oc0.r visibility = x0Var.getVisibility();
            com.amazon.aps.iva.yb0.j.e(visibility, "typeAlias.visibility");
            dVar.l0(visibility, sb2);
            dVar.Q(x0Var, sb2);
            sb2.append(dVar.O("typealias"));
            sb2.append(" ");
            dVar.U(x0Var, sb2, true);
            List<y0> n = x0Var.n();
            com.amazon.aps.iva.yb0.j.e(n, "typeAlias.declaredTypeParameters");
            dVar.h0(n, sb2, false);
            dVar.H(x0Var, sb2);
            sb2.append(" = ");
            sb2.append(dVar.u(x0Var.o0()));
            return com.amazon.aps.iva.kb0.q.a;
        }

        @Override // com.amazon.aps.iva.oc0.m
        public final Object m(Object obj, c0 c0Var) {
            StringBuilder sb = (StringBuilder) obj;
            com.amazon.aps.iva.yb0.j.f(c0Var, "descriptor");
            com.amazon.aps.iva.yb0.j.f(sb, "builder");
            d.this.U(c0Var, sb, true);
            return com.amazon.aps.iva.kb0.q.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x01b9, code lost:
            if (com.amazon.aps.iva.lc0.k.E(r1, com.amazon.aps.iva.lc0.o.a.d) == false) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void n(com.amazon.aps.iva.oc0.v r11, java.lang.StringBuilder r12) {
            /*
                Method dump skipped, instructions count: 471
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd0.d.a.n(com.amazon.aps.iva.oc0.v, java.lang.StringBuilder):void");
        }

        public final void o(m0 m0Var, StringBuilder sb, String str) {
            d dVar = d.this;
            k kVar = dVar.d;
            int i = C0612a.a[((q) kVar.G.getValue(kVar, k.W[31])).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    n(m0Var, sb);
                    return;
                }
                return;
            }
            dVar.Q(m0Var, sb);
            sb.append(str.concat(" for "));
            n0 S = m0Var.S();
            com.amazon.aps.iva.yb0.j.e(S, "descriptor.correspondingProperty");
            d.w(dVar, S, sb);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
        /* JADX WARN: Type inference failed for: r7v2 */
        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            com.amazon.aps.iva.bc0.a aVar;
            boolean z;
            f fVar = f.h;
            d dVar = d.this;
            dVar.getClass();
            com.amazon.aps.iva.yb0.j.f(fVar, "changeOptions");
            k kVar = dVar.d;
            kVar.getClass();
            k kVar2 = new k();
            Field[] declaredFields = k.class.getDeclaredFields();
            com.amazon.aps.iva.yb0.j.e(declaredFields, "this::class.java.declaredFields");
            int length = declaredFields.length;
            ?? r7 = 0;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                if ((field.getModifiers() & 8) == 0) {
                    field.setAccessible(true);
                    Object obj = field.get(kVar);
                    if (obj instanceof com.amazon.aps.iva.bc0.a) {
                        aVar = (com.amazon.aps.iva.bc0.a) obj;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        String name = field.getName();
                        com.amazon.aps.iva.yb0.j.e(name, "field.name");
                        com.amazon.aps.iva.oe0.m.h0(name, "is", r7);
                        com.amazon.aps.iva.fc0.d a = com.amazon.aps.iva.yb0.e0.a(k.class);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder("get");
                        String name3 = field.getName();
                        com.amazon.aps.iva.yb0.j.e(name3, "field.name");
                        if (name3.length() > 0) {
                            z = true;
                        } else {
                            z = r7;
                        }
                        if (z) {
                            char upperCase = Character.toUpperCase(name3.charAt(r7));
                            String substring = name3.substring(1);
                            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
                            name3 = upperCase + substring;
                        }
                        sb.append(name3);
                        new com.amazon.aps.iva.yb0.v(a, name2, sb.toString());
                        field.set(kVar2, new l(aVar.a, kVar2));
                    }
                }
                i++;
                r7 = 0;
            }
            fVar.invoke(kVar2);
            kVar2.a = true;
            return new d(kVar2);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: com.amazon.aps.iva.pd0.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0613d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.sd0.g<?>, CharSequence> {
        public C0613d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.sd0.g<?> gVar) {
            com.amazon.aps.iva.sd0.g<?> gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            return d.this.I(gVar2);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* loaded from: classes4.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, Object> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(e0 e0Var) {
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
            if (e0Var2 instanceof u0) {
                return ((u0) e0Var2).c;
            }
            return e0Var2;
        }
    }

    public d(k kVar) {
        this.d = kVar;
    }

    public static b0 E(a0 a0Var) {
        com.amazon.aps.iva.oc0.e eVar;
        if (a0Var instanceof com.amazon.aps.iva.oc0.e) {
            if (((com.amazon.aps.iva.oc0.e) a0Var).getKind() == com.amazon.aps.iva.oc0.f.INTERFACE) {
                return b0.ABSTRACT;
            }
            return b0.FINAL;
        }
        com.amazon.aps.iva.oc0.k d = a0Var.d();
        if (d instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) d;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return b0.FINAL;
        }
        if (!(a0Var instanceof com.amazon.aps.iva.oc0.b)) {
            return b0.FINAL;
        }
        com.amazon.aps.iva.oc0.b bVar = (com.amazon.aps.iva.oc0.b) a0Var;
        Collection<? extends com.amazon.aps.iva.oc0.b> k = bVar.k();
        com.amazon.aps.iva.yb0.j.e(k, "this.overriddenDescriptors");
        if ((!k.isEmpty()) && eVar.o() != b0.FINAL) {
            return b0.OPEN;
        }
        if (eVar.getKind() == com.amazon.aps.iva.oc0.f.INTERFACE && !com.amazon.aps.iva.yb0.j.a(bVar.getVisibility(), com.amazon.aps.iva.oc0.q.a)) {
            b0 o = bVar.o();
            b0 b0Var = b0.ABSTRACT;
            if (o != b0Var) {
                return b0.OPEN;
            }
            return b0Var;
        }
        return b0.FINAL;
    }

    public static void c0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean n0(e0 e0Var) {
        boolean z;
        if (!com.amazon.aps.iva.lc0.f.h(e0Var)) {
            return false;
        }
        List<j1> G0 = e0Var.G0();
        if (!(G0 instanceof Collection) || !G0.isEmpty()) {
            for (j1 j1Var : G0) {
                if (j1Var.b()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (!z) {
            return false;
        }
        return true;
    }

    public static final void w(d dVar, n0 n0Var, StringBuilder sb) {
        boolean z;
        boolean z2;
        if (!dVar.A()) {
            k kVar = dVar.d;
            l lVar = kVar.g;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = k.W;
            if (!((Boolean) lVar.getValue(kVar, lVarArr[5])).booleanValue()) {
                if (dVar.z().contains(i.ANNOTATIONS)) {
                    dVar.G(sb, n0Var, null);
                    t r0 = n0Var.r0();
                    if (r0 != null) {
                        dVar.G(sb, r0, com.amazon.aps.iva.pc0.e.FIELD);
                    }
                    t N = n0Var.N();
                    if (N != null) {
                        dVar.G(sb, N, com.amazon.aps.iva.pc0.e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((q) kVar.G.getValue(kVar, lVarArr[31])) == q.NONE) {
                        com.amazon.aps.iva.rc0.m0 getter = n0Var.getGetter();
                        if (getter != null) {
                            dVar.G(sb, getter, com.amazon.aps.iva.pc0.e.PROPERTY_GETTER);
                        }
                        p0 setter = n0Var.getSetter();
                        if (setter != null) {
                            dVar.G(sb, setter, com.amazon.aps.iva.pc0.e.PROPERTY_SETTER);
                            List<c1> f = setter.f();
                            com.amazon.aps.iva.yb0.j.e(f, "setter.valueParameters");
                            c1 c1Var = (c1) x.P0(f);
                            com.amazon.aps.iva.yb0.j.e(c1Var, "it");
                            dVar.G(sb, c1Var, com.amazon.aps.iva.pc0.e.SETTER_PARAMETER);
                        }
                    }
                }
                List<q0> t0 = n0Var.t0();
                com.amazon.aps.iva.yb0.j.e(t0, "property.contextReceiverParameters");
                dVar.J(t0, sb);
                com.amazon.aps.iva.oc0.r visibility = n0Var.getVisibility();
                com.amazon.aps.iva.yb0.j.e(visibility, "property.visibility");
                dVar.l0(visibility, sb);
                if (dVar.z().contains(i.CONST) && n0Var.isConst()) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.T(sb, z, "const");
                dVar.Q(n0Var, sb);
                dVar.S(n0Var, sb);
                dVar.X(n0Var, sb);
                if (dVar.z().contains(i.LATEINIT) && n0Var.u0()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.T(sb, z2, "lateinit");
                dVar.P(n0Var, sb);
            }
            dVar.i0(n0Var, sb, false);
            List<y0> typeParameters = n0Var.getTypeParameters();
            com.amazon.aps.iva.yb0.j.e(typeParameters, "property.typeParameters");
            dVar.h0(typeParameters, sb, true);
            dVar.a0(sb, n0Var);
        }
        dVar.U(n0Var, sb, true);
        sb.append(": ");
        e0 type = n0Var.getType();
        com.amazon.aps.iva.yb0.j.e(type, "property.type");
        sb.append(dVar.u(type));
        dVar.b0(sb, n0Var);
        dVar.N(n0Var, sb);
        List<y0> typeParameters2 = n0Var.getTypeParameters();
        com.amazon.aps.iva.yb0.j.e(typeParameters2, "property.typeParameters");
        dVar.m0(typeParameters2, sb);
    }

    public final boolean A() {
        k kVar = this.d;
        return ((Boolean) kVar.f.getValue(kVar, k.W[4])).booleanValue();
    }

    public final r B() {
        k kVar = this.d;
        return (r) kVar.C.getValue(kVar, k.W[27]);
    }

    public final c.l C() {
        k kVar = this.d;
        return (c.l) kVar.B.getValue(kVar, k.W[26]);
    }

    public final boolean D() {
        k kVar = this.d;
        return ((Boolean) kVar.j.getValue(kVar, k.W[8])).booleanValue();
    }

    public final String F(com.amazon.aps.iva.oc0.k kVar) {
        com.amazon.aps.iva.oc0.k d;
        String str;
        String s;
        com.amazon.aps.iva.yb0.j.f(kVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        kVar.D0(new a(), sb);
        k kVar2 = this.d;
        l lVar = kVar2.c;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = k.W;
        if (((Boolean) lVar.getValue(kVar2, lVarArr[1])).booleanValue() && !(kVar instanceof f0) && !(kVar instanceof j0) && (d = kVar.d()) != null && !(d instanceof c0)) {
            sb.append(" ");
            int i = b.a[B().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = "<i>defined in</i>";
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                str = "defined in";
            }
            sb.append(str);
            sb.append(" ");
            com.amazon.aps.iva.nd0.d g = com.amazon.aps.iva.qd0.i.g(d);
            com.amazon.aps.iva.yb0.j.e(g, "getFqName(containingDeclaration)");
            if (g.d()) {
                s = "root package";
            } else {
                s = s(g);
            }
            sb.append(s);
            if (((Boolean) kVar2.d.getValue(kVar2, lVarArr[2])).booleanValue() && (d instanceof f0) && (kVar instanceof com.amazon.aps.iva.oc0.n)) {
                ((com.amazon.aps.iva.oc0.n) kVar).g().b();
            }
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void G(StringBuilder sb, com.amazon.aps.iva.pc0.a aVar, com.amazon.aps.iva.pc0.e eVar) {
        Set<com.amazon.aps.iva.nd0.c> set;
        if (!z().contains(i.ANNOTATIONS)) {
            return;
        }
        boolean z = aVar instanceof e0;
        k kVar = this.d;
        if (z) {
            set = g();
        } else {
            set = (Set) kVar.J.getValue(kVar, k.W[34]);
        }
        com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) kVar.L.getValue(kVar, k.W[36]);
        for (com.amazon.aps.iva.pc0.c cVar : aVar.getAnnotations()) {
            if (!x.m0(set, cVar.c()) && !com.amazon.aps.iva.yb0.j.a(cVar.c(), o.a.r) && (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue())) {
                sb.append(p(cVar, eVar));
                if (((Boolean) kVar.I.getValue(kVar, k.W[33])).booleanValue()) {
                    sb.append('\n');
                } else {
                    sb.append(" ");
                }
            }
        }
    }

    public final void H(com.amazon.aps.iva.oc0.i iVar, StringBuilder sb) {
        List<y0> n = iVar.n();
        com.amazon.aps.iva.yb0.j.e(n, "classifier.declaredTypeParameters");
        List<y0> parameters = iVar.h().getParameters();
        com.amazon.aps.iva.yb0.j.e(parameters, "classifier.typeConstructor.parameters");
        if (D() && iVar.z() && parameters.size() > n.size()) {
            sb.append(" /*captured type parameters: ");
            g0(parameters.subList(n.size(), parameters.size()), sb);
            sb.append("*/");
        }
    }

    public final String I(com.amazon.aps.iva.sd0.g<?> gVar) {
        String p;
        if (gVar instanceof com.amazon.aps.iva.sd0.b) {
            return x.B0((Iterable) ((com.amazon.aps.iva.sd0.b) gVar).a, ", ", "{", "}", new C0613d(), 24);
        }
        if (gVar instanceof com.amazon.aps.iva.sd0.a) {
            p = p((com.amazon.aps.iva.pc0.c) ((com.amazon.aps.iva.sd0.a) gVar).a, null);
            return com.amazon.aps.iva.oe0.q.y0("@", p);
        } else if (gVar instanceof com.amazon.aps.iva.sd0.t) {
            t.a aVar = (t.a) ((com.amazon.aps.iva.sd0.t) gVar).a;
            if (aVar instanceof t.a.C0704a) {
                return ((t.a.C0704a) aVar).a + "::class";
            } else if (aVar instanceof t.a.b) {
                t.a.b bVar = (t.a.b) aVar;
                String b2 = bVar.a.a.b().b();
                for (int i = 0; i < bVar.a.b; i++) {
                    b2 = "kotlin.Array<" + b2 + '>';
                }
                return com.amazon.aps.iva.c80.a.f(b2, "::class");
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            return gVar.toString();
        }
    }

    public final void J(List<? extends q0> list, StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i = 0;
            for (q0 q0Var : list) {
                int i2 = i + 1;
                G(sb, q0Var, com.amazon.aps.iva.pc0.e.RECEIVER);
                e0 type = q0Var.getType();
                com.amazon.aps.iva.yb0.j.e(type, "contextReceiver.type");
                sb.append(M(type));
                if (i == f1.B(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i = i2;
            }
        }
    }

    public final void K(StringBuilder sb, com.amazon.aps.iva.ee0.m0 m0Var) {
        com.amazon.aps.iva.ee0.q qVar;
        com.amazon.aps.iva.ee0.m0 m0Var2;
        boolean z;
        com.amazon.aps.iva.oc0.i iVar = null;
        G(sb, m0Var, null);
        if (m0Var instanceof com.amazon.aps.iva.ee0.q) {
            qVar = (com.amazon.aps.iva.ee0.q) m0Var;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            m0Var2 = qVar.c;
        } else {
            m0Var2 = null;
        }
        if (l1.D(m0Var)) {
            boolean z2 = m0Var instanceof com.amazon.aps.iva.ge0.h;
            if (z2 && ((com.amazon.aps.iva.ge0.h) m0Var).e.isUnresolved()) {
                z = true;
            } else {
                z = false;
            }
            k kVar = this.d;
            if (z && ((Boolean) kVar.T.getValue(kVar, k.W[45])).booleanValue()) {
                com.amazon.aps.iva.ge0.k kVar2 = com.amazon.aps.iva.ge0.k.a;
                if (z2) {
                    ((com.amazon.aps.iva.ge0.h) m0Var).e.isUnresolved();
                }
                com.amazon.aps.iva.ee0.c1 I0 = m0Var.I0();
                com.amazon.aps.iva.yb0.j.d(I0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb.append(L(((com.amazon.aps.iva.ge0.i) I0).b[0]));
            } else {
                if (z2 && !((Boolean) kVar.V.getValue(kVar, k.W[47])).booleanValue()) {
                    sb.append(((com.amazon.aps.iva.ge0.h) m0Var).i);
                } else {
                    sb.append(m0Var.I0().toString());
                }
                sb.append(d0(m0Var.G0()));
            }
        } else if (m0Var instanceof u0) {
            sb.append(((u0) m0Var).c.toString());
        } else if (m0Var2 instanceof u0) {
            sb.append(((u0) m0Var2).c.toString());
        } else {
            com.amazon.aps.iva.ee0.c1 I02 = m0Var.I0();
            com.amazon.aps.iva.oc0.h k = m0Var.I0().k();
            if (k instanceof com.amazon.aps.iva.oc0.i) {
                iVar = (com.amazon.aps.iva.oc0.i) k;
            }
            l0 a2 = z0.a(m0Var, iVar, 0);
            if (a2 == null) {
                sb.append(e0(I02));
                sb.append(d0(m0Var.G0()));
            } else {
                Z(sb, a2);
            }
        }
        if (m0Var.J0()) {
            sb.append("?");
        }
        if (m0Var instanceof com.amazon.aps.iva.ee0.q) {
            sb.append(" & Any");
        }
    }

    public final String L(String str) {
        int i = b.a[B().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return defpackage.e.e("<font color=red><b>", str, "</b></font>");
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        return str;
    }

    public final String M(e0 e0Var) {
        String u = u(e0Var);
        if ((n0(e0Var) && !s1.g(e0Var)) || (e0Var instanceof com.amazon.aps.iva.ee0.q)) {
            return "(" + u + ')';
        }
        return u;
    }

    public final void N(d1 d1Var, StringBuilder sb) {
        com.amazon.aps.iva.sd0.g<?> j0;
        k kVar = this.d;
        if (((Boolean) kVar.u.getValue(kVar, k.W[19])).booleanValue() && (j0 = d1Var.j0()) != null) {
            sb.append(" = ");
            sb.append(x(I(j0)));
        }
    }

    public final String O(String str) {
        int i = b.a[B().ordinal()];
        if (i != 1) {
            if (i == 2) {
                k kVar = this.d;
                if (!((Boolean) kVar.U.getValue(kVar, k.W[46])).booleanValue()) {
                    return defpackage.e.e("<b>", str, "</b>");
                }
                return str;
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        return str;
    }

    public final void P(com.amazon.aps.iva.oc0.b bVar, StringBuilder sb) {
        if (z().contains(i.MEMBER_KIND) && D() && bVar.getKind() != b.a.DECLARATION) {
            sb.append("/*");
            sb.append(com.amazon.aps.iva.ab.x.n0(bVar.getKind().name()));
            sb.append("*/ ");
        }
    }

    public final void Q(a0 a0Var, StringBuilder sb) {
        boolean z;
        T(sb, a0Var.isExternal(), "external");
        boolean z2 = true;
        if (z().contains(i.EXPECT) && a0Var.g0()) {
            z = true;
        } else {
            z = false;
        }
        T(sb, z, "expect");
        if (!z().contains(i.ACTUAL) || !a0Var.U()) {
            z2 = false;
        }
        T(sb, z2, "actual");
    }

    public final void R(b0 b0Var, StringBuilder sb, b0 b0Var2) {
        k kVar = this.d;
        if (!((Boolean) kVar.p.getValue(kVar, k.W[14])).booleanValue() && b0Var == b0Var2) {
            return;
        }
        T(sb, z().contains(i.MODALITY), com.amazon.aps.iva.ab.x.n0(b0Var.name()));
    }

    public final void S(com.amazon.aps.iva.oc0.b bVar, StringBuilder sb) {
        if (!com.amazon.aps.iva.qd0.i.t(bVar) || bVar.o() != b0.FINAL) {
            k kVar = this.d;
            if (((o) kVar.A.getValue(kVar, k.W[25])) == o.RENDER_OVERRIDE && bVar.o() == b0.OPEN && (!bVar.k().isEmpty())) {
                return;
            }
            b0 o = bVar.o();
            com.amazon.aps.iva.yb0.j.e(o, "callable.modality");
            R(o, sb, E(bVar));
        }
    }

    public final void T(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(O(str));
            sb.append(" ");
        }
    }

    public final void U(com.amazon.aps.iva.oc0.k kVar, StringBuilder sb, boolean z) {
        com.amazon.aps.iva.nd0.f name = kVar.getName();
        com.amazon.aps.iva.yb0.j.e(name, "descriptor.name");
        sb.append(t(name, z));
    }

    public final void V(StringBuilder sb, e0 e0Var) {
        com.amazon.aps.iva.ee0.a aVar;
        u1 L0 = e0Var.L0();
        if (L0 instanceof com.amazon.aps.iva.ee0.a) {
            aVar = (com.amazon.aps.iva.ee0.a) L0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            k kVar = this.d;
            l lVar = kVar.Q;
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = k.W;
            boolean booleanValue = ((Boolean) lVar.getValue(kVar, lVarArr[41])).booleanValue();
            com.amazon.aps.iva.ee0.m0 m0Var = aVar.c;
            if (booleanValue) {
                W(sb, m0Var);
                return;
            }
            W(sb, aVar.d);
            if (((Boolean) kVar.P.getValue(kVar, lVarArr[40])).booleanValue()) {
                r B = B();
                r rVar = r.HTML;
                if (B == rVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                W(sb, m0Var);
                sb.append(" */");
                if (B() == rVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        W(sb, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(java.lang.StringBuilder r18, com.amazon.aps.iva.ee0.e0 r19) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd0.d.W(java.lang.StringBuilder, com.amazon.aps.iva.ee0.e0):void");
    }

    public final void X(com.amazon.aps.iva.oc0.b bVar, StringBuilder sb) {
        if (z().contains(i.OVERRIDE) && (!bVar.k().isEmpty())) {
            k kVar = this.d;
            if (((o) kVar.A.getValue(kVar, k.W[25])) != o.RENDER_OPEN) {
                T(sb, true, "override");
                if (D()) {
                    sb.append("/*");
                    sb.append(bVar.k().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void Y(com.amazon.aps.iva.nd0.c cVar, String str, StringBuilder sb) {
        boolean z;
        sb.append(O(str));
        com.amazon.aps.iva.nd0.d i = cVar.i();
        com.amazon.aps.iva.yb0.j.e(i, "fqName.toUnsafe()");
        String s = s(i);
        if (s.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append(" ");
            sb.append(s);
        }
    }

    public final void Z(StringBuilder sb, l0 l0Var) {
        l0 l0Var2 = l0Var.c;
        com.amazon.aps.iva.oc0.i iVar = l0Var.a;
        if (l0Var2 != null) {
            Z(sb, l0Var2);
            sb.append('.');
            com.amazon.aps.iva.nd0.f name = iVar.getName();
            com.amazon.aps.iva.yb0.j.e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(t(name, false));
        } else {
            com.amazon.aps.iva.ee0.c1 h = iVar.h();
            com.amazon.aps.iva.yb0.j.e(h, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(e0(h));
        }
        sb.append(d0(l0Var.b));
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void a() {
        this.d.a();
    }

    public final void a0(StringBuilder sb, com.amazon.aps.iva.oc0.a aVar) {
        q0 M = aVar.M();
        if (M != null) {
            G(sb, M, com.amazon.aps.iva.pc0.e.RECEIVER);
            e0 type = M.getType();
            com.amazon.aps.iva.yb0.j.e(type, "receiver.type");
            sb.append(M(type));
            sb.append(".");
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void b() {
        this.d.b();
    }

    public final void b0(StringBuilder sb, com.amazon.aps.iva.oc0.a aVar) {
        q0 M;
        k kVar = this.d;
        if (((Boolean) kVar.E.getValue(kVar, k.W[29])).booleanValue() && (M = aVar.M()) != null) {
            sb.append(" on ");
            e0 type = M.getType();
            com.amazon.aps.iva.yb0.j.e(type, "receiver.type");
            sb.append(u(type));
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void c(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "<set-?>");
        this.d.c(pVar);
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final boolean d() {
        return this.d.d();
    }

    public final String d0(List<? extends j1> list) {
        com.amazon.aps.iva.yb0.j.f(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x("<"));
        x.A0(list, sb, ", ", null, null, new com.amazon.aps.iva.pd0.e(this), 60);
        sb.append(x(">"));
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void e() {
        this.d.e();
    }

    public final String e0(com.amazon.aps.iva.ee0.c1 c1Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(c1Var, "typeConstructor");
        com.amazon.aps.iva.oc0.h k = c1Var.k();
        boolean z2 = true;
        if (k instanceof y0) {
            z = true;
        } else {
            z = k instanceof com.amazon.aps.iva.oc0.e;
        }
        if (!z) {
            z2 = k instanceof x0;
        }
        if (z2) {
            com.amazon.aps.iva.yb0.j.f(k, "klass");
            if (com.amazon.aps.iva.ge0.k.f(k)) {
                return k.h().toString();
            }
            return y().a(k, this);
        } else if (k == null) {
            if (c1Var instanceof com.amazon.aps.iva.ee0.c0) {
                return ((com.amazon.aps.iva.ee0.c0) c1Var).d(e.h);
            }
            return c1Var.toString();
        } else {
            throw new IllegalStateException(("Unexpected classifier: " + k.getClass()).toString());
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void f() {
        this.d.f();
    }

    public final void f0(y0 y0Var, StringBuilder sb, boolean z) {
        boolean z2;
        boolean z3;
        if (z) {
            sb.append(x("<"));
        }
        if (D()) {
            sb.append("/*");
            sb.append(y0Var.getIndex());
            sb.append("*/ ");
        }
        T(sb, y0Var.w(), "reified");
        String label = y0Var.i().getLabel();
        boolean z4 = true;
        if (label.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        T(sb, z2, label);
        G(sb, y0Var, null);
        U(y0Var, sb, z);
        int size = y0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            e0 next = y0Var.getUpperBounds().iterator().next();
            if (next != null) {
                if (!((com.amazon.aps.iva.lc0.k.y(next) && next.J0()) ? false : false)) {
                    sb.append(" : ");
                    sb.append(u(next));
                }
            } else {
                com.amazon.aps.iva.lc0.k.a(141);
                throw null;
            }
        } else if (z) {
            boolean z5 = true;
            for (e0 e0Var : y0Var.getUpperBounds()) {
                if (e0Var != null) {
                    if (com.amazon.aps.iva.lc0.k.y(e0Var) && e0Var.J0()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        if (z5) {
                            sb.append(" : ");
                        } else {
                            sb.append(" & ");
                        }
                        sb.append(u(e0Var));
                        z5 = false;
                    }
                } else {
                    com.amazon.aps.iva.lc0.k.a(141);
                    throw null;
                }
            }
        }
        if (z) {
            sb.append(x(">"));
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final Set<com.amazon.aps.iva.nd0.c> g() {
        return this.d.g();
    }

    public final void g0(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0((y0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final boolean h() {
        return this.d.h();
    }

    public final void h0(List<? extends y0> list, StringBuilder sb, boolean z) {
        k kVar = this.d;
        if (!((Boolean) kVar.v.getValue(kVar, k.W[20])).booleanValue() && (!list.isEmpty())) {
            sb.append(x("<"));
            g0(list, sb);
            sb.append(x(">"));
            if (z) {
                sb.append(" ");
            }
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void i() {
        this.d.i();
    }

    public final void i0(d1 d1Var, StringBuilder sb, boolean z) {
        String str;
        if (z || !(d1Var instanceof c1)) {
            if (d1Var.L()) {
                str = "var";
            } else {
                str = "val";
            }
            sb.append(O(str));
            sb.append(" ");
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void j() {
        this.d.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if (r12 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(com.amazon.aps.iva.oc0.c1 r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd0.d.j0(com.amazon.aps.iva.oc0.c1, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void k(Set<? extends i> set) {
        com.amazon.aps.iva.yb0.j.f(set, "<set-?>");
        this.d.k(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.util.Collection<? extends com.amazon.aps.iva.oc0.c1> r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            com.amazon.aps.iva.pd0.k r0 = r6.d
            com.amazon.aps.iva.pd0.l r1 = r0.D
            com.amazon.aps.iva.fc0.l<java.lang.Object>[] r2 = com.amazon.aps.iva.pd0.k.W
            r3 = 28
            r2 = r2[r3]
            java.lang.Object r0 = r1.getValue(r0, r2)
            com.amazon.aps.iva.pd0.p r0 = (com.amazon.aps.iva.pd0.p) r0
            int[] r1 = com.amazon.aps.iva.pd0.d.b.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2d
            r3 = 2
            if (r0 == r3) goto L29
            r8 = 3
            if (r0 != r8) goto L23
            goto L2c
        L23:
            com.amazon.aps.iva.kb0.h r7 = new com.amazon.aps.iva.kb0.h
            r7.<init>()
            throw r7
        L29:
            if (r8 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            int r8 = r7.size()
            com.amazon.aps.iva.pd0.c$l r0 = r6.C()
            r0.a(r9)
            java.util.Iterator r7 = r7.iterator()
            r0 = r2
        L3d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L5e
            int r3 = r0 + 1
            java.lang.Object r4 = r7.next()
            com.amazon.aps.iva.oc0.c1 r4 = (com.amazon.aps.iva.oc0.c1) r4
            com.amazon.aps.iva.pd0.c$l r5 = r6.C()
            r5.c(r4, r9)
            r6.j0(r4, r1, r9, r2)
            com.amazon.aps.iva.pd0.c$l r5 = r6.C()
            r5.b(r4, r0, r8, r9)
            r0 = r3
            goto L3d
        L5e:
            com.amazon.aps.iva.pd0.c$l r7 = r6.C()
            r7.d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pd0.d.k0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void l(LinkedHashSet linkedHashSet) {
        this.d.l(linkedHashSet);
    }

    public final boolean l0(com.amazon.aps.iva.oc0.r rVar, StringBuilder sb) {
        if (!z().contains(i.VISIBILITY)) {
            return false;
        }
        k kVar = this.d;
        l lVar = kVar.n;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = k.W;
        if (((Boolean) lVar.getValue(kVar, lVarArr[12])).booleanValue()) {
            rVar = rVar.d();
        }
        if (!((Boolean) kVar.o.getValue(kVar, lVarArr[13])).booleanValue() && com.amazon.aps.iva.yb0.j.a(rVar, com.amazon.aps.iva.oc0.q.l)) {
            return false;
        }
        sb.append(O(rVar.b()));
        sb.append(" ");
        return true;
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void m(r rVar) {
        com.amazon.aps.iva.yb0.j.f(rVar, "<set-?>");
        this.d.m(rVar);
    }

    public final void m0(List<? extends y0> list, StringBuilder sb) {
        k kVar = this.d;
        if (((Boolean) kVar.v.getValue(kVar, k.W[20])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (y0 y0Var : list) {
            List<e0> upperBounds = y0Var.getUpperBounds();
            com.amazon.aps.iva.yb0.j.e(upperBounds, "typeParameter.upperBounds");
            for (e0 e0Var : x.o0(upperBounds)) {
                StringBuilder sb2 = new StringBuilder();
                com.amazon.aps.iva.nd0.f name = y0Var.getName();
                com.amazon.aps.iva.yb0.j.e(name, "typeParameter.name");
                sb2.append(t(name, false));
                sb2.append(" : ");
                com.amazon.aps.iva.yb0.j.e(e0Var, "it");
                sb2.append(u(e0Var));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(O("where"));
            sb.append(" ");
            x.A0(arrayList, sb, ", ", null, null, null, 124);
        }
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void n() {
        this.d.n();
    }

    @Override // com.amazon.aps.iva.pd0.j
    public final void o(com.amazon.aps.iva.pd0.b bVar) {
        this.d.o(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    @Override // com.amazon.aps.iva.pd0.c
    public final String p(com.amazon.aps.iva.pc0.c cVar, com.amazon.aps.iva.pc0.e eVar) {
        com.amazon.aps.iva.oc0.e eVar2;
        String str;
        com.amazon.aps.iva.nd0.f fVar;
        com.amazon.aps.iva.oc0.d D;
        List<c1> f;
        com.amazon.aps.iva.yb0.j.f(cVar, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (eVar != null) {
            sb.append(eVar.getRenderName() + ':');
        }
        e0 type = cVar.getType();
        sb.append(u(type));
        k kVar = this.d;
        if (kVar.p().getIncludeAnnotationArguments()) {
            Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a2 = cVar.a();
            ?? r4 = 0;
            r4 = 0;
            r4 = 0;
            if (((Boolean) kVar.H.getValue(kVar, k.W[32])).booleanValue()) {
                eVar2 = com.amazon.aps.iva.ud0.b.d(cVar);
            } else {
                eVar2 = null;
            }
            if (eVar2 != null && (D = eVar2.D()) != null && (f = D.f()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : f) {
                    if (((c1) obj).w0()) {
                        arrayList.add(obj);
                    }
                }
                r4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r4.add(((c1) it.next()).getName());
                }
            }
            if (r4 == 0) {
                r4 = z.b;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : r4) {
                com.amazon.aps.iva.yb0.j.e((com.amazon.aps.iva.nd0.f) obj2, "it");
                if (!a2.containsKey(fVar)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((com.amazon.aps.iva.nd0.f) it2.next()).b() + " = ...");
            }
            Set<Map.Entry<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>>> entrySet = a2.entrySet();
            ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(entrySet));
            Iterator it3 = entrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                com.amazon.aps.iva.nd0.f fVar2 = (com.amazon.aps.iva.nd0.f) entry.getKey();
                com.amazon.aps.iva.sd0.g<?> gVar = (com.amazon.aps.iva.sd0.g) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fVar2.b());
                sb2.append(" = ");
                if (!r4.contains(fVar2)) {
                    str = I(gVar);
                } else {
                    str = "...";
                }
                sb2.append(str);
                arrayList4.add(sb2.toString());
            }
            List S0 = x.S0(x.L0(arrayList4, arrayList3));
            if (kVar.p().getIncludeEmptyAnnotationArguments() || (!S0.isEmpty())) {
                x.A0(S0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (D() && (l1.D(type) || (type.I0().k() instanceof e0.b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // com.amazon.aps.iva.pd0.c
    public final String r(String str, String str2, com.amazon.aps.iva.lc0.k kVar) {
        com.amazon.aps.iva.yb0.j.f(str, "lowerRendered");
        com.amazon.aps.iva.yb0.j.f(str2, "upperRendered");
        if (com.amazon.aps.iva.aq.j.S(str, str2)) {
            if (com.amazon.aps.iva.oe0.m.h0(str2, "(", false)) {
                return defpackage.e.e("(", str, ")!");
            }
            return str.concat("!");
        }
        String M0 = com.amazon.aps.iva.oe0.q.M0(y().a(kVar.j(o.a.B), this), "Collection");
        String J = com.amazon.aps.iva.aq.j.J(str, M0.concat("Mutable"), str2, M0, M0.concat("(Mutable)"));
        if (J != null) {
            return J;
        }
        String J2 = com.amazon.aps.iva.aq.j.J(str, M0.concat("MutableMap.MutableEntry"), str2, M0.concat("Map.Entry"), M0.concat("(Mutable)Map.(Mutable)Entry"));
        if (J2 != null) {
            return J2;
        }
        com.amazon.aps.iva.pd0.b y = y();
        com.amazon.aps.iva.oc0.e k = kVar.k("Array");
        com.amazon.aps.iva.yb0.j.e(k, "builtIns.array");
        String M02 = com.amazon.aps.iva.oe0.q.M0(y.a(k, this), "Array");
        StringBuilder b2 = defpackage.c.b(M02);
        b2.append(x("Array<"));
        String sb = b2.toString();
        StringBuilder b3 = defpackage.c.b(M02);
        b3.append(x("Array<out "));
        String sb2 = b3.toString();
        StringBuilder b4 = defpackage.c.b(M02);
        b4.append(x("Array<(out) "));
        String J3 = com.amazon.aps.iva.aq.j.J(str, sb, str2, sb2, b4.toString());
        if (J3 != null) {
            return J3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    @Override // com.amazon.aps.iva.pd0.c
    public final String s(com.amazon.aps.iva.nd0.d dVar) {
        return x(com.amazon.aps.iva.aq.j.I(dVar.f()));
    }

    @Override // com.amazon.aps.iva.pd0.c
    public final String t(com.amazon.aps.iva.nd0.f fVar, boolean z) {
        String x = x(com.amazon.aps.iva.aq.j.H(fVar));
        k kVar = this.d;
        if (((Boolean) kVar.U.getValue(kVar, k.W[46])).booleanValue() && B() == r.HTML && z) {
            return defpackage.e.e("<b>", x, "</b>");
        }
        return x;
    }

    @Override // com.amazon.aps.iva.pd0.c
    public final String u(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
        StringBuilder sb = new StringBuilder();
        k kVar = this.d;
        V(sb, (com.amazon.aps.iva.ee0.e0) ((com.amazon.aps.iva.xb0.l) kVar.x.getValue(kVar, k.W[22])).invoke(e0Var));
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // com.amazon.aps.iva.pd0.c
    public final String v(j1 j1Var) {
        com.amazon.aps.iva.yb0.j.f(j1Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        x.A0(f1.J(j1Var), sb, ", ", null, null, new com.amazon.aps.iva.pd0.e(this), 60);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String x(String str) {
        return B().escape(str);
    }

    public final com.amazon.aps.iva.pd0.b y() {
        k kVar = this.d;
        return (com.amazon.aps.iva.pd0.b) kVar.b.getValue(kVar, k.W[0]);
    }

    public final Set<i> z() {
        k kVar = this.d;
        return (Set) kVar.e.getValue(kVar, k.W[3]);
    }
}

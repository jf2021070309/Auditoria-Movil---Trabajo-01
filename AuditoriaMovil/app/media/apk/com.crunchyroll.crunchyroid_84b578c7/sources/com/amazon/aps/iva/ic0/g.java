package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ic0.f;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.od0.h;
import com.google.android.gms.cast.MediaTrack;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes4.dex */
public abstract class g {

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends g {
        public final Field a;

        public a(Field field) {
            com.amazon.aps.iva.yb0.j.f(field, "field");
            this.a = field;
        }

        @Override // com.amazon.aps.iva.ic0.g
        public final String a() {
            StringBuilder sb = new StringBuilder();
            Field field = this.a;
            String name = field.getName();
            com.amazon.aps.iva.yb0.j.e(name, "field.name");
            sb.append(com.amazon.aps.iva.xc0.c0.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            com.amazon.aps.iva.yb0.j.e(type, "field.type");
            sb.append(com.amazon.aps.iva.uc0.d.b(type));
            return sb.toString();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class b extends g {
        public final Method a;
        public final Method b;

        public b(Method method, Method method2) {
            com.amazon.aps.iva.yb0.j.f(method, "getterMethod");
            this.a = method;
            this.b = method2;
        }

        @Override // com.amazon.aps.iva.ic0.g
        public final String a() {
            return com.amazon.aps.iva.ab.x.j(this.a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class c extends g {
        public final com.amazon.aps.iva.oc0.n0 a;
        public final com.amazon.aps.iva.id0.m b;
        public final a.c c;
        public final com.amazon.aps.iva.kd0.c d;
        public final com.amazon.aps.iva.kd0.g e;
        public final String f;

        public c(com.amazon.aps.iva.oc0.n0 n0Var, com.amazon.aps.iva.id0.m mVar, a.c cVar, com.amazon.aps.iva.kd0.c cVar2, com.amazon.aps.iva.kd0.g gVar) {
            boolean z;
            String str;
            String sb;
            String str2;
            com.amazon.aps.iva.yb0.j.f(mVar, "proto");
            com.amazon.aps.iva.yb0.j.f(cVar2, "nameResolver");
            com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
            this.a = n0Var;
            this.b = mVar;
            this.c = cVar;
            this.d = cVar2;
            this.e = gVar;
            if ((cVar.c & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb = cVar2.getString(cVar.f.d) + cVar2.getString(cVar.f.e);
            } else {
                d.a b = com.amazon.aps.iva.md0.h.b(mVar, cVar2, gVar, true);
                if (b != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(com.amazon.aps.iva.xc0.c0.a(b.a));
                    com.amazon.aps.iva.oc0.k d = n0Var.d();
                    com.amazon.aps.iva.yb0.j.e(d, "descriptor.containingDeclaration");
                    if (com.amazon.aps.iva.yb0.j.a(n0Var.getVisibility(), com.amazon.aps.iva.oc0.q.d) && (d instanceof com.amazon.aps.iva.ce0.d)) {
                        h.f<com.amazon.aps.iva.id0.b, Integer> fVar = com.amazon.aps.iva.ld0.a.i;
                        com.amazon.aps.iva.yb0.j.e(fVar, "classModuleName");
                        Integer num = (Integer) com.amazon.aps.iva.kd0.e.a(((com.amazon.aps.iva.ce0.d) d).f, fVar);
                        String replaceAll = com.amazon.aps.iva.nd0.g.a.b.matcher((num == null || (str2 = cVar2.getString(num.intValue())) == null) ? MediaTrack.ROLE_MAIN : str2).replaceAll("_");
                        com.amazon.aps.iva.yb0.j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                        str = "$".concat(replaceAll);
                    } else {
                        if (com.amazon.aps.iva.yb0.j.a(n0Var.getVisibility(), com.amazon.aps.iva.oc0.q.a) && (d instanceof com.amazon.aps.iva.oc0.f0)) {
                            com.amazon.aps.iva.ce0.j jVar = ((com.amazon.aps.iva.ce0.n) n0Var).G;
                            if (jVar instanceof com.amazon.aps.iva.gd0.o) {
                                com.amazon.aps.iva.gd0.o oVar = (com.amazon.aps.iva.gd0.o) jVar;
                                if (oVar.c != null) {
                                    StringBuilder sb3 = new StringBuilder("$");
                                    String e = oVar.b.e();
                                    com.amazon.aps.iva.yb0.j.e(e, "className.internalName");
                                    sb3.append(com.amazon.aps.iva.nd0.f.h(com.amazon.aps.iva.oe0.q.K0('/', e, e)).b());
                                    str = sb3.toString();
                                }
                            }
                        }
                        str = "";
                    }
                    sb2.append(str);
                    sb2.append("()");
                    sb2.append(b.b);
                    sb = sb2.toString();
                } else {
                    throw new com.amazon.aps.iva.wb0.a("No field signature for property: " + n0Var);
                }
            }
            this.f = sb;
        }

        @Override // com.amazon.aps.iva.ic0.g
        public final String a() {
            return this.f;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes4.dex */
    public static final class d extends g {
        public final f.e a;
        public final f.e b;

        public d(f.e eVar, f.e eVar2) {
            this.a = eVar;
            this.b = eVar2;
        }

        @Override // com.amazon.aps.iva.ic0.g
        public final String a() {
            return this.a.b;
        }
    }

    public abstract String a();
}

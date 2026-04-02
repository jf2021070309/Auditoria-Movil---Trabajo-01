package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.id0.a;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.sd0.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotationDeserializer.kt */
/* loaded from: classes4.dex */
public final class f {
    public final com.amazon.aps.iva.oc0.c0 a;
    public final com.amazon.aps.iva.oc0.e0 b;

    /* compiled from: AnnotationDeserializer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.b.c.EnumC0371c.values().length];
            try {
                iArr[a.b.c.EnumC0371c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.c.EnumC0371c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.c.EnumC0371c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.c.EnumC0371c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.c.EnumC0371c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.c.EnumC0371c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.c.EnumC0371c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.c.EnumC0371c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.b.c.EnumC0371c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.b.c.EnumC0371c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.b.c.EnumC0371c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.b.c.EnumC0371c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.b.c.EnumC0371c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    public f(com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.oc0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.yb0.j.f(e0Var, "notFoundClasses");
        this.a = c0Var;
        this.b = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.amazon.aps.iva.kb0.j] */
    public final com.amazon.aps.iva.pc0.d a(com.amazon.aps.iva.id0.a aVar, com.amazon.aps.iva.kd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.oc0.e c = com.amazon.aps.iva.oc0.u.c(this.a, com.amazon.aps.iva.aq.j.s(cVar, aVar.d), this.b);
        Map map = com.amazon.aps.iva.lb0.a0.b;
        if (aVar.e.size() != 0 && !com.amazon.aps.iva.ge0.k.f(c)) {
            int i = com.amazon.aps.iva.qd0.i.a;
            if (com.amazon.aps.iva.qd0.i.n(c, com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS)) {
                Collection<com.amazon.aps.iva.oc0.d> e = c.e();
                com.amazon.aps.iva.yb0.j.e(e, "annotationClass.constructors");
                com.amazon.aps.iva.oc0.d dVar = (com.amazon.aps.iva.oc0.d) com.amazon.aps.iva.lb0.x.Q0(e);
                if (dVar != null) {
                    List<c1> f = dVar.f();
                    com.amazon.aps.iva.yb0.j.e(f, "constructor.valueParameters");
                    List<c1> list = f;
                    int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(list));
                    if (w < 16) {
                        w = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(w);
                    for (Object obj : list) {
                        linkedHashMap.put(((c1) obj).getName(), obj);
                    }
                    List<a.b> list2 = aVar.e;
                    com.amazon.aps.iva.yb0.j.e(list2, "proto.argumentList");
                    ArrayList arrayList = new ArrayList();
                    for (a.b bVar : list2) {
                        com.amazon.aps.iva.yb0.j.e(bVar, "it");
                        c1 c1Var = (c1) linkedHashMap.get(com.amazon.aps.iva.aq.j.w(cVar, bVar.d));
                        com.amazon.aps.iva.sd0.g<?> gVar = null;
                        if (c1Var != null) {
                            com.amazon.aps.iva.nd0.f w2 = com.amazon.aps.iva.aq.j.w(cVar, bVar.d);
                            com.amazon.aps.iva.ee0.e0 type = c1Var.getType();
                            com.amazon.aps.iva.yb0.j.e(type, "parameter.type");
                            a.b.c cVar2 = bVar.e;
                            com.amazon.aps.iva.yb0.j.e(cVar2, "proto.value");
                            com.amazon.aps.iva.sd0.g<?> c2 = c(type, cVar2, cVar);
                            if (b(c2, type, cVar2)) {
                                gVar = c2;
                            }
                            if (gVar == null) {
                                String str = "Unexpected argument value: actual type " + cVar2.d + " != expected type " + type;
                                com.amazon.aps.iva.yb0.j.f(str, "message");
                                gVar = new k.a(str);
                            }
                            gVar = new com.amazon.aps.iva.kb0.j(w2, gVar);
                        }
                        if (gVar != null) {
                            arrayList.add(gVar);
                        }
                    }
                    map = com.amazon.aps.iva.lb0.i0.Z(arrayList);
                }
            }
        }
        return new com.amazon.aps.iva.pc0.d(c.m(), map, t0.a);
    }

    public final boolean b(com.amazon.aps.iva.sd0.g<?> gVar, com.amazon.aps.iva.ee0.e0 e0Var, a.b.c cVar) {
        int i;
        com.amazon.aps.iva.oc0.e eVar;
        boolean z;
        Collection collection;
        a.b.c.EnumC0371c enumC0371c = cVar.d;
        if (enumC0371c == null) {
            i = -1;
        } else {
            i = a.a[enumC0371c.ordinal()];
        }
        if (i != 10) {
            com.amazon.aps.iva.oc0.c0 c0Var = this.a;
            if (i != 13) {
                return com.amazon.aps.iva.yb0.j.a(gVar.a(c0Var), e0Var);
            }
            if ((gVar instanceof com.amazon.aps.iva.sd0.b) && ((List) ((com.amazon.aps.iva.sd0.b) gVar).a).size() == cVar.l.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.ee0.e0 g = c0Var.j().g(e0Var);
                com.amazon.aps.iva.sd0.b bVar = (com.amazon.aps.iva.sd0.b) gVar;
                com.amazon.aps.iva.yb0.j.f((Collection) bVar.a, "<this>");
                com.amazon.aps.iva.ec0.j jVar = new com.amazon.aps.iva.ec0.j(0, collection.size() - 1);
                if (!(jVar instanceof Collection) || !((Collection) jVar).isEmpty()) {
                    com.amazon.aps.iva.ec0.i it = jVar.iterator();
                    while (it.d) {
                        int b = it.b();
                        a.b.c cVar2 = cVar.l.get(b);
                        com.amazon.aps.iva.yb0.j.e(cVar2, "value.getArrayElement(i)");
                        if (!b((com.amazon.aps.iva.sd0.g) ((List) bVar.a).get(b), g, cVar2)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
        } else {
            com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
            if (k instanceof com.amazon.aps.iva.oc0.e) {
                eVar = (com.amazon.aps.iva.oc0.e) k;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.lc0.k.e;
                if (!com.amazon.aps.iva.lc0.k.c(eVar, o.a.P)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final com.amazon.aps.iva.sd0.g<?> c(com.amazon.aps.iva.ee0.e0 e0Var, a.b.c cVar, com.amazon.aps.iva.kd0.c cVar2) {
        int i;
        com.amazon.aps.iva.sd0.g<?> eVar;
        com.amazon.aps.iva.sd0.g<?> uVar;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(cVar2, "nameResolver");
        boolean c = l1.c(com.amazon.aps.iva.kd0.b.M, cVar.n, "IS_UNSIGNED.get(value.flags)");
        a.b.c.EnumC0371c enumC0371c = cVar.d;
        if (enumC0371c == null) {
            i = -1;
        } else {
            i = a.a[enumC0371c.ordinal()];
        }
        switch (i) {
            case 1:
                byte b = (byte) cVar.e;
                if (c) {
                    return new com.amazon.aps.iva.sd0.z(b);
                }
                return new com.amazon.aps.iva.sd0.d(b);
            case 2:
                eVar = new com.amazon.aps.iva.sd0.e((char) cVar.e);
                break;
            case 3:
                short s = (short) cVar.e;
                if (c) {
                    return new com.amazon.aps.iva.sd0.c0(s);
                }
                return new com.amazon.aps.iva.sd0.w(s);
            case 4:
                int i2 = (int) cVar.e;
                if (c) {
                    return new com.amazon.aps.iva.sd0.a0(i2);
                }
                return new com.amazon.aps.iva.sd0.m(i2);
            case 5:
                long j = cVar.e;
                if (c) {
                    uVar = new com.amazon.aps.iva.sd0.b0(j);
                } else {
                    uVar = new com.amazon.aps.iva.sd0.u(j);
                }
                return uVar;
            case 6:
                eVar = new com.amazon.aps.iva.sd0.l(cVar.f);
                break;
            case 7:
                eVar = new com.amazon.aps.iva.sd0.i(cVar.g);
                break;
            case 8:
                if (cVar.e != 0) {
                    z = true;
                } else {
                    z = false;
                }
                eVar = new com.amazon.aps.iva.sd0.c(z);
                break;
            case 9:
                eVar = new com.amazon.aps.iva.sd0.x(cVar2.getString(cVar.h));
                break;
            case 10:
                eVar = new com.amazon.aps.iva.sd0.t(com.amazon.aps.iva.aq.j.s(cVar2, cVar.i), cVar.m);
                break;
            case 11:
                eVar = new com.amazon.aps.iva.sd0.j(com.amazon.aps.iva.aq.j.s(cVar2, cVar.i), com.amazon.aps.iva.aq.j.w(cVar2, cVar.j));
                break;
            case 12:
                com.amazon.aps.iva.id0.a aVar = cVar.k;
                com.amazon.aps.iva.yb0.j.e(aVar, "value.annotation");
                eVar = new com.amazon.aps.iva.sd0.a(a(aVar, cVar2));
                break;
            case 13:
                List<a.b.c> list = cVar.l;
                com.amazon.aps.iva.yb0.j.e(list, "value.arrayElementList");
                List<a.b.c> list2 = list;
                ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                for (a.b.c cVar3 : list2) {
                    m0 f = this.a.j().f();
                    com.amazon.aps.iva.yb0.j.e(f, "builtIns.anyType");
                    com.amazon.aps.iva.yb0.j.e(cVar3, "it");
                    arrayList.add(c(f, cVar3, cVar2));
                }
                return new com.amazon.aps.iva.sd0.y(arrayList, e0Var);
            default:
                StringBuilder sb = new StringBuilder("Unsupported annotation argument type: ");
                sb.append(cVar.d);
                sb.append(" (expected ");
                sb.append(e0Var);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
        }
        return eVar;
    }
}

package com.amazon.aps.iva.ab;

import android.util.Log;
import android.view.KeyEvent;
import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.f1;
import com.amazon.aps.iva.se0.g1;
import com.amazon.aps.iva.se0.o0;
import com.amazon.aps.iva.se0.w0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.z.o1;
import com.google.android.material.snackbar.ContentViewCallback;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class t implements com.amazon.aps.iva.jb.f, com.amazon.aps.iva.kc.k, com.amazon.aps.iva.gd0.a0, com.amazon.aps.iva.mn.h, ContentViewCallback {
    public static final t b = new t();
    public static final com.amazon.aps.iva.k2.i c = new com.amazon.aps.iva.k2.i(false);
    public static final com.amazon.aps.iva.xe0.s d = new com.amazon.aps.iva.xe0.s("COMPLETING_ALREADY");
    public static final com.amazon.aps.iva.xe0.s e = new com.amazon.aps.iva.xe0.s("COMPLETING_WAITING_CHILDREN");
    public static final com.amazon.aps.iva.xe0.s f = new com.amazon.aps.iva.xe0.s("COMPLETING_RETRY");
    public static final com.amazon.aps.iva.xe0.s g = new com.amazon.aps.iva.xe0.s("TOO_LATE_TO_CANCEL");
    public static final com.amazon.aps.iva.xe0.s h = new com.amazon.aps.iva.xe0.s("SEALED");
    public static final w0 i = new w0(false);
    public static final w0 j = new w0(true);
    public static final com.amazon.aps.iva.xe0.s k = new com.amazon.aps.iva.xe0.s("NO_VALUE");

    public static l0 g(int i2, int i3, com.amazon.aps.iva.ue0.e eVar, int i4) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            eVar = com.amazon.aps.iva.ue0.e.SUSPEND;
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i3 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > 0 || i3 > 0 || eVar == com.amazon.aps.iva.ue0.e.SUSPEND) {
                    z3 = true;
                }
                if (z3) {
                    int i5 = i3 + i2;
                    if (i5 < 0) {
                        i5 = Integer.MAX_VALUE;
                    }
                    return new l0(i2, i5, eVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + eVar).toString());
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("extraBufferCapacity cannot be negative, but was ", i3).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("replay cannot be negative, but was ", i2).toString());
    }

    public static final boolean i(int i2, KeyEvent keyEvent) {
        if (((int) (com.amazon.aps.iva.n1.c.i(keyEvent) >> 32)) == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r1.c == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String k(com.amazon.aps.iva.oc0.e r3, com.amazon.aps.iva.gd0.a0 r4) {
        /*
            java.lang.String r0 = "klass"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            r4.b(r3)
            com.amazon.aps.iva.oc0.k r0 = r3.d()
            java.lang.String r1 = "klass.containingDeclaration"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            com.amazon.aps.iva.nd0.f r1 = r3.getName()
            if (r1 == 0) goto L23
            com.amazon.aps.iva.nd0.f r2 = com.amazon.aps.iva.nd0.h.a
            boolean r2 = r1.c
            if (r2 != 0) goto L23
            goto L25
        L23:
            com.amazon.aps.iva.nd0.f r1 = com.amazon.aps.iva.nd0.h.c
        L25:
            java.lang.String r1 = r1.c()
            java.lang.String r2 = "safeIdentifier(klass.name).identifier"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            boolean r2 = r0 instanceof com.amazon.aps.iva.oc0.f0
            if (r2 == 0) goto L5e
            com.amazon.aps.iva.oc0.f0 r0 = (com.amazon.aps.iva.oc0.f0) r0
            com.amazon.aps.iva.nd0.c r3 = r0.c()
            boolean r4 = r3.d()
            if (r4 == 0) goto L3f
            goto L5d
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.b()
            r0 = 46
            r2 = 47
            java.lang.String r3 = com.amazon.aps.iva.oe0.m.e0(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L5d:
            return r1
        L5e:
            boolean r2 = r0 instanceof com.amazon.aps.iva.oc0.e
            if (r2 == 0) goto L66
            r2 = r0
            com.amazon.aps.iva.oc0.e r2 = (com.amazon.aps.iva.oc0.e) r2
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L85
            r4.f(r2)
            java.lang.String r3 = k(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L85:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab.t.k(com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.gd0.a0):java.lang.String");
    }

    public static final Object l(long j2, com.amazon.aps.iva.ob0.d dVar) {
        o0 o0Var;
        if (j2 <= 0) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        if (j2 < Long.MAX_VALUE) {
            g.b bVar = nVar.f.get(e.a.b);
            if (bVar instanceof o0) {
                o0Var = (o0) bVar;
            } else {
                o0Var = null;
            }
            if (o0Var == null) {
                o0Var = com.amazon.aps.iva.se0.l0.a;
            }
            o0Var.v(j2, nVar);
        }
        Object q = nVar.q();
        if (q == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public static final boolean m(int i2, int i3) {
        if (i2 == i3) {
            return true;
        }
        return false;
    }

    public static final com.amazon.aps.iva.fc0.d n(Annotation annotation) {
        com.amazon.aps.iva.yb0.j.f(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        com.amazon.aps.iva.yb0.j.e(annotationType, "this as java.lang.annota…otation).annotationType()");
        com.amazon.aps.iva.fc0.d a = com.amazon.aps.iva.yb0.e0.a(annotationType);
        com.amazon.aps.iva.yb0.j.d(a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a;
    }

    public static final Class o(com.amazon.aps.iva.fc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        Class<?> h2 = ((com.amazon.aps.iva.yb0.c) dVar).h();
        com.amazon.aps.iva.yb0.j.d(h2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return h2;
    }

    public static final Class p(com.amazon.aps.iva.fc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        Class<?> h2 = ((com.amazon.aps.iva.yb0.c) dVar).h();
        if (!h2.isPrimitive()) {
            return h2;
        }
        String name = h2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return h2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return h2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return h2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return h2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return h2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return h2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return h2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return h2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return h2;
            default:
                return h2;
        }
    }

    public static final Class q(com.amazon.aps.iva.fc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        Class<?> h2 = ((com.amazon.aps.iva.yb0.c) dVar).h();
        if (h2.isPrimitive()) {
            return h2;
        }
        String name = h2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final com.amazon.aps.iva.z.p r(o1 o1Var, long j2, com.amazon.aps.iva.z.p pVar, com.amazon.aps.iva.z.p pVar2, com.amazon.aps.iva.z.p pVar3) {
        com.amazon.aps.iva.yb0.j.f(o1Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(pVar, "start");
        com.amazon.aps.iva.yb0.j.f(pVar2, "end");
        com.amazon.aps.iva.yb0.j.f(pVar3, "startVelocity");
        return o1Var.e(j2 * 1000000, pVar, pVar2, pVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
        if (r8 != false) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Type inference failed for: r5v33, types: [com.amazon.aps.iva.gd0.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(com.amazon.aps.iva.ee0.e0 r21, com.amazon.aps.iva.gd0.b0 r22, com.amazon.aps.iva.xb0.q r23) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab.t.s(com.amazon.aps.iva.ee0.e0, com.amazon.aps.iva.gd0.b0, com.amazon.aps.iva.xb0.q):java.lang.Object");
    }

    public static final Object t(Object obj, com.amazon.aps.iva.xe0.h hVar) {
        if (obj == null) {
            return hVar;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(hVar);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(hVar);
        return arrayList;
    }

    public static final Object u(com.amazon.aps.iva.xe0.p pVar, com.amazon.aps.iva.xe0.p pVar2, com.amazon.aps.iva.xb0.p pVar3) {
        Object wVar;
        Object h0;
        try {
            h0.e(2, pVar3);
            wVar = pVar3.invoke(pVar2, pVar);
        } catch (Throwable th) {
            wVar = new com.amazon.aps.iva.se0.w(th, false);
        }
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (wVar != aVar && (h0 = pVar.h0(wVar)) != e) {
            if (!(h0 instanceof com.amazon.aps.iva.se0.w)) {
                return w(h0);
            }
            throw ((com.amazon.aps.iva.se0.w) h0).a;
        }
        return aVar;
    }

    public static String v(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Text";
        }
        if (i2 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Ascii";
        }
        if (i2 == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Number";
        }
        if (i2 == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "Phone";
        }
        if (i2 == 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return "Uri";
        }
        if (i2 == 6) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return "Email";
        }
        if (i2 == 7) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return "Password";
        }
        if (i2 == 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return "NumberPassword";
        }
        if (i2 == 9) {
            z9 = true;
        }
        if (z9) {
            return "Decimal";
        }
        return "Invalid";
    }

    public static final Object w(Object obj) {
        g1 g1Var;
        f1 f1Var;
        if (obj instanceof g1) {
            g1Var = (g1) obj;
        } else {
            g1Var = null;
        }
        if (g1Var != null && (f1Var = g1Var.a) != null) {
            return f1Var;
        }
        return obj;
    }

    @Override // com.amazon.aps.iva.mn.h
    public void a(com.amazon.aps.iva.mn.o oVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "sorting");
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
    }

    @Override // com.amazon.aps.iva.gd0.a0
    public void b(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "classDescriptor");
    }

    @Override // com.amazon.aps.iva.kc.d
    public boolean c(Object obj, File file, com.amazon.aps.iva.kc.h hVar) {
        try {
            com.amazon.aps.iva.hd.a.d(((com.amazon.aps.iva.yc.c) ((com.amazon.aps.iva.nc.w) obj).get()).b.a.a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    @Override // com.amazon.aps.iva.kc.k
    public com.amazon.aps.iva.kc.c d(com.amazon.aps.iva.kc.h hVar) {
        return com.amazon.aps.iva.kc.c.SOURCE;
    }

    @Override // com.amazon.aps.iva.mn.h
    public void e(com.amazon.aps.iva.mn.e eVar, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "filters");
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
    }

    @Override // com.amazon.aps.iva.jb.f
    public boolean h(com.amazon.aps.iva.ib.a aVar) {
        if (aVar.e - aVar.b < aVar.b() && aVar.e < aVar.c()) {
            return true;
        }
        return false;
    }

    public com.amazon.aps.iva.ee0.e0 j(LinkedHashSet linkedHashSet) {
        com.amazon.aps.iva.yb0.j.f(linkedHashSet, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(com.amazon.aps.iva.lb0.x.B0(linkedHashSet, null, null, null, null, 63)));
    }

    @Override // com.amazon.aps.iva.gd0.a0
    public void f(com.amazon.aps.iva.oc0.e eVar) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i2, int i3) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i2, int i3) {
    }
}

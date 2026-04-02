package com.amazon.aps.iva.dg;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.t1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.y;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oe0.l;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.se0.b0;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.h0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.s1;
import com.amazon.aps.iva.ue0.e;
import com.amazon.aps.iva.ue0.f;
import com.amazon.aps.iva.ue0.m;
import com.amazon.aps.iva.ue0.n;
import com.amazon.aps.iva.ue0.u;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.j;
import com.amazon.aps.iva.ve0.k;
import com.amazon.aps.iva.ve0.p0;
import com.amazon.aps.iva.ve0.q0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.x0.f;
import com.amazon.aps.iva.x0.k;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xe0.t;
import com.crunchyroll.crunchyroid.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: DeepLinkUri.kt */
/* loaded from: classes.dex */
public class b implements com.amazon.aps.iva.gq.c {
    public static final void A(g0 g0Var, a0 a0Var) {
        i.d(g0Var, null, null, new j(a0Var, null), 3);
    }

    public static final String B(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        com.amazon.aps.iva.yb0.j.e(stringWriter2, "stringWriter.toString()");
        return stringWriter2;
    }

    public static final m0 C(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        u1 L0 = e0Var.L0();
        if (L0 instanceof y) {
            return ((y) L0).c;
        }
        if (L0 instanceof m0) {
            return (m0) L0;
        }
        throw new h();
    }

    public static final f D(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(15454635);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        f fVar = (f) i.A(new Object[0], f.d, com.amazon.aps.iva.x0.h.h, iVar, 4);
        fVar.c = (com.amazon.aps.iva.x0.i) iVar.i(k.a);
        iVar.G();
        return fVar;
    }

    public static final byte[] E(com.amazon.aps.iva.sp.h hVar, Object obj, com.amazon.aps.iva.iq.a aVar) {
        String serialize;
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(obj, "model");
        com.amazon.aps.iva.yb0.j.f(aVar, "internalLogger");
        try {
            serialize = hVar.serialize(obj);
        } catch (Throwable th) {
            String format = String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            com.amazon.aps.iva.yb0.j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, th, 4);
        }
        if (serialize != null) {
            byte[] bytes = serialize.getBytes(com.amazon.aps.iva.oe0.a.b);
            com.amazon.aps.iva.yb0.j.e(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        return null;
    }

    public static final i0 F(com.amazon.aps.iva.ve0.f fVar, g0 g0Var, q0 q0Var, Object obj) {
        p0 p0Var;
        h0 h0Var;
        c2 c2Var;
        com.amazon.aps.iva.we0.f fVar2;
        com.amazon.aps.iva.ve0.f h;
        com.amazon.aps.iva.ue0.f.p0.getClass();
        f.a aVar = f.a.a;
        if ((fVar instanceof com.amazon.aps.iva.we0.f) && (h = (fVar2 = (com.amazon.aps.iva.we0.f) fVar).h()) != null) {
            int i = fVar2.c;
            if (i == -3 || i == -2 || i == 0) {
                e eVar = e.SUSPEND;
                e eVar2 = fVar2.d;
            }
            p0Var = new p0(fVar2.b, h);
        } else {
            e eVar3 = e.SUSPEND;
            p0Var = new p0(com.amazon.aps.iva.ob0.h.b, fVar);
        }
        v0 e = x.e(obj);
        com.amazon.aps.iva.ve0.f<T> fVar3 = p0Var.a;
        if (com.amazon.aps.iva.yb0.j.a(q0Var, q0.a.a)) {
            h0Var = h0.DEFAULT;
        } else {
            h0Var = h0.UNDISPATCHED;
        }
        h0 h0Var2 = h0Var;
        com.amazon.aps.iva.ve0.y yVar = new com.amazon.aps.iva.ve0.y(q0Var, fVar3, e, obj, null);
        g b = b0.b(g0Var, p0Var.b);
        if (h0Var2.isLazy()) {
            c2Var = new s1(b, yVar);
        } else {
            c2Var = new c2(b, true);
        }
        h0Var2.invoke(yVar, c2Var, c2Var);
        return new i0(e, c2Var);
    }

    public static final long G(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        int i = t.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long X = l.X(str2);
            if (X != null) {
                long longValue = X.longValue();
                if (j2 <= longValue && longValue <= j3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j;
    }

    public static int H(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) G(str, i, i2, i3);
    }

    public static final com.amazon.aps.iva.ik.f I(com.amazon.aps.iva.rl.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        if (aVar.d()) {
            return new com.amazon.aps.iva.ik.a(0);
        }
        return new com.amazon.aps.iva.ik.b(aVar.c(), aVar.b(), aVar.a());
    }

    public static final m0 J(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        u1 L0 = e0Var.L0();
        if (L0 instanceof y) {
            return ((y) L0).d;
        }
        if (L0 instanceof m0) {
            return (m0) L0;
        }
        throw new h();
    }

    public static final u1 K(u1 u1Var, com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(u1Var, "<this>");
        if (u1Var instanceof t1) {
            return K(((t1) u1Var).E0(), e0Var);
        }
        if (e0Var != null && !com.amazon.aps.iva.yb0.j.a(e0Var, u1Var)) {
            if (u1Var instanceof m0) {
                return new com.amazon.aps.iva.ee0.p0((m0) u1Var, e0Var);
            }
            if (u1Var instanceof y) {
                return new com.amazon.aps.iva.ee0.a0((y) u1Var, e0Var);
            }
            throw new h();
        }
        return u1Var;
    }

    public static com.amazon.aps.iva.ue0.a c(int i, e eVar, int i2) {
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        int i3 = 1;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i == 1 && eVar == e.DROP_OLDEST) {
                            return new m(null);
                        }
                        return new com.amazon.aps.iva.ue0.d(i, eVar, null);
                    }
                    return new n(null);
                } else if (eVar == e.SUSPEND) {
                    return new u(null);
                } else {
                    return new com.amazon.aps.iva.ue0.d(1, eVar, null);
                }
            }
            if (eVar == e.SUSPEND) {
                z = true;
            }
            if (z) {
                return new m(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (eVar == e.SUSPEND) {
            com.amazon.aps.iva.ue0.f.p0.getClass();
            i3 = f.a.b;
        }
        return new com.amazon.aps.iva.ue0.d(i3, eVar, null);
    }

    public static final com.amazon.aps.iva.e1.f d(com.amazon.aps.iva.e1.e eVar, long j, long j2, long j3, long j4) {
        return new com.amazon.aps.iva.e1.f(eVar.a, eVar.b, eVar.c, eVar.d, j, j2, j3, j4);
    }

    public static final com.amazon.aps.iva.e1.f e(float f, float f2, float f3, float f4, long j) {
        long f5 = i.f(com.amazon.aps.iva.e1.a.b(j), com.amazon.aps.iva.e1.a.c(j));
        return new com.amazon.aps.iva.e1.f(f, f2, f3, f4, f5, f5, f5, f5);
    }

    public static final com.amazon.aps.iva.k.c f(Context context) {
        if (context instanceof com.amazon.aps.iva.k.c) {
            return (com.amazon.aps.iva.k.c) context;
        }
        if (context instanceof ContextWrapper) {
            return f(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final y g(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        u1 L0 = e0Var.L0();
        com.amazon.aps.iva.yb0.j.d(L0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (y) L0;
    }

    public static final i0 h(v0 v0Var) {
        return new i0(v0Var, null);
    }

    public static com.amazon.aps.iva.ve0.f i(com.amazon.aps.iva.we0.f fVar, int i) {
        boolean z;
        e eVar = e.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i == -1) {
                eVar = e.DROP_OLDEST;
                i = 0;
            }
            g gVar = fVar.b;
            com.amazon.aps.iva.yb0.j.f(gVar, "context");
            e eVar2 = e.SUSPEND;
            e eVar3 = fVar.d;
            int i2 = fVar.c;
            if (eVar == eVar2) {
                if (i2 != -3) {
                    if (i != -3) {
                        if (i2 != -2) {
                            if (i != -2) {
                                i += i2;
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                        }
                    }
                    i = i2;
                }
                eVar = eVar3;
            }
            if (!com.amazon.aps.iva.yb0.j.a(gVar, gVar) || i != i2 || eVar != eVar3) {
                return fVar.e(gVar, i, eVar);
            }
            return fVar;
        }
        throw new IllegalArgumentException(c0.a("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
    }

    public static final void j(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        com.amazon.aps.iva.p3.m0 m0Var = new com.amazon.aps.iva.p3.m0(view, null);
        com.amazon.aps.iva.ne0.i iVar = new com.amazon.aps.iva.ne0.i();
        iVar.e = com.amazon.aps.iva.a60.b.o(m0Var, iVar, iVar);
        while (iVar.hasNext()) {
            ArrayList<com.amazon.aps.iva.v3.a> arrayList = v((View) iVar.next()).a;
            for (int B = f1.B(arrayList); -1 < B; B--) {
                arrayList.get(B).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable k(com.amazon.aps.iva.ob0.d r4, com.amazon.aps.iva.ve0.f r5, com.amazon.aps.iva.ve0.g r6) {
        /*
            boolean r0 = r4 instanceof com.amazon.aps.iva.ve0.m
            if (r0 == 0) goto L13
            r0 = r4
            com.amazon.aps.iva.ve0.m r0 = (com.amazon.aps.iva.ve0.m) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.m r0 = new com.amazon.aps.iva.ve0.m
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.yb0.d0 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            com.amazon.aps.iva.ab.x.i0(r4)
            com.amazon.aps.iva.yb0.d0 r4 = new com.amazon.aps.iva.yb0.d0
            r4.<init>()
            com.amazon.aps.iva.ve0.n r2 = new com.amazon.aps.iva.ve0.n     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.h = r4     // Catch: java.lang.Throwable -> L4e
            r0.j = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.c(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L8b
        L4c:
            r1 = 0
            goto L8b
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            T r4 = r5.b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L60
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r4, r1)
            if (r6 == 0) goto L60
            r6 = r3
            goto L61
        L60:
            r6 = r5
        L61:
            if (r6 != 0) goto L98
            com.amazon.aps.iva.ob0.g r6 = r0.getContext()
            com.amazon.aps.iva.se0.j1$b r0 = com.amazon.aps.iva.se0.j1.b.b
            com.amazon.aps.iva.ob0.g$b r6 = r6.get(r0)
            com.amazon.aps.iva.se0.j1 r6 = (com.amazon.aps.iva.se0.j1) r6
            if (r6 == 0) goto L87
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L78
            goto L87
        L78:
            java.util.concurrent.CancellationException r6 = r6.p()
            if (r6 == 0) goto L85
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r1)
            if (r6 == 0) goto L85
            goto L86
        L85:
            r3 = r5
        L86:
            r5 = r3
        L87:
            if (r5 != 0) goto L98
            if (r4 != 0) goto L8c
        L8b:
            return r1
        L8c:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L94
            com.amazon.aps.iva.aq.k.f(r4, r1)
            throw r4
        L94:
            com.amazon.aps.iva.aq.k.f(r1, r4)
            throw r1
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dg.b.k(com.amazon.aps.iva.ob0.d, com.amazon.aps.iva.ve0.f, com.amazon.aps.iva.ve0.g):java.io.Serializable");
    }

    public static final ArrayList l(ArrayList arrayList, Collection collection, com.amazon.aps.iva.oc0.a aVar) {
        com.amazon.aps.iva.ee0.e0 e0Var;
        com.amazon.aps.iva.yb0.j.f(collection, "oldValueParameters");
        com.amazon.aps.iva.yb0.j.f(aVar, "newOwner");
        arrayList.size();
        collection.size();
        ArrayList e1 = com.amazon.aps.iva.lb0.x.e1(arrayList, collection);
        ArrayList arrayList2 = new ArrayList(r.Y(e1));
        Iterator it = e1.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it.next();
            com.amazon.aps.iva.ee0.e0 e0Var2 = (com.amazon.aps.iva.ee0.e0) jVar.b;
            c1 c1Var = (c1) jVar.c;
            int index = c1Var.getIndex();
            com.amazon.aps.iva.pc0.h annotations = c1Var.getAnnotations();
            com.amazon.aps.iva.nd0.f name = c1Var.getName();
            com.amazon.aps.iva.yb0.j.e(name, "oldParameter.name");
            boolean w0 = c1Var.w0();
            boolean l0 = c1Var.l0();
            boolean k0 = c1Var.k0();
            if (c1Var.p0() != null) {
                e0Var = com.amazon.aps.iva.ud0.b.j(aVar).j().g(e0Var2);
            } else {
                e0Var = null;
            }
            t0 g = c1Var.g();
            com.amazon.aps.iva.yb0.j.e(g, "oldParameter.source");
            arrayList2.add(new com.amazon.aps.iva.rc0.v0(aVar, null, index, annotations, name, e0Var2, w0, l0, k0, e0Var, g));
        }
        return arrayList2;
    }

    public static final com.amazon.aps.iva.ve0.f m(com.amazon.aps.iva.ve0.f fVar) {
        k.b bVar = com.amazon.aps.iva.ve0.k.a;
        if (!(fVar instanceof u0)) {
            k.a aVar = com.amazon.aps.iva.ve0.k.b;
            if (fVar instanceof com.amazon.aps.iva.ve0.d) {
                com.amazon.aps.iva.ve0.d dVar = (com.amazon.aps.iva.ve0.d) fVar;
                if (dVar.c == com.amazon.aps.iva.ve0.k.a && dVar.d == aVar) {
                    return fVar;
                }
            }
            return new com.amazon.aps.iva.ve0.d(fVar, aVar);
        }
        return fVar;
    }

    public static final com.amazon.aps.iva.ve0.f n(com.amazon.aps.iva.ve0.f fVar, p pVar) {
        k.b bVar = com.amazon.aps.iva.ve0.k.a;
        com.amazon.aps.iva.yb0.h0.e(2, pVar);
        if (fVar instanceof com.amazon.aps.iva.ve0.d) {
            com.amazon.aps.iva.ve0.d dVar = (com.amazon.aps.iva.ve0.d) fVar;
            if (dVar.c == com.amazon.aps.iva.ve0.k.a && dVar.d == pVar) {
                return fVar;
            }
        }
        return new com.amazon.aps.iva.ve0.d(fVar, pVar);
    }

    public static final com.amazon.aps.iva.rb0.b o(Enum[] enumArr) {
        com.amazon.aps.iva.yb0.j.f(enumArr, "entries");
        return new com.amazon.aps.iva.rb0.b(enumArr);
    }

    public static final Throwable p(Throwable th, com.amazon.aps.iva.fc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(th, "<this>");
        com.amazon.aps.iva.yb0.j.f(dVar, "type");
        if (com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.yb0.e0.a(th.getClass()), dVar)) {
            return th;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return p(cause, dVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.amazon.aps.iva.xe0.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.amazon.aps.iva.ve0.f r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            boolean r0 = r6 instanceof com.amazon.aps.iva.ve0.u
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ve0.u r0 = (com.amazon.aps.iva.ve0.u) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.u r0 = new com.amazon.aps.iva.ve0.u
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            com.amazon.aps.iva.xe0.s r3 = com.amazon.aps.iva.gr.n.d
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.amazon.aps.iva.ve0.s r5 = r0.i
            com.amazon.aps.iva.yb0.d0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: com.amazon.aps.iva.we0.a -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.yb0.d0 r6 = new com.amazon.aps.iva.yb0.d0
            r6.<init>()
            r6.b = r3
            com.amazon.aps.iva.ve0.s r2 = new com.amazon.aps.iva.ve0.s
            r2.<init>(r6)
            r0.h = r6     // Catch: com.amazon.aps.iva.we0.a -> L55
            r0.i = r2     // Catch: com.amazon.aps.iva.we0.a -> L55
            r0.k = r4     // Catch: com.amazon.aps.iva.we0.a -> L55
            java.lang.Object r5 = r5.c(r2, r0)     // Catch: com.amazon.aps.iva.we0.a -> L55
            if (r5 != r1) goto L53
            goto L61
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            com.amazon.aps.iva.ve0.g<?> r1 = r6.b
            if (r1 != r5) goto L6a
        L5d:
            T r1 = r0.b
            if (r1 == r3) goto L62
        L61:
            return r1
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dg.b.q(com.amazon.aps.iva.ve0.f, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r6.c(r2, r0) == r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.amazon.aps.iva.xe0.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(com.amazon.aps.iva.ve0.f r6, com.amazon.aps.iva.xb0.p r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.ve0.v
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.ve0.v r0 = (com.amazon.aps.iva.ve0.v) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.v r0 = new com.amazon.aps.iva.ve0.v
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            com.amazon.aps.iva.xe0.s r3 = com.amazon.aps.iva.gr.n.d
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            com.amazon.aps.iva.ve0.t r6 = r0.j
            com.amazon.aps.iva.yb0.d0 r7 = r0.i
            com.amazon.aps.iva.xb0.p r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: com.amazon.aps.iva.we0.a -> L2f
            goto L64
        L2f:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L5e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.yb0.d0 r8 = new com.amazon.aps.iva.yb0.d0
            r8.<init>()
            r8.b = r3
            com.amazon.aps.iva.ve0.t r2 = new com.amazon.aps.iva.ve0.t
            r2.<init>(r7, r8)
            r0.h = r7     // Catch: com.amazon.aps.iva.we0.a -> L5b
            r0.i = r8     // Catch: com.amazon.aps.iva.we0.a -> L5b
            r0.j = r2     // Catch: com.amazon.aps.iva.we0.a -> L5b
            r0.l = r4     // Catch: com.amazon.aps.iva.we0.a -> L5b
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: com.amazon.aps.iva.we0.a -> L5b
            if (r6 != r1) goto L62
            goto L68
        L5b:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L5e:
            com.amazon.aps.iva.ve0.g<?> r1 = r0.b
            if (r1 != r6) goto L7d
        L62:
            r0 = r7
            r7 = r8
        L64:
            T r1 = r7.b
            if (r1 == r3) goto L69
        L68:
            return r1
        L69:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dg.b.r(com.amazon.aps.iva.ve0.f, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(com.amazon.aps.iva.ve0.f r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            boolean r0 = r5 instanceof com.amazon.aps.iva.ve0.x
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.ve0.x r0 = (com.amazon.aps.iva.ve0.x) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.x r0 = new com.amazon.aps.iva.ve0.x
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.ve0.w r4 = r0.i
            com.amazon.aps.iva.yb0.d0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: com.amazon.aps.iva.we0.a -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.yb0.d0 r5 = new com.amazon.aps.iva.yb0.d0
            r5.<init>()
            com.amazon.aps.iva.ve0.w r2 = new com.amazon.aps.iva.ve0.w
            r2.<init>(r5)
            r0.h = r5     // Catch: com.amazon.aps.iva.we0.a -> L51
            r0.i = r2     // Catch: com.amazon.aps.iva.we0.a -> L51
            r0.k = r3     // Catch: com.amazon.aps.iva.we0.a -> L51
            java.lang.Object r4 = r4.c(r2, r0)     // Catch: com.amazon.aps.iva.we0.a -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r0 = r5
            goto L59
        L51:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L55:
            com.amazon.aps.iva.ve0.g<?> r1 = r5.b
            if (r1 != r4) goto L5c
        L59:
            T r1 = r0.b
        L5b:
            return r1
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dg.b.s(com.amazon.aps.iva.ve0.f, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final com.amazon.aps.iva.ee0.e0 t(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        if (e0Var instanceof t1) {
            return ((t1) e0Var).d0();
        }
        return null;
    }

    public static final com.amazon.aps.iva.bd0.x u(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.bd0.x xVar;
        com.amazon.aps.iva.oc0.e eVar2;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        int i = com.amazon.aps.iva.ud0.b.a;
        Iterator<com.amazon.aps.iva.ee0.e0> it = eVar.m().I0().g().iterator();
        while (true) {
            xVar = null;
            if (it.hasNext()) {
                com.amazon.aps.iva.ee0.e0 next = it.next();
                if (!com.amazon.aps.iva.lc0.k.y(next)) {
                    com.amazon.aps.iva.oc0.h k = next.I0().k();
                    int i2 = com.amazon.aps.iva.qd0.i.a;
                    if (!com.amazon.aps.iva.qd0.i.n(k, com.amazon.aps.iva.oc0.f.CLASS) && !com.amazon.aps.iva.qd0.i.n(k, com.amazon.aps.iva.oc0.f.ENUM_CLASS)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        com.amazon.aps.iva.yb0.j.d(k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        eVar2 = (com.amazon.aps.iva.oc0.e) k;
                        break;
                    }
                }
            } else {
                eVar2 = null;
                break;
            }
        }
        if (eVar2 == null) {
            return null;
        }
        com.amazon.aps.iva.xd0.i h0 = eVar2.h0();
        if (h0 instanceof com.amazon.aps.iva.bd0.x) {
            xVar = (com.amazon.aps.iva.bd0.x) h0;
        }
        if (xVar == null) {
            return u(eVar2);
        }
        return xVar;
    }

    public static final com.amazon.aps.iva.v3.b v(View view) {
        com.amazon.aps.iva.v3.b bVar = (com.amazon.aps.iva.v3.b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bVar == null) {
            com.amazon.aps.iva.v3.b bVar2 = new com.amazon.aps.iva.v3.b();
            view.setTag(R.id.pooling_container_listener_holder_tag, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static final u1 w(u1 u1Var, com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(u1Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(e0Var, "origin");
        return K(u1Var, t(e0Var));
    }

    public static final boolean x(com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        return e0Var.L0() instanceof y;
    }

    public static final boolean y(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.nd0.b bVar;
        LinkedHashSet linkedHashSet = com.amazon.aps.iva.lc0.c.a;
        if (com.amazon.aps.iva.qd0.i.l(eVar)) {
            LinkedHashSet linkedHashSet2 = com.amazon.aps.iva.lc0.c.a;
            com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.ud0.b.f(eVar);
            if (f != null) {
                bVar = f.g();
            } else {
                bVar = null;
            }
            if (com.amazon.aps.iva.lb0.x.m0(linkedHashSet2, bVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean z(com.amazon.aps.iva.e1.f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        long j = fVar.e;
        if (com.amazon.aps.iva.e1.a.b(j) == com.amazon.aps.iva.e1.a.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float b = com.amazon.aps.iva.e1.a.b(j);
            long j2 = fVar.f;
            if (b == com.amazon.aps.iva.e1.a.b(j2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (com.amazon.aps.iva.e1.a.b(j) == com.amazon.aps.iva.e1.a.c(j2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    float b2 = com.amazon.aps.iva.e1.a.b(j);
                    long j3 = fVar.g;
                    if (b2 == com.amazon.aps.iva.e1.a.b(j3)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (com.amazon.aps.iva.e1.a.b(j) == com.amazon.aps.iva.e1.a.c(j3)) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            float b3 = com.amazon.aps.iva.e1.a.b(j);
                            long j4 = fVar.h;
                            if (b3 == com.amazon.aps.iva.e1.a.b(j4)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (com.amazon.aps.iva.e1.a.b(j) == com.amazon.aps.iva.e1.a.c(j4)) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.gq.a
    public com.amazon.aps.iva.qr.a a(com.amazon.aps.iva.qr.a aVar) {
        com.amazon.aps.iva.qr.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "event");
        return aVar2;
    }

    @Override // com.amazon.aps.iva.gq.c
    public com.amazon.aps.iva.qr.a b(com.amazon.aps.iva.qr.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "event");
        return aVar;
    }
}

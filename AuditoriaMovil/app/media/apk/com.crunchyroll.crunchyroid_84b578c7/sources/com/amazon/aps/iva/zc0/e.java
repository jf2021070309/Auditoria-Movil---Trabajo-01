package com.amazon.aps.iva.zc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.rc0.p0;
import com.amazon.aps.iva.rc0.x;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
/* compiled from: JavaMethodDescriptor.java */
/* loaded from: classes4.dex */
public final class e extends p0 implements com.amazon.aps.iva.zc0.a {
    public static final a H = new a();
    public static final b I = new b();
    public c F;
    public final boolean G;

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes4.dex */
    public static class a implements a.InterfaceC0568a<c1> {
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes4.dex */
    public static class b implements a.InterfaceC0568a<Boolean> {
    }

    /* compiled from: JavaMethodDescriptor.java */
    /* loaded from: classes4.dex */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        c(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static c get(boolean z, boolean z2) {
            c cVar;
            if (z) {
                if (z2) {
                    cVar = STABLE_SYNTHESIZED;
                } else {
                    cVar = STABLE_DECLARED;
                }
            } else if (z2) {
                cVar = NON_STABLE_SYNTHESIZED;
            } else {
                cVar = NON_STABLE_DECLARED;
            }
            if (cVar == null) {
                $$$reportNull$$$0(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, s0 s0Var, h hVar, com.amazon.aps.iva.nd0.f fVar, b.a aVar, t0 t0Var, boolean z) {
        super(kVar, s0Var, hVar, fVar, aVar, t0Var);
        if (kVar != null) {
            if (hVar != null) {
                if (fVar != null) {
                    if (aVar != null) {
                        if (t0Var != null) {
                            this.F = null;
                            this.G = z;
                            return;
                        }
                        d0(4);
                        throw null;
                    }
                    d0(3);
                    throw null;
                }
                d0(2);
                throw null;
            }
            d0(1);
            throw null;
        }
        d0(0);
        throw null;
    }

    public static e U0(k kVar, com.amazon.aps.iva.ad0.e eVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.dd0.a aVar, boolean z) {
        if (kVar != null) {
            if (fVar != null) {
                if (aVar != null) {
                    return new e(kVar, null, eVar, fVar, b.a.DECLARATION, aVar, z);
                }
                d0(8);
                throw null;
            }
            d0(7);
            throw null;
        }
        d0(5);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 13 && i != 18 && i != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 13 && i != 18 && i != 21) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i != 13) {
            if (i != 18) {
                if (i != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 13 || i == 18 || i == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x
    public final x G0(b.a aVar, k kVar, v vVar, t0 t0Var, h hVar, com.amazon.aps.iva.nd0.f fVar) {
        if (kVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    s0 s0Var = (s0) vVar;
                    if (fVar == null) {
                        fVar = getName();
                    }
                    e eVar = new e(kVar, s0Var, hVar, fVar, aVar, t0Var, this.G);
                    c cVar = this.F;
                    eVar.F = c.get(cVar.isStable, cVar.isSynthesized);
                    return eVar;
                }
                d0(16);
                throw null;
            }
            d0(15);
            throw null;
        }
        d0(14);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r5.b(r6) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.rc0.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.rc0.p0 T0(com.amazon.aps.iva.rc0.o0 r2, com.amazon.aps.iva.oc0.q0 r3, java.util.List r4, java.util.List r5, java.util.List r6, com.amazon.aps.iva.ee0.e0 r7, com.amazon.aps.iva.oc0.b0 r8, com.amazon.aps.iva.oc0.r r9, java.util.Map r10) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto La4
            if (r5 == 0) goto L9e
            if (r6 == 0) goto L98
            if (r9 == 0) goto L92
            super.T0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.amazon.aps.iva.ke0.s r2 = com.amazon.aps.iva.ke0.s.a
            r2.getClass()
            java.util.List<com.amazon.aps.iva.ke0.k> r2 = com.amazon.aps.iva.ke0.s.b
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r2.next()
            com.amazon.aps.iva.ke0.k r3 = (com.amazon.aps.iva.ke0.k) r3
            r3.getClass()
            r4 = 0
            com.amazon.aps.iva.nd0.f r5 = r3.a
            if (r5 == 0) goto L36
            com.amazon.aps.iva.nd0.f r6 = r1.getName()
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r6, r5)
            if (r5 != 0) goto L36
            goto L5c
        L36:
            com.amazon.aps.iva.oe0.f r5 = r3.b
            if (r5 == 0) goto L4e
            com.amazon.aps.iva.nd0.f r6 = r1.getName()
            java.lang.String r6 = r6.b()
            java.lang.String r7 = "functionDescriptor.name.asString()"
            com.amazon.aps.iva.yb0.j.e(r6, r7)
            boolean r5 = r5.b(r6)
            if (r5 != 0) goto L4e
            goto L5c
        L4e:
            java.util.Collection<com.amazon.aps.iva.nd0.f> r5 = r3.c
            if (r5 == 0) goto L5e
            com.amazon.aps.iva.nd0.f r6 = r1.getName()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L5e
        L5c:
            r5 = r4
            goto L5f
        L5e:
            r5 = 1
        L5f:
            if (r5 == 0) goto L17
            com.amazon.aps.iva.ke0.f[] r2 = r3.e
            int r5 = r2.length
        L64:
            if (r4 >= r5) goto L77
            r6 = r2[r4]
            java.lang.String r6 = r6.a(r1)
            if (r6 == 0) goto L74
            com.amazon.aps.iva.ke0.g$b r2 = new com.amazon.aps.iva.ke0.g$b
            r2.<init>(r6)
            goto L8d
        L74:
            int r4 = r4 + 1
            goto L64
        L77:
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.v, java.lang.String> r2 = r3.d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L88
            com.amazon.aps.iva.ke0.g$b r3 = new com.amazon.aps.iva.ke0.g$b
            r3.<init>(r2)
            r2 = r3
            goto L8d
        L88:
            com.amazon.aps.iva.ke0.g$c r2 = com.amazon.aps.iva.ke0.g.c.b
            goto L8d
        L8b:
            com.amazon.aps.iva.ke0.g$a r2 = com.amazon.aps.iva.ke0.g.a.b
        L8d:
            boolean r2 = r2.a
            r1.n = r2
            return r1
        L92:
            r2 = 12
            d0(r2)
            throw r0
        L98:
            r2 = 11
            d0(r2)
            throw r0
        L9e:
            r2 = 10
            d0(r2)
            throw r0
        La4:
            r2 = 9
            d0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zc0.e.T0(com.amazon.aps.iva.rc0.o0, com.amazon.aps.iva.oc0.q0, java.util.List, java.util.List, java.util.List, com.amazon.aps.iva.ee0.e0, com.amazon.aps.iva.oc0.b0, com.amazon.aps.iva.oc0.r, java.util.Map):com.amazon.aps.iva.rc0.p0");
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return this.F.isSynthesized;
    }

    @Override // com.amazon.aps.iva.zc0.a
    public final com.amazon.aps.iva.zc0.a n0(e0 e0Var, ArrayList arrayList, e0 e0Var2, j jVar) {
        o0 h;
        ArrayList l = com.amazon.aps.iva.dg.b.l(arrayList, f(), this);
        if (e0Var == null) {
            h = null;
        } else {
            h = com.amazon.aps.iva.qd0.h.h(this, e0Var, h.a.a);
        }
        x.a aVar = (x.a) C0();
        aVar.g = l;
        aVar.j(e0Var2);
        aVar.i = h;
        aVar.p = true;
        aVar.o = true;
        e eVar = (e) aVar.build();
        if (jVar != null) {
            eVar.L0((a.InterfaceC0568a) jVar.b, jVar.c);
        }
        if (eVar != null) {
            return eVar;
        }
        d0(21);
        throw null;
    }
}

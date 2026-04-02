package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.y0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes4.dex */
public abstract class k extends q implements y0 {
    public final v1 f;
    public final boolean g;
    public final int h;
    public final com.amazon.aps.iva.de0.i<c1> i;
    public final com.amazon.aps.iva.de0.i<com.amazon.aps.iva.ee0.m0> j;
    public final com.amazon.aps.iva.de0.l k;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* loaded from: classes4.dex */
    public class a extends com.amazon.aps.iva.ee0.h {
        public final com.amazon.aps.iva.oc0.w0 c;
        public final /* synthetic */ k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.w0 w0Var) {
            super(lVar);
            if (lVar != null) {
                this.d = kVar;
                this.c = w0Var;
                return;
            }
            o(0);
            throw null;
        }

        public static /* synthetic */ void o(int i) {
            String str;
            int i2;
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 8) {
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                                } else {
                                    objArr[1] = "processSupertypesWithoutCycles";
                                }
                            } else {
                                objArr[1] = "getSupertypeLoopChecker";
                            }
                        } else {
                            objArr[1] = "getBuiltIns";
                        }
                    } else {
                        objArr[1] = "getDeclarationDescriptor";
                    }
                } else {
                    objArr[1] = "getParameters";
                }
            } else {
                objArr[1] = "computeSupertypes";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
                throw new IllegalStateException(format);
            }
        }

        @Override // com.amazon.aps.iva.ee0.n
        public final boolean c(com.amazon.aps.iva.oc0.h hVar) {
            if (hVar instanceof y0) {
                k kVar = this.d;
                com.amazon.aps.iva.yb0.j.f(kVar, "a");
                if (com.amazon.aps.iva.qd0.g.a.b(kVar, (y0) hVar, true, com.amazon.aps.iva.qd0.f.h)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final Collection<com.amazon.aps.iva.ee0.e0> d() {
            List<com.amazon.aps.iva.ee0.e0> H0 = this.d.H0();
            if (H0 != null) {
                return H0;
            }
            o(1);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final com.amazon.aps.iva.ee0.e0 e() {
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final List<y0> getParameters() {
            List<y0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            o(2);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final com.amazon.aps.iva.oc0.w0 h() {
            com.amazon.aps.iva.oc0.w0 w0Var = this.c;
            if (w0Var != null) {
                return w0Var;
            }
            o(5);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final com.amazon.aps.iva.lc0.k j() {
            com.amazon.aps.iva.lc0.k e = com.amazon.aps.iva.ud0.b.e(this.d);
            if (e != null) {
                return e;
            }
            o(4);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final com.amazon.aps.iva.oc0.h k() {
            k kVar = this.d;
            if (kVar != null) {
                return kVar;
            }
            o(3);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.c1
        public final boolean l() {
            return true;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final List<com.amazon.aps.iva.ee0.e0> m(List<com.amazon.aps.iva.ee0.e0> list) {
            List<com.amazon.aps.iva.ee0.e0> E0 = this.d.E0(list);
            if (E0 != null) {
                return E0;
            }
            o(8);
            throw null;
        }

        @Override // com.amazon.aps.iva.ee0.h
        public final void n(com.amazon.aps.iva.ee0.e0 e0Var) {
            if (e0Var != null) {
                this.d.G0(e0Var);
            } else {
                o(6);
                throw null;
            }
        }

        public final String toString() {
            return this.d.getName().b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(com.amazon.aps.iva.de0.l r3, com.amazon.aps.iva.oc0.k r4, com.amazon.aps.iva.pc0.h r5, com.amazon.aps.iva.nd0.f r6, com.amazon.aps.iva.ee0.v1 r7, boolean r8, int r9, com.amazon.aps.iva.oc0.w0 r10) {
        /*
            r2 = this;
            com.amazon.aps.iva.oc0.t0$a r0 = com.amazon.aps.iva.oc0.t0.a
            r1 = 0
            if (r3 == 0) goto L4a
            if (r4 == 0) goto L45
            if (r5 == 0) goto L40
            if (r6 == 0) goto L3b
            if (r7 == 0) goto L36
            if (r10 == 0) goto L31
            r2.<init>(r4, r5, r6, r0)
            r2.f = r7
            r2.g = r8
            r2.h = r9
            com.amazon.aps.iva.rc0.h r4 = new com.amazon.aps.iva.rc0.h
            r4.<init>(r2, r3, r10)
            com.amazon.aps.iva.de0.c$h r4 = r3.g(r4)
            r2.i = r4
            com.amazon.aps.iva.rc0.j r4 = new com.amazon.aps.iva.rc0.j
            r4.<init>(r2, r6)
            com.amazon.aps.iva.de0.c$h r4 = r3.g(r4)
            r2.j = r4
            r2.k = r3
            return
        L31:
            r3 = 6
            d0(r3)
            throw r1
        L36:
            r3 = 4
            d0(r3)
            throw r1
        L3b:
            r3 = 3
            d0(r3)
            throw r1
        L40:
            r3 = 2
            d0(r3)
            throw r1
        L45:
            r3 = 1
            d0(r3)
            throw r1
        L4a:
            r3 = 0
            d0(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.k.<init>(com.amazon.aps.iva.de0.l, com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.pc0.h, com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.ee0.v1, boolean, int, com.amazon.aps.iva.oc0.w0):void");
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.e(this, d);
    }

    public abstract void G0(com.amazon.aps.iva.ee0.e0 e0Var);

    public abstract List<com.amazon.aps.iva.ee0.e0> H0();

    @Override // com.amazon.aps.iva.oc0.y0
    public final com.amazon.aps.iva.de0.l K() {
        com.amazon.aps.iva.de0.l lVar = this.k;
        if (lVar != null) {
            return lVar;
        }
        d0(14);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final boolean O() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.h a() {
        return this;
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final int getIndex() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final List<com.amazon.aps.iva.ee0.e0> getUpperBounds() {
        List<com.amazon.aps.iva.ee0.e0> g = ((a) h()).g();
        if (g != null) {
            return g;
        }
        d0(8);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.y0, com.amazon.aps.iva.oc0.h
    public final c1 h() {
        c1 invoke = this.i.invoke();
        if (invoke != null) {
            return invoke;
        }
        d0(9);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final v1 i() {
        v1 v1Var = this.f;
        if (v1Var != null) {
            return v1Var;
        }
        d0(7);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final com.amazon.aps.iva.ee0.m0 m() {
        com.amazon.aps.iva.ee0.m0 invoke = this.j.invoke();
        if (invoke != null) {
            return invoke;
        }
        d0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.y0
    public final boolean w() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k a() {
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final y0 a() {
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.q
    public final com.amazon.aps.iva.oc0.n A0() {
        return this;
    }

    public List<com.amazon.aps.iva.ee0.e0> E0(List<com.amazon.aps.iva.ee0.e0> list) {
        return list;
    }
}

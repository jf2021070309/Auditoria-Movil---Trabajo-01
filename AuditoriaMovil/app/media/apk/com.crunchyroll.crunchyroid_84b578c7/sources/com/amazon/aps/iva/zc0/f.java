package com.amazon.aps.iva.zc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.fd0.y;
import com.amazon.aps.iva.fe0.b;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.lc0.s;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.r;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.l0;
import com.amazon.aps.iva.rc0.m0;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.xc0.d0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes4.dex */
public class f extends l0 implements a {
    public final boolean C;
    public final j<a.InterfaceC0568a<?>, ?> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, h hVar, b0 b0Var, r rVar, boolean z, com.amazon.aps.iva.nd0.f fVar, t0 t0Var, n0 n0Var, b.a aVar, boolean z2, j<a.InterfaceC0568a<?>, ?> jVar) {
        super(kVar, n0Var, hVar, b0Var, rVar, z, fVar, aVar, t0Var, false, false, false, false, false, false);
        if (kVar != null) {
            if (hVar != null) {
                if (b0Var != null) {
                    if (rVar != null) {
                        if (fVar != null) {
                            if (t0Var != null) {
                                if (aVar != null) {
                                    this.C = z2;
                                    this.D = jVar;
                                    return;
                                }
                                d0(6);
                                throw null;
                            }
                            d0(5);
                            throw null;
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

    public static f N0(k kVar, com.amazon.aps.iva.ad0.e eVar, b0 b0Var, r rVar, boolean z, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.dd0.a aVar, boolean z2) {
        if (kVar != null) {
            if (b0Var != null) {
                if (fVar != null) {
                    if (aVar != null) {
                        return new f(kVar, eVar, b0Var, rVar, z, fVar, aVar, null, b.a.DECLARATION, z2, null);
                    }
                    d0(12);
                    throw null;
                }
                d0(11);
                throw null;
            }
            d0(9);
            throw null;
        }
        d0(7);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // com.amazon.aps.iva.rc0.l0
    public final l0 I0(k kVar, b0 b0Var, r rVar, n0 n0Var, b.a aVar, com.amazon.aps.iva.nd0.f fVar) {
        t0.a aVar2 = t0.a;
        if (kVar != null) {
            if (b0Var != null) {
                if (rVar != null) {
                    if (aVar != null) {
                        if (fVar != null) {
                            return new f(kVar, getAnnotations(), b0Var, rVar, this.g, fVar, aVar2, n0Var, aVar, this.C, this.D);
                        }
                        d0(17);
                        throw null;
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
        d0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.w0, com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.l0, com.amazon.aps.iva.oc0.d1
    public final boolean isConst() {
        boolean z;
        e0 type = getType();
        if (!this.C) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.f(type, "type");
        if (((!com.amazon.aps.iva.lc0.k.H(type) && !s.a(type)) || s1.g(type)) && !com.amazon.aps.iva.lc0.k.J(type)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        com.amazon.aps.iva.fd0.f fVar = y.a;
        com.amazon.aps.iva.nd0.c cVar = d0.p;
        com.amazon.aps.iva.yb0.j.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        if (b.a.C(type, cVar) && !com.amazon.aps.iva.lc0.k.J(type)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.zc0.a
    public final a n0(e0 e0Var, ArrayList arrayList, e0 e0Var2, j jVar) {
        n0 a;
        m0 m0Var;
        o0 o0Var;
        com.amazon.aps.iva.rc0.n0 n0Var;
        o0 h;
        p0 setter;
        m0 getter;
        if (a() == this) {
            a = null;
        } else {
            a = a();
        }
        f fVar = new f(d(), getAnnotations(), o(), getVisibility(), this.g, getName(), g(), a, getKind(), this.C, jVar);
        m0 m0Var2 = this.y;
        if (m0Var2 != null) {
            h annotations = m0Var2.getAnnotations();
            b0 o = m0Var2.o();
            r visibility = m0Var2.getVisibility();
            boolean z = m0Var2.f;
            boolean z2 = m0Var2.g;
            boolean z3 = m0Var2.j;
            b.a kind = getKind();
            if (a == null) {
                getter = null;
            } else {
                getter = a.getGetter();
            }
            m0Var = r14;
            m0 m0Var3 = new m0(fVar, annotations, o, visibility, z, z2, z3, kind, getter, m0Var2.g());
            m0Var.m = m0Var2.m;
            m0Var.I0(e0Var2);
        } else {
            m0Var = null;
        }
        p0 p0Var = this.z;
        if (p0Var != null) {
            h annotations2 = p0Var.getAnnotations();
            b0 o2 = p0Var.o();
            r visibility2 = p0Var.getVisibility();
            boolean F = p0Var.F();
            boolean isExternal = p0Var.isExternal();
            boolean isInline = p0Var.isInline();
            b.a kind2 = getKind();
            if (a == null) {
                setter = null;
            } else {
                setter = a.getSetter();
            }
            n0Var = r13;
            com.amazon.aps.iva.rc0.n0 n0Var2 = new com.amazon.aps.iva.rc0.n0(fVar, annotations2, o2, visibility2, F, isExternal, isInline, kind2, setter, p0Var.g());
            n0Var.m = n0Var.m;
            c1 c1Var = p0Var.f().get(0);
            if (c1Var != null) {
                n0Var.n = c1Var;
                o0Var = null;
            } else {
                com.amazon.aps.iva.rc0.n0.d0(6);
                throw null;
            }
        } else {
            o0Var = null;
            n0Var = null;
        }
        fVar.K0(m0Var, n0Var, this.A, this.B);
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.de0.j<com.amazon.aps.iva.sd0.g<?>>> aVar = this.i;
        if (aVar != null) {
            fVar.E0(this.h, aVar);
        }
        fVar.z0(k());
        if (e0Var == null) {
            h = o0Var;
        } else {
            h = com.amazon.aps.iva.qd0.h.h(this, e0Var, h.a.a);
        }
        fVar.M0(e0Var2, getTypeParameters(), this.v, h, z.b);
        return fVar;
    }

    @Override // com.amazon.aps.iva.rc0.l0, com.amazon.aps.iva.oc0.a
    public final <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        j<a.InterfaceC0568a<?>, ?> jVar = this.D;
        if (jVar != null && jVar.b.equals(interfaceC0568a)) {
            return (V) jVar.c;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.rc0.l0
    public final void L0(e0 e0Var) {
    }
}

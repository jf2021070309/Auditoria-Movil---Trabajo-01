package com.amazon.aps.iva.zc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.k;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.l;
import com.amazon.aps.iva.rc0.o0;
import com.amazon.aps.iva.rc0.x;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes4.dex */
public final class b extends l implements a {
    public Boolean G;
    public Boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.oc0.e eVar, b bVar, h hVar, boolean z, b.a aVar, t0 t0Var) {
        super(eVar, bVar, hVar, z, aVar, t0Var);
        if (eVar != null) {
            if (hVar != null) {
                if (aVar != null) {
                    if (t0Var != null) {
                        this.G = null;
                        this.H = null;
                        return;
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

    public static b T0(com.amazon.aps.iva.oc0.e eVar, h hVar, boolean z, com.amazon.aps.iva.dd0.a aVar) {
        if (eVar != null) {
            if (aVar != null) {
                return new b(eVar, null, hVar, z, b.a.DECLARATION, aVar);
            }
            d0(6);
            throw null;
        }
        d0(4);
        throw null;
    }

    public static /* synthetic */ void d0(int i) {
        String str;
        int i2;
        if (i != 11 && i != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 18) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i != 11) {
            if (i != 18) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            } else {
                objArr[1] = "enhance";
            }
        } else {
            objArr[1] = "createSubstitutedCopy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 11 || i == 18) {
            throw new IllegalStateException(format);
        }
    }

    @Override // com.amazon.aps.iva.rc0.l, com.amazon.aps.iva.rc0.x
    public final /* bridge */ /* synthetic */ x G0(b.a aVar, k kVar, v vVar, t0 t0Var, h hVar, com.amazon.aps.iva.nd0.f fVar) {
        return U0(aVar, kVar, vVar, t0Var, hVar);
    }

    @Override // com.amazon.aps.iva.rc0.x
    public final void M0(boolean z) {
        this.G = Boolean.valueOf(z);
    }

    @Override // com.amazon.aps.iva.rc0.x
    public final void N0(boolean z) {
        this.H = Boolean.valueOf(z);
    }

    @Override // com.amazon.aps.iva.rc0.l
    public final /* bridge */ /* synthetic */ l P0(b.a aVar, k kVar, v vVar, t0 t0Var, h hVar, com.amazon.aps.iva.nd0.f fVar) {
        return U0(aVar, kVar, vVar, t0Var, hVar);
    }

    public final b U0(b.a aVar, k kVar, v vVar, t0 t0Var, h hVar) {
        if (kVar != null) {
            if (aVar != null) {
                if (hVar != null) {
                    if (t0Var != null) {
                        if (aVar != b.a.DECLARATION && aVar != b.a.SYNTHESIZED) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + aVar);
                        }
                        b bVar = new b((com.amazon.aps.iva.oc0.e) kVar, (b) vVar, hVar, this.F, aVar, t0Var);
                        bVar.M0(this.G.booleanValue());
                        bVar.N0(c0());
                        return bVar;
                    }
                    d0(10);
                    throw null;
                }
                d0(9);
                throw null;
            }
            d0(8);
            throw null;
        }
        d0(7);
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return this.H.booleanValue();
    }

    @Override // com.amazon.aps.iva.zc0.a
    public final a n0(e0 e0Var, ArrayList arrayList, e0 e0Var2, j jVar) {
        o0 h;
        com.amazon.aps.iva.oc0.e d = d();
        b U0 = U0(getKind(), d, null, g(), getAnnotations());
        if (e0Var == null) {
            h = null;
        } else {
            h = com.amazon.aps.iva.qd0.h.h(U0, e0Var, h.a.a);
        }
        U0.J0(h, this.k, z.b, getTypeParameters(), com.amazon.aps.iva.dg.b.l(arrayList, f(), U0), e0Var2, o(), getVisibility());
        if (jVar != null) {
            U0.L0((a.InterfaceC0568a) jVar.b, jVar.c);
        }
        return U0;
    }
}

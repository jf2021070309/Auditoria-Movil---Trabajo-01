package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: MutableClassDescriptor.java */
/* loaded from: classes4.dex */
public final class h0 extends m {
    public final com.amazon.aps.iva.oc0.f i;
    public final boolean j;
    public com.amazon.aps.iva.oc0.b0 k;
    public com.amazon.aps.iva.oc0.r l;
    public com.amazon.aps.iva.ee0.m m;
    public ArrayList n;
    public final ArrayList o;
    public final com.amazon.aps.iva.de0.l p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(com.amazon.aps.iva.rc0.r r3, com.amazon.aps.iva.oc0.f r4, com.amazon.aps.iva.nd0.f r5, com.amazon.aps.iva.de0.c.a r6) {
        /*
            r2 = this;
            com.amazon.aps.iva.oc0.t0$a r0 = com.amazon.aps.iva.oc0.t0.a
            r1 = 0
            if (r4 == 0) goto L25
            if (r5 == 0) goto L20
            if (r6 == 0) goto L1b
            r2.<init>(r6, r3, r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.o = r3
            r2.p = r6
            r2.i = r4
            r3 = 0
            r2.j = r3
            return
        L1b:
            r3 = 4
            A0(r3)
            throw r1
        L20:
            r3 = 2
            A0(r3)
            throw r1
        L25:
            r3 = 1
            A0(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.h0.<init>(com.amazon.aps.iva.rc0.r, com.amazon.aps.iva.oc0.f, com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.de0.c$a):void");
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.d D() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final a1<com.amazon.aps.iva.ee0.m0> R() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean X() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean a0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection e() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        A0(13);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean f0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return h.a.a;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.f getKind() {
        com.amazon.aps.iva.oc0.f fVar = this.i;
        if (fVar != null) {
            return fVar;
        }
        A0(8);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        com.amazon.aps.iva.oc0.r rVar = this.l;
        if (rVar != null) {
            return rVar;
        }
        A0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        com.amazon.aps.iva.ee0.m mVar = this.m;
        if (mVar != null) {
            return mVar;
        }
        A0(11);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        i.b bVar = i.b.b;
        if (bVar != null) {
            return bVar;
        }
        A0(18);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.e i0() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean isInline() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            return arrayList;
        }
        A0(15);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = this.k;
        if (b0Var != null) {
            return b0Var;
        }
        A0(7);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        if (fVar != null) {
            i.b bVar = i.b.b;
            if (bVar != null) {
                return bVar;
            }
            A0(17);
            throw null;
        }
        A0(16);
        throw null;
    }

    public final String toString() {
        return p.s0(this);
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.e> x() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(19);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return this.j;
    }
}

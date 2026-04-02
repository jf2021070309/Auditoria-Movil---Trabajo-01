package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: ClassDescriptorImpl.java */
/* loaded from: classes4.dex */
public class n extends m {
    public final com.amazon.aps.iva.oc0.b0 i;
    public final com.amazon.aps.iva.oc0.f j;
    public final com.amazon.aps.iva.ee0.m k;
    public com.amazon.aps.iva.xd0.i l;
    public Set<com.amazon.aps.iva.oc0.d> m;
    public com.amazon.aps.iva.oc0.d n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(com.amazon.aps.iva.oc0.k r3, com.amazon.aps.iva.nd0.f r4, com.amazon.aps.iva.oc0.b0 r5, com.amazon.aps.iva.oc0.f r6, java.util.Collection r7, com.amazon.aps.iva.de0.l r8) {
        /*
            r2 = this;
            com.amazon.aps.iva.oc0.t0$a r0 = com.amazon.aps.iva.oc0.t0.a
            r1 = 0
            if (r3 == 0) goto L34
            if (r4 == 0) goto L2f
            if (r5 == 0) goto L2a
            if (r6 == 0) goto L25
            if (r8 == 0) goto L20
            r2.<init>(r8, r3, r4, r0)
            r2.i = r5
            r2.j = r6
            com.amazon.aps.iva.ee0.m r3 = new com.amazon.aps.iva.ee0.m
            java.util.List r4 = java.util.Collections.emptyList()
            r3.<init>(r2, r4, r7, r8)
            r2.k = r3
            return
        L20:
            r3 = 6
            A0(r3)
            throw r1
        L25:
            r3 = 3
            A0(r3)
            throw r1
        L2a:
            r3 = 2
            A0(r3)
            throw r1
        L2f:
            r3 = 1
            A0(r3)
            throw r1
        L34:
            r3 = 0
            A0(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.n.<init>(com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.b0, com.amazon.aps.iva.oc0.f, java.util.Collection, com.amazon.aps.iva.de0.l):void");
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.d D() {
        return this.n;
    }

    public final void G0(com.amazon.aps.iva.xd0.i iVar, Set set, l lVar) {
        if (iVar != null) {
            this.l = iVar;
            this.m = set;
            this.n = lVar;
            return;
        }
        A0(7);
        throw null;
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
    public final Collection<com.amazon.aps.iva.oc0.d> e() {
        Set<com.amazon.aps.iva.oc0.d> set = this.m;
        if (set != null) {
            return set;
        }
        A0(11);
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
        com.amazon.aps.iva.oc0.f fVar = this.j;
        if (fVar != null) {
            return fVar;
        }
        A0(15);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        q.h hVar = com.amazon.aps.iva.oc0.q.e;
        if (hVar != null) {
            return hVar;
        }
        A0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        com.amazon.aps.iva.ee0.m mVar = this.k;
        if (mVar != null) {
            return mVar;
        }
        A0(10);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        i.b bVar = i.b.b;
        if (bVar != null) {
            return bVar;
        }
        A0(14);
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
        List<y0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(18);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = this.i;
        if (b0Var != null) {
            return b0Var;
        }
        A0(16);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        if (fVar != null) {
            com.amazon.aps.iva.xd0.i iVar = this.l;
            if (iVar != null) {
                return iVar;
            }
            A0(13);
            throw null;
        }
        A0(12);
        throw null;
    }

    public String toString() {
        return "class " + getName();
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
        return false;
    }
}

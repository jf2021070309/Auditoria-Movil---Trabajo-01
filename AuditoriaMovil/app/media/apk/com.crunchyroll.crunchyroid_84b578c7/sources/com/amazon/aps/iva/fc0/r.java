package com.amazon.aps.iva.fc0;

import com.amazon.aps.iva.ic0.k0;
/* compiled from: KTypeProjection.kt */
/* loaded from: classes4.dex */
public final class r {
    public static final r c = new r(null, null);
    public final s a;
    public final p b;

    /* compiled from: KTypeProjection.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public r(s sVar, k0 k0Var) {
        boolean z;
        boolean z2;
        String str;
        this.a = sVar;
        this.b = k0Var;
        if (sVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (k0Var == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z == z2)) {
            if (sVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + sVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.a && com.amazon.aps.iva.yb0.j.a(this.b, rVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        s sVar = this.a;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int i2 = hashCode * 31;
        p pVar = this.b;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int i;
        s sVar = this.a;
        if (sVar == null) {
            i = -1;
        } else {
            i = a.a[sVar.ordinal()];
        }
        if (i != -1) {
            p pVar = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + pVar;
                    }
                    throw new com.amazon.aps.iva.kb0.h();
                }
                return "in " + pVar;
            }
            return String.valueOf(pVar);
        }
        return "*";
    }
}

package com.amazon.aps.iva.aq;

import com.amazon.aps.iva.a0.r;
/* compiled from: SystemInfo.kt */
/* loaded from: classes2.dex */
public final class l {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;

    /* compiled from: SystemInfo.kt */
    /* loaded from: classes2.dex */
    public enum a {
        UNKNOWN,
        CHARGING,
        DISCHARGING,
        NOT_CHARGING,
        FULL;
        
        public static final C0117a Companion = new C0117a();

        /* compiled from: SystemInfo.kt */
        /* renamed from: com.amazon.aps.iva.aq.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0117a {
        }
    }

    public l() {
        this(0);
    }

    public static l a(l lVar, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = lVar.a;
        }
        if ((i2 & 2) != 0) {
            i = lVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = lVar.c;
        }
        if ((i2 & 8) != 0) {
            z3 = lVar.d;
        }
        lVar.getClass();
        return new l(z, i, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && this.d == lVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final int hashCode() {
        int i = 1;
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int a2 = r.a(this.b, r1 * 31, 31);
        ?? r2 = this.c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (a2 + i2) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    public final String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.a + ", batteryLevel=" + this.b + ", powerSaveMode=" + this.c + ", onExternalPowerSource=" + this.d + ")";
    }

    public /* synthetic */ l(int i) {
        this(false, -1, false, false);
    }

    public l(boolean z, int i, boolean z2, boolean z3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
    }
}

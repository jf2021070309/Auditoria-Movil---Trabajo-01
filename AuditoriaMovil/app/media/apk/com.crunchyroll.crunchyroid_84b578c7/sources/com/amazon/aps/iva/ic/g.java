package com.amazon.aps.iva.ic;

import com.amazon.aps.iva.yb0.j;
/* compiled from: Flows.kt */
/* loaded from: classes.dex */
public final class g<ResourceT> extends d<ResourceT> {
    public final i a;
    public final ResourceT b;
    public final boolean c;
    public final com.amazon.aps.iva.kc.a d;

    /* compiled from: Flows.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.SUCCEEDED.ordinal()] = 1;
            iArr[i.RUNNING.ordinal()] = 2;
            iArr[i.FAILED.ordinal()] = 3;
            iArr[i.CLEARED.ordinal()] = 4;
            a = iArr;
        }
    }

    public g(i iVar, ResourceT resourcet, boolean z, com.amazon.aps.iva.kc.a aVar) {
        j.f(iVar, "status");
        j.f(aVar, "dataSource");
        this.a = iVar;
        this.b = resourcet;
        this.c = z;
        this.d = aVar;
        int i = a.a[iVar.ordinal()];
        boolean z2 = true;
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                z2 = false;
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.amazon.aps.iva.ic.d
    public final i a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && j.a(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        ResourceT resourcet = this.b;
        if (resourcet == null) {
            hashCode = 0;
        } else {
            hashCode = resourcet.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.d.hashCode() + ((i + i2) * 31);
    }

    public final String toString() {
        return "Resource(status=" + this.a + ", resource=" + this.b + ", isFirstResource=" + this.c + ", dataSource=" + this.d + ')';
    }
}

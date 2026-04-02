package com.amazon.aps.iva.ic;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.yb0.j;
/* compiled from: Flows.kt */
/* loaded from: classes.dex */
public final class f<ResourceT> extends d<ResourceT> {
    public final i a;
    public final Drawable b;

    /* compiled from: Flows.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.SUCCEEDED.ordinal()] = 1;
            iArr[i.CLEARED.ordinal()] = 2;
            iArr[i.RUNNING.ordinal()] = 3;
            iArr[i.FAILED.ordinal()] = 4;
            a = iArr;
        }
    }

    public f(i iVar, Drawable drawable) {
        j.f(iVar, "status");
        this.a = iVar;
        this.b = drawable;
        int i = a.a[iVar.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            z = false;
        }
        if (z) {
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.a && j.a(this.b, fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Placeholder(status=" + this.a + ", placeholder=" + this.b + ')';
    }
}

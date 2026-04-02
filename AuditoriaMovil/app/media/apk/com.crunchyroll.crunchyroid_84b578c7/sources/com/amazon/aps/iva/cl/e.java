package com.amazon.aps.iva.cl;

import com.amazon.aps.iva.yb0.j;
/* compiled from: ToolbarSkipToNextModel.kt */
/* loaded from: classes2.dex */
public final class e {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.a, ((e) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("ToolbarSkipToNextModel(nextAssetId="), this.a, ")");
    }
}

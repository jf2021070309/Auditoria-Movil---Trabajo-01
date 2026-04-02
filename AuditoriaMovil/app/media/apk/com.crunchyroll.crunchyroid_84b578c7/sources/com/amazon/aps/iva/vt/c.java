package com.amazon.aps.iva.vt;

import java.io.Serializable;
/* compiled from: CommentsFragment.kt */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final String b;

    public c(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && com.amazon.aps.iva.yb0.j.a(this.b, ((c) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return defpackage.b.c(new StringBuilder("CommentsInput(assetId="), this.b, ")");
    }
}

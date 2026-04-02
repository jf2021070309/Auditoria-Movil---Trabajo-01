package com.amazon.aps.iva.wt;

import com.amazon.aps.iva.du.x;
/* compiled from: CommentActionUiModel.kt */
/* loaded from: classes2.dex */
public final class n {
    public final com.amazon.aps.iva.du.a a;
    public final x b;

    public n(com.amazon.aps.iva.du.a aVar, x xVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "actionOption");
        com.amazon.aps.iva.yb0.j.f(xVar, "uiModel");
        this.a = aVar;
        this.b = xVar;
    }

    public static n a(n nVar, x xVar) {
        com.amazon.aps.iva.du.a aVar = nVar.a;
        com.amazon.aps.iva.yb0.j.f(aVar, "actionOption");
        return new n(aVar, xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, nVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a * 31);
    }

    public final String toString() {
        return "CommentActionUiModel(actionOption=" + this.a + ", uiModel=" + this.b + ")";
    }
}

package com.amazon.aps.iva.ru;

import java.io.Serializable;
/* compiled from: CommentRepliesFragment.kt */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final String b;
    public final com.amazon.aps.iva.du.x c;
    public final boolean d;

    public c(String str, com.amazon.aps.iva.du.x xVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(xVar, "parentCommentModel");
        this.b = str;
        this.c = xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && this.d == cVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentRepliesInput(assetId=");
        sb.append(this.b);
        sb.append(", parentCommentModel=");
        sb.append(this.c);
        sb.append(", focusReplyInputField=");
        return com.amazon.aps.iva.e4.e.c(sb, this.d, ")");
    }
}

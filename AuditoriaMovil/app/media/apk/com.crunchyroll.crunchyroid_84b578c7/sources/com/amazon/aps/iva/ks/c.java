package com.amazon.aps.iva.ks;
/* compiled from: CommentProperty.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.is.b {
    private final String body;
    private final boolean containsSpoiler;
    private final String id;
    private final String parentCommentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3, boolean z) {
        super("Comment");
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.id = str;
        this.parentCommentId = str2;
        this.body = str3;
        this.containsSpoiler = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.id, cVar.id) && com.amazon.aps.iva.yb0.j.a(this.parentCommentId, cVar.parentCommentId) && com.amazon.aps.iva.yb0.j.a(this.body, cVar.body) && this.containsSpoiler == cVar.containsSpoiler) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.parentCommentId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.body;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.containsSpoiler;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.parentCommentId;
        String str3 = this.body;
        boolean z = this.containsSpoiler;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("CommentProperty(id=", str, ", parentCommentId=", str2, ", body=");
        b.append(str3);
        b.append(", containsSpoiler=");
        b.append(z);
        b.append(")");
        return b.toString();
    }
}

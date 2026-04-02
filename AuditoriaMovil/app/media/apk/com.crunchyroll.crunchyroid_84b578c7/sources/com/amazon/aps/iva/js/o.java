package com.amazon.aps.iva.js;
/* compiled from: MediaIdProperty.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.is.c {
    private final String mediaId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super("mediaId", str);
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        this.mediaId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && com.amazon.aps.iva.yb0.j.a(this.mediaId, ((o) obj).mediaId)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.mediaId.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("MediaIdProperty(mediaId=", this.mediaId, ")");
    }
}

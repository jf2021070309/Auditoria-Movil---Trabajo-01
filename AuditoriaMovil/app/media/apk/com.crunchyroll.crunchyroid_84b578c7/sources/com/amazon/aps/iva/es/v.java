package com.amazon.aps.iva.es;

import com.google.gson.annotations.SerializedName;
/* compiled from: CommentHiddenEvent.kt */
/* loaded from: classes2.dex */
public final class v extends i {
    @SerializedName("Comment")
    private final com.amazon.aps.iva.ks.c c;

    public v(com.amazon.aps.iva.ks.c cVar, String str) {
        super("Comment Hidden", cVar, new p0("contentId", str), new p0("actionTakenBy", "user"));
        this.c = cVar;
    }
}

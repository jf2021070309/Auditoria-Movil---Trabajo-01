package com.amazon.aps.iva.es;

import com.google.gson.annotations.SerializedName;
/* compiled from: CommentCreatedEvent.kt */
/* loaded from: classes2.dex */
public final class t extends i {
    @SerializedName("Comment")
    private final com.amazon.aps.iva.ks.c c;

    public t(com.amazon.aps.iva.ks.c cVar, String str) {
        super("Comment Created", cVar, new p0("contentId", str));
        this.c = cVar;
    }
}

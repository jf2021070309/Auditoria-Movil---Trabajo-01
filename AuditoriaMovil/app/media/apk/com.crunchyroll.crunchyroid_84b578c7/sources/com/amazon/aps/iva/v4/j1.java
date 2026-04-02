package com.amazon.aps.iva.v4;
/* compiled from: UninitializedMessageException.java */
/* loaded from: classes.dex */
public final class j1 extends RuntimeException {
    public j1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

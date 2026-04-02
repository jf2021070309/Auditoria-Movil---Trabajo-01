package com.amazon.aps.iva.e4;
/* compiled from: UninitializedMessageException.java */
/* loaded from: classes.dex */
public final class m1 extends RuntimeException {
    public m1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

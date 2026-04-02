package com.amazon.aps.iva.if0;
/* compiled from: JSONException.java */
/* loaded from: classes4.dex */
public class b extends RuntimeException {
    public b(String str, Exception exc) {
        super(str, exc);
    }

    public b(Exception exc) {
        super(exc.getMessage(), exc);
    }
}

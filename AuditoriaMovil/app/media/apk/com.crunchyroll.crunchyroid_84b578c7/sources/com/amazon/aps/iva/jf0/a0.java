package com.amazon.aps.iva.jf0;

import okhttp3.Response;
/* compiled from: Response.java */
/* loaded from: classes4.dex */
public final class a0<T> {
    public final Response a;
    public final T b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Response response, Object obj) {
        this.a = response;
        this.b = obj;
    }

    public final boolean a() {
        return this.a.isSuccessful();
    }

    public final String toString() {
        return this.a.toString();
    }
}

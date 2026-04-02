package com.flurry.sdk;

import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public class lf<ObjectType> implements li<ObjectType> {
    protected final li<ObjectType> a;

    public lf(li<ObjectType> liVar) {
        this.a = liVar;
    }

    @Override // com.flurry.sdk.li
    public void a(OutputStream outputStream, ObjectType objecttype) {
        if (this.a != null && outputStream != null && objecttype != null) {
            this.a.a(outputStream, objecttype);
        }
    }

    @Override // com.flurry.sdk.li
    public ObjectType a(InputStream inputStream) {
        if (this.a == null || inputStream == null) {
            return null;
        }
        return this.a.a(inputStream);
    }
}

package com.amazon.aps.iva.os;

import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.application.b;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: LocalAppConfigLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class a {
    public final l<l<? super InputStream, JsonObject>, JsonObject> a;
    public final com.amazon.aps.iva.ps.a b;

    /* compiled from: LocalAppConfigLoaderImpl.kt */
    /* renamed from: com.amazon.aps.iva.os.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0583a extends com.amazon.aps.iva.yb0.l implements l<InputStream, JsonObject> {
        public C0583a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final JsonObject invoke(InputStream inputStream) {
            InputStream inputStream2 = inputStream;
            j.f(inputStream2, "it");
            return a.this.b.b(new InputStreamReader(inputStream2, com.amazon.aps.iva.oe0.a.b));
        }
    }

    public a(b.a aVar, com.amazon.aps.iva.a60.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final JsonObject a() {
        return this.a.invoke(new C0583a());
    }
}

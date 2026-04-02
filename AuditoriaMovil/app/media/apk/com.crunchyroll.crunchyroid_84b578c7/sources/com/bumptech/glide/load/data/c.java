package com.bumptech.glide.load.data;

import com.amazon.aps.iva.uc.x;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final x a;

    /* compiled from: InputStreamRewinder.java */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0945a<InputStream> {
        public final com.amazon.aps.iva.oc.b a;

        public a(com.amazon.aps.iva.oc.b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0945a
        public final com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, com.amazon.aps.iva.oc.b bVar) {
        x xVar = new x(inputStream, bVar);
        this.a = xVar;
        xVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public final InputStream a() throws IOException {
        x xVar = this.a;
        xVar.reset();
        return xVar;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
        this.a.release();
    }
}

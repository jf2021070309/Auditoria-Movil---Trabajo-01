package com.flurry.sdk;

import com.flurry.sdk.kw;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class ku<RequestObjectType, ResponseObjectType> extends kw {
    public a<RequestObjectType, ResponseObjectType> a;
    public RequestObjectType b;
    public li<RequestObjectType> c;
    public li<ResponseObjectType> d;
    private ResponseObjectType v;

    /* loaded from: classes2.dex */
    public interface a<RequestObjectType, ResponseObjectType> {
        void a(ku<RequestObjectType, ResponseObjectType> kuVar, ResponseObjectType responseobjecttype);
    }

    @Override // com.flurry.sdk.kw, com.flurry.sdk.mc
    public final void a() {
        this.l = new kw.c() { // from class: com.flurry.sdk.ku.1
            @Override // com.flurry.sdk.kw.c
            public final void a(OutputStream outputStream) {
                if (ku.this.b != null && ku.this.c != null) {
                    ku.this.c.a(outputStream, ku.this.b);
                }
            }

            @Override // com.flurry.sdk.kw.c
            public final void a(kw kwVar, InputStream inputStream) {
                if (kwVar.d() && ku.this.d != null) {
                    ku.this.v = ku.this.d.a(inputStream);
                }
            }

            @Override // com.flurry.sdk.kw.c
            public final void a(kw kwVar) {
                ku.d(ku.this);
            }
        };
        super.a();
    }

    static /* synthetic */ void d(ku kuVar) {
        if (kuVar.a == null || kuVar.g()) {
            return;
        }
        kuVar.a.a(kuVar, kuVar.v);
    }
}

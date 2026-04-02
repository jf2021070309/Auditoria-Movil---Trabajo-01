package com.amazon.aps.iva.jf0;

import java.io.IOException;
/* compiled from: ParameterHandler.java */
/* loaded from: classes4.dex */
public final class u extends w<Iterable<Object>> {
    public final /* synthetic */ w a;

    public u(w wVar) {
        this.a = wVar;
    }

    @Override // com.amazon.aps.iva.jf0.w
    public final void a(y yVar, Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 != null) {
            for (Object obj : iterable2) {
                this.a.a(yVar, obj);
            }
        }
    }
}

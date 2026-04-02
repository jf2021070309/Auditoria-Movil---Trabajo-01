package com.amazon.aps.iva.jf0;

import java.io.IOException;
import java.lang.reflect.Array;
/* compiled from: ParameterHandler.java */
/* loaded from: classes4.dex */
public final class v extends w<Object> {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // com.amazon.aps.iva.jf0.w
    public final void a(y yVar, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(yVar, Array.get(obj, i));
        }
    }
}

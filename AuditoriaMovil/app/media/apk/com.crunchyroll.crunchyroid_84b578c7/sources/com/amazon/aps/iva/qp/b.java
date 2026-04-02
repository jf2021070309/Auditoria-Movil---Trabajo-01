package com.amazon.aps.iva.qp;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DataOkHttpUploaderV2.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        boolean z;
        String property = System.getProperty("http.agent");
        if (property != null && !m.b0(property)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            a aVar = this.h;
            String str = aVar.e;
            com.amazon.aps.iva.aq.a aVar2 = aVar.h;
            String d = aVar2.d();
            return com.amazon.aps.iva.ab.f.a(com.amazon.aps.iva.n4.a.b("Datadog/", str, " (Linux; U; Android ", d, "; "), aVar2.c(), " Build/", aVar2.b(), ")");
        }
        j.e(property, "{\n                it\n            }");
        return property;
    }
}

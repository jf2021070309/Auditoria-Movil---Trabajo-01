package com.amazon.aps.iva.ys;

import java.util.Map;
/* compiled from: AppConfigLogger.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ms.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.ag.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.ag.b bVar) {
        super(1);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ms.a aVar) {
        for (Map.Entry entry : com.amazon.aps.iva.ns.a.a(aVar.b(), "").entrySet()) {
            this.h.e((String) entry.getKey(), (String) entry.getValue());
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

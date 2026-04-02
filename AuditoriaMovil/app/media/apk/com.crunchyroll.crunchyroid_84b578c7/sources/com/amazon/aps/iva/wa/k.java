package com.amazon.aps.iva.wa;

import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.util.LogUtils;
import lombok.NonNull;
/* compiled from: ApsIvaPlayerToSimidContainerWebViewAdapter.java */
/* loaded from: classes.dex */
public final class k extends t {
    public final com.amazon.aps.iva.xa.b b;
    public final p c;

    public k(@NonNull b bVar, @NonNull com.amazon.aps.iva.xa.b bVar2, @NonNull p pVar) {
        super(bVar);
        if (bVar2 != null) {
            if (pVar != null) {
                this.b = bVar2;
                this.c = pVar;
                pVar.a = new com.amazon.aps.iva.pa.b(this, 1);
                pVar.b = new q() { // from class: com.amazon.aps.iva.wa.i
                    @Override // com.amazon.aps.iva.wa.q
                    public final void a(Object obj) {
                        k kVar = k.this;
                        kVar.getClass();
                        LogUtils.i("h", "Hiding web view for adId %s", (String) obj);
                        b bVar3 = (b) kVar.a;
                        bVar3.getClass();
                        bVar3.j.post(new e1(bVar3, 3));
                    }
                };
                return;
            }
            throw new NullPointerException("apsIvaContainerListener is marked non-null but is null");
        }
        throw new NullPointerException("metricsLogger is marked non-null but is null");
    }
}

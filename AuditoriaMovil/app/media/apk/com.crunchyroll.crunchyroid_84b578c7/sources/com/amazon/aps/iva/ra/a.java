package com.amazon.aps.iva.ra;

import android.os.RemoteException;
import com.amazon.aps.iva.f1.d0;
import com.amazon.aps.iva.sa.b;
import com.amazon.aps.iva.sa.d;
/* compiled from: AIOnDeCClient.java */
/* loaded from: classes.dex */
public final class a extends d.b {
    public final /* synthetic */ d0 a;

    public a(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // com.amazon.aps.iva.sa.d.b
    public final void a() {
        com.amazon.aps.iva.sa.c cVar;
        com.amazon.aps.iva.za.b bVar = (com.amazon.aps.iva.za.b) this.a.c;
        bVar.f = true;
        c cVar2 = bVar.d;
        com.amazon.aps.iva.za.a aVar = new com.amazon.aps.iva.za.a(bVar);
        if (cVar2.j != null) {
            cVar = com.amazon.aps.iva.sa.c.INVALID_INPUT;
        } else {
            try {
                cVar2.a().j(aVar);
                cVar2.j = aVar;
                cVar = com.amazon.aps.iva.sa.c.SUCCESS;
            } catch (RemoteException unused) {
                cVar = com.amazon.aps.iva.sa.c.REMOTE_EXCEPTION;
            } catch (b.d unused2) {
                cVar = com.amazon.aps.iva.sa.c.SERVICE_UNAVAILABLE_EXCEPTION;
            }
        }
        if (cVar == com.amazon.aps.iva.sa.c.SUCCESS) {
            bVar.c = true;
        } else {
            String.format("Failed to register callback handler to webview. Error: %s", cVar);
        }
    }
}

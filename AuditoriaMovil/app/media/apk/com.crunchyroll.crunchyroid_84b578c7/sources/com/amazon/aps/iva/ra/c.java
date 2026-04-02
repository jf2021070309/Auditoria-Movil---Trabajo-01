package com.amazon.aps.iva.ra;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.aps.iva.sa.d;
import com.amazon.aps.iva.sa.e;
import com.amazon.aps.iva.sa.f;
/* compiled from: AIOnDeCClient.java */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.sa.b<com.amazon.aps.iva.qa.a> {
    public final Context g;
    public final Intent h;
    public a i;
    public com.amazon.aps.iva.za.a j;

    public c(Context context, f fVar, Intent intent) {
        super(context, intent, fVar);
        this.g = context;
        this.h = intent;
    }

    @Override // com.amazon.aps.iva.sa.b
    public final void b() {
        d dVar = this.b;
        a aVar = this.i;
        synchronized (dVar) {
            dVar.a.remove(aVar);
        }
        try {
            a().a();
        } catch (RemoteException unused) {
        }
        this.j = null;
        super.b();
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        if (e.a(this.g, this.h, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.e != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}

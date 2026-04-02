package com.amazon.aps.iva.sa;

import android.content.Context;
import com.amazon.aps.iva.sa.d;
/* compiled from: BaseClient.java */
/* loaded from: classes.dex */
public final class a extends d.b {
    public final /* synthetic */ Class a = com.amazon.aps.iva.qa.a.class;
    public final /* synthetic */ Context b;
    public final /* synthetic */ b c;

    public a(com.amazon.aps.iva.ra.c cVar, Context context) {
        this.c = cVar;
        this.b = context;
    }

    @Override // com.amazon.aps.iva.sa.d.b
    public final void b(boolean z) {
        int i = b.f;
        this.a.getClass();
        d dVar = this.c.b;
        synchronized (dVar) {
            dVar.a.remove(this);
        }
        if (!z) {
            this.c.b();
            String.format("Binding for (%s) in package (%s) was unsuccessful. This probably means the service does not exist, or the client attempting to bind does not have the correct permissions", this.c.getClass().getSimpleName(), this.b.getPackageName());
        }
    }
}

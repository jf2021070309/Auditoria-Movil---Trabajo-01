package com.amazon.aps.iva.ec;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.hd.g<d> {
    public boolean a;
    public final /* synthetic */ com.bumptech.glide.a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ com.amazon.aps.iva.bd.a d;

    public e(com.bumptech.glide.a aVar, ArrayList arrayList, com.amazon.aps.iva.bd.a aVar2) {
        this.b = aVar;
        this.c = arrayList;
        this.d = aVar2;
    }

    @Override // com.amazon.aps.iva.hd.g
    public final d get() {
        if (!this.a) {
            Trace.beginSection("Glide registry");
            this.a = true;
            try {
                return com.bumptech.glide.e.a(this.b, this.c, this.d);
            } finally {
                this.a = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }
}

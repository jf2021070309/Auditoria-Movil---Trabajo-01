package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.z3.h;
import java.io.Serializable;
import java.util.Iterator;
/* compiled from: DataMigrationInitializer.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class f<T> extends com.amazon.aps.iva.qb0.c {
    public Serializable h;
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h.a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h.a aVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return h.a.a(this.k, null, null, this);
    }
}

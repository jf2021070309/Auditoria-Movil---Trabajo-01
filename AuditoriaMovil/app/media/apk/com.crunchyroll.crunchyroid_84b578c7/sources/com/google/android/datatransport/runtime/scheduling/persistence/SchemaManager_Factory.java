package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
/* loaded from: classes2.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final com.amazon.aps.iva.jb0.a<Context> contextProvider;
    private final com.amazon.aps.iva.jb0.a<String> dbNameProvider;
    private final com.amazon.aps.iva.jb0.a<Integer> schemaVersionProvider;

    public SchemaManager_Factory(com.amazon.aps.iva.jb0.a<Context> aVar, com.amazon.aps.iva.jb0.a<String> aVar2, com.amazon.aps.iva.jb0.a<Integer> aVar3) {
        this.contextProvider = aVar;
        this.dbNameProvider = aVar2;
        this.schemaVersionProvider = aVar3;
    }

    public static SchemaManager_Factory create(com.amazon.aps.iva.jb0.a<Context> aVar, com.amazon.aps.iva.jb0.a<String> aVar2, com.amazon.aps.iva.jb0.a<Integer> aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}

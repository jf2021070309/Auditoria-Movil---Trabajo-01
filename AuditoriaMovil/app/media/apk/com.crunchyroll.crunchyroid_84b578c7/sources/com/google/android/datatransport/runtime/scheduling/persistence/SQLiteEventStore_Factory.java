package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
/* loaded from: classes2.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final com.amazon.aps.iva.jb0.a<Clock> clockProvider;
    private final com.amazon.aps.iva.jb0.a<EventStoreConfig> configProvider;
    private final com.amazon.aps.iva.jb0.a<String> packageNameProvider;
    private final com.amazon.aps.iva.jb0.a<SchemaManager> schemaManagerProvider;
    private final com.amazon.aps.iva.jb0.a<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(com.amazon.aps.iva.jb0.a<Clock> aVar, com.amazon.aps.iva.jb0.a<Clock> aVar2, com.amazon.aps.iva.jb0.a<EventStoreConfig> aVar3, com.amazon.aps.iva.jb0.a<SchemaManager> aVar4, com.amazon.aps.iva.jb0.a<String> aVar5) {
        this.wallClockProvider = aVar;
        this.clockProvider = aVar2;
        this.configProvider = aVar3;
        this.schemaManagerProvider = aVar4;
        this.packageNameProvider = aVar5;
    }

    public static SQLiteEventStore_Factory create(com.amazon.aps.iva.jb0.a<Clock> aVar, com.amazon.aps.iva.jb0.a<Clock> aVar2, com.amazon.aps.iva.jb0.a<EventStoreConfig> aVar3, com.amazon.aps.iva.jb0.a<SchemaManager> aVar4, com.amazon.aps.iva.jb0.a<String> aVar5) {
        return new SQLiteEventStore_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, com.amazon.aps.iva.jb0.a<String> aVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}

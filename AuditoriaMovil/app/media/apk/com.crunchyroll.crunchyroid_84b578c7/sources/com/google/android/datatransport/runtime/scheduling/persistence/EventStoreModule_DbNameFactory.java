package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
/* loaded from: classes2.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    /* loaded from: classes2.dex */
    public static final class InstanceHolder {
        private static final EventStoreModule_DbNameFactory INSTANCE = new EventStoreModule_DbNameFactory();

        private InstanceHolder() {
        }
    }

    public static EventStoreModule_DbNameFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNull(EventStoreModule.dbName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public String get() {
        return dbName();
    }
}

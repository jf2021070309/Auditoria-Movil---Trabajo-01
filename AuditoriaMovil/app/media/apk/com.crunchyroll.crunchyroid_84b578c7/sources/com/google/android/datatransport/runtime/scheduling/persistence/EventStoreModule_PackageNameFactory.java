package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
/* loaded from: classes2.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final com.amazon.aps.iva.jb0.a<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(com.amazon.aps.iva.jb0.a<Context> aVar) {
        this.contextProvider = aVar;
    }

    public static EventStoreModule_PackageNameFactory create(com.amazon.aps.iva.jb0.a<Context> aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public String get() {
        return packageName(this.contextProvider.get());
    }
}

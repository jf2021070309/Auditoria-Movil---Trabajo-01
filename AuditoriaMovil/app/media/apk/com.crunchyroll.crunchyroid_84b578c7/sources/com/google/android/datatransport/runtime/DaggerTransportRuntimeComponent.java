package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {
    private com.amazon.aps.iva.jb0.a<SchedulerConfig> configProvider;
    private com.amazon.aps.iva.jb0.a creationContextFactoryProvider;
    private com.amazon.aps.iva.jb0.a<DefaultScheduler> defaultSchedulerProvider;
    private com.amazon.aps.iva.jb0.a<Executor> executorProvider;
    private com.amazon.aps.iva.jb0.a metadataBackendRegistryProvider;
    private com.amazon.aps.iva.jb0.a<String> packageNameProvider;
    private com.amazon.aps.iva.jb0.a<SQLiteEventStore> sQLiteEventStoreProvider;
    private com.amazon.aps.iva.jb0.a schemaManagerProvider;
    private com.amazon.aps.iva.jb0.a<Context> setApplicationContextProvider;
    private com.amazon.aps.iva.jb0.a<TransportRuntime> transportRuntimeProvider;
    private com.amazon.aps.iva.jb0.a<Uploader> uploaderProvider;
    private com.amazon.aps.iva.jb0.a<WorkInitializer> workInitializerProvider;
    private com.amazon.aps.iva.jb0.a<WorkScheduler> workSchedulerProvider;

    /* loaded from: classes2.dex */
    public static final class Builder implements TransportRuntimeComponent.Builder {
        private Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public TransportRuntimeComponent build() {
            Preconditions.checkBuilderRequirement(this.setApplicationContext, Context.class);
            return new DaggerTransportRuntimeComponent(this.setApplicationContext);
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public Builder setApplicationContext(Context context) {
            this.setApplicationContext = (Context) Preconditions.checkNotNull(context);
            return this;
        }
    }

    public static TransportRuntimeComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Context context) {
        this.executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
        Factory create = InstanceFactory.create(context);
        this.setApplicationContextProvider = create;
        CreationContextFactory_Factory create2 = CreationContextFactory_Factory.create(create, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
        this.creationContextFactoryProvider = create2;
        this.metadataBackendRegistryProvider = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, create2));
        this.schemaManagerProvider = SchemaManager_Factory.create(this.setApplicationContextProvider, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
        this.packageNameProvider = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.setApplicationContextProvider));
        this.sQLiteEventStoreProvider = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider, this.packageNameProvider));
        SchedulingConfigModule_ConfigFactory create3 = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
        this.configProvider = create3;
        SchedulingModule_WorkSchedulerFactory create4 = SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, create3, TimeModule_UptimeClockFactory.create());
        this.workSchedulerProvider = create4;
        com.amazon.aps.iva.jb0.a<Executor> aVar = this.executorProvider;
        com.amazon.aps.iva.jb0.a aVar2 = this.metadataBackendRegistryProvider;
        com.amazon.aps.iva.jb0.a<SQLiteEventStore> aVar3 = this.sQLiteEventStoreProvider;
        this.defaultSchedulerProvider = DefaultScheduler_Factory.create(aVar, aVar2, create4, aVar3, aVar3);
        com.amazon.aps.iva.jb0.a<Context> aVar4 = this.setApplicationContextProvider;
        com.amazon.aps.iva.jb0.a aVar5 = this.metadataBackendRegistryProvider;
        com.amazon.aps.iva.jb0.a<SQLiteEventStore> aVar6 = this.sQLiteEventStoreProvider;
        this.uploaderProvider = Uploader_Factory.create(aVar4, aVar5, aVar6, this.workSchedulerProvider, this.executorProvider, aVar6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.sQLiteEventStoreProvider);
        com.amazon.aps.iva.jb0.a<Executor> aVar7 = this.executorProvider;
        com.amazon.aps.iva.jb0.a<SQLiteEventStore> aVar8 = this.sQLiteEventStoreProvider;
        this.workInitializerProvider = WorkInitializer_Factory.create(aVar7, aVar8, this.workSchedulerProvider, aVar8);
        this.transportRuntimeProvider = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    public EventStore getEventStore() {
        return this.sQLiteEventStoreProvider.get();
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    public TransportRuntime getTransportRuntime() {
        return this.transportRuntimeProvider.get();
    }

    private DaggerTransportRuntimeComponent(Context context) {
        initialize(context);
    }
}

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
/* loaded from: classes2.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final com.amazon.aps.iva.jb0.a<Clock> eventClockProvider;
    private final com.amazon.aps.iva.jb0.a<WorkInitializer> initializerProvider;
    private final com.amazon.aps.iva.jb0.a<Scheduler> schedulerProvider;
    private final com.amazon.aps.iva.jb0.a<Uploader> uploaderProvider;
    private final com.amazon.aps.iva.jb0.a<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(com.amazon.aps.iva.jb0.a<Clock> aVar, com.amazon.aps.iva.jb0.a<Clock> aVar2, com.amazon.aps.iva.jb0.a<Scheduler> aVar3, com.amazon.aps.iva.jb0.a<Uploader> aVar4, com.amazon.aps.iva.jb0.a<WorkInitializer> aVar5) {
        this.eventClockProvider = aVar;
        this.uptimeClockProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.uploaderProvider = aVar4;
        this.initializerProvider = aVar5;
    }

    public static TransportRuntime_Factory create(com.amazon.aps.iva.jb0.a<Clock> aVar, com.amazon.aps.iva.jb0.a<Clock> aVar2, com.amazon.aps.iva.jb0.a<Scheduler> aVar3, com.amazon.aps.iva.jb0.a<Uploader> aVar4, com.amazon.aps.iva.jb0.a<WorkInitializer> aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}

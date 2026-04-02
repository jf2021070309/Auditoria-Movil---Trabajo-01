package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.amazon.aps.iva.e.i;
import com.amazon.aps.iva.n4.f0;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        for (TransportContext transportContext : this.store.loadActiveContexts()) {
            this.scheduler.schedule(transportContext, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureContextsScheduled$1() {
        this.guard.runCriticalSection(new f0(this, 7));
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new i(this, 6));
    }
}

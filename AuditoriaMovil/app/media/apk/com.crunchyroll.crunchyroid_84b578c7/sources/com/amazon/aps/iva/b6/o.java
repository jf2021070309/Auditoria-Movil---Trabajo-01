package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements o.a, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$schedule$0;
        lambda$schedule$0 = ((DefaultScheduler) this.b).lambda$schedule$0((TransportContext) this.c, (EventInternal) this.d);
        return lambda$schedule$0;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((b) obj).q((b.a) this.b, (com.amazon.aps.iva.o6.q) this.c, (com.amazon.aps.iva.o6.t) this.d);
    }
}

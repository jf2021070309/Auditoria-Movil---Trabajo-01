package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements o.a, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Iterable lambda$logAndUpdateState$3;
        lambda$logAndUpdateState$3 = ((Uploader) this.c).lambda$logAndUpdateState$3((TransportContext) this.d);
        return lambda$logAndUpdateState$3;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((b) obj).h((b.a) this.c, (com.amazon.aps.iva.q5.v0) this.d);
                return;
            default:
                ((b) obj).getClass();
                return;
        }
    }
}

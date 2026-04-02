package com.amazon.aps.iva.a6;

import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements o.a, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(int i, l0.d dVar, l0.d dVar2) {
        this.b = i;
        this.c = dVar;
        this.d = dVar2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$upload$0;
        lambda$upload$0 = ((Uploader) this.c).lambda$upload$0((TransportContext) this.d, this.b);
        return lambda$upload$0;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        l0.c cVar = (l0.c) obj;
        int i = this.b;
        cVar.b0(i);
        cVar.H(i, (l0.d) this.c, (l0.d) this.d);
    }

    public /* synthetic */ g0(Uploader uploader, TransportContext transportContext, int i) {
        this.c = uploader;
        this.d = transportContext;
        this.b = i;
    }
}

package com.amazon.aps.iva.n4;

import android.os.Bundle;
import androidx.fragment.app.u;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.t;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.k3.f;
import com.amazon.aps.iva.ka0.e;
import com.amazon.aps.iva.n6.c;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.r10.n;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements f.a, o.a, c.b, t.c, p1.b, SynchronizationGuard.CriticalSection, e.b, v {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(com.amazon.aps.iva.ga0.i iVar) {
        ((com.amazon.aps.iva.ca0.c) this.c).h.e(iVar);
    }

    public void b(com.android.billingclient.api.c cVar, List list) {
        com.amazon.aps.iva.rs.d dVar = (com.amazon.aps.iva.rs.d) this.c;
        com.amazon.aps.iva.yb0.j.f(dVar, "this$0");
        com.amazon.aps.iva.yb0.j.f(cVar, "billingResult");
        if (cVar.a == 0) {
            com.amazon.aps.iva.ue0.a aVar = dVar.d;
            if (list == null) {
                list = com.amazon.aps.iva.lb0.z.b;
            }
            aVar.h(list);
            return;
        }
        dVar.d.r(new com.amazon.aps.iva.rs.h(com.amazon.aps.iva.rs.i.d(cVar)));
    }

    @Override // com.amazon.aps.iva.b8.p1.b
    public void c(q.d dVar, v1 v1Var) {
        int i = p1.i;
        ((com.amazon.aps.iva.t5.g) this.c).a(v1Var);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Object lambda$ensureContextsScheduled$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 6:
                return Integer.valueOf(((EventStore) obj).cleanUp());
            default:
                lambda$ensureContextsScheduled$0 = ((WorkInitializer) obj).lambda$ensureContextsScheduled$0();
                return lambda$ensureContextsScheduled$0;
        }
    }

    @Override // com.amazon.aps.iva.b8.t.c
    public void g(q.c cVar, int i) {
        cVar.getClass();
    }

    @Override // com.amazon.aps.iva.n4.v
    public void i6(Bundle bundle, String str) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.amazon.aps.iva.r10.n nVar = (com.amazon.aps.iva.r10.n) obj;
                n.a aVar = com.amazon.aps.iva.r10.n.w;
                com.amazon.aps.iva.yb0.j.f(nVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(str, "<anonymous parameter 0>");
                if (bundle.containsKey("positive_button_result")) {
                    nVar.ei().N5();
                    return;
                }
                return;
            default:
                com.amazon.aps.iva.xb0.a aVar2 = (com.amazon.aps.iva.xb0.a) obj;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$onPositiveCTAClicked");
                com.amazon.aps.iva.yb0.j.f(str, "<anonymous parameter 0>");
                if (bundle.containsKey("ON_GO_PREMIUM_BUTTON_CLICKED")) {
                    aVar2.invoke();
                    return;
                }
                return;
        }
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public void invoke(Object obj) {
        ((l0.c) obj).g((com.amazon.aps.iva.s5.b) this.c);
    }

    @Override // com.amazon.aps.iva.k3.f.a
    public void onCancel() {
        u.b bVar = (u.b) this.c;
        com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
        bVar.a();
    }
}

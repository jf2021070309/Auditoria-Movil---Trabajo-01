package com.amazon.aps.iva.b6;

import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements o.a, m0.g, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.b8.m0.g
    public final void b(q.d dVar) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 4:
                com.amazon.aps.iva.b8.m0 m0Var = (com.amazon.aps.iva.b8.m0) obj;
                int i2 = com.amazon.aps.iva.b8.m0.n;
                m0Var.getClass();
                String str = ((MediaDescriptionCompat) this.d).b;
                if (TextUtils.isEmpty(str)) {
                    com.amazon.aps.iva.t5.p.g();
                    return;
                }
                v1 v1Var = m0Var.b.o;
                if (!v1Var.V(17)) {
                    com.amazon.aps.iva.t5.p.g();
                    return;
                }
                com.amazon.aps.iva.q5.r0 a0 = v1Var.a0();
                r0.d dVar2 = new r0.d();
                for (int i3 = 0; i3 < a0.q(); i3++) {
                    if (TextUtils.equals(a0.o(i3, dVar2).d.b, str)) {
                        v1Var.E(i3);
                        return;
                    }
                }
                return;
            default:
                com.amazon.aps.iva.b8.t tVar = ((com.amazon.aps.iva.b8.m0) obj).b;
                if (tVar.o.b1() != null) {
                    tVar.c.getClass();
                    com.amazon.aps.iva.cq.b.B(q.a.h(), "Callback.onSetRating must return non-null future");
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Object lambda$logAndUpdateState$7;
        lambda$logAndUpdateState$7 = ((Uploader) this.c).lambda$logAndUpdateState$7((Map) this.d);
        return lambda$logAndUpdateState$7;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b) obj).getClass();
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).B((b.a) obj2);
                return;
            default:
                ((b) obj).M((b.a) obj2, (com.amazon.aps.iva.q5.d0) this.d);
                return;
        }
    }
}

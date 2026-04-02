package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
    public final /* synthetic */ LocalVideosManagerQueueImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LocalVideosManagerQueueImpl localVideosManagerQueueImpl) {
        super(1);
        this.h = localVideosManagerQueueImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(e0 e0Var) {
        boolean z;
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "preparingLocalVideo");
        boolean z2 = e0Var2 instanceof e0.c;
        LocalVideosManagerQueueImpl localVideosManagerQueueImpl = this.h;
        if (z2) {
            if (e0Var2.k() && e0Var2.f() <= 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                localVideosManagerQueueImpl.B(e0Var2.e());
                return q.a;
            }
        }
        localVideosManagerQueueImpl.getClass();
        localVideosManagerQueueImpl.d.a(e0Var2.e(), new i(localVideosManagerQueueImpl, e0Var2), new j(localVideosManagerQueueImpl, e0Var2));
        return q.a;
    }
}

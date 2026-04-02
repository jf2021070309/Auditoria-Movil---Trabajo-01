package com.ellation.crunchyroll.downloading.queue;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.downloading.e0;
import java.util.List;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
    public final /* synthetic */ e0 h;
    public final /* synthetic */ LocalVideosManagerQueueImpl i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e0 e0Var, LocalVideosManagerQueueImpl localVideosManagerQueueImpl, String str) {
        super(1);
        this.h = e0Var;
        this.i = localVideosManagerQueueImpl;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends e0> list) {
        boolean z;
        List<? extends e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "inProgressDownloads");
        boolean isEmpty = list2.isEmpty();
        e0 e0Var = this.h;
        LocalVideosManagerQueueImpl localVideosManagerQueueImpl = this.i;
        if (isEmpty) {
            if (e0Var.k() && e0Var.f() <= 0.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                localVideosManagerQueueImpl.getClass();
                localVideosManagerQueueImpl.d.a(e0Var.e(), new i(localVideosManagerQueueImpl, e0Var), new j(localVideosManagerQueueImpl, e0Var));
            } else {
                localVideosManagerQueueImpl.b.B(this.j);
            }
        } else {
            localVideosManagerQueueImpl.notify(new e(e0Var));
        }
        return q.a;
    }
}

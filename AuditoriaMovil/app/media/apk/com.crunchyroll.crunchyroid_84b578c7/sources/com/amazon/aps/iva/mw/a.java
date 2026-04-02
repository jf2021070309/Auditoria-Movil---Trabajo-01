package com.amazon.aps.iva.mw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueueImpl;
import java.util.Iterator;
import java.util.List;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, q> {
    public final /* synthetic */ List<String> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List list, LocalVideosManagerQueueImpl.i iVar) {
        super(1);
        this.h = list;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(List<? extends e0> list) {
        Object obj;
        List<? extends e0> list2 = list;
        j.f(list2, "downloads");
        for (String str : this.h) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (j.a(((e0) obj).e(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            e0 e0Var = (e0) obj;
            if (e0Var != null) {
                this.i.invoke(e0Var);
            }
        }
        return q.a;
    }
}

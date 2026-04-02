package com.ellation.crunchyroll.downloading;

import com.ellation.crunchyroll.downloading.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends e0>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DownloadsManagerImpl downloadsManagerImpl) {
        super(1);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends e0> list) {
        DownloadsManagerImpl downloadsManagerImpl;
        boolean z;
        List<? extends e0> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "localVideos");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            downloadsManagerImpl = this.h;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            e0 e0Var = (e0) next;
            if ((e0Var instanceof e0.c) && e0Var.g() == e0.b.FAILED && downloadsManagerImpl.l.G().contains(e0Var.e())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new u(downloadsManagerImpl, (e0) it2.next(), null), 2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

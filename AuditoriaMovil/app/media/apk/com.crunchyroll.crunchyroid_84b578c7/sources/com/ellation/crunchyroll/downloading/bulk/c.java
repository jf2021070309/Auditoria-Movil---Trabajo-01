package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.yb0.i;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManagerImpl;
/* compiled from: BulkDownloadsManager.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends i implements com.amazon.aps.iva.xb0.a<q> {
    public c(BulkDownloadsManagerImpl.a aVar) {
        super(0, aVar, BulkDownloadsManagerImpl.a.class, "notifyListenerIfNeeded", "notifyListenerIfNeeded()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final /* bridge */ /* synthetic */ q invoke() {
        invoke2();
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        BulkDownloadsManagerImpl.a aVar = (BulkDownloadsManagerImpl.a) this.receiver;
        c2 c2Var = aVar.e;
        if (c2Var != null) {
            c2Var.a(null);
        }
        BulkDownloadsManagerImpl bulkDownloadsManagerImpl = BulkDownloadsManagerImpl.this;
        aVar.e = com.amazon.aps.iva.se0.i.d(bulkDownloadsManagerImpl.e, bulkDownloadsManagerImpl.d.b(), null, new a(bulkDownloadsManagerImpl, aVar, null), 2);
    }
}

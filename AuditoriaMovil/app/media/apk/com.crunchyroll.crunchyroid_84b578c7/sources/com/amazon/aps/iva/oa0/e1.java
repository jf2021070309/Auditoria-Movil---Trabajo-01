package com.amazon.aps.iva.oa0;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: Utils.java */
/* loaded from: classes4.dex */
public final class e1 implements OnSuccessListener<AppSetIdInfo> {
    public final /* synthetic */ BlockingQueue a;
    public final /* synthetic */ long b;

    public e1(LinkedBlockingQueue linkedBlockingQueue, long j) {
        this.a = linkedBlockingQueue;
        this.b = j;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(AppSetIdInfo appSetIdInfo) {
        AppSetIdInfo appSetIdInfo2 = appSetIdInfo;
        f1.b = appSetIdInfo2.getScope();
        this.a.offer(appSetIdInfo2.getId());
        f1.a = f1.k(this.b);
    }
}

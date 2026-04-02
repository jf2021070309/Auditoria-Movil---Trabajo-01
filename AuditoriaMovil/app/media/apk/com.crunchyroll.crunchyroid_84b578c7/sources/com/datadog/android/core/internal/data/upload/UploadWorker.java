package com.datadog.android.core.internal.data.upload;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.amazon.aps.iva.qp.c;
import com.amazon.aps.iva.qp.f;
import com.amazon.aps.iva.sp.a;
import com.amazon.aps.iva.sp.b;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: UploadWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "dd-sdk-android_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "appContext");
        j.f(workerParameters, "workerParams");
    }

    public static void a(b bVar, c cVar) {
        a d;
        boolean z;
        ArrayList arrayList = new ArrayList();
        do {
            d = bVar.d();
            if (d != null) {
                byte[] bArr = d.b;
                f c = cVar.c(bArr);
                f.logStatus$default(c, cVar.getClass().getSimpleName(), bArr.length, com.amazon.aps.iva.dq.c.b, false, false, null, 32, null);
                f.logStatus$default(c, cVar.getClass().getSimpleName(), bArr.length, com.amazon.aps.iva.dq.c.a, true, true, null, 32, null);
                if (c == f.SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bVar.b(d);
                    continue;
                } else {
                    arrayList.add(d);
                    continue;
                }
            } else {
                continue;
            }
        } while (d != null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bVar.c((a) it.next());
        }
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        if (!com.amazon.aps.iva.jp.c.a.get()) {
            com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.b, "Datadog has not been initialized.\n Please add the following code in your application's onCreate() method:\nval credentials = Credentials(\"<CLIENT_TOKEN>\", \"<ENVIRONMENT>\", \"<VARIANT>\", \"<APPLICATION_ID>\")\nDatadog.initialize(context, credentials, configuration, trackingConsent);", null, 6);
            return new ListenableWorker.a.c();
        }
        com.amazon.aps.iva.fq.b bVar = com.amazon.aps.iva.fq.b.f;
        a(bVar.b.getReader(), bVar.c);
        com.amazon.aps.iva.jq.a aVar = com.amazon.aps.iva.jq.a.f;
        a(aVar.b.getReader(), aVar.c);
        com.amazon.aps.iva.lr.a aVar2 = com.amazon.aps.iva.lr.a.f;
        a(aVar2.b.getReader(), aVar2.c);
        com.amazon.aps.iva.tq.c cVar = com.amazon.aps.iva.tq.c.f;
        a(cVar.b.getReader(), cVar.c);
        com.amazon.aps.iva.sr.a aVar3 = com.amazon.aps.iva.sr.a.f;
        a(aVar3.b.getReader(), aVar3.c);
        com.amazon.aps.iva.rr.b bVar2 = com.amazon.aps.iva.rr.b.f;
        a(bVar2.b.getReader(), bVar2.c);
        return new ListenableWorker.a.c();
    }
}

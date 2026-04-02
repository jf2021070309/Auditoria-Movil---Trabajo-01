package com.amazon.aps.iva.k;

import android.app.job.JobParameters;
import android.view.ViewGroup;
import com.amazon.aps.iva.a6.l1;
import com.amazon.aps.iva.a6.q0;
import com.amazon.aps.iva.b8.q1;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.k.u;
import com.amazon.aps.iva.m6.f;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.truex.adrenderer.web.TruexWebView;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                u.a aVar = (u.a) obj2;
                Runnable runnable = (Runnable) obj;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                l1 l1Var = (l1) obj;
                ((q0) obj2).getClass();
                try {
                    synchronized (l1Var) {
                    }
                    l1Var.a.l(l1Var.d, l1Var.e);
                    l1Var.b(true);
                    return;
                } catch (com.amazon.aps.iva.a6.l e) {
                    com.amazon.aps.iva.t5.p.d("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 2:
                j.a aVar2 = (j.a) obj2;
                aVar2.getClass();
                int i2 = g0.a;
                aVar2.b.d((String) obj);
                return;
            case 3:
                com.amazon.aps.iva.m6.f fVar = (com.amazon.aps.iva.m6.f) obj2;
                f.a aVar3 = fVar.h;
                aVar3.getClass();
                aVar3.b(fVar, (IOException) obj);
                return;
            case 4:
                m.a aVar4 = (m.a) obj2;
                aVar4.getClass();
                int i3 = g0.a;
                aVar4.b.c((String) obj);
                return;
            case 5:
                ListenableFuture listenableFuture = (ListenableFuture) obj2;
                com.amazon.aps.iva.b6.x.d(obj);
                int i4 = com.amazon.aps.iva.b8.m.b;
                try {
                    List list = (List) listenableFuture.get();
                    if (list != null) {
                        q1.l(list);
                    }
                    throw null;
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    com.amazon.aps.iva.t5.p.h("Library operation failed", e2);
                    throw null;
                }
            case 6:
                JobInfoSchedulerService.a((JobInfoSchedulerService) obj2, (JobParameters) obj);
                return;
            default:
                com.amazon.aps.iva.ta0.a aVar5 = ((com.amazon.aps.iva.qa0.e) obj2).b;
                ((ViewGroup) obj).addView(aVar5.c);
                TruexWebView truexWebView = aVar5.c;
                truexWebView.requestFocus(130);
                truexWebView.evaluateJavascript("if (requestAdFocus) requestAdFocus()", null);
                aVar5.c.onResume();
                return;
        }
    }
}

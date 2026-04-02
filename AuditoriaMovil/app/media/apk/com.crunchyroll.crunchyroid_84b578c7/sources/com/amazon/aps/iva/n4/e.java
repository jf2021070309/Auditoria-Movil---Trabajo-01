package com.amazon.aps.iva.n4;

import android.animation.Animator;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.f8.t0;
import com.amazon.aps.iva.k3.f;
import com.amazon.aps.iva.t5.o;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.net.cronet.okhttptransport.CronetInterceptor;
import org.chromium.net.CronetEngine;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f.a, o.a, p1.e, t0.b, OnCompleteListener, TransportScheduleCallback {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.b8.p1.e
    public final Object e(com.amazon.aps.iva.b8.t tVar, q.d dVar, int i) {
        int i2 = p1.i;
        ((com.amazon.aps.iva.b8.o) tVar).getClass();
        throw null;
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                ((com.amazon.aps.iva.b6.b) obj).I((b.a) obj2, (String) this.d);
                return;
            default:
                ((com.amazon.aps.iva.b6.b) obj).J((b.a) obj2);
                return;
        }
    }

    @Override // com.amazon.aps.iva.k3.f.a
    public final void onCancel() {
        u.b bVar = (u.b) this.d;
        com.amazon.aps.iva.yb0.j.f(bVar, "$operation");
        ((Animator) this.c).end();
        if (FragmentManager.H(2)) {
            bVar.toString();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Context context = (Context) this.c;
        com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) this.d;
        com.amazon.aps.iva.yb0.j.f(context, "$context");
        com.amazon.aps.iva.yb0.j.f(lVar, "$success");
        com.amazon.aps.iva.yb0.j.f(task, "it");
        if (task.isSuccessful()) {
            CronetInterceptor build = CronetInterceptor.newBuilder(new CronetEngine.Builder(context).build()).build();
            com.amazon.aps.iva.yb0.j.e(build, "newBuilder(cronetEngine).build()");
            lVar.invoke(build);
            com.amazon.aps.iva.u50.b.a = "cronet";
        }
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public final void onSchedule(Exception exc) {
        DataTransportCrashlyticsReportSender.b((TaskCompletionSource) this.c, (CrashlyticsReportWithSessionId) this.d, exc);
    }
}

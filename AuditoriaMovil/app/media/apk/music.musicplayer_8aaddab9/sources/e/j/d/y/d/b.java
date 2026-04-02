package e.j.d.y.d;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e.d.d.y.p;
import e.j.d.k;
import h.r.f;
import i.a.j;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
public final class b<TResult> implements OnCompleteListener {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f8896b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8897c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j<Boolean> f8898d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, long j2, boolean z, j<? super Boolean> jVar) {
        this.a = aVar;
        this.f8896b = j2;
        this.f8897c = z;
        this.f8898d = jVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Boolean> task) {
        h.o.c.j.e(task, "fetch");
        a aVar = this.a;
        f<Object>[] fVarArr = a.a;
        aVar.d().g(h.o.c.j.i("RemoteConfig: Fetch success: ", Boolean.valueOf(task.isSuccessful())), new Object[0]);
        e.j.d.b bVar = k.a.a().f8813j;
        boolean isSuccessful = task.isSuccessful();
        Objects.requireNonNull(bVar);
        Bundle[] bundleArr = new Bundle[1];
        h.f[] fVarArr2 = new h.f[3];
        fVarArr2[0] = new h.f("success", Boolean.valueOf(isSuccessful));
        fVarArr2[1] = new h.f("latency", Long.valueOf(System.currentTimeMillis() - this.f8896b));
        Application application = bVar.f8524b;
        h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = application.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        fVarArr2[2] = new h.f("has_connection", Boolean.valueOf(activeNetworkInfo == null ? false : activeNetworkInfo.isConnected()));
        bundleArr[0] = c.i.a.e(fVarArr2);
        bVar.o("RemoteGetConfig", bundleArr);
        if (this.f8897c && task.isSuccessful()) {
            e.d.d.y.j jVar = this.a.f8888b;
            if (jVar == null) {
                h.o.c.j.k("firebaseRemoteConfig");
                throw null;
            }
            Set<Map.Entry> entrySet = ((HashMap) jVar.a()).entrySet();
            a aVar2 = this.a;
            for (Map.Entry entry : entrySet) {
                e.j.d.z.c d2 = aVar2.d();
                StringBuilder y = e.a.d.a.a.y("    RemoteConfig: ");
                y.append(entry.getKey());
                y.append(" = ");
                y.append(((p) entry.getValue()).b());
                y.append(" source: ");
                y.append(((p) entry.getValue()).a());
                d2.g(y.toString(), new Object[0]);
            }
        }
        if (this.f8898d.a()) {
            this.f8898d.resumeWith(Boolean.valueOf(task.isSuccessful()));
        }
        this.a.f8891e = true;
    }
}

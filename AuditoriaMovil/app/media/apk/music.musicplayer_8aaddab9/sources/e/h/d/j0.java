package e.h.d;

import android.os.Bundle;
import android.os.IBinder;
import e.h.d.e0;
/* loaded from: classes2.dex */
public class j0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f8133b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e0.i f8134c;

    public j0(e0.i iVar, e0.j jVar, Bundle bundle) {
        this.f8134c = iVar;
        this.a = jVar;
        this.f8133b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder a = ((e0.k) this.a).a();
        e0.this.f8100n.remove(a);
        e0.b bVar = new e0.b(e0.this, null);
        bVar.a = this.a;
        e0.this.f8100n.put(a, bVar);
    }
}

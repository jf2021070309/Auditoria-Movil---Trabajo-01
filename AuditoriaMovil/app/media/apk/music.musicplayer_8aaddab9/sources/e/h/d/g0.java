package e.h.d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import e.h.d.e0;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class g0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8121b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f8122c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8123d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e0.i f8124e;

    public g0(e0.i iVar, e0.j jVar, String str, Bundle bundle, int i2) {
        this.f8124e = iVar;
        this.a = jVar;
        this.f8121b = str;
        this.f8122c = bundle;
        this.f8123d = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder a = ((e0.k) this.a).a();
        e0.this.f8100n.remove(a);
        e0.b bVar = new e0.b(e0.this, null);
        String str = this.f8121b;
        bVar.f8102b = str;
        Bundle bundle = this.f8122c;
        bVar.a = this.a;
        bVar.f8103c = e0.this.o(str, this.f8123d, bundle);
        try {
            e0.this.f8100n.put(a, bVar);
            MediaSessionCompat.Token token = e0.this.f8099m;
            if (token != null) {
                e0.j jVar = this.a;
                e0.a aVar = bVar.f8103c;
                ((e0.k) jVar).b(aVar.f8101b, token, aVar.a);
            }
        } catch (RemoteException e2) {
            s1.l(e2, true);
            e0.this.f8100n.remove(a);
        }
    }
}

package e.d.b.e.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class o<T extends IInterface> {
    public static final Map<String, Handler> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f7000b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7001c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7002d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7004f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f7005g;

    /* renamed from: h  reason: collision with root package name */
    public final k<T> f7006h;

    /* renamed from: k  reason: collision with root package name */
    public ServiceConnection f7009k;

    /* renamed from: l  reason: collision with root package name */
    public T f7010l;

    /* renamed from: e  reason: collision with root package name */
    public final List<f> f7003e = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final IBinder.DeathRecipient f7008j = new IBinder.DeathRecipient(this) { // from class: e.d.b.e.a.c.g
        public final o a;

        {
            this.a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o oVar = this.a;
            oVar.f7001c.a(4, "reportBinderDeath", new Object[0]);
            j jVar = oVar.f7007i.get();
            if (jVar != null) {
                oVar.f7001c.a(4, "calling onBinderDied", new Object[0]);
                jVar.a();
                return;
            }
            oVar.f7001c.a(4, "%s : Binder has died.", new Object[]{oVar.f7002d});
            List<f> list = oVar.f7003e;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                e.d.b.e.a.g.n<?> nVar = list.get(i2).a;
                if (nVar != null) {
                    nVar.a(new RemoteException(String.valueOf(oVar.f7002d).concat(" : Binder has died.")));
                }
            }
            oVar.f7003e.clear();
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<j> f7007i = new WeakReference<>(null);

    public o(Context context, e eVar, String str, Intent intent, k<T> kVar) {
        this.f7000b = context;
        this.f7001c = eVar;
        this.f7002d = str;
        this.f7005g = intent;
        this.f7006h = kVar;
    }

    public final void a() {
        c(new i(this));
    }

    public final void b(f fVar) {
        c(new h(this, fVar.a, fVar));
    }

    public final void c(f fVar) {
        Handler handler;
        Map<String, Handler> map = a;
        synchronized (map) {
            if (!map.containsKey(this.f7002d)) {
                HandlerThread handlerThread = new HandlerThread(this.f7002d, 10);
                handlerThread.start();
                map.put(this.f7002d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f7002d);
        }
        handler.post(fVar);
    }
}

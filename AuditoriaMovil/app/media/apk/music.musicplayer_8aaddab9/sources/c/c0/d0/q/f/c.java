package c.c0.d0.q.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c.c0.r;
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final String f1462g = r.e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: h  reason: collision with root package name */
    public final BroadcastReceiver f1463h;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(context, intent);
            }
        }
    }

    public c(Context context, c.c0.d0.t.t.a aVar) {
        super(context, aVar);
        this.f1463h = new a();
    }

    @Override // c.c0.d0.q.f.d
    public void d() {
        r.c().a(f1462g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f1465c.registerReceiver(this.f1463h, f());
    }

    @Override // c.c0.d0.q.f.d
    public void e() {
        r.c().a(f1462g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f1465c.unregisterReceiver(this.f1463h);
    }

    public abstract IntentFilter f();

    public abstract void g(Context context, Intent intent);
}

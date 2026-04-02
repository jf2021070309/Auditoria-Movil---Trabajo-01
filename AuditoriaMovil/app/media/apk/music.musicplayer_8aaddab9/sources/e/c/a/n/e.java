package e.c.a.n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import e.c.a.i;
import e.c.a.n.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e implements c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f5950b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5951c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5952d;

    /* renamed from: e  reason: collision with root package name */
    public final BroadcastReceiver f5953e = new a();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f5951c;
            eVar.f5951c = eVar.i(context);
            if (z != e.this.f5951c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z2 = e.this.f5951c;
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.f5950b;
                boolean z3 = eVar2.f5951c;
                i.b bVar = (i.b) aVar;
                Objects.requireNonNull(bVar);
                if (z3) {
                    synchronized (e.c.a.i.this) {
                        n nVar = bVar.a;
                        Iterator it = ((ArrayList) e.c.a.s.j.e(nVar.a)).iterator();
                        while (it.hasNext()) {
                            e.c.a.q.b bVar2 = (e.c.a.q.b) it.next();
                            if (!bVar2.d() && !bVar2.b()) {
                                bVar2.clear();
                                if (nVar.f5968c) {
                                    nVar.f5967b.add(bVar2);
                                } else {
                                    bVar2.c();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.a = context.getApplicationContext();
        this.f5950b = aVar;
    }

    @SuppressLint({"MissingPermission"})
    public boolean i(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // e.c.a.n.i
    public void onDestroy() {
    }

    @Override // e.c.a.n.i
    public void onStart() {
        if (this.f5952d) {
            return;
        }
        this.f5951c = i(this.a);
        try {
            this.a.registerReceiver(this.f5953e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f5952d = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    @Override // e.c.a.n.i
    public void onStop() {
        if (this.f5952d) {
            this.a.unregisterReceiver(this.f5953e);
            this.f5952d = false;
        }
    }
}

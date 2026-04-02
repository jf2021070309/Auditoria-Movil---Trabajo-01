package com.amazon.aps.iva.oa0;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.amazon.aps.iva.oa0.o;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: SessionManager.java */
/* loaded from: classes4.dex */
public final class m0 {
    public final u0 a;
    public final o.a b;
    public long d;
    public long e;
    public long f;
    public boolean c = false;
    public boolean g = true;

    static {
        new com.amazon.aps.iva.b30.j("Session");
    }

    public m0(u0 u0Var) {
        Method method;
        int i = 0;
        this.d = -1L;
        this.e = -1L;
        this.f = 0L;
        this.a = u0Var;
        this.b = new o.a(u0Var);
        Context context = u0Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("singular-pref-session", 0);
        this.d = sharedPreferences.getLong("id", -1L);
        long j = sharedPreferences.getLong("lastSessionPauseTime", -1L);
        this.e = j;
        if (j < 0) {
            this.e = sharedPreferences.getLong("lastEvent", -1L);
        }
        this.f = sharedPreferences.getLong("seq", 0L);
        toString();
        int i2 = f1.b;
        c(System.currentTimeMillis());
        Application application = (Application) context;
        if (!this.c) {
            z0 z0Var = new z0(this);
            int i3 = z0.c;
            try {
                Object newProxyInstance = Proxy.newProxyInstance(Application.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, z0Var);
                Method[] methods = Application.class.getMethods();
                int length = methods.length;
                while (true) {
                    if (i < length) {
                        method = methods[i];
                        if (method.getName().equals("registerActivityLifecycleCallbacks")) {
                            break;
                        }
                        i++;
                    } else {
                        method = null;
                        break;
                    }
                }
                if (method != null) {
                    method.invoke(application, newProxyInstance);
                }
            } catch (Throwable unused) {
            }
        }
        a();
    }

    public final void a() {
        if (!this.g && this.c) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.a.a.registerReceiver(this.b, intentFilter);
    }

    public final void b(long j) {
        boolean z;
        this.d = j;
        this.f = 0L;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            u0 u0Var = this.a;
            if (!u0Var.b().getBoolean("stop_all_tracking", false)) {
                u0Var.c.a().postAtFrontOfQueue(new y0(j, u0Var));
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        boolean z2;
        u0 u0Var = u0.p;
        y yVar = u0Var.f;
        yVar.i.a(yVar, u0Var.a);
        if (u0.p.d.g != null) {
            b(j);
            return true;
        }
        if (this.d > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j - this.e < this.a.d.e * 1000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
        }
        b(j);
        return true;
    }

    public final String toString() {
        return "{id=" + this.d + ", lastSessionPauseTime=" + this.e + ", seq=" + this.f + '}';
    }
}

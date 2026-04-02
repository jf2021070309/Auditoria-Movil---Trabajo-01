package com.amazon.aps.iva.sa;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.ArrayList;
import java.util.Objects;
/* compiled from: ServiceConnectionManager.java */
/* loaded from: classes.dex */
public abstract class d {
    public Context b;
    public ServiceConnection c;
    public Intent d;
    public final ArrayList<b> a = new ArrayList<>();
    public boolean e = false;
    public boolean f = false;

    /* compiled from: ServiceConnectionManager.java */
    /* loaded from: classes.dex */
    public static abstract class a extends b {
        public d a;

        @Override // com.amazon.aps.iva.sa.d.b
        public final void a() {
            try {
                c();
                d dVar = this.a;
                if (dVar != null) {
                    synchronized (dVar) {
                        dVar.a.remove(this);
                    }
                }
            } catch (Throwable th) {
                if (this.a != null) {
                    d dVar2 = this.a;
                    synchronized (dVar2) {
                        dVar2.a.remove(this);
                    }
                }
                throw th;
            }
        }

        public abstract void c();
    }

    public final synchronized void a(b bVar) {
        if (!this.a.contains(bVar)) {
            this.a.add(0, bVar);
        }
        if (bVar instanceof a) {
            ((a) bVar).a = this;
        }
        if (this.f) {
            bVar.a();
        }
    }

    public final synchronized void b() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = false;
    }

    public final synchronized void c() {
        Objects.toString(this.b);
        Context context = this.b;
        if (context == null) {
            return;
        }
        f fVar = (f) this;
        try {
            context.unbindService(this.c);
        } catch (Throwable unused) {
        }
        synchronized (fVar) {
            int size = fVar.a.size();
            while (true) {
                size--;
                if (size >= 0) {
                    fVar.a.get(size).getClass();
                }
            }
        }
        b();
    }

    public final synchronized void d(Context context, ServiceConnection serviceConnection, Intent intent, String str) {
        Objects.toString(context);
        if (context != null && serviceConnection != null && intent != null) {
            Context context2 = this.b;
            if (context2 != null) {
                Objects.toString(context2);
                return;
            }
            this.b = context;
            this.c = serviceConnection;
            this.d = intent;
            e(context, serviceConnection, intent, str);
            return;
        }
        throw new IllegalArgumentException("Null input. Context = " + context + ", serviceConnection = " + serviceConnection + ", bindIntent = " + intent);
    }

    public abstract void e(Context context, ServiceConnection serviceConnection, Intent intent, String str);

    /* compiled from: ServiceConnectionManager.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a() {
        }

        public void b(boolean z) {
        }
    }
}

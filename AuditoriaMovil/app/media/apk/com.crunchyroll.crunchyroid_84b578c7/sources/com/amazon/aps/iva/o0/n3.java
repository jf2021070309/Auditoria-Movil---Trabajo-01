package com.amazon.aps.iva.o0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ActualJvm.jvm.kt */
/* loaded from: classes.dex */
public final class n3 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n3(Context context, com.amazon.aps.iva.zq.b bVar) {
        this(bVar, new com.amazon.aps.iva.p3.e(context, bVar));
        this.a = 6;
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public final Object a() {
        com.amazon.aps.iva.v0.d dVar = (com.amazon.aps.iva.v0.d) ((AtomicReference) this.b).get();
        int a = dVar.a(Thread.currentThread().getId());
        if (a >= 0) {
            return dVar.c[a];
        }
        return null;
    }

    public final boolean b() {
        Collection values = ((ConcurrentHashMap) this.b).values();
        com.amazon.aps.iva.yb0.j.e(values, "initialisationStatus.values");
        Collection<Boolean> collection = values;
        if (collection.isEmpty()) {
            return true;
        }
        for (Boolean bool : collection) {
            if (!com.amazon.aps.iva.yb0.j.a(bool, Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    public final void c(com.amazon.aps.iva.tj.q0 q0Var) {
        com.amazon.aps.iva.xb0.a aVar;
        com.amazon.aps.iva.yb0.j.f(q0Var, "key");
        ((ConcurrentHashMap) this.b).put(q0Var, Boolean.TRUE);
        if (b() && (aVar = (com.amazon.aps.iva.xb0.a) this.c) != null) {
            if (aVar != null) {
                aVar.invoke();
            }
            this.c = null;
        }
    }

    public final void d(MotionEvent motionEvent) {
        View decorView;
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        ((com.amazon.aps.iva.p3.e) this.c).a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            com.amazon.aps.iva.zq.b bVar = (com.amazon.aps.iva.zq.b) this.b;
            bVar.getClass();
            Window window = bVar.b.get();
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            com.amazon.aps.iva.sq.d dVar = bVar.f;
            if (dVar != null) {
                com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
                View view = bVar.g.get();
                if (decorView != null && view != null) {
                    LinkedHashMap b = bVar.b(view, com.amazon.aps.iva.ab.x.e0(view.getId()), motionEvent);
                    com.amazon.aps.iva.ab.x.d0(bVar.d, view);
                    fVar.b(dVar, "", b);
                }
            }
            bVar.g.clear();
            bVar.f = null;
            bVar.i = 0.0f;
            bVar.h = 0.0f;
        }
    }

    public final void e(Object obj) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.c) {
            com.amazon.aps.iva.v0.d dVar = (com.amazon.aps.iva.v0.d) ((AtomicReference) this.b).get();
            int a = dVar.a(id);
            if (a < 0) {
                z = false;
            } else {
                dVar.c[a] = obj;
                z = true;
            }
            if (z) {
                return;
            }
            ((AtomicReference) this.b).set(dVar.b(id, obj));
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public final void f(zzfb zzfbVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzi(zzfbVar);
            ((com.amazon.aps.iva.ab.s) this.c).a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public final void g(zzff zzffVar) {
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzj(zzffVar);
            ((com.amazon.aps.iva.ab.s) this.c).a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public final void h() {
        com.amazon.aps.iva.ab.w wVar = (com.amazon.aps.iva.ab.w) this.c;
        Context context = (Context) this.b;
        if (wVar.c) {
            context.unregisterReceiver((com.amazon.aps.iva.ab.w) wVar.d.c);
            wVar.c = false;
            return;
        }
        zzb.zzj("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return ((String) this.b) + ", " + ((String) this.c);
            default:
                return super.toString();
        }
    }

    public n3(com.android.billingclient.api.c cVar, ArrayList arrayList) {
        this.a = 2;
        this.b = arrayList;
        this.c = cVar;
    }

    public n3(Context context, zzfm zzfmVar) {
        this.a = 3;
        this.c = new com.amazon.aps.iva.ab.s(context);
        this.b = zzfmVar;
    }

    public n3(Context context, com.amazon.aps.iva.n4.f0 f0Var, n3 n3Var) {
        this.a = 4;
        this.b = context;
        this.c = new com.amazon.aps.iva.ab.w(this, f0Var, n3Var);
    }

    public n3(com.amazon.aps.iva.zq.b bVar, com.amazon.aps.iva.p3.e eVar) {
        this.a = 6;
        this.b = bVar;
        this.c = eVar;
    }

    public n3(Object obj) {
        this.a = 7;
        this.c = obj;
        this.b = Thread.currentThread();
    }

    public n3(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }

    public n3(int i) {
        this.a = i;
        if (i != 5) {
            this.b = new AtomicReference(com.amazon.aps.iva.v0.e.a);
            this.c = new Object();
            return;
        }
        com.amazon.aps.iva.tj.q0[] values = com.amazon.aps.iva.tj.q0.values();
        int w = com.amazon.aps.iva.aq.k.w(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(w < 16 ? 16 : w);
        for (com.amazon.aps.iva.tj.q0 q0Var : values) {
            linkedHashMap.put(q0Var, Boolean.FALSE);
        }
        this.b = new ConcurrentHashMap(com.amazon.aps.iva.lb0.i0.b0(linkedHashMap));
    }
}

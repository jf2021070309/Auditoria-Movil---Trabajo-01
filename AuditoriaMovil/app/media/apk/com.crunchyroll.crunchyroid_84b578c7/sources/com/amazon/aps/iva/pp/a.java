package com.amazon.aps.iva.pp;

import android.content.Context;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.eq.a;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.pp.b;
import com.amazon.aps.iva.rp.c;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
/* compiled from: ProcessLifecycleCallback.kt */
/* loaded from: classes2.dex */
public final class a implements b.a {
    public final c a;
    public final WeakReference b;

    public a(c cVar, Context context) {
        j.f(cVar, "networkInfoProvider");
        this.a = cVar;
        this.b = new WeakReference(context);
    }

    @Override // com.amazon.aps.iva.pp.b.a
    public final void a() {
        boolean z;
        Context context = (Context) this.b.get();
        if (context != null) {
            try {
                k.c(context);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                try {
                    k c = k.c(context);
                    j.e(c, "getInstance(context)");
                    ((com.amazon.aps.iva.w9.b) c.d).a(new com.amazon.aps.iva.u9.b(c, "DatadogBackgroundUpload"));
                } catch (IllegalStateException e) {
                    l1.z(com.amazon.aps.iva.dq.c.a, "Error cancelling the UploadWorker", e, 4);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.pp.b.a
    public final void b() {
        boolean z;
        Context context;
        boolean z2 = true;
        if (this.a.g().a == a.b.NETWORK_NOT_CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        if (z && (context = (Context) this.b.get()) != null) {
            try {
                k.c(context);
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                com.amazon.aps.iva.aq.k.Q(context);
            }
        }
    }

    @Override // com.amazon.aps.iva.pp.b.a
    public final void c() {
    }

    @Override // com.amazon.aps.iva.pp.b.a
    public final void d() {
    }
}

package com.amazon.aps.iva.ab;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.amazon.aps.iva.o0.n3;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgd;
import java.util.concurrent.Callable;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class q implements ServiceConnection {
    public final Object b = new Object();
    public boolean c = false;
    public d d;
    public final /* synthetic */ com.android.billingclient.api.a e;

    public /* synthetic */ q(com.android.billingclient.api.a aVar, com.amazon.aps.iva.rs.b bVar) {
        this.e = aVar;
        this.d = bVar;
    }

    public final void a(com.android.billingclient.api.c cVar) {
        synchronized (this.b) {
            d dVar = this.d;
            if (dVar != null) {
                dVar.a(cVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzi("BillingClient", "Billing service connected.");
        this.e.g = zzd.zzn(iBinder);
        com.android.billingclient.api.a aVar = this.e;
        if (aVar.x(new Callable() { // from class: com.amazon.aps.iva.ab.o
            /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 346
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab.o.call():java.lang.Object");
            }
        }, NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new Runnable() { // from class: com.amazon.aps.iva.ab.p
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                qVar.e.a = 0;
                qVar.e.g = null;
                n3 n3Var = qVar.e.f;
                com.android.billingclient.api.c cVar = com.android.billingclient.api.f.i;
                n3Var.f(com.amazon.aps.iva.e.w.V(24, 6, cVar));
                qVar.a(cVar);
            }
        }, aVar.t()) == null) {
            com.android.billingclient.api.c v = this.e.v();
            this.e.f.f(com.amazon.aps.iva.e.w.V(25, 6, v));
            a(v);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzj("BillingClient", "Billing service disconnected.");
        n3 n3Var = this.e.f;
        zzgd zzw = zzgd.zzw();
        n3Var.getClass();
        try {
            zzfy zzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) n3Var.b;
            if (zzfmVar != null) {
                zzv.zzk(zzfmVar);
            }
            zzv.zzl(zzw);
            ((s) n3Var.c).a((zzfz) zzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
        this.e.g = null;
        this.e.a = 0;
        synchronized (this.b) {
            d dVar = this.d;
            if (dVar != null) {
                dVar.b();
            }
        }
    }
}

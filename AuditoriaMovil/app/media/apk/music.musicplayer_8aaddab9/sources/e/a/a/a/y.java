package e.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class y implements ServiceConnection {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public h f5024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f5025c;

    public /* synthetic */ y(d dVar, h hVar) {
        this.f5025c = dVar;
        this.f5024b = hVar;
    }

    public final void a(j jVar) {
        synchronized (this.a) {
            h hVar = this.f5024b;
            if (hVar != null) {
                hVar.a(jVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zza.zzj("BillingClient", "Billing service connected.");
        this.f5025c.f4982f = zzc.zzn(iBinder);
        d dVar = this.f5025c;
        if (dVar.k(new Callable() { // from class: e.a.a.a.x
            /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: e.a.a.a.w
            @Override // java.lang.Runnable
            public final void run() {
                y yVar = y.this;
                yVar.f5025c.a = 0;
                yVar.f5025c.f4982f = null;
                yVar.a(b0.f4977n);
            }
        }, dVar.h()) == null) {
            a(this.f5025c.j());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zza.zzk("BillingClient", "Billing service disconnected.");
        this.f5025c.f4982f = null;
        this.f5025c.a = 0;
        synchronized (this.a) {
            h hVar = this.f5024b;
            if (hVar != null) {
                hVar.b();
            }
        }
    }
}

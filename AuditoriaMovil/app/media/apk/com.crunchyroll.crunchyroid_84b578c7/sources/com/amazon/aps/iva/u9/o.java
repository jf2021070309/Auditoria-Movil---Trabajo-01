package com.amazon.aps.iva.u9;

import android.content.Context;
import com.amazon.aps.iva.k9.t;
import com.amazon.aps.iva.v9.a;
import java.util.UUID;
/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class o implements Runnable {
    public final /* synthetic */ com.amazon.aps.iva.v9.c b;
    public final /* synthetic */ UUID c;
    public final /* synthetic */ com.amazon.aps.iva.k9.g d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ p f;

    public o(p pVar, com.amazon.aps.iva.v9.c cVar, UUID uuid, com.amazon.aps.iva.k9.g gVar, Context context) {
        this.f = pVar;
        this.b = cVar;
        this.c = uuid;
        this.d = gVar;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.b.b instanceof a.b)) {
                String uuid = this.c.toString();
                t f = ((com.amazon.aps.iva.t9.r) this.f.c).f(uuid);
                if (f != null && !f.isFinished()) {
                    ((com.amazon.aps.iva.l9.d) this.f.b).d(uuid, this.d);
                    this.e.startService(androidx.work.impl.foreground.a.a(this.e, uuid, this.d));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.b.h(null);
        } catch (Throwable th) {
            this.b.i(th);
        }
    }
}

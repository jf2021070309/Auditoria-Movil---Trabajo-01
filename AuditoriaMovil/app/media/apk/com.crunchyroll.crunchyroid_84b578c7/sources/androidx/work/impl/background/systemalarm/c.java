package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.t9.p;
import com.amazon.aps.iva.t9.r;
import com.amazon.aps.iva.u9.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.p9.c, com.amazon.aps.iva.l9.b, s.b {
    public final Context b;
    public final int c;
    public final String d;
    public final d e;
    public final com.amazon.aps.iva.p9.d f;
    public PowerManager.WakeLock i;
    public boolean j = false;
    public int h = 0;
    public final Object g = new Object();

    static {
        m.e("DelayMetCommandHandler");
    }

    public c(Context context, int i, String str, d dVar) {
        this.b = context;
        this.c = i;
        this.e = dVar;
        this.d = str;
        this.f = new com.amazon.aps.iva.p9.d(context, dVar.c, this);
    }

    @Override // com.amazon.aps.iva.u9.s.b
    public final void a(String str) {
        m c = m.c();
        String.format("Exceeded time limits on execution for %s", str);
        c.a(new Throwable[0]);
        e();
    }

    public final void b() {
        synchronized (this.g) {
            this.f.c();
            this.e.d.b(this.d);
            PowerManager.WakeLock wakeLock = this.i;
            if (wakeLock != null && wakeLock.isHeld()) {
                m c = m.c();
                String.format("Releasing wakelock %s for WorkSpec %s", this.i, this.d);
                c.a(new Throwable[0]);
                this.i.release();
            }
        }
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void c(ArrayList arrayList) {
        e();
    }

    public final void d() {
        Integer valueOf = Integer.valueOf(this.c);
        String str = this.d;
        this.i = com.amazon.aps.iva.u9.m.a(this.b, String.format("%s (%s)", str, valueOf));
        m c = m.c();
        String.format("Acquiring wakelock %s for WorkSpec %s", this.i, str);
        c.a(new Throwable[0]);
        this.i.acquire();
        p i = ((r) this.e.f.c.n()).i(str);
        if (i == null) {
            e();
            return;
        }
        boolean b = i.b();
        this.j = b;
        if (!b) {
            m c2 = m.c();
            String.format("No constraints for %s", str);
            c2.a(new Throwable[0]);
            g(Collections.singletonList(str));
            return;
        }
        this.f.b(Collections.singletonList(i));
    }

    public final void e() {
        synchronized (this.g) {
            if (this.h < 2) {
                this.h = 2;
                m c = m.c();
                String.format("Stopping work for WorkSpec %s", this.d);
                c.a(new Throwable[0]);
                Context context = this.b;
                String str = this.d;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                d dVar = this.e;
                dVar.d(new d.b(this.c, intent, dVar));
                if (this.e.e.c(this.d)) {
                    m c2 = m.c();
                    String.format("WorkSpec %s needs to be rescheduled", this.d);
                    c2.a(new Throwable[0]);
                    Intent b = a.b(this.b, this.d);
                    d dVar2 = this.e;
                    dVar2.d(new d.b(this.c, b, dVar2));
                } else {
                    m c3 = m.c();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.d);
                    c3.a(new Throwable[0]);
                }
            } else {
                m c4 = m.c();
                String.format("Already stopped work for %s", this.d);
                c4.a(new Throwable[0]);
            }
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        m c = m.c();
        String.format("onExecuted %s, %s", str, Boolean.valueOf(z));
        c.a(new Throwable[0]);
        b();
        int i = this.c;
        d dVar = this.e;
        Context context = this.b;
        if (z) {
            dVar.d(new d.b(i, a.b(context, this.d), dVar));
        }
        if (this.j) {
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            dVar.d(new d.b(i, intent, dVar));
        }
    }

    @Override // com.amazon.aps.iva.p9.c
    public final void g(List<String> list) {
        if (!list.contains(this.d)) {
            return;
        }
        synchronized (this.g) {
            if (this.h == 0) {
                this.h = 1;
                m c = m.c();
                String.format("onAllConstraintsMet for %s", this.d);
                c.a(new Throwable[0]);
                if (this.e.e.e(this.d, null)) {
                    this.e.d.a(this.d, this);
                } else {
                    b();
                }
            } else {
                m c2 = m.c();
                String.format("Already started work for %s", this.d);
                c2.a(new Throwable[0]);
            }
        }
    }
}

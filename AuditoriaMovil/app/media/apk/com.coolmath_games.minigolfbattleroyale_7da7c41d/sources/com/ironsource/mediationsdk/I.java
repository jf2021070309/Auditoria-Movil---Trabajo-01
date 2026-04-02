package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public final class I {
    G c;
    private final List<String> e;
    private final int f;
    ConcurrentHashMap<String, CopyOnWriteArrayList<G>> a = new ConcurrentHashMap<>();
    String b = "";
    private String d = "";
    private final Timer g = new Timer();

    public I(List<String> list, int i) {
        this.e = list;
        this.f = i;
    }

    private synchronized boolean c() {
        boolean z;
        if (this.c != null) {
            z = this.c.b.equals(this.d);
        }
        return z;
    }

    private void d() {
        Iterator<G> it = a().iterator();
        while (it.hasNext()) {
            G next = it.next();
            if (!next.equals(this.c)) {
                next.d();
            }
        }
    }

    public final CopyOnWriteArrayList<G> a() {
        CopyOnWriteArrayList<G> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final synchronized void a(G g) {
        IronLog.INTERNAL.verbose("");
        if (this.c != null) {
            this.c.d();
        }
        this.c = g;
    }

    public final void a(CopyOnWriteArrayList<G> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("updating new  waterfall with id " + str);
        d();
        this.a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.d)) {
            if (c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.info("ad from previous waterfall " + this.d + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                String str2 = this.b;
                this.b = this.d;
                this.d = str2;
            }
            final String str3 = this.d;
            this.g.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.I.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    try {
                        IronLog ironLog3 = IronLog.INTERNAL;
                        ironLog3.info("removing waterfall with id " + str3 + " from memory");
                        I.this.a.remove(str3);
                        IronLog ironLog4 = IronLog.INTERNAL;
                        ironLog4.info("waterfall size is currently " + I.this.a.size());
                    } finally {
                        cancel();
                    }
                }
            }, this.f);
        }
        this.d = this.b;
        this.b = str;
    }

    public final boolean b() {
        return this.a.size() > 5;
    }

    public final synchronized boolean b(G g) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (g != null && (this.c == null || ((g.c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.c.k().equals(g.k())) && ((g.c() != LoadWhileShowSupportState.NONE && !this.e.contains(g.l())) || !this.c.l().equals(g.l()))))) {
            z = false;
            if (z && g != null) {
                IronLog.INTERNAL.info(g.k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        if (z) {
            IronLog.INTERNAL.info(g.k() + " does not support load while show and will not be added to the auction request");
        }
        return !z;
    }
}

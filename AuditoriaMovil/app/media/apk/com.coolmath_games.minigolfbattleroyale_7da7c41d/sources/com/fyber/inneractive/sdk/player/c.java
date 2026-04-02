package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes.dex */
public final class c {
    com.fyber.inneractive.sdk.player.b.f a;
    public ScheduledThreadPoolExecutor b;
    int d;
    boolean e = false;
    public Runnable c = new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            IAlog.b("player progress monitor: run started", new Object[0]);
            int g = cVar.a.g();
            if (!cVar.e) {
                IAlog.b("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(g - cVar.d));
                if (g - cVar.d >= 2000) {
                    IAlog.b("run: setting played 2 seconds flag", new Object[0]);
                    cVar.e = true;
                }
            }
            cVar.a.b(g);
        }
    };

    public c(com.fyber.inneractive.sdk.player.b.f fVar) {
        this.a = fVar;
    }
}

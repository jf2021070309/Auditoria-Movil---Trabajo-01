package com.fyber.inneractive.sdk.player.a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class f {
    private static f j = new f();
    public ServerSocket b;
    public int c;
    public Thread d;
    public AtomicBoolean a = new AtomicBoolean(false);
    public boolean e = false;
    List<a> f = new CopyOnWriteArrayList();
    List<k> h = new CopyOnWriteArrayList();
    public Runnable i = new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.f.2
        @Override // java.lang.Runnable
        public final void run() {
            while (f.this.a.compareAndSet(true, true)) {
                try {
                    Socket accept = f.this.b.accept();
                    IAlog.a("MediaCacheStreamer Got a possible connection - %s", accept);
                    f.a(f.this, accept);
                } catch (IOException e) {
                    IAlog.a("MediaCacheStreamer Failed accepting connections", e, new Object[0]);
                }
            }
        }
    };
    Executor g = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.fyber.inneractive.sdk.player.a.f.1
        AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MediaCacheStreamer-HandlerThread-" + this.a.getAndIncrement());
        }
    });

    private f() {
    }

    public static f a() {
        return j;
    }

    public final a a(String str) {
        for (a aVar : this.f) {
            if (aVar.g.startsWith(str.contains("?") ? str.substring(1).substring(0, str.indexOf("?") - 1) : str.substring(1))) {
                return aVar;
            }
        }
        return null;
    }

    static /* synthetic */ void a(f fVar, Socket socket) {
        final k kVar = new k(fVar, socket);
        Executor newSingleThreadExecutor = kVar.a == null ? Executors.newSingleThreadExecutor() : kVar.a;
        IAlog.a("StreamingHandler[%s] requesting execution of a new runnable", kVar);
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.fyber.inneractive.sdk.player.a.k.1
            @Override // java.lang.Runnable
            public final void run() {
                IAlog.a("StreamingHandler[%s] execution start", this);
                try {
                    k.a(kVar);
                } finally {
                    try {
                        IAlog.a("StreamingHandler[%s] execution finish", this);
                    } finally {
                    }
                }
                IAlog.a("StreamingHandler[%s] execution finish", this);
            }
        });
        fVar.h.add(kVar);
    }
}

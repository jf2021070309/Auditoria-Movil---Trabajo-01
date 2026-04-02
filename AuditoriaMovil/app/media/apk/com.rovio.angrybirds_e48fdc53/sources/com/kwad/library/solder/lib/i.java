package com.kwad.library.solder.lib;

import android.content.Context;
import com.kwad.library.solder.lib.a.f;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.library.solder.lib.ext.c;
import com.kwad.sdk.utils.bj;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class i {
    private static volatile i afU;
    private static a afW;
    private e afV;
    private volatile boolean mHasInit = false;

    /* loaded from: classes.dex */
    public interface a {
        void b(String str, File file);

        void d(String str, Throwable th);

        int getMaxRetryCount();

        boolean wl();
    }

    private i() {
    }

    public static void a(a aVar) {
        afW = aVar;
    }

    private synchronized void init(Context context) {
        if (this.mHasInit) {
            return;
        }
        c.a bL = new c.a().bL("sodler");
        a aVar = afW;
        c.a bK = bL.bK(aVar != null ? aVar.getMaxRetryCount() : 1);
        boolean z = false;
        c.a ba = bK.ba(false);
        a aVar2 = afW;
        if (aVar2 != null && aVar2.wl()) {
            z = true;
        }
        com.kwad.library.solder.lib.ext.c wM = ba.bb(z).a(wj()).wM();
        d dVar = new d(context);
        c cVar = new c(context, wM);
        f fVar = new f(context);
        fVar.a(new f.a() { // from class: com.kwad.library.solder.lib.i.2
            @Override // com.kwad.library.solder.lib.a.f.a
            public final void a(com.kwad.library.solder.lib.a.e eVar, File file) {
                if (i.afW != null) {
                    try {
                        i.afW.b(eVar.getDownloadUrl(), file);
                    } catch (Throwable th) {
                        i.afW.d(eVar.getDownloadUrl(), th);
                        throw new PluginError.UpdateError(th.getMessage(), 1);
                    }
                }
            }
        });
        this.afV = new e(dVar, fVar, cVar, wM, new com.kwad.library.solder.lib.ext.a());
        this.mHasInit = true;
    }

    public static i wi() {
        if (afU == null) {
            synchronized (i.class) {
                if (afU == null) {
                    afU = new i();
                }
            }
        }
        return afU;
    }

    private static ExecutorService wj() {
        return new ThreadPoolExecutor(0, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.kwad.library.solder.lib.i.1
            private final AtomicInteger poolNumber = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ksad-Sodler-" + this.poolNumber.getAndIncrement());
            }
        });
    }

    public final <P extends com.kwad.library.solder.lib.a.a, R extends com.kwad.library.solder.lib.a.e<P>> void a(Context context, R r, com.kwad.library.solder.lib.ext.b<P, R> bVar) {
        init(context);
        r.bJ(this.afV.wc().getRetryCount());
        r.a(new b<P, R>(bVar, new b.C0240b()) { // from class: com.kwad.library.solder.lib.i.3
            /* JADX WARN: Incorrect types in method signature: (TR;Lcom/kwad/library/solder/lib/ext/PluginError;)V */
            @Override // com.kwad.library.solder.lib.b, com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public final void a(final com.kwad.library.solder.lib.a.e eVar, PluginError pluginError) {
                super.a((AnonymousClass3<P, R>) eVar, pluginError);
                com.kwad.library.solder.lib.a.e("Sodler", "load failed:" + pluginError.getCode() + ":" + pluginError.getMessage());
                i.this.afV.g(eVar);
                bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.library.solder.lib.i.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (eVar.ws()) {
                            i.this.afV.a(eVar, 16);
                        }
                    }
                }, eVar.wr() instanceof PluginError.UpdateError ? 1000L : 0L);
            }
        });
        this.afV.a(r, 16);
    }

    public final com.kwad.library.solder.lib.a.a bC(String str) {
        if (this.mHasInit) {
            try {
                e eVar = this.afV;
                if (eVar != null) {
                    return eVar.wd().bC(str);
                }
                return null;
            } catch (Exception e) {
                com.kwad.library.solder.lib.a.e("Sodler", e);
                return null;
            }
        }
        throw new RuntimeException("Sodler has not yet been init.");
    }

    public final com.kwad.library.solder.lib.ext.c wc() {
        if (this.mHasInit) {
            return this.afV.wc();
        }
        throw new RuntimeException("Sodler has not yet been init.");
    }
}

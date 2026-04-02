package com.fyber.inneractive.sdk.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.d.a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class f implements a.InterfaceC0066a {
    Context f;
    c i;
    boolean k;
    Handler l;
    TextureView m;
    SurfaceTexture n;
    Surface o;
    TextureView.SurfaceTextureListener p;
    boolean s;
    protected com.fyber.inneractive.sdk.player.enums.b j = com.fyber.inneractive.sdk.player.enums.b.Idle;
    boolean q = false;
    protected boolean r = false;
    List<b> g = new CopyOnWriteArrayList();
    List<a> h = new CopyOnWriteArrayList();
    private com.fyber.inneractive.sdk.player.c a = new com.fyber.inneractive.sdk.player.c(this);

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.fyber.inneractive.sdk.player.enums.b bVar);

        void a(Exception exc);

        void c(boolean z);

        void t();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();

        void c();
    }

    public abstract void a(int i);

    protected abstract void a(Surface surface);

    public abstract void a(String str, int i);

    public abstract void a(boolean z);

    public abstract void b(boolean z);

    public abstract boolean b();

    public abstract void c();

    protected abstract void c(boolean z);

    public abstract int d();

    public abstract int e();

    public abstract void f();

    public abstract int g();

    public abstract int h();

    public abstract boolean i();

    public abstract Bitmap j();

    public abstract boolean k();

    public abstract String l();

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Context context) {
        this.f = null;
        this.f = context.getApplicationContext();
        this.l = new Handler(context.getMainLooper());
        c(true);
    }

    public final void a(b bVar) {
        List<b> list = this.g;
        if (list == null || list.contains(bVar)) {
            return;
        }
        this.g.add(bVar);
    }

    public final void a(a aVar) {
        List<a> list = this.h;
        if (list == null || list.contains(aVar)) {
            return;
        }
        this.h.add(aVar);
    }

    public final com.fyber.inneractive.sdk.player.enums.b p() {
        return this.j;
    }

    public boolean m() {
        return this.j == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public final boolean q() {
        return this.r;
    }

    @Override // com.fyber.inneractive.sdk.player.d.a.InterfaceC0066a
    public final void a(final Exception exc) {
        a(com.fyber.inneractive.sdk.player.enums.b.Error);
        IAlog.b("%sonPlayerError called with: %s for onPlayerError", IAlog.a(this), exc);
        this.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (f.this.k) {
                    return;
                }
                try {
                    if (f.this.g != null) {
                        for (b bVar : f.this.g) {
                            bVar.a(exc);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.a <= 3) {
                        IAlog.b("%sonPlayerError callback threw an exception!", IAlog.a(f.this));
                        e.printStackTrace();
                    }
                }
            }
        });
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(final boolean z) {
        this.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.3
            @Override // java.lang.Runnable
            public final void run() {
                if (f.this.k) {
                    return;
                }
                try {
                    if (f.this.g != null) {
                        for (b bVar : f.this.g) {
                            bVar.c(z);
                        }
                    }
                } catch (Exception unused) {
                    if (IAlog.a <= 3) {
                        IAlog.b("%sonPlayerError callback threw an exception!", IAlog.a(f.this));
                    }
                }
            }
        });
    }

    public void b(final int i) {
        this.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (f.this.h != null) {
                        for (a aVar : f.this.h) {
                            aVar.a(i);
                        }
                    }
                } catch (Exception e) {
                    if (IAlog.a <= 3) {
                        IAlog.b("%sonPlayerProgress callback threw an exception!", IAlog.a(f.this));
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.fyber.inneractive.sdk.player.d.a.InterfaceC0066a
    public final void a(final com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.j) {
            return;
        }
        this.j = bVar;
        if (bVar != com.fyber.inneractive.sdk.player.enums.b.Playing) {
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                r();
            }
        } else {
            com.fyber.inneractive.sdk.player.c cVar = this.a;
            if (cVar != null && cVar.b == null) {
                cVar.b = new ScheduledThreadPoolExecutor(1);
                cVar.b.scheduleAtFixedRate(cVar.c, 100L, 1000L, TimeUnit.MILLISECONDS);
            }
        }
        this.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        if (f.this.g != null) {
                            for (b bVar2 : f.this.g) {
                                bVar2.a(bVar);
                            }
                        }
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                            if (f.this.n != null && f.this.m != null && f.this.m.getParent() != null) {
                                ((ViewGroup) f.this.m.getParent()).removeView(f.this.m);
                            }
                            f.this.m = null;
                            f.this.n = null;
                        }
                    } catch (Exception e) {
                        if (IAlog.a <= 3) {
                            IAlog.b("%sonPlayerStateChanged callback threw an exception!", IAlog.a(f.this));
                            e.printStackTrace();
                        }
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                            if (f.this.n != null && f.this.m != null && f.this.m.getParent() != null) {
                                ((ViewGroup) f.this.m.getParent()).removeView(f.this.m);
                            }
                            f.this.m = null;
                            f.this.n = null;
                        }
                    }
                } catch (Throwable th) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                        if (f.this.n != null && f.this.m != null && f.this.m.getParent() != null) {
                            ((ViewGroup) f.this.m.getParent()).removeView(f.this.m);
                        }
                        f.this.m = null;
                        f.this.n = null;
                    }
                    throw th;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        com.fyber.inneractive.sdk.player.c cVar = this.a;
        if (cVar == null || cVar.b == null) {
            return;
        }
        cVar.b.shutdownNow();
        cVar.b = null;
    }

    public void a() {
        IAlog.b("%sdestroy started", IAlog.a(this));
        r();
        this.a = null;
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        List<b> list = this.g;
        if (list != null) {
            list.clear();
        }
        this.g = null;
        this.k = true;
        IAlog.b("%sdestroy finished", IAlog.a(this));
    }

    static /* synthetic */ void a(f fVar, SurfaceTexture surfaceTexture) {
        boolean z = !surfaceTexture.equals(fVar.n);
        fVar.n = surfaceTexture;
        if (fVar.o == null || z) {
            fVar.o = new Surface(fVar.n);
        }
        fVar.a(fVar.o);
    }
}

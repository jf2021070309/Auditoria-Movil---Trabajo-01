package com.fyber.inneractive.sdk.player.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.player.a.d;
import com.fyber.inneractive.sdk.player.a.g;
import com.fyber.inneractive.sdk.player.c.a.e;
import com.fyber.inneractive.sdk.player.c.e;
import com.fyber.inneractive.sdk.player.c.g.b;
import com.fyber.inneractive.sdk.player.c.j.g;
import com.fyber.inneractive.sdk.player.c.j.k;
import com.fyber.inneractive.sdk.player.c.j.o;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.n;
import com.fyber.inneractive.sdk.player.d.a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.q;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class d extends f implements d.a, d.b {
    private static final String w = null;
    private a A;
    private final int B;
    private final int C;
    private boolean D;
    private final boolean E;
    private Bitmap F;
    private int G;
    private String H;
    private final List<com.fyber.inneractive.sdk.player.a.g> I;
    private com.fyber.inneractive.sdk.player.c.g.d J;
    private boolean K;
    private int L;
    int a;
    int b;
    boolean c;
    Surface d;
    SurfaceHolder e;
    private final int t;
    private final s u;
    private int v;
    private com.fyber.inneractive.sdk.player.c.e x;
    private n[] y;
    private Handler z;

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean k() {
        return true;
    }

    static /* synthetic */ com.fyber.inneractive.sdk.player.c.e b(d dVar) {
        dVar.x = null;
        return null;
    }

    public d(Context context, boolean z, s sVar) {
        super(context);
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.d = null;
        this.e = null;
        this.B = 6;
        this.C = 3;
        this.D = false;
        this.I = new CopyOnWriteArrayList();
        this.J = null;
        this.L = 0;
        this.E = z;
        this.u = sVar;
        this.v = IAConfigManager.c().a.a("extractor_source_retry_count", 6, 3);
        s sVar2 = this.u;
        com.fyber.inneractive.sdk.config.a.a.f fVar = sVar2 != null ? (com.fyber.inneractive.sdk.config.a.a.f) sVar2.a(com.fyber.inneractive.sdk.config.a.a.f.class) : null;
        this.t = fVar == null ? 0 : fVar.a("max_tries", 0);
        IAlog.b("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a() {
        if (this.x != null) {
            if (!this.D) {
                this.D = true;
                m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (d.this.x != null) {
                            d.this.x.a();
                            d.this.x.b();
                            d.this.x.c();
                            d.b(d.this);
                        }
                    }
                });
            }
            this.A.a.clear();
            this.A = null;
        }
        for (com.fyber.inneractive.sdk.player.a.g gVar : this.I) {
            gVar.c();
            com.fyber.inneractive.sdk.player.a.n.a().b(gVar.d());
        }
        this.I.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(boolean z) {
        this.r = z;
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || this.D || this.y.length < 2) {
            return;
        }
        eVar.a(new e.c(this.y[1], 2, new Float(0.0f)));
        this.c = true;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void b(boolean z) {
        this.r = z;
        if (this.x == null || this.D) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        IAlog.b(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f));
        if (f == 0.0f) {
            f = 0.1f;
        }
        if (this.y.length >= 2) {
            this.x.a(new e.c(this.y[1], 2, new Float(f)));
        }
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean b() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void c() {
        com.fyber.inneractive.sdk.player.enums.b p = p();
        if (p == com.fyber.inneractive.sdk.player.enums.b.Idle || p == com.fyber.inneractive.sdk.player.enums.b.Completed || p == com.fyber.inneractive.sdk.player.enums.b.Paused || p == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.b("%s paused called when player is in mState: %s ignoring", IAlog.a(this), p);
            return;
        }
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar != null && !this.D) {
            eVar.a(false);
        }
        r();
        a(com.fyber.inneractive.sdk.player.enums.b.Paused);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int d() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int e() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean m() {
        return (this.x == null || this.D || this.j != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int g() {
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || this.D) {
            return 0;
        }
        return (int) eVar.f();
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final int h() {
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || this.D) {
            return 0;
        }
        return (int) eVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    protected final void c(boolean z) {
        if (this.x != null || this.D) {
            return;
        }
        this.K = z;
        IAlog.b("%sMediaPlayerController: creating media player", IAlog.a(this));
        a aVar = this.A;
        if (aVar != null) {
            aVar.a.clear();
        }
        this.A = new a(this, (byte) 0);
        this.z = new Handler(Looper.getMainLooper());
        n[] nVarArr = new n[z ? 2 : 1];
        this.y = nVarArr;
        nVarArr[0] = new com.fyber.inneractive.sdk.player.c.l.d(this.f, com.fyber.inneractive.sdk.player.c.e.c.a, this.z, this.A);
        if (z) {
            this.y[1] = new com.fyber.inneractive.sdk.player.c.a.h(com.fyber.inneractive.sdk.player.c.e.c.a);
        }
        com.fyber.inneractive.sdk.player.c.f fVar = new com.fyber.inneractive.sdk.player.c.f(this.y, new com.fyber.inneractive.sdk.player.c.i.b(), new com.fyber.inneractive.sdk.player.c.c());
        this.x = fVar;
        fVar.a(this.A);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(String str, int i) {
        b(str, i);
    }

    public final void b(String str, int i) {
        g.a aVar;
        g.a eVar;
        if (this.x == null || this.D) {
            return;
        }
        IAlog.b("%sloadMediaPlayerUri called with %s", IAlog.a(this), str);
        this.H = str;
        this.G = i;
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(null)) {
            t.b(parse);
        } else {
            t.g("." + ((String) null));
        }
        if (this.E && com.fyber.inneractive.sdk.player.a.n.a().b()) {
            eVar = new com.fyber.inneractive.sdk.player.a.e(this, this, i, this.u);
        } else {
            k kVar = new k();
            g.a mVar = new com.fyber.inneractive.sdk.player.c.j.m(this.f, kVar, new o(IAConfigManager.b().a(), kVar));
            File a2 = com.fyber.inneractive.sdk.player.a.n.a(this.f, "ia-vid-cache-ex2");
            if (a2 != null) {
                eVar = new com.fyber.inneractive.sdk.player.c.j.a.e(new com.fyber.inneractive.sdk.player.c.j.a.k(a2, new com.fyber.inneractive.sdk.player.c.j.a.j()), mVar);
            } else {
                aVar = mVar;
                com.fyber.inneractive.sdk.player.c.g.b bVar = new com.fyber.inneractive.sdk.player.c.g.b(parse, aVar, new com.fyber.inneractive.sdk.player.c.d.c(), this.v, this.z, this.A, w);
                this.J = bVar;
                a(bVar);
            }
        }
        aVar = eVar;
        com.fyber.inneractive.sdk.player.c.g.b bVar2 = new com.fyber.inneractive.sdk.player.c.g.b(parse, aVar, new com.fyber.inneractive.sdk.player.c.d.c(), this.v, this.z, this.A, w);
        this.J = bVar2;
        a(bVar2);
    }

    private void a(com.fyber.inneractive.sdk.player.c.g.d dVar) {
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || dVar == null) {
            return;
        }
        eVar.a(dVar);
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }

    @Override // com.fyber.inneractive.sdk.player.a.d.a
    public final void a(Bitmap bitmap) {
        this.F = bitmap;
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final Bitmap j() {
        return this.F;
    }

    @Override // com.fyber.inneractive.sdk.player.a.d.b
    public final void a(com.fyber.inneractive.sdk.player.a.g gVar) {
        this.I.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements e.a, b.a, com.fyber.inneractive.sdk.player.c.l.f {
        final WeakReference<d> a;
        private boolean b;

        /* synthetic */ a(d dVar, byte b) {
            this(dVar);
        }

        private a(d dVar) {
            this.b = false;
            this.a = new WeakReference<>(dVar);
        }

        private String a() {
            WeakReference<d> weakReference = this.a;
            d dVar = weakReference == null ? null : weakReference.get();
            if (dVar == null) {
                return getClass().getName();
            }
            return IAlog.a(dVar);
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.a
        public final void a(boolean z, int i) {
            IAlog.b("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z), Integer.valueOf(i));
            WeakReference<d> weakReference = this.a;
            d dVar = weakReference == null ? null : weakReference.get();
            if (dVar == null || dVar.x == null || dVar.D) {
                return;
            }
            if (i != 3) {
                if (i == 2) {
                    if (dVar.p() == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                        dVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    }
                } else if (i == 4) {
                    dVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                }
            } else if (!z) {
                if (dVar.p() == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                    if (dVar.x.d() != null && dVar.x.d().a > 0) {
                        com.fyber.inneractive.sdk.player.c.i.e eVar = dVar.x.d().b[0];
                        com.fyber.inneractive.sdk.player.c.h c = eVar != null ? eVar.c() : null;
                        if (c != null) {
                            int i2 = c.j;
                            int i3 = c.k;
                            dVar.a = i2;
                            dVar.b = i3;
                        }
                    }
                    this.b = true;
                    dVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                }
            } else {
                dVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.e.a
        public final void a(com.fyber.inneractive.sdk.player.c.d dVar) {
            d dVar2 = this.a.get();
            if (dVar2 == null || !dVar2.K || !dVar2.E || this.b || !(dVar.getCause() instanceof e.d)) {
                if (dVar2 != null && dVar2.E && !this.b && com.fyber.inneractive.sdk.player.a.n.a().b() && dVar2.L < dVar2.t) {
                    dVar2.o();
                    return;
                }
                a.b bVar = new a.b(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
                IAlog.b("%sonPlayerError called with %s for sendErrorState", a(), bVar);
                d dVar3 = (d) q.a(this.a);
                if (dVar3 != null) {
                    dVar3.a(bVar);
                    return;
                }
                return;
            }
            dVar2.n();
        }

        @Override // com.fyber.inneractive.sdk.player.c.l.f
        public final void a(int i, int i2) {
            WeakReference<d> weakReference = this.a;
            d dVar = weakReference == null ? null : weakReference.get();
            if (dVar != null) {
                dVar.a = i;
                dVar.b = i2;
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.g.b.a
        public final void a(IOException iOException) {
            if (this.a != null && (iOException.getCause() instanceof g.c) && this.a.get().E) {
                this.a.get().b(this.a.get().H, this.a.get().G);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final String l() {
        return this.E ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final boolean i() {
        return this.E;
    }

    public final void n() {
        this.c = true;
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar != null) {
            eVar.c();
            this.x = null;
        }
        c(false);
        a(this.J);
        d(false);
    }

    public final void o() {
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar != null) {
            eVar.c();
            this.x = null;
        }
        c(true);
        a(this.J);
        this.L++;
        d(true);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(int i) {
        IAlog.b("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i), true);
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || this.D) {
            return;
        }
        eVar.a(true);
        this.x.a(i);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void f() {
        IAlog.b("%sstart called", IAlog.a(this));
        if (this.x == null || this.D) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        this.x.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.b.f
    public final void a(Surface surface) {
        IAlog.b("%ssetSurface called with %s", IAlog.a(this), surface);
        this.d = surface;
        com.fyber.inneractive.sdk.player.c.e eVar = this.x;
        if (eVar == null || this.D) {
            return;
        }
        eVar.a(new e.c(this.y[0], 1, this.d));
    }
}

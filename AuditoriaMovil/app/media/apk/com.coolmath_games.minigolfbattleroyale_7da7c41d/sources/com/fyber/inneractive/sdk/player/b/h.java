package com.fyber.inneractive.sdk.player.b;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.work.impl.Scheduler;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.g.a.r;
import com.fyber.inneractive.sdk.m.d;
import com.fyber.inneractive.sdk.player.b.f;
import com.fyber.inneractive.sdk.player.b.j;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.aj;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.u;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.videokit.R;
/* loaded from: classes.dex */
public abstract class h<ListenerT extends j> implements b<ListenerT>, f.a, f.b, com.fyber.inneractive.sdk.player.e.f {
    private Runnable a;
    private float b;
    private boolean c;
    protected com.fyber.inneractive.sdk.player.b d;
    protected u e;
    protected s f;
    protected com.fyber.inneractive.sdk.player.e.g g;
    f.c h;
    protected int i;
    protected ListenerT j;
    protected boolean k;
    Runnable l;
    Application.ActivityLifecycleCallbacks m;
    protected boolean n;
    Bitmap o;
    AsyncTask<?, ?, ?> p;
    boolean q;
    com.fyber.inneractive.sdk.player.e.c r;
    protected Skip s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private GestureDetector x;

    protected void a(aj ajVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void a(Exception exc) {
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void c(boolean z) {
    }

    protected abstract boolean f();

    protected abstract int g();

    protected abstract int i();

    protected abstract void j();

    public void l() {
    }

    protected void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public boolean c() {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar == null) {
            return false;
        }
        if (this.k || !bVar.r()) {
            return true;
        }
        com.fyber.inneractive.sdk.player.e.g gVar = this.g;
        if (gVar == null || !gVar.i()) {
            return com.fyber.inneractive.sdk.player.b.a(this.d.q(), this.d.s(), com.fyber.inneractive.sdk.player.b.a(this.d)) && !this.k && this.i == 0;
        }
        return true;
    }

    public h(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.e.g gVar, u uVar, s sVar, boolean z) {
        this(bVar, gVar, uVar, sVar, z, null);
    }

    public h(com.fyber.inneractive.sdk.player.b bVar, com.fyber.inneractive.sdk.player.e.g gVar, u uVar, s sVar, boolean z, Skip skip) {
        this.i = 0;
        this.k = false;
        this.b = -0.1f;
        this.t = false;
        this.u = false;
        this.o = null;
        this.p = null;
        this.v = false;
        this.w = false;
        this.q = false;
        this.s = null;
        this.s = skip;
        this.d = bVar;
        this.e = uVar;
        this.f = sVar;
        this.g = gVar;
        this.n = z;
        gVar.setListener(this);
        com.fyber.inneractive.sdk.player.b bVar2 = this.d;
        if (bVar2 != null && bVar2.f() != null) {
            this.d.f().a((f.b) this);
            this.d.f().a((f.a) this);
        }
        this.x = new GestureDetector(gVar.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.fyber.inneractive.sdk.player.b.h.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void a(ListenerT listenert) {
        this.j = listenert;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        Bitmap b;
        if (this.r != null) {
            IAlog.b("%sdestroyTextureView", IAlog.a(this));
            if (!(this.o != null) || (b = b(false)) == null) {
                return;
            }
            this.g.setLastFrameBitmap(b);
            this.g.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar != null) {
            if (!bVar.d()) {
                n();
            } else if (z && this.d.f() != null) {
                this.d.f().a(0);
            } else {
                this.d.e();
            }
        }
    }

    private void s() {
        Runnable runnable = this.l;
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        this.g.g(false);
        this.g.f(false);
        this.g.b(false, false);
        this.g.c(true);
        this.g.b(true);
        this.g.d(true);
        s();
        if (this.d != null && f() && !this.k && com.fyber.inneractive.sdk.player.b.a(this.d.q(), this.d.s(), com.fyber.inneractive.sdk.player.b.a(this.d)) && this.a == null) {
            if (this.i <= 0) {
                this.g.e(true);
                x();
            } else {
                com.fyber.inneractive.sdk.player.b bVar = this.d;
                if (bVar != null && bVar.f() != null) {
                    if (this.i >= this.d.f().h() / 1000) {
                        this.g.e(false);
                    }
                }
                this.g.e(true);
                c(this.i);
            }
        }
        ListenerT listenert = this.j;
        if (listenert != null && !this.c) {
            this.c = true;
            listenert.b();
        }
        this.u = false;
        this.w = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        s();
        this.g.g(false);
        n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        if (this.g.e()) {
            return;
        }
        this.g.g(false);
        s();
        n();
        this.c = false;
        this.k = true;
    }

    private void a(int i, int i2) {
        Bitmap bitmap = this.o;
        if (!(bitmap != null && bitmap.getWidth() == i && this.o.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.p;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.o = null;
            AsyncTask<Integer, Void, Bitmap> asyncTask2 = new AsyncTask<Integer, Void, Bitmap>() { // from class: com.fyber.inneractive.sdk.player.b.h.3
                @Override // android.os.AsyncTask
                protected final /* synthetic */ Bitmap doInBackground(Integer[] numArr) {
                    Integer[] numArr2 = numArr;
                    int intValue = numArr2[0].intValue();
                    int intValue2 = numArr2[1].intValue();
                    Application p = l.p();
                    if (p == null || p.getResources() == null || p.getResources().getDisplayMetrics() == null) {
                        return null;
                    }
                    DisplayMetrics displayMetrics = p.getResources().getDisplayMetrics();
                    Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (createBitmap != null) {
                        createBitmap.setDensity(displayMetrics.densityDpi);
                    }
                    return createBitmap;
                }

                @Override // android.os.AsyncTask
                protected final /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap2) {
                    Bitmap bitmap3 = bitmap2;
                    super.onPostExecute(bitmap3);
                    h hVar = h.this;
                    hVar.o = bitmap3;
                    hVar.p = null;
                }
            };
            this.p = asyncTask2;
            l.a(asyncTask2, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final Bitmap b(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        if (this.o != null && (bVar = this.d) != null && bVar.f() != null) {
            if (this.u) {
                return this.d.g;
            }
            TextureView textureView = this.d.f().m;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.a(this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.b("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.a("creating bitmap on object - %s", this.o);
                    Bitmap bitmap = textureView.getBitmap(this.o);
                    if (this.g.getVideoWidth() > 0 && this.g.getVideoHeight() > 0) {
                        this.o = null;
                        a(this.g.getVideoWidth(), this.g.getVideoHeight());
                    }
                    if (z) {
                        com.fyber.inneractive.sdk.util.b bVar2 = new com.fyber.inneractive.sdk.util.b();
                        bVar2.c = 20;
                        bVar2.d = 1;
                        bVar2.a = bitmap.getWidth();
                        bVar2.b = bitmap.getHeight();
                        this.d.a(com.fyber.inneractive.sdk.util.a.a(this.g.getContext(), bitmap, bVar2));
                        this.u = true;
                    } else {
                        this.d.a(bitmap);
                    }
                    IAlog.a("%ssave snapshot succeeded", IAlog.a(this));
                    return this.d.g;
                } catch (Exception unused) {
                    IAlog.a("%ssave snapshot failed with exception", IAlog.a(this));
                }
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public void b() {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar == null || bVar.f() == null) {
            return;
        }
        if (this.d.f().p() == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.b("%spauseVideo called in bad state! %s", IAlog.a(this), this.d.f().p());
            return;
        }
        IAlog.b("%spauseVideo %s", IAlog.a(this), this.g);
        TextureView textureView = this.d.f().m;
        if (textureView == null || textureView.getParent() == null || !textureView.getParent().equals(this.g.getTextureHost())) {
            return;
        }
        this.d.f().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
        boolean b = IAConfigManager.c().a.b("endcard").b("dsos");
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if ((bVar != null && bVar.f() != null && this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) || ((this.w && !b) || this.q)) {
            com.fyber.inneractive.sdk.player.b bVar2 = this.d;
            View h = bVar2 != null ? bVar2.h() : null;
            com.fyber.inneractive.sdk.player.e.g gVar = this.g;
            gVar.e(false);
            gVar.b(false);
            gVar.c(false);
            gVar.d(false);
            gVar.a(false, false);
            if (gVar.t != null) {
                gVar.t.setVisibility(4);
            }
            if (h != null) {
                if (h instanceof com.fyber.inneractive.sdk.m.c) {
                    c i = this.d.i();
                    d.h hVar = new d.h() { // from class: com.fyber.inneractive.sdk.player.b.h.5
                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.l
                        public final void a(String str, String str2) {
                            IAlog.b(IAlog.a(h.this) + "web view callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
                            if (h.this.j != null) {
                                h.this.j.a(str, str2);
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final void a() {
                            com.fyber.inneractive.sdk.g.a.b n;
                            IAlog.b("%sweb view callback: onClickedAndOpen", IAlog.a(h.this));
                            if (h.this.j != null) {
                                if (h.this.d != null && (n = h.this.d.n()) != null) {
                                    h.this.d.a(n, VideoClickOrigin.COMPANION, r.EVENT_CLICK);
                                }
                                IAlog.a(IAlog.b, "AD_CLICKED", new Object[0]);
                                h.this.j.c();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.l
                        public final u.a a(String str, aj ajVar) {
                            com.fyber.inneractive.sdk.g.a.b n;
                            IAlog.b("%sweb view callback: onClicked", IAlog.a(h.this));
                            if (h.this.j != null) {
                                if (h.this.d != null && (n = h.this.d.n()) != null) {
                                    h.this.d.a(n, VideoClickOrigin.COMPANION, r.EVENT_CLICK);
                                }
                                IAlog.a(IAlog.b, "AD_CLICKED", new Object[0]);
                                return h.this.j.a(str, ajVar);
                            }
                            return new u.a(u.c.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
                        }

                        @Override // com.fyber.inneractive.sdk.m.l
                        public final void b() {
                            if (h.this.j != null) {
                                h.this.j.e_();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final boolean a(String str) {
                            View endCardView = h.this.g.getEndCardView();
                            if (h.this.j != null) {
                                h.this.j.a(endCardView, str);
                                return true;
                            }
                            return false;
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.c
                        public final void a(InneractiveUnitController.AdDisplayError adDisplayError) {
                            if (h.this.j != null) {
                                h.this.j.c_();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final void c() {
                            if (h.this.j != null) {
                                h.this.j.d_();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final void d() {
                            if (h.this.j != null) {
                                h.this.j.d_();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final void e() {
                            if (h.this.j != null) {
                                h.this.j.d();
                            }
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.h, com.fyber.inneractive.sdk.m.d.c
                        public final void a(boolean z) {
                            IAlog.b("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(h.this), Boolean.valueOf(z));
                            if (h.this.j == null || !z) {
                                return;
                            }
                            h.this.j.p();
                        }

                        @Override // com.fyber.inneractive.sdk.m.d.c
                        public final void a(boolean z, Orientation orientation) {
                            IAlog.b("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(h.this), Boolean.valueOf(z), orientation.toString());
                            if (h.this.j != null) {
                                h.this.j.a(z, orientation);
                            }
                        }
                    };
                    if (i.a != null) {
                        i.a.setListener(hVar);
                    }
                    c i2 = this.d.i();
                    if (i2.a != null) {
                        IAmraidWebViewController iAmraidWebViewController = i2.a;
                        v.a(i2.b);
                        iAmraidWebViewController.b();
                    }
                    c i3 = this.d.i();
                    if (i3.a != null && i3.a.q()) {
                        return;
                    }
                    c i4 = this.d.i();
                    if (i4.a != null) {
                        i4.a.a(true);
                    }
                }
                q();
                this.g.a(false);
                this.g.f();
                this.g.f(false);
                this.g.a(h);
                this.d.j();
                h.requestFocus();
                return;
            }
            if (this.r != null) {
                Bitmap b2 = b(true);
                if (b2 != null) {
                    this.g.setLastFrameBitmap(b2);
                }
            } else {
                Bitmap bitmap = this.d.g;
                if (bitmap != null) {
                    this.g.setLastFrameBitmap(bitmap);
                }
            }
            this.g.a(true);
            this.g.b(true, ((com.fyber.inneractive.sdk.config.a.a.f) this.f.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("cta_text_all_caps", false));
            this.g.f(false);
        } else if (this.w && b) {
            this.g.a(false);
            this.g.f(false);
        } else {
            this.g.f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fyber.inneractive.sdk.player.b.h$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
            a = iArr;
            try {
                iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Preparing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.fyber.inneractive.sdk.player.enums.b.Seeking.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z) {
        ListenerT listenert;
        switch (AnonymousClass7.a[bVar.ordinal()]) {
            case 1:
                if (this.v) {
                    this.g.a(true);
                    n();
                    r();
                    return;
                }
                return;
            case 2:
                if (this.v) {
                    this.g.g(true);
                    this.g.f(false);
                    Runnable runnable = this.l;
                    if (runnable == null) {
                        if (runnable == null) {
                            this.l = new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.h.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    h.this.l = null;
                                    h.this.j();
                                }
                            };
                        }
                        int i = i();
                        IAlog.b("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i));
                        this.g.postDelayed(this.l, i);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (this.v) {
                    k();
                    return;
                }
                return;
            case 4:
                p();
                return;
            case 5:
                if (this.v) {
                    u();
                    if (!z || (listenert = this.j) == null) {
                        return;
                    }
                    listenert.l();
                    return;
                }
                return;
            case 6:
                if (this.v) {
                    d(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void t() {
        if (this.v && !this.t) {
            this.t = true;
            this.g.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.a
    public final void a(int i) {
        com.fyber.inneractive.sdk.config.u uVar;
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar == null || bVar.f() == null) {
            return;
        }
        float y = y();
        com.fyber.inneractive.sdk.player.b bVar2 = this.d;
        if (bVar2 != null && bVar2.f() != null && this.d.f().m()) {
            float f = this.b;
            if (y != f) {
                int i2 = (y > 0.0f ? 1 : (y == 0.0f ? 0 : -1));
                if (i2 > 0 && f >= 0.0f && v()) {
                    i(true);
                } else if (i2 == 0 && !v()) {
                    h(true);
                }
            }
            w();
        }
        this.b = y;
        int h = this.d.f().h();
        int g = this.d.f().g();
        int i3 = g / 1000;
        int i4 = h / 1000;
        int i5 = i4 - i3;
        if (i5 < 0 || (!this.d.f().m() && g == h)) {
            i5 = 0;
        }
        if (this.g.m == null && this.g.u == null) {
            return;
        }
        this.g.setRemainingTime(Integer.toString(i5));
        if (this.i < i4) {
            if (f() && com.fyber.inneractive.sdk.player.b.a(this.d.q(), this.d.s(), com.fyber.inneractive.sdk.player.b.a(this.d)) && !this.k) {
                int i6 = this.i;
                if (i3 < i6) {
                    c(i6 - i3);
                } else {
                    this.i = 0;
                    x();
                }
                this.g.e(true);
            } else {
                this.g.e(false);
            }
        } else {
            this.g.e(false);
        }
        if (this.d.f().p() != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            final com.fyber.inneractive.sdk.player.e.g gVar = this.g;
            if (gVar.u != null) {
                if (gVar.D != null) {
                    gVar.removeCallbacks(gVar.D);
                    gVar.D = null;
                }
                int i7 = i4 * 1000;
                gVar.u.setMax(i7);
                int i8 = i7 - (i5 * 1000);
                gVar.C = i8 + 1000;
                int i9 = i8 + Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                if (gVar.C > 0 && gVar.C <= i7) {
                    if (i9 < gVar.B && gVar.B > 0) {
                        gVar.u.setProgress(gVar.C);
                    } else {
                        gVar.B = i9;
                        gVar.u.setProgress(gVar.B);
                        gVar.D = new Runnable() { // from class: com.fyber.inneractive.sdk.player.e.g.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                gVar.B += Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
                                gVar.u.setProgress(gVar.B);
                                if (gVar.B == gVar.C) {
                                    g.c(gVar);
                                    gVar.B = 0;
                                    g.d(gVar);
                                    return;
                                }
                                g gVar2 = gVar;
                                gVar2.postDelayed(gVar2.D, 200L);
                            }
                        };
                        gVar.postDelayed(gVar.D, 200L);
                    }
                }
            }
            int a = IAConfigManager.c().a.a("max_rv_tsec", 30, 1);
            if (i4 > a && i3 > a && (uVar = this.e) != null && uVar.g() != null && this.e.g().h() == UnitDisplayType.REWARDED) {
                x();
                this.g.e(true);
            }
        }
        ListenerT listenert = this.j;
        if (listenert != null) {
            listenert.a(h, g);
        }
    }

    public void e(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        Application p;
        if (this.v == z || (bVar = this.d) == null || bVar.f() == null) {
            return;
        }
        IAlog.b("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z), this.g);
        if (z) {
            this.v = true;
            com.fyber.inneractive.sdk.player.enums.b p2 = this.d.f().p();
            if (p2.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || this.g.e()) {
                u();
                return;
            } else if (!p2.equals(com.fyber.inneractive.sdk.player.enums.b.Error) && (!p2.equals(com.fyber.inneractive.sdk.player.enums.b.Idle) || this.d.p())) {
                if (p2 == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || p2 == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    k();
                }
                this.d.g();
                e();
                if (this.m != null || (p = l.p()) == null) {
                    return;
                }
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.fyber.inneractive.sdk.player.b.h.4
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        if (activity.equals(h.this.g.getContext())) {
                            h.this.g.h = false;
                            h.this.g.c();
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        if (activity.equals(h.this.g.getContext())) {
                            h.this.g.h = true;
                            h.this.g.c();
                        }
                    }
                };
                this.m = activityLifecycleCallbacks;
                p.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                return;
            } else {
                d(false);
                return;
            }
        }
        this.v = false;
        com.fyber.inneractive.sdk.player.b bVar2 = this.d;
        if (bVar2 != null && bVar2.f() != null && this.d.f().i.equals(this.h)) {
            IAlog.b("%sonVisibilityChanged pausing video", IAlog.a(this));
            b();
        }
        q();
    }

    @Override // com.fyber.inneractive.sdk.player.e.f
    public final void a(int i, aj ajVar) {
        IAlog.b("onClicked called with %d", Integer.valueOf(i));
        UnitDisplayType h = this.e.g().h();
        y n = IAConfigManager.n();
        switch (i) {
            case 1:
                if (v()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.b bVar = this.d;
                    if (bVar != null) {
                        bVar.a(VideoClickOrigin.MUTE, r.EVENT_UNMUTE);
                    }
                } else {
                    h(true);
                    com.fyber.inneractive.sdk.player.b bVar2 = this.d;
                    if (bVar2 != null) {
                        bVar2.a(VideoClickOrigin.MUTE, r.EVENT_MUTE);
                    }
                }
                w();
                return;
            case 2:
                h();
                return;
            case 3:
                n.a(h, "LAST_VAST_CLICKED_TYPE", "1");
                a(false, VideoClickOrigin.CTA, ajVar);
                return;
            case 4:
                n.a(h, "LAST_VAST_CLICKED_TYPE", "2");
                com.fyber.inneractive.sdk.player.b bVar3 = this.d;
                String str = null;
                com.fyber.inneractive.sdk.g.a.b n2 = bVar3 != null ? bVar3.n() : null;
                if (n2 != null && n2.a == com.fyber.inneractive.sdk.g.a.g.Static) {
                    str = n2.f;
                    com.fyber.inneractive.sdk.player.b bVar4 = this.d;
                    if (bVar4 != null) {
                        bVar4.a(n2, VideoClickOrigin.COMPANION, r.EVENT_CLICK);
                    }
                }
                ListenerT listenert = this.j;
                if (listenert != null) {
                    listenert.a(str, ajVar);
                    return;
                }
                return;
            case 5:
                m();
                return;
            case 6:
                n.a(h, "LAST_VAST_SKIPED", "1");
                d(true);
                return;
            case 7:
                a(ajVar);
                return;
            case 8:
                n.a(h, "LAST_VAST_CLICKED_TYPE", "2");
                a(true, VideoClickOrigin.COMPANION, ajVar);
                return;
            case 9:
                if (this.d == null || this.g.h) {
                    return;
                }
                this.d.b(true);
                f(false);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(boolean z, VideoClickOrigin videoClickOrigin, aj ajVar) {
        ListenerT listenert = this.j;
        if (listenert != null) {
            if (z) {
                com.fyber.inneractive.sdk.player.b bVar = this.d;
                if (bVar != null) {
                    listenert.a(bVar.l(), ajVar);
                    this.d.a(videoClickOrigin, r.EVENT_CLICK);
                }
            } else {
                u.a a = listenert.a(ajVar);
                com.fyber.inneractive.sdk.player.b bVar2 = this.d;
                if (bVar2 != null) {
                    bVar2.a(videoClickOrigin, r.EVENT_CLICK);
                }
                if (a.a != u.c.FAILED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        this.g.e(true);
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void d(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar;
        ListenerT listenert;
        this.w = true;
        com.fyber.inneractive.sdk.player.b bVar2 = this.d;
        if (bVar2 != null && bVar2.f() != null) {
            this.d.f().r();
            this.d.f().c();
        }
        if (!this.g.e()) {
            this.g.g(false);
            s();
            n();
            this.c = false;
            this.k = true;
            com.fyber.inneractive.sdk.config.u uVar = this.e;
            if (uVar != null && uVar.g() != null && this.e.g().h() == UnitDisplayType.REWARDED && (listenert = this.j) != null) {
                listenert.l();
            }
        }
        if (this.j != null && (this.i <= 0 || this.k || ((bVar = this.d) != null && bVar.f() != null && this.d.f().p().equals(com.fyber.inneractive.sdk.player.enums.b.Completed)))) {
            this.j.a_(z);
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean v() {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        return (bVar == null || bVar.f() == null || (!this.d.f().b() && y() != 0.0f)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar != null && bVar.f() != null) {
            this.d.f().a(z);
        }
        this.g.setMuteButtonState(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(boolean z) {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar != null && bVar.f() != null) {
            this.d.f().b(z);
        }
        this.g.setMuteButtonState(false);
    }

    private void c(int i) {
        com.fyber.inneractive.sdk.player.e.g gVar = this.g;
        if (gVar != null) {
            gVar.setSkipText(gVar.getContext().getString(R.string.ia_video_before_skip_format, Integer.valueOf(i)));
        }
    }

    private float y() {
        try {
            return ((AudioManager) this.g.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        if (this.g.s != null) {
            this.g.setMuteButtonState(v());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (f()) {
            com.fyber.inneractive.sdk.player.e.g gVar = this.g;
            gVar.setSkipText(gVar.getContext().getString(R.string.ia_video_skip_text));
            this.g.h();
            this.i = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void d() {
        com.fyber.inneractive.sdk.player.e.c cVar;
        com.fyber.inneractive.sdk.player.e.g gVar = this.g;
        if (gVar != null) {
            gVar.d();
        }
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar != null && bVar.f() != null && (cVar = this.r) != null) {
            cVar.invalidate();
            this.r.requestLayout();
        }
        com.fyber.inneractive.sdk.player.e.g gVar2 = this.g;
        if (gVar2 != null) {
            gVar2.invalidate();
            this.g.requestLayout();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public final void a(Bitmap bitmap) {
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar == null || bVar.f() == null || this.d.f().p() == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            return;
        }
        this.g.g(this.d.d());
        this.g.a(true);
        this.g.setLastFrameBitmap(bitmap);
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public void a() {
        Application p;
        if (this.m != null && (p = l.p()) != null) {
            p.unregisterActivityLifecycleCallbacks(this.m);
        }
        IAlog.b("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar != null && bVar.f() != null) {
            f f = this.d.f();
            if (f.g != null) {
                f.g.remove(this);
            }
            f f2 = this.d.f();
            if (f2.h != null) {
                f2.h.remove(this);
            }
        }
        q();
        s();
        AsyncTask<?, ?, ?> asyncTask = this.p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.j = null;
    }

    @Override // com.fyber.inneractive.sdk.player.b.b
    public void a(boolean z) {
        IAlog.b("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.b bVar = this.d;
        if (bVar == null || bVar.f() == null) {
            return;
        }
        this.g.setUnitConfig(this.e);
        this.g.a(this.d.f().d(), this.d.f().e(), this.n);
        if (this.d.f().d() > 0 && this.d.f().e() > 0) {
            a(this.d.f().d(), this.d.f().e());
        }
        if (f()) {
            this.i = g();
        } else {
            this.g.e(false);
        }
        if (!z) {
            a(this.d.f().g());
            a(this.d.f().p(), false);
        }
        w();
    }

    @Override // com.fyber.inneractive.sdk.player.b.f.b
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.b("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public void o() {
        IAlog.b("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e() {
        if (this.r == null) {
            this.r = new com.fyber.inneractive.sdk.player.e.c(this.g);
        }
        IAlog.b("%sconnectToTextureView called %s", IAlog.a(this), this.g.getTextureHost());
        if (this.r != null && this.g.getTextureHost().equals(this.r.getParent())) {
            IAlog.b("%sconnectToTextureView called but already connected", IAlog.a(this));
        } else {
            com.fyber.inneractive.sdk.player.b bVar = this.d;
            if (bVar != null && bVar.f() != null) {
                final f f = this.d.f();
                com.fyber.inneractive.sdk.player.e.c cVar = this.r;
                if (f.m != cVar) {
                    if (f.m != null) {
                        f.m.setSurfaceTextureListener(null);
                    }
                    f.m = cVar;
                    if (f.p == null) {
                        f.p = new TextureView.SurfaceTextureListener() { // from class: com.fyber.inneractive.sdk.player.b.f.1
                            @Override // android.view.TextureView.SurfaceTextureListener
                            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                                IAlog.b("%sonSurfaceTextureAvailable", IAlog.a(f));
                                f.a(f, surfaceTexture);
                                if (f.i != null) {
                                    f.i.a();
                                }
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                                IAlog.b("%s onSurfaceTextureDestroyed", IAlog.a(f));
                                f.c();
                                f.a((Surface) null);
                                f.s = true;
                                if (f.j == com.fyber.inneractive.sdk.player.enums.b.Completed || f.j == com.fyber.inneractive.sdk.player.enums.b.Error || f.j == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                                    IAlog.b("%sReleasing surface texture", IAlog.a(f));
                                    f.n = null;
                                    return true;
                                }
                                IAlog.b("%s caching surface texture", IAlog.a(f));
                                f.n = surfaceTexture;
                                f.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.1.1
                                    {
                                        AnonymousClass1.this = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (f.i != null) {
                                            f.i.b();
                                        }
                                    }
                                });
                                return false;
                            }

                            @Override // android.view.TextureView.SurfaceTextureListener
                            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                                if (f.i != null) {
                                    f.i.c();
                                }
                                if (!f.s || f.o == null) {
                                    return;
                                }
                                f fVar = f;
                                fVar.a(fVar.o);
                                f.s = false;
                            }
                        };
                    }
                    f.m.setSurfaceTextureListener(f.p);
                    if (f.n != null) {
                        IAlog.b("%scalling setSurfaceTexture with cached texture", IAlog.a(f));
                        if (f.m.getSurfaceTexture() == null || !f.m.getSurfaceTexture().equals(f.n)) {
                            IAlog.b("%scalling setSurfaceTexture with cached texture success", IAlog.a(f));
                            f.m.setSurfaceTexture(f.n);
                        } else {
                            IAlog.b("%scalling setSurfaceTexture with cached texture failed", IAlog.a(f));
                        }
                    }
                }
            }
            com.fyber.inneractive.sdk.player.e.c cVar2 = this.r;
            if (cVar2 != null) {
                cVar2.setId(R.id.inn_texture_view);
            }
            IAlog.b("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.r.getParent() == null) {
                this.g.getTextureHost().addView(this.r, layoutParams);
            }
            this.t = false;
            this.h = new f.c() { // from class: com.fyber.inneractive.sdk.player.b.h.6
                @Override // com.fyber.inneractive.sdk.player.b.f.c
                public final void a() {
                    IAlog.b("%sonSurfaceTextureAvailable", IAlog.a(h.this));
                }

                @Override // com.fyber.inneractive.sdk.player.b.f.c
                public final void b() {
                    h.this.g.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.h.6.1
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    });
                }

                @Override // com.fyber.inneractive.sdk.player.b.f.c
                public final void c() {
                    if (h.this.d == null || h.this.d.f() == null) {
                        return;
                    }
                    final f f2 = h.this.d.f();
                    f2.q = true;
                    f2.l.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.b.f.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (f2.g != null) {
                                    for (b bVar2 : f2.g) {
                                        bVar2.t();
                                    }
                                }
                            } catch (Exception e) {
                                if (IAlog.a <= 3) {
                                    IAlog.b("%sonDrawnToSurface callback threw an exception!", IAlog.a(f2));
                                    e.printStackTrace();
                                }
                            }
                        }
                    });
                }
            };
            com.fyber.inneractive.sdk.player.b bVar2 = this.d;
            if (bVar2 != null && bVar2.f() != null) {
                this.d.f().i = this.h;
            }
        }
        return true;
    }
}

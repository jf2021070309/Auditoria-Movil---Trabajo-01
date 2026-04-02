package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class r extends TextureView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private String F;
    private String G;
    private FileInputStream H;
    private d I;
    private aa J;
    private Surface K;
    private SurfaceTexture L;
    private RectF M;
    private a N;
    private ProgressBar O;
    private MediaPlayer P;
    private JSONObject Q;
    private ExecutorService R;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private boolean h;
    private Paint i;
    private Paint j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private double s;
    private double t;
    private long u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, d dVar, int i, aa aaVar) {
        super(context);
        this.h = true;
        this.i = new Paint();
        this.j = new Paint(1);
        this.M = new RectF();
        this.Q = as.a();
        this.R = Executors.newSingleThreadExecutor();
        this.J = aaVar;
        this.I = dVar;
        this.o = i;
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.L != null) {
            this.A = true;
        }
        this.R.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        JSONObject b = this.I.b();
        this.G = as.b(b, "ad_session_id");
        this.k = as.c(b, "x");
        this.l = as.c(b, "y");
        this.m = as.c(b, "width");
        this.n = as.c(b, "height");
        this.C = as.d(b, "enable_timer");
        this.E = as.d(b, "enable_progress");
        this.F = as.b(b, "filepath");
        this.p = as.c(b, "video_width");
        this.q = as.c(b, "video_height");
        this.f = com.adcolony.sdk.a.a().a.j();
        au.b.b("Original video dimensions = " + this.p + "x" + this.q);
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.m, this.n);
        layoutParams.setMargins(this.k, this.l, 0, 0);
        layoutParams.gravity = 0;
        this.J.addView(this, layoutParams);
        if (this.E && com.adcolony.sdk.a.d()) {
            this.O = new ProgressBar(com.adcolony.sdk.a.c());
            this.J.addView(this.O, new FrameLayout.LayoutParams((int) (this.f * 100.0f), (int) (this.f * 100.0f), 17));
        }
        this.P = new MediaPlayer();
        this.z = false;
        try {
            if (!this.F.startsWith("http")) {
                this.H = new FileInputStream(this.F);
                this.P.setDataSource(this.H.getFD());
            } else {
                this.B = true;
                this.P.setDataSource(this.F);
            }
            this.P.setOnErrorListener(this);
            this.P.setOnPreparedListener(this);
            this.P.setOnCompletionListener(this);
            this.P.prepareAsync();
        } catch (IOException e) {
            au.g.a("Failed to create/prepare MediaPlayer: ").b(e.toString());
            k();
        }
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.play", new f() { // from class: com.adcolony.sdk.r.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.e();
                }
            }
        }, true));
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.set_bounds", new f() { // from class: com.adcolony.sdk.r.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.b(dVar);
                }
            }
        }, true));
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.set_visible", new f() { // from class: com.adcolony.sdk.r.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.c(dVar);
                }
            }
        }, true));
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.pause", new f() { // from class: com.adcolony.sdk.r.4
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.f();
                }
            }
        }, true));
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.seek_to_time", new f() { // from class: com.adcolony.sdk.r.5
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.e(dVar);
                }
            }
        }, true));
        this.J.l().add(com.adcolony.sdk.a.a("VideoView.set_volume", new f() { // from class: com.adcolony.sdk.r.6
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                if (r.this.a(dVar)) {
                    r.this.d(dVar);
                }
            }
        }, true));
        this.J.m().add("VideoView.play");
        this.J.m().add("VideoView.set_bounds");
        this.J.m().add("VideoView.set_visible");
        this.J.m().add("VideoView.pause");
        this.J.m().add("VideoView.seek_to_time");
        this.J.m().add("VideoView.set_volume");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(d dVar) {
        JSONObject b = dVar.b();
        return as.c(b, "id") == this.o && as.c(b, "container_id") == this.J.c() && as.b(b, "ad_session_id").equals(this.J.a());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture == null || this.A) {
            au.h.b("Null texture provided by system's onSurfaceTextureAvailable or MediaPlayer has been destroyed.");
            return;
        }
        this.K = new Surface(surfaceTexture);
        try {
            this.P.setSurface(this.K);
        } catch (IllegalStateException e) {
            au.g.b("IllegalStateException thrown when calling MediaPlayer.setSurface()");
            k();
        }
        this.L = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.L = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.L = surfaceTexture;
        if (!this.A) {
            return false;
        }
        surfaceTexture.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.L = surfaceTexture;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        af a2 = com.adcolony.sdk.a.a();
        ab j = a2.j();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        JSONObject a3 = as.a();
        as.b(a3, "view_id", this.o);
        as.a(a3, "ad_session_id", this.G);
        as.b(a3, "container_x", this.k + x);
        as.b(a3, "container_y", this.l + y);
        as.b(a3, "view_x", x);
        as.b(a3, "view_y", y);
        as.b(a3, "id", this.J.c());
        switch (action) {
            case 0:
                new d("AdContainer.on_touch_began", this.J.b(), a3).a();
                break;
            case 1:
                if (!this.J.p()) {
                    a2.a(j.d().get(this.G));
                }
                new d("AdContainer.on_touch_ended", this.J.b(), a3).a();
                break;
            case 2:
                new d("AdContainer.on_touch_moved", this.J.b(), a3).a();
                break;
            case 3:
                new d("AdContainer.on_touch_cancelled", this.J.b(), a3).a();
                break;
            case 5:
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a3, "container_x", ((int) motionEvent.getX(action2)) + this.k);
                as.b(a3, "container_y", ((int) motionEvent.getY(action2)) + this.l);
                as.b(a3, "view_x", (int) motionEvent.getX(action2));
                as.b(a3, "view_y", (int) motionEvent.getY(action2));
                new d("AdContainer.on_touch_began", this.J.b(), a3).a();
                break;
            case 6:
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                as.b(a3, "container_x", ((int) motionEvent.getX(action3)) + this.k);
                as.b(a3, "container_y", ((int) motionEvent.getY(action3)) + this.l);
                as.b(a3, "view_x", (int) motionEvent.getX(action3));
                as.b(a3, "view_y", (int) motionEvent.getY(action3));
                if (!this.J.p()) {
                    a2.a(j.d().get(this.G));
                }
                new d("AdContainer.on_touch_ended", this.J.b(), a3).a();
                break;
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        double d = this.m / this.p;
        double d2 = this.n / this.q;
        if (d <= d2) {
            d2 = d;
        }
        int i3 = (int) (this.p * d2);
        int i4 = (int) (d2 * this.q);
        au.d.a("setMeasuredDimension to ").a(i3).a(" by ").b(i4);
        setMeasuredDimension(i3, i4);
        if (this.B) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i3;
            layoutParams.height = i4;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        JSONObject a2 = as.a();
        as.a(a2, "id", this.G);
        new d("AdSession.on_error", this.J.b(), a2).a();
        this.v = true;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        k();
        au.g.a("MediaPlayer error: ").a(i).a(",").b(i2);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.z = true;
        if (this.E) {
            this.J.removeView(this.O);
        }
        if (this.B) {
            this.p = mediaPlayer.getVideoWidth();
            this.q = mediaPlayer.getVideoHeight();
            onMeasure(this.p, this.q);
            au.d.a("MediaPlayer getVideoWidth = ").b(mediaPlayer.getVideoWidth());
            au.d.a("MediaPlayer getVideoHeight = ").b(mediaPlayer.getVideoHeight());
        }
        JSONObject a2 = as.a();
        as.b(a2, "id", this.o);
        as.b(a2, "container_id", this.J.c());
        as.a(a2, "ad_session_id", this.G);
        au.b.b("ADCVideoView is prepared");
        new d("VideoView.on_ready", this.J.b(), a2).a();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.v = true;
        this.s = this.t;
        as.b(this.Q, "id", this.o);
        as.b(this.Q, "container_id", this.J.c());
        as.a(this.Q, "ad_session_id", this.G);
        as.a(this.Q, "elapsed", this.s);
        as.a(this.Q, "duration", this.t);
        new d("VideoView.on_progress", this.J.b(), this.Q).a();
    }

    private void l() {
        try {
            this.R.submit(new Runnable() { // from class: com.adcolony.sdk.r.7
                @Override // java.lang.Runnable
                public void run() {
                    r.this.u = 0L;
                    while (!r.this.v && !r.this.y && com.adcolony.sdk.a.d()) {
                        if (!r.this.v && !r.this.A) {
                            if (r.this.P.isPlaying()) {
                                if (r.this.u == 0 && com.adcolony.sdk.a.b) {
                                    r.this.u = System.currentTimeMillis();
                                }
                                r.this.x = true;
                                r.this.s = r.this.P.getCurrentPosition() / 1000.0d;
                                r.this.t = r.this.P.getDuration() / 1000.0d;
                                if (System.currentTimeMillis() - r.this.u > 1000 && !r.this.D && com.adcolony.sdk.a.b) {
                                    if (r.this.s != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                                        r.this.D = true;
                                    } else {
                                        au.h.b("getCurrentPosition() not working, firing AdSession.on_error");
                                        r.this.k();
                                    }
                                }
                                if (r.this.C) {
                                    r.this.c();
                                }
                            }
                            if (r.this.x && !r.this.v && !r.this.y) {
                                as.b(r.this.Q, "id", r.this.o);
                                as.b(r.this.Q, "container_id", r.this.J.c());
                                as.a(r.this.Q, "ad_session_id", r.this.G);
                                as.a(r.this.Q, "elapsed", r.this.s);
                                as.a(r.this.Q, "duration", r.this.t);
                                new d("VideoView.on_progress", r.this.J.b(), r.this.Q).a();
                            }
                            if (r.this.w || com.adcolony.sdk.a.c().isFinishing()) {
                                r.this.w = false;
                                r.this.d();
                                return;
                            }
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException e) {
                                r.this.k();
                                au.g.b("InterruptedException in ADCVideoView's update thread.");
                            }
                        } else {
                            return;
                        }
                    }
                    if (r.this.w) {
                        r.this.d();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            k();
        }
    }

    void c() {
        if (this.h) {
            this.e = (float) (360.0d / this.t);
            this.j.setColor(-3355444);
            this.j.setShadowLayer((int) (this.f * 2.0f), 0.0f, 0.0f, -16777216);
            this.j.setTextAlign(Paint.Align.CENTER);
            this.j.setLinearText(true);
            this.j.setTextSize(12.0f * this.f);
            this.i.setStyle(Paint.Style.STROKE);
            float f = this.f * 2.0f <= 6.0f ? this.f * 2.0f : 6.0f;
            this.i.setStrokeWidth(f >= 4.0f ? f : 4.0f);
            this.i.setShadowLayer((int) (this.f * 3.0f), 0.0f, 0.0f, -16777216);
            this.i.setColor(-3355444);
            Rect rect = new Rect();
            this.j.getTextBounds("0123456789", 0, 9, rect);
            this.c = rect.height();
            if (com.adcolony.sdk.a.d()) {
                q.a(new Runnable() { // from class: com.adcolony.sdk.r.8
                    @Override // java.lang.Runnable
                    public void run() {
                        r.this.N = new a(com.adcolony.sdk.a.c());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (r.this.c * 4.0f), (int) (r.this.c * 4.0f));
                        layoutParams.setMargins(0, r.this.J.n() - ((int) (r.this.c * 4.0f)), 0, 0);
                        layoutParams.gravity = 0;
                        r.this.J.addView(r.this.N, layoutParams);
                    }
                });
            }
            this.h = false;
        }
        this.g = (int) (this.t - this.s);
        this.a = (int) this.c;
        this.b = (int) (this.c * 3.0f);
        this.M.set(this.a - (this.c / 2.0f), this.b - (this.c * 2.0f), this.a + (this.c * 2.0f), this.b + (this.c / 2.0f));
        this.d = (float) (this.e * (this.t - this.s));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        au.d.b("MediaPlayer stopped and released.");
        try {
            if (!this.v && this.z && this.P.isPlaying()) {
                this.P.stop();
            }
        } catch (IllegalStateException e) {
            au.f.b("Caught IllegalStateException when calling stop on MediaPlayer");
        }
        if (this.O != null) {
            this.J.removeView(this.O);
        }
        this.v = true;
        this.z = false;
        this.P.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar) {
        JSONObject b = dVar.b();
        this.k = as.c(b, "x");
        this.l = as.c(b, "y");
        this.m = as.c(b, "width");
        this.n = as.c(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.k, this.l, 0, 0);
        layoutParams.width = this.m;
        layoutParams.height = this.n;
        setLayoutParams(layoutParams);
        if (this.C && this.N != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.c * 4.0f), (int) (this.c * 4.0f));
            layoutParams2.setMargins(0, this.J.n() - ((int) (this.c * 4.0f)), 0, 0);
            layoutParams2.gravity = 0;
            this.N.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(d dVar) {
        if (as.d(dVar.b(), "visible")) {
            setVisibility(0);
            if (this.C && this.N != null) {
                this.N.setVisibility(0);
                return;
            }
            return;
        }
        setVisibility(4);
        if (this.C && this.N != null) {
            this.N.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(d dVar) {
        if (!this.z) {
            return false;
        }
        float e = (float) as.e(dVar.b(), "volume");
        this.P.setVolume(e, e);
        JSONObject a2 = as.a();
        as.a(a2, "success", true);
        dVar.a(a2).a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (this.z) {
            if (!this.y && com.adcolony.sdk.a.b) {
                this.P.start();
                l();
                au.b.b("MediaPlayer is prepared - ADCVideoView play() called.");
            } else if (!this.v && com.adcolony.sdk.a.b) {
                this.P.start();
                this.y = false;
                if (!this.R.isShutdown()) {
                    l();
                }
                if (this.N != null) {
                    this.N.invalidate();
                }
            }
            setWillNotDraw(false);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!this.z) {
            au.f.b("ADCVideoView pause() called while MediaPlayer is not prepared.");
            return false;
        } else if (!this.x) {
            au.d.b("Ignoring ADCVideoView pause due to invalid MediaPlayer state.");
            return false;
        } else {
            this.r = this.P.getCurrentPosition();
            this.t = this.P.getDuration();
            this.P.pause();
            this.y = true;
            au.b.b("Video view paused");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(d dVar) {
        if (this.z) {
            if (this.v) {
                this.v = false;
            }
            this.P.seekTo(as.c(dVar.b(), "time") * 1000);
            JSONObject a2 = as.a();
            as.b(a2, "id", this.o);
            as.a(a2, "ad_session_id", this.G);
            as.a(a2, "success", true);
            dVar.a(a2).a();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.P != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaPlayer i() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends View {
        a(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                getClass().getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
            } catch (Exception e) {
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawArc(r.this.M, 270.0f, r.this.d, false, r.this.i);
            canvas.drawText("" + r.this.g, r.this.M.centerX(), (float) (r.this.M.centerY() + (r.this.j.getFontMetrics().bottom * 1.35d)), r.this.j);
            invalidate();
        }
    }
}

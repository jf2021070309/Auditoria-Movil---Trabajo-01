package com.android.music;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.android.music.DeleteItems;
import com.android.music.MediaPlaybackActivity;
import com.android.music.TrackBrowserActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import e.a.c.e4;
import e.a.c.q6;
import e.a.c.s6;
import e.a.c.v6;
import e.a.c.z6;
import e.h.g.c1;
import e.h.g.d1.j;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.v0;
import e.j.a.o.f;
import e.j.d.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class MediaPlaybackActivity extends e.g.a.d.i implements View.OnTouchListener, View.OnLongClickListener, f.a {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2951c;
    public int A;
    public RepeatingImageButton B;
    public int C;
    public final r0 D;
    public int E;
    public f F;
    public ImageView G;
    public RepeatingImageButton H;
    public ProgressBar I;
    public RelativeLayout J;
    public ShimmerFrameLayout K;
    public AdView L;
    public final View.OnClickListener M;
    public g N;
    public ImageView O;
    public ScheduledExecutorService P;
    public boolean U;
    public s6 V;
    public final j.e W;
    public final j.e X;
    public final SeekBar.OnSeekBarChangeListener Y;
    public final View.OnClickListener Z;
    public final View.OnClickListener a0;
    public final View.OnClickListener b0;
    public ImageView c0;
    public final View.OnClickListener d0;
    public final View.OnClickListener e0;
    public long f0;
    public z6.e g0;
    public TextView h0;
    public int i0;
    public TextView j0;

    /* renamed from: k  reason: collision with root package name */
    public MenuItem f2959k;
    public h k0;
    public boolean l0;

    /* renamed from: m  reason: collision with root package name */
    public int f2961m;
    public long m0;

    /* renamed from: n  reason: collision with root package name */
    public int f2962n;
    public boolean n0;
    public ImageView o;
    public final ServiceConnection o0;
    public i p;
    public final BroadcastReceiver p0;
    public TextView q;
    public int q0;
    public TextView r;
    public FrameLayout r0;
    public ShimmerFrameLayout s0;
    public TextView t;
    public final f.a.e.a t0;
    public boolean u;
    public boolean u0;
    public long v;
    public final r0 y;
    public boolean z;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f2952d = Executors.newSingleThreadExecutor();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2953e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f2954f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f2955g = -2;

    /* renamed from: h  reason: collision with root package name */
    public int f2956h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2957i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f2958j = 0;

    /* renamed from: l  reason: collision with root package name */
    public final int[][] f2960l = {new int[]{45, 51, 33, 46, 48, 53, 49, 37, 43, 44}, new int[]{29, 47, 32, 34, 35, 36, 38, 39, 40, 67}, new int[]{54, 52, 31, 50, 30, 42, 41, 55, 56, 66}};
    public boolean s = false;
    public boolean w = false;
    public boolean x = false;

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: com.android.music.MediaPlaybackActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0064a implements Runnable {
            public RunnableC0064a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                if (mediaPlaybackActivity.x) {
                    return;
                }
                mediaPlaybackActivity.w = false;
            }
        }

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                MediaPlaybackActivity.this.E = i2;
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
            mediaPlaybackActivity.x = true;
            mediaPlaybackActivity.y.h();
            MediaPlaybackActivity.this.w = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
            mediaPlaybackActivity.x = false;
            if (mediaPlaybackActivity.V != null) {
                g gVar = mediaPlaybackActivity.N;
                if (gVar != null) {
                    int i2 = mediaPlaybackActivity.E;
                    g.a aVar = new g.a(gVar, null);
                    aVar.a = i2;
                    gVar.h(aVar);
                }
                MediaPlaybackActivity.this.C();
            }
            new Handler().postDelayed(new RunnableC0064a(), 200L);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
            if (r5.f5177b.getPath() != null) goto L31;
         */
        @Override // android.content.ServiceConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            /*
                r4 = this;
                e.a.c.s6 r5 = new e.a.c.s6
                e.h.f.a r6 = e.h.f.a.AbstractBinderC0175a.R0(r6)
                r5.<init>(r6)
                com.android.music.MediaPlaybackActivity r6 = com.android.music.MediaPlaybackActivity.this
                r6.V = r5
                android.content.Intent r0 = r6.getIntent()
                android.net.Uri r1 = r0.getData()
                if (r1 == 0) goto L6c
                java.lang.String r2 = r1.toString()
                int r2 = r2.length()
                if (r2 <= 0) goto L6c
                java.lang.String r2 = r1.getScheme()
                java.lang.String r3 = "file"
                boolean r2 = r3.equals(r2)
                if (r2 == 0) goto L32
                java.lang.String r1 = r1.getPath()
                goto L36
            L32:
                java.lang.String r1 = r1.toString()
            L36:
                r2 = 0
                android.net.Uri r3 = r0.getData()
                if (r3 == 0) goto L45
                android.net.Uri r0 = r0.getData()
                java.lang.String r2 = r0.getPath()
            L45:
                r5.v()     // Catch: java.lang.Exception -> L57
                r5.m(r1, r2)     // Catch: java.lang.Exception -> L57
                r5.o()     // Catch: java.lang.Exception -> L57
                android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L57
                r0.<init>()     // Catch: java.lang.Exception -> L57
                r6.setIntent(r0)     // Catch: java.lang.Exception -> L57
                goto L6c
            L57:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "couldn't start playback: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                e.h.g.s1.b(r0)
            L6c:
                r6.J()
                long r0 = r6.C()
                r6.B(r0)
                long r0 = r5.e()     // Catch: java.lang.Exception -> Lb0
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 >= 0) goto L91
                boolean r6 = r5.j()     // Catch: java.lang.Exception -> Lb0
                if (r6 != 0) goto L91
                e.a.c.z6.i()     // Catch: java.lang.Exception -> Lb0
                e.h.f.a r5 = r5.f5177b     // Catch: java.lang.Exception -> Lb0
                java.lang.String r5 = r5.getPath()     // Catch: java.lang.Exception -> Lb0
                if (r5 == 0) goto Lb1
            L91:
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this     // Catch: java.lang.Exception -> Lb0
                android.widget.ImageView r5 = r5.O     // Catch: java.lang.Exception -> Lb0
                r6 = 0
                r5.setVisibility(r6)     // Catch: java.lang.Exception -> Lb0
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this     // Catch: java.lang.Exception -> Lb0
                android.widget.ImageView r5 = r5.c0     // Catch: java.lang.Exception -> Lb0
                r5.setVisibility(r6)     // Catch: java.lang.Exception -> Lb0
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this     // Catch: java.lang.Exception -> Lb0
                r5.G()     // Catch: java.lang.Exception -> Lb0
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this     // Catch: java.lang.Exception -> Lb0
                r5.H()     // Catch: java.lang.Exception -> Lb0
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this     // Catch: java.lang.Exception -> Lb0
                r5.F()     // Catch: java.lang.Exception -> Lb0
                return
            Lb0:
            Lb1:
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this
                android.content.Intent r5 = r5.getIntent()
                android.net.Uri r5 = r5.getData()
                if (r5 != 0) goto Ld5
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r6 = "android.intent.action.MAIN"
                r5.<init>(r6)
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                r5.setFlags(r6)
                com.android.music.MediaPlaybackActivity r6 = com.android.music.MediaPlaybackActivity.this
                java.lang.Class<com.android.music.MusicBrowserActivity> r0 = com.android.music.MusicBrowserActivity.class
                r5.setClass(r6, r0)
                com.android.music.MediaPlaybackActivity r6 = com.android.music.MediaPlaybackActivity.this
                r6.startActivity(r5)
            Ld5:
                com.android.music.MediaPlaybackActivity r5 = com.android.music.MediaPlaybackActivity.this
                r5.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.music.MediaPlaybackActivity.b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MediaPlaybackActivity.this.V = null;
        }
    }

    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("com.jrtstudio.music.metaChanged")) {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                boolean z = MediaPlaybackActivity.f2951c;
                mediaPlaybackActivity.J();
                MediaPlaybackActivity.this.F();
                MediaPlaybackActivity.this.B(-1L);
            } else if (action.equals("com.jrtstudio.music.playstateChanged")) {
                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                boolean z2 = MediaPlaybackActivity.f2951c;
                mediaPlaybackActivity2.F();
            } else if (action.equals("com.jrtstudio.music.queueChanged")) {
                MediaPlaybackActivity mediaPlaybackActivity3 = MediaPlaybackActivity.this;
                boolean z3 = MediaPlaybackActivity.f2951c;
                mediaPlaybackActivity3.H();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public Bitmap a;

        public d() {
        }

        public d(a aVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public long a;

        /* renamed from: b  reason: collision with root package name */
        public long f2963b;

        public e(long j2, long j3) {
            this.a = j2;
            this.f2963b = j3;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Handler {
        public WeakReference<MediaPlaybackActivity> a;

        /* renamed from: b  reason: collision with root package name */
        public long f2964b;

        public f(MediaPlaybackActivity mediaPlaybackActivity, Looper looper) {
            super(looper);
            this.f2964b = -1L;
            this.a = new WeakReference<>(mediaPlaybackActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h hVar;
            MediaPlaybackActivity mediaPlaybackActivity = this.a.get();
            if (mediaPlaybackActivity != null && message.what == 3 && v0.l()) {
                e eVar = (e) message.obj;
                long j2 = eVar.a;
                long j3 = eVar.f2963b;
                if (message.what == 3) {
                    if ((this.f2964b != j2 || j2 < 0) && (hVar = mediaPlaybackActivity.k0) != null) {
                        Message obtainMessage = hVar.obtainMessage(4, null);
                        hVar.removeMessages(4);
                        hVar.sendMessageDelayed(obtainMessage, 300L);
                        Bitmap m2 = z6.m(mediaPlaybackActivity, j3, j2, false);
                        if (m2 == null) {
                            m2 = z6.l(mediaPlaybackActivity, j3, -1L);
                            j2 = -1;
                        }
                        mediaPlaybackActivity.m0 = j2;
                        if (m2 != null) {
                            d dVar = new d(null);
                            dVar.a = m2;
                            Message obtainMessage2 = hVar.obtainMessage(4, dVar);
                            hVar.removeMessages(4);
                            hVar.sendMessage(obtainMessage2);
                        }
                        this.f2964b = j2;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends c1 {

        /* renamed from: g  reason: collision with root package name */
        public int f2965g;

        /* renamed from: h  reason: collision with root package name */
        public final c f2966h;

        /* loaded from: classes.dex */
        public class a {
            public int a;

            public a(g gVar, a aVar) {
            }
        }

        /* loaded from: classes.dex */
        public class b {
            public String a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f2968b;

            /* renamed from: c  reason: collision with root package name */
            public long f2969c;

            public b(g gVar, a aVar) {
            }
        }

        /* loaded from: classes.dex */
        public class c {
            public c(g gVar, a aVar) {
            }
        }

        /* loaded from: classes.dex */
        public class d {
            public long a;

            /* renamed from: b  reason: collision with root package name */
            public int f2970b;

            public d(g gVar, a aVar) {
            }
        }

        /* loaded from: classes.dex */
        public class e {
            public long a;

            /* renamed from: b  reason: collision with root package name */
            public int f2971b;

            public e(g gVar, a aVar) {
            }
        }

        public g() {
            super("refresh_time", MediaPlaybackActivity.this, false, true, 0);
            this.f2965g = -1;
            this.f2966h = new c(this, null);
        }

        @Override // e.h.g.c1
        public Object i(Object obj) {
            MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
            s6 s6Var = mediaPlaybackActivity.V;
            if (obj != null && s6Var != null) {
                try {
                    try {
                        if (obj instanceof e) {
                            e eVar = (e) obj;
                            long j2 = eVar.a;
                            long p = s6Var.p();
                            if (eVar.f2971b == 0) {
                                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                                mediaPlaybackActivity2.f0 = p;
                                mediaPlaybackActivity2.y.g();
                                MediaPlaybackActivity.this.U = false;
                            } else {
                                MediaPlaybackActivity mediaPlaybackActivity3 = MediaPlaybackActivity.this;
                                mediaPlaybackActivity3.U = true;
                                long j3 = mediaPlaybackActivity3.f0 + (j2 < 5000 ? j2 * 10 : ((j2 - 5000) * 40) + 50000);
                                long a2 = s6Var.a();
                                if (j3 >= a2) {
                                    s6Var.k();
                                    MediaPlaybackActivity.this.f0 -= a2;
                                    j3 -= a2;
                                }
                                if (MediaPlaybackActivity.this.y.b() > 250 || eVar.f2971b < 0) {
                                    s6Var.r(j3);
                                    MediaPlaybackActivity.this.y.g();
                                }
                                r20 = eVar.f2971b >= 0 ? j3 : -1L;
                                MediaPlaybackActivity.this.C();
                            }
                            b bVar = new b(this, null);
                            bVar.f2968b = s6Var.j();
                            if (r20 >= 0) {
                                p = r20;
                            }
                            bVar.f2969c = p;
                            bVar.a = z6.L(p / 1000);
                            return bVar;
                        } else if (obj instanceof d) {
                            d dVar = (d) obj;
                            long p2 = s6Var.p();
                            if (dVar.f2970b == 0) {
                                MediaPlaybackActivity mediaPlaybackActivity4 = MediaPlaybackActivity.this;
                                mediaPlaybackActivity4.f0 = p2;
                                mediaPlaybackActivity4.y.g();
                                MediaPlaybackActivity.this.U = false;
                            } else {
                                MediaPlaybackActivity mediaPlaybackActivity5 = MediaPlaybackActivity.this;
                                mediaPlaybackActivity5.U = true;
                                long j4 = dVar.a;
                                if (j4 < 5000) {
                                    dVar.a = j4 * 10;
                                } else {
                                    dVar.a = ((j4 - 5000) * 40) + 50000;
                                }
                                long j5 = mediaPlaybackActivity5.f0 - dVar.a;
                                if (j5 < 0) {
                                    s6Var.q();
                                    long a3 = s6Var.a();
                                    MediaPlaybackActivity.this.f0 += a3;
                                    j5 += a3;
                                }
                                if (MediaPlaybackActivity.this.y.b() > 250 || dVar.f2970b < 0) {
                                    s6Var.r(j5);
                                    MediaPlaybackActivity.this.y.g();
                                }
                                if (dVar.f2970b >= 0) {
                                    r20 = j5;
                                }
                            }
                            b bVar2 = new b(this, null);
                            bVar2.f2968b = s6Var.j();
                            if (r20 >= 0) {
                                p2 = r20;
                            }
                            bVar2.f2969c = p2;
                            bVar2.a = z6.L(p2 / 1000);
                            return bVar2;
                        } else if (obj instanceof c) {
                            try {
                                b bVar3 = new b(this, null);
                                long p3 = s6Var.p();
                                bVar3.f2968b = s6Var.j();
                                bVar3.f2969c = p3;
                                bVar3.a = z6.L(p3 / 1000);
                                return bVar3;
                            } catch (Throwable th) {
                                c.i.g.b.l(th);
                                s1.l(th, true);
                            }
                        } else if (obj instanceof a) {
                            try {
                                long j6 = (mediaPlaybackActivity.v * ((a) obj).a) / 1000;
                                s6Var.r(j6);
                                b bVar4 = new b(this, null);
                                bVar4.f2968b = s6Var.j();
                                bVar4.f2969c = j6;
                                bVar4.a = z6.L(j6 / 1000);
                                return bVar4;
                            } catch (Throwable th2) {
                                s1.l(th2, true);
                            }
                        }
                    } catch (Exception unused) {
                        return mediaPlaybackActivity;
                    }
                } catch (Exception unused2) {
                }
            }
            return null;
        }

        @Override // e.h.g.c1
        public void j(Object obj, Object obj2) {
            int i2;
            if (obj == null || obj2 == null) {
                return;
            }
            if (((obj instanceof c) || (obj instanceof a)) && (obj2 instanceof b)) {
                b bVar = (b) obj2;
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                long j2 = mediaPlaybackActivity.v;
                long j3 = bVar.f2969c;
                if (j3 < 0 || j2 <= 0) {
                    mediaPlaybackActivity.t.setText("--:--");
                    if (this.f2965g != 1000) {
                        MediaPlaybackActivity.this.I.setProgress(1000);
                        this.f2965g = 1000;
                    }
                } else {
                    if (!mediaPlaybackActivity.w && this.f2965g != (i2 = (int) ((j3 * 1000) / j2))) {
                        mediaPlaybackActivity.I.setProgress(i2);
                        this.f2965g = i2;
                    }
                    if (bVar.a.equals(String.valueOf(MediaPlaybackActivity.this.t.getText()))) {
                        bVar.a = e.a.d.a.a.r(new StringBuilder(), bVar.a, " ");
                    }
                    MediaPlaybackActivity.this.t.setText(bVar.a);
                    if (!bVar.f2968b) {
                        MediaPlaybackActivity.this.B(-1L);
                        return;
                    }
                }
                long j4 = bVar.f2969c % 1000;
                int width = MediaPlaybackActivity.this.I.getWidth();
                if (width == 0) {
                    width = 320;
                }
                long j5 = j2 / width;
                MediaPlaybackActivity.this.B(16L);
            }
        }

        @Override // e.h.g.c1
        public void k(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Handler {
        public WeakReference<MediaPlaybackActivity> a;

        public h(MediaPlaybackActivity mediaPlaybackActivity) {
            this.a = new WeakReference<>(mediaPlaybackActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            final MediaPlaybackActivity mediaPlaybackActivity = this.a.get();
            if (mediaPlaybackActivity != null) {
                int i2 = message.what;
                if (i2 == 1) {
                    boolean z = MediaPlaybackActivity.f2951c;
                    mediaPlaybackActivity.B(mediaPlaybackActivity.C());
                } else if (i2 == 2) {
                    new AlertDialog.Builder(mediaPlaybackActivity).setTitle(z6.E(R.string.service_start_error_title)).setMessage(z6.E(R.string.service_start_error_msg)).setPositiveButton(z6.E(R.string.ok), new DialogInterface.OnClickListener() { // from class: e.a.c.u1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            MediaPlaybackActivity.this.finish();
                        }
                    }).setCancelable(false).show();
                } else if (i2 != 4) {
                    if (i2 != 8) {
                        return;
                    }
                    TextView textView = (TextView) message.obj;
                    int scrollX = (textView.getScrollX() * 3) / 4;
                    textView.scrollTo(scrollX, 0);
                    if (scrollX == 0) {
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        return;
                    }
                    Message obtainMessage = obtainMessage(0, textView);
                    h hVar = mediaPlaybackActivity.k0;
                    if (hVar != null) {
                        hVar.sendMessageDelayed(obtainMessage, 15L);
                    }
                } else {
                    if (mediaPlaybackActivity.m0 == -1) {
                        boolean booleanValue = ((Boolean) k.a.a().f8812i.b("enable_rectangle_banner", Boolean.FALSE)).booleanValue();
                        if (!e.j.d.j.a() && !mediaPlaybackActivity.n0 && booleanValue) {
                            mediaPlaybackActivity.n0 = true;
                            mediaPlaybackActivity.o.setVisibility(8);
                            RelativeLayout relativeLayout = mediaPlaybackActivity.J;
                            if (relativeLayout != null) {
                                relativeLayout.setVisibility(0);
                                mediaPlaybackActivity.K.setVisibility(0);
                                com.facebook.shimmer.c cVar = mediaPlaybackActivity.K.f4474b;
                                ValueAnimator valueAnimator = cVar.f4492e;
                                if (valueAnimator != null && !valueAnimator.isStarted() && cVar.getCallback() != null) {
                                    cVar.f4492e.start();
                                }
                                mediaPlaybackActivity.L.setAdListener(new v6(mediaPlaybackActivity));
                                new AdRequest.Builder().build();
                                try {
                                    AdView adView = mediaPlaybackActivity.L;
                                } catch (IllegalStateException e2) {
                                    e2.printStackTrace();
                                }
                            } else {
                                mediaPlaybackActivity.o.setVisibility(0);
                            }
                        }
                    } else {
                        mediaPlaybackActivity.A(false);
                    }
                    d dVar = (d) message.obj;
                    if (dVar == null) {
                        mediaPlaybackActivity.o.setImageBitmap(null);
                    } else {
                        mediaPlaybackActivity.o.setImageBitmap(dVar.a);
                    }
                    mediaPlaybackActivity.o.getDrawable().setDither(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Runnable {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public Looper f2972b;

        public i(String str) {
            Object obj = new Object();
            this.a = obj;
            Thread thread = new Thread(null, this, str);
            thread.setPriority(1);
            thread.start();
            synchronized (obj) {
                while (this.f2972b == null) {
                    try {
                        this.a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.a) {
                Looper.prepare();
                this.f2972b = Looper.myLooper();
                this.a.notifyAll();
            }
            Looper.loop();
        }
    }

    public MediaPlaybackActivity() {
        r0 r0Var = new r0();
        r0Var.h();
        this.y = r0Var;
        this.z = true;
        this.A = 0;
        this.C = 0;
        this.D = new r0();
        this.E = 0;
        this.M = new View.OnClickListener() { // from class: e.a.c.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                Objects.requireNonNull(mediaPlaybackActivity);
                Intent putExtra = new Intent("android.intent.action.EDIT").putExtra("playlist", "nowplaying");
                putExtra.setComponent(new ComponentName("music.musicplayer", TrackBrowserActivity.class.getName()));
                mediaPlaybackActivity.startActivity(putExtra);
            }
        };
        this.U = false;
        this.V = null;
        this.W = new j.e() { // from class: e.a.c.h1
            @Override // e.h.g.d1.j.e
            public final void a(long j2, int i2) {
                MediaPlaybackActivity.this.E(i2, j2);
            }
        };
        this.X = new j.e() { // from class: e.a.c.l2
            @Override // e.h.g.d1.j.e
            public final void a(long j2, int i2) {
                MediaPlaybackActivity.this.D(i2, j2);
            }
        };
        this.Y = new a();
        this.Z = new View.OnClickListener() { // from class: e.a.c.o2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPlaybackActivity.this.z();
            }
        };
        this.a0 = new View.OnClickListener() { // from class: e.a.c.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                Objects.requireNonNull(mediaPlaybackActivity);
                e.h.g.j0.f(new j0.b() { // from class: e.a.c.a2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        s6 s6Var = MediaPlaybackActivity.this.V;
                        if (s6Var != null) {
                            try {
                                if (s6Var.p() < AbstractComponentTracker.LINGERING_TIMEOUT) {
                                    s6Var.q();
                                } else {
                                    s6Var.r(0L);
                                    s6Var.o();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        };
        this.b0 = new View.OnClickListener() { // from class: e.a.c.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                Objects.requireNonNull(mediaPlaybackActivity);
                e.h.g.j0.f(new j0.b() { // from class: e.a.c.p2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        s6 s6Var = MediaPlaybackActivity.this.V;
                        if (s6Var != null) {
                            try {
                                s6Var.k();
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        };
        this.d0 = new View.OnClickListener() { // from class: e.a.c.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                final s6 s6Var = mediaPlaybackActivity.V;
                if (s6Var == null) {
                    return;
                }
                e.h.g.j0.f(new j0.b() { // from class: e.a.c.d2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                        s6 s6Var2 = s6Var;
                        Objects.requireNonNull(mediaPlaybackActivity2);
                        try {
                            int g2 = s6Var2.g();
                            if (g2 == 0) {
                                s6Var2.t(2);
                                z6.Z(z6.E(R.string.repeat_all_notif), 0);
                            } else if (g2 == 2) {
                                s6Var2.t(1);
                                if (s6Var2.h() != 0) {
                                    s6Var2.u(0);
                                    mediaPlaybackActivity2.H();
                                }
                                z6.Z(z6.E(R.string.repeat_current_notif), 0);
                            } else {
                                s6Var2.t(0);
                                z6.Z(z6.E(R.string.repeat_off_notif), 0);
                            }
                            mediaPlaybackActivity2.G();
                            mediaPlaybackActivity2.H();
                            e.h.g.j1.n(500, new e.h.g.r0());
                            mediaPlaybackActivity2.G();
                            mediaPlaybackActivity2.H();
                        } catch (Exception e2) {
                            e.h.g.s1.l(e2, true);
                        }
                    }
                });
            }
        };
        this.e0 = new View.OnClickListener() { // from class: e.a.c.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                s6 s6Var = mediaPlaybackActivity.V;
                if (s6Var == null) {
                    return;
                }
                e.h.g.j0.f(new j2(mediaPlaybackActivity, s6Var));
            }
        };
        this.f0 = 0L;
        this.k0 = new h(this);
        this.m0 = -1L;
        this.n0 = false;
        this.o0 = new b();
        this.p0 = new c();
        this.t0 = new f.a.e.a();
        this.u0 = false;
    }

    public final void A(boolean z) {
        if (this.n0) {
            this.n0 = z;
            this.o.setVisibility(0);
            if (this.J != null) {
                this.K.b();
                this.J.setVisibility(8);
                this.L.destroy();
            }
        }
    }

    public final void B(long j2) {
        h hVar;
        if (this.l0 || (hVar = this.k0) == null || j2 == -2) {
            return;
        }
        Message obtainMessage = hVar.obtainMessage(1);
        hVar.removeMessages(1);
        if (j2 == -1) {
            j2 = 16;
        }
        hVar.sendMessageDelayed(obtainMessage, j2);
    }

    public final long C() {
        if (this.V == null) {
            return -1L;
        }
        g gVar = this.N;
        if (gVar != null) {
            gVar.h(gVar.f2966h);
            return -2L;
        }
        return -2L;
    }

    public final void D(int i2, long j2) {
        g gVar;
        if (this.V == null || (gVar = this.N) == null) {
            return;
        }
        g.d dVar = new g.d(gVar, null);
        dVar.f2970b = i2;
        dVar.a = j2;
        gVar.h(dVar);
    }

    public final void E(int i2, long j2) {
        g gVar;
        if (this.V == null || (gVar = this.N) == null) {
            return;
        }
        g.e eVar = new g.e(gVar, null);
        eVar.f2971b = i2;
        eVar.a = j2;
        gVar.h(eVar);
    }

    public final void F() {
        final s6 s6Var = this.V;
        if (s6Var == null) {
            return;
        }
        try {
            j0.f(new j0.b() { // from class: e.a.c.e2
                @Override // e.h.g.j0.b
                public final void a() {
                    final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                    s6 s6Var2 = s6Var;
                    Objects.requireNonNull(mediaPlaybackActivity);
                    try {
                        final boolean j2 = s6Var2.j();
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.t1
                            @Override // e.h.g.j0.c
                            public final void a() {
                                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                                boolean z = j2;
                                Objects.requireNonNull(mediaPlaybackActivity2);
                                try {
                                    if (z) {
                                        mediaPlaybackActivity2.G.setImageResource(R.drawable.btn_pause);
                                    } else {
                                        mediaPlaybackActivity2.G.setImageResource(R.drawable.btn_play);
                                    }
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        c.i.g.b.l(th);
                        e.h.g.s1.l(th, true);
                    }
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void G() {
        final s6 s6Var = this.V;
        if (s6Var == null) {
            return;
        }
        try {
            j0.f(new j0.b() { // from class: e.a.c.s2
                @Override // e.h.g.j0.b
                public final void a() {
                    final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                    s6 s6Var2 = s6Var;
                    Objects.requireNonNull(mediaPlaybackActivity);
                    try {
                        final int g2 = s6Var2.g();
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.o1
                            @Override // e.h.g.j0.c
                            public final void a() {
                                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                                int i2 = g2;
                                Objects.requireNonNull(mediaPlaybackActivity2);
                                try {
                                    if (i2 == 1) {
                                        mediaPlaybackActivity2.O.setImageResource(R.drawable.ic_mp_repeat_once_btn);
                                    } else if (i2 != 2) {
                                        mediaPlaybackActivity2.O.setImageResource(R.drawable.ic_mp_repeat_off_btn);
                                    } else {
                                        mediaPlaybackActivity2.O.setImageResource(R.drawable.ic_mp_repeat_all_btn);
                                    }
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        c.i.g.b.l(th);
                        e.h.g.s1.l(th, true);
                    }
                }
            });
        } catch (Throwable th) {
            c.i.g.b.l(th);
            s1.l(th, true);
        }
    }

    public final void H() {
        final s6 s6Var = this.V;
        if (s6Var == null) {
            return;
        }
        try {
            j0.f(new j0.b() { // from class: e.a.c.g2
                @Override // e.h.g.j0.b
                public final void a() {
                    final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                    s6 s6Var2 = s6Var;
                    Objects.requireNonNull(mediaPlaybackActivity);
                    try {
                        final int h2 = s6Var2.h();
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.a1
                            @Override // e.h.g.j0.c
                            public final void a() {
                                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                                int i2 = h2;
                                Objects.requireNonNull(mediaPlaybackActivity2);
                                try {
                                    if (i2 == 0) {
                                        mediaPlaybackActivity2.c0.setImageResource(R.drawable.ic_mp_shuffle_off_btn);
                                    } else if (i2 != 2) {
                                        mediaPlaybackActivity2.c0.setImageResource(R.drawable.ic_mp_shuffle_on_btn);
                                    } else {
                                        mediaPlaybackActivity2.c0.setImageResource(R.drawable.ic_mp_partyshuffle_on_btn);
                                    }
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        c.i.g.b.l(th);
                        e.h.g.s1.l(th, true);
                    }
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void I() {
        j0.h(new j0.c() { // from class: e.a.c.z1
            @Override // e.h.g.j0.c
            public final void a() {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                if (mediaPlaybackActivity.isFinishing()) {
                    return;
                }
                z6.b0(mediaPlaybackActivity, 1, (ImageView) mediaPlaybackActivity.findViewById(R.id.blurred_bg_player_view), true, z6.f5234n);
            }
        });
    }

    public final void J() {
        final s6 s6Var = this.V;
        if (s6Var == null) {
            return;
        }
        j0.f(new j0.b() { // from class: e.a.c.e1
            @Override // e.h.g.j0.b
            public final void a() {
                String str;
                final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                s6 s6Var2 = s6Var;
                Objects.requireNonNull(mediaPlaybackActivity);
                try {
                    try {
                        Objects.requireNonNull(s6Var2);
                        z6.i();
                        str = s6Var2.f5177b.getPath();
                    } catch (Exception e2) {
                        e.h.g.s1.l(e2, true);
                        mediaPlaybackActivity.finish();
                        return;
                    }
                } catch (NullPointerException unused) {
                    str = null;
                }
                final String str2 = str;
                final long e3 = s6Var2.e();
                if (e3 != -1 || mediaPlaybackActivity.f2955g == -2) {
                    e.h.g.j0.g(new j0.b() { // from class: e.a.c.n1
                        @Override // e.h.g.j0.b
                        public final void a() {
                            MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                            long j2 = e3;
                            Objects.requireNonNull(mediaPlaybackActivity2);
                            boolean u = e.h.b.n.u(true, j2);
                            final MenuItem menuItem = mediaPlaybackActivity2.f2959k;
                            if (menuItem != null) {
                                if (u) {
                                    e.h.g.j0.i(new j0.c() { // from class: e.a.c.p1
                                        @Override // e.h.g.j0.c
                                        public final void a() {
                                            MenuItem menuItem2 = menuItem;
                                            boolean z = MediaPlaybackActivity.f2951c;
                                            menuItem2.setIcon(R.drawable.ic_favorite_24dp);
                                        }
                                    });
                                } else {
                                    e.h.g.j0.i(new j0.c() { // from class: e.a.c.k1
                                        @Override // e.h.g.j0.c
                                        public final void a() {
                                            MenuItem menuItem2 = menuItem;
                                            boolean z = MediaPlaybackActivity.f2951c;
                                            menuItem2.setIcon(R.drawable.ic_favorite_border_24dp);
                                        }
                                    });
                                }
                            }
                        }
                    });
                    mediaPlaybackActivity.f2955g = e3;
                    String d2 = s6Var2.d();
                    if (d2 == null || d2.length() == 0) {
                        d2 = z6.E(R.string.unknown_artist_name);
                    }
                    final String str3 = d2;
                    final long c2 = s6Var2.c();
                    z6.i();
                    String d3 = s6Var2.f5177b.d();
                    if (d3 == null || str3.length() == 0) {
                        d3 = z6.E(R.string.unknown_album_name);
                    }
                    final String str4 = d3;
                    final String i2 = s6Var2.i();
                    long a2 = s6Var2.a();
                    mediaPlaybackActivity.v = a2;
                    final String L = z6.L(a2 / 1000);
                    e.h.g.j0.h(new j0.c() { // from class: e.a.c.n2
                        @Override // e.h.g.j0.c
                        public final void a() {
                            final MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                            String str5 = str3;
                            String str6 = str4;
                            long j2 = c2;
                            String str7 = str2;
                            long j3 = e3;
                            String str8 = i2;
                            String str9 = L;
                            Objects.requireNonNull(mediaPlaybackActivity2);
                            try {
                                if (str7 == null) {
                                    if (mediaPlaybackActivity2.C <= 2 || mediaPlaybackActivity2.D.b() <= 500) {
                                        e.h.g.j0.c(new j0.b() { // from class: e.a.c.s1
                                            @Override // e.h.g.j0.b
                                            public final void a() {
                                                MediaPlaybackActivity mediaPlaybackActivity3 = MediaPlaybackActivity.this;
                                                Objects.requireNonNull(mediaPlaybackActivity3);
                                                try {
                                                    Thread.sleep(100L);
                                                } catch (InterruptedException e4) {
                                                    e4.printStackTrace();
                                                }
                                                mediaPlaybackActivity3.C++;
                                                mediaPlaybackActivity3.J();
                                            }
                                        });
                                        return;
                                    } else {
                                        mediaPlaybackActivity2.finish();
                                        return;
                                    }
                                }
                                mediaPlaybackActivity2.D.g();
                                mediaPlaybackActivity2.C = 0;
                                long j4 = -1;
                                if (j3 >= 0 || !str7.toLowerCase().startsWith("http://")) {
                                    TextView textView = mediaPlaybackActivity2.r;
                                    if (textView != null) {
                                        ((View) textView.getParent()).setVisibility(0);
                                    }
                                    TextView textView2 = mediaPlaybackActivity2.q;
                                    if (textView2 != null) {
                                        ((View) textView2.getParent()).setVisibility(0);
                                    }
                                    if ("".equals(str5)) {
                                        str5 = z6.E(R.string.unknown_artist_name);
                                    }
                                    if ("".equals(str6)) {
                                        str6 = z6.E(R.string.unknown_album_name);
                                    } else {
                                        j4 = j2;
                                    }
                                    TextView textView3 = mediaPlaybackActivity2.r;
                                    if (textView3 != null) {
                                        if (mediaPlaybackActivity2.s) {
                                            mediaPlaybackActivity2.r.setText(str5 + " / " + str6);
                                            z6.X(mediaPlaybackActivity2.r);
                                        } else {
                                            textView3.setText(str5);
                                            z6.X(mediaPlaybackActivity2.r);
                                        }
                                    }
                                    TextView textView4 = mediaPlaybackActivity2.q;
                                    if (textView4 != null) {
                                        if (mediaPlaybackActivity2.s) {
                                            mediaPlaybackActivity2.q.setText(str5 + " / " + str6);
                                            z6.X(mediaPlaybackActivity2.q);
                                        } else {
                                            textView4.setText(str6);
                                            z6.X(mediaPlaybackActivity2.q);
                                        }
                                    }
                                    TextView textView5 = mediaPlaybackActivity2.j0;
                                    if (textView5 != null) {
                                        textView5.setText(str8);
                                    }
                                    z6.X(mediaPlaybackActivity2.j0);
                                    MediaPlaybackActivity.f fVar = mediaPlaybackActivity2.F;
                                    if (fVar != null) {
                                        fVar.removeMessages(3);
                                        fVar.obtainMessage(3, new MediaPlaybackActivity.e(j4, j3)).sendToTarget();
                                        mediaPlaybackActivity2.I();
                                        if (e.j.d.j.a() || !mediaPlaybackActivity2.n0) {
                                            mediaPlaybackActivity2.o.setVisibility(0);
                                        }
                                    }
                                } else {
                                    TextView textView6 = mediaPlaybackActivity2.r;
                                    if (textView6 != null) {
                                        ((View) textView6.getParent()).setVisibility(4);
                                    }
                                    TextView textView7 = mediaPlaybackActivity2.q;
                                    if (textView7 != null) {
                                        ((View) textView7.getParent()).setVisibility(4);
                                    }
                                    mediaPlaybackActivity2.o.setVisibility(8);
                                    mediaPlaybackActivity2.j0.setText(str7);
                                    MediaPlaybackActivity.f fVar2 = mediaPlaybackActivity2.F;
                                    if (fVar2 != null) {
                                        fVar2.removeMessages(3);
                                        fVar2.obtainMessage(3, new MediaPlaybackActivity.e(-1L, -1L)).sendToTarget();
                                        mediaPlaybackActivity2.I();
                                    }
                                }
                                mediaPlaybackActivity2.h0.setText(str9);
                            } catch (Throwable th) {
                                e.h.g.s1.l(th, true);
                            }
                        }
                    });
                }
            }
        });
    }

    public final boolean K() {
        RepeatingImageButton repeatingImageButton;
        if (this.B == null || (repeatingImageButton = this.H) == null || !this.u) {
            return false;
        }
        return repeatingImageButton.isFocused() || this.B.isFocused() || this.G.isFocused();
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 != -1) {
            return;
        }
        if (i2 != 4) {
            if (i2 != 10) {
                return;
            }
            j0.f(new j0.b() { // from class: e.a.c.w1
                @Override // e.h.g.j0.b
                public final void a() {
                    boolean z = MediaPlaybackActivity.f2951c;
                    try {
                        s6 y = z6.y();
                        if (y != null) {
                            y.k();
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            z6.c(this, new long[]{z6.t()}, Integer.parseInt(data.getLastPathSegment()));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.u0) {
            super.onBackPressed();
        } else if (c.i.g.h.z(this)) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @TargetApi(11)
    public boolean onCreateOptionsMenu(final Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.A = 0;
        this.z = true;
        j0.d(new j0.b() { // from class: e.a.c.q2
            /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
            @Override // e.h.g.j0.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a() {
                /*
                    r15 = this;
                    com.android.music.MediaPlaybackActivity r0 = com.android.music.MediaPlaybackActivity.this
                    android.view.Menu r1 = r2
                    e.a.c.s6 r2 = r0.V
                    r3 = 1
                    if (r2 == 0) goto L16
                    long r4 = e.a.c.z6.t()     // Catch: java.lang.Throwable -> L12
                    boolean r2 = e.h.b.n.u(r3, r4)     // Catch: java.lang.Throwable -> L12
                    goto L17
                L12:
                    r2 = move-exception
                    e.h.g.s1.l(r2, r3)
                L16:
                    r2 = 0
                L17:
                    long r4 = e.a.c.z6.t()
                    long r6 = java.lang.System.nanoTime()
                L1f:
                    r8 = 0
                    int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    if (r10 >= 0) goto L3f
                    boolean r10 = r0.isFinishing()
                    if (r10 != 0) goto L3f
                    long r10 = java.lang.System.nanoTime()
                    long r10 = r10 - r6
                    r12 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                    long r10 = r10 / r12
                    r12 = 30
                    int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                    if (r14 >= 0) goto L3f
                    long r4 = e.a.c.z6.t()
                    goto L1f
                L3f:
                    int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    if (r6 < 0) goto L58
                    boolean r4 = e.h.g.v0.i()
                    if (r4 == 0) goto L50
                    boolean r4 = r0.isInMultiWindowMode()
                    r3 = r3 ^ r4
                    r0.z = r3
                L50:
                    e.a.c.r2 r3 = new e.a.c.r2
                    r3.<init>()
                    e.h.g.j0.i(r3)
                L58:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: e.a.c.q2.a():void");
            }
        });
        return true;
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onDestroy() {
        this.f2959k = null;
        g gVar = this.N;
        if (gVar != null) {
            gVar.d();
            this.N = null;
        }
        i iVar = this.p;
        if (iVar != null) {
            iVar.f2972b.quit();
        }
        ScheduledExecutorService scheduledExecutorService = this.P;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.P = null;
        }
        RepeatingImageButton repeatingImageButton = this.B;
        if (repeatingImageButton != null) {
            repeatingImageButton.setOnClickListener(null);
            this.B.a(null, 0L);
            this.B = null;
        }
        this.p = null;
        this.F = null;
        this.k0 = null;
        this.t0.dispose();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0108, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010d, code lost:
        return super.onKeyDown(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x010e, code lost:
        r11.q0 = 1 - r11.q0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0114, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0115, code lost:
        z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0118, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0119, code lost:
        r12 = r11.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x011b, code lost:
        if (r12 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x011e, code lost:
        e.h.g.j0.f(new e.a.c.j2(r11, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0126, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0066, code lost:
        if (r5 >= 5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0087, code lost:
        if (r2 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b2, code lost:
        if (r2 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b4, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b7, code lost:
        if (r12 == 47) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bb, code lost:
        if (r12 == 62) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00bf, code lost:
        if (r12 == 76) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c1, code lost:
        switch(r12) {
            case 21: goto L75;
            case 22: goto L65;
            case 23: goto L86;
            default: goto L82;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c9, code lost:
        if (K() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00cc, code lost:
        r12 = r11.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ce, code lost:
        if (r12 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d4, code lost:
        if (r12.hasFocus() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d6, code lost:
        r11.B.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00db, code lost:
        E(r0, r13.getEventTime() - r13.getDownTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ec, code lost:
        if (K() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f5, code lost:
        if (r11.H.hasFocus() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f7, code lost:
        r11.H.requestFocus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fc, code lost:
        D(r0, r13.getEventTime() - r13.getDownTime());
     */
    @Override // c.b.c.l, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.music.MediaPlaybackActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        s6 s6Var = this.V;
        try {
            if (s6Var != null) {
                if (i2 != 21) {
                    if (i2 == 22) {
                        if (K()) {
                            if (this.U || this.f0 < 0) {
                                E(-1, keyEvent.getEventTime() - keyEvent.getDownTime());
                                this.G.requestFocus();
                                this.f0 = -1L;
                            } else {
                                this.G.requestFocus();
                                s6Var.k();
                            }
                            this.U = false;
                            return true;
                        }
                    }
                    return super.onKeyUp(i2, keyEvent);
                } else if (K()) {
                    if (this.U || this.f0 < 0) {
                        D(-1, keyEvent.getEventTime() - keyEvent.getDownTime());
                        this.G.requestFocus();
                        this.f0 = -1L;
                    } else {
                        this.G.requestFocus();
                        if (this.f0 < 1000) {
                            s6Var.q();
                        } else {
                            s6Var.r(0L);
                        }
                    }
                    this.U = false;
                    return true;
                }
            }
            return super.onKeyUp(i2, keyEvent);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        final int i2 = view.equals(this.r.getParent()) ? 0 : view.equals(this.q.getParent()) ? 1 : view.equals(this.j0.getParent()) ? 2 : -1;
        j0.f(new j0.b() { // from class: e.a.c.g1
            @Override // e.h.g.j0.b
            public final void a() {
                boolean z;
                String l2;
                String str;
                String str2;
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                int i3 = i2;
                s6 s6Var = mediaPlaybackActivity.V;
                if (s6Var != null) {
                    try {
                        String d2 = s6Var.d();
                        z6.i();
                        String d3 = s6Var.f5177b.d();
                        String i4 = s6Var.i();
                        long e2 = s6Var.e();
                        if (!("".equals(d3) && "".equals(d2) && i4 != null && i4.startsWith("recording")) && e2 >= 0) {
                            Cursor Q = z6.Q(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, e2), new String[]{"is_music"}, null, null, null);
                            if (Q != null) {
                                try {
                                    if (Q.moveToFirst()) {
                                        z = Q.getInt(0) != 0;
                                    }
                                } finally {
                                    Q.close();
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                boolean z2 = (d2 == null || "".equals(d2)) ? false : true;
                                boolean z3 = (d3 == null || "".equals(d3)) ? false : true;
                                if (mediaPlaybackActivity.r != null && z2 && i3 == 0) {
                                    str = "vnd.android.cursor.item/artist";
                                    l2 = d2;
                                    str2 = l2;
                                } else if (mediaPlaybackActivity.q != null && z3 && i3 == 1) {
                                    l2 = z2 ? e.a.d.a.a.l(d2, " ", d3) : d3;
                                    str = "vnd.android.cursor.item/album";
                                    str2 = d3;
                                } else if (i3 != 2 && z2 && z3) {
                                    throw new RuntimeException("shouldn't be here");
                                } else {
                                    if (i4 == null || "".equals(i4)) {
                                        return;
                                    }
                                    l2 = z2 ? e.a.d.a.a.l(d2, " ", i4) : i4;
                                    str = "audio/*";
                                    str2 = i4;
                                }
                                String F = z6.F(R.string.mediasearch, str2);
                                Intent intent = new Intent();
                                intent.setFlags(268435456);
                                intent.setAction("android.intent.action.MEDIA_SEARCH");
                                intent.putExtra("query", l2);
                                if (z2) {
                                    intent.putExtra("android.intent.extra.artist", d2);
                                }
                                if (z3) {
                                    intent.putExtra("android.intent.extra.album", d3);
                                }
                                intent.putExtra("android.intent.extra.title", i4);
                                intent.putExtra("android.intent.extra.focus", str);
                                n6.a();
                                mediaPlaybackActivity.startActivity(Intent.createChooser(intent, F));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
        return true;
    }

    @Override // c.m.b.o, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        z6.g(this);
        invalidateOptionsMenu();
    }

    @Override // c.m.b.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        setIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        int itemId;
        try {
            itemId = menuItem.getItemId();
        } catch (Exception unused) {
        }
        if (itemId == 3) {
            j0.f(new j0.b() { // from class: e.a.c.i1
                @Override // e.h.g.j0.b
                public final void a() {
                    MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                    MenuItem menuItem2 = menuItem;
                    Objects.requireNonNull(mediaPlaybackActivity);
                    z6.c(mediaPlaybackActivity, new long[]{z6.t()}, menuItem2.getIntent().getLongExtra("playlist", 0L));
                }
            });
            return true;
        } else if (itemId == 4) {
            e.h.e.g.g("menu_new_playlist");
            Intent intent = new Intent();
            intent.setClass(this, CreatePlaylist.class);
            startActivityForResult(intent, 4);
            return true;
        } else {
            if (itemId == 6) {
                e.h.e.g.g("menu_library");
                Intent intent2 = new Intent();
                intent2.setClass(this, MusicBrowserActivity.class);
                intent2.setFlags(335544320);
                startActivity(intent2);
                finish();
            } else if (itemId == 8) {
                e.h.e.g.g("menu_auto_shuffle");
                Uri uri = z6.a;
                j0.f(e4.a);
                H();
            } else if (itemId == 10) {
                e.h.e.g.g("menu_new_delete");
                j0.f(new j0.b() { // from class: e.a.c.v1
                    @Override // e.h.g.j0.b
                    public final void a() {
                        MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                        s6 s6Var = mediaPlaybackActivity.V;
                        if (s6Var != null) {
                            try {
                                DeleteItems.a(mediaPlaybackActivity, new long[]{z6.t()}, z6.F(R.string.delete_song_desc_nosdcard, s6Var.i()), 10);
                            } catch (Throwable th) {
                                c.i.g.b.l(th);
                                e.h.g.s1.l(th, true);
                            }
                        }
                    }
                });
                return true;
            } else if (itemId == 26) {
                e.h.e.g.g("menu_ringtone");
                j0.f(new j0.b() { // from class: e.a.c.b2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                        s6 s6Var = mediaPlaybackActivity.V;
                        if (s6Var != null) {
                            try {
                                z6.U(mediaPlaybackActivity, s6Var.e());
                            } catch (Throwable th) {
                                c.i.g.b.l(th);
                            }
                        }
                    }
                });
                return true;
            } else if (itemId == 17) {
                e.h.e.g.g("menu_settings");
                SettingsActivity.y(this);
            } else if (itemId == 18) {
                e.h.e.g.g("menu_sleep_timer");
                final FragmentManager fragmentManager = getFragmentManager();
                final s6 s6Var = this.V;
                int i2 = q6.a;
                j0.f(new j0.b() { // from class: e.a.c.k0
                    @Override // e.h.g.j0.b
                    public final void a() {
                        s6 s6Var2 = s6.this;
                        final FragmentManager fragmentManager2 = fragmentManager;
                        final Bundle bundle = new Bundle();
                        if (s6Var2 != null) {
                            try {
                                bundle.putBoolean("r", s6Var2.f5177b.I());
                                bundle.putInt("m", s6Var2.f5177b.J());
                                bundle.putInt("h", s6Var2.f5177b.R());
                            } catch (RemoteException e2) {
                                e.h.g.s1.l(e2, true);
                            }
                            e.h.g.j0.i(new j0.c() { // from class: e.a.c.j0
                                @Override // e.h.g.j0.c
                                public final void a() {
                                    Bundle bundle2 = bundle;
                                    FragmentManager fragmentManager3 = fragmentManager2;
                                    q6 q6Var = new q6();
                                    q6Var.setArguments(bundle2);
                                    q6Var.show(fragmentManager3, "sleep_dialog");
                                }
                            });
                        }
                    }
                });
            } else if (itemId == 22) {
                j0.f(new j0.b() { // from class: e.a.c.c2
                    @Override // e.h.g.j0.b
                    public final void a() {
                        final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                        Objects.requireNonNull(mediaPlaybackActivity);
                        e.h.e.g.g("menu_share");
                        if (mediaPlaybackActivity.V != null) {
                            final long t = z6.t();
                            e.h.g.j0.g(new j0.b() { // from class: e.a.c.c3
                                @Override // e.h.g.j0.b
                                public final void a() {
                                    long j2 = t;
                                    Activity activity = mediaPlaybackActivity;
                                    if (j2 != 0) {
                                        String w = z6.w(j2);
                                        try {
                                            s6 y = z6.y();
                                            if (y != null && y.e() != -1) {
                                                y.i();
                                                String d2 = y.d();
                                                if (d2 != null) {
                                                    z6.E(R.string.unknown_artist_name).equals(d2);
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        e.h.g.j1.l(activity, Uri.parse(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI + "/" + j2), w, null);
                                    }
                                }
                            });
                        }
                    }
                });
                return true;
            } else if (itemId != 23) {
                switch (itemId) {
                    case 13:
                        e.h.e.g.g("menu_eq");
                        j0.f(new j0.b() { // from class: e.a.c.j1
                            @Override // e.h.g.j0.b
                            public final void a() {
                                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                                Objects.requireNonNull(mediaPlaybackActivity);
                                try {
                                    s6 s6Var2 = mediaPlaybackActivity.V;
                                    if (s6Var2 != null) {
                                        Intent intent3 = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                                        z6.i();
                                        intent3.putExtra("android.media.extra.AUDIO_SESSION", s6Var2.f5177b.getAudioSessionId());
                                        mediaPlaybackActivity.startActivityForResult(intent3, 13);
                                    }
                                } catch (Throwable th) {
                                    c.i.g.b.l(th);
                                    e.h.g.s1.l(th, true);
                                }
                            }
                        });
                        return true;
                    case 14:
                        e.h.e.g.g("menu_search");
                        QueryBrowserActivity.E(this);
                        return true;
                    case 15:
                        e.h.e.g.g("menu_queue");
                        View.OnClickListener onClickListener = this.M;
                        if (onClickListener != null) {
                            onClickListener.onClick(null);
                            break;
                        }
                        break;
                }
            } else {
                j0.g(new j0.b() { // from class: e.a.c.x1
                    @Override // e.h.g.j0.b
                    public final void a() {
                        MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                        if (mediaPlaybackActivity.V != null) {
                            long t = z6.t();
                            boolean u = e.h.b.n.u(true, t);
                            final MenuItem menuItem2 = mediaPlaybackActivity.f2959k;
                            if (menuItem2 != null) {
                                if (u) {
                                    e.h.b.n.y(true, -4L, t, -1);
                                    e.h.g.j0.i(new j0.c() { // from class: e.a.c.f2
                                        @Override // e.h.g.j0.c
                                        public final void a() {
                                            MenuItem menuItem3 = menuItem2;
                                            boolean z = MediaPlaybackActivity.f2951c;
                                            menuItem3.setIcon(R.drawable.ic_favorite_border_24dp);
                                        }
                                    });
                                    return;
                                }
                                e.h.b.n.f8069g = true;
                                Object obj = e.h.g.j1.a;
                                e.h.b.n.g(true, false);
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(Long.valueOf(t));
                                e.h.b.n.b(true, arrayList, -4L);
                                e.h.g.j0.i(new j0.c() { // from class: e.a.c.f1
                                    @Override // e.h.g.j0.c
                                    public final void a() {
                                        MenuItem menuItem3 = menuItem2;
                                        boolean z = MediaPlaybackActivity.f2951c;
                                        menuItem3.setIcon(R.drawable.ic_favorite_24dp);
                                    }
                                });
                                c.i.g.h.A(mediaPlaybackActivity);
                            }
                        }
                    }
                });
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // c.m.b.o, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (this.V == null) {
            return true;
        }
        final MenuItem findItem = menu.findItem(8);
        if (findItem != null) {
            j0.c(new j0.b() { // from class: e.a.c.h2
                @Override // e.h.g.j0.b
                public final void a() {
                    final MenuItem menuItem = findItem;
                    boolean z = MediaPlaybackActivity.f2951c;
                    try {
                        final int u = z6.u();
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.m1
                            @Override // e.h.g.j0.c
                            public final void a() {
                                int i2 = u;
                                MenuItem menuItem2 = menuItem;
                                boolean z2 = MediaPlaybackActivity.f2951c;
                                if (i2 == 2) {
                                    menuItem2.setIcon(R.drawable.ic_menu_party_shuffle);
                                    menuItem2.setTitle(z6.E(R.string.party_shuffle_off));
                                    return;
                                }
                                menuItem2.setIcon(R.drawable.ic_menu_party_shuffle);
                                menuItem2.setTitle(z6.E(R.string.party_shuffle));
                            }
                        });
                    } catch (Exception e2) {
                        e.h.g.s1.l(e2, true);
                    }
                }
            });
        }
        MenuItem findItem2 = menu.findItem(1);
        if (findItem2 != null) {
            z6.K(this, findItem2.getSubMenu());
        }
        menu.setGroupVisible(1, !((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode());
        return true;
    }

    @Override // c.m.b.o, android.app.Activity
    public void onResume() {
        super.onResume();
        f2951c = true;
        J();
        F();
        if (c.i.g.h.x()) {
            e.d.b.d.a.I(this.r0, this.s0);
            A(false);
        }
        z6.c0(this, 1, (ImageView) findViewById(R.id.blurred_bg_player_view));
        I();
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        h hVar;
        super.onStart();
        this.l0 = false;
        z6.e e2 = z6.e(this, this.o0);
        this.g0 = e2;
        if (e2 == null && (hVar = this.k0) != null) {
            hVar.sendEmptyMessage(2);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.jrtstudio.music.playstateChanged");
        intentFilter.addAction("com.jrtstudio.music.metaChanged");
        intentFilter.addAction("com.jrtstudio.music.queueChanged");
        registerReceiver(this.p0, new IntentFilter(intentFilter));
        J();
        B(C());
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        this.l0 = true;
        h hVar = this.k0;
        if (hVar != null) {
            hVar.removeMessages(1);
        }
        j1.q(this, this.p0);
        z6.a0(this.g0);
        this.V = null;
        super.onStop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView;
        h hVar;
        int action = motionEvent.getAction();
        View findViewById = view.findViewById(R.id.artistname);
        if (findViewById != null) {
            textView = (TextView) findViewById;
        } else {
            View findViewById2 = view.findViewById(R.id.albumname);
            if (findViewById2 != null) {
                textView = (TextView) findViewById2;
            } else {
                View findViewById3 = view.findViewById(R.id.trackname);
                textView = findViewById3 != null ? (TextView) findViewById3 : null;
            }
        }
        if (textView == null) {
            return false;
        }
        if (action == 0) {
            view.setBackgroundColor(-10461088);
            int x = (int) motionEvent.getX();
            this.f2956h = x;
            this.f2954f = x;
            this.f2953e = false;
        } else if (action == 1 || action == 3) {
            view.setBackgroundColor(0);
            if (this.f2953e && (hVar = this.k0) != null) {
                hVar.sendMessageDelayed(hVar.obtainMessage(8, textView), 1000L);
            }
        } else if (action == 2) {
            if (this.f2953e) {
                int scrollX = textView.getScrollX();
                int x2 = (int) motionEvent.getX();
                int i2 = this.f2956h - x2;
                if (i2 != 0) {
                    this.f2956h = x2;
                    int i3 = scrollX + i2;
                    int i4 = this.f2957i;
                    if (i3 > i4) {
                        i3 = (i3 - i4) - this.f2958j;
                    }
                    int i5 = this.f2958j;
                    if (i3 < (-i5)) {
                        i3 = i3 + i5 + i4;
                    }
                    textView.scrollTo(i3, 0);
                }
                return true;
            } else if (Math.abs(this.f2954f - ((int) motionEvent.getX())) > this.i0) {
                h hVar2 = this.k0;
                if (hVar2 != null) {
                    hVar2.removeMessages(0, textView);
                    if (textView.getEllipsize() != null) {
                        textView.setEllipsize(null);
                    }
                    if (textView.getLayout() == null) {
                        return false;
                    }
                    this.f2957i = (int) textView.getLayout().getLineWidth(0);
                    int width = textView.getWidth();
                    this.f2958j = width;
                    if (width > this.f2957i) {
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        view.cancelLongPress();
                        return false;
                    }
                    this.f2953e = true;
                    textView.setHorizontalFadingEdgeEnabled(true);
                    view.cancelLongPress();
                }
                return true;
            }
        }
        return false;
    }

    @Override // e.g.a.d.i
    public void y(Bundle bundle) {
        setVolumeControlStream(3);
        u().o(false);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("notification")) {
            this.u0 = extras.getBoolean("notification");
        }
        setTitle("");
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.P = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: e.a.c.q1
            @Override // java.lang.Runnable
            public final void run() {
                MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                if (mediaPlaybackActivity.l0) {
                    return;
                }
                mediaPlaybackActivity.J();
            }
        }, 0L, 5L, TimeUnit.SECONDS);
        this.N = new g();
        this.p = new i("album art worker");
        this.F = new f(this, this.p.f2972b);
        int b2 = v0.b(this, false);
        int a2 = v0.a(this, false);
        int max = (int) (Math.max(a2, b2) * 0.75f);
        if (max >= a2 || max >= b2 || max >= 500) {
            setContentView(R.layout.audio_player);
        } else {
            setContentView(R.layout.audio_player_square);
        }
        z6.g(this);
        u().q("");
        this.t = (TextView) findViewById(R.id.currenttime);
        this.h0 = (TextView) findViewById(R.id.totaltime);
        this.I = (ProgressBar) findViewById(16908301);
        this.o = (ImageView) findViewById(R.id.album);
        this.r0 = (FrameLayout) findViewById(R.id.banner_layout);
        this.s0 = (ShimmerFrameLayout) findViewById(R.id.shimmer_layout);
        this.J = (RelativeLayout) findViewById(R.id.rectangle_ad_layout);
        this.K = (ShimmerFrameLayout) findViewById(R.id.rectangle_shimmer_layout);
        this.L = (AdView) findViewById(R.id.rectangle_ad_view);
        e.d.b.d.a.f0(this, this.r0, this.s0, findViewById(R.id.view), this.t0);
        getWindow().clearFlags(128);
        TextView textView = (TextView) findViewById(R.id.artistname);
        this.r = textView;
        if (textView != null) {
            z6.X(textView);
        } else {
            this.s = true;
        }
        TextView textView2 = (TextView) findViewById(R.id.albumname);
        this.q = textView2;
        if (textView2 != null) {
            z6.X(textView2);
        } else {
            this.s = true;
        }
        TextView textView3 = (TextView) findViewById(R.id.trackname);
        this.j0 = textView3;
        if (textView3 != null) {
            z6.X(textView3);
        }
        RepeatingImageButton repeatingImageButton = (RepeatingImageButton) findViewById(R.id.prev);
        this.H = repeatingImageButton;
        repeatingImageButton.setOnClickListener(this.a0);
        this.H.a(this.X, 260L);
        ImageView imageView = (ImageView) findViewById(R.id.pause);
        this.G = imageView;
        imageView.requestFocus();
        this.G.setOnClickListener(this.Z);
        RepeatingImageButton repeatingImageButton2 = (RepeatingImageButton) findViewById(R.id.next);
        this.B = repeatingImageButton2;
        repeatingImageButton2.setOnClickListener(this.b0);
        this.B.a(this.W, 260L);
        this.q0 = 1;
        this.u = getResources().getConfiguration().navigation == 2;
        ImageView imageView2 = (ImageView) findViewById(R.id.shuffle);
        this.c0 = imageView2;
        imageView2.setOnClickListener(this.e0);
        ImageView imageView3 = (ImageView) findViewById(R.id.repeat);
        this.O = imageView3;
        imageView3.setOnClickListener(this.d0);
        ProgressBar progressBar = this.I;
        if (progressBar instanceof SeekBar) {
            ((SeekBar) progressBar).setOnSeekBarChangeListener(this.Y);
        }
        this.I.setMax(1000);
        this.i0 = ViewConfiguration.get(this).getScaledTouchSlop();
        if (v0.g()) {
            e.i.a.a aVar = new e.i.a.a(this);
            if (aVar.f8423c) {
                aVar.f8425e.setVisibility(0);
            }
            if (aVar.f8424d) {
                aVar.f8426f.setVisibility(0);
            }
            int parseColor = Color.parseColor("#20000000");
            if (aVar.f8423c) {
                aVar.f8425e.setBackgroundColor(parseColor);
            }
            if (aVar.f8424d) {
                aVar.f8426f.setBackgroundColor(parseColor);
            }
        }
        invalidateOptionsMenu();
        j0.f(new j0.b() { // from class: e.a.c.m2
            @Override // e.h.g.j0.b
            public final void a() {
                boolean z = MediaPlaybackActivity.f2951c;
                e.h.b.n.D(true, false);
            }
        });
    }

    public final void z() {
        final s6 s6Var = this.V;
        if (s6Var == null) {
            return;
        }
        r0 r0Var = e.h.e.g.a;
        j0.f(e.h.e.c.a);
        try {
            j0.f(new j0.b() { // from class: e.a.c.r1
                @Override // e.h.g.j0.b
                public final void a() {
                    final MediaPlaybackActivity mediaPlaybackActivity = MediaPlaybackActivity.this;
                    s6 s6Var2 = s6Var;
                    Objects.requireNonNull(mediaPlaybackActivity);
                    try {
                        if (s6Var2.j()) {
                            s6Var2.n();
                        } else {
                            s6Var2.o();
                        }
                        e.h.g.j0.h(new j0.c() { // from class: e.a.c.k2
                            @Override // e.h.g.j0.c
                            public final void a() {
                                MediaPlaybackActivity mediaPlaybackActivity2 = MediaPlaybackActivity.this;
                                Objects.requireNonNull(mediaPlaybackActivity2);
                                try {
                                    mediaPlaybackActivity2.C();
                                    mediaPlaybackActivity2.F();
                                } catch (Exception e2) {
                                    e.h.g.s1.l(e2, true);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        c.i.g.b.l(th);
                        e.h.g.s1.l(th, true);
                    }
                }
            });
        } catch (Throwable th) {
            c.i.g.b.l(th);
            s1.l(th, true);
        }
    }
}

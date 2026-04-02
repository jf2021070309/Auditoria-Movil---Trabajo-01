package e.h.d;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.android.music.MediaButtonIntentReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.jrtstudio.audio.Bookmark;
import e.a.c.j6;
import e.a.c.k6;
import e.h.d.e0;
import e.h.d.m0;
import e.h.d.u;
import e.h.d.v0;
import e.h.d.x0;
import e.h.g.b1;
import e.h.g.g1;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v1;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import music.musicplayer.R;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class m0 extends e0 implements e.h.g.z0 {
    public g G;
    public v0 H;
    public l I;
    public boolean J;
    public boolean K;
    public w0 L;
    public e.h.g.r0 M;
    public int N;
    public Bookmark O;
    public float P;
    public boolean U;
    public boolean V;
    public u W;
    public int X;
    public int Y;
    public boolean Z;
    public int a0;
    public e b0;
    public f c0;
    public final BroadcastReceiver d0;
    public boolean e0;
    public e.h.g.r0 f0;
    public e.h.g.r0 g0;
    public e.h.g.r0 h0;
    public final e.h.g.r0 i0;
    public int j0;
    public MediaSessionCompat k0;
    public s0 l0;
    public h m0;
    public i n0;
    public final ArrayList<z> o0;
    public ScheduledExecutorService p0;
    public boolean q0;
    public boolean r0;
    public Intent s0;
    public final g1 t0;
    public boolean u0;
    public BroadcastReceiver v0;
    public e.h.g.r0 w0;
    public Runnable x0;
    public static final d q = new d(null);
    public static final Object r = new Object();
    public static final long s = TimeUnit.SECONDS.toMillis(15);
    public static final Object t = new Object();
    public static volatile m0 u = null;
    public static volatile z v = new y();
    public static int w = 5;
    public static int x = 4;
    public static int y = 1;
    public static int z = 3;
    public static int A = 6;
    public static j B = new j(null);
    public static int C = 1;
    public static int D = 2;
    public static int E = 3;
    public static int F = 4;

    /* loaded from: classes2.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c cVar = new c(null);
            cVar.a = intent;
            cVar.f8143b = m0.this;
            m0.q.b(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends MediaSessionCompat.a {
        public b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void b(String str, Bundle bundle) {
            if ("com.jrtstudio.AMP.Shuffle".equals(str)) {
                m0.N0(e.h.g.d1.k.PROGRESS_SHUFFLE);
            } else if ("com.jrtstudio.AMP.NoShuffle".equals(str)) {
                m0.N0(e.h.g.d1.k.PROGRESS_SHUFFLE);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public boolean c(Intent intent) {
            Objects.requireNonNull((j6) c.i.g.b.f());
            MediaButtonIntentReceiver.x(intent);
            return true;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void d() {
            m0.N0(e.h.g.d1.k.USER_PAUSE);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void e() {
            m0.N0(e.h.g.d1.k.USER_PLAY);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void f(String str, Bundle bundle) {
            Objects.requireNonNull(m0.this);
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void g(String str, Bundle bundle) {
            Objects.requireNonNull((j6) c.i.g.b.f());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void h(long j2) {
            m0.this.M0(new Bookmark(j2, ""));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void i() {
            m0.N0(e.h.g.d1.k.USER_NEXT_FOREGROUND);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void j() {
            m0.N0(e.h.g.d1.k.USER_PREVIOUS_FOREGOUND);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void k(long j2) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public void l() {
            m0.N0(e.h.g.d1.k.USER_PAUSE);
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public Intent a;

        /* renamed from: b  reason: collision with root package name */
        public m0 f8143b;

        public c() {
        }

        public c(a aVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends b1<c> {
        public d(a aVar) {
        }

        @Override // e.h.g.b1
        public void a(c cVar) {
            c cVar2 = cVar;
            Intent intent = cVar2.a;
            m0 m0Var = cVar2.f8143b;
            if (intent == null || m0Var == null) {
                return;
            }
            String action = intent.getAction();
            t1.h("service.onReceive " + action);
            g gVar = m0Var.G;
            if ("PrivateMethod".equals(action)) {
                Intent intent2 = new Intent();
                intent2.putExtras(intent.getExtras());
                m0Var.k(intent2);
            } else if ("android.media.AUDIO_BECOMING_NOISY".equals(action)) {
                m0Var.g0 = new e.h.g.r0();
                t1.h("Becoming Noisy");
                m0.N0(e.h.g.d1.k.USER_PAUSE);
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                m0Var.e0 = true;
                c.i.g.b.f2070c.removeCallbacks(m0.B);
                if (m0Var.I == l.PausedByTransientLossOfFocus || gVar == null || !gVar.b()) {
                    return;
                }
                Objects.requireNonNull(c.i.g.b.f2069b);
                if (p0.OFF == p0.JRTSTUDIO) {
                    a0 f2 = c.i.g.b.f();
                    m0Var.v0();
                    Objects.requireNonNull((j6) f2);
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                m0Var.e0 = false;
                if (m0Var.I == l.PausedByTransientLossOfFocus || gVar == null || !gVar.b()) {
                    return;
                }
                Objects.requireNonNull(c.i.g.b.f2069b);
                if (p0.OFF == p0.JRTSTUDIO) {
                    a0 f3 = c.i.g.b.f();
                    m0Var.v0();
                    Objects.requireNonNull((j6) f3);
                    c.i.g.b.f2070c.removeCallbacks(m0.B);
                    c.i.g.b.f2070c.postDelayed(m0.B, 5000L);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements AudioManager.OnAudioFocusChangeListener {
        public final WeakReference<m0> a;

        public e(m0 m0Var) {
            this.a = new WeakReference<>(m0Var);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i2) {
            m0 m0Var = this.a.get();
            if (m0Var != null) {
                v0 v0Var = m0Var.H;
                if (v0Var != null) {
                    u0 u0Var = v0Var.f8212b;
                    u0 u0Var2 = u0.ChromeCast;
                    if (u0Var != u0Var2) {
                        if (i2 != -3 && i2 != -2) {
                            if (i2 == -1) {
                                t1.d("full focus lost");
                                m0Var.T0(false);
                                m0Var.Q0(l.NotPlaying, "full focus lost");
                                m0Var.j(Integer.valueOf(m0.A));
                                return;
                            } else if (i2 != 1 && i2 != 2 && i2 != 3) {
                                t1.d("Unknown audio focus = " + i2);
                                return;
                            } else {
                                t1.d("focus regained");
                                l lVar = m0Var.I;
                                if (lVar == l.PausedByTransientLossOfFocus) {
                                    t1.d("Begin playing again");
                                    m0Var.U0();
                                } else if (lVar == l.Playing) {
                                    t1.d("Begin playing again, just to raise the volume");
                                    m0Var.U0();
                                }
                                m0Var.j(Integer.valueOf(m0.A));
                                return;
                            }
                        } else if (m0Var.A0()) {
                            t1.d("tmp focus lost");
                            if (m0Var.I.ordinal() == 0 && v0Var.f8212b != u0Var2) {
                                m0Var.g(m0.A);
                                t1.h("tmp focus lost");
                                Objects.requireNonNull(c.i.g.b.f2069b);
                                y0 y0Var = y0.Pause;
                                if (y0Var == y0Var) {
                                    m0Var.T0(false);
                                    m0Var.Q0(l.PausedByTransientLossOfFocus, "tmp focus lost");
                                    return;
                                }
                                StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
                                t1.h("Sending duck from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
                                m0Var.a0 = 3;
                                m0Var.t0();
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                t1.d("ignoring focus change because of Chromecast");
                m0Var.j(Integer.valueOf(m0.A));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class f {
        public a a = new a(this);

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<m0> f8144b;

        /* loaded from: classes2.dex */
        public static class a implements Runnable {
            public final WeakReference<f> a;

            public a(f fVar) {
                this.a = new WeakReference<>(fVar);
            }

            @Override // java.lang.Runnable
            public void run() {
                m0 m0Var;
                f fVar = this.a.get();
                if (fVar == null || (m0Var = fVar.f8144b.get()) == null) {
                    return;
                }
                m0Var.j(Integer.valueOf(m0.z));
            }
        }

        public f(m0 m0Var) {
            this.f8144b = new WeakReference<>(m0Var);
        }

        public final void a() {
            m0 m0Var = this.f8144b.get();
            if (m0Var != null) {
                m0Var.i0.g();
                if (this.f8144b.get() != null) {
                    e.h.g.x0.a.removeCallbacks(this.a);
                }
                m0Var.g(m0.z);
                e.h.g.x0.a.postDelayed(this.a, m0.s);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class g {
        public a a = new a(this);

        /* renamed from: b  reason: collision with root package name */
        public e.h.g.r0 f8145b = null;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8146c = false;

        /* renamed from: d  reason: collision with root package name */
        public final WeakReference<m0> f8147d;

        /* loaded from: classes2.dex */
        public static class a implements Runnable {
            public final WeakReference<g> a;

            public a(g gVar) {
                this.a = new WeakReference<>(gVar);
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = this.a.get();
                if (gVar != null) {
                    m0 m0Var = gVar.f8147d.get();
                    if (m0Var == null) {
                        t1.h("Service reference expired");
                        return;
                    }
                    t1.h("Keep alive != Playing2");
                    d dVar = m0.q;
                    m0Var.j(0);
                }
            }
        }

        public g(m0 m0Var) {
            this.f8147d = new WeakReference<>(m0Var);
        }

        public final void a() {
            if (this.f8147d.get() != null) {
                e.h.g.x0.a.removeCallbacks(this.a);
            } else {
                t1.h("Service reference expired");
            }
        }

        public boolean b() {
            if (this.f8146c) {
                return true;
            }
            e.h.g.r0 r0Var = this.f8145b;
            return r0Var != null && r0Var.b() < m0.s;
        }

        public final void c(boolean z, String str) throws Exception {
            m0 m0Var = this.f8147d.get();
            if (m0Var == null) {
                t1.h("Service reference expired");
                return;
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
            c.i.g.h.I(false);
            t1.h("we are not playing, " + str);
            if (this.f8146c) {
                this.f8145b = new e.h.g.r0();
                this.f8146c = false;
                v0 v0Var = m0Var.H;
                if (v0Var != null) {
                    v0Var.o(false);
                }
                if (z) {
                    m0Var.L0();
                }
                a();
                e.h.g.x0.a.postDelayed(this.a, m0.s);
                m0Var.C0(new u.b(m0.v.n(), m0Var.I, m0Var.w0(), m0Var.q0(), m0Var.H, m0Var.L, null), v.PLAYSTATE_CHANGED, false);
            }
        }

        public void d() throws Exception {
            m0 m0Var = this.f8147d.get();
            if (m0Var == null) {
                t1.h("Service reference expired");
                return;
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
            c.i.g.h.B("aa", true);
            t1.h("we are playing");
            if (!this.f8146c) {
                Objects.requireNonNull(c.i.g.b.f2069b);
                synchronized (m0.r) {
                    e eVar = m0Var.b0;
                    AudioManager audioManager = (AudioManager) m0Var.getSystemService("audio");
                    if (audioManager != null) {
                        Objects.requireNonNull(eVar);
                        e eVar2 = m0Var.b0;
                        if (eVar2 != null) {
                            if (e.h.g.v0.j()) {
                                AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
                                AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
                                builder.setAudioAttributes(build);
                                builder.setAcceptsDelayedFocusGain(false);
                                builder.setOnAudioFocusChangeListener(eVar2);
                                Objects.requireNonNull(c.i.g.b.f2069b);
                                if (y0.Pause == y0.Duck) {
                                    builder.setWillPauseWhenDucked(false);
                                } else {
                                    builder.setWillPauseWhenDucked(true);
                                }
                                if (audioManager.requestAudioFocus(builder.build()) == 0) {
                                    t1.h("Audio focus request failed2!");
                                }
                            } else if (audioManager.requestAudioFocus(eVar2, 3, 1) == 0) {
                                t1.h("Audio focus request failed!");
                            }
                        }
                    }
                }
            }
            l lVar = m0Var.I;
            l lVar2 = l.Playing;
            if (lVar != lVar2) {
                m0Var.Q0(lVar2, " because we are playing");
            }
            m0Var.C0(new u.b(m0.v.n(), m0Var.I, m0Var.w0(), m0Var.q0(), m0Var.H, m0Var.L, null), v.PLAYSTATE_CHANGED, false);
            this.f8146c = true;
            a();
            t1.h("Keep alive = Playing");
            d dVar = m0.q;
            m0Var.g(0);
            m0Var.J0();
            m0Var.i0.g();
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends PhoneStateListener {
        public final WeakReference<m0> a;

        public h(m0 m0Var) {
            this.a = new WeakReference<>(m0Var);
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i2, String str) {
            int i3;
            m0 m0Var = this.a.get();
            if (m0Var != null) {
                if (i2 == 1) {
                    t1.h("ringing");
                    i3 = 23;
                } else if (i2 == 2) {
                    t1.h("offhook");
                    i3 = 24;
                } else if (i2 == 0) {
                    t1.h("idle");
                    i3 = 25;
                } else {
                    i3 = -1;
                }
                if (i3 != -1) {
                    Intent intent = new Intent();
                    intent.putExtra("PrivateMethod", i3);
                    m0Var.k(intent);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i extends v1 {
        public i() {
            super("psthread");
        }

        @Override // e.h.g.v1
        public void b(Message message) {
            z zVar = (z) message.obj;
            if (zVar != null) {
                try {
                    t n2 = zVar.n();
                    if (n2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("track", n2.getTitle());
                        bundle.putString("artist", n2.e());
                        bundle.putString("album", n2.d());
                        bundle.putString("path", n2.getPath());
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        c.i.g.h.G(bundle);
                    }
                } catch (Exception unused) {
                }
            }
            Objects.requireNonNull((j6) c.i.g.b.f());
            if (zVar != null && (zVar instanceof k6)) {
                ((k6) zVar).y();
            }
            m0 m0Var = m0.this;
            if (m0Var.L != w0.NOT_SHUTTING_DOWN) {
                m0Var.H();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class j implements Runnable {
        public j(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0 m0Var = m0.u;
            if (m0Var != null) {
                a0 f2 = c.i.g.b.f();
                m0Var.v0();
                Objects.requireNonNull((j6) f2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class k implements Runnable {
        public final WeakReference<m0> a;

        public k(m0 m0Var) {
            this.a = new WeakReference<>(m0Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Thread.currentThread().setPriority(1);
            long nanoTime = System.nanoTime();
            do {
                z = false;
                m0 m0Var = this.a.get();
                if (m0Var != null && m0Var.L == w0.NOT_SHUTTING_DOWN) {
                    while ((System.nanoTime() - nanoTime) / 1000000 < 250) {
                        try {
                            Thread.sleep(Math.max(0L, 250 - ((System.nanoTime() - nanoTime) / 1000000)));
                        } catch (Throwable th) {
                            s1.l(th, true);
                        }
                    }
                    nanoTime = System.nanoTime();
                    v0 v0Var = m0Var.H;
                    if (v0Var != null) {
                        int ordinal = v0Var.f8212b.ordinal();
                        Bookmark bookmark = null;
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                bookmark = new Bookmark(0L, "");
                            } else {
                                v0.a aVar = v0Var.f8213c;
                                if (aVar != null) {
                                    bookmark = aVar.w();
                                }
                            }
                        }
                        m0Var.O = bookmark;
                    }
                    z = true;
                    continue;
                }
            } while (z);
        }
    }

    /* loaded from: classes.dex */
    public enum l {
        Playing,
        NotPlaying,
        PausedByTransientLossOfFocus
    }

    public m0() {
        super("JRTMusic", false);
        this.G = new g(this);
        this.H = null;
        this.I = l.NotPlaying;
        this.K = false;
        this.L = w0.NOT_SHUTTING_DOWN;
        this.M = new e.h.g.r0();
        this.N = 0;
        this.O = new Bookmark(0L, "");
        this.P = 1.0f;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = new e(this);
        this.c0 = new f(this);
        this.d0 = new a();
        this.e0 = true;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = new e.h.g.r0();
        this.j0 = 0;
        this.l0 = null;
        this.n0 = null;
        this.o0 = new ArrayList<>();
        this.t0 = new g1() { // from class: e.h.d.p
            @Override // e.h.g.g1
            public final void a() {
                Intent intent;
                m0 m0Var = m0.this;
                if (m0Var.r0) {
                    return;
                }
                try {
                    Intent intent2 = m0Var.s0;
                    if (intent2 == null) {
                        try {
                            intent = new Intent("com.jrtstudio.AMP.StartForeground");
                        } catch (IllegalStateException e2) {
                            intent = intent2;
                            e = e2;
                        }
                        try {
                            intent.setComponent(new ComponentName(m0Var, c.i.g.b.d()));
                            intent2 = intent;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            m0Var.k(intent);
                            m0Var.s0 = null;
                            s1.l(e, true);
                            return;
                        }
                    }
                    m0Var.startService(intent2);
                    m0Var.s0 = intent2;
                    m0Var.r0 = true;
                    t1.l("ensured notification");
                } catch (IllegalStateException e4) {
                    e = e4;
                    intent = null;
                }
            }
        };
        this.u0 = false;
        this.v0 = null;
        this.x0 = new Runnable() { // from class: e.h.d.l
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
                if ((r2 != null ? r2.f4885b : false) == false) goto L22;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e.h.d.l.run():void");
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void N0(final e.h.g.d1.k kVar) {
        if (j1.f()) {
            e.h.g.j0.d(new j0.b() { // from class: e.h.d.o
                @Override // e.h.g.j0.b
                public final void a() {
                    m0.N0(e.h.g.d1.k.this);
                }
            });
        } else if (kVar == null) {
        } else {
            boolean z2 = false;
            String str = "com.jrtstudio.audio.musicservicecommand.play";
            switch (kVar.ordinal()) {
                case 0:
                    str = "com.jrtstudio.audio.musicservicecommand.togglepause";
                    break;
                case 1:
                    str = "com.jrtstudio.audio.musicservicecommand.togglepause2";
                    z2 = true;
                    break;
                case 2:
                    str = "com.jrtstudio.audio.musicservicecommand.shuffle";
                    break;
                case 3:
                    str = "com.jrtstudio.audio.musicservicecommand.previous";
                    break;
                case 4:
                    str = "com.jrtstudio.audio.musicservicecommand.next";
                    break;
                case 5:
                    str = "com.jrtstudio.audio.musicservicecommand.pause";
                    break;
                case 6:
                    break;
                case 7:
                    str = "com.jrtstudio.audio.musicservicecommand.next2";
                    z2 = true;
                    break;
                case 8:
                    str = "com.jrtstudio.audio.musicservicecommand.previous2";
                    z2 = true;
                    break;
                case 9:
                    str = "com.jrtstudio.audio.musicservicecommand.cancelall";
                    break;
                case 10:
                    str = "com.jrtstudio.audio.musicservicecommand.playB";
                    z2 = true;
                    break;
                case 11:
                    str = "com.jrtstudio.audio.musicservicecommand.endB";
                    break;
                case 12:
                    str = "com.jrtstudio.audio.musicservicecommand.playConnect";
                    break;
                case 13:
                    z2 = true;
                    break;
                case 14:
                    str = "com.jrtstudio.audio.musicservicecommand.repeat";
                    break;
                case 15:
                    str = "com.jrtstudio.audio.Hook";
                    z2 = true;
                    break;
                case 16:
                    str = "com.jrtstudio.audio.Hook";
                    break;
                default:
                    str = "";
                    break;
            }
            if (str.length() > 0) {
                try {
                    Intent y0 = y0(e.h.g.x0.f8405d, str);
                    if (z2) {
                        e.h.g.x0.F(u, c.i.g.b.d(), y0);
                    } else {
                        e.h.g.x0.f8405d.startService(y0);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Intent y0(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(context, c.i.g.b.d()));
        return intent;
    }

    public final void A() throws Exception, x0 {
        m0 f2;
        t1.h("Crossfade Complete");
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            if (f2.V) {
                v0Var.r(l.NotPlaying, "stopped after current");
            }
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                aVar.d(f2.V);
            }
            f2.V = c.i.g.b.f2069b.b() == F;
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public boolean A0() {
        Objects.requireNonNull(c.i.g.b.f2069b);
        try {
            return ((TelephonyManager) getSystemService("phone")).getCallState() == 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public void B() throws Exception, x0 {
        l0();
        Objects.requireNonNull(c.i.g.b.f2069b);
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                v.n();
                if (v0.this.f8214d.get() != null) {
                    Objects.requireNonNull((j6) c.i.g.b.f());
                    v0.this.i(true, 0);
                }
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void B0(int i2) {
        Intent intent = new Intent();
        intent.putExtra("reason", i2);
        intent.putExtra("PrivateMethod", 33);
        k(intent);
    }

    public final void C() throws Exception, x0 {
        m0 f2;
        v0.a aVar;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            if (v.size() <= 0) {
                t1.k("No play queue");
            } else {
                f2.C0(v0Var.d(null, null, -1L), v.SONG_PLAYED, false);
                if (v0Var.f8212b.ordinal() == 1 && (aVar = v0Var.f8213c) != null) {
                    aVar.f();
                }
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void C0(u.b bVar, v vVar, boolean z2) throws Exception {
        t tVar;
        t tVar2;
        u uVar = this.W;
        if (uVar == null || bVar == null) {
            return;
        }
        s0 s0Var = uVar.f8204d;
        if (vVar == v.ONLY_REMOTE_CONTROLS) {
            if (s0Var != null) {
                s0Var.o(bVar);
            }
        } else if (vVar == v.SONG_PLAYED) {
            if (bVar.f8205b != null) {
                Objects.requireNonNull((j6) c.i.g.b.f());
            }
        } else if (vVar == v.SONG_SKIPPED) {
            if (bVar.f8205b != null) {
                Objects.requireNonNull((j6) c.i.g.b.f());
            }
        } else if (vVar == v.REPEATE_MODE_CHANGED || vVar == v.SHUFFLE_MODE_CHANGED) {
            ((j6) c.i.g.b.f()).b(bVar, vVar);
        } else {
            boolean z3 = false;
            if (vVar == v.META_CHANGED) {
                u.b bVar2 = uVar.f8202b;
                if (!(bVar2 == null || (tVar2 = bVar2.f8205b) == null || !tVar2.equals(bVar.f8205b)) && !z2) {
                    z3 = true;
                }
                Objects.requireNonNull((j6) c.i.g.b.f());
                if (s0Var != null) {
                    s0Var.o(bVar);
                    if (z3) {
                        s1.c("Skipping meta change broadcast");
                        return;
                    }
                }
                uVar.f8202b = bVar;
                m0 m0Var = u;
                if (m0Var != null) {
                    m0Var.L0();
                }
            } else if (vVar == v.PLAYSTATE_CHANGED) {
                u.b bVar3 = uVar.f8203c;
                if (!(bVar3 == null || (tVar = bVar3.f8205b) == null || !tVar.equals(bVar.f8205b) || !bVar3.f8206c.equals(bVar.f8206c)) && !z2) {
                    z3 = true;
                }
                Objects.requireNonNull((j6) c.i.g.b.f());
                if (s0Var != null) {
                    s0Var.p(bVar);
                    if (z3) {
                        StringBuilder y2 = e.a.d.a.a.y("Skipping playstate change broadcast, already ");
                        y2.append(bVar.f8206c);
                        s1.c(y2.toString());
                        return;
                    }
                }
                uVar.f8203c = bVar;
            } else if (vVar == v.QUEUE_CHANGED && s0Var != null) {
                s0Var.p(bVar);
            }
            t tVar3 = bVar.f8205b;
            if (tVar3 != null) {
                u.c cVar = new u.c(null);
                cVar.a = bVar;
                cVar.f8211b = tVar3;
                u.a.put(cVar);
            }
            ((j6) c.i.g.b.f()).b(bVar, vVar);
        }
    }

    public final void D(z zVar, int i2) throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            if (zVar.size() > 0) {
                a0 f3 = c.i.g.b.f();
                z zVar2 = v;
                j6 j6Var = (j6) f3;
                Objects.requireNonNull(j6Var);
                int position = zVar2.getPosition();
                ArrayList<t> E2 = zVar2.E();
                if (i2 != 2) {
                    if (i2 == 3) {
                        E2.addAll(zVar.E());
                    }
                } else if (E2.size() == 0) {
                    E2.addAll(0, zVar.E());
                } else {
                    E2.addAll(position + 1, zVar.E());
                }
                v = j6Var.e(position, E2);
                try {
                    if (v0Var.f8212b.ordinal() == 1) {
                        v0Var.h(7);
                        v0.a aVar = v0Var.f8213c;
                        if (aVar != null) {
                            aVar.l(v.D(f2, true));
                        }
                    }
                    f2.sendBroadcast(new Intent("com.jrtstudio.audio.modeChanged"));
                    f2.C0(v0Var.d(null, null, -1L), v.QUEUE_CHANGED, false);
                } catch (RemoteException e2) {
                    s1.l(e2, true);
                }
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void D0(z zVar, int i2, boolean z2) {
        Intent intent = new Intent();
        this.o0.add(zVar);
        intent.putExtra("shuffle", i2);
        intent.putExtra("play", z2);
        intent.putExtra("PrivateMethod", 8);
        t1.h("PLAYLIST: Sending Open Playlist");
        k(intent);
    }

    public final void E(g1 g1Var) {
        t1.l("ensure notification");
        if (this.l0 == null) {
            this.l0 = new s0(this);
        }
        s0 s0Var = this.l0;
        if (s0Var == null) {
            t1.l("Can't ensure without helper");
        } else if (e.h.g.v0.d()) {
            s0Var.q(2, g1Var);
        } else {
            s0Var.q(0, g1Var);
        }
    }

    public final void E0() {
        if (this.Z) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            if (((AudioManager) getSystemService("audio")).isBluetoothA2dpOn()) {
                t1.h("logging last resume bluetooth time");
                this.h0 = new e.h.g.r0();
            }
            if (this.I == l.PausedByTransientLossOfFocus) {
                t1.h("Resume after phone call");
                U0();
            } else {
                StringBuilder y2 = e.a.d.a.a.y("Don't resume after phone call, playState = ");
                y2.append(this.I.name());
                t1.h(y2.toString());
            }
        }
        if (this.I == l.PausedByTransientLossOfFocus) {
            Q0(l.NotPlaying, "didn't resume after phone call");
        }
        J0();
    }

    public final void F() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var == null || this.a0 != 2) {
            return;
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        int ordinal = x0().ordinal();
        if (ordinal == 0) {
            this.P = 1.0f;
            v0Var.s(1.0f);
            this.a0 = 0;
        } else if (ordinal == 1) {
            this.P = 1.0f;
            v0Var.s(1.0f);
            v0Var.l(false, true);
            this.a0 = 0;
            if (this.u0 && x0() == t0.Playing) {
                Objects.requireNonNull(c.i.g.b.e());
                j1.p("", 1);
            }
            this.u0 = false;
        } else if (ordinal == 2 || ordinal == 5) {
            v0 v0Var2 = this.H;
            if (v0Var2 != null) {
                v0Var2.l(true, true);
            }
            if (this.u0 && x0() == t0.Playing) {
                Objects.requireNonNull(c.i.g.b.e());
                j1.p("", 1);
            }
            this.u0 = false;
        }
    }

    public final void F0() throws RemoteException {
        boolean z2 = true;
        this.Z = true;
        Objects.requireNonNull(c.i.g.b.f2069b);
        l lVar = this.I;
        if (lVar != l.Playing && lVar != l.PausedByTransientLossOfFocus) {
            z2 = false;
        }
        t1.h("Paused by transient focus lost3 " + z2);
        if (this.f0 != null) {
            StringBuilder y2 = e.a.d.a.a.y("last time = ");
            y2.append(this.f0.b());
            t1.h(y2.toString());
        }
        if (z2) {
            g(y);
        }
        T0(false);
        if (z2) {
            Q0(l.PausedByTransientLossOfFocus, "phone off hook");
        }
    }

    public final void G() throws Exception {
        v0 v0Var = this.H;
        if (v0Var != null) {
            int i2 = this.a0;
            if (i2 == 1 || i2 == 3 || i2 == 4) {
                Objects.requireNonNull(c.i.g.b.f2069b);
                boolean z2 = this.a0 == 3;
                int ordinal = x0().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2 || ordinal == 5) {
                        t1.h("Attempting to fade out when the playing isn't initialized");
                    }
                } else if (!z2) {
                    this.a0 = 0;
                    this.P = 1.0f;
                    v0Var.s(1.0f);
                    W();
                } else {
                    int i3 = this.a0;
                    if (i3 == 3 && this.P <= 0.3f) {
                        this.a0 = 0;
                        return;
                    }
                    float f2 = this.P;
                    if (f2 == 0.0f || i3 == 4) {
                        this.M.g();
                        if (this.P != 0.0f) {
                            this.P = 0.0f;
                            v0Var.s(0.0f);
                        }
                        this.a0 = 0;
                        W();
                        return;
                    }
                    int a2 = (int) e.a.d.a.a.a(1.0f, f2, 5.0f, 2.0f);
                    while (this.M.b() < a2) {
                        Thread.sleep(0L);
                    }
                    float f3 = this.P - 0.006f;
                    this.P = f3;
                    float max = Math.max(f3, 0.0f);
                    this.P = max;
                    v0Var.s(max);
                    this.M.g();
                    t0();
                }
            }
        }
    }

    public final void G0() throws RemoteException {
        this.Z = true;
        Objects.requireNonNull(c.i.g.b.f2069b);
        l lVar = this.I;
        boolean z2 = lVar == l.Playing || lVar == l.PausedByTransientLossOfFocus;
        t1.h("Paused by transient focus lost1 " + z2);
        if (this.f0 != null) {
            StringBuilder y2 = e.a.d.a.a.y("last time = ");
            y2.append(this.f0.b());
            t1.h(y2.toString());
        }
        if (!z2 && ((AudioManager) getSystemService("audio")).isBluetoothA2dpOn()) {
            e.h.g.r0 r0Var = this.f0;
            boolean z3 = r0Var != null && (r0Var.c() > 4L ? 1 : (r0Var.c() == 4L ? 0 : -1)) < 0 ? true : z2;
            t1.h("Paused by transient focus lost2 " + z3);
            z2 = z3;
        }
        if (z2) {
            g(y);
        }
        T0(false);
        if (z2) {
            Q0(l.PausedByTransientLossOfFocus, "phone ringing");
        }
    }

    public final void H() {
        int i2 = this.N + 1;
        this.N = i2;
        if (i2 > 1) {
            s0 s0Var = this.l0;
            if (s0Var != null) {
                s0Var.l();
            }
            c();
        }
    }

    public final void H0(boolean z2) {
        long j2;
        if (z2 || Runtime.getRuntime().freeMemory() / 1048576 <= 0) {
            StringBuilder y2 = e.a.d.a.a.y("Max Heap Memory ");
            y2.append(Runtime.getRuntime().maxMemory() / 1048576);
            t1.h(y2.toString());
            t1.h("Heap Memory " + (Runtime.getRuntime().totalMemory() / j2));
            t1.h("Used Memory " + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j2));
        }
    }

    public final void I() throws Exception, x0 {
        m0 f2;
        t1.h("G Completed");
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        boolean z2 = true;
        try {
            v0Var.o(true);
            if (f2.V) {
                v0Var.r(l.NotPlaying, "stopped after currentg");
            }
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                aVar.h(f2.V);
            }
            if (c.i.g.b.f2069b.b() != F) {
                z2 = false;
            }
            f2.V = z2;
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public final void I0(boolean z2) throws Exception, x0 {
        int i2 = t1.a;
        s1.c("QUEUE: reload queue");
        S0();
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.n(z2, false);
        }
    }

    public IBinder J() {
        return null;
    }

    public final void J0() {
        j(Integer.valueOf(y));
    }

    public void K(Intent intent) throws Exception {
        f fVar;
        if (!this.q0) {
            try {
                g0();
            } catch (Throwable th) {
                s1.k(th);
                return;
            }
        }
        if (intent.getAction() == null && !intent.hasExtra("PrivateMethod")) {
            t1.b();
            return;
        }
        if (intent.getAction() != null) {
            String action = intent.getAction();
            if (action.equals("com.jrtstudio.AMP.StartForeground") || action.equals("com.jrtstudio.audio.musicservicecommand.next2") || action.equals("com.jrtstudio.audio.musicservicecommand.previous2") || action.equals("com.jrtstudio.audio.musicservicecommand.togglepause2") || action.equals("com.jrtstudio.audio.musicservicecommand.playB")) {
                E(this.t0);
            }
        }
        w0 w0Var = this.L;
        w0 w0Var2 = w0.NOT_SHUTTING_DOWN;
        if (w0Var != w0Var2) {
            H();
            return;
        }
        if (e()) {
            if (intent.getAction() == null) {
                if (intent.hasExtra("PrivateMethod")) {
                    intent.getIntExtra("PrivateMethod", 0);
                }
            } else if (intent.getAction().length() > 0) {
                intent.getAction();
            }
            t1.b();
            this.w0 = new e.h.g.r0();
        }
        if (this.L != w0Var2) {
            return;
        }
        f fVar2 = this.c0;
        if (fVar2 != null) {
            fVar2.a();
        }
        v0 v0Var = this.H;
        int i2 = 1;
        if (!this.K) {
            Process.setThreadPriority(0);
            z0();
            v0Var = this.H;
            try {
                I0(false);
            } catch (x0 e2) {
                s1.k(e2);
                c.i.g.b.m(e2);
                if (e2.f8228b == x0.a.FROZEN) {
                    y(e2);
                } else if (e2.f8228b == x0.a.PERM_FAILURE) {
                    m0();
                }
            }
            this.K = true;
        }
        try {
            if (intent.getAction() != null) {
                String action2 = intent.getAction();
                if (action2.equals("com.jrtstudio.audio.Hook")) {
                    if (this.l0 != null) {
                        u.b bVar = new u.b(v0(), this.I, w0(), q0(), this.H, this.L, intent.getExtras());
                        bVar.f8207d = true;
                        C0(bVar, v.ONLY_REMOTE_CONTROLS, true);
                    }
                } else if ("com.jrtstudio.audio.RefreshWidget".equals(action2)) {
                    t1.h("Update widgets");
                    C0(new u.b(this.H.e(), this.I, w0(), q0(), this.H, this.L, intent.getExtras()), v.PLAYSTATE_CHANGED, true);
                } else if ("com.jrtstudio.audio.musicservicecommand.cancelall".equals(action2)) {
                    W0();
                } else if ("com.jrtstudio.audio.musicservicecommand.repeat".equals(action2)) {
                    int d2 = c.i.g.b.f2069b.d();
                    if (d2 == 0) {
                        i2 = 2;
                    } else if (d2 != 2) {
                        i2 = 0;
                    }
                    c.i.g.b.f2069b.f(i2);
                    O0(i2);
                } else if ("com.jrtstudio.audio.musicservicecommand.shuffle".equals(action2)) {
                    int e3 = c.i.g.b.f2069b.e();
                    if (e3 == 0) {
                        c.i.g.b.f2069b.g(1);
                        P0(1);
                        if (c.i.g.b.f2069b.d() == 1) {
                            c.i.g.b.f2069b.f(2);
                            O0(2);
                        }
                    } else if (e3 == 1) {
                        c.i.g.b.f2069b.g(0);
                        P0(0);
                    } else {
                        t1.h("Invalid shuffle mode: " + e3);
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.togglepause".equals(action2)) {
                    w();
                } else if ("com.jrtstudio.audio.musicservicecommand.togglepause2".equals(action2)) {
                    E(this.t0);
                    w();
                } else if ("com.jrtstudio.audio.musicservicecommand.endB".equals(action2)) {
                    if (this.I == l.PausedByTransientLossOfFocus) {
                        Q0(l.NotPlaying, "Bluetooth ended, don't resume anything");
                    }
                    if (this.I != l.Playing) {
                        j(0);
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.playB".equals(action2)) {
                    E(this.t0);
                    if (A0()) {
                        t1.h("CMD_PLAY_ON_B");
                        this.u0 = true;
                        U0();
                        J0();
                    } else {
                        t1.h("Not starting bluetooth because we are on a phone call");
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.playConnect".equals(action2)) {
                    if (A0()) {
                        t1.h("CMD_PLAY_ON_CONNECT");
                        this.u0 = true;
                        U0();
                        J0();
                    } else {
                        t1.h("Not starting because we are on a phone call");
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.play".equals(action2)) {
                    t1.h("CMD_PLAY");
                    if (A0()) {
                        e.h.g.r0 r0Var = this.g0;
                        if (r0Var != null && r0Var.c() <= 4) {
                            t1.h("Ignore noisy play command");
                            J0();
                        }
                        U0();
                        J0();
                    } else {
                        t1.h("Not starting because we are on a phone call");
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.previousorstart".equals(action2)) {
                    t1.h("CMD_PREVIOUS_OR_START");
                    if (A0()) {
                        Q0(l.Playing, "user previous or start");
                        if (v0Var == null || !v0Var.j()) {
                            Bookmark p = v0().p();
                            if (p == null) {
                                p = new Bookmark(-1L, "");
                            }
                            c0(p);
                            X();
                        } else {
                            Y();
                        }
                    } else {
                        t1.h("Not starting because we are on a phone call");
                    }
                } else if ("com.jrtstudio.audio.musicservicecommand.previous".equals(action2)) {
                    v(v0Var);
                } else if ("com.jrtstudio.audio.musicservicecommand.previous2".equals(action2)) {
                    E(this.t0);
                    v(v0Var);
                } else if ("com.jrtstudio.audio.musicservicecommand.next".equals(action2)) {
                    u(intent);
                } else if ("com.jrtstudio.audio.musicservicecommand.next2".equals(action2)) {
                    E(this.t0);
                    u(intent);
                } else if ("com.jrtstudio.audio.musicservicecommand.pause".equals(action2)) {
                    Q0(l.NotPlaying, "user pause");
                    if (v0Var.g() == t0.Playing) {
                        t1.h("CMD_PAUSE");
                        T0(false);
                    } else {
                        this.a0 = 0;
                        t1.h("CMD_PAUSE Not Playing");
                    }
                    J0();
                } else if ("com.jrtstudio.audio.musicservicecommand.stop".equals(action2)) {
                    Q0(l.NotPlaying, "user stop");
                    t1.h("CMD_STOP");
                    T0(true);
                    J0();
                } else if ("com.jrtstudio.AMP.StartForeground".equals(action2)) {
                    E(this.t0);
                } else {
                    Z();
                }
            } else if (intent.hasExtra("PrivateMethod")) {
                switch (intent.getIntExtra("PrivateMethod", 0)) {
                    case 5:
                        t1.h("Handling Seek");
                        c0((Bookmark) intent.getSerializableExtra("seek"));
                        break;
                    case 7:
                        t1.h("Handling ENQUEUE");
                        int intExtra = intent.getIntExtra("action", 0);
                        if (this.o0.size() > 0) {
                            D(this.o0.remove(0), intExtra);
                            break;
                        }
                        break;
                    case 8:
                        t1.h("PLAYLIST: Handling Open Playlist");
                        int intExtra2 = intent.getIntExtra("shuffle", 0);
                        boolean booleanExtra = intent.getBooleanExtra("play", false);
                        if (this.o0.size() > 0) {
                            V(this.o0.remove(0), intExtra2, booleanExtra);
                            break;
                        }
                        break;
                    case 11:
                        t1.h("Handling Remove Track");
                        a0((t) intent.getSerializableExtra("song"), intent.getIntExtra("pos", 0));
                        break;
                    case 12:
                        t1.h("Handling Set Shuffle Mode");
                        f0(intent.getIntExtra("shuffle", 0));
                        break;
                    case 13:
                        t1.h("Handling Set Repeat Mode");
                        e0(intent.getIntExtra("shuffle", 0));
                        break;
                    case 14:
                        z();
                        break;
                    case 17:
                        F();
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        t1.h("PhoneRinging");
                        G0();
                        break;
                    case 24:
                        t1.h("PhoneOffHook");
                        F0();
                        break;
                    case 25:
                        t1.h("CallStateIdle");
                        E0();
                        break;
                    case 28:
                        t1.h("MoveQUEUEItem");
                        M(intent.getIntExtra("pos", 0), intent.getIntExtra("pos2", 0));
                        break;
                    case 29:
                        x();
                        break;
                    case 30:
                        G();
                        break;
                    case 31:
                        t1.h("Track Set End Time");
                        C();
                        break;
                    case 33:
                        t1.h("ModeChanged");
                        L(intent.getIntExtra("reason", 0));
                        break;
                    case 36:
                        k0();
                        break;
                    case 37:
                        I();
                        break;
                    case 38:
                        t();
                        break;
                    case 39:
                        A();
                        break;
                    case 40:
                        U(intent.getIntExtra("pos", 0));
                        break;
                    case 41:
                        O(intent.getIntExtra("pos", 0));
                        break;
                    case 42:
                        i0();
                        break;
                    case 43:
                        I0(true);
                        break;
                    case 46:
                        j0(w0.ON_TASK_REMOVED);
                        break;
                    case 47:
                        P();
                        break;
                    case SyslogConstants.LOG_LPR /* 48 */:
                        Q();
                        break;
                    case 49:
                        T();
                        break;
                    case 50:
                        S();
                        break;
                    case 51:
                        R();
                        break;
                    case 52:
                        w0();
                        break;
                    case 53:
                        q0();
                        break;
                    case 54:
                        intent.getData().getPath();
                        n0();
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 55 */:
                        t1.h("CSKIP");
                        e.h.g.r0 r0Var2 = this.h0;
                        if (r0Var2 == null || r0Var2.c() >= 5) {
                            i2 = 0;
                        }
                        AudioManager audioManager = (AudioManager) getSystemService("audio");
                        if (i2 != 0 && audioManager.isBluetoothA2dpOn()) {
                            t1.h("ignoring skip command so quickly after the end of a phone call");
                            break;
                        } else {
                            h0(intent.getBooleanExtra("force", false));
                            break;
                        }
                        break;
                }
            }
        } catch (DeadObjectException | InterruptedException unused) {
        } catch (RemoteException e4) {
            if (this.L == w0.NOT_SHUTTING_DOWN) {
                t1.h("handle intent failed with RemoteExpection, unbinding");
                s1.k(e4);
                Thread.sleep(200L);
            }
        } catch (x0 e5) {
            s1.l(e5, false);
            c.i.g.b.m(e5);
            x0.a aVar = e5.f8228b;
            if (aVar == x0.a.FROZEN) {
                y(e5);
            } else if (aVar == x0.a.PERM_FAILURE) {
                m0();
            }
        } catch (Exception e6) {
            s1.k(e6);
        }
        if (this.L != w0.NOT_SHUTTING_DOWN || (fVar = this.c0) == null) {
            return;
        }
        fVar.a();
    }

    public void K0(t tVar, int i2) {
        Intent intent = new Intent();
        intent.putExtra("song", tVar);
        intent.putExtra("pos", i2);
        intent.putExtra("PrivateMethod", 11);
        k(intent);
    }

    public final void L(int i2) throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.h(i2);
        }
    }

    public void L0() {
        e.h.g.j0.f(new j0.b() { // from class: e.h.d.i
            @Override // e.h.g.j0.b
            public final void a() {
                m0 m0Var = m0.this;
                Objects.requireNonNull(m0Var);
                try {
                    m0.i iVar = m0Var.n0;
                    v0 v0Var = m0Var.H;
                    if (iVar == null || v0Var == null) {
                        if (m0Var.L != w0.NOT_SHUTTING_DOWN) {
                            m0Var.H();
                        }
                    } else if (m0.v.size() > 0) {
                        v0Var.p(v0Var.u());
                        int i2 = 0;
                        Message c2 = iVar.c(0, m0.v.g());
                        iVar.a(0);
                        if (m0.this.L == w0.NOT_SHUTTING_DOWN) {
                            i2 = Level.TRACE_INT;
                        }
                        iVar.e(c2, i2);
                    } else if (m0Var.L != w0.NOT_SHUTTING_DOWN) {
                        m0Var.H();
                    }
                } catch (Exception e2) {
                    c.i.g.b.m(e2);
                    t1.h("not saving queue");
                    s1.l(e2, true);
                }
            }
        });
    }

    public final void M(int i2, int i3) throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            if (v.size() > i2 && v.size() > i3) {
                if (v.R()) {
                    v.U(f2, i2, i3);
                } else {
                    Objects.requireNonNull(c.i.g.b.f());
                    v = null;
                    v.U(f2, i2, i3);
                }
                v0Var.h(3);
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void M0(Bookmark bookmark) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending Seek " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        Intent intent = new Intent();
        intent.putExtra("seek", (Serializable) bookmark);
        intent.putExtra("PrivateMethod", 5);
        k(intent);
    }

    public void N() throws Exception, x0 {
        l0();
        Objects.requireNonNull(c.i.g.b.f2069b);
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                t n2 = v.n();
                m0 m0Var = v0.this.f8214d.get();
                if (m0Var != null) {
                    Objects.requireNonNull((j6) c.i.g.b.f());
                    m0Var.C0(v0.this.d(n2, null, -1L), v.SONG_PLAYED, false);
                    v0.this.i(true, 0);
                }
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public final void O(int i2) throws RemoteException, x0 {
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                aVar.n(i2);
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void O0(int i2) {
        Intent intent = new Intent();
        intent.putExtra("shuffle", i2);
        intent.putExtra("PrivateMethod", 13);
        k(intent);
    }

    public final void P() throws Exception {
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (v0Var.f8212b != u0.ChromeCast) {
                Objects.requireNonNull((j6) c.i.g.b.f());
                int i2 = t1.a;
                s1.c("CHROMECAST: onChromeCastConnected");
                if (!v0Var.j() && aVar != null) {
                    long j2 = aVar.w().a;
                }
                if (aVar != null) {
                    aVar.x(true, v.n());
                }
                v.n();
                Objects.requireNonNull(null);
                throw null;
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void P0(int i2) {
        Intent intent = new Intent();
        intent.putExtra("shuffle", i2);
        intent.putExtra("PrivateMethod", 12);
        k(intent);
    }

    public final void Q() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            u0 u0Var = u0.ChromeCast;
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void Q0(l lVar, String str) {
        this.I = lVar;
        t1.h("Player state moved to " + lVar + " because " + str);
    }

    public final void R() throws Exception {
        m0 m0Var;
        v0 v0Var = this.H;
        if (v0Var == null || (m0Var = v0Var.f8214d.get()) == null) {
            return;
        }
        if (m0Var.I != l.PausedByTransientLossOfFocus) {
            m0Var.Q0(l.NotPlaying, "chromecast paused");
        }
        g gVar = m0Var.G;
        if (gVar != null) {
            gVar.c(true, "chromecast paused");
        }
        m0Var.C0(v0Var.d(null, null, -1L), v.PLAYSTATE_CHANGED, true);
    }

    public void R0(Intent intent) {
        t1.l("start foreground with intent");
        intent.setComponent(new ComponentName(this, c.i.g.b.d()));
        this.s0 = intent;
        if (!this.r0) {
            try {
                startService(intent);
                this.s0 = null;
                this.r0 = true;
                t1.l("ensured notification2");
            } catch (Throwable unused) {
            }
        }
        E(this.t0);
    }

    public final void S() throws Exception {
        m0 m0Var;
        v0 v0Var = this.H;
        if (v0Var == null || (m0Var = v0Var.f8214d.get()) == null) {
            return;
        }
        v0Var.r(l.Playing, "OnChromecastPlaying");
        g gVar = m0Var.G;
        if (gVar != null) {
            gVar.d();
        }
        u.b d2 = v0Var.d(null, null, -1L);
        m0Var.C0(d2, v.META_CHANGED, false);
        m0Var.C0(d2, v.PLAYSTATE_CHANGED, true);
    }

    public final void S0() throws x0 {
        int i2 = t1.a;
        s1.c("QUEUE: Update from file!");
        if (v.size() > 0) {
            return;
        }
        Objects.requireNonNull((j6) c.i.g.b.f());
        z v2 = k6.v();
        v0 v0Var = this.H;
        if (v0Var != null) {
            try {
                Objects.requireNonNull(c.i.g.b.f2069b);
                v0Var.q(v2, c.i.g.h.q(), false);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
        Objects.requireNonNull((j6) c.i.g.b.f());
        Intent intent = new Intent("com.jrtstudio.music.queueChanged");
        c.i.g.b.c();
        intent.setPackage("music.musicplayer");
        e.h.g.x0.f8405d.sendBroadcast(intent);
    }

    public final void T() throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            f2.V |= c.i.g.b.f2069b.b() == F;
            f2.C0(v0Var.d(null, null, -1L), v.SONG_PLAYED, false);
            if (f2.V) {
                v0Var.r(l.NotPlaying, "stopped after currentg");
            } else {
                t1.k("Calling move to next because Chromecast went idle");
                v0Var.i(true, 0);
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void T0(boolean z2) {
        Q0(l.NotPlaying, "user pause");
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending pause from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        if (z2) {
            this.a0 = 4;
        } else {
            this.a0 = 1;
        }
        t0();
    }

    public final void U(int i2) throws Exception, x0 {
        m0 f2;
        t1.h("On G Error");
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                aVar.o(i2);
            }
            f2.C0(v0Var.d(null, null, -1L), v.META_CHANGED, true);
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void U0() {
        Q0(l.Playing, "user play");
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending play from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        this.a0 = 2;
        s0();
    }

    public final void V(z zVar, int i2, boolean z2) throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.q(zVar, i2, true);
            if (z2) {
                Q0(l.Playing, "Playlist started by user");
                if (v0Var.f8212b != u0.ChromeCast) {
                    v0Var.l(true, true);
                }
                v0Var.b();
            }
        }
    }

    public void V0() {
        Q0(l.Playing, "user previous");
        N0(e.h.g.d1.k.USER_PREVIOUS);
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending previous from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
    }

    public void W() throws Exception {
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.k();
        }
    }

    public void W0() {
        s0 s0Var = this.l0;
        if (c.i.g.b.f2069b == null || s0Var == null) {
            return;
        }
        Q0(l.NotPlaying, "cancel from notification");
        Objects.requireNonNull(c.i.g.b.f2069b);
        s0.i();
        j0(w0.USER_REQUESTED);
        t1.h("stop and shutdown");
        s0Var.n(true);
    }

    public void X() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.l(true, true);
        }
    }

    public void X0(boolean z2) {
        Q0(l.Playing, "user skip");
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending skip from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        try {
            Intent y0 = y0(this, "com.jrtstudio.audio.musicservicecommand.next");
            y0.putExtra("force", z2);
            startService(y0);
        } catch (RuntimeException e2) {
            s1.l(e2, true);
        }
    }

    public final void Y() throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            v.k(f2);
            int ordinal = v0Var.f8212b.ordinal();
            if (ordinal == 0) {
                v.n();
                throw null;
            }
            if (ordinal == 1) {
                v0Var.o(false);
                v0.a aVar = v0Var.f8213c;
                if (aVar != null) {
                    t n2 = v.n();
                    t D2 = v.D(f2, true);
                    m0 m0Var = v0.this.f8214d.get();
                    if (m0Var != null) {
                        aVar.x(false, n2);
                        aVar.k(n2);
                        aVar.q(true, D2, 0);
                        m0Var.C0(v0.this.d(n2, null, -1L), v.META_CHANGED, true);
                    }
                }
                v0Var.f8217g.a(-2000L);
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void Z() {
    }

    @Override // e.h.g.o1.c
    public IBinder a(Intent intent) {
        Intent intent2 = new Intent();
        intent2.putExtra("PrivateMethod", 56);
        k(intent2);
        IBinder e2 = this.p.e(intent);
        if (e2 != null) {
            t1.a("Bound to media browser");
            this.J = true;
            return e2;
        }
        w0 w0Var = this.L;
        if (w0Var == w0.NOT_SHUTTING_DOWN) {
            t1.h("Music service bind");
            g(w);
            return J();
        }
        try {
            j0(w0Var);
            return null;
        } catch (Throwable th) {
            s1.l(th, true);
            return null;
        }
    }

    public final void a0(t tVar, int i2) throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            if (tVar != null) {
                t1.k("Removing " + tVar.getTitle() + " from " + v.F());
            } else if (i2 > -1) {
                t1.k("Removing song #" + i2 + " from " + v.F());
            }
            int position = v.getPosition();
            if (i2 != -1 && position == i2) {
                v0Var.t(false);
            } else if (tVar != null && tVar.equals(v.n())) {
                v0Var.t(false);
            }
            if (v.m()) {
                Objects.requireNonNull((j6) c.i.g.b.f());
            }
            if (v.H(f2, tVar, i2)) {
                f2.C0(v0Var.d(null, null, -1L), v.QUEUE_CHANGED, false);
                v0Var.h(6);
            }
            v0Var.f8215e.unlock();
        } catch (Throwable th) {
            v0Var.f8215e.unlock();
            throw th;
        }
    }

    @Override // e.h.g.o1.c
    public boolean b(Intent intent) {
        if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
            this.J = false;
            t1.h("JTMusicService service unbind from MusicBrowser");
        } else {
            StringBuilder y2 = e.a.d.a.a.y("JTMusicService service unbind from non-browser action = ");
            y2.append(intent.getAction());
            t1.h(y2.toString());
            j(Integer.valueOf(w));
        }
        L0();
        return true;
    }

    public void b0() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            if (x0() == t0.NotInitialized || x0() == t0.Disconnected) {
                z zVar = v;
                zVar.O(this);
                Objects.requireNonNull(c.i.g.b.f2069b);
                v0Var.q(zVar, c.i.g.h.q(), true);
                if (v0Var.f8212b != u0.ChromeCast) {
                    v0Var.l(true, false);
                }
                v0Var.b();
            }
        }
    }

    @Override // e.h.g.o1.c
    public void c() {
        if (this.l0 != null) {
            try {
                this.l0.r(new u.b(v0(), this.I, w0(), q0(), this.H, this.L, null));
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
        try {
            Objects.requireNonNull((j6) c.i.g.b.f());
        } catch (Exception unused) {
        }
        stopSelf();
    }

    public final void c0(Bookmark bookmark) throws Exception {
        v0.a aVar;
        v0 v0Var = this.H;
        if (v0Var != null) {
            if (v0Var.f() != null) {
                try {
                    int ordinal = v0Var.f8212b.ordinal();
                    if (ordinal == 0) {
                        throw null;
                    }
                    if (ordinal == 1 && (aVar = v0Var.f8213c) != null) {
                        aVar.u(v.n(), bookmark);
                    }
                } finally {
                    v0Var.f8215e.unlock();
                }
            }
            u.b bVar = new u.b(v0(), this.I, w0(), q0(), v0Var, this.L, null);
            bVar.f8207d = true;
            C0(bVar, v.ONLY_REMOTE_CONTROLS, true);
        }
    }

    public void d0() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                t n2 = v.n();
                m0 m0Var = v0.this.f8214d.get();
                if (m0Var != null) {
                    int ordinal = aVar.i().ordinal();
                    if (ordinal == 0) {
                        v0.this.i(false, 0);
                    } else if (ordinal == 1) {
                        aVar.k(n2);
                    } else if (ordinal == 2) {
                        if (m0Var.I == l.Playing) {
                            v0.this.i(false, 0);
                        } else {
                            aVar.k(n2);
                        }
                    }
                }
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public final void e0(int i2) throws Exception, x0 {
        if (this.X != i2) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            c.i.g.h.J(i2);
            v0 v0Var = this.H;
            if (v0Var != null) {
                v0Var.h(4);
                this.X = i2;
            }
            u.b bVar = new u.b(v0(), this.I, w0(), q0(), v0Var, this.L, null);
            bVar.f8207d = true;
            C0(bVar, v.REPEATE_MODE_CHANGED, true);
        }
    }

    @Override // e.h.g.o1.c
    public void f() {
        e.h.g.r0 r0Var = this.w0;
        if (r0Var != null) {
            r0Var.c();
            int i2 = t1.a;
        }
        this.w0 = null;
        super.f();
    }

    public void f0(int i2) throws Exception, x0 {
        if (this.Y != i2) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            c.i.g.h.K(i2);
            v0 v0Var = this.H;
            if (v0Var != null) {
                v0Var.h(2);
                this.Y = i2;
            }
            u.b bVar = new u.b(v0(), this.I, w0(), q0(), v0Var, this.L, null);
            bVar.f8207d = true;
            C0(bVar, v.SHUFFLE_MODE_CHANGED, true);
        }
    }

    public final void g0() {
        boolean booleanValue;
        MediaSessionCompat.Token c2;
        Boolean bool;
        j6 j6Var = (j6) c.i.g.b.f();
        Objects.requireNonNull(j6Var);
        Bitmap decodeResource = BitmapFactory.decodeResource(e.h.g.x0.f8405d.getResources(), R.drawable.albumart_mp_unknown_list);
        j6Var.f5103c = decodeResource;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(e.h.g.x0.f8405d.getResources(), decodeResource);
        j6Var.f5102b = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(false);
        j6Var.f5102b.setDither(false);
        this.c0.a();
        if (this.l0 == null) {
            this.l0 = new s0(this);
        }
        String name = getClass().getName();
        HashMap<String, Boolean> hashMap = e.h.g.x0.f8403b;
        synchronized (hashMap) {
            booleanValue = (!hashMap.containsKey(name) || (bool = hashMap.get(name)) == null) ? false : bool.booleanValue();
        }
        if (booleanValue) {
            E(this.t0);
            String name2 = getClass().getName();
            synchronized (hashMap) {
                hashMap.remove(name2);
            }
        }
        Objects.requireNonNull(c.i.g.b.f2071d);
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.p0 = newScheduledThreadPool;
        double d2 = s;
        Double.isNaN(d2);
        Double.isNaN(d2);
        long j2 = (int) (d2 * 0.3d);
        newScheduledThreadPool.scheduleWithFixedDelay(this.x0, j2, j2, TimeUnit.MILLISECONDS);
        this.c0.a();
        this.W = new u(this.l0);
        this.V = c.i.g.b.f2069b.b() == F;
        if (!e.h.g.v0.f()) {
            this.m0 = new h(this);
        }
        Q0(l.NotPlaying, "service startup");
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (c.i.g.h.j()) {
            t1.h("We were not able to shut down normally. Low memory device?");
            Objects.requireNonNull((j6) c.i.g.b.f());
            s1.c("Service didn't shut down properly");
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (c.i.g.h.i()) {
            t1.h("We shut down while playing music??");
            Objects.requireNonNull(c.i.g.b.f2069b);
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        c.i.g.h.B("ab", true);
        t1.h("JTMusicService starting = " + hashCode());
        Objects.requireNonNull((j6) c.i.g.b.f());
        try {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, m0.class.getSimpleName(), new ComponentName(e.h.g.x0.f8405d, MediaButtonIntentReceiver.class), null);
            this.k0 = mediaSessionCompat;
            c2 = mediaSessionCompat.f21c.c();
        } catch (IllegalArgumentException unused) {
        }
        if (c2 == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        }
        if (this.f8099m != null) {
            throw new IllegalStateException("The session token has already been set.");
        }
        this.f8099m = c2;
        this.p.g(c2);
        this.l0.f8197h = this.k0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_QUEUE", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        this.k0.f21c.setExtras(bundle);
        this.k0.d(new b(), null);
        this.k0.f21c.b(3);
        Objects.requireNonNull(c.i.g.b.f2069b);
        new Thread(new k(this)).start();
        this.q0 = true;
    }

    @Override // e.h.g.o1.c
    public void h(Intent intent) {
        synchronized (t) {
            if (intent != null) {
                try {
                    if (this.L == w0.NOT_SHUTTING_DOWN) {
                        K(intent);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (intent == null) {
                t1.h("Skipping null intent!");
            } else {
                t1.h("Skipping intent, we are shutting down!");
                j0(this.L);
            }
        }
    }

    public void h0(boolean z2) throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.t(z2);
        }
    }

    public final void i0() throws Exception, x0 {
        v0.a aVar;
        q0 q0Var;
        v0 v0Var = this.H;
        if (v0Var == null || x0() != t0.Playing) {
            return;
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (!c.i.g.h.m().d("finish", false)) {
            Q0(l.NotPlaying, "Sleep timer fired");
            v0Var.k();
            return;
        }
        m0 f2 = v0Var.f();
        if (f2 != null) {
            try {
                f2.V = true;
                if (v0Var.f8212b.ordinal() == 1 && (aVar = v0Var.f8213c) != null && (q0Var = aVar.f8222c) != null) {
                    q0Var.b();
                }
            } finally {
                v0Var.f8215e.unlock();
            }
        }
    }

    public void j0(w0 w0Var) {
        if (this.L != w0.NOT_SHUTTING_DOWN) {
            this.L = w0Var;
            s();
        } else if (this.J) {
            t1.h("Not able to stop and shutdown because of media browser connection or the UI is up");
            N0(e.h.g.d1.k.USER_PAUSE);
        } else {
            this.L = w0Var;
            s();
        }
    }

    public final void k0() throws Exception, x0 {
        v0 v0Var = this.H;
        if (v0Var != null) {
            m0 f2 = v0Var.f();
            if (f2 != null) {
                try {
                    t1.k("Validating playlist");
                    v.C(f2);
                    if (v.size() == 0) {
                        t1.k("Remaking now empty playlist");
                        v = new y();
                    }
                } finally {
                    v0Var.f8215e.unlock();
                }
            }
            v0Var.h(5);
        }
    }

    @Override // e.h.g.o1.c
    public void l(String str) {
        if (str != null) {
            if (str.equals("com.jrtstudio.AMP.StartForeground") || str.equals("com.jrtstudio.audio.musicservicecommand.next2") || str.equals("com.jrtstudio.audio.musicservicecommand.previous2") || str.equals("com.jrtstudio.audio.musicservicecommand.togglepause2") || str.equals("com.jrtstudio.audio.musicservicecommand.playB")) {
                E(this.t0);
            }
        }
    }

    public final void l0() {
        if (j1.f()) {
            s1.j(new Exception());
        }
    }

    public final void m0() {
        if (this.L == w0.NOT_SHUTTING_DOWN) {
            int i2 = t1.a;
            s1.c("LPF: Clearing playlist due to error!");
            v = new y();
            Objects.requireNonNull((j6) c.i.g.b.f());
            k6.b();
        }
    }

    public final void n0() throws Exception {
        if (x0() == t0.Playing) {
            Objects.requireNonNull(c.i.g.b.f2069b);
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        t1.h("CLOSE!!!!! SD Card to be unmounted!!!");
        v0 v0Var = this.H;
        if (v0Var != null) {
            v0Var.k();
            v0Var.w(true);
        }
    }

    @Override // e.h.d.e0
    public e0.a o(String str, int i2, Bundle bundle) {
        Bundle bundle2;
        t1.a("PackageName: " + str + " is browsing music");
        if (bundle != null) {
            if (bundle.getBoolean("android.service.media.extra.RECENT")) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("android.service.media.extra.RECENT", true);
                return new e0.a("__RECENT__", bundle3);
            } else if (bundle.getBoolean("android.service.media.extra.OFFLINE")) {
                bundle2 = new Bundle();
                bundle2.putBoolean("android.service.media.extra.OFFLINE", true);
                return new e0.a("__ROOT__", bundle2);
            }
        }
        bundle2 = null;
        return new e0.a("__ROOT__", bundle2);
    }

    public void o0(boolean z2) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending skip from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        Intent intent = new Intent();
        intent.putExtra("force", z2);
        intent.putExtra("PrivateMethod", 55);
        k(intent);
    }

    @Override // e.h.d.e0, e.h.g.o1.c, android.app.Service
    public void onCreate() {
        u = this;
        super.onCreate();
        this.r0 = false;
        k(new Intent());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[Catch: all -> 0x018a, TryCatch #6 {all -> 0x018a, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0012, B:8:0x0016, B:15:0x0024, B:17:0x002a, B:19:0x0039, B:21:0x0042, B:22:0x0045, B:24:0x004d, B:26:0x0051, B:28:0x0059, B:29:0x0074, B:31:0x00a9, B:35:0x00b9, B:36:0x00bd, B:41:0x00ce, B:43:0x00d2, B:44:0x00d7, B:46:0x00db, B:48:0x00e5, B:49:0x00ea, B:50:0x00ec, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:58:0x00fc, B:59:0x00ff, B:61:0x0123, B:67:0x0130, B:68:0x0136, B:69:0x013b, B:73:0x0150, B:75:0x0159, B:76:0x0163, B:78:0x0167, B:72:0x014e, B:34:0x00b3, B:18:0x0035, B:14:0x0020, B:66:0x012c, B:37:0x00be, B:39:0x00c2, B:40:0x00cd), top: B:94:0x0006, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[Catch: all -> 0x018a, TryCatch #6 {all -> 0x018a, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0012, B:8:0x0016, B:15:0x0024, B:17:0x002a, B:19:0x0039, B:21:0x0042, B:22:0x0045, B:24:0x004d, B:26:0x0051, B:28:0x0059, B:29:0x0074, B:31:0x00a9, B:35:0x00b9, B:36:0x00bd, B:41:0x00ce, B:43:0x00d2, B:44:0x00d7, B:46:0x00db, B:48:0x00e5, B:49:0x00ea, B:50:0x00ec, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:58:0x00fc, B:59:0x00ff, B:61:0x0123, B:67:0x0130, B:68:0x0136, B:69:0x013b, B:73:0x0150, B:75:0x0159, B:76:0x0163, B:78:0x0167, B:72:0x014e, B:34:0x00b3, B:18:0x0035, B:14:0x0020, B:66:0x012c, B:37:0x00be, B:39:0x00c2, B:40:0x00cd), top: B:94:0x0006, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: all -> 0x018a, TryCatch #6 {all -> 0x018a, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0012, B:8:0x0016, B:15:0x0024, B:17:0x002a, B:19:0x0039, B:21:0x0042, B:22:0x0045, B:24:0x004d, B:26:0x0051, B:28:0x0059, B:29:0x0074, B:31:0x00a9, B:35:0x00b9, B:36:0x00bd, B:41:0x00ce, B:43:0x00d2, B:44:0x00d7, B:46:0x00db, B:48:0x00e5, B:49:0x00ea, B:50:0x00ec, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:58:0x00fc, B:59:0x00ff, B:61:0x0123, B:67:0x0130, B:68:0x0136, B:69:0x013b, B:73:0x0150, B:75:0x0159, B:76:0x0163, B:78:0x0167, B:72:0x014e, B:34:0x00b3, B:18:0x0035, B:14:0x0020, B:66:0x012c, B:37:0x00be, B:39:0x00c2, B:40:0x00cd), top: B:94:0x0006, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x0129, TRY_ENTER, TryCatch #6 {all -> 0x018a, blocks: (B:3:0x0006, B:5:0x000b, B:7:0x0012, B:8:0x0016, B:15:0x0024, B:17:0x002a, B:19:0x0039, B:21:0x0042, B:22:0x0045, B:24:0x004d, B:26:0x0051, B:28:0x0059, B:29:0x0074, B:31:0x00a9, B:35:0x00b9, B:36:0x00bd, B:41:0x00ce, B:43:0x00d2, B:44:0x00d7, B:46:0x00db, B:48:0x00e5, B:49:0x00ea, B:50:0x00ec, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:58:0x00fc, B:59:0x00ff, B:61:0x0123, B:67:0x0130, B:68:0x0136, B:69:0x013b, B:73:0x0150, B:75:0x0159, B:76:0x0163, B:78:0x0167, B:72:0x014e, B:34:0x00b3, B:18:0x0035, B:14:0x0020, B:66:0x012c, B:37:0x00be, B:39:0x00c2, B:40:0x00cd), top: B:94:0x0006, inners: #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // e.h.g.o1.d, e.h.g.o1.c, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.m0.onDestroy():void");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        e.h.g.j0.g(new n(this, 80));
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (this.J) {
            t1.h("Refusing onTaskRemoved command because media browser is bound to service");
            return;
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        t1.h("Refusing onTaskRemoved command");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        e.h.g.j0.g(new n(this, i2));
    }

    @Override // e.h.d.e0
    public void p(final String str, final e0.h<List<MediaBrowserCompat.MediaItem>> hVar) {
        if (!"__RECENT__".equals(str)) {
            hVar.c(new ArrayList());
            return;
        }
        final ArrayList arrayList = new ArrayList(1);
        hVar.a();
        e.h.g.j0.d(new j0.b() { // from class: e.h.d.k
            @Override // e.h.g.j0.b
            public final void a() {
                m0 m0Var = m0.this;
                String str2 = str;
                List list = arrayList;
                e0.h hVar2 = hVar;
                Objects.requireNonNull(m0Var);
                t1.a("Getting recents info, " + str2);
                try {
                    t v0 = m0Var.v0();
                    if (v0 != null) {
                        list.add(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat("_RECENT_0_", v0.getTitle(), null, v0.e(), null, null, null, null), 2));
                    }
                } finally {
                    hVar2.c(list);
                }
            }
        });
    }

    public final void p0() {
        boolean z2;
        long j2 = 1048576;
        long maxMemory = Runtime.getRuntime().maxMemory() / j2;
        float freeMemory = ((float) ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / j2)) / ((float) maxMemory);
        if (maxMemory < 96) {
            z2 = true;
            t1.h("Honor critical call because of the limited memory on this device");
        } else {
            if (freeMemory > 0.5d) {
                t1.h("Honor critical call because we are using more than 50% of the max heap");
            } else {
                t1.h("Ignore critical memory call, we are only using a little bit");
            }
            z2 = false;
        }
        if (z2) {
            Objects.requireNonNull((j6) c.i.g.b.f());
        }
    }

    public long q0() throws Exception {
        try {
            v0 v0Var = this.H;
            if (v0Var != null) {
                return v0Var.c();
            }
            return 0L;
        } catch (RemoteException e2) {
            s1.l(e2, true);
            return 0L;
        }
    }

    public void r0(z zVar, int i2) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        t1.h("Sending enqueue from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
        Intent intent = new Intent();
        this.o0.add(zVar);
        intent.putExtra("action", i2);
        intent.putExtra("PrivateMethod", 7);
        k(intent);
    }

    public final void s() {
        this.J = false;
        Q0(l.NotPlaying, "stop and shutdown");
        try {
            W();
            v0 v0Var = this.H;
            if (v0Var != null) {
                v0Var.w(true);
            }
        } catch (Exception unused) {
        }
        g gVar = this.G;
        if (gVar != null) {
            m0 m0Var = gVar.f8147d.get();
            if (m0Var != null) {
                t1.h("Keep alive != Playing");
                m0Var.j(0);
                gVar.a();
            } else {
                t1.h("Service reference expired");
            }
        }
        f fVar = this.c0;
        if (fVar != null && fVar.f8144b.get() != null) {
            t1.h("JTMusicService: User is killing us");
            if (fVar.f8144b.get() != null) {
                e.h.g.x0.a.removeCallbacks(fVar.a);
            }
            e.h.g.x0.a.postDelayed(fVar.a, 5000L);
            m0 m0Var2 = fVar.f8144b.get();
            if (m0Var2 != null) {
                m0Var2.j(Integer.valueOf(z));
            }
        }
        H();
        L0();
    }

    public final void s0() {
        Intent intent = new Intent();
        intent.putExtra("PrivateMethod", 17);
        k(intent);
    }

    public final void t() throws Exception, x0 {
        m0 f2;
        v0 v0Var = this.H;
        if (v0Var == null || (f2 = v0Var.f()) == null) {
            return;
        }
        try {
            v0.a aVar = v0Var.f8213c;
            if (aVar != null) {
                boolean z2 = true;
                v0Var.o(true);
                if (f2.V) {
                    v0Var.r(l.NotPlaying, "stopped after currenta");
                }
                aVar.a(f2.V);
                if (c.i.g.b.f2069b.b() != F) {
                    z2 = false;
                }
                f2.V = z2;
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public void t0() {
        Intent intent = new Intent();
        intent.putExtra("PrivateMethod", 30);
        k(intent);
    }

    public final void u(Intent intent) throws x0, Exception {
        t1.h("SKIP");
        if (!A0()) {
            t1.h("Not starting because we are on a phone call");
            return;
        }
        e.h.g.r0 r0Var = this.h0;
        boolean z2 = r0Var != null && r0Var.c() < 5;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (z2 && audioManager.isBluetoothA2dpOn()) {
            t1.h("ignoring skip command so quickly after the end of a phone call");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("force", false);
        Q0(l.Playing, "user next");
        h0(booleanExtra);
    }

    public z u0() {
        return this.H != null ? v : new y();
    }

    public final void v(v0 v0Var) throws x0, Exception {
        t1.h("CMD_PREVIOUS");
        if (!A0()) {
            t1.h("Not starting because we are on a phone call");
            return;
        }
        Q0(l.Playing, "user previous");
        if (v0Var != null) {
            Y();
        }
    }

    public t v0() {
        v0 v0Var = this.H;
        if (v0Var != null) {
            return v0Var.e();
        }
        return null;
    }

    public final void w() {
        t1.h("CMD_TOGGLE_PAUSE");
        if (!A0()) {
            t1.h("Ignore toggle during a phone call");
            return;
        }
        e.h.g.r0 r0Var = this.h0;
        boolean z2 = true;
        boolean z3 = r0Var != null && r0Var.c() < 5;
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (z3 && audioManager.isBluetoothA2dpOn()) {
            t1.h("ignoring pause/play command so quickly after the end of a phone call");
            z2 = false;
        }
        t0 x0 = x0();
        t0 t0Var = t0.Playing;
        if (x0 == t0Var && audioManager.isBluetoothA2dpOn()) {
            t1.h("setting last toggle time");
            this.f0 = new e.h.g.r0();
        }
        if (z2) {
            if (x0() != t0Var) {
                U0();
                return;
            }
            T0(false);
            J0();
        }
    }

    public Bookmark w0() throws Exception {
        try {
            v0 v0Var = this.H;
            if (v0Var != null) {
                return v0Var.u();
            }
        } catch (RemoteException e2) {
            s1.l(e2, true);
        }
        return new Bookmark(0L, "");
    }

    public final void x() throws Exception {
        C0(new u.b(v0(), this.I, w0(), q0(), this.H, this.L, null), v.ALBUM_ART_UPDATED, true);
    }

    public t0 x0() {
        v0 v0Var = this.H;
        return v0Var != null ? v0Var.g() : t0.NotInitialized;
    }

    public final void y(x0 x0Var) {
        String str = x0Var.a;
        s1.n("Closing Rocket Player because Android is hung on: " + str);
        s1.a();
        if (str != null && str.length() > 0) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            e.h.g.n0<String> c2 = c.i.g.h.c();
            c2.put(str, str);
            l.a.a.a aVar = new l.a.a.a();
            for (String str2 : c2.keySet()) {
                aVar.add(str2);
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
            c.i.g.h.E("ak", aVar.b());
        }
        this.L = w0.ANDROID_HUNG;
        H();
        L0();
    }

    public final void z() {
        v0.a aVar;
        v0 v0Var = this.H;
        if (v0Var == null || v0Var.f() == null) {
            return;
        }
        try {
            if (v0Var.f8212b.ordinal() == 1 && (aVar = v0Var.f8213c) != null) {
                aVar.c();
            }
        } finally {
            v0Var.f8215e.unlock();
        }
    }

    public final void z0() throws Exception {
        Objects.requireNonNull((j6) c.i.g.b.f());
        try {
            if (this.H == null) {
                this.H = new v0(this);
            }
            v0 v0Var = this.H;
            Objects.requireNonNull(c.i.g.b.f2069b);
            this.X = c.i.g.h.o();
            Objects.requireNonNull(c.i.g.b.f2069b);
            this.Y = c.i.g.h.q();
            Objects.requireNonNull(c.i.g.b.f2069b);
            if (this.l0 != null) {
                u.b bVar = new u.b(v0(), this.I, w0(), q0(), v0Var, this.L, null);
                bVar.f8207d = true;
                C0(bVar, v.ONLY_REMOTE_CONTROLS, true);
            }
            if (this.v0 == null) {
                this.v0 = new n0(this);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.MEDIA_EJECT");
                intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
                intentFilter.addDataScheme(Action.FILE_ATTRIBUTE);
                registerReceiver(this.v0, intentFilter);
            }
            this.n0 = new i();
            IntentFilter intentFilter2 = new IntentFilter();
            Objects.requireNonNull(c.i.g.b.f2069b);
            intentFilter2.addAction("android.media.AUDIO_BECOMING_NOISY");
            intentFilter2.addAction("PrivateMethod");
            registerReceiver(this.d0, intentFilter2);
            TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
            if (this.m0 == null || e.h.g.v0.f() || telephonyManager == null) {
                return;
            }
            telephonyManager.listen(this.m0, 32);
        } catch (RemoteException e2) {
            s1.l(e2, true);
        }
    }
}

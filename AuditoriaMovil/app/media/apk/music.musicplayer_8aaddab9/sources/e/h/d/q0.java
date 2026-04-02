package e.h.d;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import ch.qos.logback.classic.Level;
import com.jrtstudio.audio.Bookmark;
import com.jrtstudio.audio.DSPPreset;
import e.a.c.j6;
import e.a.c.z6;
import e.h.d.m0;
import e.h.d.q0;
import e.h.g.j1;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.u1;
import e.h.g.v1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class q0 {
    public static final Object a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f8150b;

    /* renamed from: c  reason: collision with root package name */
    public static e.h.g.n0<String> f8151c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f8152d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f8153e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8154f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8155g;

    /* renamed from: h  reason: collision with root package name */
    public static int f8156h;
    public WeakReference<m0> E;
    public r0 v;

    /* renamed from: i  reason: collision with root package name */
    public f f8157i = null;

    /* renamed from: j  reason: collision with root package name */
    public f f8158j = null;

    /* renamed from: k  reason: collision with root package name */
    public int f8159k = 0;

    /* renamed from: l  reason: collision with root package name */
    public s f8160l = null;

    /* renamed from: m  reason: collision with root package name */
    public c f8161m = null;

    /* renamed from: n  reason: collision with root package name */
    public float f8162n = 1.0f;
    public DSPPreset o = null;
    public x p = null;
    public e.h.a.a.a q = e.h.a.a.a.Off;
    public e r = null;
    public float s = 1.0f;
    public String t = "";
    public String u = "";
    public t0 w = t0.NotInitialized;
    public int x = 0;
    public Bookmark y = new Bookmark(0, "");
    public h z = new h();
    public Exception A = null;
    public boolean B = false;
    public b C = null;
    public boolean D = false;
    public MediaPlayer.OnCompletionListener F = new a();
    public boolean G = false;
    public g H = null;
    public i I = new i();

    /* loaded from: classes2.dex */
    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            m0 m0Var = q0.this.E.get();
            if (m0Var != null) {
                v0 v0Var = m0Var.H;
                if (v0Var != null) {
                    u1 u1Var = v0Var.f8220j;
                    Objects.requireNonNull(u1Var);
                    u1Var.a(TimeUnit.SECONDS.toMillis(20L));
                }
                t1.h("aCompleted");
                Intent intent = new Intent();
                intent.putExtra("PrivateMethod", 38);
                m0Var.k(intent);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends v1 {

        /* loaded from: classes2.dex */
        public class a {
            public String a;

            /* renamed from: b  reason: collision with root package name */
            public MediaPlayer f8164b;

            public a(b bVar, a aVar) {
            }
        }

        /* renamed from: e.h.d.q0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0174b {
            public MediaPlayer a;

            /* renamed from: b  reason: collision with root package name */
            public Uri f8165b;

            public C0174b(b bVar, a aVar) {
            }
        }

        public b() {
            super("MP");
        }

        @Override // e.h.g.v1
        public void b(Message message) {
            int i2 = message.what;
            try {
                if (i2 == 0) {
                    try {
                        C0174b c0174b = (C0174b) message.obj;
                        c0174b.a.setDataSource(e.h.g.x0.f8405d, c0174b.f8165b);
                        if (e.h.g.v0.j()) {
                            c0174b.a.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
                        } else {
                            c0174b.a.setAudioStreamType(3);
                        }
                        c0174b.a.prepare();
                    } catch (Exception e2) {
                        q0 q0Var = q0.this;
                        q0Var.A = e2;
                        q0Var.B = true;
                        return;
                    } catch (InternalError unused) {
                    }
                    return;
                }
                try {
                    if (i2 != 1) {
                        return;
                    }
                    try {
                        a aVar = (a) message.obj;
                        aVar.f8164b.setDataSource(aVar.a);
                        if (e.h.g.v0.j()) {
                            aVar.f8164b.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
                        } else {
                            aVar.f8164b.setAudioStreamType(3);
                        }
                        aVar.f8164b.prepare();
                    } catch (Exception e3) {
                        q0 q0Var2 = q0.this;
                        q0Var2.A = e3;
                        q0Var2.B = true;
                    }
                } finally {
                }
            } finally {
            }
        }

        public void h(MediaPlayer mediaPlayer, Uri uri) {
            q0 q0Var = q0.this;
            q0Var.B = false;
            q0Var.A = null;
            q0Var.C.a(1);
            q0.this.C.a(0);
            C0174b c0174b = new C0174b(this, null);
            c0174b.a = mediaPlayer;
            c0174b.f8165b = uri;
            f(q0.this.C.c(0, c0174b));
        }

        public void i(MediaPlayer mediaPlayer, String str) {
            q0 q0Var = q0.this;
            q0Var.B = false;
            q0Var.A = null;
            q0Var.C.a(1);
            q0.this.C.a(0);
            a aVar = new a(this, null);
            aVar.f8164b = mediaPlayer;
            aVar.a = str;
            f(q0.this.C.c(1, aVar));
        }
    }

    @TargetApi(16)
    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: b  reason: collision with root package name */
        public MediaPlayer.OnCompletionListener f8166b;

        /* renamed from: c  reason: collision with root package name */
        public d f8167c;

        /* renamed from: e  reason: collision with root package name */
        public d f8169e;

        /* renamed from: h  reason: collision with root package name */
        public MediaPlayer.OnPreparedListener f8172h;
        public MediaPlayer.OnErrorListener a = new MediaPlayer.OnErrorListener() { // from class: e.h.d.q
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                q0.c cVar = q0.c.this;
                Objects.requireNonNull(cVar);
                if (mediaPlayer != null) {
                    mediaPlayer.setOnErrorListener(null);
                }
                m0 m0Var = q0.this.E.get();
                if (m0Var != null) {
                    v0 v0Var = m0Var.H;
                    if (v0Var != null) {
                        u1 u1Var = v0Var.f8220j;
                        Objects.requireNonNull(u1Var);
                        u1Var.a(TimeUnit.SECONDS.toMillis(20L));
                    }
                    t1.h("onAError()");
                    Intent intent = new Intent();
                    intent.putExtra("pos", i2);
                    intent.putExtra("PrivateMethod", 41);
                    m0Var.k(intent);
                    return false;
                }
                return false;
            }
        };

        /* renamed from: d  reason: collision with root package name */
        public boolean f8168d = false;

        /* renamed from: f  reason: collision with root package name */
        public MediaPlayer.OnCompletionListener f8170f = new a();

        /* renamed from: g  reason: collision with root package name */
        public e.h.g.r0 f8171g = new e.h.g.r0();

        /* loaded from: classes2.dex */
        public class a implements MediaPlayer.OnCompletionListener {
            public a() {
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                s1.c("Song Completed!!");
                if (mediaPlayer != null) {
                    mediaPlayer.setOnCompletionListener(null);
                }
                c cVar = c.this;
                d dVar = cVar.f8169e;
                d dVar2 = cVar.f8167c;
                if (mediaPlayer == dVar2 && dVar != null) {
                    dVar2.release();
                    c cVar2 = c.this;
                    cVar2.f8167c = dVar;
                    cVar2.f8169e = null;
                }
                c.this.f8166b.onCompletion(mediaPlayer);
            }
        }

        public c() {
            d dVar = new d();
            this.f8167c = dVar;
            dVar.setWakeMode(e.h.g.x0.f8405d, 1);
        }

        public boolean a() {
            return this.f8167c.isPlaying();
        }

        public void b() {
            try {
                this.f8167c.reset();
            } catch (IllegalArgumentException | IllegalStateException unused) {
            }
            this.f8167c.setOnCompletionListener(null);
            this.f8167c.setOnErrorListener(null);
            this.f8168d = false;
            this.f8167c.release();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x00e1, Exception -> 0x00e3, IOException -> 0x0101, TryCatch #1 {IOException -> 0x0101, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0012, B:10:0x001c, B:12:0x0024, B:31:0x008c, B:33:0x0099, B:35:0x00ac, B:37:0x00b6, B:39:0x00bf, B:42:0x00c4, B:43:0x00c5, B:44:0x00cf, B:34:0x00a5, B:45:0x00d0, B:28:0x0071), top: B:61:0x0003, outer: #0 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized boolean c(android.media.MediaPlayer r11, java.lang.String r12, android.net.Uri r13) throws e.h.d.x0 {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.d.q0.c.c(android.media.MediaPlayer, java.lang.String, android.net.Uri):boolean");
        }

        public void d(String str, Uri uri) throws x0 {
            try {
                this.f8167c.setNextMediaPlayer(null);
            } catch (Exception unused) {
            }
            if (str == null) {
                return;
            }
            if (str.length() > 0 && (str.equals(q0.this.t) || q0.f8151c.a(str))) {
                s1.b("Skipping bad files " + str);
                return;
            }
            d dVar = this.f8169e;
            if (dVar != null) {
                dVar.release();
                this.f8169e = null;
            }
            d dVar2 = new d();
            this.f8169e = dVar2;
            dVar2.setWakeMode(e.h.g.x0.f8405d, 1);
            this.f8169e.setOnErrorListener(this.a);
            this.f8169e.setOnCompletionListener(this.f8170f);
            this.f8169e.setAudioSessionId(this.f8167c.getAudioSessionId());
            if (!c(this.f8169e, str, uri)) {
                s1.b("Failed to set next media player2");
                this.f8169e.release();
                this.f8169e = null;
                return;
            }
            try {
                try {
                    this.f8167c.setNextMediaPlayer(this.f8169e);
                } catch (Exception unused2) {
                    s1.b("Failed to set next media player");
                    this.f8169e.release();
                    this.f8169e = null;
                }
            } catch (IllegalArgumentException unused3) {
                this.f8167c.setNextMediaPlayer(null);
                s1.b("Failed to set next media player");
                this.f8169e.release();
                this.f8169e = null;
            }
        }
    }

    @TargetApi(16)
    /* loaded from: classes2.dex */
    public static class d extends MediaPlayer implements MediaPlayer.OnCompletionListener {
        public MediaPlayer.OnCompletionListener a;

        /* renamed from: b  reason: collision with root package name */
        public MediaPlayer f8174b;

        public d() {
            if (q0.f8152d) {
                int b2 = c.i.g.b.f2069b.b();
                m0.d dVar = m0.q;
                if (b2 == 0) {
                    return;
                }
            }
            super.setOnCompletionListener(this);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            s1.c("Song Completed2!!");
            if (this.f8174b != null) {
                SystemClock.sleep(50L);
                this.f8174b.start();
            }
            MediaPlayer.OnCompletionListener onCompletionListener = this.a;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(this);
            }
        }

        @Override // android.media.MediaPlayer
        public void setNextMediaPlayer(MediaPlayer mediaPlayer) {
            if (q0.f8152d) {
                int b2 = c.i.g.b.f2069b.b();
                m0.d dVar = m0.q;
                if (b2 == 0) {
                    super.setNextMediaPlayer(mediaPlayer);
                    return;
                }
            }
            this.f8174b = mediaPlayer;
        }

        @Override // android.media.MediaPlayer
        public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
            if (q0.f8152d) {
                int b2 = c.i.g.b.f2069b.b();
                m0.d dVar = m0.q;
                if (b2 == 0) {
                    super.setOnCompletionListener(onCompletionListener);
                    return;
                }
            }
            this.a = onCompletionListener;
        }
    }

    /* loaded from: classes2.dex */
    public class e {
        public double a;

        /* renamed from: b  reason: collision with root package name */
        public short f8175b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f8176c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Double[] f8177d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f8178e = 0;

        /* renamed from: f  reason: collision with root package name */
        public double f8179f = 0.0d;

        public e(a aVar) {
        }

        public void a(DSPPreset dSPPreset) {
            Double[] dArr = dSPPreset.f4875d;
            Double[] dArr2 = this.f8177d;
            int i2 = 0;
            if ((dArr2 != null && dArr2.length == dArr.length && this.f8176c == dSPPreset.f4874c && this.f8178e == dSPPreset.f4878g) ? false : true) {
                synchronized (q0.f8150b) {
                    if (q0.this.v != null) {
                        int i3 = dSPPreset.f4874c;
                        int length = dArr.length;
                        int i4 = dSPPreset.f4878g;
                        this.f8176c = i3;
                        this.f8178e = i4;
                        this.f8179f = dSPPreset.b();
                        this.a = dSPPreset.a;
                        this.f8175b = dSPPreset.f4873b;
                        if (q0.this.p == x.ANDROID_5_BAND) {
                            while (i2 < dArr.length) {
                                i2++;
                            }
                        } else {
                            int length2 = dArr.length;
                            while (i2 < length2) {
                                dArr[i2].doubleValue();
                                i2++;
                            }
                        }
                        this.f8177d = dSPPreset.f4875d;
                    }
                }
                return;
            }
            synchronized (q0.f8150b) {
                if (q0.this.v != null) {
                    if (this.f8179f != dSPPreset.b()) {
                        this.f8179f = dSPPreset.b();
                    }
                    double d2 = this.a;
                    double d3 = dSPPreset.a;
                    if (d2 != d3) {
                        this.a = d3;
                    }
                    short s = this.f8175b;
                    short s2 = dSPPreset.f4873b;
                    if (s != s2) {
                        this.f8175b = s2;
                    }
                    if (q0.this.p != x.ANDROID_5_BAND) {
                        while (true) {
                            Double[] dArr3 = this.f8177d;
                            if (i2 >= dArr3.length) {
                                break;
                            }
                            if (!dArr3[i2].equals(dArr[i2])) {
                                dArr[i2].doubleValue();
                            }
                            i2++;
                        }
                    }
                    this.f8177d = (Double[]) dArr.clone();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f {
        public Boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String f8181b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f8182c = null;

        /* renamed from: d  reason: collision with root package name */
        public t f8183d;

        public f(q0 q0Var, t tVar) {
            this.f8181b = null;
            this.f8183d = null;
            this.f8183d = tVar;
            this.f8181b = tVar.getPath();
        }

        public static int a(f fVar) {
            if (fVar.f8182c == null) {
                if (fVar.d() != null) {
                    Objects.requireNonNull(c.i.g.b.f2069b);
                } else {
                    t1.e("Next file path is NULL?");
                    if (fVar.f8183d != null) {
                        StringBuilder y = e.a.d.a.a.y("Song Title = ");
                        y.append(fVar.f8183d.getTitle());
                        t1.e(y.toString());
                    } else {
                        t1.e("Song is null....");
                    }
                }
                fVar.f8182c = 2;
            }
            return fVar.f8182c.intValue();
        }

        public static boolean b(f fVar) {
            return fVar.e() && fVar.f8183d.A() < 5000;
        }

        public boolean c() {
            if (this.a == null) {
                String d2 = d();
                if (d2 == null || d2.length() <= 0) {
                    this.a = Boolean.FALSE;
                } else {
                    this.a = Boolean.valueOf(new File(d()).exists());
                }
            }
            return this.a.booleanValue();
        }

        public String d() {
            return e() ? this.f8183d.getPath() : this.f8181b;
        }

        public boolean e() {
            return this.f8183d != null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                t tVar2 = this.f8183d;
                return tVar2 != null && tVar2.equals(tVar);
            }
            return super.equals(obj);
        }
    }

    /* loaded from: classes2.dex */
    public abstract class g {
        public g(q0 q0Var) {
        }
    }

    /* loaded from: classes2.dex */
    public class h {
        public h() {
        }
    }

    /* loaded from: classes2.dex */
    public class i {
        public Timer a = new Timer();

        /* renamed from: b  reason: collision with root package name */
        public int f8184b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8185c = false;

        /* loaded from: classes2.dex */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                m0 m0Var = q0.this.E.get();
                if (m0Var != null) {
                    StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
                    t1.h("Stop Track Early from " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
                    Intent intent = new Intent();
                    intent.putExtra("PrivateMethod", 31);
                    m0Var.k(intent);
                }
            }
        }

        public i() {
        }

        public synchronized void a(int i2) {
            c();
            this.f8184b = i2;
            this.f8185c = i2 > 4000;
        }

        public synchronized void b() {
            c();
            if (this.f8185c) {
                int i2 = this.f8184b - ((int) q0.this.m().a);
                if (i2 > 0) {
                    Timer timer = new Timer();
                    this.a = timer;
                    timer.schedule(new a(), i2);
                }
            }
        }

        public synchronized void c() {
            Timer timer = this.a;
            if (timer != null) {
                timer.cancel();
                this.a = null;
            }
        }
    }

    static {
        Build.MANUFACTURER.toLowerCase(Locale.US).equals("samsung");
        a = new Object();
        f8150b = new Object();
        f8151c = null;
        f8153e = true;
        f8154f = true;
        f8155g = true;
        f8156h = 45;
        try {
            MediaPlayer.class.getMethod("setNextMediaPlayer", MediaPlayer.class);
            f8152d = true;
        } catch (NoSuchMethodException unused) {
            f8152d = false;
        }
    }

    public q0(m0 m0Var) {
        this.E = new WeakReference<>(m0Var);
        i();
    }

    public final void a() {
        this.I.c();
        x(false);
        synchronized (a) {
            if (this.f8161m != null) {
                n();
            }
        }
    }

    public void b() throws x0 {
        this.f8158j = null;
        synchronized (f8150b) {
            r0 r0Var = this.v;
        }
        synchronized (a) {
            c cVar = this.f8161m;
            if (cVar != null) {
                cVar.d(null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(e.h.d.q0.f r8) throws e.h.d.x0, java.lang.Exception {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.q0.c(e.h.d.q0$f):void");
    }

    public void d(t tVar) throws Exception {
        if (tVar == null) {
            return;
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        Objects.requireNonNull(c.i.g.b.f2069b);
        int w = tVar.w();
        DSPPreset dSPPreset = this.o;
        if (dSPPreset == null || w != dSPPreset.f4880i) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            DSPPreset dSPPreset2 = this.o;
            if (dSPPreset2 != null) {
                p(dSPPreset2, false);
            } else {
                p(null, false);
            }
        } else {
            p(dSPPreset, false);
        }
        if (this.x == 1) {
            if (tVar.j()) {
                synchronized (f8150b) {
                }
            } else {
                if (tVar.V()) {
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    if (c.i.g.h.q() != 1) {
                        synchronized (f8150b) {
                        }
                    }
                }
                if (c.i.g.b.f2069b.b() == m0.C) {
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    c.i.g.h.h("ap", Level.TRACE_INT);
                    synchronized (f8150b) {
                    }
                }
            }
            if (tVar.J()) {
                Objects.requireNonNull(c.i.g.b.f2069b);
                Float.parseFloat(c.i.g.h.r("al", "1.0"));
                Objects.requireNonNull(c.i.g.b.f2069b);
                c.i.g.h.d("ao", true);
                synchronized (f8150b) {
                }
            } else {
                Objects.requireNonNull(c.i.g.b.f2069b);
                Float.parseFloat(c.i.g.h.r("al", "1.0"));
                Objects.requireNonNull(c.i.g.b.f2069b);
                c.i.g.h.d("ao", true);
                synchronized (f8150b) {
                }
            }
        }
        Bookmark p = tVar.p();
        Bookmark q = tVar.q();
        if (p != null && p.a > 0) {
            o(p);
        }
        long j2 = -1;
        if (q != null) {
            long j3 = q.a;
            if (j3 > 4000) {
                j2 = j3;
            }
        }
        this.I.a((int) j2);
    }

    public final void e() {
        synchronized (a) {
            if (this.f8161m == null) {
                c cVar = new c();
                this.f8161m = cVar;
                this.f8162n = 1.0f;
                cVar.f8172h = null;
                cVar.f8166b = this.F;
                this.w = t0.NotInitialized;
            }
        }
    }

    public void f() throws Exception, x0 {
        f fVar;
        int i2 = this.x;
        if (i2 != 1) {
            if (i2 == 2 && (fVar = this.f8158j) != null) {
                int a2 = f.a(fVar);
                if (a2 == 1) {
                    try {
                        u(false);
                        f fVar2 = this.f8158j;
                        this.f8157i = fVar2;
                        this.f8158j = null;
                        c(fVar2);
                        if (k()) {
                            s();
                            m0 m0Var = this.E.get();
                            if (m0Var != null) {
                                m0Var.B();
                            }
                        } else {
                            m0 m0Var2 = this.E.get();
                            if (m0Var2 != null) {
                                m0Var2.o0(true);
                            }
                        }
                        return;
                    } catch (Exception e2) {
                        s1.l(e2, true);
                        return;
                    }
                } else if (a2 != 2) {
                    return;
                } else {
                    try {
                        u(false);
                        f fVar3 = this.f8158j;
                        this.f8157i = fVar3;
                        this.f8158j = null;
                        c(fVar3);
                        if (k()) {
                            s();
                            m0 m0Var3 = this.E.get();
                            if (m0Var3 != null) {
                                m0Var3.B();
                            }
                        } else {
                            m0 m0Var4 = this.E.get();
                            if (m0Var4 != null) {
                                m0Var4.o0(true);
                            }
                        }
                        return;
                    } catch (Exception e3) {
                        s1.l(e3, true);
                        return;
                    }
                }
            }
            return;
        }
        f fVar4 = this.f8158j;
        if (fVar4 != null) {
            int a3 = f.a(fVar4);
            if (a3 != 1) {
                if (a3 != 2) {
                    return;
                }
                u(false);
                f fVar5 = this.f8158j;
                this.f8157i = fVar5;
                this.f8158j = null;
                c(fVar5);
                if (!k()) {
                    m0 m0Var5 = this.E.get();
                    if (m0Var5 != null) {
                        m0Var5.o0(true);
                        return;
                    }
                    return;
                }
                s();
                m0 m0Var6 = this.E.get();
                if (m0Var6 != null) {
                    m0Var6.B();
                    return;
                }
                return;
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
            if (m0.D == m0.C) {
                return;
            }
            u(false);
            f fVar6 = this.f8158j;
            this.f8157i = fVar6;
            this.f8158j = null;
            c(fVar6);
            if (!k()) {
                m0 m0Var7 = this.E.get();
                if (m0Var7 != null) {
                    m0Var7.o0(true);
                    return;
                }
                return;
            }
            s();
            m0 m0Var8 = this.E.get();
            if (m0Var8 != null) {
                m0Var8.B();
            }
        }
    }

    public long g() {
        int i2 = this.x;
        long j2 = 0;
        if (i2 == 1) {
            synchronized (f8150b) {
            }
        } else if (i2 == 2) {
            synchronized (a) {
                if (this.f8161m != null && k()) {
                    c cVar = this.f8161m;
                    Objects.requireNonNull(cVar);
                    try {
                        if (cVar.f8168d) {
                            j2 = cVar.f8167c.getDuration();
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        }
        return j2;
    }

    public int h() {
        int i2;
        int audioSessionId;
        try {
            i2 = this.x;
        } catch (Throwable unused) {
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return f8156h;
            }
            synchronized (a) {
                audioSessionId = this.f8161m.f8167c.getAudioSessionId();
            }
            return audioSessionId;
        }
        return f8156h;
    }

    public final void i() {
        if (f8156h == 45 && e.h.g.v0.g()) {
            f8156h = ((AudioManager) e.h.g.x0.f8405d.getSystemService("audio")).generateAudioSessionId();
        }
        if (this.v == null) {
            this.v = new r0(this.E.get());
        }
        this.r = new e(null);
        s1.b("initializing player");
        Objects.requireNonNull(c.i.g.b.f2069b);
        e.h.g.n0<String> c2 = c.i.g.h.c();
        f8151c = c2;
        Iterator<String> it = c2.keySet().iterator();
        while (it.hasNext()) {
            s1.c("Refusing to play bad path = " + it.next());
        }
        Objects.requireNonNull(c.i.g.b.f2069b);
        this.C = new b();
        Objects.requireNonNull(c.i.g.b.f2069b);
        Objects.requireNonNull(c.i.g.b.f2069b);
        s1.c("resetting all eqs2!");
        Objects.requireNonNull(c.i.g.b.f2069b);
        Objects.requireNonNull(c.i.g.b.f2069b);
        Objects.requireNonNull(c.i.g.b.f2069b);
        this.p = x.GMAE_10_BAND;
        j();
        Objects.requireNonNull(c.i.g.b.f2069b);
        if (c.i.g.h.n()) {
            Objects.requireNonNull(c.i.g.b.f2069b);
            boolean t = c.i.g.h.t();
            Objects.requireNonNull(c.i.g.b.f2069b);
            boolean u = c.i.g.h.u();
            Objects.requireNonNull(c.i.g.b.f2069b);
            boolean s = c.i.g.h.s();
            String str = !t ? "Support code 1" : (s || u) ? !s ? "Support code 3" : !u ? "Support code 4" : "" : "Support code 2";
            if (str.length() > 0) {
                s1.b(str);
            }
        }
    }

    public final void j() {
        synchronized (f8150b) {
            if (this.v != null && !f8155g) {
                f8153e = false;
                f8154f = false;
                f8155g = false;
            }
        }
        if (this.o == null) {
            p(null, false);
        }
        synchronized (a) {
            if (!f8155g && this.f8161m == null) {
                e();
            }
        }
    }

    public final boolean k() {
        int ordinal = this.w.ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 3;
    }

    public boolean l() {
        f fVar = this.f8157i;
        if (fVar != null) {
            int i2 = (int) m().a;
            int a2 = f.a(fVar);
            return a2 != 1 ? a2 == 2 && i2 < 5000 : i2 < 10000;
        }
        return false;
    }

    public Bookmark m() {
        t0 t0Var;
        if (j1.f()) {
            s1.j(new Exception());
        }
        h hVar = this.z;
        f fVar = q0.this.f8157i;
        long j2 = 0;
        if (fVar != null) {
            String d2 = fVar.d();
            q0 q0Var = q0.this;
            if (!q0Var.G) {
                return q0Var.D ? q0Var.y : new Bookmark(0L, d2);
            }
            int i2 = q0Var.x;
            if (i2 == 1) {
                synchronized (f8150b) {
                    r0 r0Var = q0.this.v;
                }
            } else if (i2 == 2) {
                synchronized (a) {
                    q0 q0Var2 = q0.this;
                    c cVar = q0Var2.f8161m;
                    if (cVar != null && (t0Var = q0Var2.w) != t0.NotInitialized && t0Var != t0.CONFIGURING) {
                        try {
                            if (cVar.f8168d) {
                                j2 = cVar.f8167c.getCurrentPosition();
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
            return new Bookmark(j2, d2);
        }
        return new Bookmark(0L, "");
    }

    public final void n() {
        synchronized (a) {
            this.f8161m.b();
            this.f8161m = null;
            e();
        }
    }

    public long o(Bookmark bookmark) throws Exception {
        h hVar = this.z;
        Objects.requireNonNull(hVar);
        s1.b("seeking to " + bookmark.a);
        String d2 = q0.this.f8157i.d();
        String str = bookmark.f4872b;
        if ((str == null ? d2 == null : str.equals(d2)) || "".equals(bookmark.f4872b)) {
            q0 q0Var = q0.this;
            if (!q0Var.G) {
                q0Var.D = true;
                q0Var.y = bookmark;
            }
            int i2 = q0Var.x;
            if (i2 == 1) {
                synchronized (f8150b) {
                    r0 r0Var = q0.this.v;
                }
            } else if (i2 == 2) {
                synchronized (a) {
                    c cVar = q0.this.f8161m;
                    long j2 = bookmark.a;
                    if (cVar.f8168d) {
                        cVar.f8167c.seekTo((int) j2);
                    }
                }
            }
            q0 q0Var2 = q0.this;
            if (q0Var2.w == t0.Playing) {
                q0Var2.w();
                q0.this.I.c();
                q0.this.I.b();
            } else {
                q0Var2.v(true, "seeking");
            }
            return bookmark.a;
        }
        return bookmark.a;
    }

    public final void p(DSPPreset dSPPreset, boolean z) {
        if (dSPPreset == null) {
            return;
        }
        this.o = dSPPreset;
        Objects.requireNonNull(c.i.g.b.f2069b);
        this.p = x.GMAE_10_BAND;
        Objects.requireNonNull(c.i.g.b.f2069b);
        j();
        Object obj = f8150b;
        synchronized (obj) {
            e eVar = this.r;
            if (this.v != null && eVar != null) {
                eVar.a(dSPPreset);
                synchronized (obj) {
                    r0 r0Var = q0.this.v;
                }
            }
        }
        if (z) {
            x xVar = this.p;
            x xVar2 = x.ANDROID_5_BAND;
            if (!(xVar == xVar2)) {
                s sVar = this.f8160l;
                if (sVar != null) {
                    sVar.a();
                    this.f8160l.e();
                    this.f8160l = null;
                    return;
                }
                return;
            }
            if (this.f8160l == null) {
                this.f8160l = new s(h());
            }
            this.f8160l.c(h(), false);
            s sVar2 = this.f8160l;
            if (sVar2 != null) {
                x xVar3 = this.p;
                int h2 = h();
                Double valueOf = Double.valueOf(0.0d);
                if (h2 != 0) {
                    if (sVar2.f8189c) {
                        sVar2.f8190d = dSPPreset.f4873b > 0;
                    } else {
                        sVar2.f8190d = false;
                    }
                    sVar2.c(h2, false);
                    Double[] dArr = dSPPreset.f4875d;
                    if (xVar3 != xVar2) {
                        dArr = new Double[]{valueOf, valueOf, valueOf, valueOf, valueOf};
                    }
                    if (dArr.length > 5) {
                        int i2 = 0;
                        while (i2 < 5) {
                            try {
                                sVar2.f((short) i2, (short) dArr[i2].doubleValue(), h2, sVar2.f8190d && i2 == 0);
                            } catch (Exception e2) {
                                s1.l(e2, true);
                            }
                            i2++;
                        }
                    }
                }
                double d2 = dSPPreset.f4873b;
                try {
                    sVar2.c(h2, false);
                    if (sVar2.f8188b != null) {
                        double min = Math.min(1000.0d, Math.max(0.0d, d2));
                        boolean strengthSupported = sVar2.f8188b.getStrengthSupported();
                        if (strengthSupported) {
                            sVar2.f8190d = min > 0.0d;
                        } else {
                            sVar2.f8190d = false;
                        }
                        if (strengthSupported) {
                            sVar2.f8188b.setStrength((short) min);
                        }
                    }
                } catch (Exception e3) {
                    s1.l(e3, true);
                    sVar2.e();
                }
                if (!(sVar2.f8191e != null ? sVar2.f8191e.getEnabled() : false)) {
                    s1.b("Changing the equalizer to match our setting");
                    sVar2.b(true);
                } else {
                    s1.b("Ensured equalizer is true");
                }
                if (dSPPreset.f4873b > 0) {
                    if (!(sVar2.f8188b != null ? sVar2.f8188b.getEnabled() : false)) {
                        s1.b("Changing the equalizer to turn on bass");
                        sVar2.b(true);
                        return;
                    }
                }
                s1.b("Ensured equalizer is true");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
        if (((r4 == null || (r4 = r4.p()) == null) ? 0 : r4.a) > 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(e.h.d.t r4, boolean r5) throws e.h.d.x0 {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.q0.q(e.h.d.t, boolean):void");
    }

    public void r(float f2) {
        float max = Math.max(0.0f, Math.min(1.0f, 1.0f - ((float) (Math.log(100.0f - (f2 * 99.0f)) / Math.log(100.0d)))));
        synchronized (a) {
            c cVar = this.f8161m;
            if (cVar != null && this.f8162n != max) {
                if (cVar.f8168d) {
                    cVar.f8167c.setVolume(max, max);
                }
                this.f8162n = max;
            }
        }
        synchronized (f8150b) {
            if (this.v != null && this.s != max) {
                this.s = max;
            }
        }
    }

    public void s() {
        w();
        if (this.G) {
            if (this.f8157i.e()) {
                a0 f2 = c.i.g.b.f();
                t tVar = this.f8157i.f8183d;
                long j2 = m().a;
                Objects.requireNonNull((j6) f2);
            }
        } else if (this.f8157i.e()) {
            a0 f3 = c.i.g.b.f();
            t tVar2 = this.f8157i.f8183d;
            Objects.requireNonNull((j6) f3);
        }
        this.G = true;
        int i2 = this.x;
        if (i2 == 1) {
            synchronized (f8150b) {
            }
        } else if (i2 == 2) {
            synchronized (a) {
                if (!this.f8161m.a()) {
                    c cVar = this.f8161m;
                    if (cVar.f8168d) {
                        cVar.f8167c.start();
                    }
                    if (this.D) {
                        this.D = false;
                    }
                }
            }
        }
        this.D = false;
        this.I.b();
        DSPPreset dSPPreset = this.o;
        if (dSPPreset != null) {
            if (this.p == x.ANDROID_5_BAND) {
                p(dSPPreset, true);
            }
        }
    }

    public final void t(f fVar) throws Exception, x0 {
        m0 m0Var = this.E.get();
        if (m0Var == null) {
            return;
        }
        synchronized (a) {
            e();
            if (this.f8161m != null) {
                t1.e("Saying we are playing... why are we here?");
                w();
                this.f8157i = fVar;
                this.f8158j = null;
                if (f8152d && this.f8161m.a()) {
                    int b2 = c.i.g.b.f2069b.b();
                    m0.d dVar = m0.q;
                    if (b2 == 0) {
                        m0Var.N();
                    }
                }
                t tVar = this.f8157i.f8183d;
                c(new f(this, tVar));
                if (this.w == t0.NotInitialized) {
                    boolean z = tVar != null;
                    if (z) {
                        z = this.f8157i.c();
                    }
                    if (z) {
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        f fVar2 = this.f8157i;
                        if (fVar2 == null || !f8151c.a(fVar2.d())) {
                            s1.c("Told user we couldn't play song with Android1");
                            Objects.requireNonNull((j6) c.i.g.b.f());
                            z6.Z(z6.E(R.string.playback_failed_free), 1);
                        } else {
                            s1.c("Told user we couldn't play bad song with Android1");
                            Objects.requireNonNull((j6) c.i.g.b.f());
                            z6.Z(z6.E(R.string.playback_refused), 1);
                        }
                    } else {
                        s1.c("Refusing to play songs that doesn't exist");
                        Objects.requireNonNull((j6) c.i.g.b.f());
                        z6.Z(z6.E(R.string.playback_missing), 1);
                    }
                    m0Var.d0();
                } else {
                    try {
                        s();
                    } catch (Exception e2) {
                        s1.l(e2, true);
                    }
                    m0Var.N();
                }
            } else {
                t1.e("Android player is null");
            }
        }
    }

    public void u(boolean z) {
        this.I.c();
        v(z, "Stopped");
        this.w = t0.NotInitialized;
        synchronized (a) {
            c cVar = this.f8161m;
            if (cVar != null) {
                try {
                    cVar.f8167c.reset();
                } catch (IllegalArgumentException | IllegalStateException unused) {
                }
                cVar.f8167c.setOnCompletionListener(null);
                cVar.f8167c.setOnErrorListener(null);
                cVar.f8168d = false;
            }
        }
        synchronized (f8150b) {
        }
        s sVar = this.f8160l;
        if (sVar != null) {
            sVar.a();
            this.f8160l.e();
            this.f8160l = null;
        }
    }

    public final void v(boolean z, String str) {
        this.w = t0.NotPlaying;
        g gVar = this.H;
        if (gVar != null) {
            o0 o0Var = (o0) gVar;
            Objects.requireNonNull(o0Var);
            try {
                o0Var.a.c(z, str);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
    }

    public final void w() {
        this.w = t0.Playing;
        g gVar = this.H;
        if (gVar != null) {
            o0 o0Var = (o0) gVar;
            Objects.requireNonNull(o0Var);
            try {
                o0Var.a.d();
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
    }

    public final void x(boolean z) {
        v(z, "Stopped");
        this.w = t0.NotInitialized;
    }
}

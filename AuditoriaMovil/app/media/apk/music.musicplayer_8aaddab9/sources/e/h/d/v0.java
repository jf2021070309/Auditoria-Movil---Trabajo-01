package e.h.d;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import com.jrtstudio.audio.Bookmark;
import com.jrtstudio.audio.DSPPreset;
import e.a.c.j6;
import e.a.c.k6;
import e.a.c.n6;
import e.a.c.z6;
import e.h.d.m0;
import e.h.d.q0;
import e.h.d.u;
import e.h.d.x0;
import e.h.g.j1;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.u1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class v0 {
    public static boolean a;

    /* renamed from: c  reason: collision with root package name */
    public a f8213c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<m0> f8214d;

    /* renamed from: f  reason: collision with root package name */
    public Intent f8216f;

    /* renamed from: g  reason: collision with root package name */
    public e.h.g.r0 f8217g;

    /* renamed from: h  reason: collision with root package name */
    public int f8218h;

    /* renamed from: i  reason: collision with root package name */
    public b f8219i;

    /* renamed from: j  reason: collision with root package name */
    public final u1 f8220j;

    /* renamed from: b  reason: collision with root package name */
    public u0 f8212b = u0.Local;

    /* renamed from: e  reason: collision with root package name */
    public final ReentrantLock f8215e = new ReentrantLock(true);

    /* loaded from: classes2.dex */
    public class a {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8221b;

        /* renamed from: c  reason: collision with root package name */
        public q0 f8222c;

        public a() {
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                q0 q0Var = new q0(m0Var);
                this.f8222c = q0Var;
                m0.g gVar = m0Var.G;
                if (gVar != null) {
                    q0Var.H = new o0(gVar, q0Var);
                }
            }
        }

        public void a(boolean z) throws Exception, x0 {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                if (z) {
                    this.f8221b = true;
                }
                s1.b("onAndroidCompletion()");
                q0Var.I.c();
                int ordinal = q0Var.w.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    s1.b("Got a completion when not initialized");
                    q0Var.x(true);
                    m0 m0Var = q0Var.E.get();
                    if (m0Var != null) {
                        m0Var.d0();
                        return;
                    }
                    return;
                }
                q0.f fVar = q0Var.f8158j;
                if (fVar != null && !z) {
                    q0Var.t(fVar);
                    return;
                }
                q0Var.v(true, "stop after current, nothing queued");
                m0 m0Var2 = q0Var.E.get();
                if (m0Var2 != null) {
                    m0Var2.l0();
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    v0 v0Var = m0Var2.H;
                    if (v0Var == null || v0Var.f() == null) {
                        return;
                    }
                    try {
                        a aVar = v0Var.f8213c;
                        if (aVar != null) {
                            aVar.b(z, m0.v.n());
                        }
                    } finally {
                        v0Var.f8215e.unlock();
                    }
                }
            }
        }

        public void b(boolean z, t tVar) throws Exception, x0 {
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                Objects.requireNonNull((j6) c.i.g.b.f());
                m0Var.C0(v0.this.d(tVar, null, -1L), v.SONG_PLAYED, false);
                if (z) {
                    v0.a(v0.this, m0.l.NotPlaying, "Stop after each song");
                    m0Var.C0(v0.this.d(tVar, null, -1L), v.PLAYSTATE_CHANGED, false);
                    return;
                }
                Objects.requireNonNull(c.i.g.b.f2069b);
                if (c.i.g.h.o() != 1) {
                    v0.this.i(false, 0);
                    return;
                }
                u(tVar, new Bookmark(0L, tVar.getPath()));
                v0.this.l(true, false);
            }
        }

        public void c() {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var == null || q0Var == null) {
                return;
            }
            try {
                q0Var.u(true);
                v0.a(v0.this, m0.l.NotPlaying, "Cleared queue");
                u.b d2 = v0.this.d(null, null, -1L);
                m0.v = new y();
                m0Var.C0(d2, v.QUEUE_CHANGED, false);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }

        public void d(boolean z) throws Exception, x0 {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                q0Var.I.c();
                q0Var.f8159k = 0;
                q0Var.w();
                if (q0Var.f8158j == null) {
                    s1.b("What the ... we crossfaded with no information");
                }
                q0.f fVar = q0Var.f8158j;
                q0Var.f8157i = fVar;
                q0Var.f8158j = null;
                q0Var.d(fVar.f8183d);
                q0Var.I.b();
                m0 m0Var = q0Var.E.get();
                if (m0Var != null) {
                    m0Var.B();
                }
            }
        }

        public long e() {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                int ordinal = i().ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    return q0Var.g();
                }
                return -1L;
            }
            return -1L;
        }

        public void f() throws Exception, x0 {
            q0 q0Var = this.f8222c;
            if (v0.this.f8214d.get() == null || q0Var == null) {
                return;
            }
            int ordinal = i().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    t1.k("Track already ended, ignoring odd call");
                } else if (ordinal != 2) {
                } else {
                    t1.k("Track not initialized, ignoring odd call");
                }
            } else if (q0Var.f8158j == null) {
                v0.this.i(true, 0);
            } else {
                try {
                    q0Var.f();
                } catch (Exception e2) {
                    c.i.g.b.m(e2);
                    s1.l(e2, true);
                }
            }
        }

        public void g(t tVar, t tVar2, int i2) throws Exception, x0 {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                this.a = false;
                int ordinal = i().ordinal();
                if (ordinal == 0) {
                    if (q0Var.f8158j == null) {
                        v0.this.v();
                        m0Var.C0(v0.this.d(tVar, null, -1L), v.META_CHANGED, false);
                        Objects.requireNonNull((j6) c.i.g.b.f());
                        l(tVar2);
                        return;
                    }
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    if (m0.D == m0.C) {
                        q0Var.f();
                        return;
                    }
                    k(tVar);
                    q(true, tVar2, i2);
                    u.b d2 = v0.this.d(tVar, null, -1L);
                    m0Var.C0(d2, v.META_CHANGED, true);
                    m0Var.C0(d2, v.PLAYSTATE_CHANGED, true);
                } else if (ordinal == 1) {
                    t1.k("Not playing and playlist not finished?? That isn't right. Previous song must have been unplayable.");
                    k(tVar);
                    q(true, tVar2, i2);
                    u.b d3 = v0.this.d(tVar, null, -1L);
                    m0Var.C0(d3, v.META_CHANGED, true);
                    m0Var.C0(d3, v.PLAYSTATE_CHANGED, true);
                } else if (ordinal != 2) {
                } else {
                    t1.k("The player is not initialized and we want to move to the next one.");
                    k(tVar);
                    if (v0.this.f8218h < 10) {
                        q(true, tVar2, i2);
                        u.b d4 = v0.this.d(tVar, null, -1L);
                        m0Var.C0(d4, v.META_CHANGED, true);
                        m0Var.C0(d4, v.PLAYSTATE_CHANGED, true);
                    }
                }
            }
        }

        public void h(boolean z) throws Exception, x0 {
            q0.f fVar;
            int b2;
            q0.f fVar2;
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                t1.e("G Completed, move to next");
                boolean z2 = true;
                int i2 = q0Var.f8159k + 1;
                q0Var.f8159k = i2;
                if (i2 > 2) {
                    t1.e("Too many g completed");
                    return;
                }
                q0Var.I.c();
                boolean z3 = false;
                if (q0Var.f8159k > 1) {
                    t1.e("Multiple playbacks completed");
                    q0Var.f8159k = 0;
                    m0 m0Var = q0Var.E.get();
                    if (m0Var != null) {
                        t1.e("Multiple playbacks completed - skip");
                        m0Var.h0(true);
                        return;
                    }
                    return;
                }
                t1.e("Ready to move forward");
                q0Var.f8159k = 0;
                q0.f fVar3 = q0Var.f8158j;
                if (fVar3 == null || z) {
                    t1.e("Next play = null");
                    q0Var.v(true, "stop after current or nothing queued");
                    if (z) {
                        t1.e("Song ended without another being configured to play");
                    }
                    m0 m0Var2 = q0Var.E.get();
                    if (m0Var2 != null) {
                        t1.e("call GMAE Tracks ended");
                        m0Var2.l0();
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        v0 v0Var = m0Var2.H;
                        if (v0Var == null || v0Var.f() == null) {
                            return;
                        }
                        try {
                            a aVar = v0Var.f8213c;
                            if (aVar != null) {
                                aVar.j(z, m0.v.n());
                            }
                            return;
                        } finally {
                            v0Var.f8215e.unlock();
                        }
                    }
                    return;
                }
                int a = q0.f.a(fVar3);
                if (a != 1) {
                    if (a != 2) {
                        return;
                    }
                    t1.e("Engine android, next play");
                    q0Var.t(fVar3);
                    return;
                }
                if (q0.f.b(fVar3) || ((fVar2 = q0Var.f8157i) != null && q0.f.b(fVar2))) {
                    z3 = true;
                }
                if (!z3 && (b2 = c.i.g.b.f2069b.b()) != m0.C) {
                    m0.d dVar = m0.q;
                    if (b2 != 0) {
                        z3 = true;
                    }
                }
                if (z3 || (fVar3.c() && ((fVar = q0Var.f8157i) == null || fVar.c()))) {
                    z2 = z3;
                }
                t1.e("non seamless transistion? = " + z2);
                if (!z2) {
                    t1.e("Seamless transistion. Play normally");
                    q0Var.w();
                    q0Var.f8157i = fVar3;
                    q0Var.f8158j = null;
                    q0Var.d(fVar3.f8183d);
                    q0Var.I.b();
                    m0 m0Var3 = q0Var.E.get();
                    if (m0Var3 != null) {
                        m0Var3.N();
                        return;
                    }
                    return;
                }
                t1.e("Next song was too short, start manually");
                if (c.i.g.b.f2069b.b() == m0.E) {
                    j1.n(1000, new e.h.g.r0());
                }
                q0Var.c(fVar3);
                q0Var.f8157i = fVar3;
                q0Var.f8158j = null;
                q0Var.I.b();
                q0Var.s();
                q0Var.w();
                m0 m0Var4 = q0Var.E.get();
                if (m0Var4 != null) {
                    m0Var4.N();
                }
            }
        }

        public t0 i() {
            q0 q0Var = this.f8222c;
            return q0Var != null ? q0Var.w : t0.NotInitialized;
        }

        public void j(boolean z, t tVar) throws Exception, x0 {
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                Objects.requireNonNull((j6) c.i.g.b.f());
                m0Var.C0(v0.this.d(tVar, null, -1L), v.SONG_PLAYED, false);
                if (!z) {
                    v0.this.i(true, 0);
                    return;
                }
                v0.a(v0.this, m0.l.NotPlaying, "Stop after each song2");
                m0Var.C0(v0.this.d(tVar, null, -1L), v.PLAYSTATE_CHANGED, false);
                this.f8221b = true;
            }
        }

        public final void k(t tVar) throws Exception, x0 {
            m0 f2;
            q0 q0Var = this.f8222c;
            if (v0.this.f8214d.get() == null || q0Var == null) {
                return;
            }
            this.a = false;
            t1.k("loading current");
            if (tVar != null) {
                if (q0Var.w == t0.Playing) {
                    v0.this.w(false);
                }
                String path = tVar.getPath();
                if (path == null) {
                    t1.k("Trying to play null file");
                    return;
                }
                m0 m0Var = v0.this.f8214d.get();
                q0 q0Var2 = this.f8222c;
                if (m0Var == null || q0Var2 == null) {
                    return;
                }
                if (path.startsWith("content://media/")) {
                    Cursor cursor = null;
                    try {
                        cursor = e.h.g.x0.f8405d.getContentResolver().query(Uri.parse(path), new String[]{"_data"}, null, null, null);
                    } catch (Exception unused) {
                    }
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                do {
                                    cursor.getString(0);
                                } while (cursor.moveToNext());
                            }
                        } finally {
                            cursor.close();
                        }
                    }
                }
                m0Var.C0(v0.this.d(tVar, m0Var.w0(), e()), v.META_CHANGED, false);
                q0Var2.c(new q0.f(q0Var2, tVar));
                int ordinal = i().ordinal();
                if (ordinal == 0) {
                    v0.this.f8218h = 0;
                } else if (ordinal == 1) {
                    v0.this.f8218h = 0;
                } else if (ordinal != 2) {
                } else {
                    if (!new File(tVar.getPath()).exists()) {
                        Objects.requireNonNull(c.i.g.b.f());
                        v0.this.f8218h = 100;
                        t1.k("No storage options, stop playing");
                    }
                    v0 v0Var = v0.this;
                    if (v0Var.f8218h == 100 || (f2 = v0Var.f()) == null) {
                        return;
                    }
                    try {
                        v0Var.w(true);
                        int i2 = v0Var.f8218h;
                        v0Var.f8218h = i2 + 1;
                        if (i2 >= 10 || m0.v.size() <= 1) {
                            v0Var.f8218h = 0;
                            if (!f2.U) {
                                m0.v.n();
                                Objects.requireNonNull((j6) c.i.g.b.f());
                                s1.c("Told user we couldn't play song");
                                z6.Z(z6.E(R.string.playback_failed), 1);
                            }
                            throw new x0("Permanant play failure", x0.a.PERM_FAILURE);
                        }
                        t n2 = m0.v.n();
                        boolean z = n2 != null;
                        if (z) {
                            String path2 = n2.getPath();
                            if (path2 != null && path2.length() != 0) {
                                z = new File(path2).exists();
                            }
                            z = false;
                        }
                        if (z) {
                            Objects.requireNonNull((j6) c.i.g.b.f());
                            s1.c("Told user we couldn't play song");
                            z6.Z(z6.E(R.string.playback_failed), 1);
                        } else {
                            Objects.requireNonNull((j6) c.i.g.b.f());
                            s1.c("Refusing to play song that doesn't exist");
                            z6.Z(z6.E(R.string.playback_failed), 1);
                        }
                        v0Var.i(false, 0);
                    } finally {
                        v0Var.f8215e.unlock();
                    }
                }
            }
        }

        public final void l(t tVar) throws x0 {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var == null || q0Var == null) {
                return;
            }
            if (tVar == null) {
                q0Var.b();
                return;
            }
            try {
                q0Var.q(tVar, m0Var.V);
            } catch (Exception e2) {
                c.i.g.b.m(e2);
                s1.l(e2, true);
                q0Var.b();
            }
        }

        public void m() throws RemoteException {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                Objects.requireNonNull(c.i.g.b.f2069b);
                Objects.requireNonNull(c.i.g.b.f2069b);
                DSPPreset dSPPreset = q0Var.o;
                if (dSPPreset != null) {
                    int i2 = dSPPreset.f4877f;
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    if (i2 != 10) {
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        q0Var.o = null;
                    }
                    q0.f fVar = q0Var.f8157i;
                    if (fVar != null && fVar.e()) {
                        int w = q0Var.f8157i.f8183d.w();
                        DSPPreset dSPPreset2 = q0Var.o;
                        if (dSPPreset2 == null || w != dSPPreset2.f4880i) {
                            Objects.requireNonNull(c.i.g.b.f2069b);
                            DSPPreset dSPPreset3 = q0Var.o;
                            if (dSPPreset3 != null) {
                                q0Var.p(dSPPreset3, true);
                            } else {
                                q0Var.p(null, true);
                            }
                        }
                    }
                }
                e.h.a.a.a aVar = q0Var.q;
                Objects.requireNonNull(c.i.g.b.f2069b);
                e.h.a.a.a aVar2 = e.h.a.a.a.Off;
                if (aVar != aVar2) {
                    Objects.requireNonNull(c.i.g.b.f2069b);
                    q0Var.q = aVar2;
                    synchronized (q0.f8150b) {
                        if (q0Var.v != null) {
                            aVar2.ordinal();
                        }
                    }
                }
                synchronized (q0.f8150b) {
                    if (q0Var.v != null) {
                        q0.f fVar2 = q0Var.f8157i;
                        if (fVar2 != null && fVar2.e() && q0Var.f8157i.f8183d.J()) {
                            Objects.requireNonNull(c.i.g.b.f2069b);
                            Float.parseFloat(c.i.g.h.r("al", "1.0"));
                            Objects.requireNonNull(c.i.g.b.f2069b);
                            c.i.g.h.d("ao", true);
                        } else {
                            Objects.requireNonNull(c.i.g.b.f2069b);
                            Float.parseFloat(c.i.g.h.r("al", "1.0"));
                            Objects.requireNonNull(c.i.g.b.f2069b);
                            c.i.g.h.d("ao", true);
                        }
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        c.i.g.h.f();
                    }
                }
            }
        }

        public void n(int i2) throws RemoteException, x0 {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                s1.b("Android MultiPlayer Error: " + i2);
                q0Var.I.c();
                if (i2 == 1) {
                    q0Var.a();
                } else if (i2 != 100) {
                    s1.b("Unknown Media Error " + i2);
                    q0Var.a();
                } else {
                    q0Var.a();
                    try {
                        m0 m0Var = q0Var.E.get();
                        if (m0Var != null) {
                            m0Var.d0();
                        }
                    } catch (Exception e2) {
                        s1.l(e2, true);
                    }
                }
            }
        }

        public void o(int i2) throws Exception, x0 {
            m0 m0Var;
            q0 q0Var = this.f8222c;
            if (q0Var == null || (m0Var = q0Var.E.get()) == null) {
                return;
            }
            s1.b("Enhanced MultiPlayer Error: " + i2);
            q0Var.f8159k = 0;
            if (i2 == -187) {
                synchronized (q0.a) {
                    if (q0Var.f8161m != null) {
                        q0Var.n();
                    }
                }
                q0Var.w = t0.NotInitialized;
                m0Var.d0();
                return;
            }
            if (i2 == 1) {
                q0Var.I.c();
                q0Var.x(false);
            } else if (i2 == 100 || i2 == 3 || i2 == 4 || i2 == 5) {
                q0Var.I.c();
                int ordinal = q0Var.w.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    q0Var.x(false);
                    return;
                }
                q0Var.x(true);
                synchronized (q0.a) {
                    if (q0Var.f8161m != null) {
                        q0Var.n();
                    }
                }
                m0Var.d0();
                return;
            } else if (i2 == 6 || i2 == 7 || i2 == 10) {
                q0Var.I.c();
                int ordinal2 = q0Var.w.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        q0Var.x(false);
                        return;
                    }
                    return;
                }
                q0Var.x(true);
                q0Var.f8157i.f8182c = 2;
                q0Var.c(q0Var.f8157i);
                if (q0Var.w == t0.NotInitialized) {
                    m0Var.o0(true);
                    return;
                }
                try {
                    q0Var.s();
                    return;
                } catch (Exception unused) {
                    m0Var.o0(true);
                    return;
                }
            } else if (i2 == 11) {
                s1.c("App has been modified");
                Objects.requireNonNull(c.i.g.b.f2069b);
                return;
            }
            s1.c("Unknown Media Error " + i2);
            q0Var.I.c();
            q0Var.x(false);
        }

        public void p(t tVar) throws RemoteException {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                q0Var.v(true, "pausing");
                q0Var.I.c();
                int i2 = q0Var.x;
                if (i2 == 1) {
                    synchronized (q0.f8150b) {
                    }
                } else if (i2 == 2) {
                    synchronized (q0.a) {
                        if (q0Var.f8161m.a()) {
                            q0.c cVar = q0Var.f8161m;
                            if (cVar.f8168d) {
                                cVar.f8167c.pause();
                            }
                        }
                    }
                }
                Objects.requireNonNull((j6) c.i.g.b.f());
            }
        }

        public void q(boolean z, t tVar, int i2) throws Exception, x0 {
            v0 v0Var;
            m0 f2;
            int i3;
            q0 q0Var;
            boolean z2 = false;
            this.f8221b = false;
            q0 q0Var2 = this.f8222c;
            if (v0.this.f8214d.get() != null) {
                t1.k("pp - play");
                if (z && (q0Var = this.f8222c) != null) {
                    q0Var.r(1.0f);
                }
                int ordinal = i().ordinal();
                if (ordinal == 0) {
                    t1.k("Play called while already playing. Odd call ignored");
                } else if (ordinal == 1) {
                    long e2 = e();
                    if (e2 != -1 && i2 < 10 && e2 > 2000 && q0Var2.m().a >= e2 - 2000) {
                        Objects.requireNonNull(c.i.g.b.f2069b);
                        if (c.i.g.h.o() == 1) {
                            q0Var2.o(new Bookmark(0L, null));
                        }
                        v0.this.i(true, i2);
                        z2 = true;
                    }
                    if (z2) {
                        return;
                    }
                    l(tVar);
                    try {
                        q0Var2.s();
                    } catch (Exception e3) {
                        s1.l(e3, true);
                        c.i.g.b.m(e3);
                    }
                    v0.this.v();
                } else if (ordinal == 2 && (f2 = (v0Var = v0.this).f()) != null) {
                    try {
                        if (m0.v.size() <= 0) {
                            t1.k("Play started with nothing to play");
                            f2.W();
                        } else {
                            t D = m0.v.D(f2, false);
                            m0.v.L(f2, false);
                            if (D != null) {
                                v0Var.n(false, true);
                                u.b d2 = v0Var.d(D, null, -1L);
                                f2.C0(d2, v.META_CHANGED, false);
                                f2.C0(d2, v.PLAYSTATE_CHANGED, false);
                            } else if (m0.v.L(f2, false) && (i3 = v0Var.f8218h) == 0) {
                                v0Var.f8218h = i3 + 1;
                                f2.b0();
                            } else {
                                v0Var.r(m0.l.NotPlaying, "confused");
                                t1.k("Bad Call! Play when not initialized and not at end of playlist?");
                                c.i.g.b.m(new Exception());
                            }
                        }
                    } finally {
                        v0Var.f8215e.unlock();
                    }
                }
            }
        }

        public void r() throws RemoteException {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                q0Var.v(true, "destroying");
                s sVar = q0Var.f8160l;
                if (sVar != null) {
                    sVar.a();
                    q0Var.f8160l.e();
                    q0Var.f8160l = null;
                }
                synchronized (q0.f8150b) {
                    if (q0Var.v != null) {
                        try {
                            q0Var.r = null;
                        } catch (Exception unused) {
                        }
                    }
                }
                synchronized (q0.a) {
                    q0.c cVar = q0Var.f8161m;
                    if (cVar != null) {
                        cVar.b();
                        q0Var.f8161m = null;
                    }
                }
                q0Var.C.d();
                q0Var.C = null;
            }
            this.f8222c = null;
        }

        public void s(Bookmark bookmark, t tVar) throws Exception, x0 {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var == null || q0Var == null) {
                return;
            }
            v0.this.f8218h = 20;
            m0Var.U = true;
            this.a = false;
            q0Var.u(true);
            q0Var.i();
            t1.k("reloading current");
            k(tVar);
            m0Var.U = false;
            if (i() == t0.NotInitialized) {
                return;
            }
            long j2 = bookmark.a;
            t1.k("tt -Song position = " + j2);
            if (j2 < 0 || j2 >= e()) {
                j2 = 0;
            }
            bookmark.a = j2;
            u(tVar, bookmark);
            t1.k("restored queue, currently at position " + m0Var.w0().a + "/" + e() + " (requested " + bookmark.a + ")");
        }

        public final void t(t tVar, boolean z) throws Exception {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                w();
                if (q0Var == null || tVar == null) {
                    return;
                }
                try {
                    Boolean valueOf = Boolean.valueOf(tVar.l());
                    if (valueOf == null || !valueOf.booleanValue()) {
                        return;
                    }
                    Bookmark w0 = m0Var.w0();
                    Bookmark Z = tVar.Z();
                    t1.k("New Bookmark for " + w0.f4872b + " time = " + w0.a + "ms");
                    t1.k("Old Bookmark for " + Z.f4872b + " time = " + Z.a + "ms");
                    boolean z2 = false;
                    String str = Z.f4872b;
                    String str2 = w0.f4872b;
                    if (str2 != null) {
                        z2 = str2.equals(str);
                    } else if (str == null) {
                        z2 = true;
                    }
                    if (z2) {
                        long j2 = Z.a;
                        long e2 = e();
                        if (z) {
                            e2 = 0;
                        }
                        long j3 = w0.a;
                        t1.k("SongDuration = " + e2);
                        if (j3 >= e2 - 30000) {
                            t1.k("We've reached the end, save 0ms bookmark");
                            w0.a = 0L;
                        } else if (j3 <= j2 && j3 + 15000 >= j2) {
                            t1.k("2Not saving bookmark because " + j3 + " & " + j2 + " are similar ");
                            return;
                        } else if (j3 >= j2 && j3 - 15000 <= j2) {
                            t1.k("2Not saving bookmark because " + j3 + " & " + j2 + " are similar ");
                            return;
                        } else if (j3 < 15000) {
                            t1.k("Clear bookmark, we are near the end or start");
                            w0.a = 0L;
                        } else {
                            long max = Math.max(j3 - 15000, 0L);
                            t1.k("Set newPosition = " + max);
                            w0.a = max;
                        }
                        tVar.r(w0);
                        v0.this.p(w0);
                        Objects.requireNonNull((j6) c.i.g.b.f());
                        Objects.requireNonNull((j6) c.i.g.b.f());
                    }
                } catch (SQLiteException e3) {
                    s1.l(e3, true);
                }
            }
        }

        public void u(t tVar, Bookmark bookmark) throws Exception {
            q0 q0Var = this.f8222c;
            if (q0Var != null) {
                try {
                    int ordinal = i().ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            return;
                        }
                        t1.k("Seek Ignored = " + bookmark.a);
                        return;
                    }
                    if (this.f8221b) {
                        k(tVar);
                        this.f8221b = false;
                    } else {
                        if (bookmark.a < 0) {
                            bookmark.a = 0L;
                        }
                        if (bookmark.a > q0Var.g()) {
                            bookmark.a = q0Var.g();
                        }
                    }
                    q0Var.o(bookmark);
                } catch (RemoteException e2) {
                    e = e2;
                    s1.l(e, true);
                } catch (x0 e3) {
                    e = e3;
                    s1.l(e, true);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void v(boolean r7, e.h.d.t r8, boolean r9) throws java.lang.Exception, e.h.d.x0 {
            /*
                r6 = this;
                e.h.d.q0 r0 = r6.f8222c
                e.h.d.v0 r1 = e.h.d.v0.this
                java.lang.ref.WeakReference<e.h.d.m0> r1 = r1.f8214d
                java.lang.Object r1 = r1.get()
                e.h.d.m0 r1 = (e.h.d.m0) r1
                if (r1 == 0) goto Lac
                r2 = 0
                if (r7 == 0) goto L13
                r6.a = r2
            L13:
                boolean r7 = r6.a
                if (r7 == 0) goto L1d
                java.lang.String r7 = "Expecting callback from skip, ignoring skip call"
                e.h.g.t1.k(r7)
                return
            L1d:
                if (r0 == 0) goto L3e
                boolean r7 = r0.l()
                if (r7 != 0) goto L33
                e.h.d.v0 r7 = e.h.d.v0.this
                r3 = 0
                r4 = -1
                e.h.d.u$b r7 = r7.d(r8, r3, r4)
                e.h.d.v r3 = e.h.d.v.SONG_SKIPPED
                r1.C0(r7, r3, r2)
            L33:
                if (r8 == 0) goto L3e
                e.h.d.a0 r7 = c.i.g.b.f()
                e.a.c.j6 r7 = (e.a.c.j6) r7
                java.util.Objects.requireNonNull(r7)
            L3e:
                r6.t(r8, r2)
                r7 = 1
                if (r9 != 0) goto L51
                e.a.c.b7 r8 = c.i.g.b.f2069b
                java.util.Objects.requireNonNull(r8)
                int r8 = c.i.g.h.o()
                if (r8 != r7) goto L51
                r8 = 1
                goto L52
            L51:
                r8 = 0
            L52:
                if (r0 == 0) goto L6f
                e.h.d.q0$f r3 = r0.f8158j
                if (r3 == 0) goto L6f
                if (r8 != 0) goto L6f
                r8 = 1065353216(0x3f800000, float:1.0)
                r1.P = r8     // Catch: java.lang.Exception -> L67
                r0.r(r8)     // Catch: java.lang.Exception -> L67
                r6.a = r7     // Catch: java.lang.Exception -> L67
                r0.f()     // Catch: java.lang.Exception -> L67
                goto Lac
            L67:
                r8 = move-exception
                c.i.g.b.m(r8)
                e.h.g.s1.l(r8, r7)
                goto Lac
            L6f:
                e.h.d.t0 r7 = r6.i()
                e.h.d.t0 r8 = e.h.d.t0.NotInitialized
                if (r7 != r8) goto La7
                e.h.d.v0 r7 = e.h.d.v0.this
                e.h.d.m0 r8 = r7.f()
                if (r8 == 0) goto Lac
                e.h.d.z r9 = e.h.d.m0.v     // Catch: java.lang.Throwable -> La0
                if (r9 == 0) goto L9a
                e.h.d.z r9 = e.h.d.m0.v     // Catch: java.lang.Throwable -> La0
                int r9 = r9.size()     // Catch: java.lang.Throwable -> La0
                if (r9 <= 0) goto L9a
                e.h.d.z r9 = e.h.d.m0.v     // Catch: java.lang.Throwable -> La0
                boolean r9 = r9.L(r8, r2)     // Catch: java.lang.Throwable -> La0
                if (r9 == 0) goto L97
                r8.b0()     // Catch: java.lang.Throwable -> La0
                goto L9a
            L97:
                r7.i(r2, r2)     // Catch: java.lang.Throwable -> La0
            L9a:
                java.util.concurrent.locks.ReentrantLock r7 = r7.f8215e
                r7.unlock()
                goto Lac
            La0:
                r8 = move-exception
                java.util.concurrent.locks.ReentrantLock r7 = r7.f8215e
                r7.unlock()
                throw r8
            La7:
                e.h.d.v0 r7 = e.h.d.v0.this
                r7.i(r9, r2)
            Lac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.d.v0.a.v(boolean, e.h.d.t, boolean):void");
        }

        public Bookmark w() throws RemoteException {
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (q0Var == null || m0Var == null) {
                t1.k("songPos - mPlaying == null");
            } else {
                int ordinal = i().ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    Bookmark m2 = q0Var.m();
                    v0.this.p(m2);
                    return m2;
                } else if (ordinal == 4) {
                    return new Bookmark(0L, "");
                }
            }
            return new Bookmark(0L, "");
        }

        public void x(boolean z, t tVar) throws Exception {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            t1.k("stop called p = " + z + "  " + (stackTraceElement.getFileName() + ": " + stackTraceElement.getLineNumber()));
            q0 q0Var = this.f8222c;
            m0 m0Var = v0.this.f8214d.get();
            if (m0Var != null) {
                this.a = false;
                if (q0Var == null) {
                    return;
                }
                int ordinal = i().ordinal();
                if (ordinal == 0) {
                    q0Var.u(z);
                    u.b d2 = v0.this.d(tVar, null, -1L);
                    m0Var.C0(d2, v.QUEUE_CHANGED, false);
                    m0Var.C0(d2, v.META_CHANGED, false);
                } else if (ordinal == 1) {
                    q0Var.u(z);
                    t1.k("Stop called while already stopped. Odd call ignored. This could lead to badness");
                } else if (ordinal != 2) {
                } else {
                    t1.k("Stop called while not initialized. Odd call ignored");
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public long f8224b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8225c;

        /* renamed from: d  reason: collision with root package name */
        public t f8226d;

        public b(v0 v0Var, t tVar) {
            this.f8226d = tVar;
        }
    }

    public v0(m0 m0Var) throws Exception {
        e.h.g.r0 r0Var = new e.h.g.r0();
        r0Var.a(-2000L);
        this.f8217g = r0Var;
        this.f8218h = 0;
        this.f8220j = new u1("PlaylistPlayer");
        this.f8214d = new WeakReference<>(m0Var);
        this.f8213c = new a();
        Objects.requireNonNull(c.i.g.b.f2069b);
    }

    public static void a(v0 v0Var, m0.l lVar, String str) {
        m0 m0Var = v0Var.f8214d.get();
        if (m0Var != null) {
            m0Var.Q0(lVar, str);
        }
    }

    public void b() throws Exception {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            m0Var.C0(d(null, null, -1L), v.QUEUE_CHANGED, true);
        }
    }

    public long c() throws Exception {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            t e2 = e();
            if (e2 != null) {
                b bVar = this.f8219i;
                if (bVar == null || bVar.f8224b == -1) {
                    bVar = new b(this, e2);
                    e.h.g.r0 r0Var = new e.h.g.r0();
                    r0Var.a(-2000L);
                    this.f8217g = r0Var;
                }
                if (!bVar.f8226d.equals(e2)) {
                    long j2 = bVar.f8224b;
                    bVar = new b(this, e2);
                    bVar.f8224b = j2;
                    e.h.g.r0 r0Var2 = new e.h.g.r0();
                    r0Var2.a(-2000L);
                    this.f8217g = r0Var2;
                }
                this.f8219i = bVar;
                if (this.f8212b.ordinal() != 1) {
                    return bVar.f8226d.A();
                }
                if (j1.f()) {
                    if (this.f8217g.b() > 2000) {
                        if (this.f8216f == null) {
                            Intent intent = new Intent();
                            this.f8216f = intent;
                            intent.putExtra("PrivateMethod", 53);
                        }
                        m0Var.k(this.f8216f);
                    }
                    return bVar.f8224b;
                }
                a aVar = this.f8213c;
                if (aVar != null && bVar.a < 3 && (this.f8217g.b() > 2000 || !bVar.f8225c)) {
                    long e3 = aVar.e();
                    if (bVar.f8224b == e3) {
                        bVar.a++;
                    }
                    bVar.f8224b = e3;
                    bVar.f8225c = true;
                    this.f8217g.g();
                }
                return bVar.f8224b;
            }
            b bVar2 = this.f8219i;
            if (bVar2 != null) {
                return bVar2.f8224b;
            }
        }
        return 0L;
    }

    public final u.b d(t tVar, Bookmark bookmark, long j2) throws Exception {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            if (tVar == null) {
                tVar = e();
            }
            t tVar2 = tVar;
            if (bookmark == null) {
                bookmark = m0Var.w0();
            }
            Bookmark bookmark2 = bookmark;
            if (j2 == -1) {
                j2 = c();
            }
            return new u.b(tVar2, m0Var.I, bookmark2, j2, this, m0Var.L, null);
        }
        return null;
    }

    public t e() {
        if (m0.v.size() > 0) {
            int ordinal = this.f8212b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a aVar = this.f8213c;
                    if (aVar != null) {
                        t n2 = m0.v.n();
                        if (aVar.f8222c == null) {
                            t1.k("mPlayer is null");
                            return null;
                        }
                        int ordinal2 = aVar.i().ordinal();
                        if (ordinal2 != 0 && ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                if (a) {
                                    return null;
                                }
                                t1.k("Player not initialized, not returning current song");
                                a = true;
                                return null;
                            } else if (ordinal2 != 4) {
                                return null;
                            }
                        }
                        a = false;
                        return n2;
                    }
                }
            }
            return m0.v.n();
        }
        return null;
    }

    public final m0 f() {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            this.f8215e.lock();
            m0Var = this.f8214d.get();
            if (m0Var == null) {
                this.f8215e.unlock();
            }
        }
        return m0Var;
    }

    public t0 g() {
        a aVar;
        int ordinal = this.f8212b.ordinal();
        return (ordinal == 0 || ordinal != 1 || (aVar = this.f8213c) == null) ? t0.NotInitialized : aVar.i();
    }

    public void h(int i2) throws Exception, x0 {
        a aVar;
        m0 f2 = f();
        if (f2 != null) {
            boolean z = false;
            boolean z2 = i2 != 1;
            try {
                if (i2 == 2) {
                    try {
                        Objects.requireNonNull(c.i.g.b.f2069b);
                    } catch (RemoteException e2) {
                        s1.l(e2, true);
                    }
                    if (c.i.g.h.q() == 2) {
                        t1.k("shuffle mode changed");
                        k6 k6Var = (k6) ((j6) c.i.g.b.f()).c();
                        k6Var.S(e.h.g.x0.f8405d, true);
                        f2.D0(k6Var, 2, true);
                        f2.sendBroadcast(new Intent("com.jrtstudio.audio.modeChanged"));
                        f2.C0(d(null, null, -1L), v.QUEUE_CHANGED, true);
                    }
                }
                if (m0.v.size() > 0 && z2) {
                    t n2 = m0.v.n();
                    Bookmark s = m0.v.s(f2);
                    if (n2 != null) {
                        s = m0.v.s(f2);
                    }
                    if (i2 == 2) {
                        z = true;
                    }
                    m0.v.S(f2, z);
                    if (n2 != null && n2.equals(m0.v.n())) {
                        m0.v.N(f2, s);
                    }
                    if (this.f8212b.ordinal() == 1 && (aVar = this.f8213c) != null) {
                        aVar.m();
                        aVar.l(m0.v.D(f2, true));
                    }
                }
                f2.sendBroadcast(new Intent("com.jrtstudio.audio.modeChanged"));
                f2.C0(d(null, null, -1L), v.QUEUE_CHANGED, true);
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public void i(boolean z, int i2) throws Exception, x0 {
        a aVar;
        a aVar2;
        int i3 = i2 + 1;
        m0 f2 = f();
        if (f2 != null) {
            t1.k("moveToNext");
            try {
                if (m0.v.size() <= 0) {
                    t1.k("playlist size == 0, done");
                } else if (!m0.v.L(f2, z)) {
                    int ordinal = this.f8212b.ordinal();
                    if (ordinal == 0) {
                        m0.v.n();
                        throw null;
                    }
                    if (ordinal == 1 && (aVar = this.f8213c) != null) {
                        aVar.g(m0.v.n(), m0.v.D(f2, true), i3);
                    }
                } else {
                    r(m0.l.NotPlaying, "playlist ended");
                    int ordinal2 = this.f8212b.ordinal();
                    if (ordinal2 == 0) {
                        throw null;
                    }
                    if (ordinal2 == 1 && (aVar2 = this.f8213c) != null) {
                        aVar2.x(true, m0.v.n());
                    }
                    f2.C0(d(null, null, -1L), v.PLAYSTATE_CHANGED, false);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j() throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.ref.WeakReference<e.h.d.m0> r0 = r8.f8214d
            java.lang.Object r0 = r0.get()
            e.h.d.m0 r0 = (e.h.d.m0) r0
            r1 = 0
            if (r0 == 0) goto L51
            e.h.d.u0 r2 = r8.f8212b
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L17
            if (r2 == r3) goto L17
            goto L51
        L17:
            boolean r2 = e.h.g.j1.f()
            if (r2 == 0) goto L45
            com.jrtstudio.audio.Bookmark r0 = r0.w0()
            long r4 = r0.a
            e.h.d.v0$a r0 = r8.f8213c
            if (r0 == 0) goto L3d
            e.h.d.q0 r0 = r0.f8222c
            if (r0 == 0) goto L33
            int r0 = r0.x
            r2 = 2
            if (r0 == r2) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            if (r0 == 0) goto L3d
            r6 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L44
            return r3
        L3d:
            r6 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L44
            return r3
        L44:
            return r1
        L45:
            e.h.d.v0$a r0 = r8.f8213c
            if (r0 == 0) goto L51
            e.h.d.q0 r0 = r0.f8222c
            if (r0 == 0) goto L51
            boolean r1 = r0.l()
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.d.v0.j():boolean");
    }

    public void k() throws Exception {
        a aVar;
        m0 f2 = f();
        if (f2 != null) {
            try {
                int ordinal = this.f8212b.ordinal();
                if (ordinal == 0) {
                    Objects.requireNonNull(null);
                    throw null;
                }
                if (ordinal == 1 && (aVar = this.f8213c) != null && aVar.i() == t0.Playing) {
                    aVar.p(m0.v.n());
                    f2.C0(d(null, null, -1L), v.PLAYSTATE_CHANGED, false);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public void l(boolean z, boolean z2) throws Exception, x0 {
        a aVar;
        m0 f2 = f();
        if (f2 != null) {
            try {
                Objects.requireNonNull((j6) c.i.g.b.f());
                Object obj = n6.a;
                if (j1.e()) {
                    e.h.g.j0.g(e.a.c.q.a);
                }
                int ordinal = this.f8212b.ordinal();
                if (ordinal == 0) {
                    Objects.requireNonNull(null);
                    throw null;
                }
                if (ordinal == 1 && (aVar = this.f8213c) != null) {
                    aVar.q(z, m0.v.D(f2, true), 0);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public void m() throws Exception {
        this.f8215e.lock();
        try {
            w(true);
            a aVar = this.f8213c;
            if (aVar != null) {
                aVar.r();
            }
            this.f8213c = null;
            try {
                this.f8215e.unlock();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.f8215e.unlock();
                throw th;
            } finally {
            }
        }
    }

    public void n(boolean z, boolean z2) throws Exception, x0 {
        m0 f2 = f();
        if (f2 != null) {
            if (z) {
                try {
                    if (g() == t0.Playing) {
                        return;
                    }
                } finally {
                    this.f8215e.unlock();
                }
            }
            Objects.requireNonNull(c.i.g.b.f2069b);
            int ordinal = this.f8212b.ordinal();
            if (ordinal == 0) {
                m0.v.n();
                m0.v.s(f2);
                Objects.requireNonNull(null);
                throw null;
            }
            if (ordinal == 1) {
                if (m0.v.size() > 0) {
                    a aVar = this.f8213c;
                    if (aVar != null) {
                        aVar.s(m0.v.s(f2), m0.v.n());
                        if (z2) {
                            aVar.q(true, m0.v.D(f2, true), 0);
                        }
                    }
                } else {
                    t1.k("queue empty");
                }
            }
            v();
            u.b d2 = d(null, null, -1L);
            f2.C0(d2, v.QUEUE_CHANGED, false);
            f2.C0(d2, v.META_CHANGED, false);
        }
    }

    public void o(boolean z) throws Exception {
        a aVar;
        if (f() != null) {
            try {
                int ordinal = this.f8212b.ordinal();
                if (ordinal != 0 && ordinal == 1 && (aVar = this.f8213c) != null) {
                    aVar.t(m0.v.n(), z);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public void p(Bookmark bookmark) {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            m0.v.N(m0Var, bookmark);
        }
    }

    public void q(z zVar, int i2, boolean z) throws Exception, x0 {
        a aVar;
        m0 f2 = f();
        if (f2 != null) {
            if (zVar != null) {
                try {
                    if (zVar.size() != 0) {
                        o(false);
                        f2.f0(i2);
                        if (m0.v.Y(f2, zVar)) {
                            t1.k("Resetting playlist, not the same position");
                            m0.v.o(f2, zVar);
                        } else {
                            t1.k("Setting playlist, appears to be different");
                            m0.v = zVar;
                            f2.C0(d(null, null, -1L), v.QUEUE_CHANGED, false);
                        }
                        if (z) {
                            int ordinal = this.f8212b.ordinal();
                            if (ordinal == 0) {
                                Objects.requireNonNull(null);
                                throw null;
                            }
                            if (ordinal == 1 && (aVar = this.f8213c) != null) {
                                aVar.k(m0.v.n());
                            }
                            u.b d2 = d(null, null, -1L);
                            f2.C0(d2, v.PLAYSTATE_CHANGED, false);
                            f2.C0(d2, v.META_CHANGED, false);
                        }
                    }
                } finally {
                    this.f8215e.unlock();
                }
            }
        }
    }

    public final void r(m0.l lVar, String str) {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            m0Var.Q0(lVar, str);
        }
    }

    public void s(float f2) throws Exception {
        a aVar;
        q0 q0Var;
        if (f() != null) {
            try {
                if (this.f8212b.ordinal() == 1 && (aVar = this.f8213c) != null && (q0Var = aVar.f8222c) != null) {
                    q0Var.r(f2);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public void t(boolean z) throws Exception, x0 {
        m0 f2 = f();
        if (f2 != null) {
            try {
                if (m0.v.size() <= 0) {
                    t1.k("No play queue");
                    return;
                }
                int ordinal = this.f8212b.ordinal();
                if (ordinal == 0) {
                    if (j()) {
                        f2.C0(d(null, null, -1L), v.SONG_SKIPPED, false);
                    }
                    i(false, 0);
                } else if (ordinal == 1) {
                    a aVar = this.f8213c;
                    if (aVar != null) {
                        aVar.v(z, m0.v.n(), false);
                    }
                    this.f8217g.a(-2000L);
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }

    public Bookmark u() throws Exception {
        m0 m0Var = this.f8214d.get();
        return m0Var != null ? m0Var.O : new Bookmark(0L, "");
    }

    public final void v() throws Exception {
        m0 m0Var = this.f8214d.get();
        if (m0Var != null) {
            u.b d2 = d(null, null, -1L);
            m0Var.C0(d2, v.META_CHANGED, false);
            m0Var.C0(d2, v.PLAYSTATE_CHANGED, false);
        }
    }

    public void w(boolean z) throws Exception {
        if (f() != null) {
            try {
                a aVar = this.f8213c;
                if (aVar != null) {
                    aVar.x(z, m0.v.n());
                }
            } finally {
                this.f8215e.unlock();
            }
        }
    }
}

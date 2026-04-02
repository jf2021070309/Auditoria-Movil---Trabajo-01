package com.android.music;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import c.i.g.b;
import c.i.g.h;
import com.jrtstudio.audio.Bookmark;
import e.a.c.d7;
import e.a.c.k6;
import e.a.c.o6;
import e.h.d.m0;
import e.h.d.q0;
import e.h.d.t;
import e.h.d.t0;
import e.h.d.v0;
import e.h.d.w0;
import e.h.d.z;
import e.h.f.a;
import e.h.g.d1.k;
import e.h.g.j1;
import e.h.g.l0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.u0;
import e.h.g.x0;
import e.h.g.z0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class MediaPlaybackService extends m0 {
    public static final /* synthetic */ int y0 = 0;
    public final IBinder z0 = new a(this);

    /* loaded from: classes.dex */
    public static class a extends a.AbstractBinderC0175a implements u0 {

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<MediaPlaybackService> f2973b;

        public a(MediaPlaybackService mediaPlaybackService) {
            this.f2973b = new WeakReference<>(mediaPlaybackService);
        }

        @Override // e.h.f.a
        public void A(long j2) {
            try {
                this.f2973b.get().K0(new o6(j2), -1);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }

        @Override // e.h.f.a
        public long B(long j2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.M0(new Bookmark(j2, ""));
                    return -1L;
                } catch (Exception e2) {
                    s1.l(e2, true);
                    return -1L;
                }
            }
            return -1L;
        }

        @Override // e.h.f.a
        public void E0() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.V0();
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void F(int i2) {
            try {
                this.f2973b.get().K0(null, i2);
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }

        @Override // e.h.f.a
        public boolean I() {
            if (this.f2973b.get() != null) {
                try {
                    int i2 = MediaPlaybackService.y0;
                    l0 m2 = h.m();
                    TimerTask timerTask = d7.a;
                    if (m2 != null) {
                        return m2.d("finish", false);
                    }
                    return false;
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
            return false;
        }

        @Override // e.h.f.a
        public int I0() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                z u0 = mediaPlaybackService.u0();
                if (u0 instanceof k6) {
                    return u0.getPosition();
                }
                return -1;
            }
            return -1;
        }

        @Override // e.h.f.a
        public int J() {
            if (this.f2973b.get() != null) {
                try {
                    int i2 = MediaPlaybackService.y0;
                    l0 m2 = h.m();
                    if (d7.a == null) {
                        if (m2 != null) {
                            return m2.e("minutes", 30);
                        }
                        return 30;
                    }
                    return (int) (((int) ((d7.f5052c - d7.f5053d.b()) % 3600000)) / 60000);
                } catch (Exception e2) {
                    s1.l(e2, true);
                    return 0;
                }
            }
            return 0;
        }

        @Override // e.h.f.a
        public void J0(int i2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                z u0 = mediaPlaybackService.u0();
                if (u0.E().size() > i2) {
                    z g2 = u0.g();
                    g2.x(mediaPlaybackService, i2);
                    Objects.requireNonNull(b.f2069b);
                    mediaPlaybackService.D0(g2, h.q(), true);
                }
            }
        }

        @Override // e.h.f.a
        public void K0() throws RemoteException {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("PrivateMethod", 14);
                    mediaPlaybackService.k(intent);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void L0(long[] jArr, int i2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.r0(new k6(jArr, 0), i2);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public long M() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null || !(v0 instanceof o6)) {
                return -1L;
            }
            o6 o6Var = (o6) v0;
            o6Var.a();
            return o6Var.f5146c;
        }

        @Override // e.h.f.a
        public long N0() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null || !(v0 instanceof o6)) {
                return -1L;
            }
            return ((o6) v0).f5145b;
        }

        @Override // e.h.f.a
        public int Q() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                return mediaPlaybackService.j0;
            }
            return -1;
        }

        @Override // e.h.f.a
        public int R() {
            if (this.f2973b.get() != null) {
                try {
                    int i2 = MediaPlaybackService.y0;
                    l0 m2 = h.m();
                    if (d7.a == null) {
                        if (m2 != null) {
                            return m2.e("hours", 0);
                        }
                        return 0;
                    }
                    return (int) ((d7.f5052c - d7.f5053d.b()) / 3600000);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
            return 0;
        }

        public void S0() throws RemoteException {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.B0(9);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        public void T0(boolean z) throws RemoteException {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    h.B("aq", z);
                    mediaPlaybackService.B0(9);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        public void U0(float f2, boolean z) throws RemoteException {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    h.E("al", String.valueOf(f2));
                    h.B("ao", z);
                    mediaPlaybackService.B0(9);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public long W() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    return mediaPlaybackService.w0().a;
                } catch (Exception e2) {
                    s1.l(e2, true);
                    return -1L;
                }
            }
            return -1L;
        }

        @Override // e.h.f.a
        public long a0() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    long q0 = mediaPlaybackService.q0();
                    int i2 = t1.a;
                    s1.c("DURATION: " + ("returning duration of " + q0));
                    return q0;
                } catch (Exception e2) {
                    s1.l(e2, true);
                    return -1L;
                }
            }
            return -1L;
        }

        @Override // e.h.f.a
        public String b0() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            return (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null) ? "" : v0.getTitle();
        }

        @Override // e.h.f.a
        public String d() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            return (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null) ? "" : v0.d();
        }

        @Override // e.h.f.a
        public String e() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            return (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null) ? "" : v0.e();
        }

        @Override // e.h.f.a
        public int getAudioSessionId() {
            v0 v0Var;
            v0.a aVar;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService == null || (v0Var = mediaPlaybackService.H) == null || v0Var.f8212b.ordinal() != 1 || (aVar = v0Var.f8213c) == null) {
                return -1;
            }
            q0 q0Var = aVar.f8222c;
            return q0Var != null ? q0Var.h() : q0.f8156h;
        }

        @Override // e.h.f.a
        public String getPath() {
            t v0;
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            return (mediaPlaybackService == null || (v0 = mediaPlaybackService.v0()) == null) ? "" : v0.getPath();
        }

        @Override // e.h.f.a
        public int h() {
            return h.q();
        }

        @Override // e.h.f.a
        public void i() {
            if (this.f2973b.get() != null) {
                try {
                    m0.N0(k.USER_PLAY);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public boolean isPlaying() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            return mediaPlaybackService != null && mediaPlaybackService.x0() == t0.Playing;
        }

        @Override // e.h.f.a
        public long[] j() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            int i2 = 0;
            if (mediaPlaybackService != null) {
                z u0 = mediaPlaybackService.u0();
                if (u0 instanceof k6) {
                    k6 k6Var = (k6) u0;
                    long[] jArr = new long[k6Var.f5111g.size()];
                    Iterator<Long> it = k6Var.f5111g.iterator();
                    while (it.hasNext()) {
                        jArr[i2] = it.next().longValue();
                        i2++;
                    }
                    return jArr;
                }
            }
            return new long[0];
        }

        @Override // e.h.f.a
        public void j0(long[] jArr, int i2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    long nanoTime = System.nanoTime();
                    t1.j("Creating AM Playlist");
                    k6 k6Var = new k6(jArr, i2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("AM Playlist created in ");
                    sb.append(((System.nanoTime() - nanoTime) / 1000000) + "ms");
                    t1.j(sb.toString());
                    k6Var.x(x0.f8405d, i2);
                    mediaPlaybackService.D0(k6Var, h.q(), true);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void k(int i2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.O0(i2);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void k0(int i2, int i3) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("pos", i2);
                    intent.putExtra("pos2", i3);
                    intent.putExtra("PrivateMethod", 28);
                    t1.h("Sending set queue position");
                    mediaPlaybackService.k(intent);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public int m() {
            return h.o();
        }

        @Override // e.h.f.a
        public void n(int i2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.P0(i2);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void next() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.X0(true);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public long p() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                t v0 = mediaPlaybackService.v0();
                if (v0 instanceof o6) {
                    o6 o6Var = (o6) v0;
                    o6Var.a();
                    return o6Var.f5148e;
                }
                return -1L;
            }
            return -1L;
        }

        @Override // e.h.f.a
        public void pause() {
            if (this.f2973b.get() != null) {
                try {
                    m0.N0(k.USER_PAUSE);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.g.u0
        public z0 s0() throws RemoteException {
            return m0.u;
        }

        @Override // e.h.f.a
        public void stop() {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    mediaPlaybackService.T0(true);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void v0(int i2, int i3, boolean z) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    MediaPlaybackService.Y0(mediaPlaybackService, i2, i3, z);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }

        @Override // e.h.f.a
        public void z0(String str, String str2) {
            MediaPlaybackService mediaPlaybackService = this.f2973b.get();
            if (mediaPlaybackService != null) {
                try {
                    long b2 = j1.b(Uri.parse(str), str2);
                    if (b2 != -1) {
                        mediaPlaybackService.D0(new k6(new long[]{b2}, 0), h.q(), false);
                    }
                } catch (Throwable th) {
                    s1.l(th, true);
                }
            }
        }
    }

    public static void Y0(MediaPlaybackService mediaPlaybackService, int i2, int i3, boolean z) {
        TimerTask timerTask = d7.a;
        d7.f5054e = new WeakReference<>(mediaPlaybackService);
        Timer timer = d7.f5051b;
        if (timer != null) {
            timer.cancel();
        }
        d7.f5051b = new Timer();
        d7.a aVar = new d7.a();
        d7.a = aVar;
        long j2 = (i2 * 1000 * 60) + (i3 * 60 * 1000 * 60);
        d7.f5052c = j2;
        d7.f5051b.schedule(aVar, j2);
        d7.f5053d.g();
        h.m().n("hours", i3);
        h.m().n("minutes", i2);
        h.m().m("finish", z);
    }

    @Override // e.h.d.m0
    public IBinder J() {
        return this.z0;
    }

    @Override // e.h.g.o1.c, android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder a2 = a(intent);
        if (a2 == null) {
            s1.b("RPMMusicService bound to AMP");
            if (this.L == w0.NOT_SHUTTING_DOWN) {
                s1.b("Music service bind");
                g(m0.w);
                return this.z0;
            }
            return null;
        }
        StringBuilder y = e.a.d.a.a.y("RPMMusicService bound to MusicBrowser action = ");
        y.append(intent.getAction());
        s1.b(y.toString());
        this.J = true;
        Intent intent2 = new Intent();
        intent2.putExtra("PrivateMethod", 56);
        k(intent2);
        return a2;
    }
}

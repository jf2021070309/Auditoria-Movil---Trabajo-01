package e.h.g;

import android.content.Context;
import android.util.Log;
import com.android.music.MusicApp;
import e.a.c.g7;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public class s1 {
    public static d a;

    /* renamed from: b  reason: collision with root package name */
    public static s0 f8386b;

    /* renamed from: c  reason: collision with root package name */
    public static final BlockingQueue<b> f8387c = new LinkedBlockingQueue();

    /* loaded from: classes.dex */
    public static class b {
        public String a;

        public b(int i2, String str) {
            this.a = str;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public int a = 0;

        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(1);
            while (true) {
                try {
                    b take = s1.f8387c.take();
                    if (take != null) {
                        s1.d();
                        s0 s0Var = s1.f8386b;
                        if (s0Var != null) {
                            s0Var.i(take.a);
                        }
                        int i2 = this.a + 1;
                        this.a = i2;
                        if (i2 > 1000) {
                            this.a = 0;
                            s0 s0Var2 = s1.f8386b;
                            if (s0Var2 != null) {
                                s0Var2.f(1536000);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    static {
        new Thread(new c(null)).start();
    }

    public static synchronized void a() {
        synchronized (s1.class) {
            s0 s0Var = f8386b;
            if (s0Var != null) {
                s0Var.h();
                f8386b = null;
            }
        }
    }

    public static void b(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        d dVar = a;
        if (dVar != null) {
            MusicApp.b bVar = (MusicApp.b) dVar;
            g7.g();
        }
        f8387c.add(new b(0, str));
    }

    public static void c(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        d dVar = a;
        if (dVar != null) {
            Objects.requireNonNull((MusicApp.b) dVar);
            if (g7.g() && e1.f8290b) {
                Log.e(e1.a, str);
            }
        }
        f8387c.add(new b(2, str));
    }

    public static void d() {
        if (f8386b != null || a == null) {
            return;
        }
        synchronized (s1.class) {
            s0 s0Var = f8386b;
            if (s0Var != null) {
                s0Var.g();
            }
            if (a != null) {
                try {
                    x0.f8405d.u();
                    Objects.requireNonNull((MusicApp.b) a);
                    s0 s0Var2 = null;
                    if (g7.g()) {
                        boolean z = false;
                        int b2 = g7.b("as", 0);
                        int date = new Date().getDate();
                        if (date != b2) {
                            z = true;
                            g7.f().n("as", date);
                        }
                        try {
                            s0Var2 = new s0(x0.f8405d, f(x0.f8405d), z);
                        } catch (IOException | NullPointerException unused) {
                        }
                    }
                    f8386b = s0Var2;
                } catch (Throwable unused2) {
                }
                if (f8386b != null) {
                    ((MusicApp.b) a).a();
                }
            }
        }
    }

    public static void e(Throwable th) {
        d dVar;
        if (f8386b != null) {
            synchronized (s1.class) {
                d();
                s0 s0Var = f8386b;
                if (s0Var != null && (dVar = a) != null) {
                    MusicApp.b bVar = (MusicApp.b) dVar;
                    boolean g2 = g7.g();
                    String a2 = r1.a(th);
                    s0Var.d(a2);
                    if (g2) {
                        Log.e("last_sync", a2);
                    }
                }
            }
            a();
        }
        d dVar2 = a;
        if (dVar2 != null) {
            MusicApp.b bVar2 = (MusicApp.b) dVar2;
            c.i.g.b.l(th);
        }
    }

    public static synchronized File f(Context context) throws IOException {
        File g2;
        synchronized (s1.class) {
            g2 = g(context, "Log.txt");
        }
        return g2;
    }

    public static synchronized File g(Context context, String str) throws IOException {
        synchronized (s1.class) {
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                return new File(cacheDir + File.separator + str);
            }
            return null;
        }
    }

    public static void h(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        d dVar = a;
        if (dVar != null) {
            Objects.requireNonNull((MusicApp.b) dVar);
            g7.g();
        }
        f8387c.add(new b(-1, str));
    }

    public static void i(d dVar) {
        a = dVar;
        MusicApp.b bVar = (MusicApp.b) dVar;
        if (g7.g()) {
            e1.f8290b = true;
        }
        Objects.requireNonNull(a);
        e1.a = "music.musicplayer";
    }

    public static synchronized void j(Exception exc) {
        synchronized (s1.class) {
            String a2 = r1.a(new Exception());
            if (a != null) {
                c("Possible performance improvement");
                c(a2);
                Objects.requireNonNull((MusicApp.b) a);
                c.i.g.b.l(exc);
            }
        }
    }

    public static void k(Throwable th) {
        l(th, true);
    }

    public static void l(Throwable th, boolean z) {
        if (th != null) {
            c(r1.a(th));
            d dVar = a;
            if (dVar == null || !z) {
                return;
            }
            Objects.requireNonNull((MusicApp.b) dVar);
            c.i.g.b.l(th);
        }
    }

    public static void m(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        d dVar = a;
        if (dVar != null) {
            Objects.requireNonNull((MusicApp.b) dVar);
            g7.g();
        }
        f8387c.add(new b(1, str));
    }

    public static synchronized void n(String str) {
        synchronized (s1.class) {
            if (str != null) {
                if (str.length() > 0) {
                    d dVar = a;
                    if (dVar != null) {
                        MusicApp.b bVar = (MusicApp.b) dVar;
                        g7.g();
                    }
                    d();
                    s0 s0Var = f8386b;
                    if (s0Var != null) {
                        s0Var.d(str);
                    }
                }
            }
        }
    }
}

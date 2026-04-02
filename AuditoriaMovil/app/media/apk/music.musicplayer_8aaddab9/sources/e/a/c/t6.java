package e.a.c;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.android.music.MediaAppWidgetProvider;
import com.android.music.MusicApp;
import e.h.g.j0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public class t6 extends e.b.a.a.h {

    /* renamed from: l  reason: collision with root package name */
    public final Intent f5188l;

    public t6(e.b.a.a.o oVar, Intent intent) {
        super(oVar);
        this.f5188l = intent;
    }

    public static void t(final Intent intent) {
        e.h.g.j0.f(new j0.b() { // from class: e.a.c.z0
            @Override // e.h.g.j0.b
            public final void a() {
                e.b.a.a.k kVar;
                Intent intent2 = intent;
                Handler handler = MusicApp.p;
                synchronized (MusicApp.class) {
                    if (MusicApp.r == null) {
                        MusicApp.G();
                    }
                    kVar = MusicApp.r;
                }
                e.b.a.a.o oVar = new e.b.a.a.o(0);
                String[] strArr = {"music.musicplayer"};
                if (oVar.f5380d == null) {
                    oVar.f5380d = new HashSet<>();
                }
                Collections.addAll(oVar.f5380d, strArr);
                oVar.f5378b = "music.musicplayer";
                oVar.a = 0;
                oVar.f5379c = false;
                t6 t6Var = new t6(oVar, intent2);
                Objects.requireNonNull(kVar);
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    throw new e.b.a.a.t("Cannot call this method on main thread. Use addJobInBackground instead.");
                }
                if (Thread.currentThread() == kVar.f5362c) {
                    throw new e.b.a.a.t("Cannot call sync methods in JobManager's callback thread.Use addJobInBackground instead");
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                e.b.a.a.j jVar = new e.b.a.a.j(kVar, t6Var.f5329h, countDownLatch);
                e.b.a.a.b bVar = kVar.f5361b.a;
                bVar.f5238b.add(jVar);
                bVar.f5239c.incrementAndGet();
                bVar.d();
                e.b.a.a.z.k.a aVar = (e.b.a.a.z.k.a) kVar.f5363d.a(e.b.a.a.z.k.a.class);
                aVar.f5419d = t6Var;
                kVar.f5364e.a(aVar);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
            }
        });
    }

    @Override // e.b.a.a.h
    public void b() {
    }

    @Override // e.b.a.a.h
    public void f(int i2, Throwable th) {
    }

    @Override // e.b.a.a.h
    public void h() throws Throwable {
        Intent intent = this.f5188l;
        if (intent != null) {
            try {
                MediaAppWidgetProvider.b(intent);
            } catch (Throwable th) {
                e.h.g.s1.l(th, true);
            }
        }
    }

    @Override // e.b.a.a.h
    public e.b.a.a.q i(Throwable th, int i2, int i3) {
        return null;
    }
}

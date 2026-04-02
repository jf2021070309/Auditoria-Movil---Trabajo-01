package e.j.b;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import c.p.p;
import java.util.Objects;
/* loaded from: classes2.dex */
public class b {
    public static b a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8503b;

    public b(Application application, p pVar) {
        this.f8503b = new c(application);
    }

    public void a(String str) {
        for (a aVar : this.f8503b.f8508f) {
            aVar.f(str);
        }
    }

    public <T> void b(String str, T t) {
        c cVar = this.f8503b;
        g gVar = (g) cVar.f8505c;
        Objects.requireNonNull(gVar);
        gVar.a.edit().putString("blytics_user." + str, String.valueOf(t)).apply();
        for (a aVar : cVar.f8508f) {
            aVar.g(str, String.valueOf(t));
        }
    }

    public void c(e.j.b.i.b bVar) {
        c cVar = this.f8503b;
        if (cVar.f8507e == null) {
            cVar.f8507e = new h(cVar);
        }
        h hVar = cVar.f8507e;
        e.j.b.i.b bVar2 = new e.j.b.i.b(bVar);
        synchronized (hVar) {
            Message message = new Message();
            message.what = 1;
            message.obj = bVar2;
            Handler handler = hVar.f8511b;
            if (handler != null) {
                handler.sendMessage(message);
            } else {
                hVar.f8512c.add(message);
            }
        }
    }
}

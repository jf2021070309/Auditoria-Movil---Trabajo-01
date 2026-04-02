package e.j.b;

import android.app.Application;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import c.p.o;
import java.lang.Thread;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class c {
    public final Application a;

    /* renamed from: b  reason: collision with root package name */
    public final d f8504b;

    /* renamed from: c  reason: collision with root package name */
    public final f f8505c;

    /* renamed from: d  reason: collision with root package name */
    public e.j.b.i.d f8506d;

    /* renamed from: g  reason: collision with root package name */
    public String f8509g;

    /* renamed from: h  reason: collision with root package name */
    public o f8510h;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f8508f = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public h f8507e = new h(this);

    public c(Application application) {
        this.a = application;
        this.f8504b = new e(application);
        this.f8505c = new g(application);
    }

    public final void a(e.j.b.i.b bVar) {
        for (e.j.b.i.a aVar : bVar.f8519d) {
            int i2 = aVar.f8514c;
            if (i2 == 1) {
                String str = aVar.f8513b;
                this.f8506d.c(aVar);
                bVar.b(str, Integer.valueOf(aVar.f8515d));
            } else if (i2 == 2) {
                String str2 = aVar.f8513b;
                this.f8504b.c(aVar);
                bVar.b(str2, Integer.valueOf(aVar.f8515d));
            } else if (i2 == 3) {
                e.j.b.i.a a = this.f8504b.a(aVar);
                if (a != null && !DateUtils.isToday(a.f8516e)) {
                    this.f8504b.d(a);
                }
                String str3 = aVar.f8513b;
                this.f8504b.c(aVar);
                bVar.b(str3, Integer.valueOf(aVar.f8515d));
            }
        }
    }

    public final void b(e.j.b.i.b bVar) {
        for (Pair<String, e.j.b.i.a> pair : bVar.f8520e) {
            String str = (String) pair.first;
            e.j.b.i.a aVar = (e.j.b.i.a) pair.second;
            d dVar = this.f8504b;
            int i2 = 0;
            if (this.f8506d.a(aVar) != null) {
                dVar = this.f8506d;
            }
            e.j.b.i.a a = dVar.a(aVar);
            if (a != null && a.f8514c == 3 && !DateUtils.isToday(a.f8516e)) {
                dVar.d(a);
            }
            if (a != null) {
                i2 = a.f8515d;
            }
            bVar.b(str, Integer.valueOf(i2));
        }
    }

    public void c(e.j.b.i.b bVar, boolean z) {
        if (z) {
            try {
                e.j.b.i.a b2 = this.f8504b.b("com.zipoapps.blytics#session", "session");
                if (b2 != null) {
                    bVar.b("session", Integer.valueOf(b2.f8515d));
                }
                bVar.b("isForegroundSession", Boolean.valueOf(this.f8506d.f8523c));
            } catch (Throwable th) {
                n.a.a.b("BLytics").d(th, "Failed to send event: %s", bVar.a);
                return;
            }
        }
        a(bVar);
        b(bVar);
        for (e.j.b.i.c cVar : bVar.f8521f) {
            Objects.requireNonNull(cVar);
            bVar.c(null, ((g) this.f8505c).a.getString(null, null));
        }
        String str = bVar.a;
        if (!TextUtils.isEmpty(this.f8509g) && bVar.f8517b) {
            str = this.f8509g + str;
        }
        for (a aVar : this.f8508f) {
            aVar.h(str, bVar.f8518c);
        }
    }

    public void d(boolean z) {
        this.f8506d = new e.j.b.i.d(z);
        if (this.f8507e == null) {
            this.f8507e = new h(this);
        }
        if (z) {
            d dVar = this.f8504b;
            e.j.b.i.a b2 = dVar.b("com.zipoapps.blytics#session", "session");
            if (b2 == null) {
                b2 = new e.j.b.i.a("com.zipoapps.blytics#session", "session", 2);
            }
            dVar.c(b2);
        }
        h hVar = this.f8507e;
        if (hVar.getState() == Thread.State.NEW) {
            hVar.start();
        }
    }
}

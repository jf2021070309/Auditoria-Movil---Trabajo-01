package e.a.c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import e.a.c.y6;
import e.h.g.j0;
import e.h.g.p1;
import e.h.g.q0;
import java.io.File;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class y6 {
    public static e.h.g.p0.a a;

    /* renamed from: b  reason: collision with root package name */
    public static q0.b f5215b = new a();

    /* loaded from: classes.dex */
    public class a implements q0.b {
        public e.h.g.p0.a a(File file) {
            return y6.a();
        }

        public String b(File file) {
            b d2 = y6.d(file.getAbsolutePath());
            p1.b a = f7.a();
            return d2.ordinal() != 0 ? a.a() : a.c();
        }

        public boolean c(File file) {
            if (!e.h.g.v0.e() && e.h.g.v0.g() && c.i.g.h.v()) {
                p1.b a = f7.a();
                String c2 = a.c();
                if (a.f()) {
                    c2 = a.b();
                }
                return c2 != null && file.getAbsolutePath().startsWith(c2);
            }
            return false;
        }

        public void d(final Activity activity, int i2, final Intent intent, final q0.a aVar) {
            e.h.g.j0.g(new j0.b() { // from class: e.a.c.v2
                @Override // e.h.g.j0.b
                public final void a() {
                    Intent intent2 = intent;
                    Activity activity2 = activity;
                    q0.a aVar2 = aVar;
                    Uri data = intent2.getData();
                    activity2.getContentResolver().takePersistableUriPermission(data, 3);
                    p1.b a = f7.a();
                    y6.b bVar = y6.b.SDCard;
                    if (!a.g() && a.f()) {
                        bVar = y6.b.Internal;
                    }
                    String uri = data.toString();
                    if (!((!uri.contains("%3A") || uri.endsWith("%3A")) && (!uri.contains("tree/primary") || bVar == y6.b.Internal))) {
                        int i3 = e.h.g.t1.a;
                        e.h.g.s1.c("GRANT ACCESS: Wrong directory");
                        e.h.g.j1.p(e.h.g.x0.q(R.string.wrong_directory), 1);
                        if (aVar2 != null) {
                            aVar2.a(false);
                            return;
                        }
                        return;
                    }
                    c.i.g.h.H(data);
                    int i4 = e.h.g.t1.a;
                    e.h.g.s1.c("GRANT ACCESS: Access Granted");
                    e.h.g.j1.p(e.h.g.x0.q(R.string.access_granted), 1);
                    c.i.g.h.L(true);
                    if (aVar2 != null) {
                        aVar2.a(true);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SDCard,
        Internal
    }

    public static /* synthetic */ e.h.g.p0.a a() {
        return c();
    }

    public static e.h.g.p0.a c() {
        e.h.g.p0.a aVar = a;
        if (aVar != null) {
            return aVar;
        }
        e.h.g.p0.a aVar2 = null;
        if (e.h.g.v0.g()) {
            p1.b a2 = f7.a();
            Uri p = c.i.g.h.p();
            if (p != null && p.toString().length() > 0) {
                e.h.g.p0.a e2 = e.h.g.p0.a.e(e.h.g.x0.f8405d, p);
                if (e2 == null || !e2.b()) {
                    String c2 = a2.c();
                    if (a2.f()) {
                        c2 = a2.b();
                    }
                    if (c2 != null && c2.length() > 0 && new File(c2).exists()) {
                        c.i.g.h.H(null);
                        c.i.g.h.L(false);
                        a = aVar2;
                    }
                }
                aVar2 = e2;
                a = aVar2;
            }
        }
        return aVar2;
    }

    public static b d(String str) {
        b bVar = b.Internal;
        p1.b a2 = f7.a();
        if (a2 != null) {
            b bVar2 = (a2.e() && str.startsWith(a2.c())) ? b.SDCard : bVar;
            return (bVar2 == bVar && a2.d() && str.startsWith(a2.b())) ? bVar : bVar2;
        }
        return bVar;
    }
}

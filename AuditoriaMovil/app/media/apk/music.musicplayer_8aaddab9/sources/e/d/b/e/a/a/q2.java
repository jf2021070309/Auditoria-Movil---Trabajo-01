package e.d.b.e.a.a;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class q2 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("AssetPackManager");

    /* renamed from: b  reason: collision with root package name */
    public final z f6905b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6906c;

    /* renamed from: d  reason: collision with root package name */
    public final t f6907d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6908e;

    public q2(z zVar, e.d.b.e.a.c.b0<e3> b0Var, t tVar, e.d.b.e.a.f.a aVar, h1 h1Var, t0 t0Var, i0 i0Var, e.d.b.e.a.c.b0<Executor> b0Var2) {
        new Handler(Looper.getMainLooper());
        this.f6905b = zVar;
        this.f6906c = b0Var;
        this.f6907d = tVar;
        this.f6908e = b0Var2;
    }

    public final void a(boolean z) {
        boolean z2;
        t tVar = this.f6907d;
        synchronized (tVar) {
            z2 = tVar.f6944e != null;
        }
        t tVar2 = this.f6907d;
        synchronized (tVar2) {
            tVar2.f6945f = z;
            tVar2.b();
        }
        if (!z || z2) {
            return;
        }
        this.f6908e.a().execute(new Runnable(this) { // from class: e.d.b.e.a.a.n2
            public final q2 a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q2 q2Var = this.a;
                e3 a2 = q2Var.f6906c.a();
                z zVar = q2Var.f6905b;
                Objects.requireNonNull(zVar);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                try {
                    Iterator it = ((ArrayList) zVar.p()).iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        b f2 = zVar.f(file.getName());
                        if (f2 != null) {
                            hashMap2.put(file.getName(), f2);
                        }
                    }
                } catch (IOException e2) {
                    z.a.a(6, "Could not process directory while scanning installed packs: %s", new Object[]{e2});
                }
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, Long.valueOf(zVar.m(str)));
                }
                e.d.b.e.a.g.r<List<String>> c2 = a2.c(hashMap);
                final z zVar2 = q2Var.f6905b;
                zVar2.getClass();
                c2.f7033b.a(new e.d.b.e.a.g.k(q2Var.f6908e.a(), new e.d.b.e.a.g.c(zVar2) { // from class: e.d.b.e.a.a.o2
                    public final z a;

                    {
                        this.a = zVar2;
                    }

                    @Override // e.d.b.e.a.g.c
                    public final void onSuccess(Object obj) {
                        z zVar3 = this.a;
                        List list = (List) obj;
                        int a3 = zVar3.f6983c.a();
                        ArrayList arrayList = (ArrayList) zVar3.p();
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            File file2 = (File) arrayList.get(i2);
                            if (!list.contains(file2.getName()) && z.e(file2) != a3) {
                                z.j(file2);
                            }
                        }
                    }
                }));
                c2.c();
                c2.f7033b.a(new e.d.b.e.a.g.i(q2Var.f6908e.a(), p2.a));
                c2.c();
            }
        });
    }
}

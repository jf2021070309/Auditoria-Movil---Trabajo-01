package com.amazon.aps.iva.dw;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.x5.c;
import com.amazon.aps.iva.y5.b;
import java.io.File;
import java.util.concurrent.Executors;
import okhttp3.Call;
import okhttp3.Request;
/* compiled from: ExoDownloadingModule.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();
    public static Context b;
    public static b.a c;
    public static com.amazon.aps.iva.v5.c d;
    public static File e;
    public static com.amazon.aps.iva.x5.r f;
    public static c.a g;
    public static com.amazon.aps.iva.m6.i h;

    /* compiled from: ExoDownloadingModule.kt */
    /* renamed from: com.amazon.aps.iva.dw.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0208a implements Call.Factory {
        public static final C0208a b = new C0208a();

        @Override // okhttp3.Call.Factory
        public final Call newCall(Request request) {
            com.amazon.aps.iva.yb0.j.f(request, "request");
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                return bVar.D().newCall(request);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public final synchronized c.a a() {
        c.a aVar;
        if (g == null) {
            c.a aVar2 = new c.a();
            Context context = b;
            if (context != null) {
                aVar2.a = b(context);
                aVar2.e = d();
                aVar2.d = true;
                g = aVar2;
            } else {
                com.amazon.aps.iva.yb0.j.m("applicationContext");
                throw null;
            }
        }
        aVar = g;
        com.amazon.aps.iva.yb0.j.c(aVar);
        return aVar;
    }

    public final synchronized com.amazon.aps.iva.x5.a b(Context context) {
        com.amazon.aps.iva.x5.r rVar;
        File file;
        com.amazon.aps.iva.x5.o oVar;
        com.amazon.aps.iva.v5.c cVar;
        if (f == null) {
            synchronized (this) {
                if (e == null) {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    e = externalFilesDir;
                    if (externalFilesDir == null) {
                        e = context.getFilesDir();
                    }
                }
                file = new File(e, "exo-down");
                oVar = new com.amazon.aps.iva.x5.o();
                synchronized (this) {
                    if (d == null) {
                        d = new com.amazon.aps.iva.v5.c(context);
                    }
                    cVar = d;
                    com.amazon.aps.iva.yb0.j.c(cVar);
                }
            }
            f = new com.amazon.aps.iva.x5.r(file, oVar, cVar);
        }
        rVar = f;
        com.amazon.aps.iva.yb0.j.c(rVar);
        return rVar;
    }

    public final com.amazon.aps.iva.m6.i c() {
        com.amazon.aps.iva.v5.c cVar;
        if (h == null) {
            Context context = b;
            if (context != null) {
                synchronized (this) {
                    if (d == null) {
                        d = new com.amazon.aps.iva.v5.c(context);
                    }
                    cVar = d;
                    com.amazon.aps.iva.yb0.j.c(cVar);
                }
                Context context2 = b;
                if (context2 != null) {
                    com.amazon.aps.iva.m6.i iVar = new com.amazon.aps.iva.m6.i(context, cVar, b(context2), d(), Executors.newFixedThreadPool(6));
                    if (iVar.j != 1) {
                        iVar.j = 1;
                        iVar.f++;
                        iVar.c.obtainMessage(4, 1, 0).sendToTarget();
                    }
                    h = iVar;
                } else {
                    com.amazon.aps.iva.yb0.j.m("applicationContext");
                    throw null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("applicationContext");
                throw null;
            }
        }
        com.amazon.aps.iva.m6.i iVar2 = h;
        com.amazon.aps.iva.yb0.j.c(iVar2);
        return iVar2;
    }

    public final synchronized f.a d() {
        b.a aVar;
        if (c == null) {
            c = new b.a(C0208a.b);
        }
        aVar = c;
        com.amazon.aps.iva.yb0.j.c(aVar);
        return aVar;
    }
}

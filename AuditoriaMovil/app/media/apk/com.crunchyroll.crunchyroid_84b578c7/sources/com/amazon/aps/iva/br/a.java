package com.amazon.aps.iva.br;

import android.content.Context;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.tp.g;
import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: DatadogNdkCrashHandler.kt */
/* loaded from: classes2.dex */
public final class a implements b {
    public static final long q = TimeUnit.HOURS.toMillis(4);
    public static final /* synthetic */ int r = 0;
    public final ExecutorService a;
    public final com.amazon.aps.iva.kq.b b;
    public final com.amazon.aps.iva.sp.d<c> c;
    public final com.amazon.aps.iva.sp.d<Object> d;
    public final com.amazon.aps.iva.sp.d<com.amazon.aps.iva.eq.a> e;
    public final com.amazon.aps.iva.sp.d<com.amazon.aps.iva.eq.b> f;
    public final com.amazon.aps.iva.iq.a g;
    public final com.amazon.aps.iva.cq.c h;
    public final l i;
    public final com.amazon.aps.iva.wq.d j;
    public final com.amazon.aps.iva.aq.a k;
    public final File l;
    public String m;
    public String n;
    public String o;
    public String p;

    /* compiled from: DatadogNdkCrashHandler.kt */
    /* renamed from: com.amazon.aps.iva.br.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0152a {
        public static File a(Context context) {
            return new File(context.getCacheDir(), "ndk_crash_reports_v2");
        }
    }

    public a(Context context, ExecutorService executorService, com.amazon.aps.iva.kq.b bVar, d dVar, com.amazon.aps.iva.wq.b bVar2, com.amazon.aps.iva.rp.b bVar3, com.amazon.aps.iva.oq.c cVar, com.amazon.aps.iva.iq.a aVar, com.amazon.aps.iva.cq.c cVar2, com.amazon.aps.iva.vp.e eVar, com.amazon.aps.iva.aq.a aVar2) {
        com.amazon.aps.iva.wq.d dVar2 = new com.amazon.aps.iva.wq.d(com.amazon.aps.iva.lp.a.r);
        j.f(cVar2, "timeProvider");
        this.a = executorService;
        this.b = bVar;
        this.c = dVar;
        this.d = bVar2;
        this.e = bVar3;
        this.f = cVar;
        this.g = aVar;
        this.h = cVar2;
        this.i = eVar;
        this.j = dVar2;
        this.k = aVar2;
        this.l = C0152a.a(context);
    }

    public static String d(File file, l lVar) {
        List<byte[]> c = lVar.c(file);
        if (c.isEmpty()) {
            return null;
        }
        return new String(com.amazon.aps.iva.aq.j.D(c, new byte[0], new byte[0], new byte[0]), com.amazon.aps.iva.oe0.a.b);
    }

    @Override // com.amazon.aps.iva.br.b
    public final void a(com.amazon.aps.iva.sp.c<com.amazon.aps.iva.pq.a> cVar, com.amazon.aps.iva.sp.c<Object> cVar2) {
        j.f(cVar, "logWriter");
        j.f(cVar2, "rumWriter");
        try {
            this.a.submit(new androidx.fragment.app.c(this, 5, cVar, cVar2));
        } catch (RejectedExecutionException e) {
            l1.z(this.g, "Unable to schedule operation on the executor", e, 4);
        }
    }

    public final void b() {
        File file = this.l;
        if (com.amazon.aps.iva.tp.b.b(file)) {
            try {
                File[] fileArr = (File[]) com.amazon.aps.iva.tp.b.f(file, null, g.h);
                if (fileArr != null) {
                    int length = fileArr.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = fileArr[i];
                        i++;
                        com.amazon.aps.iva.vb0.f.L(file2);
                    }
                }
            } catch (Throwable th) {
                String absolutePath = file.getAbsolutePath();
                l1.z(this.g, "Unable to clear the NDK crash report file: " + absolutePath, th, 4);
            }
        }
    }

    public final void c() {
        try {
            this.a.submit(new e1(this, 4));
        } catch (RejectedExecutionException e) {
            l1.z(this.g, "Unable to schedule operation on the executor", e, 4);
        }
    }
}

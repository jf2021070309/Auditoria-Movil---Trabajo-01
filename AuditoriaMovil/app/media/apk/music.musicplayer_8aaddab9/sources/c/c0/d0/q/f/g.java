package c.c0.d0.q.f;

import android.content.Context;
/* loaded from: classes.dex */
public class g {
    public static g a;

    /* renamed from: b  reason: collision with root package name */
    public a f1475b;

    /* renamed from: c  reason: collision with root package name */
    public b f1476c;

    /* renamed from: d  reason: collision with root package name */
    public e f1477d;

    /* renamed from: e  reason: collision with root package name */
    public f f1478e;

    public g(Context context, c.c0.d0.t.t.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1475b = new a(applicationContext, aVar);
        this.f1476c = new b(applicationContext, aVar);
        this.f1477d = new e(applicationContext, aVar);
        this.f1478e = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, c.c0.d0.t.t.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (a == null) {
                a = new g(context, aVar);
            }
            gVar = a;
        }
        return gVar;
    }
}

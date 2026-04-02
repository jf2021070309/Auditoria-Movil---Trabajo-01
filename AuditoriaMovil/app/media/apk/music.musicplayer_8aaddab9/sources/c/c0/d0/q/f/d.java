package c.c0.d0.q.f;

import android.content.Context;
import c.c0.r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class d<T> {
    public static final String a = r.e("ConstraintTracker");

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.t.t.a f1464b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1465c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1466d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final Set<c.c0.d0.q.a<T>> f1467e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public T f1468f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (c.c0.d0.q.a aVar : this.a) {
                aVar.a(d.this.f1468f);
            }
        }
    }

    public d(Context context, c.c0.d0.t.t.a aVar) {
        this.f1465c = context.getApplicationContext();
        this.f1464b = aVar;
    }

    public abstract T a();

    public void b(c.c0.d0.q.a<T> aVar) {
        synchronized (this.f1466d) {
            if (this.f1467e.remove(aVar) && this.f1467e.isEmpty()) {
                e();
            }
        }
    }

    public void c(T t) {
        synchronized (this.f1466d) {
            T t2 = this.f1468f;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f1468f = t;
                ((c.c0.d0.t.t.b) this.f1464b).f1596c.execute(new a(new ArrayList(this.f1467e)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}

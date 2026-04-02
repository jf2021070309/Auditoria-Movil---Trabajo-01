package c.c0.d0.t;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import c.c0.d0.t.s.a;
import c.c0.y;
import java.util.UUID;
/* loaded from: classes.dex */
public class o implements c.c0.j {
    public final c.c0.d0.t.t.a a;

    /* renamed from: b  reason: collision with root package name */
    public final c.c0.d0.r.a f1558b;

    /* renamed from: c  reason: collision with root package name */
    public final c.c0.d0.s.q f1559c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ c.c0.d0.t.s.c a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ UUID f1560b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.c0.i f1561c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f1562d;

        public a(c.c0.d0.t.s.c cVar, UUID uuid, c.c0.i iVar, Context context) {
            this.a = cVar;
            this.f1560b = uuid;
            this.f1561c = iVar;
            this.f1562d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!(this.a.f1578e instanceof a.c)) {
                    String uuid = this.f1560b.toString();
                    y f2 = ((c.c0.d0.s.r) o.this.f1559c).f(uuid);
                    if (f2 == null || f2.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    ((c.c0.d0.d) o.this.f1558b).f(uuid, this.f1561c);
                    this.f1562d.startService(c.c0.d0.r.c.a(this.f1562d, uuid, this.f1561c));
                }
                this.a.j(null);
            } catch (Throwable th) {
                this.a.k(th);
            }
        }
    }

    static {
        c.c0.r.e("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, c.c0.d0.r.a aVar, c.c0.d0.t.t.a aVar2) {
        this.f1558b = aVar;
        this.a = aVar2;
        this.f1559c = workDatabase.q();
    }

    public e.d.c.a.a.a<Void> a(Context context, UUID uuid, c.c0.i iVar) {
        c.c0.d0.t.s.c cVar = new c.c0.d0.t.s.c();
        c.c0.d0.t.t.a aVar = this.a;
        ((c.c0.d0.t.t.b) aVar).a.execute(new a(cVar, uuid, iVar, context));
        return cVar;
    }
}

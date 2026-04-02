package c.c0;

import android.os.Build;
import androidx.work.ListenableWorker;
import c.c0.t;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class a0 {
    public UUID a;

    /* renamed from: b  reason: collision with root package name */
    public c.c0.d0.s.p f1312b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f1313c;

    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends a0> {

        /* renamed from: b  reason: collision with root package name */
        public c.c0.d0.s.p f1314b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f1315c = new HashSet();
        public UUID a = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.f1314b = new c.c0.d0.s.p(this.a.toString(), cls.getName());
            this.f1315c.add(cls.getName());
        }

        public final W a() {
            t tVar = new t((t.a) this);
            d dVar = this.f1314b.f1515j;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = (i2 >= 24 && dVar.a()) || dVar.f1327e || dVar.f1325c || (i2 >= 23 && dVar.f1326d);
            c.c0.d0.s.p pVar = this.f1314b;
            if (pVar.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (pVar.f1512g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.a = UUID.randomUUID();
            c.c0.d0.s.p pVar2 = new c.c0.d0.s.p(this.f1314b);
            this.f1314b = pVar2;
            pVar2.a = this.a.toString();
            return tVar;
        }
    }

    public a0(UUID uuid, c.c0.d0.s.p pVar, Set<String> set) {
        this.a = uuid;
        this.f1312b = pVar;
        this.f1313c = set;
    }

    public String a() {
        return this.a.toString();
    }
}

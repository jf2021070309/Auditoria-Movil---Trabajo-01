package e.c.a.m.t;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class p {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5807b;

    /* loaded from: classes.dex */
    public static class a {
        public final Map<Class<?>, C0123a<?>> a = new HashMap();

        /* renamed from: e.c.a.m.t.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0123a<Model> {
            public final List<n<Model, ?>> a;

            public C0123a(List<n<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public p(c.i.j.c<List<Throwable>> cVar) {
        r rVar = new r(cVar);
        this.f5807b = new a();
        this.a = rVar;
    }
}

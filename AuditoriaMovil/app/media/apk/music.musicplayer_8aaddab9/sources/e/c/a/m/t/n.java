package e.c.a.m.t;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {
        public final e.c.a.m.k a;

        /* renamed from: b  reason: collision with root package name */
        public final List<e.c.a.m.k> f5805b;

        /* renamed from: c  reason: collision with root package name */
        public final e.c.a.m.r.d<Data> f5806c;

        public a(e.c.a.m.k kVar, e.c.a.m.r.d<Data> dVar) {
            List<e.c.a.m.k> emptyList = Collections.emptyList();
            Objects.requireNonNull(kVar, "Argument must not be null");
            this.a = kVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.f5805b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.f5806c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i2, int i3, e.c.a.m.m mVar);
}

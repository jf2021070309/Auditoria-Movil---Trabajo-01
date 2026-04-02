package j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class p extends c0 {
    public static final u a = u.b("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9530b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f9531c;

    /* loaded from: classes2.dex */
    public static final class a {
        public final List<String> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f9532b = new ArrayList();
    }

    public p(List<String> list, List<String> list2) {
        this.f9530b = j.i0.c.o(list);
        this.f9531c = j.i0.c.o(list2);
    }

    @Override // j.c0
    public long a() {
        return d(null, true);
    }

    @Override // j.c0
    public u b() {
        return a;
    }

    @Override // j.c0
    public void c(k.f fVar) throws IOException {
        d(fVar, false);
    }

    public final long d(@Nullable k.f fVar, boolean z) {
        k.d dVar = z ? new k.d() : fVar.b();
        int size = this.f9530b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                dVar.h0(38);
            }
            dVar.m0(this.f9530b.get(i2));
            dVar.h0(61);
            dVar.m0(this.f9531c.get(i2));
        }
        if (z) {
            long j2 = dVar.f9620b;
            dVar.skip(j2);
            return j2;
        }
        return 0L;
    }
}

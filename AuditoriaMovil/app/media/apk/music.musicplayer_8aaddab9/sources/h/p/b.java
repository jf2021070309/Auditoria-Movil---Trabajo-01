package h.p;

import h.o.c.j;
import java.util.Random;
/* loaded from: classes2.dex */
public final class b extends h.p.a {

    /* renamed from: c  reason: collision with root package name */
    public final a f8948c = new a();

    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // h.p.a
    public Random h() {
        Random random = this.f8948c.get();
        j.d(random, "implStorage.get()");
        return random;
    }
}

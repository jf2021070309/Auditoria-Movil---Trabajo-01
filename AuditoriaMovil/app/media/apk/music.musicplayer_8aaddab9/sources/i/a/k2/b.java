package i.a.k2;

import e.j.d.w;
import i.a.c0;
import i.a.i2.r;
/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: g  reason: collision with root package name */
    public static final b f9114g;

    /* renamed from: h  reason: collision with root package name */
    public static final c0 f9115h;

    static {
        b bVar = new b();
        f9114g = bVar;
        int i2 = r.a;
        f9115h = new e(bVar, w.B0("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    public b() {
        super(0, 0, null, 7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // i.a.c0
    public String toString() {
        return "Dispatchers.Default";
    }
}

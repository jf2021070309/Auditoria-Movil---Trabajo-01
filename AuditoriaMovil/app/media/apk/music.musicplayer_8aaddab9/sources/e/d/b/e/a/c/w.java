package e.d.b.e.a.c;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class w {
    public final ConcurrentHashMap<v, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<Throwable> f7013b = new ReferenceQueue<>();
}

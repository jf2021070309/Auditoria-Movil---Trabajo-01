package l.c.a.x;

import com.google.android.gms.ads.AdRequest;
import e.j.d.w;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import l.c.a.x.h;
/* loaded from: classes2.dex */
public abstract class i {
    public static final CopyOnWriteArrayList<i> a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, i> f9841b = new ConcurrentHashMap(AdRequest.MAX_CONTENT_URL_LENGTH, 0.75f, 2);

    static {
        if (h.a.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<h> atomicReference = h.f9840b;
        atomicReference.compareAndSet(null, new h.a());
        atomicReference.get().a();
    }

    public static f a(String str, boolean z) {
        w.k0(str, "zoneId");
        ConcurrentMap<String, i> concurrentMap = f9841b;
        i iVar = concurrentMap.get(str);
        if (iVar == null) {
            if (concurrentMap.isEmpty()) {
                throw new g("No time-zone data files registered");
            }
            throw new g(e.a.d.a.a.k("Unknown time-zone ID: ", str));
        }
        return iVar.b(str, z);
    }

    public static void d(i iVar) {
        w.k0(iVar, "provider");
        for (String str : iVar.c()) {
            w.k0(str, "zoneId");
            if (f9841b.putIfAbsent(str, iVar) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
        a.add(iVar);
    }

    public abstract f b(String str, boolean z);

    public abstract Set<String> c();
}

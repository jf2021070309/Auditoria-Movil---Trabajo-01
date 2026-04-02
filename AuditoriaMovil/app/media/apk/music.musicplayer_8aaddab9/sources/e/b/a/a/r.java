package e.b.a.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class r {

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f5384d;

    /* renamed from: e  reason: collision with root package name */
    public final e.b.a.a.c0.a f5385e;

    /* renamed from: c  reason: collision with root package name */
    public final TreeSet<String> f5383c = new TreeSet<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Long> f5382b = new HashMap();
    public long a = Long.MAX_VALUE;

    public r(e.b.a.a.c0.a aVar) {
        this.f5385e = aVar;
    }

    public synchronized void a(String str) {
        if (str == null) {
            return;
        }
        if (this.f5383c.add(str)) {
            this.f5384d = null;
        }
    }

    public final long b() {
        long j2 = Long.MAX_VALUE;
        for (Long l2 : this.f5382b.values()) {
            if (l2.longValue() < j2) {
                j2 = l2.longValue();
            }
        }
        return j2;
    }

    public synchronized Collection<String> c() {
        long a = this.f5385e.a();
        if (this.f5384d == null || a > this.a) {
            if (this.f5382b.isEmpty()) {
                this.f5384d = new ArrayList<>(this.f5383c);
                this.a = Long.MAX_VALUE;
            } else {
                TreeSet treeSet = new TreeSet((SortedSet) this.f5383c);
                Iterator<Map.Entry<String, Long>> it = this.f5382b.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Long> next = it.next();
                    if (next.getValue().longValue() <= a) {
                        it.remove();
                    } else if (!treeSet.contains(next.getKey())) {
                        treeSet.add(next.getKey());
                    }
                }
                this.f5384d = new ArrayList<>(treeSet);
                this.a = b();
            }
        }
        return this.f5384d;
    }
}

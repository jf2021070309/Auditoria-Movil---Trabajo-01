package ch.qos.logback.core.spi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class AbstractComponentTracker<C> implements ComponentTracker<C> {
    private static final boolean ACCESS_ORDERED = true;
    public static final long LINGERING_TIMEOUT = 10000;
    public static final long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS = 1000;
    public int maxComponents = Integer.MAX_VALUE;
    public long timeout = ComponentTracker.DEFAULT_TIMEOUT;
    public LinkedHashMap<String, d<C>> liveMap = new LinkedHashMap<>(32, 0.75f, true);
    public LinkedHashMap<String, d<C>> lingerersMap = new LinkedHashMap<>(16, 0.75f, true);
    public long lastCheck = 0;
    private e<C> byExcedent = new a();
    private e<C> byTimeout = new b();
    private e<C> byLingering = new c();

    /* loaded from: classes.dex */
    public class a implements e<C> {
        public a() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<C> dVar, long j2) {
            return AbstractComponentTracker.this.liveMap.size() > AbstractComponentTracker.this.maxComponents;
        }
    }

    /* loaded from: classes.dex */
    public class b implements e<C> {
        public b() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<C> dVar, long j2) {
            return AbstractComponentTracker.this.isEntryStale(dVar, j2);
        }
    }

    /* loaded from: classes.dex */
    public class c implements e<C> {
        public c() {
        }

        @Override // ch.qos.logback.core.spi.AbstractComponentTracker.e
        public boolean a(d<C> dVar, long j2) {
            return AbstractComponentTracker.this.isEntryDoneLingering(dVar, j2);
        }
    }

    /* loaded from: classes.dex */
    public static class d<C> {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public C f2931b;

        /* renamed from: c  reason: collision with root package name */
        public long f2932c;

        public d(String str, C c2, long j2) {
            this.a = str;
            this.f2931b = c2;
            this.f2932c = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                String str = this.a;
                if (str == null) {
                    if (dVar.a != null) {
                        return false;
                    }
                } else if (!str.equals(dVar.a)) {
                    return false;
                }
                C c2 = this.f2931b;
                C c3 = dVar.f2931b;
                if (c2 == null) {
                    if (c3 != null) {
                        return false;
                    }
                } else if (!c2.equals(c3)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("(");
            y.append(this.a);
            y.append(", ");
            y.append(this.f2931b);
            y.append(")");
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface e<C> {
        boolean a(d<C> dVar, long j2);
    }

    private void genericStaleComponentRemover(LinkedHashMap<String, d<C>> linkedHashMap, long j2, e<C> eVar) {
        Iterator<Map.Entry<String, d<C>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            d<C> value = it.next().getValue();
            if (!eVar.a(value, j2)) {
                return;
            }
            it.remove();
            processPriorToRemoval(value.f2931b);
        }
    }

    private d<C> getFromEitherMap(String str) {
        d<C> dVar = this.liveMap.get(str);
        return dVar != null ? dVar : this.lingerersMap.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryDoneLingering(d<C> dVar, long j2) {
        return dVar.f2932c + LINGERING_TIMEOUT < j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEntryStale(d<C> dVar, long j2) {
        return isComponentStale(dVar.f2931b) || dVar.f2932c + this.timeout < j2;
    }

    private boolean isTooSoonForRemovalIteration(long j2) {
        if (this.lastCheck + 1000 > j2) {
            return true;
        }
        this.lastCheck = j2;
        return false;
    }

    private void removeExcedentComponents() {
        genericStaleComponentRemover(this.liveMap, 0L, this.byExcedent);
    }

    private void removeStaleComponentsFromLingerersMap(long j2) {
        genericStaleComponentRemover(this.lingerersMap, j2, this.byLingering);
    }

    private void removeStaleComponentsFromMainMap(long j2) {
        genericStaleComponentRemover(this.liveMap, j2, this.byTimeout);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Collection<C> allComponents() {
        ArrayList arrayList = new ArrayList();
        for (d<C> dVar : this.liveMap.values()) {
            arrayList.add(dVar.f2931b);
        }
        for (d<C> dVar2 : this.lingerersMap.values()) {
            arrayList.add(dVar2.f2931b);
        }
        return arrayList;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public Set<String> allKeys() {
        HashSet hashSet = new HashSet(this.liveMap.keySet());
        hashSet.addAll(this.lingerersMap.keySet());
        return hashSet;
    }

    public abstract C buildComponent(String str);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public void endOfLife(String str) {
        d<C> remove = this.liveMap.remove(str);
        if (remove == null) {
            return;
        }
        this.lingerersMap.put(str, remove);
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C find(String str) {
        d<C> fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            return null;
        }
        return fromEitherMap.f2931b;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public int getComponentCount() {
        return this.lingerersMap.size() + this.liveMap.size();
    }

    public int getMaxComponents() {
        return this.maxComponents;
    }

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized C getOrCreate(String str, long j2) {
        d<C> fromEitherMap;
        fromEitherMap = getFromEitherMap(str);
        if (fromEitherMap == null) {
            d<C> dVar = new d<>(str, buildComponent(str), j2);
            this.liveMap.put(str, dVar);
            fromEitherMap = dVar;
        } else {
            fromEitherMap.f2932c = j2;
        }
        return fromEitherMap.f2931b;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public abstract boolean isComponentStale(C c2);

    public abstract void processPriorToRemoval(C c2);

    @Override // ch.qos.logback.core.spi.ComponentTracker
    public synchronized void removeStaleComponents(long j2) {
        if (isTooSoonForRemovalIteration(j2)) {
            return;
        }
        removeExcedentComponents();
        removeStaleComponentsFromMainMap(j2);
        removeStaleComponentsFromLingerersMap(j2);
    }

    public void setMaxComponents(int i2) {
        this.maxComponents = i2;
    }

    public void setTimeout(long j2) {
        this.timeout = j2;
    }
}

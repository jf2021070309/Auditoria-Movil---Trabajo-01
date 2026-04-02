package e.c.a.m.s;

import e.c.a.m.s.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class u<Data, ResourceType, Transcode> {
    public final c.i.j.c<List<Throwable>> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<Data, ResourceType, Transcode>> f5758b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5759c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, c.i.j.c<List<Throwable>> cVar) {
        this.a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f5758b = list;
        StringBuilder y = e.a.d.a.a.y("Failed LoadPath{");
        y.append(cls.getSimpleName());
        y.append("->");
        y.append(cls2.getSimpleName());
        y.append("->");
        y.append(cls3.getSimpleName());
        y.append("}");
        this.f5759c = y.toString();
    }

    public w<Transcode> a(e.c.a.m.r.e<Data> eVar, e.c.a.m.m mVar, int i2, int i3, j.a<ResourceType> aVar) throws r {
        List<Throwable> b2 = this.a.b();
        Objects.requireNonNull(b2, "Argument must not be null");
        List<Throwable> list = b2;
        try {
            int size = this.f5758b.size();
            w<Transcode> wVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    wVar = this.f5758b.get(i4).a(eVar, i2, i3, mVar, aVar);
                } catch (r e2) {
                    list.add(e2);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new r(this.f5759c, new ArrayList(list));
        } finally {
            this.a.a(list);
        }
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("LoadPath{decodePaths=");
        y.append(Arrays.toString(this.f5758b.toArray()));
        y.append('}');
        return y.toString();
    }
}

package e.c.a.m.s;

import android.util.Log;
import e.c.a.g;
import e.c.a.m.s.i;
import e.c.a.m.t.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends e.c.a.m.o<DataType, ResourceType>> f5694b;

    /* renamed from: c  reason: collision with root package name */
    public final e.c.a.m.u.h.e<ResourceType, Transcode> f5695c;

    /* renamed from: d  reason: collision with root package name */
    public final c.i.j.c<List<Throwable>> f5696d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5697e;

    /* loaded from: classes.dex */
    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends e.c.a.m.o<DataType, ResourceType>> list, e.c.a.m.u.h.e<ResourceType, Transcode> eVar, c.i.j.c<List<Throwable>> cVar) {
        this.a = cls;
        this.f5694b = list;
        this.f5695c = eVar;
        this.f5696d = cVar;
        StringBuilder y = e.a.d.a.a.y("Failed DecodePath{");
        y.append(cls.getSimpleName());
        y.append("->");
        y.append(cls2.getSimpleName());
        y.append("->");
        y.append(cls3.getSimpleName());
        y.append("}");
        this.f5697e = y.toString();
    }

    public w<Transcode> a(e.c.a.m.r.e<DataType> eVar, int i2, int i3, e.c.a.m.m mVar, a<ResourceType> aVar) throws r {
        w<ResourceType> wVar;
        e.c.a.m.q qVar;
        e.c.a.m.c cVar;
        e.c.a.m.k eVar2;
        List<Throwable> b2 = this.f5696d.b();
        Objects.requireNonNull(b2, "Argument must not be null");
        List<Throwable> list = b2;
        try {
            w<ResourceType> b3 = b(eVar, i2, i3, mVar, list);
            this.f5696d.a(list);
            i.b bVar = (i.b) aVar;
            i iVar = i.this;
            e.c.a.m.a aVar2 = bVar.a;
            Objects.requireNonNull(iVar);
            Class<?> cls = b3.get().getClass();
            e.c.a.m.p pVar = null;
            if (aVar2 != e.c.a.m.a.RESOURCE_DISK_CACHE) {
                e.c.a.m.q f2 = iVar.a.f(cls);
                qVar = f2;
                wVar = f2.b(iVar.f5682h, b3, iVar.f5686l, iVar.f5687m);
            } else {
                wVar = b3;
                qVar = null;
            }
            if (!b3.equals(wVar)) {
                b3.a();
            }
            boolean z = false;
            if (iVar.a.f5664c.f5459c.f5470d.a(wVar.c()) != null) {
                pVar = iVar.a.f5664c.f5459c.f5470d.a(wVar.c());
                if (pVar == null) {
                    throw new g.d(wVar.c());
                }
                cVar = pVar.b(iVar.o);
            } else {
                cVar = e.c.a.m.c.NONE;
            }
            e.c.a.m.p pVar2 = pVar;
            h<R> hVar = iVar.a;
            e.c.a.m.k kVar = iVar.x;
            List<n.a<?>> c2 = hVar.c();
            int size = c2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                } else if (c2.get(i4).a.equals(kVar)) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            w<ResourceType> wVar2 = wVar;
            if (iVar.f5688n.d(!z, aVar2, cVar)) {
                if (pVar2 == null) {
                    throw new g.d(wVar.get().getClass());
                }
                int ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    eVar2 = new e(iVar.x, iVar.f5683i);
                } else if (ordinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + cVar);
                } else {
                    eVar2 = new y(iVar.a.f5664c.f5458b, iVar.x, iVar.f5683i, iVar.f5686l, iVar.f5687m, qVar, cls, iVar.o);
                }
                v<Z> d2 = v.d(wVar);
                i.c<?> cVar2 = iVar.f5680f;
                cVar2.a = eVar2;
                cVar2.f5690b = pVar2;
                cVar2.f5691c = d2;
                wVar2 = d2;
            }
            return this.f5695c.a(wVar2, mVar);
        } catch (Throwable th) {
            this.f5696d.a(list);
            throw th;
        }
    }

    public final w<ResourceType> b(e.c.a.m.r.e<DataType> eVar, int i2, int i3, e.c.a.m.m mVar, List<Throwable> list) throws r {
        int size = this.f5694b.size();
        w<ResourceType> wVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            e.c.a.m.o<DataType, ResourceType> oVar = this.f5694b.get(i4);
            try {
                if (oVar.a(eVar.a(), mVar)) {
                    wVar = oVar.b(eVar.a(), i2, i3, mVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    String str = "Failed to decode data for " + oVar;
                }
                list.add(e2);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f5697e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("DecodePath{ dataClass=");
        y.append(this.a);
        y.append(", decoders=");
        y.append(this.f5694b);
        y.append(", transcoder=");
        y.append(this.f5695c);
        y.append('}');
        return y.toString();
    }
}

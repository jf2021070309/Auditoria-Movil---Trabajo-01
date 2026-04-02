package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.id.a;
import com.amazon.aps.iva.nc.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public final class u<Data, ResourceType, Transcode> {
    public final com.amazon.aps.iva.o3.d<List<Throwable>> a;
    public final List<? extends k<Data, ResourceType, Transcode>> b;
    public final String c;

    public u(Class cls, Class cls2, Class cls3, List list, a.c cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.b = list;
            this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w a(int i, int i2, com.amazon.aps.iva.kc.h hVar, com.bumptech.glide.load.data.a aVar, j.c cVar) throws r {
        com.amazon.aps.iva.o3.d<List<Throwable>> dVar = this.a;
        List<Throwable> b = dVar.b();
        defpackage.i.l(b);
        List<Throwable> list = b;
        try {
            List<? extends k<Data, ResourceType, Transcode>> list2 = this.b;
            int size = list2.size();
            w wVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    wVar = list2.get(i3).a(i, i2, hVar, aVar, cVar);
                } catch (r e) {
                    list.add(e);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new r(this.c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}

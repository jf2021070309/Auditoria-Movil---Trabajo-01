package com.amazon.aps.iva.i6;

import android.net.Uri;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.j6.e;
import com.amazon.aps.iva.j6.f;
import com.amazon.aps.iva.j6.g;
import com.amazon.aps.iva.m6.q;
import com.amazon.aps.iva.m6.t;
import com.amazon.aps.iva.m6.u;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.t5.c0;
import com.amazon.aps.iva.w5.i;
import com.amazon.aps.iva.x5.c;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: HlsDownloader.java */
/* loaded from: classes.dex */
public final class a extends u<f> {
    public a() {
        throw null;
    }

    public a(b0 b0Var, c.a aVar, Executor executor) {
        super(b0Var, new g(), aVar, executor);
    }

    public static void g(d dVar, d.c cVar, HashSet hashSet, ArrayList arrayList) {
        long j = dVar.h + cVar.f;
        String str = dVar.a;
        String str2 = cVar.h;
        if (str2 != null) {
            Uri d = c0.d(str, str2);
            if (hashSet.add(d)) {
                arrayList.add(new u.b(j, u.c(d)));
            }
        }
        arrayList.add(new u.b(j, new i(c0.d(str, cVar.b), cVar.j, cVar.k)));
    }

    @Override // com.amazon.aps.iva.m6.u
    public final ArrayList d(c cVar, q qVar, boolean z) throws IOException, InterruptedException {
        f fVar = (f) qVar;
        ArrayList arrayList = new ArrayList();
        if (fVar instanceof e) {
            List<Uri> list = ((e) fVar).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(u.c(list.get(i)));
            }
        } else {
            arrayList.add(u.c(Uri.parse(fVar.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            arrayList2.add(new u.b(0L, iVar));
            try {
                d dVar = (d) ((q) b(new t(this, cVar, iVar), z));
                ImmutableList immutableList = dVar.r;
                d.c cVar2 = null;
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    d.c cVar3 = (d.c) immutableList.get(i2);
                    d.c cVar4 = cVar3.c;
                    if (cVar4 != null && cVar4 != cVar2) {
                        g(dVar, cVar4, hashSet, arrayList2);
                        cVar2 = cVar4;
                    }
                    g(dVar, cVar3, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}

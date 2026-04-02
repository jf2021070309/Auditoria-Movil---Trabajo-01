package com.amazon.aps.iva.dw;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.g6.s;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.x5.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
/* compiled from: ExoPlayerLocalMediaSourceFactory.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class l implements k {
    public final f.a a;

    public l(c.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.dw.k
    public final v a(com.amazon.aps.iva.m6.m mVar) {
        final com.amazon.aps.iva.g6.b bVar;
        List<p0> emptyList;
        byte[] bArr = mVar.f;
        if (bArr != null) {
            HashMap hashMap = new HashMap();
            UUID uuid = com.amazon.aps.iva.q5.l.d;
            com.amazon.aps.iva.d90.a aVar = com.amazon.aps.iva.g6.p.d;
            com.amazon.aps.iva.t6.i iVar = new com.amazon.aps.iva.t6.i();
            bVar = new com.amazon.aps.iva.g6.b(uuid, aVar, new s(bArr), hashMap, false, new int[0], true, iVar, 300000L);
            bVar.l(1, bArr);
        } else {
            bVar = null;
        }
        int i = com.amazon.aps.iva.m6.f.n;
        b0.b bVar2 = new b0.b();
        String str = mVar.b;
        str.getClass();
        bVar2.a = str;
        bVar2.b = mVar.c;
        bVar2.g = mVar.g;
        bVar2.c = mVar.d;
        List<p0> list = mVar.e;
        if (list != null && !list.isEmpty()) {
            emptyList = Collections.unmodifiableList(new ArrayList(list));
        } else {
            emptyList = Collections.emptyList();
        }
        bVar2.f = emptyList;
        b0 a = bVar2.a();
        com.amazon.aps.iva.o6.m mVar2 = new com.amazon.aps.iva.o6.m(this.a, com.amazon.aps.iva.x6.s.a);
        if (bVar != null) {
            mVar2.g(new com.amazon.aps.iva.g6.g() { // from class: com.amazon.aps.iva.m6.d
                @Override // com.amazon.aps.iva.g6.g
                public final com.amazon.aps.iva.g6.f a(b0 b0Var) {
                    return bVar;
                }
            });
        }
        v d = mVar2.d(a);
        com.amazon.aps.iva.yb0.j.e(d, "createMediaSource(\n     …}\n            }\n        )");
        return d;
    }
}

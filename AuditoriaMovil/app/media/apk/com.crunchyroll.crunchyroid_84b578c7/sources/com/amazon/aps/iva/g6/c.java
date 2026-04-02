package com.amazon.aps.iva.g6;

import android.net.Uri;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.k;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes.dex */
public final class c implements g {
    public final Object a = new Object();
    public b0.e b;
    public b c;
    public f.a d;

    @Override // com.amazon.aps.iva.g6.g
    public final f a(b0 b0Var) {
        b bVar;
        b0Var.c.getClass();
        b0.e eVar = b0Var.c.d;
        if (eVar != null && g0.a >= 18) {
            synchronized (this.a) {
                if (!g0.a(eVar, this.b)) {
                    this.b = eVar;
                    this.c = b(eVar);
                }
                bVar = this.c;
                bVar.getClass();
            }
            return bVar;
        }
        return f.a;
    }

    public final b b(b0.e eVar) {
        String uri;
        byte[] bArr;
        f.a aVar = this.d;
        k.a aVar2 = aVar;
        if (aVar == null) {
            k.a aVar3 = new k.a();
            aVar3.b = null;
            aVar2 = aVar3;
        }
        Uri uri2 = eVar.c;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        q qVar = new q(uri, eVar.g, aVar2);
        UnmodifiableIterator<Map.Entry<String, String>> it = eVar.d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (qVar.d) {
                qVar.d.put(key, value);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = com.amazon.aps.iva.q5.l.a;
        com.amazon.aps.iva.t6.i iVar = new com.amazon.aps.iva.t6.i();
        UUID uuid2 = eVar.b;
        com.amazon.aps.iva.d90.a aVar4 = p.d;
        uuid2.getClass();
        boolean z = eVar.e;
        boolean z2 = eVar.f;
        int[] array = Ints.toArray(eVar.h);
        for (int i : array) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            com.amazon.aps.iva.cq.b.t(z3);
        }
        b bVar = new b(uuid2, aVar4, qVar, hashMap, z, (int[]) array.clone(), z2, iVar, 300000L);
        byte[] bArr2 = eVar.i;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        bVar.l(0, bArr);
        return bVar;
    }
}

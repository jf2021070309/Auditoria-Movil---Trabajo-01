package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.v4.k;
import com.amazon.aps.iva.v4.z;
import com.amazon.aps.iva.z3.m;
import com.amazon.aps.iva.z3.q;
import java.io.FileInputStream;
import java.util.logging.Logger;
/* compiled from: LayoutProtoSerializer.kt */
/* loaded from: classes.dex */
public final class k implements m<e> {
    public static final k a = new k();
    public static final e b;

    static {
        e o = e.o();
        com.amazon.aps.iva.yb0.j.e(o, "getDefaultInstance()");
        b = o;
    }

    @Override // com.amazon.aps.iva.z3.m
    public final Object a(FileInputStream fileInputStream) throws com.amazon.aps.iva.z3.a {
        try {
            return e.r(fileInputStream);
        } catch (z e) {
            throw new com.amazon.aps.iva.z3.a("Cannot read proto.", e);
        }
    }

    @Override // com.amazon.aps.iva.z3.m
    public final q b(Object obj, q.b bVar) {
        e eVar = (e) obj;
        eVar.getClass();
        int serializedSize = eVar.getSerializedSize();
        Logger logger = com.amazon.aps.iva.v4.k.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        k.d dVar = new k.d(bVar, serializedSize);
        eVar.b(dVar);
        if (dVar.f > 0) {
            dVar.W();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.z3.m
    public final e getDefaultValue() {
        return b;
    }
}

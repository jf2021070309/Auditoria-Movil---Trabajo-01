package com.amazon.aps.iva.f7;

import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.v;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: EventMessageDecoder.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.ab.a {
    public static a s(v vVar) {
        String o = vVar.o();
        o.getClass();
        String o2 = vVar.o();
        o2.getClass();
        return new a(o, o2, vVar.n(), vVar.n(), Arrays.copyOfRange(vVar.a, vVar.b, vVar.c));
    }

    @Override // com.amazon.aps.iva.ab.a
    public final f0 e(com.amazon.aps.iva.d7.b bVar, ByteBuffer byteBuffer) {
        return new f0(s(new v(byteBuffer.array(), byteBuffer.limit())));
    }
}

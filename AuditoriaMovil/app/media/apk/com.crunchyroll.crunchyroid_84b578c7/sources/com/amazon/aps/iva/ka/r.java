package com.amazon.aps.iva.ka;

import java.io.IOException;
/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public final class r implements l0<Integer> {
    public static final r a = new r();

    @Override // com.amazon.aps.iva.ka.l0
    public final Integer a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        return Integer.valueOf(Math.round(s.d(cVar) * f));
    }
}

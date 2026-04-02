package com.amazon.aps.iva.o6;

import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.o6.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: MediaPeriod.java */
/* loaded from: classes.dex */
public interface u extends i0 {

    /* compiled from: MediaPeriod.java */
    /* loaded from: classes.dex */
    public interface a extends i0.a<u> {
        void d(u uVar);
    }

    long b(long j, s1 s1Var);

    long e(long j);

    default List f(ArrayList arrayList) {
        return Collections.emptyList();
    }

    long h(com.amazon.aps.iva.s6.r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j);

    long j();

    void k(a aVar, long j);

    void n() throws IOException;

    o0 q();

    void t(long j, boolean z);
}

package com.amazon.aps.iva.o0;
/* compiled from: SnapshotLongState.kt */
/* loaded from: classes.dex */
public interface p1 extends p3, q1<Long> {
    default void i(long j) {
        w(j);
    }

    long m();

    @Override // com.amazon.aps.iva.o0.q1
    /* bridge */ /* synthetic */ default void setValue(Long l) {
        i(l.longValue());
    }

    void w(long j);

    @Override // com.amazon.aps.iva.o0.p3
    default Long getValue() {
        return Long.valueOf(m());
    }
}

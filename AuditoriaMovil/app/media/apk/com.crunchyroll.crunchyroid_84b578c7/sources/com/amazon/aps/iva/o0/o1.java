package com.amazon.aps.iva.o0;
/* compiled from: SnapshotIntState.kt */
/* loaded from: classes.dex */
public interface o1 extends p3, q1<Integer> {
    void e(int i);

    default void j(int i) {
        e(i);
    }

    @Override // com.amazon.aps.iva.o0.q1
    /* bridge */ /* synthetic */ default void setValue(Integer num) {
        j(num.intValue());
    }

    int t();

    @Override // com.amazon.aps.iva.o0.p3
    default Integer getValue() {
        return Integer.valueOf(t());
    }
}

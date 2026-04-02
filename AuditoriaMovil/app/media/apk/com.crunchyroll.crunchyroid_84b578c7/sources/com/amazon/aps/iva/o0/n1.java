package com.amazon.aps.iva.o0;
/* compiled from: SnapshotFloatState.kt */
/* loaded from: classes.dex */
public interface n1 extends p3, q1<Float> {
    float d();

    default void l(float f) {
        q(f);
    }

    void q(float f);

    @Override // com.amazon.aps.iva.o0.q1
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        l(f.floatValue());
    }

    @Override // com.amazon.aps.iva.o0.p3
    default Float getValue() {
        return Float.valueOf(d());
    }
}

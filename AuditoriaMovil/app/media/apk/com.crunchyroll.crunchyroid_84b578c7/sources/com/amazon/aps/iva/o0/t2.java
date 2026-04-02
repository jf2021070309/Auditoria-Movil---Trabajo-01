package com.amazon.aps.iva.o0;
/* compiled from: SnapshotMutationPolicy.kt */
/* loaded from: classes.dex */
public final class t2 implements h3<Object> {
    public static final t2 a = new t2();

    @Override // com.amazon.aps.iva.o0.h3
    public final boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}

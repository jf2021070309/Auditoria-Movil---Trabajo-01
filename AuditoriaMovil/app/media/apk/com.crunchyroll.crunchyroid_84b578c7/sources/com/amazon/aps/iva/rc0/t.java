package com.amazon.aps.iva.rc0;

import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes4.dex */
public final class t extends com.amazon.aps.iva.qd0.m {
    public final /* synthetic */ Set a;

    public t(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public static /* synthetic */ void t(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            if (i != 2) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i != 1 && i != 2) {
            objArr[2] = "addFakeOverride";
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void c(com.amazon.aps.iva.oc0.b bVar) {
        if (bVar != null) {
            com.amazon.aps.iva.qd0.n.r(bVar, null);
            this.a.add(bVar);
            return;
        }
        t(0);
        throw null;
    }

    @Override // com.amazon.aps.iva.qd0.m
    public final void s(com.amazon.aps.iva.oc0.b bVar, com.amazon.aps.iva.oc0.b bVar2) {
        if (bVar != null) {
            if (bVar2 != null) {
                return;
            }
            t(2);
            throw null;
        }
        t(1);
        throw null;
    }
}

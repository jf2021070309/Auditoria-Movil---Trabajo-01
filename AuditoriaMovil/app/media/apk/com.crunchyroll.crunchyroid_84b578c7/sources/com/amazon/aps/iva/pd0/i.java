package com.amazon.aps.iva.pd0;

import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes4.dex */
public enum i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<i> ALL;
    public static final Set<i> ALL_EXCEPT_ANNOTATIONS;
    public static final a Companion = new a();
    private final boolean includeByDefault;

    /* compiled from: DescriptorRenderer.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    static {
        int i;
        i[] values = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : values) {
            if (iVar.includeByDefault) {
                arrayList.add(iVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = x.c1(arrayList);
        ALL = com.amazon.aps.iva.lb0.o.d0(values());
    }

    i(boolean z) {
        this.includeByDefault = z;
    }
}

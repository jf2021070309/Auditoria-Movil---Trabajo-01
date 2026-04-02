package com.amazon.aps.iva.pd0;
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes4.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);
    
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    a(boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ a(boolean z, boolean z2, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}

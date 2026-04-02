package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ab.x;
/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes4.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String renderName;

    e(String str) {
        this.renderName = str == null ? x.n0(name()) : str;
    }

    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ e(String str, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? null : str);
    }
}

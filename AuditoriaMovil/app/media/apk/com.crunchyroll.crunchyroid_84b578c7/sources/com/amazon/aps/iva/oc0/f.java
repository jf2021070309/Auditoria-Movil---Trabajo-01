package com.amazon.aps.iva.oc0;
/* compiled from: ClassKind.kt */
/* loaded from: classes4.dex */
public enum f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    private final String codeRepresentation;

    f(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        if (this != OBJECT && this != ENUM_ENTRY) {
            return false;
        }
        return true;
    }
}

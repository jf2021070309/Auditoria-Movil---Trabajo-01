package com.amazon.aps.iva.ge0;
/* compiled from: ErrorEntity.kt */
/* loaded from: classes4.dex */
public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");
    
    private final String debugText;

    b(String str) {
        this.debugText = str;
    }

    public final String getDebugText() {
        return this.debugText;
    }
}

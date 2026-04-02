package com.amazon.aps.iva.xc0;
/* compiled from: ReportLevel.kt */
/* loaded from: classes4.dex */
public enum h0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a Companion = new a();
    private final String description;

    /* compiled from: ReportLevel.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    h0(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        if (this == IGNORE) {
            return true;
        }
        return false;
    }

    public final boolean isWarning() {
        if (this == WARN) {
            return true;
        }
        return false;
    }
}

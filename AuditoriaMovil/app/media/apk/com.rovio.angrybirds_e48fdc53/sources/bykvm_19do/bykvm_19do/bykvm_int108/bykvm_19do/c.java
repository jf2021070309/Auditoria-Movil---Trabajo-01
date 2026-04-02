package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do;

import com.facebook.internal.AnalyticsEvents;
/* loaded from: classes.dex */
public enum c {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    ALL("all");
    
    private String a;

    c(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}

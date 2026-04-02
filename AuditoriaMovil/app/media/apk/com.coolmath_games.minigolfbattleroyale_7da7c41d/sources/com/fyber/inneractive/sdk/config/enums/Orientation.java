package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum Orientation {
    LANDSCAPE("landscape", false),
    PORTRAIT("portrait", false),
    USER("user", true),
    NONE(IntegrityManager.INTEGRITY_TYPE_NONE, true);
    
    private static final Map<String, Orientation> CONSTANTS = new HashMap();
    public boolean allowOrientationChange;
    private final String value;

    static {
        Orientation[] values;
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    Orientation(String str, boolean z) {
        this.value = str;
        this.allowOrientationChange = z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public final String value() {
        return this.value;
    }

    public static Orientation fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}

package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum Track {
    ERRORS(ReportDBAdapter.ReportColumns.COLUMN_ERRORS),
    NETWORKING("networking"),
    VIEWABILITY("viewability");
    
    private static final Map<String, Track> CONSTANTS = new HashMap();
    private final String stringValue;

    static {
        Track[] values;
        for (Track track : values()) {
            CONSTANTS.put(track.stringValue, track);
        }
    }

    Track(String str) {
        this.stringValue = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }

    public final String value() {
        return this.stringValue;
    }

    public static Track fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }
}

package com.vungle.publisher;

import com.facebook.internal.NativeProtocol;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public enum rv {
    CLOSE("close"),
    EXPAND("expand") { // from class: com.vungle.publisher.rv.1
    },
    USE_CUSTOM_CLOSE("useCustomClose"),
    OPEN("open") { // from class: com.vungle.publisher.rv.2
    },
    RESIZE("resize") { // from class: com.vungle.publisher.rv.3
    },
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo") { // from class: com.vungle.publisher.rv.4
    },
    STORE_PICTURE("storePicture") { // from class: com.vungle.publisher.rv.5
    },
    CREATE_CALENDAR_EVENT("createCalendarEvent") { // from class: com.vungle.publisher.rv.6
    },
    PROPERTIES_SET("propertiesChangeCompleted"),
    SUCCESSFUL_VIEW_EVENT("successfulView"),
    TPAT_EVENT("tpat"),
    USER_ACTION_EVENT(NativeProtocol.WEB_DIALOG_ACTION),
    USER_VALUE_ACTION_EVENT("actionWithValue"),
    ERROR_EVENT("error"),
    PRIVACY_PAGE_EVENT("openPrivacy"),
    PLAY_HTML_VIDEO_EVENT("playHTML5Video"),
    USE_CUSTOM_PRIVACY("useCustomPrivacy"),
    THROW_INCENTIVIZED_DIALOG("throwIncentivizedDialog"),
    UNSPECIFIED("");
    
    private final String u;

    rv(String str) {
        this.u = str;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        public rv a(String str) {
            rv[] values;
            for (rv rvVar : rv.values()) {
                if (rvVar.u.equals(str)) {
                    return rvVar;
                }
            }
            return rv.UNSPECIFIED;
        }
    }
}

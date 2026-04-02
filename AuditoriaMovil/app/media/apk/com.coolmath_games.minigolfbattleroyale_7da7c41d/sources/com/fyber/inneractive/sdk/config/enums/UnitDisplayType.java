package com.fyber.inneractive.sdk.config.enums;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum UnitDisplayType {
    INTERSTITIAL(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE, false),
    LANDSCAPE("landscape", true),
    MRECT("mrect", false),
    BANNER("banner", false),
    REWARDED("rewarded", false),
    SQUARE(MessengerShareContentUtility.IMAGE_RATIO_SQUARE, true),
    VERTICAL("vertical", true),
    DEFAULT("default", false);
    
    private static final Map<String, UnitDisplayType> CONSTANTS = new HashMap();
    private final boolean deprecated;
    private String stringValue;

    static {
        UnitDisplayType[] values;
        for (UnitDisplayType unitDisplayType : values()) {
            CONSTANTS.put(unitDisplayType.stringValue, unitDisplayType);
        }
    }

    UnitDisplayType(String str, boolean z) {
        this.stringValue = str;
        this.deprecated = z;
    }

    public final String value() {
        return this.stringValue;
    }

    public static UnitDisplayType fromValue(String str) {
        UnitDisplayType unitDisplayType = CONSTANTS.get(str);
        return unitDisplayType != null ? unitDisplayType : DEFAULT;
    }

    public final boolean isFullscreenUnit() {
        return this == INTERSTITIAL || this == REWARDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }

    public final boolean isDeprecated() {
        return this.deprecated;
    }
}

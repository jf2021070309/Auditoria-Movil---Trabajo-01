package com.fyber.inneractive.sdk.config.a;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class j implements d {
    public static final String a = j.class.getSimpleName();
    private String b;
    private boolean c;

    public j(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    @Override // com.fyber.inneractive.sdk.config.a.d
    public final boolean a(e eVar) {
        boolean z;
        if (!TextUtils.isEmpty(this.b)) {
            String version = InneractiveAdManager.getVersion();
            IAlog.b("%s: shouldApply - running version: %s", a, version);
            IAlog.b("%s: shouldApply - filter version: %s", a, this.b);
            String[] split = version.split("\\.", 4);
            String[] split2 = this.b.split("\\.", 4);
            String str = split2[split2.length - 1];
            if (!str.equals("*")) {
                if (str.equals("+")) {
                    boolean a2 = a(split, split2);
                    IAlog.b("%s: shouldApply - + version match: %b", a, Boolean.valueOf(!a2));
                    if (a2) {
                        return this.c;
                    }
                    return !this.c;
                }
                boolean z2 = !this.b.equalsIgnoreCase(version);
                IAlog.b("%s: shouldApply - exact version match: %b", a, Boolean.valueOf(!z2));
                if (z2) {
                    return this.c;
                }
                if (!this.c) {
                    return true;
                }
            } else {
                for (int i = 0; i < split2.length - 1; i++) {
                    if (split.length < i) {
                        IAlog.b("%s: shouldApplyByAsterix - running version is shorter than filter. applying", a);
                    } else if (!split[i].equals(split2[i])) {
                        IAlog.b("%s: shouldApplyByAsterix - running version does not comply with filter. applying", a);
                    }
                    z = true;
                }
                IAlog.b("%s: shouldApplyByAsterix - version aligned with filter. do not apply", a);
                z = false;
                IAlog.b("%s: shouldApply - * version match: %b", a, Boolean.valueOf(!z));
                if (z) {
                    return this.c;
                }
                return !this.c;
            }
        }
        return false;
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr2.length - 1; i++) {
            if (strArr.length < i) {
                IAlog.b("%s: shouldApplyByPlus - running version is shorter than filter. applying", a);
                return true;
            }
            try {
                int intValue = Integer.valueOf(strArr2[i]).intValue();
                int intValue2 = Integer.valueOf(strArr[i]).intValue();
                if (intValue2 > intValue) {
                    IAlog.b("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", a);
                    return false;
                } else if (intValue2 < intValue) {
                    IAlog.b("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", a);
                    return true;
                }
            } catch (NumberFormatException e) {
                IAlog.b("%s: shouldApplyByPlus - Error in version string! Not a number. %s", a, e.getMessage());
                return true;
            }
        }
        IAlog.b("%s: shouldApplyByAsterix - version aligned with filter. do not apply", a);
        return false;
    }

    public String toString() {
        return String.format("%s - %s include: %b", ServerProtocol.DIALOG_PARAM_SDK_VERSION, this.b, Boolean.valueOf(this.c));
    }
}

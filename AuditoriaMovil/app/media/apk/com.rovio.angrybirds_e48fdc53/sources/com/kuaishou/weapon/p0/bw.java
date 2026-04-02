package com.kuaishou.weapon.p0;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
/* loaded from: classes.dex */
public class bw {
    private static String a;
    private static String b;

    static {
        a = "Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n";
        b = "Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n";
        a = c.b("Y29tLmt3YWkud2VhcG9uLmNvbmp1cmU=\n", 2);
        b = c.b(b, 2);
    }

    public static String a(Context context) {
        String str = TextUtils.isEmpty(d(context)) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        String c = c(context);
        if (TextUtils.isEmpty(c)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO + str;
        }
        String str2 = "1" + str;
        b(context, c);
        return str2;
    }

    public static void a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(context.getApplicationContext())) {
                Settings.System.putString(context.getContentResolver(), a, str);
            }
        } catch (Exception e) {
        }
    }

    public static String b(Context context) {
        String c = c(context);
        String d = d(context);
        if (TextUtils.isEmpty(c) || !TextUtils.equals(c, d)) {
            if (!TextUtils.isEmpty(c)) {
                b(context, c);
                return c;
            } else if (TextUtils.isEmpty(d)) {
                return "";
            } else {
                a(context, d);
                return d;
            }
        }
        return c;
    }

    public static void b(Context context, String str) {
        de.a(context).d(str);
    }

    public static String c(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), a);
        } catch (Exception e) {
            return "";
        }
    }

    public static String d(Context context) {
        try {
            return de.a(context).e();
        } catch (Exception e) {
            return "";
        }
    }
}

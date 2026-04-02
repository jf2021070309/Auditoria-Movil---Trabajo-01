package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes4.dex */
public class PrefsUtil {
    private SharedPreferences a;
    private SharedPreferences.Editor b;
    private SharedPreferences c;
    private SharedPreferences.Editor d;

    private PrefsUtil() {
    }

    /* loaded from: classes4.dex */
    private static class a {
        public static final PrefsUtil a = new PrefsUtil();

        private a() {
        }
    }

    public static PrefsUtil getInstance() {
        return a.a;
    }

    public void saveFeedbackTokenToPrefs(Context context, String str) {
        if (context != null) {
            this.a = context.getSharedPreferences(Util.PREFS_FEEDBACK_TOKEN, 0);
            if (this.a != null) {
                this.b = this.a.edit();
                this.b.putString(Util.PREFS_KEY_FEEDBACK_TOKEN, str);
                this.b.apply();
            }
        }
    }

    public String getFeedbackTokenFromPrefs(Context context) {
        if (context == null) {
            return null;
        }
        this.a = context.getSharedPreferences(Util.PREFS_FEEDBACK_TOKEN, 0);
        if (this.a != null) {
            return this.a.getString(Util.PREFS_KEY_FEEDBACK_TOKEN, null);
        }
        return null;
    }

    public void saveNameEmailSubjectToPrefs(Context context, String str, String str2, String str3) {
        if (context != null) {
            this.c = context.getSharedPreferences(Util.PREFS_NAME_EMAIL_SUBJECT, 0);
            if (this.c != null) {
                this.d = this.c.edit();
                if (str == null || str2 == null || str3 == null) {
                    this.d.putString(Util.PREFS_KEY_NAME_EMAIL_SUBJECT, null);
                } else {
                    this.d.putString(Util.PREFS_KEY_NAME_EMAIL_SUBJECT, String.format("%s|%s|%s", str, str2, str3));
                }
                this.d.apply();
            }
        }
    }

    public String getNameEmailFromPrefs(Context context) {
        if (context == null) {
            return null;
        }
        this.c = context.getSharedPreferences(Util.PREFS_NAME_EMAIL_SUBJECT, 0);
        if (this.c != null) {
            return this.c.getString(Util.PREFS_KEY_NAME_EMAIL_SUBJECT, null);
        }
        return null;
    }
}

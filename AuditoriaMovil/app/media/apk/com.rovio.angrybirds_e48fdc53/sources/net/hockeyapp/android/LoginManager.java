package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import net.hockeyapp.android.tasks.LoginTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class LoginManager {
    public static final int LOGIN_MODE_ANONYMOUS = 0;
    public static final int LOGIN_MODE_EMAIL_ONLY = 1;
    public static final int LOGIN_MODE_EMAIL_PASSWORD = 2;
    public static final int LOGIN_MODE_VALIDATE = 3;
    static Class<?> a;
    static LoginManagerListener b;
    private static String c = null;
    private static String d = null;
    private static Handler e = null;
    private static String f = null;
    private static int g;

    public static void register(Context context, String str, int i) {
        register(context, Util.getAppIdentifier(context), str, i, (Class<?>) null);
    }

    public static void register(Context context, String str, int i, LoginManagerListener loginManagerListener) {
        register(context, Util.getAppIdentifier(context), str, i, loginManagerListener);
    }

    public static void register(Context context, String str, String str2, int i, LoginManagerListener loginManagerListener) {
        b = loginManagerListener;
        register(context, str, str2, i, (Class<?>) null);
    }

    public static void register(Context context, String str, String str2, int i, Class<?> cls) {
        register(context, str, str2, Constants.BASE_URL, i, cls);
    }

    public static void register(Context context, String str, String str2, String str3, int i, Class<?> cls) {
        if (context != null) {
            c = Util.sanitizeAppIdentifier(str);
            d = str2;
            f = str3;
            g = i;
            a = cls;
            if (e == null) {
                e = new a(context);
            }
            Constants.loadFromContext(context);
        }
    }

    public static void verifyLogin(Activity activity, Intent intent) {
        boolean z = true;
        if (intent != null && intent.getBooleanExtra("net.hockeyapp.android.EXIT", false)) {
            activity.finish();
        } else if (activity != null && g != 0) {
            SharedPreferences sharedPreferences = activity.getSharedPreferences("net.hockeyapp.android.login", 0);
            if (sharedPreferences.getInt(LoginActivity.EXTRA_MODE, -1) != g) {
                HockeyLog.verbose("HockeyAuth", "Mode has changed, require re-auth.");
                sharedPreferences.edit().remove("auid").remove("iuid").putInt(LoginActivity.EXTRA_MODE, g).apply();
            }
            String string = sharedPreferences.getString("auid", null);
            String string2 = sharedPreferences.getString("iuid", null);
            boolean z2 = string == null && string2 == null;
            boolean z3 = string == null && (g == 2 || g == 3);
            if (string2 != null || g != 1) {
                z = false;
            }
            if (z2 || z3 || z) {
                HockeyLog.verbose("HockeyAuth", "Not authenticated or correct ID missing, re-authenticate.");
                b(activity);
            } else if (g == 3) {
                HockeyLog.verbose("HockeyAuth", "LOGIN_MODE_VALIDATE, Validate the user's info!");
                HashMap hashMap = new HashMap();
                if (string != null) {
                    hashMap.put("type", "auid");
                    hashMap.put("id", string);
                } else if (string2 != null) {
                    hashMap.put("type", "iuid");
                    hashMap.put("id", string2);
                }
                LoginTask loginTask = new LoginTask(activity, e, a(3), 3, hashMap);
                loginTask.setShowProgressDialog(false);
                AsyncTaskUtils.execute(loginTask);
            }
        }
    }

    public static String getLoginEmail(Context context) {
        return context.getSharedPreferences("net.hockeyapp.android.login", 0).getString("email", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        Intent intent = new Intent();
        int i = Boolean.valueOf(g == 3).booleanValue() ? 2 : g;
        intent.setFlags(335544320);
        intent.setClass(context, LoginActivity.class);
        intent.putExtra("url", a(i));
        intent.putExtra(LoginActivity.EXTRA_MODE, i);
        intent.putExtra("secret", d);
        context.startActivity(intent);
    }

    private static String a(int i) {
        String str = "";
        if (i == 2) {
            str = "authorize";
        } else if (i == 1) {
            str = "check";
        } else if (i == 3) {
            str = "validate";
        }
        return f + "api/3/apps/" + c + "/identity/" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        private final WeakReference<Context> a;

        public a(Context context) {
            this.a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = message.getData().getBoolean("success");
            Context context = this.a.get();
            if (context != null) {
                if (!z) {
                    LoginManager.b(context);
                } else {
                    HockeyLog.verbose("HockeyAuth", "We authenticated or verified successfully");
                }
            }
        }
    }
}

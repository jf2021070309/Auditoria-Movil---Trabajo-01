package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import net.hockeyapp.android.objects.CrashDetails;
import net.hockeyapp.android.objects.CrashManagerUserInput;
import net.hockeyapp.android.objects.CrashMetaData;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.HttpURLConnectionBuilder;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class CrashManager {
    private static long d;
    private static String a = null;
    private static String b = null;
    private static boolean c = false;
    private static boolean e = false;

    public static void register(Context context) {
        register(context, Util.getAppIdentifier(context));
    }

    public static void register(Context context, CrashManagerListener crashManagerListener) {
        register(context, Util.getAppIdentifier(context), crashManagerListener);
    }

    public static void register(Context context, String str) {
        register(context, Constants.BASE_URL, str, null);
    }

    public static void register(Context context, String str, CrashManagerListener crashManagerListener) {
        register(context, Constants.BASE_URL, str, crashManagerListener);
    }

    public static void register(Context context, String str, String str2, CrashManagerListener crashManagerListener) {
        a(context, str, str2, crashManagerListener, false);
        execute(context, crashManagerListener);
    }

    public static void initialize(Context context, String str, CrashManagerListener crashManagerListener) {
        a(context, Constants.BASE_URL, str, crashManagerListener, true);
    }

    public static void initialize(Context context, String str, String str2, CrashManagerListener crashManagerListener) {
        a(context, str, str2, crashManagerListener, true);
    }

    public static void execute(Context context, CrashManagerListener crashManagerListener) {
        Boolean valueOf = Boolean.valueOf(crashManagerListener != null && crashManagerListener.ignoreDefaultHandler());
        WeakReference weakReference = new WeakReference(context);
        int hasStackTraces = hasStackTraces(weakReference);
        if (hasStackTraces == 1) {
            e = true;
            Boolean valueOf2 = Boolean.valueOf(Boolean.valueOf(context instanceof Activity ? false : true).booleanValue() | PreferenceManager.getDefaultSharedPreferences(context).getBoolean("always_send_crash_reports", false));
            if (crashManagerListener != null) {
                valueOf2 = Boolean.valueOf(Boolean.valueOf(valueOf2.booleanValue() | crashManagerListener.shouldAutoUploadCrashes()).booleanValue() | crashManagerListener.onCrashesFound());
                crashManagerListener.onNewCrashesFound();
            }
            if (!valueOf2.booleanValue()) {
                a(weakReference, crashManagerListener, valueOf.booleanValue());
            } else {
                b(weakReference, crashManagerListener, valueOf.booleanValue());
            }
        } else if (hasStackTraces == 2) {
            if (crashManagerListener != null) {
                crashManagerListener.onConfirmedCrashesFound();
            }
            b(weakReference, crashManagerListener, valueOf.booleanValue());
        } else {
            c(weakReference, crashManagerListener, valueOf.booleanValue());
        }
    }

    public static int hasStackTraces(WeakReference<Context> weakReference) {
        List<String> list;
        String[] b2 = b();
        if (b2 == null || b2.length <= 0) {
            return 0;
        }
        try {
            list = b(weakReference);
        } catch (Exception e2) {
            list = null;
        }
        if (list != null) {
            for (String str : b2) {
                if (!list.contains(str)) {
                    return 1;
                }
            }
            return 2;
        }
        return 1;
    }

    public static boolean didCrashInLastSession() {
        return e;
    }

    public static CrashDetails getLastCrashDetails() {
        if (Constants.FILES_PATH == null || !didCrashInLastSession()) {
            return null;
        }
        File[] listFiles = new File(Constants.FILES_PATH + "/").listFiles(new FilenameFilter() { // from class: net.hockeyapp.android.CrashManager.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".stacktrace");
            }
        });
        long j = 0;
        int length = listFiles.length;
        int i = 0;
        File file = null;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.lastModified() > j) {
                j = file2.lastModified();
            } else {
                file2 = file;
            }
            i++;
            file = file2;
        }
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            return CrashDetails.fromFile(file);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void submitStackTraces(WeakReference<Context> weakReference, CrashManagerListener crashManagerListener) {
        submitStackTraces(weakReference, crashManagerListener, null);
    }

    public static void submitStackTraces(WeakReference<Context> weakReference, CrashManagerListener crashManagerListener, CrashMetaData crashMetaData) {
        String str;
        String[] b2 = b();
        Boolean bool = false;
        if (b2 == null || b2.length <= 0) {
            return;
        }
        HockeyLog.debug("Found " + b2.length + " stacktrace(s).");
        for (int i = 0; i < b2.length; i++) {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    String str2 = b2[i];
                    String b3 = b(weakReference, str2);
                    if (b3.length() > 0) {
                        HockeyLog.debug("Transmitting crash data: \n" + b3);
                        String b4 = b(weakReference, str2.replace(".stacktrace", ".user"));
                        String b5 = b(weakReference, str2.replace(".stacktrace", ".contact"));
                        if (crashMetaData != null) {
                            str = crashMetaData.getUserID();
                            if (TextUtils.isEmpty(str)) {
                                str = b4;
                            }
                            String userEmail = crashMetaData.getUserEmail();
                            if (!TextUtils.isEmpty(userEmail)) {
                                b5 = userEmail;
                            }
                        } else {
                            str = b4;
                        }
                        String b6 = b(weakReference, str2.replace(".stacktrace", ".description"));
                        String userDescription = crashMetaData != null ? crashMetaData.getUserDescription() : "";
                        if (!TextUtils.isEmpty(b6)) {
                            userDescription = !TextUtils.isEmpty(userDescription) ? String.format("%s\n\nLog:\n%s", userDescription, b6) : String.format("Log:\n%s", b6);
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("raw", b3);
                        hashMap.put("userID", str);
                        hashMap.put("contact", b5);
                        hashMap.put("description", userDescription);
                        hashMap.put("sdk", Constants.SDK_NAME);
                        hashMap.put("sdk_version", "4.1.5");
                        httpURLConnection = new HttpURLConnectionBuilder(a()).setRequestMethod("POST").writeFormFields(hashMap).build();
                        int responseCode = httpURLConnection.getResponseCode();
                        bool = Boolean.valueOf(responseCode == 202 || responseCode == 201);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (bool.booleanValue()) {
                        HockeyLog.debug("Transmission succeeded");
                        a(weakReference, b2[i]);
                        if (crashManagerListener != null) {
                            crashManagerListener.onCrashesSent();
                            b(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                        }
                    } else {
                        HockeyLog.debug("Transmission failed, will retry on next register() call");
                        if (crashManagerListener != null) {
                            crashManagerListener.onCrashesNotSent();
                            a(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    if (bool.booleanValue()) {
                        HockeyLog.debug("Transmission succeeded");
                        a(weakReference, b2[i]);
                        if (crashManagerListener != null) {
                            crashManagerListener.onCrashesSent();
                            b(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                        }
                    } else {
                        HockeyLog.debug("Transmission failed, will retry on next register() call");
                        if (crashManagerListener != null) {
                            crashManagerListener.onCrashesNotSent();
                            a(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                        }
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                if (bool.booleanValue()) {
                    HockeyLog.debug("Transmission succeeded");
                    a(weakReference, b2[i]);
                    if (crashManagerListener != null) {
                        crashManagerListener.onCrashesSent();
                        b(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                    }
                } else {
                    HockeyLog.debug("Transmission failed, will retry on next register() call");
                    if (crashManagerListener != null) {
                        crashManagerListener.onCrashesNotSent();
                        a(weakReference, b2[i], crashManagerListener.getMaxRetryAttempts());
                    }
                }
                throw th;
            }
        }
    }

    public static void deleteStackTraces(WeakReference<Context> weakReference) {
        String[] b2 = b();
        if (b2 != null && b2.length > 0) {
            HockeyLog.debug("Found " + b2.length + " stacktrace(s).");
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < b2.length) {
                    if (weakReference != null) {
                        try {
                            HockeyLog.debug("Delete stacktrace " + b2[i2] + ".");
                            a(weakReference, b2[i2]);
                            Context context = weakReference.get();
                            if (context != null) {
                                context.deleteFile(b2[i2]);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public static boolean handleUserInput(CrashManagerUserInput crashManagerUserInput, CrashMetaData crashMetaData, CrashManagerListener crashManagerListener, WeakReference<Context> weakReference, boolean z) {
        switch (crashManagerUserInput) {
            case CrashManagerUserInputDontSend:
                if (crashManagerListener != null) {
                    crashManagerListener.onUserDeniedCrashes();
                }
                deleteStackTraces(weakReference);
                c(weakReference, crashManagerListener, z);
                return true;
            case CrashManagerUserInputAlwaysSend:
                Context context = null;
                if (weakReference != null) {
                    context = weakReference.get();
                }
                if (context == null) {
                    return false;
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("always_send_crash_reports", true).apply();
                a(weakReference, crashManagerListener, z, crashMetaData);
                return true;
            case CrashManagerUserInputSend:
                a(weakReference, crashManagerListener, z, crashMetaData);
                return true;
            default:
                return false;
        }
    }

    public static void resetAlwaysSend(WeakReference<Context> weakReference) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove("always_send_crash_reports").apply();
        }
    }

    private static void a(Context context, String str, String str2, CrashManagerListener crashManagerListener, boolean z) {
        boolean z2 = false;
        if (context != null) {
            if (d == 0) {
                d = System.currentTimeMillis();
            }
            b = str;
            a = Util.sanitizeAppIdentifier(str2);
            e = false;
            Constants.loadFromContext(context);
            if (a == null) {
                a = Constants.APP_PACKAGE;
            }
            if (z) {
                if (crashManagerListener != null && crashManagerListener.ignoreDefaultHandler()) {
                    z2 = true;
                }
                c(new WeakReference(context), crashManagerListener, Boolean.valueOf(z2).booleanValue());
            }
        }
    }

    private static void a(final WeakReference<Context> weakReference, final CrashManagerListener crashManagerListener, final boolean z) {
        Context context = null;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (context != null) {
            if (crashManagerListener == null || !crashManagerListener.onHandleAlertView()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(a(context));
                builder.setMessage(R.string.hockeyapp_crash_dialog_message);
                builder.setNegativeButton(R.string.hockeyapp_crash_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.CrashManager.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CrashManager.handleUserInput(CrashManagerUserInput.CrashManagerUserInputDontSend, null, CrashManagerListener.this, weakReference, z);
                    }
                });
                builder.setNeutralButton(R.string.hockeyapp_crash_dialog_neutral_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.CrashManager.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CrashManager.handleUserInput(CrashManagerUserInput.CrashManagerUserInputAlwaysSend, null, CrashManagerListener.this, weakReference, z);
                    }
                });
                builder.setPositiveButton(R.string.hockeyapp_crash_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: net.hockeyapp.android.CrashManager.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CrashManager.handleUserInput(CrashManagerUserInput.CrashManagerUserInputSend, null, CrashManagerListener.this, weakReference, z);
                    }
                });
                builder.create().show();
            }
        }
    }

    private static String a(Context context) {
        return String.format(context.getString(R.string.hockeyapp_crash_dialog_title), Util.getAppName(context));
    }

    private static void b(WeakReference<Context> weakReference, CrashManagerListener crashManagerListener, boolean z) {
        a(weakReference, crashManagerListener, z, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [net.hockeyapp.android.CrashManager$5] */
    private static void a(final WeakReference<Context> weakReference, final CrashManagerListener crashManagerListener, boolean z, final CrashMetaData crashMetaData) {
        a(weakReference);
        c(weakReference, crashManagerListener, z);
        Context context = weakReference.get();
        if (context != null && !Util.isConnectedToNetwork(context)) {
            if (crashManagerListener != null) {
                crashManagerListener.onCrashesNotSent();
            }
        } else if (!c) {
            c = true;
            new Thread() { // from class: net.hockeyapp.android.CrashManager.5
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    CrashManager.submitStackTraces(weakReference, crashManagerListener, crashMetaData);
                    boolean unused = CrashManager.c = false;
                }
            }.start();
        }
    }

    private static void c(WeakReference<Context> weakReference, CrashManagerListener crashManagerListener, boolean z) {
        if (!TextUtils.isEmpty(Constants.APP_VERSION) && !TextUtils.isEmpty(Constants.APP_PACKAGE)) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                HockeyLog.debug("Current handler class = " + defaultUncaughtExceptionHandler.getClass().getName());
            }
            if (defaultUncaughtExceptionHandler instanceof ExceptionHandler) {
                ((ExceptionHandler) defaultUncaughtExceptionHandler).setListener(crashManagerListener);
                return;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(defaultUncaughtExceptionHandler, crashManagerListener, z));
                return;
            }
        }
        HockeyLog.debug("Exception handler not set because version or package is null.");
    }

    private static String a() {
        return b + "api/2/apps/" + a + "/crashes/";
    }

    private static void a(WeakReference<Context> weakReference, String str, int i) {
        Context context;
        if (i != -1 && weakReference != null && (context = weakReference.get()) != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SDK_NAME, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            int i2 = sharedPreferences.getInt("RETRY_COUNT: " + str, 0);
            if (i2 >= i) {
                a(weakReference, str);
                b(weakReference, str, i);
                return;
            }
            edit.putInt("RETRY_COUNT: " + str, i2 + 1);
            edit.apply();
        }
    }

    private static void b(WeakReference<Context> weakReference, String str, int i) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SDK_NAME, 0).edit();
            edit.remove("RETRY_COUNT: " + str);
            edit.apply();
        }
    }

    private static void a(WeakReference<Context> weakReference, String str) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            context.deleteFile(str);
            context.deleteFile(str.replace(".stacktrace", ".user"));
            context.deleteFile(str.replace(".stacktrace", ".contact"));
            context.deleteFile(str.replace(".stacktrace", ".description"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.lang.ref.WeakReference<android.content.Context> r5, java.lang.String r6) {
        /*
            r1 = 0
            if (r5 == 0) goto L5a
            java.lang.Object r0 = r5.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L52 java.io.FileNotFoundException -> L64
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L52 java.io.FileNotFoundException -> L64
            java.io.FileInputStream r0 = r0.openFileInput(r6)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L52 java.io.FileNotFoundException -> L64
            r4.<init>(r0)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L52 java.io.FileNotFoundException -> L64
            r2.<init>(r4)     // Catch: java.io.IOException -> L45 java.lang.Throwable -> L52 java.io.FileNotFoundException -> L64
        L1e:
            java.lang.String r0 = r2.readLine()     // Catch: java.io.FileNotFoundException -> L31 java.lang.Throwable -> L60 java.io.IOException -> L62
            if (r0 == 0) goto L3d
            r3.append(r0)     // Catch: java.io.FileNotFoundException -> L31 java.lang.Throwable -> L60 java.io.IOException -> L62
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.io.FileNotFoundException -> L31 java.lang.Throwable -> L60 java.io.IOException -> L62
            r3.append(r0)     // Catch: java.io.FileNotFoundException -> L31 java.lang.Throwable -> L60 java.io.IOException -> L62
            goto L1e
        L31:
            r0 = move-exception
            r1 = r2
        L33:
            if (r1 == 0) goto L38
            r1.close()     // Catch: java.io.IOException -> L5c
        L38:
            java.lang.String r0 = r3.toString()
        L3c:
            return r0
        L3d:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.io.IOException -> L43
            goto L38
        L43:
            r0 = move-exception
            goto L38
        L45:
            r0 = move-exception
            r2 = r1
        L47:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.io.IOException -> L50
            goto L38
        L50:
            r0 = move-exception
            goto L38
        L52:
            r0 = move-exception
            r2 = r1
        L54:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.io.IOException -> L5e
        L59:
            throw r0
        L5a:
            r0 = r1
            goto L3c
        L5c:
            r0 = move-exception
            goto L38
        L5e:
            r1 = move-exception
            goto L59
        L60:
            r0 = move-exception
            goto L54
        L62:
            r0 = move-exception
            goto L47
        L64:
            r0 = move-exception
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: net.hockeyapp.android.CrashManager.b(java.lang.ref.WeakReference, java.lang.String):java.lang.String");
    }

    private static void a(WeakReference<Context> weakReference) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            try {
                String[] b2 = b();
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SDK_NAME, 0).edit();
                edit.putString("ConfirmedFilenames", a(b2, "|"));
                edit.apply();
            } catch (Exception e2) {
            }
        }
    }

    private static String a(String[] strArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i]);
            if (i < strArr.length - 1) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    private static String[] b() {
        if (Constants.FILES_PATH != null) {
            HockeyLog.debug("Looking for exceptions in: " + Constants.FILES_PATH);
            File file = new File(Constants.FILES_PATH + "/");
            if (!file.mkdir() && !file.exists()) {
                return new String[0];
            }
            return file.list(new FilenameFilter() { // from class: net.hockeyapp.android.CrashManager.6
                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return str.endsWith(".stacktrace");
                }
            });
        }
        HockeyLog.debug("Can't search for exception as file path is null.");
        return null;
    }

    private static List<String> b(WeakReference<Context> weakReference) {
        Context context;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return null;
        }
        return Arrays.asList(context.getSharedPreferences(Constants.SDK_NAME, 0).getString("ConfirmedFilenames", "").split("\\|"));
    }

    public static long getInitializeTimestamp() {
        return d;
    }
}

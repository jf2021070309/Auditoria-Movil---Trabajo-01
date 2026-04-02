package net.hockeyapp.android;

import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.Date;
import java.util.UUID;
import net.hockeyapp.android.objects.CrashDetails;
import net.hockeyapp.android.utils.HockeyLog;
/* loaded from: classes4.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private boolean a;
    private CrashManagerListener b;
    private Thread.UncaughtExceptionHandler c;

    public ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashManagerListener crashManagerListener, boolean z) {
        this.a = false;
        this.c = uncaughtExceptionHandler;
        this.a = z;
        this.b = crashManagerListener;
    }

    public void setListener(CrashManagerListener crashManagerListener) {
        this.b = crashManagerListener;
    }

    @Deprecated
    public static void saveException(Throwable th, CrashManagerListener crashManagerListener) {
        saveException(th, null, crashManagerListener);
    }

    public static void saveException(Throwable th, Thread thread, CrashManagerListener crashManagerListener) {
        Date date = new Date();
        Date date2 = new Date(CrashManager.getInitializeTimestamp());
        th.printStackTrace(new PrintWriter(new StringWriter()));
        String uuid = UUID.randomUUID().toString();
        CrashDetails crashDetails = new CrashDetails(uuid, th);
        crashDetails.setAppPackage(Constants.APP_PACKAGE);
        crashDetails.setAppVersionCode(Constants.APP_VERSION);
        crashDetails.setAppVersionName(Constants.APP_VERSION_NAME);
        crashDetails.setAppStartDate(date2);
        crashDetails.setAppCrashDate(date);
        if (crashManagerListener == null || crashManagerListener.includeDeviceData()) {
            crashDetails.setOsVersion(Constants.ANDROID_VERSION);
            crashDetails.setOsBuild(Constants.ANDROID_BUILD);
            crashDetails.setDeviceManufacturer(Constants.PHONE_MANUFACTURER);
            crashDetails.setDeviceModel(Constants.PHONE_MODEL);
        }
        if (thread != null && (crashManagerListener == null || crashManagerListener.includeThreadDetails())) {
            crashDetails.setThreadName(thread.getName() + "-" + thread.getId());
        }
        if (Constants.CRASH_IDENTIFIER != null && (crashManagerListener == null || crashManagerListener.includeDeviceIdentifier())) {
            crashDetails.setReporterKey(Constants.CRASH_IDENTIFIER);
        }
        crashDetails.writeCrashReport();
        if (crashManagerListener != null) {
            try {
                a(a(crashManagerListener.getUserID()), uuid + ".user");
                a(a(crashManagerListener.getContact()), uuid + ".contact");
                a(crashManagerListener.getDescription(), uuid + ".description");
            } catch (IOException e) {
                HockeyLog.error("Error saving crash meta data!", e);
            }
        }
    }

    public static void saveNativeException(Throwable th, String str, Thread thread, CrashManagerListener crashManagerListener) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("--- End of managed exception stack trace ---", 2)) != null && split.length > 0) {
            str = split[0];
        }
        a(th, thread, str, false, crashManagerListener);
    }

    public static void saveManagedException(Throwable th, Thread thread, CrashManagerListener crashManagerListener) {
        a(th, thread, null, true, crashManagerListener);
    }

    private static void a(Throwable th, Thread thread, String str, Boolean bool, CrashManagerListener crashManagerListener) {
        Date date = new Date(CrashManager.getInitializeTimestamp());
        String uuid = UUID.randomUUID().toString();
        Date date2 = new Date();
        PrintWriter printWriter = new PrintWriter(new StringWriter());
        if (th != null) {
            th.printStackTrace(printWriter);
        }
        CrashDetails crashDetails = new CrashDetails(uuid, th, str, bool);
        crashDetails.setAppPackage(Constants.APP_PACKAGE);
        crashDetails.setAppVersionCode(Constants.APP_VERSION);
        crashDetails.setAppVersionName(Constants.APP_VERSION_NAME);
        crashDetails.setAppStartDate(date);
        crashDetails.setAppCrashDate(date2);
        if (crashManagerListener == null || crashManagerListener.includeDeviceData()) {
            crashDetails.setOsVersion(Constants.ANDROID_VERSION);
            crashDetails.setOsBuild(Constants.ANDROID_BUILD);
            crashDetails.setDeviceManufacturer(Constants.PHONE_MANUFACTURER);
            crashDetails.setDeviceModel(Constants.PHONE_MODEL);
        }
        if (thread != null && (crashManagerListener == null || crashManagerListener.includeThreadDetails())) {
            crashDetails.setThreadName(thread.getName() + "-" + thread.getId());
        }
        if (Constants.CRASH_IDENTIFIER != null && (crashManagerListener == null || crashManagerListener.includeDeviceIdentifier())) {
            crashDetails.setReporterKey(Constants.CRASH_IDENTIFIER);
        }
        crashDetails.writeCrashReport();
        if (crashManagerListener != null) {
            try {
                a(a(crashManagerListener.getUserID()), uuid + ".user");
                a(a(crashManagerListener.getContact()), uuid + ".contact");
                a(crashManagerListener.getDescription(), uuid + ".description");
            } catch (IOException e) {
                HockeyLog.error("Error saving crash meta data!", e);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (Constants.FILES_PATH == null) {
            this.c.uncaughtException(thread, th);
            return;
        }
        saveException(th, thread, this.b);
        if (!this.a) {
            this.c.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    private static void a(String str, String str2) {
        BufferedWriter bufferedWriter;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String str3 = Constants.FILES_PATH + "/" + str2;
            if (!TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0) {
                bufferedWriter = new BufferedWriter(new FileWriter(str3));
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.flush();
                    bufferedWriter2 = bufferedWriter;
                } catch (IOException e) {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    bufferedWriter2 = bufferedWriter;
                    th = th;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    throw th;
                }
            }
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
        } catch (IOException e2) {
            bufferedWriter = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 255) {
            return str.substring(0, 255);
        }
        return str;
    }
}

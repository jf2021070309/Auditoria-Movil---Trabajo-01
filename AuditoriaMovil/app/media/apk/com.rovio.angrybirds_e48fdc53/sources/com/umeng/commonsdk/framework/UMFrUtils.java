package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kuaishou.weapon.p0.bh;
import com.kuaishou.weapon.p0.g;
import com.kuaishou.weapon.p0.t;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.bg;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class UMFrUtils {
    private static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    private static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    private static Object mEnvelopeBuildTimeLock = new Object();
    private static String mDefaultEnvelopeDir = as.b().b(as.a);
    private static String mDefaultEnvelopeDirPath = null;
    private static Object mEnvelopeFileLock = new Object();
    private static String sCurrentProcessName = "";

    private static String getProcessName(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    readLine = readLine.trim();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable th) {
                }
                return readLine;
            } catch (Throwable th2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                    }
                }
                return null;
            }
        } catch (Throwable th4) {
            bufferedReader = null;
        }
    }

    public static String getCurrentProcessName(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(sCurrentProcessName)) {
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    str = "";
                } else {
                    str = Application.getProcessName();
                }
                if (TextUtils.isEmpty(str)) {
                    int myPid = Process.myPid();
                    String processName = getProcessName(myPid);
                    if (!TextUtils.isEmpty(processName)) {
                        sCurrentProcessName = processName;
                    } else {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (next.pid == myPid) {
                                    sCurrentProcessName = next.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    sCurrentProcessName = str;
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context.getApplicationContext(), th);
            }
        }
        return sCurrentProcessName;
    }

    public static String getSubProcessName(Context context) {
        String str = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int indexOf = currentProcessName.indexOf(":");
            if (indexOf >= 0) {
                str = currentProcessName.substring(indexOf + 1);
            }
            if (indexOf >= 0) {
                return str;
            }
            String packageName = context.getPackageName();
            if (currentProcessName.length() > packageName.length()) {
                return currentProcessName.substring(packageName.length() + 1, currentProcessName.length());
            }
            return currentProcessName;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return str;
        }
    }

    private static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(applicationContext, th);
                return false;
            }
        }
        try {
            return applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) == 0;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(applicationContext, th2);
            return false;
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (checkPermission(context, g.b) && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return false;
        }
    }

    public static int envelopeFileNumber(Context context) {
        File file;
        String[] list;
        if (context == null) {
            return 0;
        }
        try {
            file = new File(getEnvelopeDirPath(context));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        synchronized (mEnvelopeFileLock) {
            if (!file.isDirectory() || (list = file.list()) == null) {
                return 0;
            }
            return list.length;
        }
    }

    private static long getDistanceDays(long j, long j2) {
        long j3;
        if (j < j2) {
            j3 = j2 - j;
        } else {
            j3 = j - j2;
        }
        return j3 / 86400000;
    }

    public static void removeRedundantEnvelopeFiles(Context context, int i) {
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > i) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.1
                    @Override // java.util.Comparator
                    /* renamed from: a */
                    public int compare(File file2, File file3) {
                        int i2 = ((file2.lastModified() - file3.lastModified()) > 0L ? 1 : ((file2.lastModified() - file3.lastModified()) == 0L ? 0 : -1));
                        if (i2 > 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            return 0;
                        }
                        return -1;
                    }
                });
                if (listFiles.length > i) {
                    for (int i2 = 0; i2 < listFiles.length - i; i2++) {
                        if (!listFiles[i2].delete()) {
                            ULog.d("--->>> remove [" + i2 + "] file fail.");
                        }
                    }
                }
            }
        }
    }

    public static File getEnvelopeFile(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.UMFrUtils.2
                    @Override // java.util.Comparator
                    /* renamed from: a */
                    public int compare(File file2, File file3) {
                        int i = ((file2.lastModified() - file3.lastModified()) > 0L ? 1 : ((file2.lastModified() - file3.lastModified()) == 0L ? 0 : -1));
                        if (i > 0) {
                            return 1;
                        }
                        if (i == 0) {
                            return 0;
                        }
                        return -1;
                    }
                });
                return listFiles[0];
            }
            return null;
        }
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context == null) {
            return;
        }
        try {
            String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
            if (TextUtils.isEmpty(legacyEnvelopeDir) || legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                return;
            }
            File file = new File(context.getFilesDir().getAbsolutePath() + bh.j + legacyEnvelopeDir);
            if (!file.exists()) {
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                if (file.isDirectory()) {
                    file.delete();
                    return;
                }
                return;
            }
            String envelopeDirPath = getEnvelopeDirPath(context);
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                file2.renameTo(new File(envelopeDirPath + File.separator + listFiles[i].getName()));
            }
            if (file.isDirectory()) {
                file.delete();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static String getLegacyEnvelopeDir(Context context) {
        try {
            String currentProcessName = getCurrentProcessName(context);
            if (!TextUtils.isEmpty(currentProcessName)) {
                String b = as.b().b(as.B);
                String replace = currentProcessName.replace(':', '_');
                ULog.d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                return b + replace;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return mDefaultEnvelopeDir;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + File.separator + "." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.d("--->>> Create Envelope Directory failed!!!");
                }
                str = mDefaultEnvelopeDirPath;
            }
        }
        return str;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_SUCC_BUILD_TIME, 0L);
        }
        return j;
    }

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, 0L);
        }
        return j;
    }

    private static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    private static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    public static int saveEnvelopeFile(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return 101;
        }
        File file = new File(getEnvelopeDirPath(context) + File.separator + str);
        synchronized (mEnvelopeFileLock) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(bArr);
                        fileOutputStream2.close();
                        boolean a = com.umeng.commonsdk.statistics.internal.a.a(context).a(str);
                        boolean b = com.umeng.commonsdk.statistics.internal.a.a(context).b(str);
                        if (a) {
                            updateLastSuccessfulBuildTime(context);
                        }
                        if (b) {
                            updateLastInstantBuildTime(context);
                        }
                        return 0;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        UMCrashManager.reportCrash(context, e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return 101;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static boolean removeEnvelopeFile(File file) {
        UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                if (file.exists()) {
                    return file.delete();
                }
            }
            return true;
        }
    }

    public static byte[] toByteArray(String str) throws IOException {
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            try {
                try {
                    FileChannel channel = new RandomAccessFile(str, t.k).getChannel();
                    MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    bArr = new byte[(int) channel.size()];
                    if (load.remaining() > 0) {
                        load.get(bArr, 0, load.remaining());
                    }
                    channel.close();
                } catch (IOException e) {
                    UMCrashManager.reportCrash(appContext, e);
                    throw e;
                }
            }
        }
        return bArr;
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        String str = "a";
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = "i";
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_ZeroEnv) {
            str = bg.aD;
        }
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_Silent) {
            str = bg.aG;
        }
        String envelopeDirPath = getEnvelopeDirPath(context);
        if (envelopeDirPath == null) {
            return false;
        }
        File file = new File(envelopeDirPath);
        synchronized (mEnvelopeFileLock) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.getName().startsWith(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }
}

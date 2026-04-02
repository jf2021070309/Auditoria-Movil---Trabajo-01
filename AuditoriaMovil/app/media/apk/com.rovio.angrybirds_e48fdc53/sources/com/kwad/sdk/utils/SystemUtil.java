package com.kwad.sdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes3.dex */
public final class SystemUtil {
    private static long aJK = 0;
    private static long aJL = 0;
    private static int aJM = 0;
    private static LEVEL aJN = null;

    /* loaded from: classes3.dex */
    public enum LEVEL {
        BEST(5),
        HIGH(4),
        MIDDLE(3),
        LOW(2),
        BAD(1),
        UN_KNOW(-1);
        
        int value;

        LEVEL(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public long aJO;
        public long aJP;
        public long aJQ;
        public long aJR;
        public long aJS;
        public int mThreadsCount;
    }

    public static long JB() {
        BufferedReader bufferedReader;
        Throwable th;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        return 0L;
                    }
                } catch (Exception e) {
                    bufferedReader2 = bufferedReader;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                    return 0L;
                } catch (Throwable th2) {
                    th = th2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                    throw th;
                }
            } while (!readLine.contains("MemTotal"));
            long longValue = Long.valueOf(readLine.split("\\s+")[1]).longValue() << 10;
            com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
            return longValue;
        } catch (Exception e2) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static a JC() {
        String as;
        a aVar = new a();
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/self/status", com.kuaishou.weapon.p0.t.k);
            while (true) {
                try {
                    String readLine = randomAccessFile2.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!TextUtils.isEmpty(readLine)) {
                        if (readLine.startsWith("VmSize") && readLine.contains("kB")) {
                            String as2 = as(readLine, "VmSize");
                            if (as2 != null) {
                                aVar.aJP = Long.valueOf(as2).longValue();
                            }
                        } else if (readLine.startsWith("VmRSS:") && readLine.contains("kB")) {
                            String as3 = as(readLine, "VmRSS:");
                            if (as3 != null) {
                                aVar.aJQ = Long.valueOf(as3).longValue();
                            }
                        } else if (readLine.startsWith("Threads:") && (as = as(readLine, "Threads:")) != null) {
                            aVar.mThreadsCount = Integer.valueOf(as).intValue();
                        }
                    }
                } catch (IOException e) {
                    randomAccessFile = randomAccessFile2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(randomAccessFile);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    com.kwad.sdk.crash.utils.b.closeQuietly(randomAccessFile);
                    throw th;
                }
            }
            com.kwad.sdk.crash.utils.b.closeQuietly(randomAccessFile2);
        } catch (IOException e2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return aVar;
    }

    private static String as(String str, String str2) {
        int length = str2.length();
        int i = -1;
        while (true) {
            if (length >= str.length()) {
                length = -1;
                break;
            }
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (i != -1) {
                    break;
                }
            } else if (i == -1) {
                i = length;
            }
            length++;
        }
        if (i == -1) {
            return null;
        }
        return length == -1 ? str.substring(i) : str.substring(i, length);
    }

    public static boolean b(Context context, String... strArr) {
        if (context == null) {
            return false;
        }
        for (int i = 0; i <= 0; i++) {
            try {
                if (context.checkPermission(strArr[0], Process.myPid(), Process.myUid()) == -1) {
                    return false;
                }
            } catch (Exception e) {
                return true;
            }
        }
        return true;
    }

    public static boolean cZ(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        return b(context, com.kuaishou.weapon.p0.g.c);
    }

    public static void checkUiThread() {
    }

    public static long da(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static boolean de(int i) {
        return getApiLevel() >= i;
    }

    private static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getProcessName(Context context) {
        return ap.getProcessName(context);
    }

    public static boolean isInMainProcess(Context context) {
        return ap.isInMainProcess(context);
    }
}

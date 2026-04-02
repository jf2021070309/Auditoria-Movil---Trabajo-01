package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public class ProcessUtils {
    private static String zzhd = null;
    private static int zzhe = 0;

    private ProcessUtils() {
    }

    @Nullable
    public static String getMyProcessName() {
        if (zzhd == null) {
            if (zzhe == 0) {
                zzhe = Process.myPid();
            }
            zzhd = zzd(zzhe);
        }
        return zzhd;
    }

    @Nullable
    private static String zzd(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i > 0) {
            try {
                bufferedReader = zzj(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString());
            } catch (IOException e) {
                bufferedReader = null;
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
            }
            try {
                str = bufferedReader.readLine().trim();
                IOUtils.closeQuietly(bufferedReader);
            } catch (IOException e2) {
                IOUtils.closeQuietly(bufferedReader);
                return str;
            } catch (Throwable th3) {
                th = th3;
                IOUtils.closeQuietly(bufferedReader);
                throw th;
            }
        }
        return str;
    }

    private static BufferedReader zzj(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}

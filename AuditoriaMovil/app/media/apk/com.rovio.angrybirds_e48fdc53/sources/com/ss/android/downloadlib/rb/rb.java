package com.ss.android.downloadlib.rb;

import java.io.File;
/* loaded from: classes3.dex */
public class rb {
    public static long dr(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        return dr(file, file.lastModified(), 0);
    }

    private static long dr(File file, long j, int i) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return j;
        }
        long max = Math.max(j, file.lastModified());
        int i2 = i + 1;
        if (i2 >= 50) {
            return max;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                max = Math.max(max, dr(file2, max, i2));
            }
        }
        return max;
    }
}

package com.adcolony.sdk;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.UUID;
/* loaded from: classes2.dex */
class y {
    private static String a = null;

    y() {
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (y.class) {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        b(file);
                    }
                    a = a(file);
                } catch (Exception e) {
                    throw new w(e.toString());
                }
            }
            str = a;
        }
        return str;
    }

    private static String a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, com.kuaishou.weapon.p0.t.k);
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    private static void b(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(UUID.randomUUID().toString().getBytes());
        fileOutputStream.close();
    }
}

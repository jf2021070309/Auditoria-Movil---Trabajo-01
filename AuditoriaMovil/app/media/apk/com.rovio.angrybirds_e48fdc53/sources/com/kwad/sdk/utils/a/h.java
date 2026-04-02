package com.kwad.sdk.utils.a;

import com.kuaishou.weapon.p0.bh;
import com.umeng.analytics.pro.cv;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
final class h {

    /* loaded from: classes3.dex */
    static class a {
        static final SecureRandom aLI = new SecureRandom();
        static final char[] aLJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String KA() {
        byte[] bArr = new byte[16];
        a.aLI.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            cArr[i2] = a.aLJ[(b >> 4) & 15];
            cArr[i2 + 1] = a.aLJ[b & cv.m];
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int KB() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), new Object[0])).intValue();
        } catch (Throwable th) {
            return 4096;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = randomAccessFile.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                }
                i2 += read;
            } finally {
                closeQuietly(randomAccessFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(File file, byte[] bArr) {
        File file2;
        try {
            String parent = file.getParent();
            file2 = new File(parent, file.getName() + bh.k);
        } catch (Exception e) {
        }
        if (ad(file2)) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            randomAccessFile.setLength(bArr.length);
            randomAccessFile.write(bArr);
            closeQuietly(randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ad(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] ae(File file) {
        if (file.isFile()) {
            long length = file.length();
            if ((length >> 32) != 0) {
                throw new IllegalArgumentException("file too large, path:" + file.getPath());
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            a(file, bArr, i);
            return bArr;
        }
        return null;
    }

    private static void af(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                af(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int binarySearch(int[] iArr, int i) {
        int length = (iArr.length >> 1) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3 << 1];
            if (i4 < i) {
                i2 = i3 + 1;
            } else if (i4 <= i) {
                return i3;
            } else {
                length = i3 - 1;
            }
        }
        return length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(File file) {
        try {
            if (file.exists()) {
                af(file);
            }
        } catch (Exception e) {
        }
    }
}

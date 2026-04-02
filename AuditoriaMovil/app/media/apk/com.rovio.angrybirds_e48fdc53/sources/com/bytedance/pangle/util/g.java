package com.bytedance.pangle.util;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public final class g {
    static String a;
    static String b;
    static int c = 8192;

    public static void a(String str) {
        a(new File(str));
    }

    public static void a(File file) {
        File[] listFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        file.delete();
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    return;
                }
            }
        } finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
            }
        }
    }

    public static String a(Context context) {
        File parentFile;
        if (a == null && (parentFile = context.getCacheDir().getParentFile()) != null) {
            a = parentFile.getAbsolutePath();
        }
        return a;
    }

    public static String b(Context context) {
        File parentFile;
        if (b == null && (parentFile = context.getCacheDir().getParentFile()) != null) {
            try {
                b = parentFile.getCanonicalPath();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return b;
    }

    public static void a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists()) {
            throw new Exception("文件夹不存在");
        }
        if (!file.isDirectory()) {
            throw new Exception("源文件夹不是目录");
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (!file2.isDirectory()) {
            throw new Exception("目标文件夹不是目录");
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (File file3 : listFiles) {
            String str3 = file2 + File.separator + file3.getName();
            if (file3.isDirectory()) {
                a(file3.getAbsolutePath(), str3);
            } else if (!new File(str3).exists()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file3));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                byte[] bArr = new byte[c];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                }
                bufferedOutputStream.close();
                bufferedInputStream.close();
            }
        }
    }

    public static void a(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, long j, long j2, String str) {
        int i;
        byte[] bArr;
        long j3 = 0;
        if (j < 0 || j2 < 0 || j > j2) {
            throw new IOException("invalid offsets  ".concat(String.valueOf(str)));
        }
        if (i == 0) {
            return;
        }
        randomAccessFile.seek(j);
        long j4 = j2 - j;
        int i2 = c;
        if (j4 < i2) {
            bArr = new byte[(int) j4];
        } else {
            bArr = new byte[i2];
        }
        while (true) {
            int read = randomAccessFile.read(bArr);
            if (read != -1) {
                randomAccessFile2.write(bArr, 0, read);
                j3 += read;
                if (j3 != j4) {
                    if (bArr.length + j3 > j4) {
                        bArr = new byte[(int) (j4 - j3)];
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

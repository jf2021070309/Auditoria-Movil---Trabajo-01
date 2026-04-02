package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class q {
    public static final BigInteger aIA;
    public static final BigInteger aIB;
    public static final BigInteger aIC;
    public static final char aID;
    public static final BigInteger aIE;
    public static final BigInteger aIF;
    public static final File[] aIG;
    public static final String aIH;
    private static final char aII;
    public static final BigInteger aIx;
    public static final BigInteger aIy;
    public static final BigInteger aIz;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        aIx = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        aIy = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        aIz = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        aIA = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        aIB = multiply4;
        aIC = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        aIE = multiply5;
        aIF = valueOf.multiply(multiply5);
        aIG = new File[0];
        aIH = Character.toString('.');
        aII = File.separatorChar;
        aID = Ic() ? '/' : '\\';
    }

    private static boolean Ic() {
        return aII == '\\';
    }

    public static String K(Context context, String str) {
        return "/data/data/" + context.getPackageName() + "/" + str + "/";
    }

    public static boolean L(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public static boolean M(File file) {
        return file.exists();
    }

    private static FileInputStream N(File file) {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    private static FileOutputStream O(File file) {
        return a(file, false);
    }

    public static void P(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException("Could not find parent directory");
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            file.createNewFile();
            return;
        }
        throw new IOException("Directory '" + parentFile + "' could not be created");
    }

    private static void Q(File file) {
        if (file.exists()) {
            if (!Z(file)) {
                T(file);
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }

    public static boolean R(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                T(file);
            }
        } catch (Exception e) {
        }
        try {
            return file.delete();
        } catch (Exception e2) {
            return false;
        }
    }

    public static boolean S(File file) {
        return R(file);
    }

    public static void T(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("Failed to list contents of " + file);
            }
            IOException e = null;
            for (File file2 : listFiles) {
                try {
                    W(file2);
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                throw e;
            }
        }
    }

    public static byte[] U(File file) {
        return V(file).getBytes();
    }

    public static String V(File file) {
        return a(file, Charset.defaultCharset());
    }

    private static void W(File file) {
        if (file.isDirectory()) {
            Q(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (exists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static void X(File file) {
        if (file == null) {
            throw new IOException("Dir is null.");
        }
        if (!file.exists()) {
            file.mkdirs();
        } else if (file.isDirectory()) {
            return;
        } else {
            if (!R(file)) {
                throw new IOException("Fail to delete existing file, file = " + file.getAbsolutePath());
            }
            file.mkdir();
        }
        if (file.exists() && file.isDirectory()) {
            return;
        }
        throw new IOException("Fail to create dir, dir = " + file.getAbsolutePath());
    }

    public static void Y(File file) {
        R(file);
        s(file);
        if (!file.exists()) {
            throw new IOException("Create file fail");
        }
    }

    private static boolean Z(File file) {
        ao.checkNotNull(file);
        if (Ic()) {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static FileOutputStream a(File file, boolean z) {
        P(file);
        return new FileOutputStream(file, z);
    }

    public static String a(File file, Charset charset) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = N(file);
            try {
                String a = com.kwad.sdk.crash.utils.h.a(fileInputStream, com.kwad.sdk.crash.utils.a.a(charset));
                com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static void a(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Asset path is empty.");
        }
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            b(inputStream, file);
        } finally {
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        }
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean z) {
        ArrayList arrayList;
        File[] listFiles;
        ao.h(file, "Source");
        ao.h(file2, "Destination");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        } else {
            if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath()) || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(listFiles.length);
                for (File file3 : listFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
            a(file, file2, null, z, arrayList);
        }
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    a(file3, file4, fileFilter, z, list);
                } else {
                    c(file3, file4, z);
                }
            }
        }
        if (z) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void a(File file, String str, Charset charset, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = a(file, false);
            try {
                com.kwad.sdk.crash.utils.h.a(str, fileOutputStream, charset);
                com.kwad.sdk.crash.utils.b.closeQuietly(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                com.kwad.sdk.crash.utils.b.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static boolean aa(File file) {
        File file2 = new File(file.getAbsolutePath() + System.currentTimeMillis());
        e(file, file2);
        return R(file2);
    }

    private static void b(File file, File file2, boolean z) {
        ao.h(file, "Source");
        ao.h(file2, "Destination");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        } else {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                c(file, file2, true);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        }
    }

    private static void b(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = O(file);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            com.kwad.sdk.crash.utils.h.g(inputStream, fileOutputStream);
            com.kwad.sdk.crash.utils.b.closeQuietly(fileOutputStream);
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        } catch (Throwable th2) {
            th = th2;
            com.kwad.sdk.crash.utils.b.closeQuietly(fileOutputStream);
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable, java.io.FileOutputStream] */
    private static void c(File file, File file2, boolean z) {
        FileInputStream fileInputStream;
        ?? r4;
        FileChannel fileChannel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileChannel fileChannel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                r4 = new FileOutputStream(file2);
                try {
                    fileChannel = fileInputStream.getChannel();
                    try {
                        fileChannel2 = r4.getChannel();
                        long size = fileChannel.size();
                        long j = 0;
                        while (j < size) {
                            long j2 = size - j;
                            j += fileChannel2.transferFrom(fileChannel, j, j2 > 31457280 ? 31457280L : j2);
                        }
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel2);
                        com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel);
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                        if (file.length() == file2.length()) {
                            if (z) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            return;
                        }
                        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                    } catch (Throwable th) {
                        th = th;
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel2);
                        com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel);
                        com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            } catch (Throwable th3) {
                th = th3;
                r4 = 0;
                fileChannel = r4;
                com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel2);
                com.kwad.sdk.crash.utils.b.closeQuietly((Closeable) r4);
                com.kwad.sdk.crash.utils.b.closeQuietly(fileChannel);
                com.kwad.sdk.crash.utils.b.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            r4 = 0;
        }
    }

    private static void d(File file, File file2, boolean z) {
        a(file, file2, (FileFilter) null, true);
    }

    public static boolean delete(String str) {
        return R(new File(str));
    }

    public static void deleteContents(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                file2.delete();
            }
        }
    }

    private static boolean e(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        try {
            f(file, file2);
            try {
                file.delete();
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
            return true;
        } catch (Exception e2) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e2);
            return false;
        }
    }

    public static void f(File file, File file2) {
        b(file, file2, true);
    }

    public static BufferedInputStream fp(String str) {
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e) {
                fileInputStream = null;
            }
            if (fileInputStream == null) {
                return null;
            }
            return new BufferedInputStream(fileInputStream);
        }
        return null;
    }

    public static boolean fq(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static boolean fr(String str) {
        return !TextUtils.isEmpty(str) && L(new File(str));
    }

    private static int fs(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    private static int ft(String str) {
        int lastIndexOf;
        if (str != null && fs(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static void g(File file, File file2) {
        d(file, file2, true);
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int ft = ft(str);
        return ft == -1 ? "" : str.substring(ft + 1);
    }

    private static void s(File file) {
        if (!file.exists()) {
            com.kwad.sdk.crash.utils.b.closeQuietly(O(file));
        }
        if (file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        throw new IOException("Unable to set the last modification time for " + file);
    }
}

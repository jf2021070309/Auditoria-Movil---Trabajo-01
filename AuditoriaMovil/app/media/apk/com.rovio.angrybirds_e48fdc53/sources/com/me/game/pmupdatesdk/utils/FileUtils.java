package com.me.game.pmupdatesdk.utils;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
/* loaded from: classes7.dex */
public class FileUtils {
    public static final long GB = 1073741824;
    public static final long KB = 1024;
    public static final long MB = 1048576;
    public static final String SUFFIX_PNG = ".png";
    public static final String SUFFIX_ZIP = ".zip";

    public static String coverSize2String(long size) {
        if (size >= 1024) {
            return size < 1048576 ? String.format(Locale.ENGLISH, "%.1f KB", Float.valueOf(((float) size) / 1024.0f)) : size < 1073741824 ? String.format(Locale.ENGLISH, "%.1f MB", Float.valueOf(((float) size) / 1048576.0f)) : String.format(Locale.ENGLISH, "%.1f GB", Float.valueOf(((float) size) / 1.07374182E9f));
        }
        return size + " B";
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) throws Exception {
        copyFile(inputStream, outputStream, null, true, true);
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream, byte[] bytes) throws Exception {
        copyFile(inputStream, outputStream, bytes, true, true);
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream, byte[] bytes, boolean closeIn) throws Exception {
        copyFile(inputStream, outputStream, bytes, closeIn, true);
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream, byte[] bytes, boolean closeIn, boolean closeOut) throws Exception {
        if (bytes == null) {
            bytes = new byte[1048576];
        }
        while (true) {
            int ln = inputStream.read(bytes);
            if (ln == -1) {
                break;
            }
            outputStream.write(bytes, 0, ln);
            outputStream.flush();
        }
        if (closeIn) {
            close(inputStream);
        }
        if (closeOut) {
            close(outputStream);
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

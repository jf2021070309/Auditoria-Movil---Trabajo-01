package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes4.dex */
public class qu {

    /* loaded from: classes4.dex */
    public interface a {
        void a(File file, String str, long j);
    }

    public static void a(File file, File file2, a... aVarArr) {
        Logger.d(Logger.FILE_TAG, "extracting " + file + " to " + file2);
        if (!file2.isDirectory() && !file2.mkdirs()) {
            throw new IOException("failed to create directories " + file2);
        }
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (!nextEntry.isDirectory()) {
                        String name = nextEntry.getName();
                        if (qr.b(name)) {
                            File canonicalFile = new File(file2, name).getCanonicalFile();
                            if (qr.a(file2, canonicalFile)) {
                                Logger.v(Logger.FILE_TAG, "verified " + canonicalFile + " is nested within " + file2);
                                if (!qr.c(canonicalFile.getParentFile())) {
                                    Logger.w(Logger.FILE_TAG, "could not ensure directory");
                                } else {
                                    Logger.v(Logger.FILE_TAG, "extracting " + canonicalFile);
                                    FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile);
                                    long j = 0;
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        j += read;
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    if (aVarArr != null) {
                                        for (a aVar : aVarArr) {
                                            aVar.a(canonicalFile, name, j);
                                        }
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e) {
                                        Logger.w(Logger.FILE_TAG, "error closing file output stream " + file2);
                                    }
                                }
                            } else {
                                throw new qt("aborting zip extraction - child " + name + " escapes destination directory " + file2);
                            }
                        } else {
                            throw new qs("Unsafe path " + name);
                        }
                    }
                } else {
                    try {
                        return;
                    } catch (IOException e2) {
                        return;
                    }
                }
            }
        } finally {
            try {
                zipInputStream.close();
            } catch (IOException e3) {
                Logger.w(Logger.FILE_TAG, "error closing zip input stream " + file);
            }
        }
    }
}

package com.umeng.commonsdk.utils;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileLock;
/* loaded from: classes3.dex */
public class FileLockUtil {
    private final Object lockObject = new Object();

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, Object obj) {
        if (!file.exists()) {
            return;
        }
        synchronized (this.lockObject) {
            FileLock fileLock = getFileLock(file.getAbsolutePath());
            if (fileLock != null) {
                try {
                    fileLockCallback.onFileLock(file.getName(), obj);
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback, int i) {
        if (!file.exists()) {
            return;
        }
        synchronized (this.lockObject) {
            FileLock fileLock = getFileLock(file.getAbsolutePath());
            if (fileLock != null) {
                try {
                    fileLockCallback.onFileLock(file, i);
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (Throwable th) {
                        th = th;
                        th.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    public void doFileOperateion(File file, FileLockCallback fileLockCallback) {
        if (!file.exists()) {
            return;
        }
        synchronized (this.lockObject) {
            FileLock fileLock = getFileLock(file.getAbsolutePath());
            if (fileLock != null) {
                try {
                    fileLockCallback.onFileLock(file.getName());
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void doFileOperateion(String str, FileLockCallback fileLockCallback) {
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        synchronized (this.lockObject) {
            FileLock fileLock = getFileLock(str);
            if (fileLock != null) {
                try {
                    fileLockCallback.onFileLock(file.getName());
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    try {
                        fileLock.release();
                        fileLock.channel().close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.nio.channels.FileLock getFileLock(java.lang.String r3) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L17 java.io.FileNotFoundException -> L1d
            java.lang.String r2 = "rw"
            r1.<init>(r3, r2)     // Catch: java.io.IOException -> L17 java.io.FileNotFoundException -> L1d
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.io.IOException -> L17 java.io.FileNotFoundException -> L1d
            java.nio.channels.FileLock r3 = r3.lock()     // Catch: java.io.IOException -> L13 java.io.FileNotFoundException -> L15
            return r3
        L13:
            r1 = move-exception
            goto L19
        L15:
            r1 = move-exception
            goto L1f
        L17:
            r1 = move-exception
            r3 = r0
        L19:
            r1.printStackTrace()
            goto L23
        L1d:
            r1 = move-exception
            r3 = r0
        L1f:
            r1.printStackTrace()
        L23:
            if (r3 == 0) goto L2d
            r3.close()     // Catch: java.io.IOException -> L29
            goto L2d
        L29:
            r3 = move-exception
            r3.printStackTrace()
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.utils.FileLockUtil.getFileLock(java.lang.String):java.nio.channels.FileLock");
    }
}

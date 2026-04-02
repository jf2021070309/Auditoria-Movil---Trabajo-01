package com.vungle.warren.log;

import android.util.Log;
import com.vungle.warren.log.LogManager;
import com.vungle.warren.utility.FileUtility;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class LogPersister {
    private static final String SDK_CRASH_LOG_FILE_PATTERN = "crash_";
    private static final String SDK_LOGS_DIR = "sdk_logs";
    private static final String SDK_LOG_FILE_CRASH = "_crash";
    private static final String SDK_LOG_FILE_PATTERN = "log_";
    private static final String SDK_LOG_FILE_PENDING = "_pending";
    private static final String TAG = LogPersister.class.getSimpleName();
    private int entryCount;
    private LogManager.SdkLoggingEventListener listener;
    private File logDir;
    private File logFile;
    private int maximumEntries = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogPersister(File file) {
        if (file != null) {
            File orCreateLogDir = getOrCreateLogDir(file);
            this.logDir = orCreateLogDir;
            if (orCreateLogDir != null) {
                this.logFile = getOrCreateLogFile(orCreateLogDir);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSdkLoggingEventListener(LogManager.SdkLoggingEventListener sdkLoggingEventListener) {
        this.listener = sdkLoggingEventListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaximumEntries(int i) {
        if (i <= 0) {
            i = 100;
        }
        this.maximumEntries = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void saveLogData(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r14 = this;
            r1 = r14
            java.io.File r0 = r1.logDir
            if (r0 != 0) goto Ld
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG
            java.lang.String r2 = "No log cache dir found."
            android.util.Log.w(r0, r2)
            return
        Ld:
            java.io.File r0 = r1.logFile
            if (r0 == 0) goto L17
            boolean r0 = r0.exists()
            if (r0 != 0) goto L30
        L17:
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG
            java.lang.String r2 = "current log file maybe deleted, create new one."
            android.util.Log.d(r0, r2)
            java.io.File r0 = r1.logDir
            java.io.File r0 = r14.getOrCreateLogFile(r0)
            r1.logFile = r0
            if (r0 == 0) goto Lc8
            boolean r0 = r0.exists()
            if (r0 != 0) goto L30
            goto Lc8
        L30:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r9 = r0.getID()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = getDateText(r2)
            com.vungle.warren.log.LogEntry r0 = new com.vungle.warren.log.LogEntry
            r2 = r0
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 0
            r3 = 1
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.io.File r5 = r1.logFile     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            int r2 = r1.entryCount     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            if (r2 <= 0) goto L69
            java.lang.String r2 = "\n"
            r4.append(r2)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
        L69:
            java.lang.String r0 = r0.toJsonString()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            r4.append(r0)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            r4.flush()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7b
            com.vungle.warren.utility.FileUtility.closeQuietly(r4)
            r0 = r3
            goto L8a
        L78:
            r0 = move-exception
            r2 = r4
            goto Lc4
        L7b:
            r2 = r4
            goto L7f
        L7d:
            r0 = move-exception
            goto Lc4
        L7f:
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "Failed to write sdk logs."
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L7d
            r0 = 0
            com.vungle.warren.utility.FileUtility.closeQuietly(r2)
        L8a:
            if (r0 == 0) goto Lc3
            int r0 = r1.entryCount
            int r0 = r0 + r3
            r1.entryCount = r0
            int r2 = r1.maximumEntries
            if (r0 < r2) goto Lc3
            java.io.File r0 = r1.logFile
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r1.logFile
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = "_pending"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r14.renameFile(r0, r2)
            if (r0 == 0) goto Lbc
            java.io.File r0 = r1.logDir
            java.io.File r0 = r14.getOrCreateLogFile(r0)
            r1.logFile = r0
        Lbc:
            com.vungle.warren.log.LogManager$SdkLoggingEventListener r0 = r1.listener
            if (r0 == 0) goto Lc3
            r0.sendPendingLogs()
        Lc3:
            return
        Lc4:
            com.vungle.warren.utility.FileUtility.closeQuietly(r2)
            throw r0
        Lc8:
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG
            java.lang.String r2 = "Can't create log file, maybe no space left."
            android.util.Log.w(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.log.LogPersister.saveLogData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File[] getPendingFiles() {
        File file = this.logDir;
        if (file == null) {
            Log.w(TAG, "No log cache dir found.");
            return null;
        }
        return file.listFiles(new FilenameFilter() { // from class: com.vungle.warren.log.LogPersister.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.endsWith(LogPersister.SDK_LOG_FILE_PENDING);
            }
        });
    }

    private File getOrCreateLogDir(File file) {
        File createFileOrDirectory = createFileOrDirectory(file, SDK_LOGS_DIR, true);
        if (createFileOrDirectory == null || !createFileOrDirectory.exists()) {
            Log.e(TAG, "Failed to create vungle logs dir");
            return null;
        }
        return createFileOrDirectory;
    }

    File getOrCreateLogFile(File file) {
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.vungle.warren.log.LogPersister.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return !str.endsWith(LogPersister.SDK_LOG_FILE_PENDING);
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            this.entryCount = 0;
            return createFileOrDirectory(file, SDK_LOG_FILE_PATTERN + System.currentTimeMillis() + UUID.randomUUID().toString(), false);
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.vungle.warren.log.LogPersister.3
            @Override // java.util.Comparator
            public int compare(File file2, File file3) {
                return file3.getName().compareTo(file2.getName());
            }
        });
        File file2 = listFiles[0];
        int fileLineCount = getFileLineCount(file2.getAbsolutePath());
        if (fileLineCount <= 0 || fileLineCount < this.maximumEntries) {
            this.entryCount = fileLineCount;
            return file2;
        }
        File file3 = null;
        try {
            File file4 = this.logFile;
            if (renameFile(file4, this.logFile.getName() + SDK_LOG_FILE_PENDING)) {
                file3 = getOrCreateLogFile(file);
            }
        } catch (Exception unused) {
        }
        if (file3 == null) {
            this.entryCount = fileLineCount;
            return file2;
        }
        return file3;
    }

    private File createFileOrDirectory(File file, String str, boolean z) {
        boolean z2;
        File file2 = new File(file, str);
        if (file2.exists()) {
            z2 = true;
        } else if (!z) {
            try {
                z2 = file2.createNewFile();
            } catch (IOException e) {
                Log.e(TAG, "", e);
                z2 = false;
            }
        } else {
            z2 = file2.mkdir();
        }
        if (z2) {
            return file2;
        }
        return null;
    }

    private boolean renameFile(File file, String str) {
        if (file.exists() && file.isFile()) {
            File file2 = new File(this.logDir, str);
            if (file2.exists()) {
                return false;
            }
            return file.renameTo(file2);
        }
        return false;
    }

    static int getFileLineCount(String str) {
        LineNumberReader lineNumberReader = null;
        try {
            LineNumberReader lineNumberReader2 = new LineNumberReader(new FileReader(str));
            while (lineNumberReader2.readLine() != null) {
                try {
                } catch (Exception unused) {
                    lineNumberReader = lineNumberReader2;
                    FileUtility.closeQuietly(lineNumberReader);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    lineNumberReader = lineNumberReader2;
                    FileUtility.closeQuietly(lineNumberReader);
                    throw th;
                }
            }
            int lineNumber = lineNumberReader2.getLineNumber();
            FileUtility.closeQuietly(lineNumberReader2);
            return lineNumber;
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String getDateText(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File[] getCrashReportFiles(int i) {
        File file = this.logDir;
        if (file == null) {
            Log.w(TAG, "No log cache dir found.");
            return null;
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.vungle.warren.log.LogPersister.4
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.endsWith(LogPersister.SDK_LOG_FILE_CRASH);
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.vungle.warren.log.LogPersister.5
            @Override // java.util.Comparator
            public int compare(File file2, File file3) {
                return file3.getName().compareTo(file2.getName());
            }
        });
        return (File[]) Arrays.copyOfRange(listFiles, 0, Math.min(listFiles.length, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void saveCrashLogData(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r14 = this;
            r1 = r14
            java.io.File r0 = r1.logDir
            if (r0 != 0) goto Ld
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG
            java.lang.String r2 = "No log cache dir found."
            android.util.Log.w(r0, r2)
            return
        Ld:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r9 = r0.getID()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = getDateText(r2)
            com.vungle.warren.log.LogEntry r0 = new com.vungle.warren.log.LogEntry
            r2 = r0
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "crash_"
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = r1.logDir
            r4 = 0
            java.io.File r2 = r14.createFileOrDirectory(r3, r2, r4)
            if (r2 == 0) goto L98
            r3 = 0
            r5 = 1
            java.io.FileWriter r6 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            r6.<init>(r2, r5)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            java.lang.String r0 = r0.toJsonString()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            r6.append(r0)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            r6.flush()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6b
            com.vungle.warren.utility.FileUtility.closeQuietly(r6)
            r4 = r5
            goto L79
        L68:
            r0 = move-exception
            r3 = r6
            goto L94
        L6b:
            r3 = r6
            goto L6f
        L6d:
            r0 = move-exception
            goto L94
        L6f:
            java.lang.String r0 = com.vungle.warren.log.LogPersister.TAG     // Catch: java.lang.Throwable -> L6d
            java.lang.String r5 = "Failed to write crash log."
            android.util.Log.e(r0, r5)     // Catch: java.lang.Throwable -> L6d
            com.vungle.warren.utility.FileUtility.closeQuietly(r3)
        L79:
            if (r4 == 0) goto L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r2.getName()
            r0.append(r3)
            java.lang.String r3 = "_crash"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r14.renameFile(r2, r0)
            goto L98
        L94:
            com.vungle.warren.utility.FileUtility.closeQuietly(r3)
            throw r0
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.log.LogPersister.saveCrashLogData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}

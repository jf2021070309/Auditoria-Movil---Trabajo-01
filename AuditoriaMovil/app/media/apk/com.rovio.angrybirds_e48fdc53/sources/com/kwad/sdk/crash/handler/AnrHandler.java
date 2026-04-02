package com.kwad.sdk.crash.handler;

import android.app.ActivityManager;
import android.os.Build;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.util.Printer;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kwad.sdk.crash.e;
import com.kwad.sdk.crash.f;
import com.kwad.sdk.crash.model.message.AnrExceptionMessage;
import com.kwad.sdk.crash.model.message.AnrReason;
import com.kwad.sdk.crash.utils.g;
import com.kwad.sdk.utils.SystemUtil;
import com.kwad.sdk.utils.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class AnrHandler extends b {
    private static final String ANR_HAPPENED_BEGIN = "------ ANR Happened Begin ------\n";
    private static final String DEFAULT_TRACE_ROOT = "/data/anr/";
    private static final long GET_REASON_INTERVAL = 500;
    private static final long PARSE_TRACE_INTERVAL = 10000;
    private static final String TAG = "AnrHandler";
    private static final long TRY_TIMES = 20;
    private FileObserver mTraceFileObserver;
    private static long sLastTime = 0;
    private static final int MY_PID = Process.myPid();
    private static final Pattern PID_PATTERN = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
    private static final boolean DUMP_FROM_SIG_QUIT = SystemUtil.de(21);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final AnrHandler aAo = new AnrHandler();
    }

    private AnrHandler() {
    }

    private static synchronized void dumpAnr(String str, int i) {
        synchronized (AnrHandler.class) {
            com.kwad.sdk.core.e.c.d(TAG, "ANR dumpAnr tracePath=" + str + " index=" + i);
            AnrExceptionMessage anrExceptionMessage = new AnrExceptionMessage();
            File file = getInstance().mLogDir;
            boolean z = true;
            if (!file.exists() && !file.mkdirs()) {
                com.kwad.sdk.core.e.c.d(TAG, "ANR dumpAnr create dir failed.");
                anrExceptionMessage.mErrorMessage += "create " + file.getPath() + " failed!\n";
                z = false;
            }
            if (str != null && z) {
                StringBuilder sb = new StringBuilder();
                getInstance();
                sb.append(FILE_NAME_BASE);
                sb.append("-");
                sb.append(i);
                sb.append(".dump");
                q.f(new File(str), new File(file, sb.toString()));
                StringBuilder sb2 = new StringBuilder();
                getInstance();
                sb2.append(FILE_NAME_BASE);
                sb2.append("-");
                sb2.append(i);
                sb2.append(".log");
                g.E(new File(file, sb2.toString()));
            }
            g.b(null, anrExceptionMessage, e.EB().getContext());
            g.a(anrExceptionMessage, 3);
            if (getInstance().mExceptionListener != null) {
                getInstance().mExceptionListener.a(getInstance().getCrashType(), anrExceptionMessage);
            }
            dumpAnrReason(str, i, anrExceptionMessage, z);
        }
    }

    private static void dumpAnrReason(String str, int i, AnrExceptionMessage anrExceptionMessage, boolean z) {
        com.kwad.sdk.core.e.c.d(TAG, "ANR dumpAnrReason tracePath=" + str + " index=" + i + " dirReady=" + z);
        com.kwad.sdk.crash.report.e uploader = getInstance().getUploader();
        try {
            File file = getInstance().mLogDir;
            final StringBuilder sb = new StringBuilder();
            Looper.getMainLooper().dump(new Printer() { // from class: com.kwad.sdk.crash.handler.AnrHandler.2
                @Override // android.util.Printer
                public final void println(String str2) {
                    StringBuilder sb2 = sb;
                    sb2.append(str2);
                    sb2.append("\n");
                }
            }, "");
            anrExceptionMessage.mMessageQueueDetail = sb.substring(0, sb.length() - 1);
            String jSONObject = anrExceptionMessage.toJson().toString();
            StringBuilder sb2 = new StringBuilder();
            getInstance();
            sb2.append(FILE_NAME_BASE);
            sb2.append("-");
            sb2.append(i);
            sb2.append(".dump");
            File file2 = new File(file, sb2.toString());
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                getInstance();
                sb3.append(FILE_NAME_BASE);
                sb3.append("-");
                sb3.append(i);
                sb3.append(".msg");
                File file3 = new File(file, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                getInstance();
                sb4.append(FILE_NAME_BASE);
                sb4.append("-");
                sb4.append(i);
                sb4.append(".minfo");
                File file4 = new File(file, sb4.toString());
                g.a(file3, jSONObject);
                getInstance().backupLogFiles(file);
                if (uploader != null) {
                    new StringBuilder(ANR_HAPPENED_BEGIN).append(anrExceptionMessage);
                }
                g.a(uploader, TAG, file2);
                getInstance().uploadRemainingExceptions();
                g.H(file4);
            } else if (uploader != null) {
                if (str != null) {
                    uploader.a(anrExceptionMessage, null);
                }
                new StringBuilder(ANR_HAPPENED_BEGIN).append(anrExceptionMessage);
            }
            StringBuilder sb5 = new StringBuilder();
            getInstance();
            sb5.append(FILE_NAME_BASE);
            sb5.append("-");
            sb5.append(i);
            sb5.append(".anr");
            getAnrReason(str, new File(file, sb5.toString()));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            if (uploader != null) {
                g.p(th);
            }
        }
    }

    private static void getAnrReason(String str, final File file) {
        com.kwad.sdk.core.e.c.d(TAG, "ANR getAnrReason");
        if (str == null) {
            com.kwad.sdk.utils.g.schedule(new Runnable() { // from class: com.kwad.sdk.crash.handler.AnrHandler.3
                @Override // java.lang.Runnable
                public final void run() {
                    AnrHandler.getAnrReasonInner(null, file);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } else {
            getAnrReasonInner(str, file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getAnrReasonInner(String str, File file) {
        com.kwad.sdk.core.e.c.d(TAG, "ANR getAnrReasonInner");
        com.kwad.sdk.crash.report.e uploader = getInstance().getUploader();
        if (str != null) {
            try {
                long lastModified = new File(str).lastModified();
                if (Math.abs(lastModified - sLastTime) < PARSE_TRACE_INTERVAL) {
                    return;
                }
                sLastTime = lastModified;
            } catch (Throwable th) {
                return;
            }
        }
        ActivityManager activityManager = (ActivityManager) e.EB().getContext().getSystemService(TTDownloadField.TT_ACTIVITY);
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = null;
        if (activityManager == null) {
            return;
        }
        for (int i = 0; i < TRY_TIMES; i++) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.ProcessErrorStateInfo next = it.next();
                    if (next.condition == 2) {
                        processErrorStateInfo = next;
                        break;
                    }
                }
            }
            if (processErrorStateInfo != null) {
                break;
            }
            Thread.sleep(500L);
        }
        if (processErrorStateInfo == null) {
            return;
        }
        if (processErrorStateInfo.pid != MY_PID) {
            if (uploader != null) {
                new StringBuilder("other process anr:\n").append(processErrorStateInfo.shortMsg);
                return;
            }
            return;
        }
        AnrReason anrReason = new AnrReason();
        anrReason.mTag = processErrorStateInfo.tag;
        anrReason.mShortMsg = processErrorStateInfo.shortMsg;
        anrReason.mLongMsg = processErrorStateInfo.longMsg;
        g.a(file, anrReason.toJson().toString());
    }

    public static AnrHandler getInstance() {
        return a.aAo;
    }

    public static native void install(String str, int i);

    public static void onCallFromNative(int i) {
        com.kwad.sdk.core.e.c.d(TAG, "ANR onCallFromNative index=" + i);
        dumpAnr(null, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTraceFileWritten(String str) {
        com.kwad.sdk.core.e.c.d(TAG, "ANR onTraceFileWritten");
        if (parseTraceFile(str)) {
            dumpAnr(str, this.mIndex.getAndIncrement());
        }
    }

    private boolean parseTraceFile(String str) {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                int i = -1;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (PID_PATTERN.matcher(readLine).matches()) {
                                i = Integer.parseInt(readLine.split("\\s")[2]);
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (FileNotFoundException e) {
                        bufferedReader = bufferedReader2;
                        getUploader();
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        return false;
                    } catch (IOException e2) {
                        bufferedReader = bufferedReader2;
                        getUploader();
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader);
                        throw th;
                    }
                }
                boolean z = i == MY_PID;
                com.kwad.sdk.crash.utils.b.closeQuietly(bufferedReader2);
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e3) {
        } catch (IOException e4) {
        }
    }

    private void watchTraceFile() {
        com.kwad.sdk.core.e.c.d(TAG, "ANR watchTraceFile");
        FileObserver fileObserver = new FileObserver(DEFAULT_TRACE_ROOT, 8) { // from class: com.kwad.sdk.crash.handler.AnrHandler.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, String str) {
                if (str != null) {
                    AnrHandler.this.onTraceFileWritten(AnrHandler.DEFAULT_TRACE_ROOT + str);
                }
            }
        };
        this.mTraceFileObserver = fileObserver;
        try {
            fileObserver.startWatching();
        } catch (Throwable th) {
            getInstance().getUploader();
        }
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final int getCrashType() {
        return 3;
    }

    @Override // com.kwad.sdk.crash.handler.b
    public final void init(File file, f fVar, com.kwad.sdk.crash.report.e eVar) {
        super.init(file, fVar, eVar);
        if (com.kwad.sdk.crash.b.El()) {
            com.kwad.sdk.core.e.c.d(TAG, "ANR init");
            this.mLogDir = file;
            if (!this.mLogDir.exists()) {
                this.mLogDir.mkdirs();
            }
            File file2 = new File(this.mLogDir, FILE_NAME_BASE);
            if (!DUMP_FROM_SIG_QUIT) {
                watchTraceFile();
                return;
            }
            try {
                install(file2.getPath(), Build.VERSION.SDK_INT);
            } catch (Throwable th) {
                getUploader();
            }
        }
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final void reportException(File[] fileArr, CountDownLatch countDownLatch) {
        com.kwad.sdk.crash.report.b bVar = new com.kwad.sdk.crash.report.b();
        bVar.a(getUploader());
        for (File file : fileArr) {
            bVar.a(file, countDownLatch);
        }
    }
}

package com.kwad.sdk.crash.handler;

import android.os.Build;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import com.kwad.sdk.crash.model.message.NativeExceptionMessage;
import com.kwad.sdk.crash.report.e;
import com.kwad.sdk.crash.utils.g;
import java.io.File;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class NativeCrashHandler extends b {
    private static final String NATIVE_CRASH_HAPPENED_BEGIN = "------ Native Crash Happened Begin ------\n";
    private static final String TAG = "NativeCrashHandler";
    private static ExceptionMessage mMessage = new NativeExceptionMessage();
    private File mMessageFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final NativeCrashHandler aAr = new NativeCrashHandler();
    }

    private NativeCrashHandler() {
    }

    public static native void doCrash();

    public static NativeCrashHandler getInstance() {
        return a.aAr;
    }

    public static native void install(String str, boolean z, String str2, int i);

    public static void onCallFromNative() {
        com.kwad.sdk.core.e.c.d(TAG, "onCallFromNative NativeCrashHandler.doCrash()");
        File file = getInstance().mLogDir;
        File file2 = getInstance().mMessageFile;
        File file3 = getInstance().mJavaTraceFile;
        File file4 = getInstance().mMemoryInfoFile;
        e uploader = getInstance().getUploader();
        try {
            if (!file.exists() && !file.mkdirs()) {
                StringBuilder sb = new StringBuilder();
                ExceptionMessage exceptionMessage = mMessage;
                sb.append(exceptionMessage.mErrorMessage);
                sb.append("create ");
                sb.append(file.getPath());
                sb.append(" failed!\n");
                exceptionMessage.mErrorMessage = sb.toString();
                if (uploader != null) {
                    mMessage.toJson();
                }
            }
            if (file2 == null) {
                StringBuilder sb2 = new StringBuilder();
                getInstance();
                sb2.append(FILE_NAME_BASE);
                sb2.append(".msg");
                file2 = new File(file, sb2.toString());
            }
            if (file3 == null) {
                StringBuilder sb3 = new StringBuilder();
                getInstance();
                sb3.append(FILE_NAME_BASE);
                sb3.append(".jtrace");
                file3 = new File(file, sb3.toString());
            }
            if (file4 == null) {
                StringBuilder sb4 = new StringBuilder();
                getInstance();
                sb4.append(FILE_NAME_BASE);
                sb4.append(".minfo");
                file4 = new File(file, sb4.toString());
            }
            g.b(null, mMessage, com.kwad.sdk.crash.e.EB().getContext());
            g.a(mMessage, getInstance().getCrashType());
            if (getInstance().mExceptionListener != null) {
                getInstance().mExceptionListener.a(getInstance().getCrashType(), mMessage);
            }
        } catch (Throwable th) {
            try {
                StringBuilder sb5 = new StringBuilder();
                ExceptionMessage exceptionMessage2 = mMessage;
                sb5.append(exceptionMessage2.mErrorMessage);
                sb5.append(th);
                exceptionMessage2.mErrorMessage = sb5.toString();
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                if (file2 != null) {
                    try {
                        g.a(file2, mMessage.toJson().toString());
                    } catch (Throwable th2) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th2);
                        if (uploader != null) {
                            g.p(th2);
                            return;
                        }
                        return;
                    }
                }
                g.G(file3);
                getInstance().backupLogFiles(file);
                g.a(uploader, TAG, getInstance().mDumpFile);
                getInstance().uploadRemainingExceptions();
                g.H(file4);
            } finally {
                if (file2 != null) {
                    try {
                        g.a(file2, mMessage.toJson().toString());
                    } catch (Throwable th3) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th3);
                        if (uploader != null) {
                            g.p(th3);
                        }
                    }
                }
                g.G(file3);
                getInstance().backupLogFiles(file);
                g.a(uploader, TAG, getInstance().mDumpFile);
                getInstance().uploadRemainingExceptions();
                g.H(file4);
            }
        }
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final int getCrashType() {
        return 4;
    }

    public final void init(File file, boolean z, String str, com.kwad.sdk.crash.report.c cVar) {
        super.init(file, null, cVar);
        if (com.kwad.sdk.crash.b.El()) {
            this.mLogDir = file;
            if (!this.mLogDir.exists()) {
                this.mLogDir.mkdirs();
            }
            this.mDumpFile = new File(file, FILE_NAME_BASE + ".dump");
            this.mJavaTraceFile = new File(file, FILE_NAME_BASE + ".jtrace");
            this.mMemoryInfoFile = new File(file, FILE_NAME_BASE + ".minfo");
            try {
                com.kwad.sdk.core.e.c.d(TAG, "ANR init2 " + this.mDumpFile.getPath());
                install(this.mDumpFile.getPath(), z, str, Build.VERSION.SDK_INT);
                this.mMessageFile = new File(file, FILE_NAME_BASE + ".msg");
            } catch (Throwable th) {
                getUploader();
            }
        }
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final void reportException(File[] fileArr, CountDownLatch countDownLatch) {
        com.kwad.sdk.crash.report.g gVar = new com.kwad.sdk.crash.report.g();
        gVar.a(getUploader());
        for (File file : fileArr) {
            gVar.a(file, countDownLatch);
        }
    }
}

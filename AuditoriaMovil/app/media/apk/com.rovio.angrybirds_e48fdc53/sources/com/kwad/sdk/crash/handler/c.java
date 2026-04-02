package com.kwad.sdk.crash.handler;

import android.content.Context;
import com.kwad.sdk.crash.f;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import java.io.File;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static final c aAq = new c((byte) 0);
    }

    private c() {
    }

    /* synthetic */ c(byte b) {
        this();
    }

    public static c ER() {
        return a.aAq;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|(17:(3:191|192|(13:194|195|6|(6:179|180|181|182|183|184)|(6:167|168|169|170|171|172)|(6:155|156|157|158|159|160)|(6:143|144|145|146|147|148)|15|16|(1:18)|20|21|(5:23|(1:25)|(2:27|(3:29|30|31)(1:34))|35|36)(1:(4:39|(1:41)(1:51)|42|(3:44|45|47)(1:50))(1:52))))|158|159|160|(0)|143|144|145|146|147|148|15|16|(0)|20|21|(0)(0))|5|6|(0)|179|180|181|182|183|184|(0)|167|168|169|170|171|172|(0)|155|156|157|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|(17:(3:191|192|(13:194|195|6|(6:179|180|181|182|183|184)|(6:167|168|169|170|171|172)|(6:155|156|157|158|159|160)|(6:143|144|145|146|147|148)|15|16|(1:18)|20|21|(5:23|(1:25)|(2:27|(3:29|30|31)(1:34))|35|36)(1:(4:39|(1:41)(1:51)|42|(3:44|45|47)(1:50))(1:52))))|158|159|160|(0)|143|144|145|146|147|148|15|16|(0)|20|21|(0)(0))|5|6|(0)|179|180|181|182|183|184|(0)|167|168|169|170|171|172|(0)|155|156|157|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f9, code lost:
        if (com.kwad.sdk.crash.e.EB().isDebug() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fb, code lost:
        backupLogFiles(r20.mLogDir);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
        if (r10 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0202, code lost:
        new java.lang.StringBuilder("------  Java Crash Happened Begin ------\n").append(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020a, code lost:
        if (r24 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020c, code lost:
        r0 = new java.util.concurrent.CountDownLatch(1);
        reportException(new java.io.File[]{r6}, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021a, code lost:
        r0.await(5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0224, code lost:
        uploadRemainingExceptions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0227, code lost:
        com.kwad.sdk.crash.utils.g.H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022b, code lost:
        if (r10 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "uploader.uploadEvent(message);");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0230, code lost:
        if (r24 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0232, code lost:
        r11 = new java.util.concurrent.CountDownLatch(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0239, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023a, code lost:
        r10.a(r22, r11);
        new java.lang.StringBuilder("------  Java Crash Happened Begin ------\n").append(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0245, code lost:
        if (r11 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0247, code lost:
        r11.await(5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ab, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e8, code lost:
        com.kwad.sdk.crash.utils.g.a(r6, r0);
        com.kwad.sdk.crash.utils.g.G(r8);
        com.kwad.sdk.crash.utils.g.E(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #15 {all -> 0x0193, blocks: (B:37:0x00fd, B:39:0x010b), top: B:190:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: all -> 0x0189, TryCatch #7 {all -> 0x0189, blocks: (B:40:0x0114, B:42:0x011e, B:44:0x0131, B:46:0x0138, B:48:0x0142, B:49:0x0150, B:53:0x015a, B:54:0x015d, B:56:0x0164, B:58:0x0169, B:60:0x0171, B:62:0x017e), top: B:177:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8 A[Catch: all -> 0x0251, TryCatch #14 {all -> 0x0251, blocks: (B:97:0x01de, B:99:0x01e8, B:101:0x01fb, B:103:0x0202, B:105:0x020c, B:106:0x021a, B:110:0x0224, B:111:0x0227, B:113:0x022d, B:115:0x0232, B:117:0x023a, B:119:0x0247), top: B:189:0x01de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.Throwable r21, com.kwad.sdk.crash.model.message.ExceptionMessage r22, android.content.Context r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.crash.handler.c.a(java.lang.Throwable, com.kwad.sdk.crash.model.message.ExceptionMessage, android.content.Context, boolean):void");
    }

    public final void a(Throwable th, ExceptionMessage exceptionMessage, Context context) {
        a(th, exceptionMessage, context, ((e) ServiceProvider.get(e.class)).getIsExternal());
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final int getCrashType() {
        return 1;
    }

    @Override // com.kwad.sdk.crash.handler.b
    public final void init(File file, f fVar, com.kwad.sdk.crash.report.e eVar) {
        super.init(file, fVar, eVar);
        if (com.kwad.sdk.crash.e.EB().isDebug()) {
            initBackupDir(new File("sdcard/kwad_ex/java_crash/dump"));
        }
    }

    @Override // com.kwad.sdk.crash.handler.b
    protected final void reportException(File[] fileArr, CountDownLatch countDownLatch) {
        com.kwad.sdk.crash.report.f fVar = new com.kwad.sdk.crash.report.f();
        fVar.a(getUploader());
        for (File file : fileArr) {
            fVar.a(file, countDownLatch);
        }
    }
}

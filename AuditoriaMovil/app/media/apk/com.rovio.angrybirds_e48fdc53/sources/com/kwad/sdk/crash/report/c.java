package com.kwad.sdk.crash.report;

import android.util.Log;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public abstract class c implements e {
    private ArrayList<a> aBr = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private ExceptionMessage aBs;
        private int aBt;

        a(ExceptionMessage exceptionMessage, int i) {
            this.aBs = exceptionMessage;
            this.aBt = i;
        }
    }

    private void Ff() {
        if (this.aBr.isEmpty()) {
            return;
        }
        try {
            Iterator<a> it = this.aBr.iterator();
            while (it.hasNext()) {
                a next = it.next();
                b(next.aBs, next.aBt, null);
                it.remove();
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
    }

    private static boolean a(String str, List<String> list) {
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private void b(ExceptionMessage exceptionMessage, int i, CountDownLatch countDownLatch) {
        if (exceptionMessage == null || !c(exceptionMessage)) {
            return;
        }
        if (i == 3) {
            com.kwad.sdk.crash.report.a.b(exceptionMessage);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(com.kwad.sdk.crash.report.request.c.d(exceptionMessage));
        com.kwad.sdk.crash.report.request.b.a(arrayList, countDownLatch);
    }

    private boolean c(ExceptionMessage exceptionMessage) {
        try {
            com.kwad.sdk.crash.e EB = com.kwad.sdk.crash.e.EB();
            if (EB.EG() != null && EB.EF() != 2) {
                List<com.kwad.sdk.crash.a> list = EB.EG().azR;
                double d = EB.EG().azy;
                String appId = EB.getAppId();
                String sdkVersion = EB.getSdkVersion();
                for (com.kwad.sdk.crash.a aVar : list) {
                    if (aVar != null && (com.kwad.sdk.crash.utils.c.b(aVar.azv) || aVar.azv.contains(appId))) {
                        if (com.kwad.sdk.crash.utils.c.b(aVar.azw) || aVar.azw.contains(sdkVersion)) {
                            if (com.kwad.sdk.crash.utils.c.b(aVar.azx) || a(exceptionMessage.mCrashDetail, aVar.azx)) {
                                d = aVar.azy;
                            }
                        }
                    }
                }
                return Math.random() < d;
            }
            return true;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.w("BaseExceptionUploader", Log.getStackTraceString(e));
            return true;
        }
    }

    public final void a(ExceptionMessage exceptionMessage, int i, CountDownLatch countDownLatch) {
        try {
            Ff();
            b(exceptionMessage, i, countDownLatch);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            this.aBr.add(new a(exceptionMessage, i));
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}

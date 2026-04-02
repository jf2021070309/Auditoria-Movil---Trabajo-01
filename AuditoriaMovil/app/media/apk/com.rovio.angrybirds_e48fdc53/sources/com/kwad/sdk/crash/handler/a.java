package com.kwad.sdk.crash.handler;

import com.kwad.sdk.crash.e;
import com.kwad.sdk.crash.model.message.CaughtExceptionMessage;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import com.kwad.sdk.crash.utils.g;
import java.util.ArrayList;
import java.util.UUID;
/* loaded from: classes.dex */
public final class a {
    private static void a(ExceptionMessage exceptionMessage) {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "upload msg=" + exceptionMessage);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(com.kwad.sdk.crash.report.request.c.d(exceptionMessage));
        com.kwad.sdk.crash.report.request.b.a(arrayList, null);
    }

    public static void n(Throwable th) {
        CaughtExceptionMessage caughtExceptionMessage = new CaughtExceptionMessage();
        caughtExceptionMessage.mLogUUID = UUID.randomUUID().toString();
        caughtExceptionMessage.mCrashDetail = th.toString();
        caughtExceptionMessage.mCrashSource = 1;
        g.b(th, caughtExceptionMessage, e.EB().getContext());
        g.a(caughtExceptionMessage, 2);
        a(caughtExceptionMessage);
    }
}

package com.kwad.sdk.crash.report;

import com.kwad.sdk.core.report.i;
import com.kwad.sdk.core.report.r;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
/* loaded from: classes.dex */
public final class a {
    public static void b(ExceptionMessage exceptionMessage) {
        r rVar = new r(10211L);
        rVar.errorMsg = exceptionMessage.getReportMsg();
        i.a2(rVar);
    }
}

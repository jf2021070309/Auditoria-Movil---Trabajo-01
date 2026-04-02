package com.kwad.sdk;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.model.SDKInitMsg;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.utils.aw;
/* loaded from: classes.dex */
public final class l {
    private static int ahw;

    public static void R(long j) {
        final long currentTimeMillis = j > 0 ? System.currentTimeMillis() - j : -1L;
        ahw++;
        com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.sdk.l.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                KSLoggerReporter.a(ILoggerReporter.Category.APM_LOG, com.kwai.adclient.kscommerciallogger.model.a.aNm, new SDKInitMsg().setLaunchIntervalTime(currentTimeMillis).setInitCount(l.ahw).setInitStatus(0).toJson());
            }
        });
    }

    public static void S(final long j) {
        if (j > 10000) {
            j = -1;
        }
        com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.sdk.l.2
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                KSLoggerReporter.a(ILoggerReporter.Category.APM_LOG, com.kwai.adclient.kscommerciallogger.model.a.aNm, new SDKInitMsg().setTotalDurationTime(j).setInitCount(l.ahw).setInitStatus(1).toJson());
            }
        });
    }

    public static void a(final com.kwai.adclient.kscommerciallogger.model.d dVar, final String str) {
        com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.sdk.l.3
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                KSLoggerReporter.a(ILoggerReporter.Category.ERROR_LOG, com.kwai.adclient.kscommerciallogger.model.d.this, new SDKInitMsg().setInitCount(l.ahw).setErrorReason(str).setInitStatus(2).toJson());
            }
        });
    }
}

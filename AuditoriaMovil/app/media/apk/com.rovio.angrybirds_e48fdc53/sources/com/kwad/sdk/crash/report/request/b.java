package com.kwad.sdk.crash.report.request;

import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.crash.report.ReportEvent;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public interface a {
        void onError(int i, String str);

        void onSuccess();
    }

    public static void a(List<ReportEvent> list, CountDownLatch countDownLatch) {
        a(list, countDownLatch, null);
    }

    public static void a(final List<ReportEvent> list, final CountDownLatch countDownLatch, final a aVar) {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "CrashReportRequestManager request");
        if (list == null || list.size() <= 0) {
            return;
        }
        new m<com.kwad.sdk.crash.report.request.a, CrashReportResult>() { // from class: com.kwad.sdk.crash.report.request.b.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: Fg */
            public com.kwad.sdk.crash.report.request.a createRequest() {
                return new com.kwad.sdk.crash.report.request.a(list);
            }

            private static CrashReportResult eO(String str) {
                JSONObject jSONObject = new JSONObject(str);
                CrashReportResult crashReportResult = new CrashReportResult();
                crashReportResult.parseJson(jSONObject);
                return crashReportResult;
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ CrashReportResult parseData(String str) {
                return eO(str);
            }
        }.request(new p<com.kwad.sdk.crash.report.request.a, CrashReportResult>() { // from class: com.kwad.sdk.crash.report.request.b.2
            private void Fh() {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onSuccess();
                }
            }

            private void n(int i, String str) {
                CountDownLatch countDownLatch2 = countDownLatch;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.onError(i, str);
                }
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(g gVar, int i, String str) {
                n(i, str);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(g gVar, BaseResultData baseResultData) {
                Fh();
            }
        });
    }
}

package com.kwad.components.core.n;

import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.p;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
/* loaded from: classes.dex */
public final class a {
    public static void as(int i) {
        KSLoggerReporter.a(new p.a().dz(ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA("offline_component_performance").C(new b().at(i).w(1L).toJson()).Cc());
    }

    public static void b(int i, long j) {
        KSLoggerReporter.a(new p.a().dz(ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA("offline_component_performance").C(new b().at(i).w(2L).x(j).toJson()).Cc());
    }
}

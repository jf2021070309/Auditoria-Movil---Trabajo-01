package com.ellation.crunchyroll.cast.analytics;

import com.amazon.aps.iva.ds.a;
import com.amazon.aps.iva.es.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.cast.session.CastDeviceWrapper;
import com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal;
import com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener;
import kotlin.Metadata;
/* compiled from: CastAnalytics.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/analytics/CastAnalytics;", "Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "session", "", "s", "Lcom/amazon/aps/iva/kb0/q;", "onSessionStarted", "Lcom/amazon/aps/iva/ds/a;", "analyticsGateway", "Lcom/amazon/aps/iva/ds/a;", "<init>", "(Lcom/amazon/aps/iva/ds/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastAnalytics implements SimpleSessionManagerListener {
    private final a analyticsGateway;

    public CastAnalytics() {
        this(null, 1, null);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionEnded(b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionEnded(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionEnding(b bVar) {
        SimpleSessionManagerListener.DefaultImpls.onSessionEnding(this, bVar);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResumeFailed(b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResumeFailed(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResumed(b bVar, boolean z) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResumed(this, bVar, z);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResuming(b bVar, String str) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResuming(this, bVar, str);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStartFailed(b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionStartFailed(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStarted(CastSessionWrapperInternal castSessionWrapperInternal, String str) {
        j.f(castSessionWrapperInternal, "session");
        j.f(str, "s");
        CastDeviceWrapper castDevice = castSessionWrapperInternal.getCastDevice();
        if (castDevice != null) {
            a aVar = this.analyticsGateway;
            String deviceId = castDevice.getDeviceId();
            String modelName = castDevice.getModelName();
            String version = castDevice.getVersion();
            String hostAddress = castDevice.getHostAddress();
            if (hostAddress == null) {
                hostAddress = "";
            }
            aVar.e(new q(deviceId, modelName, version, hostAddress));
        }
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStarting(b bVar) {
        SimpleSessionManagerListener.DefaultImpls.onSessionStarting(this, bVar);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionSuspended(b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionSuspended(this, bVar, i);
    }

    public CastAnalytics(a aVar) {
        j.f(aVar, "analyticsGateway");
        this.analyticsGateway = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CastAnalytics(com.amazon.aps.iva.ds.a r1, int r2, com.amazon.aps.iva.yb0.e r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L8
            int r1 = com.amazon.aps.iva.ds.a.a
            com.amazon.aps.iva.ds.c r1 = com.amazon.aps.iva.ds.c.b
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.cast.analytics.CastAnalytics.<init>(com.amazon.aps.iva.ds.a, int, com.amazon.aps.iva.yb0.e):void");
    }
}

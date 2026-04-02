package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.cj.b;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal;
import com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CastUserPreferenceProvider.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastUserPreferenceProvider;", "Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "session", "", "s", "Lcom/amazon/aps/iva/kb0/q;", "onSessionStarted", "Lcom/amazon/aps/iva/ye/h;", "chromecastMessenger", "Lcom/amazon/aps/iva/ye/h;", "Lkotlin/Function0;", "Ljava/util/Locale;", "getLocale", "Lcom/amazon/aps/iva/xb0/a;", "", "getAutoplaySetting", "Lcom/amazon/aps/iva/cj/b;", "advertisingInfoProvider", "Lcom/amazon/aps/iva/cj/b;", "<init>", "(Lcom/amazon/aps/iva/ye/h;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/cj/b;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastUserPreferenceProvider implements SimpleSessionManagerListener {
    private final b advertisingInfoProvider;
    private final h chromecastMessenger;
    private final com.amazon.aps.iva.xb0.a<Boolean> getAutoplaySetting;
    private final com.amazon.aps.iva.xb0.a<Locale> getLocale;

    public CastUserPreferenceProvider(h hVar, com.amazon.aps.iva.xb0.a<Locale> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, b bVar) {
        j.f(hVar, "chromecastMessenger");
        j.f(aVar, "getLocale");
        j.f(aVar2, "getAutoplaySetting");
        j.f(bVar, "advertisingInfoProvider");
        this.chromecastMessenger = hVar;
        this.getLocale = aVar;
        this.getAutoplaySetting = aVar2;
        this.advertisingInfoProvider = bVar;
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionEnded(com.amazon.aps.iva.ye.b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionEnded(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionEnding(com.amazon.aps.iva.ye.b bVar) {
        SimpleSessionManagerListener.DefaultImpls.onSessionEnding(this, bVar);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResumeFailed(com.amazon.aps.iva.ye.b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResumeFailed(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResumed(com.amazon.aps.iva.ye.b bVar, boolean z) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResumed(this, bVar, z);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionResuming(com.amazon.aps.iva.ye.b bVar, String str) {
        SimpleSessionManagerListener.DefaultImpls.onSessionResuming(this, bVar, str);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStartFailed(com.amazon.aps.iva.ye.b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionStartFailed(this, bVar, i);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStarted(CastSessionWrapperInternal castSessionWrapperInternal, String str) {
        j.f(castSessionWrapperInternal, "session");
        j.f(str, "s");
        h hVar = this.chromecastMessenger;
        String languageTag = this.getLocale.invoke().toLanguageTag();
        j.e(languageTag, "getLocale().toLanguageTag()");
        hVar.sendMessage(new CastUserPreferences(languageTag, this.getAutoplaySetting.invoke().booleanValue(), new DeviceIdentifiers(this.advertisingInfoProvider.a().a, this.advertisingInfoProvider.a().c, null, null, 12, null)));
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStarting(com.amazon.aps.iva.ye.b bVar) {
        SimpleSessionManagerListener.DefaultImpls.onSessionStarting(this, bVar);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionSuspended(com.amazon.aps.iva.ye.b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionSuspended(this, bVar, i);
    }
}

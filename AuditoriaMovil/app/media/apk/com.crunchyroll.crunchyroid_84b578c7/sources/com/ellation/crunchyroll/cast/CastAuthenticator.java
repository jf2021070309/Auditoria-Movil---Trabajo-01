package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.ts.c;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.h;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import com.ellation.crunchyroll.cast.CastAuthenticator;
import com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal;
import com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.gson.Gson;
import kotlin.Metadata;
/* compiled from: CastAuthenticator.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastAuthenticator;", "Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "session", "", "s", "Lcom/amazon/aps/iva/kb0/q;", "onSessionStarted", "Lcom/amazon/aps/iva/ye/b;", "", "i", "onSessionEnded", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Lcom/amazon/aps/iva/ts/c;", "configuration", "Lcom/amazon/aps/iva/ts/c;", "Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;", "castDeviceInteractor", "Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;", "Lcom/amazon/aps/iva/ye/h;", "chromecastMessenger", "Lcom/amazon/aps/iva/ye/h;", "<init>", "(Lcom/google/gson/Gson;Lcom/amazon/aps/iva/ts/c;Lcom/ellation/crunchyroll/cast/CastDeviceInteractor;Lcom/amazon/aps/iva/ye/h;)V", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastAuthenticator implements SimpleSessionManagerListener {
    public static final String CAST_AUTH_NAMESPACE = "urn:x-cast:etp.authentication";
    public static final Companion Companion = new Companion(null);
    private final CastDeviceInteractor castDeviceInteractor;
    private final h chromecastMessenger;
    private final c configuration;
    private final Gson gson;

    /* compiled from: CastAuthenticator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastAuthenticator$Companion;", "", "()V", "CAST_AUTH_NAMESPACE", "", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public CastAuthenticator(Gson gson, c cVar, CastDeviceInteractor castDeviceInteractor, h hVar) {
        j.f(gson, "gson");
        j.f(cVar, "configuration");
        j.f(castDeviceInteractor, "castDeviceInteractor");
        j.f(hVar, "chromecastMessenger");
        this.gson = gson;
        this.configuration = cVar;
        this.castDeviceInteractor = castDeviceInteractor;
        this.chromecastMessenger = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSessionStarted$lambda$0(CastAuthenticator castAuthenticator, CastDevice castDevice, String str, String str2) {
        j.f(castAuthenticator, "this$0");
        j.f(castDevice, "<anonymous parameter 0>");
        j.f(str, "<anonymous parameter 1>");
        j.f(str2, "message");
        UserCodeBody userCodeBody = (UserCodeBody) castAuthenticator.gson.fromJson(str2, (Class<Object>) UserCodeBody.class);
        CastDeviceInteractor castDeviceInteractor = castAuthenticator.castDeviceInteractor;
        j.e(userCodeBody, "userCodeBody");
        castDeviceInteractor.authDevice(userCodeBody, new CastAuthenticator$onSessionStarted$1$1(userCodeBody), new CastAuthenticator$onSessionStarted$1$2(com.amazon.aps.iva.mf0.a.a));
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionEnded(b bVar, int i) {
        j.f(bVar, "session");
        bVar.removeMessageReceivedCallbacks(CAST_AUTH_NAMESPACE);
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
        castSessionWrapperInternal.setMessageReceivedCallbacks(CAST_AUTH_NAMESPACE, new Cast.MessageReceivedCallback() { // from class: com.amazon.aps.iva.tt.a
            @Override // com.google.android.gms.cast.Cast.MessageReceivedCallback
            public final void onMessageReceived(CastDevice castDevice, String str2, String str3) {
                CastAuthenticator.onSessionStarted$lambda$0(CastAuthenticator.this, castDevice, str2, str3);
            }
        });
        String b = this.configuration.b();
        this.configuration.l();
        this.chromecastMessenger.sendMessage(new CastUserData(b, true, null));
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionStarting(b bVar) {
        SimpleSessionManagerListener.DefaultImpls.onSessionStarting(this, bVar);
    }

    @Override // com.ellation.crunchyroll.cast.sessionmanagerlistener.SimpleSessionManagerListener
    public void onSessionSuspended(b bVar, int i) {
        SimpleSessionManagerListener.DefaultImpls.onSessionSuspended(this, bVar, i);
    }
}

package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.h;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChromecastUserStatusInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/cast/ChromecastUserStatusInteractorImpl;", "Lcom/ellation/crunchyroll/cast/ChromecastUserStatusInteractor;", "Lcom/amazon/aps/iva/kb0/q;", "onSignIn", "onSignOut", "onMaturityStatusUpdate", "onSubscriptionStatusUpdate", "Lcom/amazon/aps/iva/ye/h;", "messenger", "Lcom/amazon/aps/iva/ye/h;", "<init>", "(Lcom/amazon/aps/iva/ye/h;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ChromecastUserStatusInteractorImpl implements ChromecastUserStatusInteractor {
    private final h messenger;

    public ChromecastUserStatusInteractorImpl(h hVar) {
        j.f(hVar, "messenger");
        this.messenger = hVar;
    }

    @Override // com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor
    public void onMaturityStatusUpdate() {
        this.messenger.sendMessage(new UserStatusUpdateEvent("maturity_change"));
    }

    @Override // com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor
    public void onSignIn() {
        this.messenger.sendMessage(new UserStatusUpdateEvent("sign_in"));
    }

    @Override // com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor
    public void onSignOut() {
        this.messenger.sendMessage(new UserStatusUpdateEvent("sign_out"));
    }

    @Override // com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor
    public void onSubscriptionStatusUpdate() {
        this.messenger.sendMessage(new UserStatusUpdateEvent("premium_change"));
    }
}

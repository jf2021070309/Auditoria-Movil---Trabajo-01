package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class zabt implements Runnable {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zabu zab;

    public zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.zab = zabuVar;
        this.zaa = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        zabu zabuVar = this.zab;
        map = zabuVar.zaa.zan;
        apiKey = zabuVar.zac;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (this.zaa.isSuccess()) {
            this.zab.zaf = true;
            client = this.zab.zab;
            if (client.requiresSignIn()) {
                this.zab.zag();
                return;
            }
            try {
                zabu zabuVar2 = this.zab;
                client3 = zabuVar2.zab;
                client4 = zabuVar2.zab;
                client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
                return;
            } catch (SecurityException unused) {
                client2 = this.zab.zab;
                client2.disconnect("Failed to get service from broker.");
                zabqVar.zar(new ConnectionResult(10), null);
                return;
            }
        }
        zabqVar.zar(this.zaa, null);
    }
}

package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import c.q.a.a;
import c.q.b.b;
import com.google.android.gms.common.api.GoogleApiClient;
/* loaded from: classes.dex */
public final class zbw implements a.InterfaceC0047a {
    public final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // c.q.a.a.InterfaceC0047a
    public final b onCreateLoader(int i2, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // c.q.a.a.InterfaceC0047a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        Void r3 = (Void) obj;
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(signInHubActivity));
        this.zba.finish();
    }

    @Override // c.q.a.a.InterfaceC0047a
    public final void onLoaderReset(b bVar) {
    }
}

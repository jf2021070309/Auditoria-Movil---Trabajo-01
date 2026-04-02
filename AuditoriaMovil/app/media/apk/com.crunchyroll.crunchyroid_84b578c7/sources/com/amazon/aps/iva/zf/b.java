package com.amazon.aps.iva.zf;

import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
/* compiled from: CredentialsProviderFeature.kt */
/* loaded from: classes.dex */
public final class b implements com.crunchyroll.credentialsprovider.a, a {
    public final RefreshTokenStorage b;

    public b(RefreshTokenStorage refreshTokenStorage) {
        this.b = refreshTokenStorage;
    }

    @Override // com.amazon.aps.iva.zf.a
    public final RefreshTokenStorage getRefreshTokenStorage() {
        return this.b;
    }
}

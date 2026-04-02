package com.amazon.aps.iva.fm;

import android.content.Context;
import com.amazon.aps.iva.ox.d;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
/* compiled from: ProfilesDependencies.kt */
/* loaded from: classes2.dex */
public interface f {
    d.b a();

    com.amazon.aps.iva.m30.a b();

    String c();

    com.amazon.aps.iva.m30.b d();

    d.a e();

    com.amazon.aps.iva.ox.a f();

    Context g();

    EtpAccountService getAccountService();

    DigitalAssetManagementService getAssetsService();

    JwtInvalidator getJwtInvalidator();

    RefreshTokenMonitor getRefreshTokenMonitor();
}

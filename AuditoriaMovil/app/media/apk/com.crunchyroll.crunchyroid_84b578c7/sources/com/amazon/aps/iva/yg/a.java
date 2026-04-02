package com.amazon.aps.iva.yg;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.bj.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
/* compiled from: AccountPendingStateFeature.kt */
/* loaded from: classes.dex */
public interface a {
    n a(androidx.fragment.app.h hVar);

    n b(Fragment fragment);

    l<Activity, Boolean> d();

    com.amazon.aps.iva.xb0.a<q> e();

    com.amazon.aps.iva.xb0.a<String> g();

    EtpAccountService getAccountService();

    AccountStateProvider getAccountStateProvider();

    UserTokenInteractor getUserTokenInteractor();
}

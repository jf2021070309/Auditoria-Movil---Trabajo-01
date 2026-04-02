package com.amazon.aps.iva.kd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.t;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import kotlin.Metadata;
/* compiled from: ChangeEmailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/kd/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c extends Fragment {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] c = {q.a(c.class, "viewModel", "getViewModel()Lcom/crunchyroll/account/changeemail/ChangeEmailViewModelImpl;", 0)};
    public final com.amazon.aps.iva.ez.f b = new com.amazon.aps.iva.ez.f(this, p.class, a.h);

    /* compiled from: ChangeEmailFragment.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, p> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final p invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.jd.e eVar = w.a;
            if (eVar != null) {
                EtpAccountService accountService = eVar.getAccountService();
                com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
                e eVar2 = new e(accountService);
                com.amazon.aps.iva.jd.e eVar3 = w.a;
                if (eVar3 != null) {
                    AccountStateProvider accountStateProvider = eVar3.getAccountStateProvider();
                    com.amazon.aps.iva.jd.e eVar4 = w.a;
                    if (eVar4 != null) {
                        return new p(eVar2, accountStateProvider, eVar4.b());
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return t.a(this, com.amazon.aps.iva.v0.b.c(-1484922575, new b(this), true));
    }
}

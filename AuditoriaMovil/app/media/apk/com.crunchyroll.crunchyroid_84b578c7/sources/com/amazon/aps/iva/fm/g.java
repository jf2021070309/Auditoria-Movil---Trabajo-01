package com.amazon.aps.iva.fm;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.am.h;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.om.o;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: ProfilesFeatureImpl.kt */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.pm.a {
    public static f e;
    public static g f;
    public final com.amazon.aps.iva.pm.c a = com.amazon.aps.iva.n1.c.h(a.a().getAccountService(), a.a().d(), a.a().b());
    public final o b = new o(a.a().g(), a.a().e());
    public final e c = new e();
    public final com.amazon.aps.iva.zl.b d;

    /* compiled from: ProfilesFeatureImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a() {
            f fVar = g.e;
            if (fVar != null) {
                return fVar;
            }
            j.m("dependencies");
            throw null;
        }
    }

    public g() {
        f a2 = a.a();
        com.amazon.aps.iva.xe0.d j = z.j();
        EtpAccountService accountService = a2.getAccountService();
        j.f(accountService, "accountService");
        com.amazon.aps.iva.am.c cVar = new com.amazon.aps.iva.am.c(accountService);
        EtpAccountService accountService2 = a2.getAccountService();
        j.f(accountService2, "accountService");
        com.amazon.aps.iva.am.e eVar = new com.amazon.aps.iva.am.e(accountService2);
        f fVar = e;
        if (fVar != null) {
            Context g = fVar.g();
            j.f(g, "context");
            com.amazon.aps.iva.am.f fVar2 = com.amazon.aps.iva.am.f.h;
            j.f(fVar2, "valueKey");
            this.d = new com.amazon.aps.iva.zl.b(j, cVar, eVar, new h(new com.amazon.aps.iva.si.b(g, fVar2)), a2.getRefreshTokenMonitor());
            return;
        }
        j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.pm.a
    public final com.amazon.aps.iva.pm.b a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.pm.a
    public final com.amazon.aps.iva.pm.e b() {
        return a.a().d();
    }

    public final void c(FragmentManager fragmentManager) {
        com.amazon.aps.iva.tm.c.c.getClass();
        new com.amazon.aps.iva.tm.c().show(fragmentManager, "SWITCH_PROFILE_BOTTOM_SHEET");
    }

    public final void d(androidx.fragment.app.h hVar, String str) {
        int i = AvatarSelectionActivity.n;
        Intent intent = new Intent(hVar, AvatarSelectionActivity.class);
        intent.putExtra("avatar_username", str);
        hVar.startActivity(intent);
    }
}

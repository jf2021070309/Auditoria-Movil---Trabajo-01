package com.amazon.aps.iva.yd;

import android.content.Intent;
import com.amazon.aps.iva.de.b;
import com.amazon.aps.iva.e4.l1;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.notifications.NotificationSettingsInteractor;
/* compiled from: EmailMandatoryModule.kt */
/* loaded from: classes.dex */
public final class k {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(k.class, "viewModel", "getViewModel()Lcom/crunchyroll/auth/emailmandatory/EmailMandatoryViewModelImpl;", 0)};
    public final EmailMandatoryActivity a;
    public final f b;
    public final com.amazon.aps.iva.ez.a c;
    public final com.amazon.aps.iva.kb0.m d;

    /* compiled from: EmailMandatoryModule.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<l> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final l invoke() {
            k kVar = k.this;
            EmailMandatoryActivity emailMandatoryActivity = kVar.a;
            Intent intent = emailMandatoryActivity.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            g gVar = new g(intent.getBooleanExtra("email_mandatory_is_sign_up", false));
            z zVar = (z) kVar.c.getValue(kVar, k.e[0]);
            com.amazon.aps.iva.de.b.a.getClass();
            com.amazon.aps.iva.de.c cVar = b.a.b;
            com.amazon.aps.iva.vd.e eVar = l1.f;
            if (eVar != null) {
                j jVar = new j(eVar);
                com.amazon.aps.iva.yb0.j.f(cVar, "messageMonitor");
                f fVar = kVar.b;
                com.amazon.aps.iva.yb0.j.f(fVar, "analytics");
                return new p(emailMandatoryActivity, gVar, zVar, cVar, fVar, jVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: EmailMandatoryModule.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, z> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.vd.e eVar = l1.f;
            if (eVar != null) {
                EtpAccountService accountService = eVar.getAccountService();
                com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
                i iVar = new i(accountService);
                com.amazon.aps.iva.vd.e eVar2 = l1.f;
                if (eVar2 != null) {
                    NotificationSettingsInteractor d = eVar2.d();
                    f fVar = k.this.b;
                    com.amazon.aps.iva.vd.e eVar3 = l1.f;
                    if (eVar3 != null) {
                        return new z(iVar, eVar3.a(), d, fVar);
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

    public k(EmailMandatoryActivity emailMandatoryActivity) {
        com.amazon.aps.iva.yb0.j.f(emailMandatoryActivity, "activity");
        this.a = emailMandatoryActivity;
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.b = new f();
        this.c = new com.amazon.aps.iva.ez.a(z.class, new b(emailMandatoryActivity), new c());
        this.d = com.amazon.aps.iva.kb0.f.b(new a());
    }

    public final l a() {
        return (l) this.d.getValue();
    }
}

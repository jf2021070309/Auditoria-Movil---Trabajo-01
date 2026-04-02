package com.amazon.aps.iva.jm;

import com.amazon.aps.iva.p60.f;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
/* compiled from: AvatarSelectionModule.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.k.q.a(g.class, "avatarSelectionViewModel", "getAvatarSelectionViewModel()Lcom/crunchyroll/profiles/presentation/avatar/AvatarSelectionViewModelImpl;", 0)};
    public final AvatarSelectionActivity a;
    public final DigitalAssetManagementService b;
    public final EtpAccountService c;
    public final y d;
    public final com.amazon.aps.iva.pm.e e;
    public final com.amazon.aps.iva.kb0.m f;
    public final com.amazon.aps.iva.ez.a g;
    public final com.amazon.aps.iva.kb0.m h;

    /* compiled from: AvatarSelectionModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            g gVar = g.this;
            DigitalAssetManagementService digitalAssetManagementService = gVar.b;
            com.amazon.aps.iva.p60.g a = f.a.a(gVar.a, GsonHolder.getInstance());
            com.amazon.aps.iva.yb0.j.f(digitalAssetManagementService, "assetsService");
            EtpAccountService etpAccountService = gVar.c;
            com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
            return new f(digitalAssetManagementService, etpAccountService, a);
        }
    }

    /* compiled from: AvatarSelectionModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            g gVar = g.this;
            return new q(gVar.d, gVar.a.getIntent().getStringExtra("avatar_username"), (e) gVar.f.getValue(), com.amazon.aps.iva.n1.c.h(gVar.c, gVar.e, gVar.d));
        }
    }

    /* compiled from: AvatarSelectionModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            g gVar = g.this;
            AvatarSelectionActivity avatarSelectionActivity = gVar.a;
            com.amazon.aps.iva.fc0.l<?> lVar = g.i[0];
            com.amazon.aps.iva.yb0.j.f(avatarSelectionActivity, "view");
            return new i(avatarSelectionActivity, (q) gVar.g.getValue(gVar, lVar));
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    public g(AvatarSelectionActivity avatarSelectionActivity, DigitalAssetManagementService digitalAssetManagementService, EtpAccountService etpAccountService, y yVar, com.amazon.aps.iva.pm.e eVar) {
        com.amazon.aps.iva.yb0.j.f(digitalAssetManagementService, "assetsService");
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(yVar, "userAssetsProvider");
        com.amazon.aps.iva.yb0.j.f(eVar, "userProfileStore");
        this.a = avatarSelectionActivity;
        this.b = digitalAssetManagementService;
        this.c = etpAccountService;
        this.d = yVar;
        this.e = eVar;
        this.f = com.amazon.aps.iva.kb0.f.b(new a());
        this.g = new com.amazon.aps.iva.ez.a(q.class, new d(avatarSelectionActivity), new b());
        this.h = com.amazon.aps.iva.kb0.f.b(new c());
    }
}

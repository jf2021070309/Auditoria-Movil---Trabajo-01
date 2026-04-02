package com.amazon.aps.iva.qm;

import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: ProfileActivationRouter.kt */
/* loaded from: classes2.dex */
public final class y {
    public final com.amazon.aps.iva.pm.d a;
    public final c b;
    public final com.amazon.aps.iva.fm.d c;

    public y(com.amazon.aps.iva.pm.d dVar, i iVar, com.amazon.aps.iva.fm.d dVar2) {
        this.a = dVar;
        this.b = iVar;
        this.c = dVar2;
    }

    public final void a(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        boolean z;
        boolean z2;
        String avatar;
        String username;
        com.amazon.aps.iva.yb0.j.f(aVar, "onProfileAlreadyActivated");
        com.amazon.aps.iva.fm.d dVar = this.c;
        dVar.a();
        com.amazon.aps.iva.pm.d dVar2 = this.a;
        ProfileApiModel profileApiModel = (ProfileApiModel) dVar2.b().d();
        boolean z3 = false;
        if (profileApiModel != null && (username = profileApiModel.getUsername()) != null && (!com.amazon.aps.iva.oe0.m.b0(username))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ProfileApiModel profileApiModel2 = (ProfileApiModel) dVar2.b().d();
            if (profileApiModel2 != null && (avatar = profileApiModel2.getAvatar()) != null && (!com.amazon.aps.iva.oe0.m.b0(avatar))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            aVar.invoke();
            dVar.c();
            return;
        }
        this.b.a(new w(dVar), new x(dVar));
    }
}

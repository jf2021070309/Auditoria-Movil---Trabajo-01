package com.amazon.aps.iva.u20;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.rs.q;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.cta.ManageMembershipCtaButton;
/* compiled from: ManageMembershipCtaButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> implements a {
    public final q b;

    public b(ManageMembershipCtaButton manageMembershipCtaButton, q qVar) {
        super(manageMembershipCtaButton, new j[0]);
        this.b = qVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.amazon.aps.iva.u20.a
    public final void M1(String str, String str2) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "selectedSku");
        com.amazon.aps.iva.yb0.j.f(str2, "activeSubscriptionSku");
        boolean z2 = false;
        switch (str2.hashCode()) {
            case -1666493765:
                if (str2.equals("crunchyroll.google.fanpack.monthly")) {
                    z = f1.K("crunchyroll.google.superfanpack.monthly", "crunchyroll.google.fanpack.annually").contains(str);
                    break;
                }
                z = false;
                break;
            case -1574954394:
                if (str2.equals("crunchyroll.google.premium.monthly")) {
                    z = f1.K("crunchyroll.google.fanpack.monthly", "crunchyroll.google.superfanpack.monthly", "crunchyroll.google.fanpack.annually").contains(str);
                    break;
                }
                z = false;
                break;
            case -447375682:
                str2.equals("crunchyroll.google.fanpack.annually");
                z = false;
                break;
            case 1568935424:
                str2.equals("crunchyroll.google.superfanpack.monthly");
                z = false;
                break;
            default:
                z = false;
                break;
        }
        if (com.amazon.aps.iva.yb0.j.a(str, str2) || z) {
            z2 = true;
        }
        boolean z3 = !this.b.O0();
        if (z2) {
            getView().g9();
            if (z) {
                getView().H7(str);
                return;
            } else if (z3) {
                getView().Ya();
                return;
            } else {
                getView().Aa();
                return;
            }
        }
        getView().p1();
    }
}

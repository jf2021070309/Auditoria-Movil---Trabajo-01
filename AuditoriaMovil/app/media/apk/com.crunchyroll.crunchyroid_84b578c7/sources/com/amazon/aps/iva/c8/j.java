package com.amazon.aps.iva.c8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.media3.ui.c;
import com.amazon.aps.iva.cp.a;
import com.amazon.aps.iva.gt.c;
import com.amazon.aps.iva.hv.a;
import com.amazon.aps.iva.l20.b;
import com.amazon.aps.iva.r10.n;
import com.amazon.aps.iva.te.d;
import com.amazon.aps.iva.z00.a;
import com.amazon.aps.iva.z20.d;
import com.crunchyroll.billingnotifications.card.BillingNotificationCard;
import com.crunchyroll.contentunavailable.ContentUnavailableLayout;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.player.settings.reportproblem.button.ReportProblemButton;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.offlineaccess.OfflineAccessSubscriptionButton;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle extras;
        Object obj;
        Object serializable;
        int i = this.b;
        com.amazon.aps.iva.js.i iVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                c.f fVar = (c.f) obj2;
                int adapterPosition = fVar.getAdapterPosition();
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                View view2 = cVar.A;
                if (adapterPosition == 0) {
                    view2.getClass();
                    cVar.e(cVar.h, view2);
                    return;
                } else if (adapterPosition == 1) {
                    view2.getClass();
                    cVar.e(cVar.j, view2);
                    return;
                } else {
                    cVar.l.dismiss();
                    return;
                }
            case 1:
                BillingNotificationCard billingNotificationCard = (BillingNotificationCard) obj2;
                int i2 = BillingNotificationCard.e;
                com.amazon.aps.iva.yb0.j.f(billingNotificationCard, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                com.amazon.aps.iva.fs.b p = com.amazon.aps.iva.ab.r.p(view, null);
                com.crunchyroll.billingnotifications.card.b bVar = billingNotificationCard.b;
                bVar.getClass();
                bVar.g.a();
                com.crunchyroll.billingnotifications.card.c cVar2 = bVar.h;
                if (cVar2 != null) {
                    boolean z = cVar2 instanceof com.crunchyroll.billingnotifications.card.d;
                    com.amazon.aps.iva.oe.a aVar = bVar.d;
                    if (z) {
                        aVar.h(p);
                        return;
                    } else if (cVar2 instanceof com.crunchyroll.billingnotifications.card.e) {
                        aVar.i(p);
                        return;
                    } else {
                        return;
                    }
                }
                com.amazon.aps.iva.yb0.j.m("uiModel");
                throw null;
            case 2:
                com.amazon.aps.iva.te.d dVar = (com.amazon.aps.iva.te.d) obj2;
                d.a aVar2 = com.amazon.aps.iva.te.d.f;
                com.amazon.aps.iva.yb0.j.f(dVar, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.te.e) dVar.d.getValue()).d(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 3:
                ContentUnavailableLayout contentUnavailableLayout = (ContentUnavailableLayout) obj2;
                int i3 = ContentUnavailableLayout.c;
                com.amazon.aps.iva.yb0.j.f(contentUnavailableLayout, "this$0");
                Context context = contentUnavailableLayout.getContext();
                com.amazon.aps.iva.yb0.j.d(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).onBackPressed();
                return;
            case 4:
                ArtistActivity artistActivity = (ArtistActivity) obj2;
                int i4 = ArtistActivity.m;
                com.amazon.aps.iva.yb0.j.f(artistActivity, "this$0");
                artistActivity.ni().getPresenter().H2();
                return;
            case 5:
                ReportProblemButton.G((ReportProblemButton) obj2);
                return;
            case 6:
                AvatarSelectionActivity avatarSelectionActivity = (AvatarSelectionActivity) obj2;
                int i5 = AvatarSelectionActivity.n;
                com.amazon.aps.iva.yb0.j.f(avatarSelectionActivity, "this$0");
                avatarSelectionActivity.mi().c();
                return;
            case 7:
                ProfileActivationActivityLegacy profileActivationActivityLegacy = (ProfileActivationActivityLegacy) obj2;
                int i6 = ProfileActivationActivityLegacy.m;
                com.amazon.aps.iva.yb0.j.f(profileActivationActivityLegacy, "this$0");
                profileActivationActivityLegacy.mi().getPresenter().c();
                return;
            case 8:
                com.amazon.aps.iva.cp.a aVar3 = (com.amazon.aps.iva.cp.a) obj2;
                a.C0183a c0183a = com.amazon.aps.iva.cp.a.m;
                com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                ((com.amazon.aps.iva.cp.e) aVar3.l.getValue()).e6();
                return;
            case 9:
                com.amazon.aps.iva.gt.c cVar3 = (com.amazon.aps.iva.gt.c) obj2;
                c.a aVar4 = com.amazon.aps.iva.gt.c.k;
                com.amazon.aps.iva.yb0.j.f(cVar3, "this$0");
                cVar3.ci().c();
                return;
            case 10:
                com.amazon.aps.iva.hv.a aVar5 = (com.amazon.aps.iva.hv.a) obj2;
                a.C0345a c0345a = com.amazon.aps.iva.hv.a.g;
                com.amazon.aps.iva.yb0.j.f(aVar5, "this$0");
                aVar5.ei().getPresenter().u();
                return;
            case 11:
                com.amazon.aps.iva.xz.b bVar2 = (com.amazon.aps.iva.xz.b) obj2;
                int i7 = com.amazon.aps.iva.xz.b.c;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                com.amazon.aps.iva.fs.b p2 = com.amazon.aps.iva.ab.r.p(view, null);
                com.amazon.aps.iva.xz.c cVar4 = bVar2.b;
                cVar4.getClass();
                cVar4.b.e(p2, cVar4.c);
                cVar4.d.C();
                return;
            case 12:
                com.amazon.aps.iva.f00.u uVar = (com.amazon.aps.iva.f00.u) obj2;
                com.amazon.aps.iva.yb0.j.f(uVar, "this$0");
                com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar6 = uVar.f;
                if (aVar6 != null) {
                    aVar6.invoke();
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("onSyncMoreClick");
                    throw null;
                }
            case 13:
                com.amazon.aps.iva.z00.a aVar7 = (com.amazon.aps.iva.z00.a) obj2;
                a.C0907a c0907a = com.amazon.aps.iva.z00.a.i;
                com.amazon.aps.iva.yb0.j.f(aVar7, "this$0");
                aVar7.dismiss();
                return;
            case 14:
                com.amazon.aps.iva.r10.n nVar = (com.amazon.aps.iva.r10.n) obj2;
                n.a aVar8 = com.amazon.aps.iva.r10.n.w;
                com.amazon.aps.iva.yb0.j.f(nVar, "this$0");
                nVar.ei().w();
                return;
            case 15:
                SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout = (SubscriptionAlternativeFlowLayout) obj2;
                int i8 = SubscriptionAlternativeFlowLayout.f;
                com.amazon.aps.iva.yb0.j.f(subscriptionAlternativeFlowLayout, "this$0");
                com.amazon.aps.iva.h20.g gVar = subscriptionAlternativeFlowLayout.e;
                if (gVar != null) {
                    gVar.c();
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("presenter");
                    throw null;
                }
            case 16:
                com.amazon.aps.iva.l20.b bVar3 = (com.amazon.aps.iva.l20.b) obj2;
                b.a aVar9 = com.amazon.aps.iva.l20.b.f;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.l20.c) bVar3.e.getValue()).N4(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 17:
                UpgradeActivity upgradeActivity = (UpgradeActivity) obj2;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = UpgradeActivity.r;
                com.amazon.aps.iva.yb0.j.f(upgradeActivity, "this$0");
                com.amazon.aps.iva.s20.i oi = upgradeActivity.oi();
                com.amazon.aps.iva.fs.b p3 = com.amazon.aps.iva.ab.r.p(upgradeActivity.ni().g.getButtonTextView(), null);
                Intent intent = upgradeActivity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = extras.getSerializable("UPGRADE_EXTRA_EVENT_SOURCE_PROPERTY", com.amazon.aps.iva.js.i.class);
                        obj = serializable;
                    } else {
                        obj = (com.amazon.aps.iva.js.i) extras.getSerializable("UPGRADE_EXTRA_EVENT_SOURCE_PROPERTY");
                    }
                    iVar = (com.amazon.aps.iva.js.i) obj;
                }
                com.amazon.aps.iva.yb0.j.c(iVar);
                oi.Y(p3, iVar);
                return;
            default:
                com.amazon.aps.iva.z20.d dVar2 = (com.amazon.aps.iva.z20.d) obj2;
                d.a aVar10 = com.amazon.aps.iva.z20.d.k;
                com.amazon.aps.iva.yb0.j.f(dVar2, "this$0");
                ((com.amazon.aps.iva.z20.e) dVar2.i.getValue()).W0(com.amazon.aps.iva.ab.r.p(((OfflineAccessSubscriptionButton) dVar2.h.getValue(dVar2, com.amazon.aps.iva.z20.d.l[6])).getButtonTextView(), null), null);
                com.amazon.aps.iva.wy.d.setFragmentResult$default(dVar2, "ON_GO_PREMIUM_BUTTON_CLICKED", null, 2, null);
                return;
        }
    }
}

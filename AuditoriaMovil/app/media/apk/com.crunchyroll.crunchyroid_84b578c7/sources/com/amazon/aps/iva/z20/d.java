package com.amazon.aps.iva.z20;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.offlineaccess.OfflineAccessSubscriptionButton;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: OfflineAccessUpsellDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/z20/d;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/z20/h;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.d implements h, com.amazon.aps.iva.us.a {
    public final v b;
    public final v c;
    public final s d;
    public final s e;
    public final v f;
    public final v g;
    public final v h;
    public final m i;
    public final com.amazon.aps.iva.ls.a j;
    public static final /* synthetic */ l<Object>[] l = {q.a(d.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(d.class, MediaTrack.ROLE_SUBTITLE, "getSubtitle()Landroid/widget/TextView;", 0), defpackage.e.b(d.class, "asset", "getAsset()Lcom/ellation/crunchyroll/model/PlayableAsset;", 0), defpackage.e.b(d.class, "accessReason", "getAccessReason()Lcom/crunchyroll/multitiersubscription/offlineaccess/AccessReason;", 0), q.a(d.class, "headerImage", "getHeaderImage()Landroid/widget/ImageView;", 0), q.a(d.class, "closeButton", "getCloseButton()Landroid/view/View;", 0), q.a(d.class, "subscriptionButton", "getSubscriptionButton()Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscriptionbutton/offlineaccess/OfflineAccessSubscriptionButton;", 0)};
    public static final a k = new a();

    /* compiled from: OfflineAccessUpsellDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: OfflineAccessUpsellDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            a aVar = d.k;
            d dVar = d.this;
            dVar.getClass();
            l<?>[] lVarArr = d.l;
            PlayableAsset playableAsset = (PlayableAsset) dVar.d.getValue(dVar, lVarArr[2]);
            com.amazon.aps.iva.vh.a aVar2 = (com.amazon.aps.iva.vh.a) dVar.e.getValue(dVar, lVarArr[3]);
            Context requireContext = dVar.requireContext();
            j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.z20.b bVar = new com.amazon.aps.iva.z20.b(requireContext);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ks.e b = w.d.b((PlayableAsset) dVar.d.getValue(dVar, lVarArr[2]));
            i iVar = i.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.xb0.a<Boolean> t = iVar.t();
                j.f(t, "hasPremiumBenefit");
                com.amazon.aps.iva.r20.b bVar2 = new com.amazon.aps.iva.r20.b(b, null, t);
                i iVar2 = i.a.a;
                if (iVar2 != null) {
                    com.amazon.aps.iva.wh.d c = iVar2.c();
                    j.f(c, "subscriptionProductStore");
                    return new f(dVar, playableAsset, aVar2, bVar, bVar2, c);
                }
                j.m("dependencies");
                throw null;
            }
            j.m("dependencies");
            throw null;
        }
    }

    public d() {
        super(null, 1, null);
        this.b = com.amazon.aps.iva.xw.g.e(this, R.id.premium_upsell_dialog_title);
        this.c = com.amazon.aps.iva.xw.g.e(this, R.id.premium_upsell_dialog_subtitle);
        this.d = new s("asset");
        this.e = new s("accessReason");
        this.f = com.amazon.aps.iva.xw.g.e(this, R.id.premium_upsell_dialog_header);
        this.g = com.amazon.aps.iva.xw.g.e(this, R.id.premium_upsell_dialog_close);
        this.h = com.amazon.aps.iva.xw.g.e(this, R.id.premium_upsell_subscription_button);
        this.i = com.amazon.aps.iva.kb0.f.b(new b());
        this.j = com.amazon.aps.iva.ls.a.EPISODE;
    }

    @Override // com.amazon.aps.iva.z20.h
    public final void S8(String str) {
        j.f(str, "text");
        ((TextView) this.c.getValue(this, l[1])).setText(str);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.z20.h
    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.DialogTheme);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_premium_upsell, viewGroup);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getResources().getDimensionPixelSize(R.dimen.dialog_premium_upsell_width), -2);
            window.setGravity(17);
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        if (bundle != null) {
            dismiss();
            return;
        }
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = l;
        ((View) this.g.getValue(this, lVarArr[5])).setOnClickListener(new com.amazon.aps.iva.fe.a(this, 16));
        ((OfflineAccessSubscriptionButton) this.h.getValue(this, lVarArr[6])).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 18));
    }

    @Override // com.amazon.aps.iva.z20.h
    public final void q6(List<Image> list) {
        j.f(list, "thumbnails");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.ly.c.c(imageUtil, requireContext, list, (ImageView) this.f.getValue(this, l[4]), R.drawable.content_placeholder);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((e) this.i.getValue());
    }

    @Override // com.amazon.aps.iva.z20.h
    public final void w2(String str) {
        j.f(str, "text");
        ((TextView) this.b.getValue(this, l[0])).setText(str);
    }
}

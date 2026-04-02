package com.amazon.aps.iva.gt;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BentoUpsellDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/gt/c;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/gt/h;", "<init>", "()V", "a", "home-feed_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.d implements h {
    public final v b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final s h;
    public final s i;
    public final m j;
    public static final /* synthetic */ l<Object>[] l = {q.a(c.class, "closeButton", "getCloseButton()Landroid/widget/ImageView;", 0), q.a(c.class, "bentoUpsellCta", "getBentoUpsellCta()Landroid/view/View;", 0), q.a(c.class, "bentoUpsellCtaText", "getBentoUpsellCtaText()Landroid/widget/TextView;", 0), q.a(c.class, "modalPreviewCta", "getModalPreviewCta()Landroid/widget/TextView;", 0), q.a(c.class, "modalTitle", "getModalTitle()Landroid/widget/TextView;", 0), q.a(c.class, "modalDetail", "getModalDetail()Landroid/widget/TextView;", 0), defpackage.e.b(c.class, "gameTitle", "getGameTitle()Ljava/lang/String;", 0), defpackage.e.b(c.class, "gameLink", "getGameLink()Ljava/lang/String;", 0)};
    public static final a k = new a();

    /* compiled from: BentoUpsellDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: BentoUpsellDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            a aVar = c.k;
            c cVar = c.this;
            cVar.getClass();
            l<?>[] lVarArr = c.l;
            String str = (String) cVar.i.getValue(cVar, lVarArr[7]);
            com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.gt.b bVar = new com.amazon.aps.iva.gt.b();
            k kVar = i.f;
            if (kVar != null) {
                com.amazon.aps.iva.xh.b a = a.C0616a.a(kVar.c(), cVar, com.amazon.aps.iva.xh.a.BENTO_GAME, (String) cVar.i.getValue(cVar, lVarArr[7]), null, i.CR_VOD_GAMEVAULT, 8);
                d dVar = d.h;
                j.f(dVar, "hasPremiumBenefit");
                j.f(a, "router");
                return new g(cVar, str, dVar, bVar, a);
            }
            j.m("dependencies");
            throw null;
        }
    }

    public c() {
        super(Integer.valueOf((int) R.layout.layout_bento_upsell_modal));
        this.b = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_modal_close_button);
        this.c = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_cta);
        this.d = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_cta_text);
        this.e = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_modal_preview_cta);
        this.f = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_modal_title);
        this.g = com.amazon.aps.iva.xw.g.e(this, R.id.bento_upsell_modal_detail);
        this.h = new s("gameTitle");
        this.i = new s("gameLink");
        this.j = com.amazon.aps.iva.kb0.f.b(new b());
    }

    @Override // com.amazon.aps.iva.gt.h
    public final void Gg() {
        ((TextView) this.g.getValue(this, l[5])).setText(requireContext().getString(R.string.bento_upsell_access_subtitle));
    }

    @Override // com.amazon.aps.iva.gt.h
    public final void P0(String str) {
        j.f(str, "gameLink");
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(requireContext, "");
        String string = getString(R.string.something_wrong);
        j.e(string, "getString(CommonResources.string.something_wrong)");
        cVar.s1(str, "", string);
    }

    @Override // com.amazon.aps.iva.gt.h
    public final void Z0() {
        ((TextView) this.f.getValue(this, l[4])).setText(requireContext().getString(R.string.bento_subscription_modal_title_upsell));
    }

    public final e ci() {
        return (e) this.j.getValue();
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.BentoDialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onStart();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null && (windowManager = window.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.bento_upsell_dialog_width);
        if (window != null) {
            if (i >= dimensionPixelOffset) {
                i = dimensionPixelOffset;
            }
            window.setLayout(i, -2);
        }
        if (window != null) {
            window.setClipToOutline(false);
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        ci().Z3();
        l<?>[] lVarArr = l;
        ((ImageView) this.b.getValue(this, lVarArr[0])).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 9));
        ((View) this.c.getValue(this, lVarArr[1])).setOnClickListener(new com.amazon.aps.iva.c8.k(this, 8));
        ((TextView) this.e.getValue(this, lVarArr[3])).setOnClickListener(new r(this, 7));
    }

    @Override // com.amazon.aps.iva.gt.h
    public final void setCtaTitle(int i) {
        ((TextView) this.d.getValue(this, l[2])).setText(requireContext().getString(i));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ci());
    }
}

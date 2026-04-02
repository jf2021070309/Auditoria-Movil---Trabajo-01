package com.amazon.aps.iva.cp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.cast.MediaTrack;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: LanguageUnavailableDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/aps/iva/cp/a;", "Ljava/io/Serializable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/i60/c;", "Lcom/amazon/aps/iva/cp/g;", "<init>", "()V", "a", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a<T extends Serializable> extends com.amazon.aps.iva.i60.c implements g {
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final v j;
    public final s k;
    public final m l;
    public static final /* synthetic */ l<Object>[] n = {q.a(a.class, "closeButton", "getCloseButton()Landroid/view/View;", 0), q.a(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(a.class, MediaTrack.ROLE_SUBTITLE, "getSubtitle()Landroid/widget/TextView;", 0), q.a(a.class, "positiveButton", "getPositiveButton()Landroid/view/View;", 0), q.a(a.class, "positiveButtonText", "getPositiveButtonText()Landroid/widget/TextView;", 0), q.a(a.class, "negativeButton", "getNegativeButton()Landroid/view/View;", 0), q.a(a.class, "imageViewPoster", "getImageViewPoster()Landroid/widget/ImageView;", 0), defpackage.e.b(a.class, "uiModel", "getUiModel()Lcom/crunchyroll/watchscreen/screen/languageunavailable/LanguageUnavailableDialogUiModel;", 0)};
    public static final C0183a m = new C0183a();

    /* compiled from: LanguageUnavailableDialog.kt */
    /* renamed from: com.amazon.aps.iva.cp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0183a {
    }

    /* compiled from: LanguageUnavailableDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e> {
        public final /* synthetic */ a<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e invoke() {
            C0183a c0183a = a.m;
            a<T> aVar = this.h;
            aVar.getClass();
            c cVar = (c) aVar.k.getValue(aVar, a.n[7]);
            androidx.fragment.app.h activity = aVar.getActivity();
            j.d(activity, "null cannot be cast to non-null type com.crunchyroll.watchscreen.screen.languageunavailable.LanguageUnavailableDialogListener<T of com.crunchyroll.watchscreen.screen.languageunavailable.LanguageUnavailableDialog>");
            com.amazon.aps.iva.cp.b bVar = (com.amazon.aps.iva.cp.b) activity;
            Context requireContext = aVar.requireContext();
            j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.kh.d dVar = t.a;
            if (dVar != null) {
                Context requireContext2 = aVar.requireContext();
                j.e(requireContext2, "requireContext()");
                return new f(aVar, cVar, bVar, new h(requireContext, dVar.a(requireContext2)));
            }
            j.m("instance");
            throw null;
        }
    }

    public a() {
        super(Integer.valueOf((int) R.layout.dialog_language_unavailable), 0, 6);
        this.d = com.amazon.aps.iva.xw.g.e(this, R.id.language_unavailable_dialog_close_button);
        this.e = com.amazon.aps.iva.xw.g.e(this, R.id.language_unavailable_dialog_title);
        this.f = com.amazon.aps.iva.xw.g.e(this, R.id.language_unavailable_dialog_subtitle);
        this.g = com.amazon.aps.iva.xw.g.e(this, R.id.positive_button);
        this.h = com.amazon.aps.iva.xw.g.e(this, R.id.positive_button_text);
        this.i = com.amazon.aps.iva.xw.g.e(this, R.id.negative_button);
        this.j = com.amazon.aps.iva.xw.g.e(this, R.id.language_unavailable_dialog_image_view_poster);
        this.k = new s("uiModel");
        this.l = com.amazon.aps.iva.kb0.f.b(new b(this));
    }

    @Override // com.amazon.aps.iva.cp.g
    public final void T6(String str) {
        j.f(str, "title");
        ((TextView) this.e.getValue(this, n[1])).setText(str);
    }

    @Override // com.amazon.aps.iva.cp.g
    public final void e9(String str) {
        j.f(str, "imageUrl");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        imageUtil.loadImageIntoView(requireContext, str, (ImageView) this.j.getValue(this, n[6]));
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        if (bundle != null) {
            dismiss();
            return;
        }
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = n;
        ((View) this.g.getValue(this, lVarArr[3])).setOnClickListener(new com.amazon.aps.iva.fe.a(this, 5));
        ((View) this.i.getValue(this, lVarArr[5])).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 8));
        ((View) this.d.getValue(this, lVarArr[0])).setOnClickListener(new k(this, 7));
    }

    @Override // com.amazon.aps.iva.cp.g
    public final void qa(String str) {
        j.f(str, "buttonText");
        ((TextView) this.h.getValue(this, n[4])).setText(str);
    }

    @Override // com.amazon.aps.iva.cp.g
    public final void s4(String str) {
        j.f(str, MediaTrack.ROLE_SUBTITLE);
        ((TextView) this.f.getValue(this, n[2])).setText(str);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<e> setupPresenters() {
        return l1.H((e) this.l.getValue());
    }
}

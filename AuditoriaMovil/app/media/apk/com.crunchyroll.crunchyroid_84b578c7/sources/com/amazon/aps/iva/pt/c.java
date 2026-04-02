package com.amazon.aps.iva.pt;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.h;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.ImageUtil;
/* compiled from: BentoCardLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class c extends g implements f {
    public static final /* synthetic */ l<Object>[] h = {q.a(c.class, "gameTitle", "getGameTitle()Landroid/widget/TextView;", 0), q.a(c.class, "gameGenre", "getGameGenre()Landroid/widget/TextView;", 0), q.a(c.class, "premiumLabel", "getPremiumLabel()Landroid/widget/TextView;", 0), q.a(c.class, "thumbnail", "getThumbnail()Landroid/widget/ImageView;", 0), q.a(c.class, "gameCard", "getGameCard()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final m g;

    /* compiled from: BentoCardLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HOME;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(aVar, "screen");
            com.amazon.aps.iva.ft.b bVar = new com.amazon.aps.iva.ft.b(cVar, aVar);
            c cVar2 = c.this;
            j.f(cVar2, "view");
            b bVar2 = b.h;
            j.f(bVar2, "hasBentoBenefit");
            return new e(cVar2, bVar2, bVar);
        }
    }

    public c(Context context) {
        super(context, null, 0, 6, null);
        this.b = com.amazon.aps.iva.xw.g.c(R.id.carousel_game_title, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.carousel_game_genre, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.carousel_game_premium_label, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.carousel_game_image, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.bento_game_card, this);
        this.g = com.amazon.aps.iva.kb0.f.b(new a());
        View.inflate(context, R.layout.layout_bento_card, this);
    }

    public static void b1(c cVar, com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.jt.a aVar) {
        j.f(cVar, "this$0");
        j.f(dVar, "$bentoGameCard");
        j.f(aVar, "$feedAnalyticsData");
        cVar.getPresenter().E(dVar, aVar);
    }

    private final ConstraintLayout getGameCard() {
        return (ConstraintLayout) this.f.getValue(this, h[4]);
    }

    private final TextView getGameGenre() {
        return (TextView) this.c.getValue(this, h[1]);
    }

    private final TextView getGameTitle() {
        return (TextView) this.b.getValue(this, h[0]);
    }

    private final TextView getPremiumLabel() {
        return (TextView) this.d.getValue(this, h[2]);
    }

    private final d getPresenter() {
        return (d) this.g.getValue();
    }

    private final ImageView getThumbnail() {
        return (ImageView) this.e.getValue(this, h[3]);
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void E2() {
        getPremiumLabel().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void K7(final com.amazon.aps.iva.xx.d dVar, final com.amazon.aps.iva.jt.a aVar) {
        getGameCard().setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.pt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.b1(c.this, dVar, aVar);
            }
        });
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void P0(String str) {
        j.f(str, "gameLink");
        int i = com.amazon.aps.iva.k50.b.a;
        Context context = getContext();
        j.e(context, "context");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(context, "");
        String string = getContext().getString(R.string.something_wrong);
        j.e(string, "context.getString(Common…s.string.something_wrong)");
        cVar.s1(str, "", string);
    }

    public final void U2(com.amazon.aps.iva.xx.d dVar, com.amazon.aps.iva.jt.a aVar) {
        getPresenter().V2(dVar, aVar);
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void b6() {
        getPremiumLabel().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void loadImage(String str) {
        j.f(str, "imageUrl");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        j.e(context, "context");
        imageUtil.loadImageIntoView(context, str, getThumbnail());
    }

    @Override // com.amazon.aps.iva.pt.f
    public final void ne(String str, String str2) {
        j.f(str, "gameTitle");
        j.f(str2, "gameLink");
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        j.d(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        com.amazon.aps.iva.gt.c.k.getClass();
        com.amazon.aps.iva.gt.c cVar = new com.amazon.aps.iva.gt.c();
        l<?>[] lVarArr = com.amazon.aps.iva.gt.c.l;
        cVar.h.b(cVar, lVarArr[6], str);
        cVar.i.b(cVar, lVarArr[7], str2);
        cVar.show(((h) a2).getSupportFragmentManager(), "bento_subscription_modal");
    }

    @Override // com.amazon.aps.iva.pt.f
    public void setGenre(String str) {
        j.f(str, "genre");
        getGameGenre().setText(str);
    }

    @Override // com.amazon.aps.iva.pt.f
    public void setTitle(String str) {
        j.f(str, "title");
        getGameTitle().setText(str);
    }
}

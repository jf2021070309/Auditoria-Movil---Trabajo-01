package com.amazon.aps.iva.m10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.ImageUtil;
import java.util.List;
import java.util.Set;
/* compiled from: GenresListItemLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.g implements j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {q.a(h.class, "backgroundImage", "getBackgroundImage()Landroid/widget/ImageView;", 0), q.a(h.class, "iconImage", "getIconImage()Landroid/widget/ImageView;", 0), q.a(h.class, "title", "getTitle()Landroid/widget/TextView;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public final i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.l10.a, com.amazon.aps.iva.kb0.q> lVar) {
        super(context, null, 0, 6, null);
        com.amazon.aps.iva.yb0.j.f(lVar, "openGenreScreen");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.genre_image, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.genre_icon, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.genre_title, this);
        this.e = new i(this, lVar);
        View.inflate(context, R.layout.layout_genres_list_item, this);
        setOnClickListener(new com.amazon.aps.iva.c8.e(this, 16));
    }

    private final ImageView getBackgroundImage() {
        return (ImageView) this.b.getValue(this, f[0]);
    }

    private final ImageView getIconImage() {
        return (ImageView) this.c.getValue(this, f[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.d.getValue(this, f[2]);
    }

    @Override // com.amazon.aps.iva.m10.j
    public final void k1() {
        getIconImage().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.m10.j
    public void setBackgroundImage(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        com.amazon.aps.iva.ly.c.c(imageUtil, context, list, getBackgroundImage(), R.color.cr_dark_blue);
    }

    @Override // com.amazon.aps.iva.m10.j
    public void setIcon(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "icons");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        com.amazon.aps.iva.ly.c.c(imageUtil, context, list, getIconImage(), 0);
    }

    @Override // com.amazon.aps.iva.m10.j
    public void setTitle(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.e);
    }

    @Override // com.amazon.aps.iva.m10.j
    public final void w1() {
        getIconImage().setVisibility(0);
    }
}

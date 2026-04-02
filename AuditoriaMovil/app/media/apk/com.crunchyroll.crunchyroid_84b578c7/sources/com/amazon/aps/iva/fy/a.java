package com.amazon.aps.iva.fy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.genres.GenresLayout;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;
import java.util.Set;
/* compiled from: HeroMusicView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends g implements e {
    public static final /* synthetic */ l<Object>[] i = {q.a(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(a.class, MediaTrack.ROLE_DESCRIPTION, "getDescription()Landroid/widget/TextView;", 0), q.a(a.class, "watchNow", "getWatchNow()Landroid/view/View;", 0), q.a(a.class, "genresLayout", "getGenresLayout()Lcom/ellation/crunchyroll/ui/genres/GenresLayout;", 0), q.a(a.class, "labelsLayout", "getLabelsLayout()Landroidx/compose/ui/platform/ComposeView;", 0)};
    public final ImageView b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final m h;

    /* compiled from: HeroMusicView.kt */
    /* renamed from: com.amazon.aps.iva.fy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0281a extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ LabelUiModel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0281a(LabelUiModel labelUiModel) {
            super(2);
            this.h = labelUiModel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                LabelsKt.m32Labels0OtIIsQ(this.h, null, false, true, false, false, false, false, 0L, null, 0.0f, iVar2, LabelUiModel.$stable | 3072, 0, 2038);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ImageView imageView, Context context) {
        super(context, null, 0, 6, null);
        j.f(context, "context");
        j.f(imageView, "heroImageView");
        this.b = imageView;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.hero_music_title, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.hero_music_description, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.hero_music_play_now, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.hero_music_genres, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.hero_music_labels, this);
        this.h = f.b(new b(this, context));
        View.inflate(context, R.layout.view_hero_music, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, imageView.getHeight() - com.amazon.aps.iva.xw.q.d(R.dimen.feed_item_vertical_spacing, context)));
    }

    public static void U2(a aVar) {
        j.f(aVar, "this$0");
        aVar.getPresenter().K3();
    }

    public static void b1(a aVar) {
        j.f(aVar, "this$0");
        aVar.getPresenter().h();
    }

    private final TextView getDescription() {
        return (TextView) this.d.getValue(this, i[1]);
    }

    private final GenresLayout getGenresLayout() {
        return (GenresLayout) this.f.getValue(this, i[3]);
    }

    private final ComposeView getLabelsLayout() {
        return (ComposeView) this.g.getValue(this, i[4]);
    }

    private final c getPresenter() {
        return (c) this.h.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.c.getValue(this, i[0]);
    }

    private final View getWatchNow() {
        return (View) this.e.getValue(this, i[2]);
    }

    public final void G4(com.amazon.aps.iva.xx.p pVar) {
        getPresenter().E5(pVar);
        setOnClickListener(new com.amazon.aps.iva.c8.f(this, 12));
        getWatchNow().setOnClickListener(new com.amazon.aps.iva.ne.a(this, 14));
    }

    @Override // com.amazon.aps.iva.fy.e
    public final void Wg() {
        View rootView = getGenresLayout().getRootView();
        j.e(rootView, "genresLayout.rootView");
        rootView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.fy.e
    public final void X1(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        getLabelsLayout().setContent(com.amazon.aps.iva.v0.b.c(81233509, new C0281a(labelUiModel), true));
    }

    @Override // com.amazon.aps.iva.fy.e
    public final void g() {
        getDescription().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.fy.e
    public final void g2(List<Image> list) {
        j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        j.e(context, "context");
        com.amazon.aps.iva.ly.c.c(imageUtil, context, list, this.b, R.drawable.content_placeholder);
    }

    @Override // com.amazon.aps.iva.fy.e
    public final void jh() {
        View rootView = getGenresLayout().getRootView();
        j.e(rootView, "genresLayout.rootView");
        rootView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.fy.e
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        getDescription().setText(str);
    }

    @Override // com.amazon.aps.iva.fy.e
    public void setGenres(List<String> list) {
        j.f(list, "genres");
        getGenresLayout().bind(list);
    }

    @Override // com.amazon.aps.iva.fy.e
    public void setTitle(String str) {
        j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }
}

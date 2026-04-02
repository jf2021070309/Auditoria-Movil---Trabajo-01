package com.amazon.aps.iva.ey;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.c8.s;
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
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;
import java.util.Set;
/* compiled from: HeroView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends g implements e {
    public static final /* synthetic */ l<Object>[] h = {q.a(a.class, "labels", "getLabels()Landroidx/compose/ui/platform/ComposeView;", 0), q.a(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(a.class, MediaTrack.ROLE_DESCRIPTION, "getDescription()Landroid/widget/TextView;", 0), q.a(a.class, "watchNow", "getWatchNow()Landroid/view/View;", 0)};
    public final ImageView b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final m g;

    /* compiled from: HeroView.kt */
    /* renamed from: com.amazon.aps.iva.ey.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0233a extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Panel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0233a(Panel panel) {
            super(2);
            this.h = panel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                LabelsKt.m32Labels0OtIIsQ(LabelUiModelKt.toLabelUiModel$default(this.h, false, 1, null), null, false, true, false, false, false, true, 0L, null, 0.0f, iVar2, 12585984 | LabelUiModel.$stable, 0, 1910);
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
        this.c = com.amazon.aps.iva.xw.g.c(R.id.hero_labels, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.hero_title, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.hero_description, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.hero_watch_now, this);
        this.g = f.b(new b(this, context));
        View.inflate(context, R.layout.view_hero, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, imageView.getHeight() - com.amazon.aps.iva.xw.q.d(R.dimen.feed_item_vertical_spacing, context)));
    }

    public static void U2(a aVar) {
        j.f(aVar, "this$0");
        aVar.getPresenter().o5();
    }

    public static void b1(a aVar) {
        j.f(aVar, "this$0");
        aVar.getPresenter().h();
    }

    private final TextView getDescription() {
        return (TextView) this.e.getValue(this, h[2]);
    }

    private final ComposeView getLabels() {
        return (ComposeView) this.c.getValue(this, h[0]);
    }

    private final c getPresenter() {
        return (c) this.g.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.d.getValue(this, h[1]);
    }

    private final View getWatchNow() {
        return (View) this.f.getValue(this, h[3]);
    }

    public final void G4(Panel panel) {
        getPresenter().N1(panel);
        setOnClickListener(new s(this, 13));
        getWatchNow().setOnClickListener(new com.amazon.aps.iva.c8.e(this, 11));
        getLabels().setContent(com.amazon.aps.iva.v0.b.c(421916368, new C0233a(panel), true));
    }

    @Override // com.amazon.aps.iva.ey.e
    public final void g() {
        getDescription().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ey.e
    public final void g2(List<Image> list) {
        j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        j.e(context, "context");
        com.amazon.aps.iva.ly.c.c(imageUtil, context, list, this.b, R.drawable.content_placeholder);
    }

    @Override // com.amazon.aps.iva.ey.e
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        getDescription().setText(str);
    }

    @Override // com.amazon.aps.iva.ey.e
    public void setTitle(String str) {
        j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }
}

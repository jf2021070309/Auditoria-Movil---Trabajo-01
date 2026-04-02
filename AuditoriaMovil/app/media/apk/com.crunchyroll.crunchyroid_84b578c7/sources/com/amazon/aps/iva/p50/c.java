package com.amazon.aps.iva.p50;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.u70.h;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.showrating.ratingdialogv2.widgets.AverageRatingLayout;
import com.ellation.crunchyroll.showrating.ratingdialogv2.widgets.RatingProgressLayout;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.userratingbar.UserRatingBar;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ShowRatingDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/p50/c;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/p50/o;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "show-rating_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.d implements o, com.amazon.aps.iva.us.a {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(c.class, "binding", "getBinding()Lcom/ellation/crunchyroll/showrating/databinding/DialogShowRatingV2Binding;", 0)};
    public final FragmentViewBindingDelegate b;
    public final com.amazon.aps.iva.kb0.m c;
    public final com.amazon.aps.iva.kb0.m d;

    /* compiled from: ShowRatingDialog.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.o50.a> {
        public static final a b = new a();

        public a() {
            super(1, com.amazon.aps.iva.o50.a.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/showrating/databinding/DialogShowRatingV2Binding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.o50.a invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.average_rating_layout;
            AverageRatingLayout averageRatingLayout = (AverageRatingLayout) z.u(R.id.average_rating_layout, view2);
            if (averageRatingLayout != null) {
                i = R.id.average_rating_progress_layout;
                RatingProgressLayout ratingProgressLayout = (RatingProgressLayout) z.u(R.id.average_rating_progress_layout, view2);
                if (ratingProgressLayout != null) {
                    i = R.id.content_container;
                    if (((ConstraintLayout) z.u(R.id.content_container, view2)) != null) {
                        i = R.id.errors_layout;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.errors_layout, view2);
                        if (frameLayout != null) {
                            i = R.id.show_rating_progress;
                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.show_rating_progress, view2);
                            if (frameLayout2 != null) {
                                i = R.id.toolbar;
                                View u = z.u(R.id.toolbar, view2);
                                if (u != null) {
                                    com.amazon.aps.iva.uu.a a = com.amazon.aps.iva.uu.a.a(u);
                                    i = R.id.user_rating_container;
                                    if (((ConstraintLayout) z.u(R.id.user_rating_container, view2)) != null) {
                                        i = R.id.user_rating_header;
                                        TextView textView = (TextView) z.u(R.id.user_rating_header, view2);
                                        if (textView != null) {
                                            i = R.id.user_rating_poster_image;
                                            ImageView imageView = (ImageView) z.u(R.id.user_rating_poster_image, view2);
                                            if (imageView != null) {
                                                i = R.id.user_rating_rating_bar;
                                                UserRatingBar userRatingBar = (UserRatingBar) z.u(R.id.user_rating_rating_bar, view2);
                                                if (userRatingBar != null) {
                                                    i = R.id.user_rating_show_title;
                                                    TextView textView2 = (TextView) z.u(R.id.user_rating_show_title, view2);
                                                    if (textView2 != null) {
                                                        return new com.amazon.aps.iva.o50.a((FrameLayout) view2, averageRatingLayout, ratingProgressLayout, frameLayout, frameLayout2, a, textView, imageView, userRatingBar, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ShowRatingDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            c cVar = c.this;
            androidx.fragment.app.h requireActivity = cVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            com.amazon.aps.iva.n50.d dVar = (com.amazon.aps.iva.n50.d) com.amazon.aps.iva.ez.l.a(requireActivity, com.amazon.aps.iva.n50.d.class, e.h);
            r rVar = new r(dVar);
            Resources resources = cVar.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            t tVar = new t(resources);
            com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.RATINGS_DETAILS_MODAL;
            com.amazon.aps.iva.m50.b bVar = dVar.e;
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            com.amazon.aps.iva.yb0.j.f(bVar, "input");
            d dVar2 = d.h;
            com.amazon.aps.iva.yb0.j.f(dVar2, "createTimer");
            g gVar = new g(aVar, bVar, dVar2);
            com.amazon.aps.iva.m50.c cVar3 = l1.b;
            if (cVar3 != null) {
                com.amazon.aps.iva.m50.a invoke = cVar3.b.invoke(cVar);
                com.amazon.aps.iva.yb0.j.f(invoke, "pendingStateRouter");
                return new k(cVar, rVar, tVar, gVar, invoke);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ShowRatingDialog.kt */
    /* renamed from: com.amazon.aps.iva.p50.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0603c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ls.a> {
        public C0603c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ls.a invoke() {
            androidx.fragment.app.h requireActivity = c.this.requireActivity();
            com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.analytics.AnalyticsScreenProvider");
            return ((com.amazon.aps.iva.us.a) requireActivity).b1();
        }
    }

    public c() {
        super(Integer.valueOf((int) R.layout.dialog_show_rating_v2));
        this.b = com.amazon.aps.iva.a60.b.z(this, a.b);
        this.c = com.amazon.aps.iva.kb0.f.b(new b());
        this.d = com.amazon.aps.iva.kb0.f.b(new C0603c());
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void C5(int i) {
        ci().i.bind(i);
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void V8(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "headerText");
        ci().g.setText(str);
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void Y3(int i, float f, int i2) {
        AverageRatingLayout averageRatingLayout = ci().b;
        com.amazon.aps.iva.o50.b bVar = averageRatingLayout.c;
        bVar.b.setText(String.valueOf(f));
        bVar.d.setText(averageRatingLayout.getResources().getString(R.string.show_rating_average_rating_detail, Integer.valueOf(i)));
        bVar.c.setText(averageRatingLayout.getResources().getQuantityString(R.plurals.show_rating_average_rating_count, i2, averageRatingLayout.b.format(Integer.valueOf(i2))));
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void Z8(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        ImageView imageView = ci().h;
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.yb0.j.e(imageView, "userRatingPosterImage");
        com.amazon.aps.iva.ly.c.b(imageUtil, requireContext, list, imageView, Integer.valueOf((int) R.drawable.ic_missing_card_image), Integer.valueOf((int) R.color.cr_woodsmoke), null, 32);
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void a() {
        FrameLayout frameLayout = ci().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.showRatingProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void b() {
        FrameLayout frameLayout = ci().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.showRatingProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return (com.amazon.aps.iva.ls.a) this.d.getValue();
    }

    public final com.amazon.aps.iva.o50.a ci() {
        return (com.amazon.aps.iva.o50.a) this.b.getValue(this, e[0]);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.DialogTheme);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ci().f.c.setText(getString(R.string.show_rating_dialog_rating_details));
        ci().f.b.setOnClickListener(new com.amazon.aps.iva.c8.s(this, 24));
        ci().i.setRatingPickedListener((h) this.c.getValue());
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ci().a.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 24));
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void p4(int i, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "starsPercentage");
        RatingProgressLayout ratingProgressLayout = ci().c;
        ratingProgressLayout.getClass();
        com.amazon.aps.iva.q50.a aVar = ratingProgressLayout.d;
        aVar.getClass();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                aVar.getView().Q4(i2, ((Number) obj).intValue());
                i2 = i3;
            } else {
                f1.S();
                throw null;
            }
        }
        aVar.getView().P8();
        if (i != 0) {
            aVar.getView().Fc(list.size() - i);
        }
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void setShowTitle(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentTitle");
        ci().j.setText(str);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<h> setupPresenters() {
        return l1.H((h) this.c.getValue());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = ci().d;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorsLayout");
        h.a.a(frameLayout, iVar);
    }

    @Override // com.amazon.aps.iva.p50.o
    public final void ug(int i) {
        ci().i.playAnimation(i);
    }
}

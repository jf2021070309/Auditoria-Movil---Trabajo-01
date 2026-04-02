package com.amazon.aps.iva.e20;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MediaDetailsDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/e20/b;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/e20/h;", "<init>", "()V", "a", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.d implements h {
    public final s b;
    public final FragmentViewBindingDelegate c;
    public final m d;
    public static final /* synthetic */ l<Object>[] f = {defpackage.e.b(b.class, "mediaDetails", "getMediaDetails()Lcom/ellation/crunchyroll/presentation/media/details/MediaDetails;", 0), q.a(b.class, "binding", "getBinding()Lcom/ellation/widgets/databinding/DialogMediaDetailsBinding;", 0)};
    public static final a e = new a();

    /* compiled from: MediaDetailsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(com.amazon.aps.iva.e20.a aVar, FragmentManager fragmentManager) {
            j.f(aVar, "mediaDetails");
            b bVar = new b();
            bVar.b.b(bVar, b.f[0], aVar);
            bVar.show(fragmentManager, "media_details_dialog");
        }
    }

    /* compiled from: MediaDetailsDialog.kt */
    /* renamed from: com.amazon.aps.iva.e20.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0212b extends i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.f70.a> {
        public static final C0212b b = new C0212b();

        public C0212b() {
            super(1, com.amazon.aps.iva.f70.a.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/widgets/databinding/DialogMediaDetailsBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f70.a invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            ImageView imageView = (ImageView) z.u(R.id.close_button, view2);
            TextView textView = (TextView) z.u(R.id.collapsed_title, view2);
            AppBarLayout appBarLayout = (AppBarLayout) z.u(R.id.collapsible_app_bar, view2);
            CollapsibleToolbarLayout collapsibleToolbarLayout = (CollapsibleToolbarLayout) z.u(R.id.collapsible_toolbar, view2);
            int i = R.id.content_container;
            ScrollView scrollView = (ScrollView) z.u(R.id.content_container, view2);
            if (scrollView != null) {
                View u = z.u(R.id.divider, view2);
                TextView textView2 = (TextView) z.u(R.id.expanded_title, view2);
                LinearLayout linearLayout = (LinearLayout) z.u(R.id.linear_layout, view2);
                i = R.id.media_details_description;
                CollapsibleTextView collapsibleTextView = (CollapsibleTextView) z.u(R.id.media_details_description, view2);
                if (collapsibleTextView != null) {
                    i = R.id.media_details_fields_container;
                    LinearLayout linearLayout2 = (LinearLayout) z.u(R.id.media_details_fields_container, view2);
                    if (linearLayout2 != null) {
                        return new com.amazon.aps.iva.f70.a(view2, imageView, textView, collapsibleToolbarLayout, scrollView, u, textView2, collapsibleTextView, linearLayout2, (Toolbar) z.u(R.id.toolbar, view2));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: MediaDetailsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<f> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final f invoke() {
            b bVar = b.this;
            j.f(bVar, "view");
            return new g(bVar);
        }
    }

    public b() {
        super(Integer.valueOf((int) R.layout.dialog_media_details));
        this.b = new s("media_details");
        this.c = com.amazon.aps.iva.a60.b.z(this, C0212b.b);
        this.d = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void Z() {
        CollapsibleTextView collapsibleTextView = ci().h;
        collapsibleTextView.setCollapsed(!collapsibleTextView.k);
    }

    public final com.amazon.aps.iva.f70.a ci() {
        return (com.amazon.aps.iva.f70.a) this.c.getValue(this, f[1]);
    }

    public final f di() {
        return (f) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void g() {
        CollapsibleTextView collapsibleTextView = ci().h;
        j.e(collapsibleTextView, "binding.mediaDetailsDescription");
        collapsibleTextView.setVisibility(8);
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.TransparentStatusBarDialog);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getResources().getDimensionPixelOffset(R.dimen.dialog_media_details_width), getResources().getDimensionPixelOffset(R.dimen.dialog_media_details_height));
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().x3((com.amazon.aps.iva.e20.a) this.b.getValue(this, f[0]));
        CollapsibleToolbarLayout collapsibleToolbarLayout = ci().d;
        if (collapsibleToolbarLayout != null) {
            ScrollView scrollView = ci().e;
            j.e(scrollView, "binding.contentContainer");
            Toolbar toolbar = ci().j;
            j.c(toolbar);
            collapsibleToolbarLayout.c = scrollView;
            collapsibleToolbarLayout.getViewTreeObserver().addOnPreDrawListener(new com.amazon.aps.iva.e70.b(collapsibleToolbarLayout, toolbar, false, scrollView));
        }
        Toolbar toolbar2 = ci().j;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new r(this, 14));
        }
        ImageView imageView = ci().b;
        if (imageView != null) {
            imageView.setOnClickListener(new com.amazon.aps.iva.c8.s(this, 16));
        }
        if (ci().g != null && (view2 = getView()) != null) {
            if (view2.isLaidOut()) {
                ScrollView scrollView2 = ci().e;
                j.e(scrollView2, "binding.contentContainer");
                TextView textView = ci().g;
                j.c(textView);
                int height = textView.getHeight();
                TextView textView2 = ci().c;
                j.c(textView2);
                t0.j(scrollView2, null, Integer.valueOf(height - textView2.getHeight()), null, null, 13);
                TextView textView3 = ci().g;
                j.c(textView3);
                int height2 = textView3.getHeight();
                TextView textView4 = ci().c;
                j.c(textView4);
                ci().e.getViewTreeObserver().addOnScrollChangedListener(new com.amazon.aps.iva.e20.c(this, (height2 - textView4.getHeight()) + 10.0f));
                return;
            }
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new d(view2, this));
        }
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void r() {
        CollapsibleTextView collapsibleTextView = ci().h;
        j.e(collapsibleTextView, "binding.mediaDetailsDescription");
        collapsibleTextView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void setDescription(String str) {
        ci().h.setText(str);
        ci().h.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 17));
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void setTitle(String str) {
        j.f(str, "title");
        Toolbar toolbar = ci().j;
        if (toolbar != null) {
            toolbar.setTitle(str);
        }
        TextView textView = ci().g;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = ci().c;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(di());
    }

    @Override // com.amazon.aps.iva.e20.h
    public final void y5(List<e> list) {
        j.f(list, "otherFields");
        for (e eVar : list) {
            View inflate = View.inflate(getContext(), R.layout.layout_media_details_field, null);
            ((TextView) inflate.findViewById(R.id.media_details_field_title)).setText(eVar.b);
            ((TextView) inflate.findViewById(R.id.media_details_field_description)).setText(eVar.c);
            ci().i.addView(inflate);
        }
    }
}

package com.amazon.aps.iva.tl;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ReportProblemSettingsDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/tl/f;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/tl/h;", "<init>", "()V", "a", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.d implements h {
    public final FragmentViewBindingDelegate b;
    public final com.amazon.aps.iva.kb0.m c;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {q.a(f.class, "binding", "getBinding()Lcom/crunchyroll/player/databinding/LayoutReportProblemModalBinding;", 0)};
    public static final a d = new a();

    /* compiled from: ReportProblemSettingsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: ReportProblemSettingsDialog.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.mj.f> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.mj.f.class, "bind", "bind(Landroid/view/View;)Lcom/crunchyroll/player/databinding/LayoutReportProblemModalBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.mj.f invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.player_settings_report_problem_close_button;
            ImageView imageView = (ImageView) z.u(R.id.player_settings_report_problem_close_button, view2);
            if (imageView != null) {
                i = R.id.player_settings_report_problem_dialog_container;
                if (((FrameLayout) z.u(R.id.player_settings_report_problem_dialog_container, view2)) != null) {
                    i = R.id.player_settings_report_problem_dialog_title;
                    if (((TextView) z.u(R.id.player_settings_report_problem_dialog_title, view2)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                        return new com.amazon.aps.iva.mj.f(constraintLayout, imageView, constraintLayout);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ReportProblemSettingsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            f fVar = f.this;
            com.amazon.aps.iva.yb0.j.f(fVar, "view");
            return new g(fVar);
        }
    }

    public f() {
        super(Integer.valueOf((int) R.layout.layout_report_problem_modal));
        this.b = com.amazon.aps.iva.a60.b.z(this, b.b);
        this.c = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.tl.h
    public final void a7() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a a2 = defpackage.b.a(childFragmentManager, childFragmentManager);
        k.k.getClass();
        a2.e(R.id.player_settings_report_problem_dialog_container, new k(), null);
        a2.h();
    }

    @Override // com.amazon.aps.iva.tl.h
    public final boolean getCanGoBack() {
        Fragment B = getChildFragmentManager().B(R.id.player_settings_report_problem_dialog_container);
        com.amazon.aps.iva.yb0.j.d(B, "null cannot be cast to non-null type com.crunchyroll.player.settings.reportproblem.ReportProblemSettingsFragment");
        return ((k) B).getCanGoBack();
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.DialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = e;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[0];
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.b;
        ((com.amazon.aps.iva.mj.f) fragmentViewBindingDelegate.getValue(this, lVar)).b.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 4));
        ((com.amazon.aps.iva.mj.f) fragmentViewBindingDelegate.getValue(this, lVarArr[0])).c.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 4));
        if (Build.VERSION.SDK_INT >= 30) {
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setDecorFitsSystemWindows(false);
                return;
            }
            return;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<g> setupPresenters() {
        return l1.H((g) this.c.getValue());
    }

    @Override // androidx.fragment.app.g
    public final void show(FragmentManager fragmentManager, String str) {
        com.amazon.aps.iva.yb0.j.f(fragmentManager, "manager");
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.d(0, this, str, 1);
        aVar.i();
    }
}

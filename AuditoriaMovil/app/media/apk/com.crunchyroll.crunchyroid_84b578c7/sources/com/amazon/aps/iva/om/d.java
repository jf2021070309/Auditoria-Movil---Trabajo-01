package com.amazon.aps.iva.om;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xw.t;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: ProfilesOnboardingModal.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/om/d;", "Landroidx/fragment/app/g;", "<init>", "()V", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class d extends androidx.fragment.app.g {
    public static final /* synthetic */ int b = 0;

    /* compiled from: ProfilesOnboardingModal.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, q> {
        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -1393632770, new c(d.this)), iVar2, 6);
            }
            return q.a;
        }
    }

    /* compiled from: ProfilesOnboardingModal.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, e.h, 251);
            return q.a;
        }
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.DialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return t.a(this, com.amazon.aps.iva.v0.b.c(849636817, new a(), true));
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            int i = window.getContext().getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.onboarding_dialog_width);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.onboarding_dialog_margin);
            if (i >= (dimensionPixelSize2 * 2) + dimensionPixelSize) {
                window.setLayout(dimensionPixelSize, -2);
            } else {
                window.setLayout(-1, -2);
                View view = getView();
                if (view != null) {
                    t0.e(view, Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize2));
                }
            }
            window.setGravity(17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        f1.i(view, b.h);
    }
}

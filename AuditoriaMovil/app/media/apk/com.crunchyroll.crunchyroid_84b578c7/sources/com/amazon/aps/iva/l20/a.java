package com.amazon.aps.iva.l20;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.v60.h;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
/* compiled from: CancellationRescueBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/l20/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/amazon/aps/iva/l20/e;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends BottomSheetDialogFragment implements e {
    public final FragmentViewBindingDelegate b = com.amazon.aps.iva.a60.b.z(this, b.b);
    public final m c = f.b(new c());
    public static final /* synthetic */ l<Object>[] e = {q.a(a.class, "binding", "getBinding()Lcom/ellation/multitier/databinding/LayoutCancellationRescueDialogBinding;", 0)};
    public static final C0462a d = new C0462a();

    /* compiled from: CancellationRescueBottomSheet.kt */
    /* renamed from: com.amazon.aps.iva.l20.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0462a {
    }

    /* compiled from: CancellationRescueBottomSheet.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<View, h> {
        public static final b b = new b();

        public b() {
            super(1, h.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/multitier/databinding/LayoutCancellationRescueDialogBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final h invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            return h.a(view2);
        }
    }

    /* compiled from: CancellationRescueBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.l20.c> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.l20.c invoke() {
            a aVar = a.this;
            Context requireContext = aVar.requireContext();
            j.e(requireContext, "requireContext()");
            return new d(aVar, new com.amazon.aps.iva.k50.m(requireContext));
        }
    }

    @Override // com.amazon.aps.iva.l20.e
    public final void closeScreen() {
        androidx.fragment.app.h requireActivity = requireActivity();
        j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity");
        CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) requireActivity;
        cancellationRescueActivity.setResult(20);
        cancellationRescueActivity.finish();
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        j.f(dialogInterface, "dialog");
        ((com.amazon.aps.iva.l20.c) this.c.getValue()).onDismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_cancellation_rescue_dialog, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        l<?>[] lVarArr = e;
        l<?> lVar = lVarArr[0];
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.b;
        ImageView imageView = ((h) fragmentViewBindingDelegate.getValue(this, lVar)).b;
        j.e(imageView, "binding.dialogCloseButton");
        imageView.setVisibility(8);
        ((h) fragmentViewBindingDelegate.getValue(this, lVarArr[0])).c.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 14));
    }
}

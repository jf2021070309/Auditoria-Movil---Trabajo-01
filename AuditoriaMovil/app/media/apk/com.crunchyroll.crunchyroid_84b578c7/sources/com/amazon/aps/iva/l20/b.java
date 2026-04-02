package com.amazon.aps.iva.l20;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.e4.l1;
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
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CancellationRescueDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/l20/b;", "Lcom/amazon/aps/iva/i60/c;", "Lcom/amazon/aps/iva/l20/e;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.i60.c implements e {
    public final FragmentViewBindingDelegate d;
    public final m e;
    public static final /* synthetic */ l<Object>[] g = {q.a(b.class, "binding", "getBinding()Lcom/ellation/multitier/databinding/LayoutCancellationRescueDialogBinding;", 0)};
    public static final a f = new a();

    /* compiled from: CancellationRescueDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CancellationRescueDialog.kt */
    /* renamed from: com.amazon.aps.iva.l20.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0463b extends i implements com.amazon.aps.iva.xb0.l<View, h> {
        public static final C0463b b = new C0463b();

        public C0463b() {
            super(1, h.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/multitier/databinding/LayoutCancellationRescueDialogBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final h invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            return h.a(view2);
        }
    }

    /* compiled from: CancellationRescueDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.l20.c> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.l20.c invoke() {
            b bVar = b.this;
            Context requireContext = bVar.requireContext();
            j.e(requireContext, "requireContext()");
            return new d(bVar, new com.amazon.aps.iva.k50.m(requireContext));
        }
    }

    public b() {
        super(Integer.valueOf((int) R.layout.layout_cancellation_rescue_dialog), (int) R.dimen.cancellation_rescue_dialog_width, (Integer) null);
        this.d = com.amazon.aps.iva.a60.b.z(this, C0463b.b);
        this.e = f.b(new c());
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
        ((com.amazon.aps.iva.l20.c) this.e.getValue()).onDismiss();
    }

    @Override // com.amazon.aps.iva.i60.c, androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.DialogTheme);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        l<?>[] lVarArr = g;
        l<?> lVar = lVarArr[0];
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.d;
        ((h) fragmentViewBindingDelegate.getValue(this, lVar)).c.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 16));
        ((h) fragmentViewBindingDelegate.getValue(this, lVarArr[0])).b.setOnClickListener(new k(this, 16));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.l20.c) this.e.getValue());
    }
}

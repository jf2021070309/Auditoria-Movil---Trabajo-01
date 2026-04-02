package com.amazon.aps.iva.tm;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.tm.c;
import com.amazon.aps.iva.xw.t;
import kotlin.Metadata;
/* compiled from: SwitchProfileDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/tm/c;", "Landroidx/fragment/app/g;", "<init>", "()V", "a", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.g {
    public final com.amazon.aps.iva.ez.a b = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.ui.c.class, new C0743c(this), b.h);
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {q.a(c.class, "navigator", "getNavigator()Lcom/crunchyroll/mvvm/navigation/ViewModelNavigator;", 0)};
    public static final a c = new a();

    /* compiled from: SwitchProfileDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SwitchProfileDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c>> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> invoke(p pVar) {
            p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            return new com.amazon.aps.iva.ui.c<>(pVar2, null);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* renamed from: com.amazon.aps.iva.tm.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0743c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public C0743c(Object obj) {
            super(0, obj, Fragment.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return ((Fragment) this.receiver).requireActivity();
        }
    }

    public final com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> ci() {
        return (com.amazon.aps.iva.ui.c) this.b.getValue(this, d[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        ComposeView a2 = t.a(this, com.amazon.aps.iva.v0.b.c(-712501939, new k(this), true));
        View rootView = a2.getRootView();
        com.amazon.aps.iva.yb0.j.e(rootView, "it.rootView");
        f1.i(rootView, n.h);
        return a2;
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.aps.iva.tm.b
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    c.a aVar = c.c;
                    c cVar = c.this;
                    com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
                    if (i == 4 && keyEvent.getAction() == 1) {
                        cVar.ci().w7(null);
                        return true;
                    }
                    return false;
                }
            });
        }
    }
}

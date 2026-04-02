package com.amazon.aps.iva.gv;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gv.b;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrunchylistsDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/gv/b;", "Lcom/amazon/aps/iva/wy/d;", "", "Lcom/amazon/aps/iva/gv/h;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.d implements h {
    public final s b;
    public final m c;
    public final m d;
    public static final /* synthetic */ l<Object>[] f = {defpackage.e.b(b.class, "modifyCrunchylistAction", "getModifyCrunchylistAction()Lcom/ellation/crunchyroll/crunchylists/crunchylistsdialog/ModifyCrunchylistAction;", 0)};
    public static final a e = new a();

    /* compiled from: CrunchylistsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static b a(i iVar) {
            j.f(iVar, "modifyCrunchylistAction");
            b bVar = new b();
            bVar.b.b(bVar, b.f[0], iVar);
            return bVar;
        }
    }

    /* compiled from: CrunchylistsDialog.kt */
    /* renamed from: com.amazon.aps.iva.gv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0310b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public C0310b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            b bVar = b.this;
            g gVar = (g) bVar.c.getValue();
            Context requireContext = bVar.requireContext();
            j.e(requireContext, "requireContext()");
            boolean c = k.n(requireContext).c();
            l<?> lVar = b.f[0];
            j.f(gVar, "router");
            return new e(bVar, gVar, c, (i) bVar.b.getValue(bVar, lVar));
        }
    }

    /* compiled from: CrunchylistsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            b bVar = b.this;
            FragmentManager childFragmentManager = bVar.getChildFragmentManager();
            j.e(childFragmentManager, "childFragmentManager");
            return new g(childFragmentManager, new com.amazon.aps.iva.gv.c(bVar), (i) bVar.b.getValue(bVar, b.f[0]));
        }
    }

    public b() {
        super(Integer.valueOf((int) R.layout.dialog_crunchylists));
        this.b = new s("modify_list_action");
        this.c = com.amazon.aps.iva.kb0.f.b(new c());
        this.d = com.amazon.aps.iva.kb0.f.b(new C0310b());
    }

    @Override // com.amazon.aps.iva.gv.h
    public final g X7() {
        return (g) this.c.getValue();
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.CrunchylistsDialog);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getResources().getDimensionPixelOffset(R.dimen.crunchylists_dialog_width), getResources().getDimensionPixelOffset(R.dimen.crunchylists_dialog_height));
        }
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((d) this.d.getValue()).onCreate(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.aps.iva.gv.a
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    b.a aVar = b.e;
                    b bVar = b.this;
                    j.f(bVar, "this$0");
                    if (i == 4 && keyEvent.getAction() == 1) {
                        ((d) bVar.d.getValue()).a();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<d> setupPresenters() {
        return l1.H((d) this.d.getValue());
    }
}

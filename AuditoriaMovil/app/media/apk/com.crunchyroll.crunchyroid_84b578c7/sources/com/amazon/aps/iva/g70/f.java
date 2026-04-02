package com.amazon.aps.iva.g70;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.yb0.l;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
/* compiled from: MaterialAlertDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/g70/f;", "Landroidx/fragment/app/g;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class f extends androidx.fragment.app.g {
    public final s b = new s("material_alert_dialog_fragment_input");
    public l c = e.h;
    public l d = b.h;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {defpackage.e.b(f.class, "input", "getInput()Lcom/ellation/widgets/dialog/MaterialAlertDialogFragmentInput;", 0)};
    public static final a e = new a();

    /* compiled from: MaterialAlertDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static f a(g gVar) {
            f fVar = new f();
            fVar.b.b(fVar, f.f[0], gVar);
            return fVar;
        }
    }

    /* compiled from: MaterialAlertDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* compiled from: MaterialAlertDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<Button> {
        public final /* synthetic */ androidx.appcompat.app.e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.appcompat.app.e eVar) {
            super(0);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Button invoke() {
            return this.h.getButton(-1);
        }
    }

    /* compiled from: MaterialAlertDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<Button> {
        public final /* synthetic */ androidx.appcompat.app.e h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.appcompat.app.e eVar) {
            super(0);
            this.h = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Button invoke() {
            return this.h.getButton(-2);
        }
    }

    /* compiled from: MaterialAlertDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        public static final e h = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        com.amazon.aps.iva.yb0.j.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        com.amazon.aps.iva.bo.e.g(this, "cancel_result", null, null);
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        g gVar = (g) this.b.getValue(this, f[0]);
        MaterialAlertDialogBuilder message = new MaterialAlertDialogBuilder(requireContext(), gVar.b).setTitle(gVar.c).setMessage(gVar.d);
        message.setNegativeButton(gVar.g, (DialogInterface.OnClickListener) new com.amazon.aps.iva.yd.a(this, 2));
        message.setPositiveButton(gVar.e, (DialogInterface.OnClickListener) new com.amazon.aps.iva.b40.c(this, 1));
        androidx.appcompat.app.e create = message.create();
        this.c = new c(create);
        this.d = new d(create);
        com.amazon.aps.iva.yb0.j.e(create, "with(input) {\n          …              }\n        }");
        return create;
    }
}

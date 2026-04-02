package com.ellation.crunchyroll.presentation.settings.donotsell;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.p;
import com.amazon.aps.iva.b40.h;
import com.amazon.aps.iva.b40.i;
import com.amazon.aps.iva.b40.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SettingsDoNotSellActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/settings/donotsell/SettingsDoNotSellActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/b40/i;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SettingsDoNotSellActivity extends com.amazon.aps.iva.i60.b implements i {
    public static final /* synthetic */ l<Object>[] p = {q.a(SettingsDoNotSellActivity.class, "doNotSellToolbar", "getDoNotSellToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(SettingsDoNotSellActivity.class, "doNotSellMyInfoViewModel", "getDoNotSellMyInfoViewModel()Lcom/ellation/crunchyroll/presentation/settings/donotsell/SettingsDoNotSellViewModelImpl;", 0)};
    public com.amazon.aps.iva.b40.b k;
    public final v l = g.d(this, R.id.do_not_sell_toolbar);
    public final com.amazon.aps.iva.ez.a m = new com.amazon.aps.iva.ez.a(k.class, new d(this), new a());
    public final m n = f.b(new c());
    public final Integer o = Integer.valueOf((int) R.layout.activity_settings_do_not_sell);

    /* compiled from: SettingsDoNotSellActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, k> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final k invoke(p pVar) {
            j.f(pVar, "it");
            SettingsDoNotSellActivity settingsDoNotSellActivity = SettingsDoNotSellActivity.this;
            j.f(settingsDoNotSellActivity, "context");
            return new k(new com.amazon.aps.iva.w50.b(settingsDoNotSellActivity));
        }
    }

    /* compiled from: SettingsDoNotSellActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.b40.g gVar) {
            super(1, gVar, com.amazon.aps.iva.b40.g.class, "onDoNotSellClick", "onDoNotSellClick(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            ((com.amazon.aps.iva.b40.g) this.receiver).K5(bool.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsDoNotSellActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.b40.g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.b40.g invoke() {
            l<Object>[] lVarArr = SettingsDoNotSellActivity.p;
            SettingsDoNotSellActivity settingsDoNotSellActivity = SettingsDoNotSellActivity.this;
            settingsDoNotSellActivity.getClass();
            return new h(settingsDoNotSellActivity, (k) settingsDoNotSellActivity.m.getValue(settingsDoNotSellActivity, SettingsDoNotSellActivity.p[1]));
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.b40.i
    public final void b0() {
        new MaterialAlertDialogBuilder(this).setTitle(R.string.do_not_sell_confirmation_dialog_header).setMessage(R.string.do_not_sell_confirmation_dialog_supporting_text).setPositiveButton(R.string.do_not_sell_confirmation_dialog_confirm, (DialogInterface.OnClickListener) new com.amazon.aps.iva.b40.c(this, 0)).setNegativeButton(R.string.do_not_sell_confirmation_dialog_cancel, (DialogInterface.OnClickListener) new com.amazon.aps.iva.b40.d()).show();
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.b40.i
    public final void k6(boolean z) {
        com.amazon.aps.iva.b40.b bVar = this.k;
        if (bVar != null) {
            bVar.setChecked(z);
        } else {
            j.m("doNotSellSwitch");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Toolbar) this.l.getValue(this, p[0])).setNavigationOnClickListener(new com.amazon.aps.iva.fe.a(this, 19));
        View findViewById = findViewById(R.id.settings_do_not_sell_switch);
        j.e(findViewById, "findViewById(R.id.settings_do_not_sell_switch)");
        CompoundButton compoundButton = (CompoundButton) findViewById;
        com.amazon.aps.iva.b40.b bVar = new com.amazon.aps.iva.b40.b(compoundButton);
        this.k = bVar;
        compoundButton.setOnTouchListener(new com.amazon.aps.iva.b40.a(new b((com.amazon.aps.iva.b40.g) this.n.getValue()), bVar));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.b40.g) this.n.getValue());
    }
}

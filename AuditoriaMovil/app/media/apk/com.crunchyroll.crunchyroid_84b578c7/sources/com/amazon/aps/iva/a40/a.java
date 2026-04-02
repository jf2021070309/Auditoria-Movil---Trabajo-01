package com.amazon.aps.iva.a40;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.p;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.h;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import com.ellation.widgets.input.password.PasswordInputView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ChangePasswordFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/a40/a;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/a40/m;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qy.a implements m {
    public final v c = com.amazon.aps.iva.xw.g.f(this, R.id.progress_container);
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.new_password);
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.new_password_confirmation);
    public final v f = com.amazon.aps.iva.xw.g.f(this, R.id.password);
    public final v g = com.amazon.aps.iva.xw.g.f(this, R.id.update_password_button);
    public final com.amazon.aps.iva.kb0.m h = com.amazon.aps.iva.kb0.f.b(new e());
    public final com.amazon.aps.iva.ez.f i = new com.amazon.aps.iva.ez.f(this, o.class, b.h);
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] k = {q.a(a.class, "progress", "getProgress()Landroid/view/View;", 0), q.a(a.class, "newPassword", "getNewPassword()Lcom/ellation/widgets/input/password/PasswordInputView;", 0), q.a(a.class, "newPasswordConfirmation", "getNewPasswordConfirmation()Lcom/ellation/widgets/input/password/PasswordInputView;", 0), q.a(a.class, "password", "getPassword()Lcom/ellation/widgets/input/password/PasswordInputView;", 0), q.a(a.class, "updatePasswordButton", "getUpdatePasswordButton()Lcom/ellation/widgets/input/datainputbutton/DataInputButton;", 0), q.a(a.class, "changePasswordViewModel", "getChangePasswordViewModel()Lcom/ellation/crunchyroll/presentation/settings/changepassword/ChangePasswordViewModelImpl;", 0)};
    public static final C0101a j = new C0101a();

    /* compiled from: ChangePasswordFragment.kt */
    /* renamed from: com.amazon.aps.iva.a40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0101a {
    }

    /* compiled from: ChangePasswordFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, o> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final o invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpAccountService accountService = com.ellation.crunchyroll.application.e.c().getAccountService();
            com.amazon.aps.iva.yb0.j.f(accountService, "accountService");
            return new o(new com.amazon.aps.iva.a40.d(accountService));
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            C0101a c0101a = a.j;
            a aVar = a.this;
            r0.d(aVar.ei().getEditText(), 2, new com.amazon.aps.iva.a40.b(aVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d(EditText editText) {
            super(0, editText, r0.class, "clearKeyboardActionListener", "clearKeyboardActionListener(Landroid/widget/EditText;)V", 1);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            r0.a((EditText) this.receiver);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ChangePasswordFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<f> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final f invoke() {
            com.amazon.aps.iva.y30.i a = h.a.a(null, 7);
            C0101a c0101a = a.j;
            a aVar = a.this;
            aVar.getClass();
            o oVar = (o) aVar.i.getValue(aVar, a.k[5]);
            Context requireContext = aVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            l lVar = new l(requireContext);
            androidx.fragment.app.h requireActivity = aVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return new j(aVar, a, oVar, lVar, new com.amazon.aps.iva.ty.d(requireActivity));
        }
    }

    @Override // com.amazon.aps.iva.a40.m
    public final boolean E() {
        return getResources().getBoolean(R.bool.isDualPane);
    }

    @Override // com.amazon.aps.iva.a40.m
    public final void M3() {
        fi().b1();
        di().b1();
        ei().b1();
    }

    @Override // com.amazon.aps.iva.a40.m
    public final void a() {
        AnimationUtil.fadeIn$default((View) this.c.getValue(this, k[0]), 0L, null, null, 14, null);
    }

    @Override // com.amazon.aps.iva.a40.m
    public final void b() {
        AnimationUtil.fadeOut$default((View) this.c.getValue(this, k[0]), 0L, 2, null);
    }

    @Override // com.amazon.aps.iva.a40.m
    public final void closeScreen() {
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public final PasswordInputView di() {
        return (PasswordInputView) this.d.getValue(this, k[1]);
    }

    public final PasswordInputView ei() {
        return (PasswordInputView) this.e.getValue(this, k[2]);
    }

    public final PasswordInputView fi() {
        return (PasswordInputView) this.f.getValue(this, k[3]);
    }

    public final DataInputButton gi() {
        return (DataInputButton) this.g.getValue(this, k[4]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_change_password, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ei().setConfirmationInputView(di());
        gi().G(di(), fi(), ei());
        gi().setOnEnabled(new c());
        gi().setOnDisabled(new d(ei().getEditText()));
        ei().getEditText().setImeOptions(2);
        gi().setOnClickListener(new s(this, 20));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<f> setupPresenters() {
        return l1.H((f) this.h.getValue());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireActivity().findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }
}

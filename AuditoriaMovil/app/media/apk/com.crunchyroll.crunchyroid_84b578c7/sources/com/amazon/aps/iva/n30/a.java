package com.amazon.aps.iva.n30;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.n0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.common.Scopes;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UserProfileFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/n30/a;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/n30/f;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qy.a implements f {
    public static final /* synthetic */ l<Object>[] i = {q.a(a.class, "avatar", "getAvatar()Landroid/widget/ImageView;", 0), q.a(a.class, "editProfileIcon", "getEditProfileIcon()Landroid/widget/ImageView;", 0), q.a(a.class, "username", "getUsername()Landroid/widget/TextView;", 0), q.a(a.class, "premiumStatus", "getPremiumStatus()Landroid/widget/TextView;", 0), q.a(a.class, "userProfileLoading", "getUserProfileLoading()Landroid/view/ViewGroup;", 0)};
    public final v c = g.f(this, R.id.avatar);
    public final v d = g.f(this, R.id.icon_edit_profile);
    public final v e = g.f(this, R.id.username);
    public final v f = g.f(this, R.id.premium_status);
    public final v g = g.f(this, R.id.user_profile_loading);
    public final m h = com.amazon.aps.iva.kb0.f.b(new C0528a());

    /* compiled from: UserProfileFragment.kt */
    /* renamed from: com.amazon.aps.iva.n30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0528a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<b> {
        public C0528a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final b invoke() {
            a aVar = a.this;
            h activity = aVar.getActivity();
            j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
            n0 c = ((e0.a) activity).mh().c();
            j.f(c, "settingsViewModel");
            return new e(aVar, c);
        }
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void C6() {
        ((TextView) this.f.getValue(this, i[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void O7() {
        di().setVisibility(0);
        ((ImageView) this.d.getValue(this, i[1])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void Xc(ProfileApiModel profileApiModel) {
        j.f(profileApiModel, Scopes.PROFILE);
        h requireActivity = requireActivity();
        j.e(requireActivity, "requireActivity()");
        ((d0) com.ellation.crunchyroll.application.e.a()).c.d(requireActivity, profileApiModel.getUsername());
    }

    public final ImageView di() {
        return (ImageView) this.c.getValue(this, i[0]);
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void fb(String str) {
        j.f(str, "avatarUrl");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        imageUtil.loadRoundImage(requireContext, str, di(), R.drawable.avatar_failure, R.drawable.avatar_placeholder);
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void j() {
        di().setEnabled(false);
        ((ViewGroup) this.g.getValue(this, i[4])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void o() {
        di().setEnabled(true);
        ((ViewGroup) this.g.getValue(this, i[4])).setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_user_profile, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().setOnClickListener(new com.amazon.aps.iva.fe.a(this, 17));
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void setUsername(String str) {
        j.f(str, "usernameText");
        l<?>[] lVarArr = i;
        l<?> lVar = lVarArr[2];
        v vVar = this.e;
        ((TextView) vVar.getValue(this, lVar)).setVisibility(0);
        ((TextView) vVar.getValue(this, lVarArr[2])).setText(str);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<b> setupPresenters() {
        return l1.H((b) this.h.getValue());
    }

    @Override // com.amazon.aps.iva.n30.f
    public final void xg() {
        l<?>[] lVarArr = i;
        l<?> lVar = lVarArr[3];
        v vVar = this.f;
        ((TextView) vVar.getValue(this, lVar)).setVisibility(0);
        ((TextView) vVar.getValue(this, lVarArr[3])).setText(requireContext().getString(R.string.premium_member));
    }
}

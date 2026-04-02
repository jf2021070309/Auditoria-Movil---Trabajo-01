package com.amazon.aps.iva.bo;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.google.android.gms.common.Scopes;
import java.util.Date;
/* compiled from: UserStateImpl.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final String a;
    public final SharedPreferences b;
    public AccountApiModel c;
    public ProfileApiModel d;

    public g(Context context, String str) {
        j.f(context, "context");
        this.a = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences("appStateStore", 0);
        j.e(sharedPreferences, "context.getSharedPrefere…RE, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.bo.f
    public final String b() {
        AccountApiModel m0 = m0();
        if (m0 == null) {
            m0 = new AccountApiModel("", "", new Date(), null, null, 24, null);
        }
        return m0.getGuid();
    }

    @Override // com.amazon.aps.iva.bo.f
    public final ProfileApiModel j0() {
        ProfileApiModel profileApiModel = this.d;
        if (profileApiModel == null) {
            String string = this.b.getString(this.a + Scopes.PROFILE, null);
            if (string != null) {
                profileApiModel = (ProfileApiModel) GsonHolder.getInstance().fromJson(string, (Class<Object>) ProfileApiModel.class);
            } else {
                com.amazon.aps.iva.mf0.a.a.c("Failed to get profile from cache", new Object[0]);
                profileApiModel = null;
            }
            this.d = profileApiModel;
        }
        return profileApiModel;
    }

    @Override // com.amazon.aps.iva.bo.f
    public final void k0(ProfileApiModel profileApiModel) {
        this.b.edit().putString(defpackage.b.c(new StringBuilder(), this.a, Scopes.PROFILE), GsonHolder.getInstance().toJson(profileApiModel)).apply();
        this.d = profileApiModel;
    }

    @Override // com.amazon.aps.iva.bo.f
    public final void l0(AccountApiModel accountApiModel) {
        this.b.edit().putString(defpackage.b.c(new StringBuilder(), this.a, "account_id"), GsonHolder.getInstance().toJson(accountApiModel)).apply();
        this.c = accountApiModel;
    }

    @Override // com.amazon.aps.iva.bo.f
    public final AccountApiModel m0() {
        AccountApiModel accountApiModel = this.c;
        if (accountApiModel == null) {
            String string = this.b.getString(this.a + "account_id", null);
            if (string != null) {
                accountApiModel = (AccountApiModel) GsonHolder.getInstance().fromJson(string, (Class<Object>) AccountApiModel.class);
            } else {
                accountApiModel = null;
            }
            this.c = accountApiModel;
        }
        return accountApiModel;
    }

    @Override // com.amazon.aps.iva.bo.f
    public final void n0() {
        this.c = null;
        this.d = null;
        SharedPreferences.Editor edit = this.b.edit();
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        sb.append(str);
        sb.append("account_id");
        SharedPreferences.Editor remove = edit.remove(sb.toString());
        remove.remove(str + Scopes.PROFILE).apply();
    }
}

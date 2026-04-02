package com.amazon.aps.iva.eo;

import android.content.SharedPreferences;
import com.amazon.aps.iva.fo.e;
import com.amazon.aps.iva.fo.f;
import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import com.google.gson.Gson;
/* compiled from: FunUserStore.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final SharedPreferences a;
    public final Gson b;
    public final com.amazon.aps.iva.co.a c;
    public final e d;
    public final String e;
    public final String f;
    public final String g;

    public c(SharedPreferences sharedPreferences, Gson gson, com.amazon.aps.iva.co.a aVar, f fVar, String str) {
        this.a = sharedPreferences;
        this.b = gson;
        this.c = aVar;
        this.d = fVar;
        this.e = str.concat("_fun_user_storage");
        this.f = str.concat("_fun_accepted_terms");
        this.g = str.concat("_fun_should_show_terms");
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final void clear() {
        this.a.edit().remove(this.e).remove(this.f).remove(this.g).apply();
    }

    @Override // com.amazon.aps.iva.eo.b, com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final boolean getAcceptedTerms() {
        return this.a.getBoolean(this.f, false);
    }

    @Override // com.amazon.aps.iva.eo.a, com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final FunUser getFunUser() {
        String string = this.a.getString(this.e, null);
        if (string == null) {
            return null;
        }
        return (FunUser) this.b.fromJson(string, (Class<Object>) FunUser.class);
    }

    @Override // com.amazon.aps.iva.eo.b, com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final boolean getShouldShowTerms() {
        return this.a.getBoolean(this.g, false);
    }

    @Override // com.amazon.aps.iva.eo.b, com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final void setAcceptedTerms(boolean z) {
        this.c.d();
        this.a.edit().putBoolean(this.f, z).apply();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final void setFunUser(FunUser funUser) {
        this.c.d();
        this.d.a(getFunUser(), funUser);
        this.a.edit().putString(this.e, this.b.toJson(funUser)).apply();
    }

    @Override // com.amazon.aps.iva.eo.b, com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore
    public final void setShouldShowTerms(boolean z) {
        this.a.edit().putBoolean(this.g, z).apply();
    }
}

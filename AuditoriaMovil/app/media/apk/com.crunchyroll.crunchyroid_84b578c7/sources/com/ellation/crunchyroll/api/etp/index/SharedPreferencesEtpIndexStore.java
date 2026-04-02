package com.ellation.crunchyroll.api.etp.index;

import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import kotlin.Metadata;
/* compiled from: SharedPreferencesEtpIndexStore.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/SharedPreferencesEtpIndexStore;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", FirebaseAnalytics.Param.INDEX, "Lcom/amazon/aps/iva/kb0/q;", "save", "get", "invalidate", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "", "key", "Ljava/lang/String;", "etpIndex", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "environment", "<init>", "(Ljava/lang/String;Lcom/google/gson/Gson;Landroid/content/SharedPreferences;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SharedPreferencesEtpIndexStore implements EtpIndexStore {
    public static final int $stable = 8;
    private EtpIndex etpIndex;
    private final Gson gson;
    private final String key;
    private final SharedPreferences sharedPreferences;

    public SharedPreferencesEtpIndexStore(String str, Gson gson, SharedPreferences sharedPreferences) {
        j.f(str, "environment");
        j.f(gson, "gson");
        j.f(sharedPreferences, "sharedPreferences");
        this.gson = gson;
        this.sharedPreferences = sharedPreferences;
        this.key = str.concat(FirebaseAnalytics.Param.INDEX);
    }

    @Override // com.ellation.crunchyroll.api.etp.index.EtpIndexStore
    public EtpIndex get() {
        EtpIndex etpIndex = this.etpIndex;
        if (etpIndex == null) {
            EtpIndex etpIndex2 = (EtpIndex) this.gson.fromJson(this.sharedPreferences.getString(this.key, ""), (Class<Object>) EtpIndex.class);
            this.etpIndex = etpIndex2;
            return etpIndex2;
        }
        return etpIndex;
    }

    @Override // com.ellation.crunchyroll.api.etp.index.EtpIndexStore
    public void invalidate() {
        this.etpIndex = null;
        this.sharedPreferences.edit().remove(this.key).apply();
    }

    @Override // com.ellation.crunchyroll.api.etp.index.EtpIndexStore
    public void save(EtpIndex etpIndex) {
        j.f(etpIndex, FirebaseAnalytics.Param.INDEX);
        this.etpIndex = etpIndex;
        this.sharedPreferences.edit().putString(this.key, this.gson.toJson(etpIndex)).apply();
    }
}

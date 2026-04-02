package com.amazon.aps.iva.dh;

import android.content.SharedPreferences;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: InAppReviewStore.kt */
/* loaded from: classes.dex */
public final class h implements g {
    public final SharedPreferences a;

    public h(CrunchyrollApplication crunchyrollApplication) {
        this.a = crunchyrollApplication.getSharedPreferences("in_app_review_store", 0);
    }

    @Override // com.amazon.aps.iva.dh.g
    public final void a(long j) {
        this.a.edit().putLong("last_in_app_review_trigger_time", j).apply();
    }

    @Override // com.amazon.aps.iva.dh.g
    public final long b() {
        return this.a.getLong("last_in_app_review_trigger_time", 0L);
    }

    @Override // com.amazon.aps.iva.dh.g
    public final void clear() {
        this.a.edit().clear().apply();
    }
}

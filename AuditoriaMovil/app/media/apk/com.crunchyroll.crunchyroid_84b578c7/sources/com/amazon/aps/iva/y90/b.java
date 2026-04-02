package com.amazon.aps.iva.y90;

import android.content.SharedPreferences;
import com.amazon.aps.iva.x90.f;
/* compiled from: SharedPreferenceSyncResponseCache.kt */
/* loaded from: classes4.dex */
public final class b implements f {
    public final SharedPreferences a;

    public b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.amazon.aps.iva.x90.f
    public final void a(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_elapsed_time", j).apply();
    }

    @Override // com.amazon.aps.iva.x90.f
    public final void b(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_offset", j).apply();
    }

    @Override // com.amazon.aps.iva.x90.f
    public final long c() {
        return this.a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
    }

    @Override // com.amazon.aps.iva.x90.f
    public final void clear() {
        this.a.edit().clear().apply();
    }

    @Override // com.amazon.aps.iva.x90.f
    public final long d() {
        return this.a.getLong("com.lyft.kronos.cached_offset", 0L);
    }

    @Override // com.amazon.aps.iva.x90.f
    public final void e(long j) {
        this.a.edit().putLong("com.lyft.kronos.cached_current_time", j).apply();
    }

    @Override // com.amazon.aps.iva.x90.f
    public final long getCurrentTime() {
        return this.a.getLong("com.lyft.kronos.cached_current_time", 0L);
    }
}

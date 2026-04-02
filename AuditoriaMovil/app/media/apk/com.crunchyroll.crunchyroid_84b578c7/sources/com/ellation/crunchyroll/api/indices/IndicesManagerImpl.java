package com.ellation.crunchyroll.api.indices;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import com.ellation.crunchyroll.api.indices.IndicesManager;
import com.ellation.crunchyroll.application.d;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicesManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/indices/IndicesManagerImpl;", "Lcom/ellation/crunchyroll/api/indices/IndicesManager;", "Lcom/amazon/aps/iva/kb0/q;", "init", "", "isFromBackground", "onAppResume", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "jwtInvalidator", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "Lcom/ellation/crunchyroll/application/d;", "appLifecycle", "Lcom/ellation/crunchyroll/application/d;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;Lcom/ellation/crunchyroll/application/d;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IndicesManagerImpl implements IndicesManager {
    private final d appLifecycle;
    private final JwtInvalidator jwtInvalidator;

    public IndicesManagerImpl(JwtInvalidator jwtInvalidator, d dVar) {
        j.f(jwtInvalidator, "jwtInvalidator");
        j.f(dVar, "appLifecycle");
        this.jwtInvalidator = jwtInvalidator;
        this.appLifecycle = dVar;
    }

    @Override // com.ellation.crunchyroll.api.indices.IndicesManager
    public void init() {
        this.appLifecycle.Lf(this);
    }

    @Override // com.ellation.crunchyroll.api.indices.IndicesManager, com.amazon.aps.iva.ys.d
    public void onAppCreate() {
        IndicesManager.DefaultImpls.onAppCreate(this);
    }

    @Override // com.ellation.crunchyroll.api.indices.IndicesManager, com.amazon.aps.iva.ys.d
    public void onAppResume(boolean z) {
        if (z) {
            this.jwtInvalidator.onAppResume();
        }
    }

    @Override // com.ellation.crunchyroll.api.indices.IndicesManager, com.amazon.aps.iva.ys.d
    public void onAppStop() {
        IndicesManager.DefaultImpls.onAppStop(this);
    }
}

package com.ellation.crunchyroll.api.indices;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ys.d;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
import kotlin.Metadata;
/* compiled from: IndicesManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/api/indices/IndicesManager;", "Lcom/amazon/aps/iva/ys/d;", "Lcom/amazon/aps/iva/kb0/q;", "init", "Companion", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface IndicesManager extends d {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: IndicesManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/indices/IndicesManager$Companion;", "", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "jwtInvalidator", "Lcom/ellation/crunchyroll/application/d;", "appLifecycle", "Lcom/ellation/crunchyroll/api/indices/IndicesManager;", "create", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final IndicesManager create(JwtInvalidator jwtInvalidator, com.ellation.crunchyroll.application.d dVar) {
            j.f(jwtInvalidator, "jwtInvalidator");
            j.f(dVar, "appLifecycle");
            return new IndicesManagerImpl(jwtInvalidator, dVar);
        }
    }

    /* compiled from: IndicesManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void onAppCreate(IndicesManager indicesManager) {
        }

        public static void onAppResume(IndicesManager indicesManager, boolean z) {
        }

        public static void onAppStop(IndicesManager indicesManager) {
        }
    }

    void init();

    @Override // com.amazon.aps.iva.ys.d
    /* synthetic */ void onAppCreate();

    @Override // com.amazon.aps.iva.ys.d
    /* synthetic */ void onAppResume(boolean z);

    @Override // com.amazon.aps.iva.ys.d
    /* synthetic */ void onAppStop();
}

package com.amazon.aps.iva.ko;

import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
import com.ellation.crunchyroll.api.etp.funmigration.FunMigrationService;
/* compiled from: UserMigrationWelcomeInteractor.kt */
/* loaded from: classes2.dex */
public final class j implements i {
    public final FunMigrationService a;

    public j(FunMigrationService funMigrationService) {
        this.a = funMigrationService;
    }

    @Override // com.amazon.aps.iva.ko.i
    public final Object migrateWatchData(WatchDataStatus watchDataStatus, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object migrateWatchData = this.a.migrateWatchData(watchDataStatus, dVar);
        if (migrateWatchData == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return migrateWatchData;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}

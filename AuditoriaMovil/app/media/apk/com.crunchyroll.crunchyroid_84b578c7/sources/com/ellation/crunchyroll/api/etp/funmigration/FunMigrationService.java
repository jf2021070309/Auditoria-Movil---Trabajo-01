package com.ellation.crunchyroll.api.etp.funmigration;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
import kotlin.Metadata;
/* compiled from: FunMigrationService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/funmigration/FunMigrationService;", "", "Lcom/ellation/crunchyroll/api/etp/auth/model/WatchDataStatus;", "watchDataStatus", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "migrateWatchData", "(Lcom/ellation/crunchyroll/api/etp/auth/model/WatchDataStatus;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface FunMigrationService {
    @o("fun-migrator/v1/watch-data/{account_uuid}/migrate/{watch_data_status}")
    Object migrateWatchData(@s("watch_data_status") WatchDataStatus watchDataStatus, d<? super a0<q>> dVar);
}

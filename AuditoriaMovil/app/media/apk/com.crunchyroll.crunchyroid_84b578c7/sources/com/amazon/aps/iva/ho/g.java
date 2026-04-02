package com.amazon.aps.iva.ho;

import com.amazon.aps.iva.kb0.h;
import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import com.ellation.crunchyroll.api.etp.auth.model.MigrationStatus;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: UserAccountMigrationStatusProvider.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.eo.a a;

    /* compiled from: UserAccountMigrationStatusProvider.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MigrationStatus.values().length];
            try {
                iArr[MigrationStatus.NO_CONFLICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MigrationStatus.UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MigrationStatus.ARCHIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public g(com.amazon.aps.iva.eo.c cVar) {
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.ho.f
    public final e a() {
        FunUser funUser = this.a.getFunUser();
        if (funUser == null) {
            return null;
        }
        int i = a.a[funUser.getMigrationStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (funUser.getWatchDataStatus() != WatchDataStatus.NOT_MIGRATED) {
                        return null;
                    }
                    return e.MIGRATION_WELCOME;
                }
                throw new h();
            } else if (funUser.isFunLogin()) {
                return e.OWNERSHIP_VERIFICATION;
            } else {
                if (funUser.getWatchDataStatus() != WatchDataStatus.NOT_MIGRATED) {
                    return null;
                }
                return e.MIGRATION_WELCOME;
            }
        } else if (!funUser.isFunLogin()) {
            return null;
        } else {
            return e.ACCEPT_TOS;
        }
    }
}

package com.ellation.crunchyroll.api.etp.auth.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: FunUser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "Ljava/io/Serializable;", "isFunLogin", "", "migrationStatus", "Lcom/ellation/crunchyroll/api/etp/auth/model/MigrationStatus;", "watchDataStatus", "Lcom/ellation/crunchyroll/api/etp/auth/model/WatchDataStatus;", "(ZLcom/ellation/crunchyroll/api/etp/auth/model/MigrationStatus;Lcom/ellation/crunchyroll/api/etp/auth/model/WatchDataStatus;)V", "()Z", "getMigrationStatus", "()Lcom/ellation/crunchyroll/api/etp/auth/model/MigrationStatus;", "getWatchDataStatus", "()Lcom/ellation/crunchyroll/api/etp/auth/model/WatchDataStatus;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FunUser implements Serializable {
    public static final int $stable = 0;
    @SerializedName("is_fun_login")
    private final boolean isFunLogin;
    @SerializedName("migration_status")
    private final MigrationStatus migrationStatus;
    @SerializedName("watch_data_status")
    private final WatchDataStatus watchDataStatus;

    public FunUser(boolean z, MigrationStatus migrationStatus, WatchDataStatus watchDataStatus) {
        j.f(migrationStatus, "migrationStatus");
        j.f(watchDataStatus, "watchDataStatus");
        this.isFunLogin = z;
        this.migrationStatus = migrationStatus;
        this.watchDataStatus = watchDataStatus;
    }

    public static /* synthetic */ FunUser copy$default(FunUser funUser, boolean z, MigrationStatus migrationStatus, WatchDataStatus watchDataStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z = funUser.isFunLogin;
        }
        if ((i & 2) != 0) {
            migrationStatus = funUser.migrationStatus;
        }
        if ((i & 4) != 0) {
            watchDataStatus = funUser.watchDataStatus;
        }
        return funUser.copy(z, migrationStatus, watchDataStatus);
    }

    public final boolean component1() {
        return this.isFunLogin;
    }

    public final MigrationStatus component2() {
        return this.migrationStatus;
    }

    public final WatchDataStatus component3() {
        return this.watchDataStatus;
    }

    public final FunUser copy(boolean z, MigrationStatus migrationStatus, WatchDataStatus watchDataStatus) {
        j.f(migrationStatus, "migrationStatus");
        j.f(watchDataStatus, "watchDataStatus");
        return new FunUser(z, migrationStatus, watchDataStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunUser)) {
            return false;
        }
        FunUser funUser = (FunUser) obj;
        if (this.isFunLogin == funUser.isFunLogin && this.migrationStatus == funUser.migrationStatus && this.watchDataStatus == funUser.watchDataStatus) {
            return true;
        }
        return false;
    }

    public final MigrationStatus getMigrationStatus() {
        return this.migrationStatus;
    }

    public final WatchDataStatus getWatchDataStatus() {
        return this.watchDataStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isFunLogin;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = this.migrationStatus.hashCode();
        return this.watchDataStatus.hashCode() + ((hashCode + (r0 * 31)) * 31);
    }

    public final boolean isFunLogin() {
        return this.isFunLogin;
    }

    public String toString() {
        boolean z = this.isFunLogin;
        MigrationStatus migrationStatus = this.migrationStatus;
        WatchDataStatus watchDataStatus = this.watchDataStatus;
        return "FunUser(isFunLogin=" + z + ", migrationStatus=" + migrationStatus + ", watchDataStatus=" + watchDataStatus + ")";
    }
}

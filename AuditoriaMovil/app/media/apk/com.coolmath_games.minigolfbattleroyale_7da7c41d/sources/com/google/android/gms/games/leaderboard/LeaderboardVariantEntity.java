package com.google.android.gms.games.leaderboard;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.games.zzfa;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int zzki;
    private final int zzkj;
    private final boolean zzkk;
    private final long zzkl;
    private final String zzkm;
    private final long zzkn;
    private final String zzko;
    private final String zzkp;
    private final long zzkq;
    private final String zzkr;
    private final String zzks;
    private final String zzkt;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardVariant) {
        this.zzki = leaderboardVariant.getTimeSpan();
        this.zzkj = leaderboardVariant.getCollection();
        this.zzkk = leaderboardVariant.hasPlayerInfo();
        this.zzkl = leaderboardVariant.getRawPlayerScore();
        this.zzkm = leaderboardVariant.getDisplayPlayerScore();
        this.zzkn = leaderboardVariant.getPlayerRank();
        this.zzko = leaderboardVariant.getDisplayPlayerRank();
        this.zzkp = leaderboardVariant.getPlayerScoreTag();
        this.zzkq = leaderboardVariant.getNumScores();
        this.zzkr = leaderboardVariant.zzch();
        this.zzks = leaderboardVariant.zzci();
        this.zzkt = leaderboardVariant.zzcj();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ LeaderboardVariant freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return this.zzki;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return this.zzkj;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return this.zzkk;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        return this.zzkl;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerScore() {
        return this.zzkm;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        return this.zzkn;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerRank() {
        return this.zzko;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getPlayerScoreTag() {
        return this.zzkp;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        return this.zzkq;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzch() {
        return this.zzkr;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzci() {
        return this.zzks;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzcj() {
        return this.zzkt;
    }

    public final int hashCode() {
        return zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(LeaderboardVariant leaderboardVariant) {
        return Objects.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.zzch(), leaderboardVariant.zzcj(), leaderboardVariant.zzci());
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(LeaderboardVariant leaderboardVariant, Object obj) {
        if (obj instanceof LeaderboardVariant) {
            if (leaderboardVariant == obj) {
                return true;
            }
            LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
            return Objects.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && Objects.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && Objects.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && Objects.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && Objects.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && Objects.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && Objects.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && Objects.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && Objects.equal(leaderboardVariant2.zzch(), leaderboardVariant.zzch()) && Objects.equal(leaderboardVariant2.zzcj(), leaderboardVariant.zzcj()) && Objects.equal(leaderboardVariant2.zzci(), leaderboardVariant.zzci());
        }
        return false;
    }

    public final String toString() {
        return zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(LeaderboardVariant leaderboardVariant) {
        Objects.ToStringHelper add = Objects.toStringHelper(leaderboardVariant).add("TimeSpan", zzfa.zzo(leaderboardVariant.getTimeSpan()));
        int collection = leaderboardVariant.getCollection();
        String str = "SOCIAL_1P";
        if (collection == -1) {
            str = "UNKNOWN";
        } else if (collection == 0) {
            str = "PUBLIC";
        } else if (collection == 1) {
            str = "SOCIAL";
        } else if (collection != 2) {
            if (collection == 3) {
                str = ShareConstants.PEOPLE_IDS;
            } else if (collection != 4) {
                StringBuilder sb = new StringBuilder(43);
                sb.append("Unknown leaderboard collection: ");
                sb.append(collection);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Objects.ToStringHelper add2 = add.add("Collection", str);
        boolean hasPlayerInfo = leaderboardVariant.hasPlayerInfo();
        String str2 = IntegrityManager.INTEGRITY_TYPE_NONE;
        Objects.ToStringHelper add3 = add2.add("RawPlayerScore", hasPlayerInfo ? Long.valueOf(leaderboardVariant.getRawPlayerScore()) : IntegrityManager.INTEGRITY_TYPE_NONE).add("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : IntegrityManager.INTEGRITY_TYPE_NONE).add("PlayerRank", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getPlayerRank()) : IntegrityManager.INTEGRITY_TYPE_NONE);
        if (leaderboardVariant.hasPlayerInfo()) {
            str2 = leaderboardVariant.getDisplayPlayerRank();
        }
        return add3.add("DisplayPlayerRank", str2).add("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).add("TopPageNextToken", leaderboardVariant.zzch()).add("WindowPageNextToken", leaderboardVariant.zzcj()).add("WindowPagePrevToken", leaderboardVariant.zzci()).toString();
    }
}

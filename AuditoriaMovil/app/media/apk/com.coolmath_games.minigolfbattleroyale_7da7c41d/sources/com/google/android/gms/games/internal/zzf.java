package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.FriendsResolutionRequiredException;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.google.android.gms.games.GamesClientStatusCodes;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.games.VideosClient;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.PlayerStatsBuffer;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.internal.games.zzfd;
import com.google.android.gms.internal.games.zzfe;
import com.google.android.gms.internal.games.zzfi;
import com.google.android.gms.internal.games.zzgh;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public class zzf extends GmsClient<com.google.android.gms.games.internal.zzac> {
    private final zzfe zzdh;
    private final String zzdi;
    private PlayerEntity zzdj;
    private GameEntity zzdk;
    private final com.google.android.gms.games.internal.zzae zzdl;
    private boolean zzdm;
    private final long zzdn;
    private boolean zzdo;
    private final Games.GamesOptions zzdp;
    private Bundle zzdq;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public interface zzar<T> {
        void accept(T t);
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static abstract class zzo extends DataHolderResult {
        zzo(DataHolder dataHolder) {
            super(dataHolder, GamesStatusCodes.zza(dataHolder.getStatusCode()));
        }
    }

    public zzf(Context context, Looper looper, ClientSettings clientSettings, Games.GamesOptions gamesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 1, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzdh = new com.google.android.gms.games.internal.zze(this);
        this.zzdm = false;
        this.zzdo = false;
        this.zzdi = clientSettings.getRealClientPackageName();
        this.zzdl = com.google.android.gms.games.internal.zzae.zza(this, clientSettings.getGravityForPopups());
        this.zzdn = hashCode();
        this.zzdp = gamesOptions;
        if (gamesOptions.zzaq) {
            return;
        }
        if (clientSettings.getViewForPopups() != null || (context instanceof Activity)) {
            zza(clientSettings.getViewForPopups());
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresAccount() {
        return true;
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzah extends zzo implements Snapshots.LoadSnapshotsResult {
        zzah(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
        public final SnapshotMetadataBuffer getSnapshots() {
            return new SnapshotMetadataBuffer(this.mDataHolder);
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzak extends zzo implements Snapshots.OpenSnapshotResult {
        private final String zzch;
        private final Snapshot zzem;
        private final Snapshot zzen;
        private final SnapshotContents zzeo;

        zzak(DataHolder dataHolder, Contents contents) {
            this(dataHolder, null, contents, null, null);
        }

        zzak(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() == 0) {
                    this.zzem = null;
                    this.zzen = null;
                } else {
                    boolean z = true;
                    if (snapshotMetadataBuffer.getCount() == 1) {
                        if (dataHolder.getStatusCode() == 4004) {
                            z = false;
                        }
                        Asserts.checkState(z);
                        this.zzem = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                        this.zzen = null;
                    } else {
                        this.zzem = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                        this.zzen = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(1)), new SnapshotContentsEntity(contents2));
                    }
                }
                snapshotMetadataBuffer.release();
                this.zzch = str;
                this.zzeo = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                snapshotMetadataBuffer.release();
                throw th;
            }
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
        public final Snapshot getSnapshot() {
            return this.zzem;
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
        public final String getConflictId() {
            return this.zzch;
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
        public final Snapshot getConflictingSnapshot() {
            return this.zzen;
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
        public final SnapshotContents getResolutionSnapshotContents() {
            return this.zzeo;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzam extends zzaq<Players.LoadPlayersResult> {
        zzam(BaseImplementation.ResultHolder<Players.LoadPlayersResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zze(DataHolder dataHolder) {
            setResult(new zzaf(dataHolder));
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzf(DataHolder dataHolder) {
            setResult(new zzaf(dataHolder));
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzas extends zzaq<Snapshots.OpenSnapshotResult> {
        zzas(BaseImplementation.ResultHolder<Snapshots.OpenSnapshotResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, Contents contents) {
            setResult(new zzak(dataHolder, contents));
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            setResult(new zzak(dataHolder, str, contents, contents2, contents3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzau extends zzaq<Snapshots.LoadSnapshotsResult> {
        zzau(BaseImplementation.ResultHolder<Snapshots.LoadSnapshotsResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzag(DataHolder dataHolder) {
            setResult(new zzah(dataHolder));
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzb extends zzaq<Achievements.UpdateAchievementResult> {
        zzb(BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzb(int i, String str) {
            setResult(new zzaw(i, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzk extends zzaq<Events.LoadEventsResult> {
        zzk(BaseImplementation.ResultHolder<Events.LoadEventsResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzb(DataHolder dataHolder) {
            setResult(new zzab(dataHolder));
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzs extends zzaq<Leaderboards.LoadScoresResult> {
        zzs(BaseImplementation.ResultHolder<Leaderboards.LoadScoresResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, DataHolder dataHolder2) {
            setResult(new zzae(dataHolder, dataHolder2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzu extends zzaq<Leaderboards.LeaderboardMetadataResult> {
        zzu(BaseImplementation.ResultHolder<Leaderboards.LeaderboardMetadataResult> resultHolder) {
            super(resultHolder);
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzc(DataHolder dataHolder) {
            setResult(new zzq(dataHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static abstract class zzz<T> implements ListenerHolder.Notifier<T> {
        private zzz() {
        }

        @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
        public void onNotifyListenerFailed() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ zzz(com.google.android.gms.games.internal.zze zzeVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzaa extends zzo implements GamesMetadata.LoadGamesResult {
        private final GameBuffer zzef;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzaa(DataHolder dataHolder) {
            super(dataHolder);
            this.zzef = new GameBuffer(dataHolder);
        }

        @Override // com.google.android.gms.games.GamesMetadata.LoadGamesResult
        public final GameBuffer getGames() {
            return this.zzef;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzab extends zzo implements Events.LoadEventsResult {
        private final EventBuffer zzeg;

        zzab(DataHolder dataHolder) {
            super(dataHolder);
            this.zzeg = new EventBuffer(dataHolder);
        }

        @Override // com.google.android.gms.games.event.Events.LoadEventsResult
        public final EventBuffer getEvents() {
            return this.zzeg;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzaf extends zzo implements Players.LoadPlayersResult {
        private final PlayerBuffer zzel;

        zzaf(DataHolder dataHolder) {
            super(dataHolder);
            this.zzel = new PlayerBuffer(dataHolder);
        }

        @Override // com.google.android.gms.games.Players.LoadPlayersResult
        public final PlayerBuffer getPlayers() {
            return this.zzel;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzaj extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<SnapshotMetadataBuffer>> zzdv;

        zzaj(TaskCompletionSource<AnnotatedData<SnapshotMetadataBuffer>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzag(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 0 || z) {
                this.zzdv.setResult(new AnnotatedData<>(new SnapshotMetadataBuffer(dataHolder), z));
                return;
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzan extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<PlayerStats>> zzdv;

        zzan(TaskCompletionSource<AnnotatedData<PlayerStats>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzao(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0 || statusCode == 3) {
                PlayerStatsBuffer playerStatsBuffer = new PlayerStatsBuffer(dataHolder);
                try {
                    PlayerStats freeze = playerStatsBuffer.getCount() > 0 ? ((PlayerStats) playerStatsBuffer.get(0)).freeze() : null;
                    playerStatsBuffer.close();
                    this.zzdv.setResult(new AnnotatedData<>(freeze, statusCode == 3));
                    return;
                } catch (Throwable th) {
                    try {
                        playerStatsBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzao extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<Player>> zzdv;

        zzao(TaskCompletionSource<AnnotatedData<Player>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zze(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0 || statusCode == 3) {
                PlayerBuffer playerBuffer = new PlayerBuffer(dataHolder);
                try {
                    this.zzdv.setResult(new AnnotatedData<>(playerBuffer.getCount() > 0 ? ((Player) playerBuffer.get(0)).freeze() : null, statusCode == 3));
                    return;
                } finally {
                    playerBuffer.release();
                }
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private final class zzap extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<PlayerBuffer>> zzdv;

        zzap(TaskCompletionSource<AnnotatedData<PlayerBuffer>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zze(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 10003) {
                zzf.this.zza(this.zzdv);
                dataHolder.close();
                return;
            }
            boolean z = statusCode == 3;
            if (statusCode == 0 || z) {
                this.zzdv.setResult(new AnnotatedData<>(new PlayerBuffer(dataHolder), z));
                return;
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzf(DataHolder dataHolder) {
            zze(dataHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static abstract class zzaq<T> extends com.google.android.gms.games.internal.zza {
        private final BaseImplementation.ResultHolder<T> zzep;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzaq(BaseImplementation.ResultHolder<T> resultHolder) {
            this.zzep = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder, "Holder must not be null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void setResult(T t) {
            this.zzep.setResult(t);
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzat extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<ScoreSubmissionData> zzdv;

        zzat(TaskCompletionSource<ScoreSubmissionData> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzd(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0 || statusCode == 5) {
                try {
                    this.zzdv.setResult(new ScoreSubmissionData(dataHolder));
                    return;
                } finally {
                    dataHolder.close();
                }
            }
            zzf.zzb(this.zzdv, statusCode);
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzav extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>> zzdv;

        zzav(TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, Contents contents) {
            int statusCode = dataHolder.getStatusCode();
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                SnapshotEntity snapshotEntity = snapshotMetadataBuffer.getCount() > 0 ? new SnapshotEntity(((SnapshotMetadata) snapshotMetadataBuffer.get(0)).freeze(), new SnapshotContentsEntity(contents)) : null;
                snapshotMetadataBuffer.close();
                if (statusCode == 0) {
                    this.zzdv.setResult(new SnapshotsClient.DataOrConflict<>(snapshotEntity, null));
                } else if (statusCode == 4002 && snapshotEntity != null && snapshotEntity.getMetadata() != null) {
                    this.zzdv.setException(new SnapshotsClient.SnapshotContentUnavailableApiException(GamesStatusCodes.zza(statusCode), snapshotEntity.getMetadata()));
                } else {
                    zzf.zzb(this.zzdv, statusCode);
                }
            } catch (Throwable th) {
                try {
                    snapshotMetadataBuffer.close();
                } catch (Throwable th2) {
                    zzgh.zza(th, th2);
                }
                throw th;
            }
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() >= 2 && str != null && contents3 != null) {
                    SnapshotEntity snapshotEntity = new SnapshotEntity(((SnapshotMetadata) snapshotMetadataBuffer.get(0)).freeze(), new SnapshotContentsEntity(contents));
                    SnapshotEntity snapshotEntity2 = new SnapshotEntity(((SnapshotMetadata) snapshotMetadataBuffer.get(1)).freeze(), new SnapshotContentsEntity(contents2));
                    snapshotMetadataBuffer.close();
                    this.zzdv.setResult(new SnapshotsClient.DataOrConflict<>(null, new SnapshotsClient.SnapshotConflict(snapshotEntity, str, snapshotEntity2, new SnapshotContentsEntity(contents3))));
                    return;
                }
                this.zzdv.setResult(null);
                snapshotMetadataBuffer.close();
            } catch (Throwable th) {
                try {
                    snapshotMetadataBuffer.close();
                } catch (Throwable th2) {
                    zzgh.zza(th, th2);
                }
                throw th;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzc extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<AchievementBuffer>> zzdv;

        zzc(TaskCompletionSource<AnnotatedData<AchievementBuffer>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0 || statusCode == 3) {
                this.zzdv.setResult(new AnnotatedData<>(new AchievementBuffer(dataHolder), statusCode == 3));
                return;
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzg extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<SnapshotMetadata> zzdv;

        zzg(TaskCompletionSource<SnapshotMetadata> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzah(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0) {
                SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
                try {
                    SnapshotMetadata freeze = snapshotMetadataBuffer.getCount() > 0 ? ((SnapshotMetadata) snapshotMetadataBuffer.get(0)).freeze() : null;
                    snapshotMetadataBuffer.close();
                    this.zzdv.setResult(freeze);
                    return;
                } catch (Throwable th) {
                    try {
                        snapshotMetadataBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public class zzm extends zzfd {
        /* JADX INFO: Access modifiers changed from: package-private */
        public zzm() {
            super(zzf.this.getContext().getMainLooper(), 1000);
        }

        @Override // com.google.android.gms.internal.games.zzfd
        protected final void zzc(String str, int i) {
            try {
                if (zzf.this.isConnected()) {
                    ((com.google.android.gms.games.internal.zzac) zzf.this.getService()).zzb(str, i);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 89);
                sb.append("Unable to increment event ");
                sb.append(str);
                sb.append(" by ");
                sb.append(i);
                sb.append(" because the games client is no longer connected");
                com.google.android.gms.games.internal.zzz.e("GamesGmsClientImpl", sb.toString());
            } catch (RemoteException e) {
                zzf.zza(e);
            } catch (SecurityException e2) {
                zzf.zza(e2);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzn extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<EventBuffer>> zzdv;

        zzn(TaskCompletionSource<AnnotatedData<EventBuffer>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzb(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 0 || z) {
                this.zzdv.setResult(new AnnotatedData<>(new EventBuffer(dataHolder), z));
                return;
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzp extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<Game>> zzdv;

        zzp(TaskCompletionSource<AnnotatedData<Game>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzg(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            if (statusCode == 0 || statusCode == 3) {
                GameBuffer gameBuffer = new GameBuffer(dataHolder);
                try {
                    Game freeze = gameBuffer.getCount() > 0 ? ((Game) gameBuffer.get(0)).freeze() : null;
                    gameBuffer.close();
                    this.zzdv.setResult(new AnnotatedData<>(freeze, statusCode == 3));
                    return;
                } catch (Throwable th) {
                    try {
                        gameBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzq extends zzo implements Leaderboards.LeaderboardMetadataResult {
        private final LeaderboardBuffer zzec;

        zzq(DataHolder dataHolder) {
            super(dataHolder);
            this.zzec = new LeaderboardBuffer(dataHolder);
        }

        @Override // com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
        public final LeaderboardBuffer getLeaderboards() {
            return this.zzec;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzr extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<Leaderboard>> zzdv;

        zzr(TaskCompletionSource<AnnotatedData<Leaderboard>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzc(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 0 || z) {
                LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
                try {
                    Leaderboard freeze = leaderboardBuffer.getCount() > 0 ? leaderboardBuffer.get(0).freeze() : null;
                    leaderboardBuffer.close();
                    this.zzdv.setResult(new AnnotatedData<>(freeze, z));
                    return;
                } catch (Throwable th) {
                    try {
                        leaderboardBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private final class zzt extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<LeaderboardScore>> zzdv;

        zzt(TaskCompletionSource<AnnotatedData<LeaderboardScore>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzac(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 10003) {
                zzf.this.zza(this.zzdv);
                dataHolder.close();
            } else if (statusCode == 0 || z) {
                LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
                try {
                    LeaderboardScore freeze = leaderboardScoreBuffer.getCount() > 0 ? ((LeaderboardScore) leaderboardScoreBuffer.get(0)).freeze() : null;
                    leaderboardScoreBuffer.close();
                    this.zzdv.setResult(new AnnotatedData<>(freeze, z));
                } catch (Throwable th) {
                    try {
                        leaderboardScoreBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            } else {
                zzf.zzb(this.zzdv, statusCode);
                dataHolder.close();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private final class zzv extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>> zzdv;

        zzv(TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(DataHolder dataHolder, DataHolder dataHolder2) {
            int statusCode = dataHolder2.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 10003) {
                zzf.this.zza(this.zzdv);
                dataHolder.close();
                dataHolder2.close();
            } else if (statusCode == 0 || z) {
                LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
                try {
                    Leaderboard freeze = leaderboardBuffer.getCount() > 0 ? leaderboardBuffer.get(0).freeze() : null;
                    leaderboardBuffer.close();
                    this.zzdv.setResult(new AnnotatedData<>(new LeaderboardsClient.LeaderboardScores(freeze, new LeaderboardScoreBuffer(dataHolder2)), z));
                } catch (Throwable th) {
                    try {
                        leaderboardBuffer.close();
                    } catch (Throwable th2) {
                        zzgh.zza(th, th2);
                    }
                    throw th;
                }
            } else {
                zzf.zzb(this.zzdv, statusCode);
                dataHolder.close();
                dataHolder2.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static abstract class zzw<T> extends com.google.android.gms.games.internal.zza {
        private final ListenerHolder<T> zzed;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzw(ListenerHolder<T> listenerHolder) {
            this.zzed = (ListenerHolder) Preconditions.checkNotNull(listenerHolder, "Callback must not be null");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void zzc(zzar<T> zzarVar) {
            this.zzed.notifyListener(zzf.zza(zzarVar));
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzx extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<AnnotatedData<LeaderboardBuffer>> zzdv;

        zzx(TaskCompletionSource<AnnotatedData<LeaderboardBuffer>> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzc(DataHolder dataHolder) {
            int statusCode = dataHolder.getStatusCode();
            boolean z = statusCode == 3;
            if (statusCode == 0 || z) {
                this.zzdv.setResult(new AnnotatedData<>(new LeaderboardBuffer(dataHolder), z));
                return;
            }
            zzf.zzb(this.zzdv, statusCode);
            dataHolder.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzy extends zzo implements Achievements.LoadAchievementsResult {
        private final AchievementBuffer zzee;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzy(DataHolder dataHolder) {
            super(dataHolder);
            this.zzee = new AchievementBuffer(dataHolder);
        }

        @Override // com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
        public final AchievementBuffer getAchievements() {
            return this.zzee;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zza extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<Boolean> zzdv;

        zza(TaskCompletionSource<Boolean> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzb(int i, String str) {
            if (i == 0 || i == 3003) {
                this.zzdv.setResult(Boolean.valueOf(i == 3003));
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static class zzag extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource<CaptureState> zzdv;

        zzag(TaskCompletionSource<CaptureState> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zze(int i, Bundle bundle) {
            if (i == 0) {
                this.zzdv.setResult(CaptureState.zza(bundle));
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static class zzai extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource<Boolean> zzdv;

        zzai(TaskCompletionSource<Boolean> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(int i, boolean z) {
            if (i == 0) {
                this.zzdv.setResult(Boolean.valueOf(z));
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static class zzal extends com.google.android.gms.games.internal.zza {
        private TaskCompletionSource<VideoCapabilities> zzdv;

        zzal(TaskCompletionSource<VideoCapabilities> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zza(int i, VideoCapabilities videoCapabilities) {
            if (i == 0) {
                this.zzdv.setResult(videoCapabilities);
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzaw implements Achievements.UpdateAchievementResult {
        private final String zzck;
        private final Status zzdw;

        zzaw(int i, String str) {
            this.zzdw = GamesStatusCodes.zza(i);
            this.zzck = str;
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override // com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
        public final String getAchievementId() {
            return this.zzck;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzd extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<Void> zzdv;

        zzd(TaskCompletionSource<Void> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zzb(int i, String str) {
            if (i == 0 || i == 3003) {
                this.zzdv.setResult(null);
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zze implements Videos.CaptureCapabilitiesResult {
        private final Status zzdw;
        private final VideoCapabilities zzdx;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zze(Status status, VideoCapabilities videoCapabilities) {
            this.zzdw = status;
            this.zzdx = videoCapabilities;
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override // com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult
        public final VideoCapabilities getCapabilities() {
            return this.zzdx;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* renamed from: com.google.android.gms.games.internal.zzf$zzf  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068zzf implements Videos.CaptureAvailableResult {
        private final Status zzdw;
        private final boolean zzdy;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0068zzf(Status status, boolean z) {
            this.zzdw = status;
            this.zzdy = z;
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override // com.google.android.gms.games.video.Videos.CaptureAvailableResult
        public final boolean isAvailable() {
            return this.zzdy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzh implements Videos.CaptureStateResult {
        private final Status zzdw;
        private final CaptureState zzdz;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzh(Status status, CaptureState captureState) {
            this.zzdw = status;
            this.zzdz = captureState;
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override // com.google.android.gms.games.video.Videos.CaptureStateResult
        public final CaptureState getCaptureState() {
            return this.zzdz;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzi extends com.google.android.gms.games.internal.zza {
        private final TaskCompletionSource<String> zzdv;

        zzi(TaskCompletionSource<String> taskCompletionSource) {
            this.zzdv = taskCompletionSource;
        }

        @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
        public final void zze(int i, String str) {
            if (i == 0) {
                this.zzdv.setResult(str);
            } else {
                zzf.zzb(this.zzdv, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzl implements Snapshots.DeleteSnapshotResult {
        private final Status zzdw;
        private final String zzeb;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzl(int i, String str) {
            this.zzdw = GamesStatusCodes.zza(i);
            this.zzeb = str;
        }

        @Override // com.google.android.gms.common.api.Result
        public final Status getStatus() {
            return this.zzdw;
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
        public final String getSnapshotId() {
            return this.zzeb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzax extends zzo implements Leaderboards.SubmitScoreResult {
        private final ScoreSubmissionData zzeq;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzax(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.zzeq = new ScoreSubmissionData(dataHolder);
            } finally {
                dataHolder.close();
            }
        }

        @Override // com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
        public final ScoreSubmissionData getScoreData() {
            return this.zzeq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzac extends zzo implements Stats.LoadPlayerStatsResult {
        private final PlayerStats zzeh;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzac(DataHolder dataHolder) {
            super(dataHolder);
            PlayerStatsBuffer playerStatsBuffer = new PlayerStatsBuffer(dataHolder);
            try {
                if (playerStatsBuffer.getCount() > 0) {
                    this.zzeh = new PlayerStatsEntity((PlayerStats) playerStatsBuffer.get(0));
                } else {
                    this.zzeh = null;
                }
            } finally {
                playerStatsBuffer.release();
            }
        }

        @Override // com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult
        public final PlayerStats getPlayerStats() {
            return this.zzeh;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzad extends zzo implements Leaderboards.LoadPlayerScoreResult {
        private final LeaderboardScoreEntity zzei;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzad(DataHolder dataHolder) {
            super(dataHolder);
            LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
            try {
                if (leaderboardScoreBuffer.getCount() > 0) {
                    this.zzei = (LeaderboardScoreEntity) ((LeaderboardScore) leaderboardScoreBuffer.get(0)).freeze();
                } else {
                    this.zzei = null;
                }
            } finally {
                leaderboardScoreBuffer.release();
            }
        }

        @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
        public final LeaderboardScore getScore() {
            return this.zzei;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class zzj extends zzo implements Snapshots.CommitSnapshotResult {
        private final SnapshotMetadata zzea;

        /* JADX INFO: Access modifiers changed from: package-private */
        public zzj(DataHolder dataHolder) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() > 0) {
                    this.zzea = new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0));
                } else {
                    this.zzea = null;
                }
            } finally {
                snapshotMetadataBuffer.release();
            }
        }

        @Override // com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
        public final SnapshotMetadata getSnapshotMetadata() {
            return this.zzea;
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    private static final class zzae extends zzo implements Leaderboards.LoadScoresResult {
        private final LeaderboardEntity zzej;
        private final LeaderboardScoreBuffer zzek;

        zzae(DataHolder dataHolder, DataHolder dataHolder2) {
            super(dataHolder2);
            LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
            try {
                if (leaderboardBuffer.getCount() > 0) {
                    this.zzej = (LeaderboardEntity) leaderboardBuffer.get(0).freeze();
                } else {
                    this.zzej = null;
                }
                leaderboardBuffer.release();
                this.zzek = new LeaderboardScoreBuffer(dataHolder2);
            } catch (Throwable th) {
                leaderboardBuffer.release();
                throw th;
            }
        }

        @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
        public final Leaderboard getLeaderboard() {
            return this.zzej;
        }

        @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
        public final LeaderboardScoreBuffer getScores() {
            return this.zzek;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresSignIn() {
        return (this.zzdp.zzaw == 1 || this.zzdp.zzat != null || this.zzdp.zzaq) ? false : true;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.api.Api.Client
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return getScopes();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzdm = false;
    }

    public final void zzn(int i) {
        this.zzdl.setGravity(i);
    }

    public final void zza(View view) {
        this.zzdl.zzb(view);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        this.zzdj = null;
        this.zzdk = null;
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public void disconnect() {
        this.zzdm = false;
        if (isConnected()) {
            try {
                this.zzdh.flush();
                ((com.google.android.gms.games.internal.zzac) getService()).zza(this.zzdn);
            } catch (RemoteException unused) {
                com.google.android.gms.games.internal.zzz.w("GamesGmsClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getConnectionHint() {
        try {
            Bundle connectionHint = ((com.google.android.gms.games.internal.zzac) getService()).getConnectionHint();
            if (connectionHint != null) {
                connectionHint.setClassLoader(zzf.class.getClassLoader());
                this.zzdq = connectionHint;
            }
            return connectionHint;
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final Bundle zzah() {
        Bundle connectionHint = getConnectionHint();
        if (connectionHint == null) {
            connectionHint = this.zzdq;
        }
        this.zzdq = null;
        return connectionHint;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getGetServiceRequestExtraArgs() {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle zzj2 = this.zzdp.zzj();
        zzj2.putString(ServiceSpecificExtraArgs.GamesExtraArgs.GAME_PACKAGE_NAME, this.zzdi);
        zzj2.putString(ServiceSpecificExtraArgs.GamesExtraArgs.DESIRED_LOCALE, locale);
        zzj2.putParcelable(ServiceSpecificExtraArgs.GamesExtraArgs.WINDOW_TOKEN, new BinderWrapper(this.zzdl.zzbm()));
        if (!zzj2.containsKey("com.google.android.gms.games.key.API_VERSION")) {
            zzj2.putInt("com.google.android.gms.games.key.API_VERSION", 8);
        }
        zzj2.putBundle(ServiceSpecificExtraArgs.GamesExtraArgs.SIGNIN_OPTIONS, SignInClientImpl.createBundleFromClientSettings(getClientSettings()));
        return zzj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(TaskCompletionSource<?> taskCompletionSource) {
        try {
            taskCompletionSource.setException(FriendsResolutionRequiredException.zza(GamesClientStatusCodes.zza(GamesClientStatusCodes.CONSENT_REQUIRED, ((com.google.android.gms.games.internal.zzac) getService()).zzbk())));
        } catch (RemoteException e) {
            taskCompletionSource.setException(e);
        }
    }

    public final String zzai() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzai();
    }

    public final String zzaj() {
        try {
            return zzai();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final String zzb(boolean z) throws RemoteException {
        PlayerEntity playerEntity = this.zzdj;
        if (playerEntity != null) {
            return playerEntity.getPlayerId();
        }
        return ((com.google.android.gms.games.internal.zzac) getService()).zzbf();
    }

    public final String zzc(boolean z) {
        try {
            return zzb(true);
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final Player zzak() throws RemoteException {
        checkConnected();
        synchronized (this) {
            if (this.zzdj == null) {
                PlayerBuffer playerBuffer = new PlayerBuffer(((com.google.android.gms.games.internal.zzac) getService()).zzbg());
                if (playerBuffer.getCount() > 0) {
                    this.zzdj = (PlayerEntity) ((Player) playerBuffer.get(0)).freeze();
                }
                playerBuffer.release();
            }
        }
        return this.zzdj;
    }

    public final void zza(TaskCompletionSource<AnnotatedData<Player>> taskCompletionSource, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzao(taskCompletionSource), (String) null, z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final Player zzal() {
        try {
            return zzak();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final Game zzam() throws RemoteException {
        checkConnected();
        synchronized (this) {
            if (this.zzdk == null) {
                GameBuffer gameBuffer = new GameBuffer(((com.google.android.gms.games.internal.zzac) getService()).zzbh());
                if (gameBuffer.getCount() > 0) {
                    this.zzdk = (GameEntity) ((Game) gameBuffer.get(0)).freeze();
                }
                gameBuffer.release();
            }
        }
        return this.zzdk;
    }

    public final Game zzan() {
        try {
            return zzam();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<Player>> taskCompletionSource, String str, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzao(taskCompletionSource), str, z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Players.LoadPlayersResult> resultHolder, String str, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzam(resultHolder), str, z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Players.LoadPlayersResult> resultHolder, int i, boolean z, boolean z2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzam(resultHolder), i, z, z2);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<PlayerBuffer>> taskCompletionSource, String str, int i, boolean z, boolean z2) throws RemoteException {
        if (!str.equals("played_with") && !str.equals("friends_all")) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid player collection: ".concat(valueOf) : new String("Invalid player collection: "));
        }
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzap(taskCompletionSource), str, i, z, z2);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Players.LoadPlayersResult> resultHolder, String str, int i, boolean z, boolean z2) throws RemoteException {
        if (!str.equals("played_with") && !str.equals("friends_all")) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid player collection: ".concat(valueOf) : new String("Invalid player collection: "));
        }
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzam(resultHolder), str, i, z, z2);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Players.LoadPlayersResult> resultHolder, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzc(new zzam(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final Intent zzao() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzao();
    }

    public final Intent zzap() {
        try {
            return zzao();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final Intent zza(String str, int i, int i2) {
        try {
            return ((com.google.android.gms.games.internal.zzac) getService()).zzb(str, i, i2);
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zzb(TaskCompletionSource<AnnotatedData<LeaderboardBuffer>> taskCompletionSource, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzx(taskCompletionSource), z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(TaskCompletionSource<AnnotatedData<Leaderboard>> taskCompletionSource, String str, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzr(taskCompletionSource), str, z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Leaderboards.LeaderboardMetadataResult> resultHolder, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzu(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Leaderboards.LeaderboardMetadataResult> resultHolder, String str, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzu(resultHolder), str, z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<LeaderboardScore>> taskCompletionSource, String str, int i, int i2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzt(taskCompletionSource), (String) null, str, i, i2);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Leaderboards.LoadPlayerScoreResult> resultHolder, String str, String str2, int i, int i2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzt(resultHolder), (String) null, str2, i, i2);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>> taskCompletionSource, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzv(taskCompletionSource), str, i, i2, i3, z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Leaderboards.LoadScoresResult> resultHolder, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzs(resultHolder), str, i, i2, i3, z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzb(TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>> taskCompletionSource, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzv(taskCompletionSource), str, i, i2, i3, z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Leaderboards.LoadScoresResult> resultHolder, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzs(resultHolder), str, i, i2, i3, z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>> taskCompletionSource, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzv(taskCompletionSource), leaderboardScoreBuffer.zzcf().zzcg(), i, i2);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Leaderboards.LoadScoresResult> resultHolder, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzs(resultHolder), leaderboardScoreBuffer.zzcf().zzcg(), i, i2);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<ScoreSubmissionData> taskCompletionSource, String str, long j, String str2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzat(taskCompletionSource), str, j, str2);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Leaderboards.SubmitScoreResult> resultHolder, String str, long j, String str2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(resultHolder == null ? null : new com.google.android.gms.games.internal.zzs(resultHolder), str, j, str2);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void submitScore(String str, long j, String str2) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza((com.google.android.gms.games.internal.zzy) null, str, j, str2);
        } catch (SecurityException unused) {
        }
    }

    public final Intent zzaq() {
        try {
            return ((com.google.android.gms.games.internal.zzac) getService()).zzaq();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zzc(TaskCompletionSource<AnnotatedData<AchievementBuffer>> taskCompletionSource, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzc(taskCompletionSource), z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzc(BaseImplementation.ResultHolder<Achievements.LoadAchievementsResult> resultHolder, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzv(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<Void> taskCompletionSource, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(taskCompletionSource == null ? null : new zzd(taskCompletionSource), str, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult> resultHolder, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(resultHolder == null ? null : new zzb(resultHolder), str, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzb(TaskCompletionSource<Void> taskCompletionSource, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(taskCompletionSource == null ? null : new zzd(taskCompletionSource), str, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult> resultHolder, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(resultHolder == null ? null : new zzb(resultHolder), str, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<Boolean> taskCompletionSource, String str, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(taskCompletionSource == null ? null : new zza(taskCompletionSource), str, i, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult> resultHolder, String str, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(resultHolder == null ? null : new zzb(resultHolder), str, i, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzb(TaskCompletionSource<Boolean> taskCompletionSource, String str, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(taskCompletionSource == null ? null : new zza(taskCompletionSource), str, i, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Achievements.UpdateAchievementResult> resultHolder, String str, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(resultHolder == null ? null : new zzb(resultHolder), str, i, this.zzdl.zzbm(), this.zzdl.zzbl());
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzd(BaseImplementation.ResultHolder<Events.LoadEventsResult> resultHolder, boolean z) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zze(new zzk(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzd(TaskCompletionSource<AnnotatedData<EventBuffer>> taskCompletionSource, boolean z) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zze(new zzn(taskCompletionSource), z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Events.LoadEventsResult> resultHolder, boolean z, String... strArr) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzk(resultHolder), z, strArr);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<AnnotatedData<EventBuffer>> taskCompletionSource, boolean z, String... strArr) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzn(taskCompletionSource), z, strArr);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzb(String str, int i) {
        this.zzdh.zzb(str, i);
    }

    public final Intent zza(PlayerEntity playerEntity) throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zza(playerEntity);
    }

    public final Intent zzb(PlayerEntity playerEntity) {
        try {
            return zza(playerEntity);
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final Intent zzar() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzar();
    }

    public final Intent zzas() {
        try {
            return zzar();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zzb(TaskCompletionSource<AnnotatedData<Game>> taskCompletionSource) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new zzp(taskCompletionSource));
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<GamesMetadata.LoadGamesResult> resultHolder) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzb(new com.google.android.gms.games.internal.zzu(resultHolder));
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        try {
            zzb(new com.google.android.gms.games.internal.zzx(signOutCallbacks));
        } catch (RemoteException unused) {
            signOutCallbacks.onSignOutComplete();
        }
    }

    public final void zzb(BaseImplementation.ResultHolder<Status> resultHolder) throws RemoteException {
        this.zzdh.flush();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzw(resultHolder));
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zze(TaskCompletionSource<AnnotatedData<PlayerStats>> taskCompletionSource, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzf(new zzan(taskCompletionSource), z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zze(BaseImplementation.ResultHolder<Stats.LoadPlayerStatsResult> resultHolder, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzf(new com.google.android.gms.games.internal.zzh(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final int zzat() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzat();
    }

    public final int zzau() {
        try {
            return zzat();
        } catch (RemoteException e) {
            zza(e);
            return -1;
        }
    }

    public final int zzav() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzav();
    }

    public final int zzaw() {
        try {
            return zzav();
        } catch (RemoteException e) {
            zza(e);
            return -1;
        }
    }

    public final Intent zza(String str, boolean z, boolean z2, int i) throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zza(str, z, z2, i);
    }

    public final Intent zzb(String str, boolean z, boolean z2, int i) {
        try {
            return zza(str, z, z2, i);
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zzf(BaseImplementation.ResultHolder<Snapshots.LoadSnapshotsResult> resultHolder, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzd(new zzau(resultHolder), z);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzf(TaskCompletionSource<AnnotatedData<SnapshotMetadataBuffer>> taskCompletionSource, boolean z) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzd(new zzaj(taskCompletionSource), z);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Snapshots.OpenSnapshotResult> resultHolder, String str, boolean z, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzas(resultHolder), str, z, i);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>> taskCompletionSource, String str, boolean z, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzav(taskCompletionSource), str, z, i);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Snapshots.CommitSnapshotResult> resultHolder, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) throws RemoteException {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
        BitmapTeleporter zzcl = snapshotMetadataChange.zzcl();
        if (zzcl != null) {
            zzcl.setTempDir(getContext().getCacheDir());
        }
        Contents zzck = snapshotContents.zzck();
        snapshotContents.close();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzg(resultHolder), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzck);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<SnapshotMetadata> taskCompletionSource, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) throws RemoteException {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
        BitmapTeleporter zzcl = snapshotMetadataChange.zzcl();
        if (zzcl != null) {
            zzcl.setTempDir(getContext().getCacheDir());
        }
        Contents zzck = snapshotContents.zzck();
        snapshotContents.close();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzg(taskCompletionSource), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzck);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(Snapshot snapshot) throws RemoteException {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
        Contents zzck = snapshotContents.zzck();
        snapshotContents.close();
        ((com.google.android.gms.games.internal.zzac) getService()).zza(zzck);
    }

    public final void zzb(Snapshot snapshot) {
        try {
            zza(snapshot);
        } catch (RemoteException e) {
            zza(e);
        }
    }

    public final void zzc(BaseImplementation.ResultHolder<Snapshots.DeleteSnapshotResult> resultHolder, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzj(resultHolder), str);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzc(TaskCompletionSource<String> taskCompletionSource, String str) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzi(taskCompletionSource), str);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Snapshots.OpenSnapshotResult> resultHolder, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) throws RemoteException {
        Preconditions.checkState(!snapshotContents.isClosed(), "SnapshotContents already closed");
        BitmapTeleporter zzcl = snapshotMetadataChange.zzcl();
        if (zzcl != null) {
            zzcl.setTempDir(getContext().getCacheDir());
        }
        Contents zzck = snapshotContents.zzck();
        snapshotContents.close();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzas(resultHolder), str, str2, (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzck);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zza(TaskCompletionSource<SnapshotsClient.DataOrConflict<Snapshot>> taskCompletionSource, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) throws RemoteException {
        Preconditions.checkState(!snapshotContents.isClosed(), "SnapshotContents already closed");
        BitmapTeleporter zzcl = snapshotMetadataChange.zzcl();
        if (zzcl != null) {
            zzcl.setTempDir(getContext().getCacheDir());
        }
        Contents zzck = snapshotContents.zzck();
        snapshotContents.close();
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new zzav(taskCompletionSource), str, str2, (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzck);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zzc(BaseImplementation.ResultHolder<Videos.CaptureCapabilitiesResult> resultHolder) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzc(new com.google.android.gms.games.internal.zzi(resultHolder));
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzc(TaskCompletionSource<VideoCapabilities> taskCompletionSource) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzc(new zzal(taskCompletionSource));
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final Intent zzax() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzbj();
    }

    public final Intent zzay() {
        try {
            return zzax();
        } catch (RemoteException e) {
            zza(e);
            return null;
        }
    }

    public final void zzd(BaseImplementation.ResultHolder<Videos.CaptureStateResult> resultHolder) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzd(new com.google.android.gms.games.internal.zzl(resultHolder));
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final void zzd(TaskCompletionSource<CaptureState> taskCompletionSource) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zzd(new zzag(taskCompletionSource));
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(TaskCompletionSource<Boolean> taskCompletionSource, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza((com.google.android.gms.games.internal.zzy) new zzai(taskCompletionSource), i);
        } catch (SecurityException e) {
            zza(taskCompletionSource, e);
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Videos.CaptureAvailableResult> resultHolder, int i) throws RemoteException {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza((com.google.android.gms.games.internal.zzy) new com.google.android.gms.games.internal.zzk(resultHolder), i);
        } catch (SecurityException e) {
            zza(resultHolder, e);
        }
    }

    public final boolean zzaz() throws RemoteException {
        return ((com.google.android.gms.games.internal.zzac) getService()).zzaz();
    }

    public final boolean zzba() {
        try {
            return zzaz();
        } catch (RemoteException e) {
            zza(e);
            return false;
        }
    }

    public final void zza(ListenerHolder<VideosClient.OnCaptureOverlayStateListener> listenerHolder) throws RemoteException {
        ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzn(listenerHolder), this.zzdn);
    }

    public final void zzb(ListenerHolder<Videos.CaptureOverlayStateListener> listenerHolder) {
        try {
            ((com.google.android.gms.games.internal.zzac) getService()).zza(new com.google.android.gms.games.internal.zzp(listenerHolder), this.zzdn);
        } catch (RemoteException e) {
            zza(e);
        }
    }

    public final void zzbb() throws RemoteException {
        ((com.google.android.gms.games.internal.zzac) getService()).zzb(this.zzdn);
    }

    public final void zzbc() {
        try {
            zzbb();
        } catch (RemoteException e) {
            zza(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((com.google.android.gms.games.internal.zzac) getService()).zza(iBinder, bundle);
            } catch (RemoteException e) {
                zza(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbd() {
        if (isConnected()) {
            try {
                ((com.google.android.gms.games.internal.zzac) getService()).zzbd();
            } catch (RemoteException e) {
                zza(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(RemoteException remoteException) {
        com.google.android.gms.games.internal.zzz.w("GamesGmsClientImpl", "service died", remoteException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(SecurityException securityException) {
        com.google.android.gms.games.internal.zzz.e("GamesGmsClientImpl", "Is player signed out?", securityException);
    }

    private static <R> void zza(BaseImplementation.ResultHolder<R> resultHolder, SecurityException securityException) {
        if (resultHolder != null) {
            resultHolder.setFailedResult(GamesClientStatusCodes.zza(4));
        }
    }

    private static <R> void zza(TaskCompletionSource<R> taskCompletionSource, SecurityException securityException) {
        if (taskCompletionSource != null) {
            taskCompletionSource.setException(new ApiException(GamesClientStatusCodes.zza(4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R> void zzb(TaskCompletionSource<R> taskCompletionSource, int i) {
        int i2;
        Status zza2 = GamesStatusCodes.zza(i);
        int statusCode = zza2.getStatusCode();
        if (statusCode == 1) {
            i2 = 8;
        } else if (statusCode == 2) {
            i2 = 26502;
        } else if (statusCode == 3) {
            i2 = 26503;
        } else if (statusCode == 4) {
            i2 = GamesClientStatusCodes.NETWORK_ERROR_NO_DATA;
        } else if (statusCode == 5) {
            i2 = 26505;
        } else if (statusCode != 6) {
            if (statusCode != 7) {
                if (statusCode == 1500) {
                    i2 = 26540;
                } else if (statusCode != 1501) {
                    switch (statusCode) {
                        case 7:
                            break;
                        case 8:
                            i2 = GamesClientStatusCodes.APP_MISCONFIGURED;
                            break;
                        case 9:
                            i2 = GamesClientStatusCodes.GAME_NOT_FOUND;
                            break;
                        case 500:
                            i2 = 26520;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_NOT_ACTIVE /* 9000 */:
                            i2 = GamesClientStatusCodes.VIDEO_NOT_ACTIVE;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_UNSUPPORTED /* 9001 */:
                            i2 = GamesClientStatusCodes.VIDEO_UNSUPPORTED;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_PERMISSION_ERROR /* 9002 */:
                            i2 = GamesClientStatusCodes.VIDEO_PERMISSION_ERROR;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR /* 9003 */:
                            i2 = GamesClientStatusCodes.VIDEO_STORAGE_ERROR;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR /* 9004 */:
                            i2 = GamesClientStatusCodes.VIDEO_UNEXPECTED_CAPTURE_ERROR;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_ALREADY_CAPTURING /* 9006 */:
                            i2 = GamesClientStatusCodes.VIDEO_ALREADY_CAPTURING;
                            break;
                        case GamesStatusCodes.STATUS_VIDEO_OUT_OF_DISK_SPACE /* 9009 */:
                            i2 = GamesClientStatusCodes.VIDEO_OUT_OF_DISK_SPACE;
                            break;
                        case 9010:
                            i2 = 26627;
                            break;
                        case 9011:
                            i2 = 26628;
                            break;
                        case 9012:
                            i2 = 26629;
                            break;
                        case 9016:
                            i2 = 26630;
                            break;
                        case 9017:
                            i2 = 26631;
                            break;
                        case 9018:
                            i2 = 26632;
                            break;
                        case 9200:
                            i2 = 26650;
                            break;
                        case 9202:
                            i2 = 26652;
                            break;
                        case 10000:
                            i2 = 26700;
                            break;
                        case GamesActivityResultCodes.RESULT_RECONNECT_REQUIRED /* 10001 */:
                            i2 = 26701;
                            break;
                        case GamesActivityResultCodes.RESULT_SIGN_IN_FAILED /* 10002 */:
                            i2 = 26702;
                            break;
                        case GamesActivityResultCodes.RESULT_LICENSE_FAILED /* 10003 */:
                            i2 = GamesClientStatusCodes.CONSENT_REQUIRED;
                            break;
                        case GamesActivityResultCodes.RESULT_APP_MISCONFIGURED /* 10004 */:
                            i2 = 26704;
                            break;
                        default:
                            switch (statusCode) {
                                case 1000:
                                    i2 = 26530;
                                    break;
                                case 1001:
                                    i2 = 26531;
                                    break;
                                case 1002:
                                    i2 = 26532;
                                    break;
                                case 1003:
                                    i2 = 26533;
                                    break;
                                case 1004:
                                    i2 = 26534;
                                    break;
                                case 1005:
                                    i2 = 26535;
                                    break;
                                case 1006:
                                    i2 = 26536;
                                    break;
                                default:
                                    switch (statusCode) {
                                        case 2000:
                                            i2 = 26550;
                                            break;
                                        case 2001:
                                            i2 = 26551;
                                            break;
                                        case 2002:
                                            i2 = 26552;
                                            break;
                                        default:
                                            switch (statusCode) {
                                                case 3000:
                                                    i2 = GamesClientStatusCodes.ACHIEVEMENT_UNLOCK_FAILURE;
                                                    break;
                                                case 3001:
                                                    i2 = GamesClientStatusCodes.ACHIEVEMENT_UNKNOWN;
                                                    break;
                                                case 3002:
                                                    i2 = GamesClientStatusCodes.ACHIEVEMENT_NOT_INCREMENTAL;
                                                    break;
                                                case 3003:
                                                    i2 = GamesClientStatusCodes.ACHIEVEMENT_UNLOCKED;
                                                    break;
                                                default:
                                                    switch (statusCode) {
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND /* 4000 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_NOT_FOUND;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_CREATION_FAILED /* 4001 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_CREATION_FAILED;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE /* 4002 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_CONTENTS_UNAVAILABLE;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_COMMIT_FAILED /* 4003 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_COMMIT_FAILED;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_CONFLICT /* 4004 */:
                                                            i2 = 26574;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_FOLDER_UNAVAILABLE /* 4005 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_FOLDER_UNAVAILABLE;
                                                            break;
                                                        case GamesStatusCodes.STATUS_SNAPSHOT_CONFLICT_MISSING /* 4006 */:
                                                            i2 = GamesClientStatusCodes.SNAPSHOT_CONFLICT_MISSING;
                                                            break;
                                                        default:
                                                            switch (statusCode) {
                                                                case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED /* 6000 */:
                                                                    i2 = 26580;
                                                                    break;
                                                                case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER /* 6001 */:
                                                                    i2 = 26581;
                                                                    break;
                                                                case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE /* 6002 */:
                                                                    i2 = 26582;
                                                                    break;
                                                                case GamesStatusCodes.STATUS_MULTIPLAYER_DISABLED /* 6003 */:
                                                                    i2 = 26583;
                                                                    break;
                                                                case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION /* 6004 */:
                                                                    i2 = 26584;
                                                                    break;
                                                                default:
                                                                    switch (statusCode) {
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE /* 6500 */:
                                                                            i2 = 26590;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_INACTIVE_MATCH /* 6501 */:
                                                                            i2 = 26591;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_STATE /* 6502 */:
                                                                            i2 = 26592;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION /* 6503 */:
                                                                            i2 = 26593;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS /* 6504 */:
                                                                            i2 = 26594;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_ALREADY_REMATCHED /* 6505 */:
                                                                            i2 = 26595;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_NOT_FOUND /* 6506 */:
                                                                            i2 = 26596;
                                                                            break;
                                                                        case GamesStatusCodes.STATUS_MATCH_ERROR_LOCALLY_MODIFIED /* 6507 */:
                                                                            i2 = 26597;
                                                                            break;
                                                                        default:
                                                                            switch (statusCode) {
                                                                                case GamesStatusCodes.STATUS_REAL_TIME_CONNECTION_FAILED /* 7000 */:
                                                                                    i2 = 26600;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_REAL_TIME_MESSAGE_SEND_FAILED /* 7001 */:
                                                                                    i2 = 26601;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_INVALID_REAL_TIME_ROOM_ID /* 7002 */:
                                                                                    i2 = 26602;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_PARTICIPANT_NOT_CONNECTED /* 7003 */:
                                                                                    i2 = 26603;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_REAL_TIME_ROOM_NOT_JOINED /* 7004 */:
                                                                                    i2 = 26604;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_REAL_TIME_INACTIVE_ROOM /* 7005 */:
                                                                                    i2 = 26605;
                                                                                    break;
                                                                                case 7006:
                                                                                    i2 = 26606;
                                                                                    break;
                                                                                case GamesStatusCodes.STATUS_OPERATION_IN_FLIGHT /* 7007 */:
                                                                                    i2 = GamesClientStatusCodes.OPERATION_IN_FLIGHT;
                                                                                    break;
                                                                                default:
                                                                                    switch (statusCode) {
                                                                                        case 8000:
                                                                                            i2 = 26610;
                                                                                            break;
                                                                                        case 8001:
                                                                                            i2 = 26611;
                                                                                            break;
                                                                                        case 8002:
                                                                                            i2 = 26612;
                                                                                            break;
                                                                                        case 8003:
                                                                                            i2 = 26613;
                                                                                            break;
                                                                                        default:
                                                                                            i2 = statusCode;
                                                                                            break;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    i2 = 26541;
                }
            }
            i2 = GamesClientStatusCodes.LICENSE_CHECK_FAILED;
        } else {
            i2 = GamesClientStatusCodes.NETWORK_ERROR_OPERATION_FAILED;
        }
        if (i2 != zza2.getStatusCode()) {
            if (GamesStatusCodes.getStatusString(zza2.getStatusCode()).equals(zza2.getStatusMessage())) {
                zza2 = GamesClientStatusCodes.zza(i2, zza2.getResolution());
            } else {
                switch (statusCode) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                        break;
                    case 9:
                    default:
                        zza2 = new Status(i2, zza2.getStatusMessage(), zza2.getResolution());
                        break;
                }
            }
        }
        taskCompletionSource.setException(ApiExceptionUtil.fromStatus(zza2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(zzf.class.getClassLoader());
            boolean z = bundle.getBoolean("show_welcome_popup");
            this.zzdm = z;
            this.zzdo = z;
            this.zzdj = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.zzdk = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.onPostInitHandler(i, iBinder, bundle, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> ListenerHolder.Notifier<T> zza(zzar<T> zzarVar) {
        return new com.google.android.gms.games.internal.zzq(zzarVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        com.google.android.gms.games.internal.zzac zzacVar = (com.google.android.gms.games.internal.zzac) iInterface;
        super.onConnectedLocked(zzacVar);
        if (this.zzdm) {
            this.zzdl.zzbo();
            this.zzdm = false;
        }
        if (this.zzdp.zzaj || this.zzdp.zzaq) {
            return;
        }
        try {
            zzacVar.zza(new com.google.android.gms.games.internal.zzr(new zzfi(this.zzdl.zzbn())), this.zzdn);
        } catch (RemoteException e) {
            zza(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        if (queryLocalInterface instanceof com.google.android.gms.games.internal.zzac) {
            return (com.google.android.gms.games.internal.zzac) queryLocalInterface;
        }
        return new com.google.android.gms.games.internal.zzaf(iBinder);
    }
}

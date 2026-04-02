package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzck extends zzac implements PlayerStatsClient {
    public zzck(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzck(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.PlayerStatsClient
    public final Task<AnnotatedData<PlayerStats>> loadPlayerStats(final boolean z) {
        return zza(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzcn
            private final boolean zzex;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((com.google.android.gms.games.internal.zzf) obj).zze((TaskCompletionSource) obj2, this.zzex);
            }
        });
    }
}

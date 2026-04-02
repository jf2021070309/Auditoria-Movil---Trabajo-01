package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzbm implements SessionManagerListener {
    final /* synthetic */ zzbn zza;

    public /* synthetic */ zzbm(zzbn zzbnVar, zzbl zzblVar) {
        this.zza = zzbnVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnded(Session session, int i) {
        CastSession castSession = (CastSession) session;
        zzbn.zzc().d("onSessionEnded with error = %d", Integer.valueOf(i));
        zzbn.zzg(this.zza);
        zzbn zzbnVar = this.zza;
        if (zzbn.zza(zzbnVar) == 2) {
            return;
        }
        zzbn.zzh(zzbnVar);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionEnding(Session session) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(Session session, int i) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResumed(Session session, boolean z) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionResuming(Session session, String str) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(Session session, int i) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarted(Session session, String str) {
        CastSession castSession = (CastSession) session;
        zzbn.zzc().d("onSessionStarted with transferType = %d", Integer.valueOf(zzbn.zza(this.zza)));
        if (zzbn.zzb(this.zza).zzg()) {
            zzbn zzbnVar = this.zza;
            if (zzbn.zza(zzbnVar) == 2) {
                zzbn.zzi(zzbnVar);
            }
        }
        zzbn.zzh(this.zza);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionStarting(Session session) {
        CastSession castSession = (CastSession) session;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void onSessionSuspended(Session session, int i) {
        CastSession castSession = (CastSession) session;
    }
}

package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.cast.zzml;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class PrecacheManager {
    private final Logger zza = new Logger("PrecacheManager");
    private final CastOptions zzb;
    private final SessionManager zzc;
    private final com.google.android.gms.cast.internal.zzn zzd;

    public PrecacheManager(CastOptions castOptions, SessionManager sessionManager, com.google.android.gms.cast.internal.zzn zznVar) {
        this.zzb = castOptions;
        this.zzc = sessionManager;
        this.zzd = zznVar;
    }

    public void precache(final String str) {
        com.google.android.gms.internal.cast.zzo.zzd(zzml.PRECACHE);
        Session currentSession = this.zzc.getCurrentSession();
        if (str != null) {
            if (currentSession == null) {
                final com.google.android.gms.cast.internal.zzn zznVar = this.zzd;
                final String[] strArr = {this.zzb.getReceiverApplicationId()};
                zznVar.doWrite(TaskApiCall.builder().setMethodKey(8423).run(new RemoteCall(strArr, str, null) { // from class: com.google.android.gms.cast.internal.zzf
                    public final /* synthetic */ String[] zzb;
                    public final /* synthetic */ String zzc;

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((zzaj) ((zzo) obj).getService()).zze(new zzj(zzn.this, (TaskCompletionSource) obj2), this.zzb, this.zzc, null);
                    }
                }).build());
                return;
            } else if (currentSession instanceof CastSession) {
                RemoteMediaClient remoteMediaClient = ((CastSession) currentSession).getRemoteMediaClient();
                if (remoteMediaClient != null) {
                    remoteMediaClient.zzg(str, null);
                    return;
                } else {
                    this.zza.e("Failed to get RemoteMediaClient from current cast session.", new Object[0]);
                    return;
                }
            } else {
                this.zza.e("Current session is not a CastSession. Precache is not supported.", new Object[0]);
                return;
            }
        }
        throw new IllegalArgumentException("No precache data found to be precached");
    }
}

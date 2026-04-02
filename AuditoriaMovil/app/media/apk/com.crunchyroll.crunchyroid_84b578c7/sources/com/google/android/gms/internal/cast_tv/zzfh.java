package com.google.android.gms.internal.cast_tv;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzfh extends MediaControllerCompat.a {
    final /* synthetic */ zzfj zza;

    public /* synthetic */ zzfh(zzfj zzfjVar, zzfg zzfgVar) {
        this.zza = zzfjVar;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a, android.os.IBinder.DeathRecipient
    public final void binderDied() {
        zzfj.zzN(this.zza);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        zzfj zzfjVar = this.zza;
        zzfjVar.zzP(zzfjVar.zzj(), 0L);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        zzfj zzfjVar = this.zza;
        zzfjVar.zzP(zzfjVar.zzj(), 0L);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void onRepeatModeChanged(int i) {
        zzfj zzfjVar = this.zza;
        zzfjVar.zzP(zzfjVar.zzj(), 0L);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void onSessionDestroyed() {
        zzfj.zzN(this.zza);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.a
    public final void onShuffleModeChanged(int i) {
        zzfj zzfjVar = this.zza;
        zzfjVar.zzP(zzfjVar.zzj(), 0L);
    }
}

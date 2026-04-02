package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzgh {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    public /* synthetic */ zzgh(MediaCodec mediaCodec, Surface surface, zzgg zzggVar) {
        this.zza = mediaCodec;
        if (zzamq.zza < 21) {
            this.zzb = mediaCodec.getInputBuffers();
            this.zzc = mediaCodec.getOutputBuffers();
        }
    }

    public final int zza() {
        return this.zza.dequeueInputBuffer(0L);
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zzamq.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final MediaFormat zzc() {
        return this.zza.getOutputFormat();
    }

    public final ByteBuffer zzd(int i2) {
        return zzamq.zza >= 21 ? this.zza.getInputBuffer(i2) : ((ByteBuffer[]) zzamq.zzd(this.zzb))[i2];
    }

    public final ByteBuffer zze(int i2) {
        return zzamq.zza >= 21 ? this.zza.getOutputBuffer(i2) : ((ByteBuffer[]) zzamq.zzd(this.zzc))[i2];
    }

    public final void zzf(int i2, int i3, int i4, long j2, int i5) {
        this.zza.queueInputBuffer(i2, 0, i4, j2, i5);
    }

    public final void zzg(int i2, int i3, zzac zzacVar, long j2, int i4) {
        this.zza.queueSecureInputBuffer(i2, 0, zzacVar.zzb(), j2, 0);
    }

    public final void zzh(int i2, boolean z) {
        this.zza.releaseOutputBuffer(i2, z);
    }

    public final void zzi(int i2, long j2) {
        this.zza.releaseOutputBuffer(i2, j2);
    }

    public final void zzj() {
        this.zza.flush();
    }

    public final void zzk() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    public final void zzl(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzm(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzn(int i2) {
        this.zza.setVideoScalingMode(i2);
    }
}

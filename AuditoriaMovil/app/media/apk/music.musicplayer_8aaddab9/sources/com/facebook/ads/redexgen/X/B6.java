package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public interface B6 {
    void onAudioSessionId(B5 b5, int i2);

    void onAudioUnderrun(B5 b5, int i2, long j2, long j3);

    void onDecoderDisabled(B5 b5, int i2, C0512Bw c0512Bw);

    void onDecoderEnabled(B5 b5, int i2, C0512Bw c0512Bw);

    void onDecoderInitialized(B5 b5, int i2, String str, long j2);

    void onDecoderInputFormatChanged(B5 b5, int i2, Format format);

    void onDownstreamFormatChanged(B5 b5, C0589Fn c0589Fn);

    void onDrmKeysLoaded(B5 b5);

    void onDrmKeysRemoved(B5 b5);

    void onDrmKeysRestored(B5 b5);

    void onDrmSessionManagerError(B5 b5, Exception exc);

    void onDroppedVideoFrames(B5 b5, int i2, long j2);

    void onLoadError(B5 b5, C0588Fm c0588Fm, C0589Fn c0589Fn, IOException iOException, boolean z);

    void onLoadingChanged(B5 b5, boolean z);

    void onMediaPeriodCreated(B5 b5);

    void onMediaPeriodReleased(B5 b5);

    void onMetadata(B5 b5, Metadata metadata);

    void onPlaybackParametersChanged(B5 b5, C0472Ah c0472Ah);

    void onPlayerError(B5 b5, AM am);

    void onPlayerStateChanged(B5 b5, boolean z, int i2);

    void onPositionDiscontinuity(B5 b5, int i2);

    void onReadingStarted(B5 b5);

    void onRenderedFirstFrame(B5 b5, Surface surface);

    void onSeekProcessed(B5 b5);

    void onSeekStarted(B5 b5);

    void onTimelineChanged(B5 b5, int i2);

    void onTracksChanged(B5 b5, TrackGroupArray trackGroupArray, HR hr);

    void onVideoSizeChanged(B5 b5, int i2, int i3, int i4, float f2);
}

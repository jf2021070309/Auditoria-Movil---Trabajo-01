package com.google.android.gms.cast.framework.media.uicontroller;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.h;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzbt;
import com.google.android.gms.internal.cast.zzbu;
import com.google.android.gms.internal.cast.zzbv;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzbz;
import com.google.android.gms.internal.cast.zzca;
import com.google.android.gms.internal.cast.zzcb;
import com.google.android.gms.internal.cast.zzcc;
import com.google.android.gms.internal.cast.zzcd;
import com.google.android.gms.internal.cast.zzce;
import com.google.android.gms.internal.cast.zzcg;
import com.google.android.gms.internal.cast.zzch;
import com.google.android.gms.internal.cast.zzci;
import com.google.android.gms.internal.cast.zzcj;
import com.google.android.gms.internal.cast.zzcl;
import com.google.android.gms.internal.cast.zzcm;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzco;
import com.google.android.gms.internal.cast.zzcp;
import com.google.android.gms.internal.cast.zzcq;
import com.google.android.gms.internal.cast.zzcr;
import com.google.android.gms.internal.cast.zzcs;
import com.google.android.gms.internal.cast.zzct;
import com.google.android.gms.internal.cast.zzml;
import com.google.android.gms.internal.cast.zzo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class UIMediaController implements RemoteMediaClient.Listener, SessionManagerListener<CastSession> {
    private static final Logger zzb = new Logger("UIMediaController");
    private final Activity zzc;
    private final SessionManager zzd;
    private RemoteMediaClient.Listener zzg;
    private RemoteMediaClient zzh;
    private final Map zze = new HashMap();
    private final Set zzf = new HashSet();
    final zza zza = zza.zzf();

    public UIMediaController(Activity activity) {
        SessionManager sessionManager;
        this.zzc = activity;
        CastContext zza = CastContext.zza(activity);
        zzo.zzd(zzml.UI_MEDIA_CONTROLLER);
        if (zza != null) {
            sessionManager = zza.getSessionManager();
        } else {
            sessionManager = null;
        }
        this.zzd = sessionManager;
        if (sessionManager != null) {
            sessionManager.addSessionManagerListener(this, CastSession.class);
            zzh(sessionManager.getCurrentCastSession());
        }
    }

    private final void zzg() {
        if (!isActive()) {
            return;
        }
        this.zza.zza = null;
        for (List<UIController> list : this.zze.values()) {
            for (UIController uIController : list) {
                uIController.onSessionEnded();
            }
        }
        Preconditions.checkNotNull(this.zzh);
        this.zzh.removeListener(this);
        this.zzh = null;
    }

    private final void zzh(Session session) {
        if (!isActive() && session != null && session.isConnected()) {
            CastSession castSession = (CastSession) session;
            RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
            this.zzh = remoteMediaClient;
            if (remoteMediaClient != null) {
                remoteMediaClient.addListener(this);
                Preconditions.checkNotNull(this.zza);
                this.zza.zza = castSession.getRemoteMediaClient();
                for (List<UIController> list : this.zze.values()) {
                    for (UIController uIController : list) {
                        uIController.onSessionConnected(castSession);
                    }
                }
                zzm();
            }
        }
    }

    private final void zzi(int i, boolean z) {
        if (z) {
            for (zzcr zzcrVar : this.zzf) {
                zzcrVar.zzb(this.zza.zze() + i);
            }
        }
    }

    private final void zzj() {
        for (zzcr zzcrVar : this.zzf) {
            zzcrVar.zza(false);
        }
    }

    private final void zzk(int i) {
        boolean z;
        Iterator it = this.zzf.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            ((zzcr) it.next()).zza(true);
        }
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            long zze = this.zza.zze() + i;
            MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
            builder.setPosition(zze);
            if (!remoteMediaClient.isLiveStream() || !this.zza.zzn(zze)) {
                z = false;
            }
            builder.setIsSeekToInfinite(z);
            remoteMediaClient.seek(builder.build());
        }
    }

    private final void zzl(View view, UIController uIController) {
        if (this.zzd != null) {
            List list = (List) this.zze.get(view);
            if (list == null) {
                list = new ArrayList();
                this.zze.put(view, list);
            }
            list.add(uIController);
            if (isActive()) {
                uIController.onSessionConnected((CastSession) Preconditions.checkNotNull(this.zzd.getCurrentCastSession()));
                zzm();
            }
        }
    }

    private final void zzm() {
        for (List<UIController> list : this.zze.values()) {
            for (UIController uIController : list) {
                uIController.onMediaStatusUpdated();
            }
        }
    }

    @Deprecated
    public void bindImageViewToImageOfCurrentItem(ImageView imageView, int i, int i2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzca(imageView, this.zzc, new ImageHints(i, 0, 0), i2, null, null));
    }

    @Deprecated
    public void bindImageViewToImageOfPreloadedItem(ImageView imageView, int i, int i2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzbx(imageView, this.zzc, new ImageHints(i, 0, 0), i2));
    }

    public void bindImageViewToMuteToggle(ImageView imageView) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        imageView.setOnClickListener(new zzb(this));
        zzl(imageView, new zzcg(imageView, this.zzc));
    }

    public void bindImageViewToPlayPauseToggle(ImageView imageView, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzo.zzd(zzml.PAUSE_CONTROLLER);
        imageView.setOnClickListener(new zzc(this));
        zzl(imageView, new zzch(imageView, this.zzc, drawable, drawable2, drawable3, view, z));
    }

    public void bindProgressBar(ProgressBar progressBar) {
        bindProgressBar(progressBar, 1000L);
    }

    public void bindSeekBar(SeekBar seekBar) {
        bindSeekBar(seekBar, 1000L);
    }

    public void bindTextViewToMetadataOfCurrentItem(TextView textView, String str) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        bindTextViewToMetadataOfCurrentItem(textView, Collections.singletonList(str));
    }

    public void bindTextViewToMetadataOfPreloadedItem(TextView textView, String str) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        bindTextViewToMetadataOfPreloadedItem(textView, Collections.singletonList(str));
    }

    public void bindTextViewToSmartSubtitle(TextView textView) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(textView, new zzco(textView));
    }

    public void bindTextViewToStreamDuration(TextView textView) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(textView, new zzcp(textView, this.zzc.getString(R.string.cast_invalid_stream_duration_text), null));
    }

    public void bindTextViewToStreamPosition(TextView textView, boolean z) {
        bindTextViewToStreamPosition(textView, z, 1000L);
    }

    public void bindViewToClosedCaption(View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zzk(this));
        zzl(view, new zzbu(view, this.zzc));
    }

    public void bindViewToForward(View view, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zzf(this, j));
        zzl(view, new zzbv(view, this.zza));
    }

    public void bindViewToLaunchExpandedController(View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zzj(this));
        zzl(view, new zzcb(view));
    }

    public void bindViewToLoadingIndicator(View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(view, new zzcc(view));
    }

    public void bindViewToRewind(View view, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zzg(this, j));
        zzl(view, new zzcj(view, this.zza));
    }

    public void bindViewToSkipNext(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zzd(this));
        zzl(view, new zzcm(view, i));
    }

    public void bindViewToSkipPrev(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        view.setOnClickListener(new zze(this));
        zzl(view, new zzcn(view, i));
    }

    public void bindViewToUIController(View view, UIController uIController) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(view, uIController);
    }

    public void bindViewVisibilityToMediaSession(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(view, new zzct(view, i));
    }

    public void bindViewVisibilityToPreloadingEvent(View view, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(view, new zzcs(view, i));
    }

    public void dispose() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzg();
        this.zze.clear();
        SessionManager sessionManager = this.zzd;
        if (sessionManager != null) {
            sessionManager.removeSessionManagerListener(this, CastSession.class);
        }
        this.zzg = null;
    }

    public RemoteMediaClient getRemoteMediaClient() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzh;
    }

    public boolean isActive() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zzh != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onAdBreakStatusUpdated() {
        zzm();
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onAdBreakStatusUpdated();
        }
    }

    public void onClosedCaptionClicked(View view) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            Activity activity = this.zzc;
            if (activity instanceof h) {
                TracksChooserDialogFragment newInstance = TracksChooserDialogFragment.newInstance();
                h hVar = (h) activity;
                FragmentManager supportFragmentManager = hVar.getSupportFragmentManager();
                a a = b.a(supportFragmentManager, supportFragmentManager);
                Fragment C = hVar.getSupportFragmentManager().C("TRACKS_CHOOSER_DIALOG_TAG");
                if (C != null) {
                    a.m(C);
                }
                newInstance.show(a, "TRACKS_CHOOSER_DIALOG_TAG");
            }
        }
    }

    public void onForwardClicked(View view, long j) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            if (remoteMediaClient.zzw()) {
                long approximateStreamPosition = remoteMediaClient.getApproximateStreamPosition() + j;
                zza zzaVar = this.zza;
                remoteMediaClient.seek(Math.min(approximateStreamPosition, zzaVar.zze() + zzaVar.zzc()));
                return;
            }
            remoteMediaClient.seek(remoteMediaClient.getApproximateStreamPosition() + j);
        }
    }

    public void onLaunchExpandedControllerClicked(View view) {
        CastMediaOptions castMediaOptions = CastContext.getSharedInstance(this.zzc).getCastOptions().getCastMediaOptions();
        if (castMediaOptions != null && !TextUtils.isEmpty(castMediaOptions.getExpandedControllerActivityClassName())) {
            ComponentName componentName = new ComponentName(this.zzc.getApplicationContext(), castMediaOptions.getExpandedControllerActivityClassName());
            Intent intent = new Intent();
            intent.setComponent(componentName);
            this.zzc.startActivity(intent);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onMetadataUpdated() {
        zzm();
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onMetadataUpdated();
        }
    }

    public void onMuteToggleClicked(ImageView imageView) {
        CastSession currentCastSession = CastContext.getSharedInstance(this.zzc.getApplicationContext()).getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && currentCastSession.isConnected()) {
            try {
                currentCastSession.setMute(!currentCastSession.isMute());
            } catch (IOException | IllegalArgumentException e) {
                zzb.e("Unable to call CastSession.setMute(boolean).", e);
            }
        }
    }

    public void onPlayPauseToggleClicked(ImageView imageView) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            remoteMediaClient.togglePlayback();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onPreloadStatusUpdated() {
        zzm();
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onPreloadStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onQueueStatusUpdated() {
        zzm();
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onQueueStatusUpdated();
        }
    }

    public void onRewindClicked(View view, long j) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            if (remoteMediaClient.zzw()) {
                long approximateStreamPosition = remoteMediaClient.getApproximateStreamPosition() - j;
                zza zzaVar = this.zza;
                remoteMediaClient.seek(Math.max(approximateStreamPosition, zzaVar.zze() + zzaVar.zzd()));
                return;
            }
            remoteMediaClient.seek(remoteMediaClient.getApproximateStreamPosition() - j);
        }
    }

    public void onSeekBarProgressChanged(SeekBar seekBar, int i, boolean z) {
        zzi(i, z);
    }

    public void onSeekBarStartTrackingTouch(SeekBar seekBar) {
        if (this.zze.containsKey(seekBar)) {
            for (UIController uIController : (List) this.zze.get(seekBar)) {
                if (uIController instanceof zzcl) {
                    ((zzcl) uIController).zza(false);
                }
            }
        }
        zzj();
    }

    public void onSeekBarStopTrackingTouch(SeekBar seekBar) {
        if (this.zze.containsKey(seekBar)) {
            for (UIController uIController : (List) this.zze.get(seekBar)) {
                if (uIController instanceof zzcl) {
                    ((zzcl) uIController).zza(true);
                }
            }
        }
        zzk(seekBar.getProgress());
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onSendingRemoteMediaRequest() {
        for (List<UIController> list : this.zze.values()) {
            for (UIController uIController : list) {
                uIController.onSendingRemoteMediaRequest();
            }
        }
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onSendingRemoteMediaRequest();
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnded(CastSession castSession, int i) {
        zzg();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnding(CastSession castSession) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumeFailed(CastSession castSession, int i) {
        zzg();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumed(CastSession castSession, boolean z) {
        zzh(castSession);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResuming(CastSession castSession, String str) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStartFailed(CastSession castSession, int i) {
        zzg();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarted(CastSession castSession, String str) {
        zzh(castSession);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarting(CastSession castSession) {
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionSuspended(CastSession castSession, int i) {
    }

    public void onSkipNextClicked(View view) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            remoteMediaClient.queueNext(null);
        }
    }

    public void onSkipPrevClicked(View view) {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            remoteMediaClient.queuePrev(null);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public void onStatusUpdated() {
        zzm();
        RemoteMediaClient.Listener listener = this.zzg;
        if (listener != null) {
            listener.onStatusUpdated();
        }
    }

    public void setPostRemoteMediaClientListener(RemoteMediaClient.Listener listener) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzg = listener;
    }

    public final zza zza() {
        return this.zza;
    }

    public final void zzb(ImageView imageView, ImageHints imageHints, View view, zzbz zzbzVar) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzca(imageView, this.zzc, imageHints, 0, view, zzbzVar));
    }

    public final void zzc(CastSeekBar castSeekBar, int i, boolean z) {
        zzi(i, z);
    }

    public final void zzd(CastSeekBar castSeekBar) {
        zzj();
    }

    public final void zze(CastSeekBar castSeekBar) {
        zzk(castSeekBar.getProgress());
    }

    public final void zzf(zzcr zzcrVar) {
        this.zzf.add(zzcrVar);
    }

    public void bindProgressBar(ProgressBar progressBar, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(progressBar, new zzci(progressBar, j));
    }

    public void bindSeekBar(SeekBar seekBar, long j) {
        zzo.zzd(zzml.SEEK_CONTROLLER);
        Preconditions.checkMainThread("Must be called from the main thread.");
        seekBar.setOnSeekBarChangeListener(new zzi(this, seekBar));
        zzl(seekBar, new zzcl(seekBar, j, this.zza));
    }

    public void bindTextViewToStreamPosition(TextView textView, boolean z, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzcq zzcqVar = new zzcq(textView, j, this.zzc.getString(R.string.cast_invalid_stream_position_text));
        if (z) {
            this.zzf.add(zzcqVar);
        }
        zzl(textView, zzcqVar);
    }

    public void bindImageViewToImageOfPreloadedItem(ImageView imageView, ImageHints imageHints, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzbx(imageView, this.zzc, imageHints, i));
    }

    public void bindTextViewToMetadataOfCurrentItem(TextView textView, List<String> list) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(textView, new zzce(textView, list));
    }

    public void bindTextViewToMetadataOfPreloadedItem(TextView textView, List<String> list) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(textView, new zzcd(textView, list));
    }

    @Deprecated
    public void bindImageViewToImageOfCurrentItem(ImageView imageView, int i, View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzca(imageView, this.zzc, new ImageHints(i, 0, 0), 0, view, null));
    }

    public void bindTextViewToStreamDuration(TextView textView, View view) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(textView, new zzcp(textView, this.zzc.getString(R.string.cast_invalid_stream_duration_text), view));
    }

    public void bindSeekBar(CastSeekBar castSeekBar) {
        bindSeekBar(castSeekBar, 1000L);
    }

    public void bindSeekBar(CastSeekBar castSeekBar, long j) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzo.zzd(zzml.SEEK_CONTROLLER);
        castSeekBar.zzd = new zzh(this);
        zzl(castSeekBar, new zzbt(castSeekBar, j, this.zza));
    }

    public void bindImageViewToImageOfCurrentItem(ImageView imageView, ImageHints imageHints, int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        zzl(imageView, new zzca(imageView, this.zzc, imageHints, i, null, null));
    }

    public void bindImageViewToImageOfCurrentItem(ImageView imageView, ImageHints imageHints, View view) {
        zzb(imageView, imageHints, view, null);
    }
}

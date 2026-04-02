package com.google.ads.interactivemedia.pal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzfm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class NonceManager {
    static final zzagc zza = zzagc.zzc(3);
    static final zzagc zzb = zzagc.zzc(5);
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final ExecutorService zze;
    private final Task zzf;
    private final zzax zzg;
    private final zzav zzh;
    private final String zzi;
    private boolean zzj = false;
    private String zzk;

    public NonceManager(Context context, Handler handler, ExecutorService executorService, Task task, zzax zzaxVar, String str) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = task;
        this.zzg = zzaxVar;
        this.zzh = new zzav(handler, zzb);
        this.zzi = str;
    }

    public static /* bridge */ /* synthetic */ Activity zza(NonceManager nonceManager) {
        Context context = nonceManager.zzd;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public String getNonce() {
        return this.zzi;
    }

    public void sendAdClick() {
        Tasks.withTimeout(this.zzf.continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzan
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return NonceManager.this.zzc(task);
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzao
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                NonceManager.this.zzd(task);
                return null;
            }
        });
    }

    @Deprecated
    public void sendAdImpression() {
    }

    public void sendAdTouch(final MotionEvent motionEvent) {
        Tasks.withTimeout(this.zzf.continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzal
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                MotionEvent motionEvent2 = motionEvent;
                int i = NonceManager.zzc;
                ((zzfm) task.getResult()).zzd(motionEvent2);
                return null;
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzam
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                NonceManager.this.zze(task);
                return null;
            }
        });
    }

    public void sendPlaybackEnd() {
        this.zzh.zzd();
        if (!this.zzj) {
            return;
        }
        this.zzj = false;
        this.zzg.zza(8, this.zzk);
    }

    public void sendPlaybackStart() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        Task withTimeout = Tasks.withTimeout(this.zzf.continueWith(this.zze, new zzas(this)), zza.zzd(), TimeUnit.MILLISECONDS);
        withTimeout.continueWith(this.zze, new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzap
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                NonceManager.this.zzf(task);
                return null;
            }
        });
        withTimeout.continueWith(new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzaq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                NonceManager.this.zzg(task);
                return null;
            }
        });
    }

    public final /* synthetic */ String zzc(Task task) throws Exception {
        return ((zzfm) task.getResult()).zza(this.zzd, "");
    }

    public final /* synthetic */ Void zzd(Task task) throws Exception {
        String str;
        if (task.isSuccessful()) {
            str = (String) task.getResult();
        } else {
            str = null;
        }
        this.zzg.zza(4, str);
        return null;
    }

    public final /* synthetic */ Void zze(Task task) throws Exception {
        this.zzg.zza(5, null);
        return null;
    }

    public final /* synthetic */ Void zzf(Task task) throws Exception {
        String str;
        if (task.isSuccessful()) {
            str = (String) task.getResult();
        } else {
            str = null;
        }
        this.zzk = str;
        this.zzg.zza(6, str);
        return null;
    }

    public final /* synthetic */ Void zzg(Task task) throws Exception {
        if (this.zzj) {
            this.zzh.zzc(new zzar(this));
            return null;
        }
        return null;
    }
}

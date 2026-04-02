package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzaxc extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzawt zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzaxc() {
        zzawt zzawtVar = new zzawt();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzawtVar;
        this.zzc = new Object();
        this.zzf = zzbks.zzd.zze().intValue();
        this.zzg = zzbks.zza.zze().intValue();
        this.zzh = zzbks.zze.zze().intValue();
        this.zzi = zzbks.zzc.zze().intValue();
        this.zzj = ((Integer) zzbet.zzc().zzc(zzbjl.zzN)).intValue();
        this.zzk = ((Integer) zzbet.zzc().zzc(zzbjl.zzO)).intValue();
        this.zzl = ((Integer) zzbet.zzc().zzc(zzbjl.zzP)).intValue();
        this.zze = zzbks.zzf.zze().intValue();
        this.zzm = (String) zzbet.zzc().zzc(zzbjl.zzR);
        this.zzn = ((Boolean) zzbet.zzc().zzc(zzbjl.zzS)).booleanValue();
        this.zzo = ((Boolean) zzbet.zzc().zzc(zzbjl.zzT)).booleanValue();
        this.zzp = ((Boolean) zzbet.zzc().zzc(zzbjl.zzU)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r3.importance != 100) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r2.inKeyguardRestrictedInputMode() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r0.isScreenOn() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        r0 = com.google.android.gms.ads.internal.zzt.zzf().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        com.google.android.gms.ads.internal.util.zze.zzd("ContentFetchThread: no activity. Sleeping.");
        zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r0.getWindow() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r0.getWindow().getDecorView() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r1 = r0.getWindow().getDecorView().findViewById(16908290);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        com.google.android.gms.ads.internal.zzt.zzg().zzk(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.ads.internal.util.zze.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        com.google.android.gms.ads.internal.util.zze.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzg().zzk(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        com.google.android.gms.ads.internal.util.zze.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:65:0x00dc->B:70:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.zzawx r0 = com.google.android.gms.ads.internal.zzt.zzf()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.zze()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzawx r0 = com.google.android.gms.ads.internal.zzt.zzf()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            android.app.Activity r0 = r0.zzd()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.ads.internal.util.zze.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcge r2 = com.google.android.gms.ads.internal.zzt.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzk(r0, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.ads.internal.util.zze.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        L9d:
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.zzawy r0 = new com.google.android.gms.internal.ads.zzawy     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r1.post(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcge r1 = com.google.android.gms.ads.internal.zzt.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzk(r0, r2)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.ads.internal.util.zze.zzd(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zzg()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lba:
            int r0 = r6.zze     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Ld9
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.zze.zzg(r1, r0)
            com.google.android.gms.internal.ads.zzcge r1 = com.google.android.gms.ads.internal.zzt.zzg()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.zzk(r0, r2)
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.zze.zzg(r1, r0)
        Ld9:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        Ldc:
            boolean r1 = r6.zzb     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Leb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.ads.internal.util.zze.zzd(r1)     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            java.lang.Object r1 = r6.zzc     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            r1.wait()     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            goto Ldc
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            goto L0
        Lee:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxc.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.zze.zzd("Content hash thread already started, quiting...");
                return;
            }
            this.zza = true;
            start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(View view) {
        try {
            zzaws zzawsVar = new zzaws(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zze = com.google.android.gms.ads.internal.zzt.zzf().zze();
            if (zze != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(zze.getResources().getIdentifier((String) zzbet.zzc().zzc(zzbjl.zzQ), "id", zze.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzaxb zzc = zzc(view, zzawsVar);
            zzawsVar.zzk();
            if (zzc.zza == 0 && zzc.zzb == 0) {
                return;
            }
            if (zzc.zzb == 0 && zzawsVar.zzo() == 0) {
                return;
            }
            if (zzc.zzb == 0 && this.zzd.zzb(zzawsVar)) {
                return;
            }
            this.zzd.zzd(zzawsVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "ContentFetchTask.fetchContent");
        }
    }

    final zzaxb zzc(View view, zzaws zzawsVar) {
        if (view == null) {
            return new zzaxb(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if (!(view instanceof TextView) || (view instanceof EditText)) {
            if (!(view instanceof WebView) || (view instanceof zzcml)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        zzaxb zzc = zzc(viewGroup.getChildAt(i3), zzawsVar);
                        i += zzc.zza;
                        i2 += zzc.zzb;
                    }
                    return new zzaxb(this, i, i2);
                }
                return new zzaxb(this, 0, 0);
            }
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                return new zzaxb(this, 0, 0);
            }
            zzawsVar.zzg();
            webView.post(new zzaxa(this, zzawsVar, webView, globalVisibleRect));
            return new zzaxb(this, 0, 1);
        }
        CharSequence text = ((TextView) view).getText();
        if (!TextUtils.isEmpty(text)) {
            zzawsVar.zzi(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzaxb(this, 1, 0);
        }
        return new zzaxb(this, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzaws zzawsVar, WebView webView, String str, boolean z) {
        zzawsVar.zzf();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzawsVar.zzh(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzawsVar.zzh(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzawsVar.zza()) {
                this.zzd.zzc(zzawsVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzaws zze() {
        return this.zzd.zza(this.zzp);
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            com.google.android.gms.ads.internal.util.zze.zzd("ContentFetchThread: wakeup");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzcms extends WebViewClient implements zzcnz {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet<String> zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzcdy zza;
    private final zzcml zzc;
    private final zzazb zzd;
    private final HashMap<String, List<zzbpr<? super zzcml>>> zze;
    private final Object zzf;
    private zzbcv zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcnx zzi;
    private zzcny zzj;
    private zzbor zzk;
    private zzbot zzl;
    private zzdio zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzv zzs;
    private zzbyo zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbyj zzv;
    private zzffu zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcms(zzcml zzcmlVar, zzazb zzazbVar, boolean z) {
        zzbyo zzbyoVar = new zzbyo(zzcmlVar, zzcmlVar.zzM(), new zzbiv(zzcmlVar.getContext()));
        this.zze = new HashMap<>();
        this.zzf = new Object();
        this.zzd = zzazbVar;
        this.zzc = zzcmlVar;
        this.zzp = z;
        this.zzt = zzbyoVar;
        this.zzv = null;
        this.zzB = new HashSet<>(Arrays.asList(((String) zzbet.zzc().zzc(zzbjl.zzdU)).split(",")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzM(final View view, final zzcdy zzcdyVar, final int i) {
        if (!zzcdyVar.zzd() || i <= 0) {
            return;
        }
        zzcdyVar.zze(view);
        if (zzcdyVar.zzd()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable(this, view, zzcdyVar, i) { // from class: com.google.android.gms.internal.ads.zzcmm
                private final zzcms zza;
                private final View zzb;
                private final zzcdy zzc;
                private final int zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = view;
                    this.zzc = zzcdyVar;
                    this.zzd = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzK(this.zzb, this.zzc, this.zzd);
                }
            }, 100L);
        }
    }

    private final void zzN() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzO() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzav)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzP(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzt.zzc().zzf(this.zzc.getContext(), this.zzc.zzt().zza, false, httpURLConnection, false, 60000);
                zzcgs zzcgsVar = new zzcgs(null);
                zzcgsVar.zza(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcgsVar.zzc(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Protocol is null");
                    return zzO();
                } else if (!protocol.equals("http") && !protocol.equals("https")) {
                    com.google.android.gms.ads.internal.util.zze.zzi(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                    return zzO();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zzd(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            return com.google.android.gms.ads.internal.util.zzs.zzS(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(Map<String, String> map, List<zzbpr<? super zzcml>> list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        for (zzbpr<? super zzcml> zzbprVar : list) {
            zzbprVar.zza(this.zzc, map);
        }
    }

    private static final boolean zzR(boolean z, zzcml zzcmlVar) {
        return (!z || zzcmlVar.zzP().zzg() || zzcmlVar.zzQ().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        zzbcv zzbcvVar = this.zzg;
        if (zzbcvVar != null) {
            zzbcvVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzF(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzY();
                return;
            }
            this.zzx = true;
            zzcny zzcnyVar = this.zzj;
            if (zzcnyVar != null) {
                zzcnyVar.zzb();
                this.zzj = null;
            }
            zzn();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaz(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzA(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzbcv zzbcvVar = this.zzg;
                    if (zzbcvVar != null) {
                        zzbcvVar.onAdClicked();
                        zzcdy zzcdyVar = this.zza;
                        if (zzcdyVar != null) {
                            zzcdyVar.zzc(str);
                        }
                        this.zzg = null;
                    }
                    zzdio zzdioVar = this.zzm;
                    if (zzdioVar != null) {
                        zzdioVar.zzb();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzaas zzU = this.zzc.zzU();
                    if (zzU != null && zzU.zza(parse)) {
                        Context context = this.zzc.getContext();
                        zzcml zzcmlVar = this.zzc;
                        parse = zzU.zze(parse, context, (View) zzcmlVar, zzcmlVar.zzj());
                    }
                } catch (zzaat unused) {
                    String valueOf2 = String.valueOf(str);
                    com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzb()) {
                    zzo(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzu.zzc(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            zzF(parse);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzA(String str, Map<String, String> map) {
        zzayk zzf;
        try {
            if (!zzbkz.zza.zze().booleanValue() || this.zzw == null || !"oda".equals(Uri.parse(str).getScheme())) {
                String zza = zzcfc.zza(str, this.zzc.getContext(), this.zzA);
                if (zza.equals(str)) {
                    zzayn zza2 = zzayn.zza(Uri.parse(str));
                    if (zza2 == null || (zzf = com.google.android.gms.ads.internal.zzt.zzi().zzf(zza2)) == null || !zzf.zza()) {
                        if (zzcgs.zzj() && zzbkv.zzb.zze().booleanValue()) {
                            return zzP(str, map);
                        }
                        return null;
                    }
                    return new WebResourceResponse("", "", zzf.zzb());
                }
                return zzP(zza, map);
            }
            this.zzw.zzb(str);
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "AdWebViewClient.interceptRequest");
            return zzO();
        }
    }

    public final void zzB(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzC() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzchg.zze.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcmn
                private final zzcms zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ();
                }
            });
        }
    }

    public final void zzD(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzE(int i, int i2) {
        zzbyj zzbyjVar = this.zzv;
        if (zzbyjVar != null) {
            zzbyjVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzF(Uri uri) {
        String path = uri.getPath();
        List<zzbpr<? super zzcml>> list = this.zze.get(path);
        if (path == null || list == null) {
            String valueOf = String.valueOf(uri);
            String.valueOf(valueOf).length();
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(valueOf)));
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfa)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzg().zze() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzchg.zza.execute(new Runnable(substring) { // from class: com.google.android.gms.internal.ads.zzcmo
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = substring;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str = this.zza;
                    int i = zzcms.zzb;
                    com.google.android.gms.ads.internal.zzt.zzg().zze().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdT)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbet.zzc().zzc(zzbjl.zzdV)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                zzfsd.zzp(com.google.android.gms.ads.internal.zzt.zzc().zzm(uri), new zzcmq(this, list, path, uri), zzchg.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzQ(com.google.android.gms.ads.internal.util.zzs.zzR(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzH(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzI(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ() {
        this.zzc.zzah();
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(View view, zzcdy zzcdyVar, int i) {
        zzM(view, zzcdyVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzL(zzbcv zzbcvVar, zzbor zzborVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbot zzbotVar, com.google.android.gms.ads.internal.overlay.zzv zzvVar, boolean z, zzbpu zzbpuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyq zzbyqVar, zzcdy zzcdyVar, zzedq zzedqVar, zzffu zzffuVar, zzdvi zzdviVar, zzffc zzffcVar, zzbps zzbpsVar, zzdio zzdioVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzcdyVar, null) : zzbVar;
        this.zzv = new zzbyj(this.zzc, zzbyqVar);
        this.zza = zzcdyVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaC)).booleanValue()) {
            zzu("/adMetadata", new zzboq(zzborVar));
        }
        if (zzbotVar != null) {
            zzu("/appEvent", new zzbos(zzbotVar));
        }
        zzu("/backButton", zzbpq.zzj);
        zzu("/refresh", zzbpq.zzk);
        zzu("/canOpenApp", zzbpq.zzb);
        zzu("/canOpenURLs", zzbpq.zza);
        zzu("/canOpenIntents", zzbpq.zzc);
        zzu("/close", zzbpq.zzd);
        zzu("/customClose", zzbpq.zze);
        zzu("/instrument", zzbpq.zzn);
        zzu("/delayPageLoaded", zzbpq.zzp);
        zzu("/delayPageClosed", zzbpq.zzq);
        zzu("/getLocationInfo", zzbpq.zzr);
        zzu("/log", zzbpq.zzg);
        zzu("/mraid", new zzbpy(zzbVar2, this.zzv, zzbyqVar));
        zzbyo zzbyoVar = this.zzt;
        if (zzbyoVar != null) {
            zzu("/mraidLoaded", zzbyoVar);
        }
        zzu("/open", new zzbqc(zzbVar2, this.zzv, zzedqVar, zzdviVar, zzffcVar));
        zzu("/precache", new zzclb());
        zzu("/touch", zzbpq.zzi);
        zzu("/video", zzbpq.zzl);
        zzu("/videoMeta", zzbpq.zzm);
        if (zzedqVar == null || zzffuVar == null) {
            zzu("/click", zzbpq.zzb(zzdioVar));
            zzu("/httpTrack", zzbpq.zzf);
        } else {
            zzu("/click", zzfba.zza(zzedqVar, zzffuVar, zzdioVar));
            zzu("/httpTrack", zzfba.zzb(zzedqVar, zzffuVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzA().zzb(this.zzc.getContext())) {
            zzu("/logScionEvent", new zzbpx(this.zzc.getContext()));
        }
        if (zzbpuVar != null) {
            zzu("/setInterstitialProperties", new zzbpt(zzbpuVar, null));
        }
        if (zzbpsVar != null) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
                zzu("/inspectorNetworkExtras", zzbpsVar);
            }
        }
        this.zzg = zzbcvVar;
        this.zzh = zzoVar;
        this.zzk = zzborVar;
        this.zzl = zzbotVar;
        this.zzs = zzvVar;
        this.zzu = zzbVar2;
        this.zzm = zzdioVar;
        this.zzn = z;
        this.zzw = zzffuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zza(int i, int i2, boolean z) {
        zzbyo zzbyoVar = this.zzt;
        if (zzbyoVar != null) {
            zzbyoVar.zzb(i, i2);
        }
        zzbyj zzbyjVar = this.zzv;
        if (zzbyjVar != null) {
            zzbyjVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final void zzb() {
        zzdio zzdioVar = this.zzm;
        if (zzdioVar != null) {
            zzdioVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final com.google.android.gms.ads.internal.zzb zzc() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final boolean zzd() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzg() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzh() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzj() {
        zzcdy zzcdyVar = this.zza;
        if (zzcdyVar != null) {
            WebView zzG = this.zzc.zzG();
            if (!ViewCompat.isAttachedToWindow(zzG)) {
                zzN();
                zzcmp zzcmpVar = new zzcmp(this, zzcdyVar);
                this.zzC = zzcmpVar;
                ((View) this.zzc).addOnAttachStateChangeListener(zzcmpVar);
                return;
            }
            zzM(zzG, zzcdyVar, 10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzl() {
        this.zzz--;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzm() {
        zzazb zzazbVar = this.zzd;
        if (zzazbVar != null) {
            zzazbVar.zzc(10005);
        }
        this.zzy = true;
        zzn();
        this.zzc.destroy();
    }

    public final void zzn() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue() && this.zzc.zzq() != null) {
                zzbjs.zza(this.zzc.zzq().zzc(), this.zzc.zzi(), "awfllc");
            }
            zzcnx zzcnxVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcnxVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzao();
    }

    public final void zzo(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zzW = this.zzc.zzW();
        boolean zzR = zzR(zzW, this.zzc);
        boolean z2 = true;
        if (!zzR && z) {
            z2 = false;
        }
        zzt(new AdOverlayInfoParcel(zzcVar, zzR ? null : this.zzg, zzW ? null : this.zzh, this.zzs, this.zzc.zzt(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzp(com.google.android.gms.ads.internal.util.zzbu zzbuVar, zzedq zzedqVar, zzdvi zzdviVar, zzffc zzffcVar, String str, String str2, int i) {
        zzcml zzcmlVar = this.zzc;
        zzt(new AdOverlayInfoParcel(zzcmlVar, zzcmlVar.zzt(), zzbuVar, zzedqVar, zzdviVar, zzffcVar, str, str2, i));
    }

    public final void zzq(boolean z, int i, boolean z2) {
        boolean zzR = zzR(this.zzc.zzW(), this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        zzbcv zzbcvVar = zzR ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcml zzcmlVar = this.zzc;
        zzt(new AdOverlayInfoParcel(zzbcvVar, zzoVar, zzvVar, zzcmlVar, z, i, zzcmlVar.zzt(), z3 ? null : this.zzm));
    }

    public final void zzr(boolean z, int i, String str, boolean z2) {
        boolean zzW = this.zzc.zzW();
        boolean zzR = zzR(zzW, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        zzbcv zzbcvVar = zzR ? null : this.zzg;
        zzcmr zzcmrVar = zzW ? null : new zzcmr(this.zzc, this.zzh);
        zzbor zzborVar = this.zzk;
        zzbot zzbotVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcml zzcmlVar = this.zzc;
        zzt(new AdOverlayInfoParcel(zzbcvVar, zzcmrVar, zzborVar, zzbotVar, zzvVar, zzcmlVar, z, i, str, zzcmlVar.zzt(), z3 ? null : this.zzm));
    }

    public final void zzs(boolean z, int i, String str, String str2, boolean z2) {
        boolean zzW = this.zzc.zzW();
        boolean zzR = zzR(zzW, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        zzbcv zzbcvVar = zzR ? null : this.zzg;
        zzcmr zzcmrVar = zzW ? null : new zzcmr(this.zzc, this.zzh);
        zzbor zzborVar = this.zzk;
        zzbot zzbotVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzv zzvVar = this.zzs;
        zzcml zzcmlVar = this.zzc;
        zzt(new AdOverlayInfoParcel(zzbcvVar, zzcmrVar, zzborVar, zzbotVar, zzvVar, zzcmlVar, z, i, str, str2, zzcmlVar.zzt(), z3 ? null : this.zzm));
    }

    public final void zzt(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbyj zzbyjVar = this.zzv;
        boolean zzd = zzbyjVar != null ? zzbyjVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzd);
        zzcdy zzcdyVar = this.zza;
        if (zzcdyVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcdyVar.zzc(str);
        }
    }

    public final void zzu(String str, zzbpr<? super zzcml> zzbprVar) {
        synchronized (this.zzf) {
            List<zzbpr<? super zzcml>> list = this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zze.put(str, list);
            }
            list.add(zzbprVar);
        }
    }

    public final void zzv(String str, zzbpr<? super zzcml> zzbprVar) {
        synchronized (this.zzf) {
            List<zzbpr<? super zzcml>> list = this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbprVar);
        }
    }

    public final void zzw(String str, Predicate<zzbpr<? super zzcml>> predicate) {
        synchronized (this.zzf) {
            List<zzbpr<? super zzcml>> list = this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbpr<? super zzcml> zzbprVar : list) {
                if (predicate.apply(zzbprVar)) {
                    arrayList.add(zzbprVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzx() {
        zzcdy zzcdyVar = this.zza;
        if (zzcdyVar != null) {
            zzcdyVar.zzg();
            this.zza = null;
        }
        zzN();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbyj zzbyjVar = this.zzv;
            if (zzbyjVar != null) {
                zzbyjVar.zzb(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzy(zzcnx zzcnxVar) {
        this.zzi = zzcnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnz
    public final void zzz(zzcny zzcnyVar) {
        this.zzj = zzcnyVar;
    }
}

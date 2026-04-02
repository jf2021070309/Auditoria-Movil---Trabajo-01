package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzccf;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzchg;
import e.a.d.a.a;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzs extends zzbfm {
    private final zzcgz zza;
    private final zzbdl zzb;
    private final Future<zzaas> zzc = zzchg.zza.zzb(new zzo(this));
    private final Context zzd;
    private final zzr zze;
    private WebView zzf;
    private zzbfa zzg;
    private zzaas zzh;
    private AsyncTask<Void, Void, String> zzi;

    public zzs(Context context, zzbdl zzbdlVar, String str, zzcgz zzcgzVar) {
        this.zzd = context;
        this.zza = zzcgzVar;
        this.zzb = zzbdlVar;
        this.zzf = new WebView(context);
        this.zze = new zzr(context, str);
        zzS(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    public static /* synthetic */ String zzV(zzs zzsVar, String str) {
        if (zzsVar.zzh == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzsVar.zzh.zze(parse, zzsVar.zzd, null, null);
        } catch (zzaat e2) {
            zzcgt.zzj("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    public static /* synthetic */ void zzW(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbgz zzA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzB() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfu zzC() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbfa zzD() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzE(zzbkg zzbkgVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzF(zzbex zzbexVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzG(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzH() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzI(zzccf zzccfVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzJ(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzK(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbhc zzL() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzM(zzbis zzbisVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzN(zzbhg zzbhgVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzO(zzbdr zzbdrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzP(zzaxz zzaxzVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzQ(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    public final int zzR(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzber.zza();
            return zzcgm.zzs(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @VisibleForTesting
    public final void zzS(int i2) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
    }

    @VisibleForTesting
    public final String zzT() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzbkp.zzd.zze());
        builder.appendQueryParameter("query", this.zze.zzb());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zzd());
        Map<String, String> zze = this.zze.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, zze.get(str));
        }
        Uri build = builder.build();
        zzaas zzaasVar = this.zzh;
        if (zzaasVar != null) {
            try {
                build = zzaasVar.zzc(build, this.zzd);
            } catch (zzaat e2) {
                zzcgt.zzj("Unable to process ad data", e2);
            }
        }
        String zzU = zzU();
        String encodedQuery = build.getEncodedQuery();
        return a.s(new StringBuilder(zzU.length() + 1 + String.valueOf(encodedQuery).length()), zzU, "#", encodedQuery);
    }

    @VisibleForTesting
    public final String zzU() {
        String zza = this.zze.zza();
        if (true == TextUtils.isEmpty(zza)) {
            zza = "www.google.com";
        }
        String zze = zzbkp.zzd.zze();
        return a.s(new StringBuilder(String.valueOf(zza).length() + 8 + String.valueOf(zze).length()), "https://", zza, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzX(zzbgw zzbgwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzY(zzbdg zzbdgVar, zzbfd zzbfdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzZ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzaa(zzbgb zzbgbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzab(zzbfy zzbfyVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final IObjectWrapper zzi() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzj() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzk() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final boolean zzl(zzbdg zzbdgVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzbdgVar, this.zza);
        this.zzi = new zzp(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzm() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzn() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzo(zzbfa zzbfaVar) throws RemoteException {
        this.zzg = zzbfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzp(zzbfu zzbfuVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzq(zzbfr zzbfrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final Bundle zzr() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzs() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzt() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final zzbdl zzu() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzv(zzbdl zzbdlVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzw(zzbzz zzbzzVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzx(zzcac zzcacVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzy() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final String zzz() throws RemoteException {
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzcva extends zzcxg {
    private final zzcml zzc;
    private final int zzd;
    private final Context zze;
    private final zzcui zzf;
    private final zzdkn zzg;
    private final zzdbp zzh;
    private boolean zzi;

    public zzcva(zzcxf zzcxfVar, Context context, zzcml zzcmlVar, int i2, zzcui zzcuiVar, zzdkn zzdknVar, zzdbp zzdbpVar) {
        super(zzcxfVar);
        this.zzi = false;
        this.zzc = zzcmlVar;
        this.zze = context;
        this.zzd = i2;
        this.zzf = zzcuiVar;
        this.zzg = zzdknVar;
        this.zzh = zzdbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzT() {
        super.zzT();
        zzcml zzcmlVar = this.zzc;
        if (zzcmlVar != null) {
            zzcmlVar.destroy();
        }
    }

    public final void zza(zzaxq zzaxqVar) {
        zzcml zzcmlVar = this.zzc;
        if (zzcmlVar != null) {
            zzcmlVar.zzax(zzaxqVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.app.Activity r4, com.google.android.gms.internal.ads.zzayd r5, boolean r6) throws android.os.RemoteException {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            android.content.Context r4 = r3.zze
        L4:
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbjl.zzar
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r0 = r1.zzc(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            com.google.android.gms.ads.internal.zzt.zzc()
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzJ(r4)
            if (r0 == 0) goto L58
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzcgt.zzi(r5)
            com.google.android.gms.internal.ads.zzdbp r5 = r3.zzh
            r5.zzd()
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzbjl.zzas
            com.google.android.gms.internal.ads.zzbjj r6 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r5 = r6.zzc(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lae
            com.google.android.gms.internal.ads.zzfit r5 = new com.google.android.gms.internal.ads.zzfit
            android.content.Context r4 = r4.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzby r6 = com.google.android.gms.ads.internal.zzt.zzq()
            android.os.Looper r6 = r6.zza()
            r5.<init>(r4, r6)
            com.google.android.gms.internal.ads.zzfal r4 = r3.zza
            com.google.android.gms.internal.ads.zzfak r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfac r4 = r4.zzb
            java.lang.String r4 = r4.zzb
            r5.zza(r4)
            return
        L58:
            boolean r0 = r3.zzi
            if (r0 == 0) goto L7f
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzcgt.zzi(r0)
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbjl.zzgX
            com.google.android.gms.internal.ads.zzbjj r1 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r0 = r1.zzc(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            com.google.android.gms.internal.ads.zzdbp r0 = r3.zzh
            r1 = 10
            r2 = 0
            com.google.android.gms.internal.ads.zzbcz r1 = com.google.android.gms.internal.ads.zzfbm.zzd(r1, r2, r2)
            r0.zza(r1)
        L7f:
            boolean r0 = r3.zzi
            if (r0 != 0) goto Lae
            com.google.android.gms.internal.ads.zzdkn r0 = r3.zzg     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            com.google.android.gms.internal.ads.zzdbp r1 = r3.zzh     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            r0.zza(r6, r4, r1)     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            r4 = 1
            r3.zzi = r4
            return
        L8e:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzbjl.zzgX
            com.google.android.gms.internal.ads.zzbjj r0 = com.google.android.gms.internal.ads.zzbet.zzc()
            java.lang.Object r6 = r0.zzc(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La7
            com.google.android.gms.internal.ads.zzdbp r5 = r3.zzh
            r5.zzb(r4)
            return
        La7:
            com.google.android.gms.internal.ads.zzbcz r4 = com.google.android.gms.internal.ads.zzfbm.zza(r4)
            r5.zze(r4)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcva.zzb(android.app.Activity, com.google.android.gms.internal.ads.zzayd, boolean):void");
    }

    public final int zzc() {
        return this.zzd;
    }

    public final void zze(long j2, int i2) {
        this.zzf.zza(j2, i2);
    }
}

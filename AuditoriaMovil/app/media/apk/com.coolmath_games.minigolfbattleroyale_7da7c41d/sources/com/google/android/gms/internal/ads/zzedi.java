package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzedi {
    private final zzazb zza;
    private final Context zzb;
    private final zzecq zzc;
    private final zzcgz zzd;
    private final String zze;
    private final zzffc zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzg().zzp();

    public zzedi(Context context, zzcgz zzcgzVar, zzazb zzazbVar, zzecq zzecqVar, String str, zzffc zzffcVar) {
        this.zzb = context;
        this.zzd = zzcgzVar;
        this.zza = zzazbVar;
        this.zzc = zzecqVar;
        this.zze = str;
        this.zzf = zzffcVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList<zzbbi> arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbbi zzbbiVar = arrayList.get(i);
            if (zzbbiVar.zzs() == 2 && zzbbiVar.zza() > j) {
                j = zzbbiVar.zza();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfdw(this, z) { // from class: com.google.android.gms.internal.ads.zzede
                private final zzedi zza;
                private final boolean zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = z;
                }

                @Override // com.google.android.gms.internal.ads.zzfdw
                public final Object zza(Object obj) {
                    this.zza.zzb(this.zzb, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zze.zzf(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (!z) {
            if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
                ArrayList<zzbbi> zza = zzedd.zza(sQLiteDatabase);
                zzbbj zza2 = zzbbn.zza();
                zza2.zze(this.zzb.getPackageName());
                zza2.zzf(Build.MODEL);
                zza2.zzb(zzedd.zzb(sQLiteDatabase, 0));
                zza2.zza(zza);
                zza2.zzc(zzedd.zzb(sQLiteDatabase, 1));
                zza2.zzd(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis());
                zza2.zzg(zzedd.zzc(sQLiteDatabase, 2));
                final zzbbn zzah = zza2.zzah();
                zzc(sQLiteDatabase, zza);
                this.zza.zzb(new zzaza(zzah) { // from class: com.google.android.gms.internal.ads.zzedf
                    private final zzbbn zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzah;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaza
                    public final void zza(zzbao zzbaoVar) {
                        zzbaoVar.zzi(this.zza);
                    }
                });
                zzbby zza3 = zzbbz.zza();
                zza3.zza(this.zzd.zzb);
                zza3.zzb(this.zzd.zzc);
                zza3.zzc(true == this.zzd.zzd ? 0 : 2);
                final zzbbz zzah2 = zza3.zzah();
                this.zza.zzb(new zzaza(zzah2) { // from class: com.google.android.gms.internal.ads.zzedg
                    private final zzbbz zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzah2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaza
                    public final void zza(zzbao zzbaoVar) {
                        zzbbz zzbbzVar = this.zza;
                        zzbag zzau = zzbaoVar.zze().zzau();
                        zzau.zzb(zzbbzVar);
                        zzbaoVar.zzf(zzau);
                    }
                });
                this.zza.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
            } else {
                zzffb zza4 = zzffb.zza("oa_upload");
                zza4.zzc("oa_failed_reqs", String.valueOf(zzedd.zzb(sQLiteDatabase, 0)));
                zza4.zzc("oa_total_reqs", String.valueOf(zzedd.zzb(sQLiteDatabase, 1)));
                zza4.zzc("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
                zza4.zzc("oa_last_successful_time", String.valueOf(zzedd.zzc(sQLiteDatabase, 2)));
                zza4.zzc("oa_session_id", this.zzg.zzC() ? "" : this.zze);
                this.zzf.zza(zza4);
                ArrayList<zzbbi> zza5 = zzedd.zza(sQLiteDatabase);
                zzc(sQLiteDatabase, zza5);
                int size = zza5.size();
                for (int i = 0; i < size; i++) {
                    zzbbi zzbbiVar = zza5.get(i);
                    zzffb zza6 = zzffb.zza("oa_signals");
                    zza6.zzc("oa_session_id", this.zzg.zzC() ? "" : this.zze);
                    zzbbd zzf = zzbbiVar.zzf();
                    String valueOf = zzf.zza() ? String.valueOf(zzf.zzg() - 1) : "-1";
                    String obj = zzfpb.zzb(zzbbiVar.zze(), zzedh.zza).toString();
                    zza6.zzc("oa_sig_ts", String.valueOf(zzbbiVar.zza()));
                    zza6.zzc("oa_sig_status", String.valueOf(zzbbiVar.zzs() - 1));
                    zza6.zzc("oa_sig_resp_lat", String.valueOf(zzbbiVar.zzc()));
                    zza6.zzc("oa_sig_render_lat", String.valueOf(zzbbiVar.zzd()));
                    zza6.zzc("oa_sig_formats", obj);
                    zza6.zzc("oa_sig_nw_type", valueOf);
                    zza6.zzc("oa_sig_wifi", String.valueOf(zzbbiVar.zzt() - 1));
                    zza6.zzc("oa_sig_airplane", String.valueOf(zzbbiVar.zzu() - 1));
                    zza6.zzc("oa_sig_data", String.valueOf(zzbbiVar.zzv() - 1));
                    zza6.zzc("oa_sig_nw_resp", String.valueOf(zzbbiVar.zzg()));
                    zza6.zzc("oa_sig_offline", String.valueOf(zzbbiVar.zzw() - 1));
                    zza6.zzc("oa_sig_nw_state", String.valueOf(zzbbiVar.zzh().zza()));
                    if (zzf.zzc() && zzf.zza() && zzf.zzg() == 2) {
                        zza6.zzc("oa_sig_cell_type", String.valueOf(zzf.zzh() - 1));
                    }
                    this.zzf.zza(zza6);
                }
            }
            sQLiteDatabase.delete("offline_signal_contents", null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
            return null;
        }
        this.zzb.deleteDatabase("OfflineUpload.db");
        return null;
    }
}

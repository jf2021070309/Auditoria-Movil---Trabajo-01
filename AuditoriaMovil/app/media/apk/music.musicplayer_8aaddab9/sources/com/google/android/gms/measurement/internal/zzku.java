package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzpe;
import e.a.d.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public final class zzku extends zzki {
    public zzku(zzks zzksVar) {
        super(zzksVar);
    }

    public static final void zzA(com.google.android.gms.internal.measurement.zzfn zzfnVar, String str, Object obj) {
        List<com.google.android.gms.internal.measurement.zzfs> zzp = zzfnVar.zzp();
        int i2 = 0;
        while (true) {
            if (i2 >= zzp.size()) {
                i2 = -1;
                break;
            } else if (str.equals(zzp.get(i2).zzg())) {
                break;
            } else {
                i2++;
            }
        }
        com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zze.zzk((String) obj);
        } else if (obj instanceof Double) {
            zze.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zze.zzb(zzq((Bundle[]) obj));
        }
        if (i2 >= 0) {
            zzfnVar.zzj(i2, zze);
        } else {
            zzfnVar.zze(zze);
        }
    }

    public static final boolean zzB(zzat zzatVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzatVar);
        Preconditions.checkNotNull(zzpVar);
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfs zzC(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzfoVar.zzi()) {
            if (zzfsVar.zzg().equals(str)) {
                return zzfsVar;
            }
        }
        return null;
    }

    public static final Object zzD(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        com.google.android.gms.internal.measurement.zzfs zzC = zzC(zzfoVar, str);
        if (zzC != null) {
            if (zzC.zzy()) {
                return zzC.zzh();
            }
            if (zzC.zzw()) {
                return Long.valueOf(zzC.zzd());
            }
            if (zzC.zzu()) {
                return Double.valueOf(zzC.zza());
            }
            if (zzC.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfs> zzi = zzC.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzi) {
                    if (zzfsVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfs zzfsVar2 : zzfsVar.zzi()) {
                            if (zzfsVar2.zzy()) {
                                bundle.putString(zzfsVar2.zzg(), zzfsVar2.zzh());
                            } else if (zzfsVar2.zzw()) {
                                bundle.putLong(zzfsVar2.zzg(), zzfsVar2.zzd());
                            } else if (zzfsVar2.zzu()) {
                                bundle.putDouble(zzfsVar2.zzg(), zzfsVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzE(StringBuilder sb, int i2, List<com.google.android.gms.internal.measurement.zzfs> list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : list) {
            if (zzfsVar != null) {
                zzG(sb, i3);
                sb.append("param {\n");
                zzJ(sb, i3, "name", zzfsVar.zzx() ? this.zzs.zzj().zze(zzfsVar.zzg()) : null);
                zzJ(sb, i3, "string_value", zzfsVar.zzy() ? zzfsVar.zzh() : null);
                zzJ(sb, i3, "int_value", zzfsVar.zzw() ? Long.valueOf(zzfsVar.zzd()) : null);
                zzJ(sb, i3, "double_value", zzfsVar.zzu() ? Double.valueOf(zzfsVar.zza()) : null);
                if (zzfsVar.zzc() > 0) {
                    zzE(sb, i3, zzfsVar.zzi());
                }
                zzG(sb, i3);
                sb.append("}\n");
            }
        }
    }

    private final void zzF(StringBuilder sb, int i2, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzG(sb, i2);
        sb.append("filter {\n");
        if (zzelVar.zzh()) {
            zzJ(sb, i2, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzJ(sb, i2, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i3 = i2 + 1;
            com.google.android.gms.internal.measurement.zzex zzd = zzelVar.zzd();
            if (zzd != null) {
                zzG(sb, i3);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzJ(sb, i3, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzJ(sb, i3, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzJ(sb, i3, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzG(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzG(sb, i3 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzG(sb, i3);
                sb.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzK(sb, i2 + 1, "number_filter", zzelVar.zzc());
        }
        zzG(sb, i2);
        sb.append("}\n");
    }

    private static final void zzG(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private static final String zzH(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzI(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar) {
        if (zzgdVar == null) {
            return;
        }
        zzG(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzgdVar.zzb() != 0) {
            zzG(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : zzgdVar.zzk()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zzgdVar.zzd() != 0) {
            zzG(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : zzgdVar.zzn()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (zzgdVar.zza() != 0) {
            zzG(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfmVar.zzh() ? Integer.valueOf(zzfmVar.zza()) : null);
                sb.append(":");
                sb.append(zzfmVar.zzg() ? Long.valueOf(zzfmVar.zzb()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (zzgdVar.zzc() != 0) {
            zzG(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.zzgf zzgfVar : zzgdVar.zzm()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgfVar.zzi() ? Integer.valueOf(zzgfVar.zzb()) : null);
                sb.append(": [");
                int i11 = 0;
                for (Long l4 : zzgfVar.zzf()) {
                    long longValue = l4.longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        zzG(sb, 3);
        sb.append("}\n");
    }

    private static final void zzJ(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzG(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzK(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        if (zzeqVar == null) {
            return;
        }
        zzG(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (zzeqVar.zzg()) {
            int zzm = zzeqVar.zzm();
            zzJ(sb, i2, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzeqVar.zzi()) {
            zzJ(sb, i2, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzJ(sb, i2, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzJ(sb, i2, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzJ(sb, i2, "max_comparison_value", zzeqVar.zzd());
        }
        zzG(sb, i2);
        sb.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzfx zzfxVar, String str) {
        for (int i2 = 0; i2 < zzfxVar.zzb(); i2++) {
            if (str.equals(zzfxVar.zzak(i2).zzf())) {
                return i2;
            }
        }
        return -1;
    }

    public static <Builder extends zzlb> Builder zzl(Builder builder, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkh {
        com.google.android.gms.internal.measurement.zzjj zzb = com.google.android.gms.internal.measurement.zzjj.zzb();
        return zzb != null ? (Builder) builder.zzaw(bArr, zzb) : (Builder) builder.zzav(bArr);
    }

    public static List<com.google.android.gms.internal.measurement.zzfs> zzq(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                    zze2.zzj(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        zze2.zzi(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        zze2.zzk((String) obj);
                    } else if (obj instanceof Double) {
                        zze2.zzh(((Double) obj).doubleValue());
                    }
                    zze.zzc(zze2);
                }
                if (zze.zza() > 0) {
                    arrayList.add(zze.zzaA());
                }
            }
        }
        return arrayList;
    }

    public static List<Long> zzs(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static boolean zzw(List<Long> list, int i2) {
        if (i2 < list.size() * 64) {
            return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzy(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzE = zzkz.zzE();
        if (zzE == null) {
            a.F(this.zzs, "Failed to get MD5");
            return 0L;
        }
        return zzkz.zzp(zzE.digest(bArr));
    }

    public final Bundle zzf(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                zzpe.zzc();
                if (this.zzs.zzf().zzs(null, zzdy.zzau)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList2.add(zzf((Map) arrayList.get(i2), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i3), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T zzh(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzat zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzgs.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzat(zzb, new zzar(zzf), obj2, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzfo zzj(zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzfn zze = com.google.android.gms.internal.measurement.zzfo.zze();
        zze.zzl(zzaoVar.zze);
        zzaq zzaqVar = new zzaq(zzaoVar.zzf);
        while (zzaqVar.hasNext()) {
            String next = zzaqVar.next();
            com.google.android.gms.internal.measurement.zzfr zze2 = com.google.android.gms.internal.measurement.zzfs.zze();
            zze2.zzj(next);
            Object zzf = zzaoVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzu(zze2, zzf);
            zze.zze(zze2);
        }
        return zze.zzaA();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzfw zzfwVar) {
        if (zzfwVar == null) {
            return "";
        }
        StringBuilder y = a.y("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzfy zzfyVar : zzfwVar.zzd()) {
            if (zzfyVar != null) {
                zzG(y, 1);
                y.append("bundle {\n");
                if (zzfyVar.zzbh()) {
                    zzJ(y, 1, "protocol_version", Integer.valueOf(zzfyVar.zzd()));
                }
                zzJ(y, 1, "platform", zzfyVar.zzK());
                if (zzfyVar.zzbd()) {
                    zzJ(y, 1, "gmp_version", Long.valueOf(zzfyVar.zzn()));
                }
                if (zzfyVar.zzbn()) {
                    zzJ(y, 1, "uploading_gmp_version", Long.valueOf(zzfyVar.zzs()));
                }
                if (zzfyVar.zzbb()) {
                    zzJ(y, 1, "dynamite_version", Long.valueOf(zzfyVar.zzk()));
                }
                if (zzfyVar.zzaY()) {
                    zzJ(y, 1, "config_version", Long.valueOf(zzfyVar.zzi()));
                }
                zzJ(y, 1, "gmp_app_id", zzfyVar.zzH());
                zzJ(y, 1, "admob_app_id", zzfyVar.zzx());
                zzJ(y, 1, "app_id", zzfyVar.zzy());
                zzJ(y, 1, "app_version", zzfyVar.zzB());
                if (zzfyVar.zzaW()) {
                    zzJ(y, 1, "app_version_major", Integer.valueOf(zzfyVar.zza()));
                }
                zzJ(y, 1, "firebase_instance_id", zzfyVar.zzF());
                if (zzfyVar.zzba()) {
                    zzJ(y, 1, "dev_cert_hash", Long.valueOf(zzfyVar.zzj()));
                }
                zzJ(y, 1, "app_store", zzfyVar.zzA());
                if (zzfyVar.zzbm()) {
                    zzJ(y, 1, "upload_timestamp_millis", Long.valueOf(zzfyVar.zzr()));
                }
                if (zzfyVar.zzbk()) {
                    zzJ(y, 1, "start_timestamp_millis", Long.valueOf(zzfyVar.zzq()));
                }
                if (zzfyVar.zzbc()) {
                    zzJ(y, 1, "end_timestamp_millis", Long.valueOf(zzfyVar.zzm()));
                }
                if (zzfyVar.zzbg()) {
                    zzJ(y, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzfyVar.zzp()));
                }
                if (zzfyVar.zzbf()) {
                    zzJ(y, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzfyVar.zzo()));
                }
                zzJ(y, 1, "app_instance_id", zzfyVar.zzz());
                zzJ(y, 1, "resettable_device_id", zzfyVar.zzL());
                zzJ(y, 1, "ds_id", zzfyVar.zzE());
                if (zzfyVar.zzbe()) {
                    zzJ(y, 1, "limited_ad_tracking", Boolean.valueOf(zzfyVar.zzaT()));
                }
                zzJ(y, 1, "os_version", zzfyVar.zzJ());
                zzJ(y, 1, "device_model", zzfyVar.zzD());
                zzJ(y, 1, "user_default_language", zzfyVar.zzM());
                if (zzfyVar.zzbl()) {
                    zzJ(y, 1, "time_zone_offset_minutes", Integer.valueOf(zzfyVar.zzf()));
                }
                if (zzfyVar.zzaX()) {
                    zzJ(y, 1, "bundle_sequential_index", Integer.valueOf(zzfyVar.zzb()));
                }
                if (zzfyVar.zzbj()) {
                    zzJ(y, 1, "service_upload", Boolean.valueOf(zzfyVar.zzaU()));
                }
                zzJ(y, 1, "health_monitor", zzfyVar.zzI());
                if (!this.zzs.zzf().zzs(null, zzdy.zzam) && zzfyVar.zzaV() && zzfyVar.zzh() != 0) {
                    zzJ(y, 1, "android_id", Long.valueOf(zzfyVar.zzh()));
                }
                if (zzfyVar.zzbi()) {
                    zzJ(y, 1, "retry_counter", Integer.valueOf(zzfyVar.zze()));
                }
                if (zzfyVar.zzaZ()) {
                    zzJ(y, 1, "consent_signals", zzfyVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgh> zzP = zzfyVar.zzP();
                if (zzP != null) {
                    for (com.google.android.gms.internal.measurement.zzgh zzghVar : zzP) {
                        if (zzghVar != null) {
                            zzG(y, 2);
                            y.append("user_property {\n");
                            zzJ(y, 2, "set_timestamp_millis", zzghVar.zzs() ? Long.valueOf(zzghVar.zzc()) : null);
                            zzJ(y, 2, "name", this.zzs.zzj().zzf(zzghVar.zzf()));
                            zzJ(y, 2, "string_value", zzghVar.zzg());
                            zzJ(y, 2, "int_value", zzghVar.zzr() ? Long.valueOf(zzghVar.zzb()) : null);
                            zzJ(y, 2, "double_value", zzghVar.zzq() ? Double.valueOf(zzghVar.zza()) : null);
                            zzG(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfk> zzN = zzfyVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfk zzfkVar : zzN) {
                        if (zzfkVar != null) {
                            zzG(y, 2);
                            y.append("audience_membership {\n");
                            if (zzfkVar.zzk()) {
                                zzJ(y, 2, "audience_id", Integer.valueOf(zzfkVar.zza()));
                            }
                            if (zzfkVar.zzm()) {
                                zzJ(y, 2, "new_audience", Boolean.valueOf(zzfkVar.zzj()));
                            }
                            zzI(y, 2, "current_data", zzfkVar.zzd());
                            if (zzfkVar.zzn()) {
                                zzI(y, 2, "previous_data", zzfkVar.zze());
                            }
                            zzG(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> zzO = zzfyVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : zzO) {
                        if (zzfoVar != null) {
                            zzG(y, 2);
                            y.append("event {\n");
                            zzJ(y, 2, "name", this.zzs.zzj().zzd(zzfoVar.zzh()));
                            if (zzfoVar.zzu()) {
                                zzJ(y, 2, "timestamp_millis", Long.valueOf(zzfoVar.zzd()));
                            }
                            if (zzfoVar.zzt()) {
                                zzJ(y, 2, "previous_timestamp_millis", Long.valueOf(zzfoVar.zzc()));
                            }
                            if (zzfoVar.zzs()) {
                                zzJ(y, 2, "count", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzb() != 0) {
                                zzE(y, 2, zzfoVar.zzi());
                            }
                            zzG(y, 2);
                            y.append("}\n");
                        }
                    }
                }
                zzG(y, 1);
                y.append("}\n");
            }
        }
        y.append("}\n");
        return y.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return "null";
        }
        StringBuilder y = a.y("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzJ(y, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzJ(y, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String zzH = zzH(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!zzH.isEmpty()) {
            zzJ(y, 0, "filter_type", zzH);
        }
        if (zzejVar.zzo()) {
            zzK(y, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            y.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.zzel zzelVar : zzejVar.zzh()) {
                zzF(y, 2, zzelVar);
            }
        }
        zzG(y, 1);
        y.append("}\n}\n");
        return y.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return "null";
        }
        StringBuilder y = a.y("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzJ(y, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzJ(y, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String zzH = zzH(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!zzH.isEmpty()) {
            zzJ(y, 0, "filter_type", zzH);
        }
        zzF(y, 1, zzesVar.zzb());
        y.append("}\n");
        return y.toString();
    }

    public final List<Long> zzr(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(zzt((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(zzt((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> zzt(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.zzpe.zzc()
            com.google.android.gms.measurement.internal.zzfv r4 = r10.zzs
            com.google.android.gms.measurement.internal.zzaf r4 = r4.zzf()
            r5 = 0
            com.google.android.gms.measurement.internal.zzdx<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzdy.zzau
            boolean r4 = r4.zzs(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzt(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzt(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzku.zzt(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzfr zzfrVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfrVar.zzg();
        zzfrVar.zze();
        zzfrVar.zzd();
        zzfrVar.zzf();
        if (obj instanceof String) {
            zzfrVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfrVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfrVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zzfrVar.zzb(zzq((Bundle[]) obj));
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzgg zzggVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzggVar.zzc();
        zzggVar.zzb();
        zzggVar.zza();
        if (obj instanceof String) {
            zzggVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzggVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzggVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzx(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j2) > j3;
    }

    public final byte[] zzz(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e2);
            throw e2;
        }
    }
}

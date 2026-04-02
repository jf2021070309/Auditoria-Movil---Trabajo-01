package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzakf extends zzajx {
    public static final Parcelable.Creator<zzakf> CREATOR = new zzake();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzakf(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzamq.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakf.<init>(android.os.Parcel):void");
    }

    public zzakf(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    private static List<Integer> zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakf.class == obj.getClass()) {
            zzakf zzakfVar = (zzakf) obj;
            if (zzamq.zzc(this.zzf, zzakfVar.zzf) && zzamq.zzc(this.zza, zzakfVar.zza) && zzamq.zzc(this.zzb, zzakfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = a.x(this.zzf, 527, 31);
        String str = this.zza;
        int hashCode = (x + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 22, String.valueOf(str2).length(), String.valueOf(str3).length()));
        a.M(sb, str, ": description=", str2, ": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzajx, com.google.android.gms.internal.ads.zzaiu
    public final void zza(zzagm zzagmVar) {
        char c2;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                zzagmVar.zzs(this.zzb);
                return;
            case 2:
            case 3:
                zzagmVar.zzt(this.zzb);
                return;
            case 4:
            case 5:
                zzagmVar.zzv(this.zzb);
                return;
            case 6:
            case 7:
                zzagmVar.zzu(this.zzb);
                return;
            case '\b':
            case '\t':
                String[] zzt = zzamq.zzt(this.zzb, "/");
                try {
                    int parseInt = Integer.parseInt(zzt[0]);
                    Integer valueOf = zzt.length > 1 ? Integer.valueOf(Integer.parseInt(zzt[1])) : null;
                    zzagmVar.zzy(Integer.valueOf(parseInt));
                    zzagmVar.zzz(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzagmVar.zzA(Integer.valueOf(Integer.parseInt(this.zzb)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.zzb.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.zzb.substring(0, 2));
                    zzagmVar.zzB(Integer.valueOf(parseInt2));
                    zzagmVar.zzC(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List<Integer> zzb = zzb(this.zzb);
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        zzagmVar.zzC(zzb.get(2));
                    }
                    zzagmVar.zzB(zzb.get(1));
                }
                zzagmVar.zzA(zzb.get(0));
                return;
            case 15:
                List<Integer> zzb2 = zzb(this.zzb);
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        zzagmVar.zzF(zzb2.get(2));
                    }
                    zzagmVar.zzE(zzb2.get(1));
                }
                zzagmVar.zzD(zzb2.get(0));
                return;
            case 16:
            case 17:
                zzagmVar.zzH(this.zzb);
                return;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                zzagmVar.zzI(this.zzb);
                return;
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                zzagmVar.zzG(this.zzb);
                return;
            default:
                return;
        }
    }
}

package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzjz implements zzkn {
    private static final Charset zza = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    private final InputStream zzb;

    private zzjz(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzkn zza(InputStream inputStream) throws IOException {
        return new zzjz(inputStream);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.pal.zzkn
    public final zzwb zzb() throws IOException {
        char c;
        int i;
        char c2;
        int i2;
        char c3;
        zzvn zzvnVar;
        String str = "status";
        try {
            try {
                zzzb zzf = zzzs.zza(new zzabc(new StringReader(new String(zzlh.zzc(this.zzb), zza)))).zzf();
                if (zzf.zzi("key") && zzf.zzb("key").zzb() != 0) {
                    zzvy zzd = zzwb.zzd();
                    if (zzf.zzi("primaryKeyId")) {
                        zzd.zzb(zzf.zzc("primaryKeyId").zza());
                    }
                    zzyx zzb = zzf.zzb("key");
                    int i3 = 0;
                    while (i3 < zzb.zzb()) {
                        zzzb zzf2 = zzb.zzc(i3).zzf();
                        if (zzf2.zzi("keyData") && zzf2.zzi(str) && zzf2.zzi("keyId") && zzf2.zzi("outputPrefixType")) {
                            zzvz zzd2 = zzwa.zzd();
                            String zzd3 = zzf2.zzc(str).zzd();
                            int hashCode = zzd3.hashCode();
                            String str2 = str;
                            if (hashCode != -891611359) {
                                if (hashCode != 478389753) {
                                    if (hashCode == 1053567612 && zzd3.equals("DISABLED")) {
                                        c = 1;
                                    }
                                    c = 65535;
                                } else {
                                    if (zzd3.equals("DESTROYED")) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (zzd3.equals("ENABLED")) {
                                    c = 0;
                                }
                                c = 65535;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c == 2) {
                                        i = 5;
                                    } else {
                                        throw new zzzc("unknown status: ".concat(zzd3));
                                    }
                                } else {
                                    i = 4;
                                }
                            } else {
                                i = 3;
                            }
                            zzd2.zzd(i);
                            zzd2.zzb(zzf2.zzc("keyId").zza());
                            String zzd4 = zzf2.zzc("outputPrefixType").zzd();
                            switch (zzd4.hashCode()) {
                                case -2053249079:
                                    if (zzd4.equals("LEGACY")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 80904:
                                    if (zzd4.equals("RAW")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2575090:
                                    if (zzd4.equals("TINK")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1761684556:
                                    if (zzd4.equals("CRUNCHY")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 != 0) {
                                if (c2 != 1) {
                                    if (c2 != 2) {
                                        if (c2 == 3) {
                                            i2 = 6;
                                        } else {
                                            throw new zzzc("unknown output prefix type: ".concat(zzd4));
                                        }
                                    } else {
                                        i2 = 4;
                                    }
                                } else {
                                    i2 = 5;
                                }
                            } else {
                                i2 = 3;
                            }
                            zzd2.zzc(i2);
                            zzzb zze = zzf2.zze("keyData");
                            if (zze.zzi("typeUrl") && zze.zzi("value") && zze.zzi("keyMaterialType")) {
                                byte[] zza2 = zzxn.zza(zze.zzc("value").zzd(), 2);
                                zzvl zza3 = zzvo.zza();
                                zza3.zzb(zze.zzc("typeUrl").zzd());
                                zza3.zzc(zzaby.zzn(zza2));
                                String zzd5 = zze.zzc("keyMaterialType").zzd();
                                switch (zzd5.hashCode()) {
                                    case -1881281466:
                                        if (zzd5.equals("REMOTE")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1609477353:
                                        if (zzd5.equals("SYMMETRIC")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 249237018:
                                        if (zzd5.equals("ASYMMETRIC_PRIVATE")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1534613202:
                                        if (zzd5.equals("ASYMMETRIC_PUBLIC")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                if (c3 != 0) {
                                    if (c3 != 1) {
                                        if (c3 != 2) {
                                            if (c3 == 3) {
                                                zzvnVar = zzvn.REMOTE;
                                            } else {
                                                throw new zzzc("unknown key material type: ".concat(zzd5));
                                            }
                                        } else {
                                            zzvnVar = zzvn.ASYMMETRIC_PUBLIC;
                                        }
                                    } else {
                                        zzvnVar = zzvn.ASYMMETRIC_PRIVATE;
                                    }
                                } else {
                                    zzvnVar = zzvn.SYMMETRIC;
                                }
                                zza3.zza(zzvnVar);
                                zzd2.zza((zzvo) zza3.zzan());
                                zzd.zza((zzwa) zzd2.zzan());
                                i3++;
                                str = str2;
                            } else {
                                throw new zzzc("invalid keyData");
                            }
                        } else {
                            throw new zzzc("invalid key");
                        }
                    }
                    return (zzwb) zzd.zzan();
                }
                throw new zzzc("invalid keyset");
            } finally {
                InputStream inputStream = this.zzb;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (zzzc | IllegalStateException e) {
            throw new IOException(e);
        }
    }
}

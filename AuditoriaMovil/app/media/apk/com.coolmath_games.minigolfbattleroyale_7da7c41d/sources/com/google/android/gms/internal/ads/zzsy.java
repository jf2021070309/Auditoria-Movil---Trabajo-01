package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzsy implements zzum {
    private final List<zzafv> zza;

    public zzsy() {
        this(0);
    }

    private final zzuc zzb(zzul zzulVar) {
        return new zzuc(zzd(zzulVar));
    }

    private final zzuq zzc(zzul zzulVar) {
        return new zzuq(zzd(zzulVar));
    }

    private final List<zzafv> zzd(zzul zzulVar) {
        String str;
        int i;
        List<byte[]> list;
        zzamf zzamfVar = new zzamf(zzulVar.zzd);
        List<zzafv> list2 = this.zza;
        while (zzamfVar.zzd() > 0) {
            int zzn = zzamfVar.zzn();
            int zzg = zzamfVar.zzg() + zzamfVar.zzn();
            if (zzn == 134) {
                list2 = new ArrayList<>();
                int zzn2 = zzamfVar.zzn() & 31;
                for (int i2 = 0; i2 < zzn2; i2++) {
                    String zzE = zzamfVar.zzE(3, zzfll.zzc);
                    int zzn3 = zzamfVar.zzn();
                    int i3 = zzn3 & 128;
                    if (i3 != 0) {
                        i = zzn3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzn4 = (byte) zzamfVar.zzn();
                    zzamfVar.zzk(1);
                    if (i3 != 0) {
                        int i4 = zzakv.zza;
                        list = Collections.singletonList((zzn4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzaft zzaftVar = new zzaft();
                    zzaftVar.zzN(str);
                    zzaftVar.zzG(zzE);
                    zzaftVar.zzaf(i);
                    zzaftVar.zzP(list);
                    list2.add(zzaftVar.zzah());
                }
            }
            zzamfVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final zzuo zza(int i, zzul zzulVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzts(new zztp(zzulVar.zzb));
            }
            if (i != 21) {
                if (i != 27) {
                    if (i != 36) {
                        if (i != 89) {
                            if (i != 129) {
                                if (i == 138) {
                                    return new zzts(new zzsz(zzulVar.zzb));
                                }
                                if (i == 172) {
                                    return new zzts(new zzsu(zzulVar.zzb));
                                }
                                if (i == 257) {
                                    return new zzub(new zztr("application/vnd.dvb.ait"));
                                }
                                if (i == 134) {
                                    return new zzub(new zztr("application/x-scte35"));
                                }
                                if (i != 135) {
                                    switch (i) {
                                        case 15:
                                            return new zzts(new zzsx(false, zzulVar.zzb));
                                        case 16:
                                            return new zzts(new zztg(zzc(zzulVar)));
                                        case 17:
                                            return new zzts(new zzto(zzulVar.zzb));
                                        default:
                                            return null;
                                    }
                                }
                            }
                            return new zzts(new zzsr(zzulVar.zzb));
                        }
                        return new zzts(new zzta(zzulVar.zzc));
                    }
                    return new zzts(new zztm(zzb(zzulVar)));
                }
                return new zzts(new zztk(zzb(zzulVar), false, false));
            }
            return new zzts(new zztn());
        }
        return new zzts(new zztd(zzc(zzulVar)));
    }

    public zzsy(int i) {
        this.zza = zzfoj.zzi();
    }
}

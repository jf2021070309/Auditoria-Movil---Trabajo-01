package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzsy implements zzum {
    private final List<zzafv> zza;

    public zzsy() {
        this(0);
    }

    public zzsy(int i2) {
        this.zza = zzfoj.zzi();
    }

    private final zzuc zzb(zzul zzulVar) {
        return new zzuc(zzd(zzulVar));
    }

    private final zzuq zzc(zzul zzulVar) {
        return new zzuq(zzd(zzulVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List<zzafv> zzd(zzul zzulVar) {
        String str;
        int i2;
        List<byte[]> list;
        zzamf zzamfVar = new zzamf(zzulVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzamfVar.zzd() > 0) {
            int zzn = zzamfVar.zzn();
            int zzg = zzamfVar.zzg() + zzamfVar.zzn();
            if (zzn == 134) {
                arrayList = new ArrayList();
                int zzn2 = zzamfVar.zzn() & 31;
                for (int i3 = 0; i3 < zzn2; i3++) {
                    String zzE = zzamfVar.zzE(3, zzfll.zzc);
                    int zzn3 = zzamfVar.zzn();
                    int i4 = zzn3 & 128;
                    if (i4 != 0) {
                        i2 = zzn3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte zzn4 = (byte) zzamfVar.zzn();
                    zzamfVar.zzk(1);
                    if (i4 != 0) {
                        int i5 = zzakv.zza;
                        list = Collections.singletonList((zzn4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzaft zzaftVar = new zzaft();
                    zzaftVar.zzN(str);
                    zzaftVar.zzG(zzE);
                    zzaftVar.zzaf(i2);
                    zzaftVar.zzP(list);
                    arrayList.add(zzaftVar.zzah());
                }
            }
            zzamfVar.zzh(zzg);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final zzuo zza(int i2, zzul zzulVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new zzts(new zztp(zzulVar.zzb));
            }
            if (i2 != 21) {
                if (i2 != 27) {
                    if (i2 != 36) {
                        if (i2 != 89) {
                            if (i2 != 129) {
                                if (i2 == 138) {
                                    return new zzts(new zzsz(zzulVar.zzb));
                                }
                                if (i2 == 172) {
                                    return new zzts(new zzsu(zzulVar.zzb));
                                }
                                if (i2 == 257) {
                                    return new zzub(new zztr("application/vnd.dvb.ait"));
                                }
                                if (i2 == 134) {
                                    return new zzub(new zztr("application/x-scte35"));
                                }
                                if (i2 != 135) {
                                    switch (i2) {
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
}

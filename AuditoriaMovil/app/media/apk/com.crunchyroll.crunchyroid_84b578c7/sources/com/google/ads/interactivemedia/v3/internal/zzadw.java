package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzadw implements zzagk {
    private final zzadv zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzadw(zzadv zzadvVar) {
        byte[] bArr = zzafa.zzd;
        this.zza = zzadvVar;
        zzadvVar.zzc = this;
    }

    private final void zzP(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzagsVar.zzh(obj, this, zzaefVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw zzafc.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        zzadv zzadvVar;
        int zze = ((zzadt) this.zza).zze();
        zzadv zzadvVar2 = this.zza;
        if (zzadvVar2.zza < zzadvVar2.zzb) {
            int zzc = zzadvVar2.zzc(zze);
            this.zza.zza++;
            zzagsVar.zzh(obj, this, zzaefVar);
            this.zza.zzm(0);
            zzadvVar.zza--;
            this.zza.zzn(zzc);
            return;
        }
        throw new zzafc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzb() == i) {
            return;
        }
        throw zzafc.zzi();
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) == i) {
            return;
        }
        throw zzafc.zza();
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw zzafc.zzg();
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw zzafc.zzg();
    }

    public static zzadw zzq(zzadv zzadvVar) {
        zzadw zzadwVar = zzadvVar.zzc;
        if (zzadwVar != null) {
            return zzadwVar;
        }
        return new zzadw(zzadvVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzadt) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzafoVar.zzf(((zzadt) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzadt) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Long.valueOf(((zzadt) this.zza).zzg()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaem) {
            zzaem zzaemVar = (zzaem) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
                        zzadv zzadvVar = this.zza;
                        if (zzadvVar.zzp()) {
                            return;
                        }
                        zzf2 = zzadvVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzafc.zza();
            }
            int zze = ((zzadt) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzaemVar.zze(Float.intBitsToFloat(((zzadt) this.zza).zzd()));
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
                    zzadv zzadvVar2 = this.zza;
                    if (zzadvVar2.zzp()) {
                        return;
                    }
                    zzf = zzadvVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzafc.zza();
        }
        int zze2 = ((zzadt) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((zzadt) this.zza).zzd())));
        } while (this.zza.zzb() < zzb2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    @Deprecated
    public final void zzC(List list, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                Object zze = zzagsVar.zze();
                zzP(zze, zzagsVar, zzaefVar);
                zzagsVar.zzf(zze);
                list.add(zze);
                zzadv zzadvVar = this.zza;
                if (!zzadvVar.zzp() && this.zzd == 0) {
                    zzf = zzadvVar.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzafc.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzaeuVar.zzg(((zzadt) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Integer.valueOf(((zzadt) this.zza).zze()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzafoVar.zzf(((zzadt) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Long.valueOf(((zzadt) this.zza).zzh()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzF(List list, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                Object zze = zzagsVar.zze();
                zzQ(zze, zzagsVar, zzaefVar);
                zzagsVar.zzf(zze);
                list.add(zze);
                zzadv zzadvVar = this.zza;
                if (!zzadvVar.zzp() && this.zzd == 0) {
                    zzf = zzadvVar.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzafc.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzaeuVar.zzg(((zzadt) this.zza).zzd());
                        zzadv zzadvVar = this.zza;
                        if (zzadvVar.zzp()) {
                            return;
                        }
                        zzf2 = zzadvVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzafc.zza();
            }
            int zze = ((zzadt) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                    zzadv zzadvVar2 = this.zza;
                    if (zzadvVar2.zzp()) {
                        return;
                    }
                    zzf = zzadvVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzafc.zza();
        }
        int zze2 = ((zzadt) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
        } while (this.zza.zzb() < zzb2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzadt) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzafoVar.zzf(((zzadt) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzg());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzadt) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Long.valueOf(((zzadt) this.zza).zzg()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzaeuVar.zzg(zzadv.zzs(((zzadt) this.zza).zze()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Integer.valueOf(zzadv.zzs(((zzadt) this.zza).zze())));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzafoVar.zzf(zzadv.zzt(((zzadt) this.zza).zzh()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Long.valueOf(zzadv.zzt(((zzadt) this.zza).zzh())));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzK(List list, boolean z) throws IOException {
        String zzr;
        int zzf;
        int zzf2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzafh) && !z) {
                zzafh zzafhVar = (zzafh) list;
                do {
                    zzafhVar.zzi(zzp());
                    zzadv zzadvVar = this.zza;
                    if (zzadvVar.zzp()) {
                        return;
                    }
                    zzf2 = zzadvVar.zzf();
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
                return;
            }
            do {
                if (z) {
                    zzr = zzs();
                } else {
                    zzr = zzr();
                }
                list.add(zzr);
                zzadv zzadvVar2 = this.zza;
                if (zzadvVar2.zzp()) {
                    return;
                }
                zzf = zzadvVar2.zzf();
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzafc.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzaeuVar.zzg(((zzadt) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Integer.valueOf(((zzadt) this.zza).zze()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzafoVar.zzf(((zzadt) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzafoVar.zzf(((zzadt) this.zza).zzh());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzadt) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Long.valueOf(((zzadt) this.zza).zzh()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final boolean zzO() throws IOException {
        int i;
        zzadv zzadvVar = this.zza;
        if (!zzadvVar.zzp() && (i = this.zzb) != this.zzc) {
            return zzadvVar.zzr(i);
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzadt) this.zza).zzg());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzadt) this.zza).zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzf();
            this.zzb = i;
        }
        if (i != 0 && i != this.zzc) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zze() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzf() throws IOException {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzg() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzh() throws IOException {
        zzS(5);
        return ((zzadt) this.zza).zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzi() throws IOException {
        zzS(0);
        return zzadv.zzs(((zzadt) this.zza).zze());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final int zzj() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzk() throws IOException {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzl() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzm() throws IOException {
        zzS(1);
        return ((zzadt) this.zza).zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzn() throws IOException {
        zzS(0);
        return zzadv.zzt(((zzadt) this.zza).zzh());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final long zzo() throws IOException {
        zzS(0);
        return ((zzadt) this.zza).zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final zzadr zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzt(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        zzS(3);
        zzP(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzu(Object obj, zzags zzagsVar, zzaef zzaefVar) throws IOException {
        zzS(2);
        zzQ(obj, zzagsVar, zzaefVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadg) {
            zzadg zzadgVar = (zzadg) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzadgVar.zze(this.zza.zzq());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzadgVar.zze(this.zza.zzq());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzq()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf = zzadvVar.zzf();
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzafc.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaec) {
            zzaec zzaecVar = (zzaec) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzadt) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzaecVar.zze(Double.longBitsToDouble(((zzadt) this.zza).zzg()));
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzadt) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((zzadt) this.zza).zzg())));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzadt) this.zza).zze();
                    do {
                        zzaeuVar.zzg(((zzadt) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzafc.zza();
            }
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zze());
                zzadv zzadvVar = this.zza;
                if (zzadvVar.zzp()) {
                    return;
                }
                zzf2 = zzadvVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzadt) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzafc.zza();
        }
        do {
            list.add(Integer.valueOf(((zzadt) this.zza).zze()));
            zzadv zzadvVar2 = this.zza;
            if (zzadvVar2.zzp()) {
                return;
            }
            zzf = zzadvVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagk
    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzaeuVar.zzg(((zzadt) this.zza).zzd());
                        zzadv zzadvVar = this.zza;
                        if (zzadvVar.zzp()) {
                            return;
                        }
                        zzf2 = zzadvVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzafc.zza();
            }
            int zze = ((zzadt) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzaeuVar.zzg(((zzadt) this.zza).zzd());
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
                    zzadv zzadvVar2 = this.zza;
                    if (zzadvVar2.zzp()) {
                        return;
                    }
                    zzf = zzadvVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzafc.zza();
        }
        int zze2 = ((zzadt) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Integer.valueOf(((zzadt) this.zza).zzd()));
        } while (this.zza.zzb() < zzb2);
    }
}

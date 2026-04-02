package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzacd implements zzaeq {
    private final zzacc zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzacd(zzacc zzaccVar) {
        zzadg.zzf(zzaccVar, "input");
        this.zza = zzaccVar;
        zzaccVar.zzc = this;
    }

    private final Object zzP(zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzaerVar.zze();
            zzaerVar.zzh(zze, this, zzacmVar);
            zzaerVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzadi.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final Object zzQ(zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        zzacc zzaccVar;
        int zze = ((zzaca) this.zza).zze();
        zzacc zzaccVar2 = this.zza;
        if (zzaccVar2.zza < zzaccVar2.zzb) {
            int zzc = zzaccVar2.zzc(zze);
            Object zze2 = zzaerVar.zze();
            this.zza.zza++;
            zzaerVar.zzh(zze2, this, zzacmVar);
            zzaerVar.zzf(zze2);
            this.zza.zzm(0);
            zzaccVar.zza--;
            this.zza.zzn(zzc);
            return zze2;
        }
        throw new zzadi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzb() == i) {
            return;
        }
        throw zzadi.zzi();
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) == i) {
            return;
        }
        throw zzadi.zza();
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw zzadi.zzg();
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw zzadi.zzg();
    }

    public static zzacd zzq(zzacc zzaccVar) {
        zzacd zzacdVar = zzaccVar.zzc;
        if (zzacdVar != null) {
            return zzacdVar;
        }
        return new zzacd(zzaccVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzaca) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzaduVar.zzf(((zzaca) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzg());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzaca) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Long.valueOf(((zzaca) this.zza).zzg()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzact) {
            zzact zzactVar = (zzact) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzactVar.zze(Float.intBitsToFloat(((zzaca) this.zza).zzd()));
                        zzacc zzaccVar = this.zza;
                        if (zzaccVar.zzp()) {
                            return;
                        }
                        zzf2 = zzaccVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzadi.zza();
            }
            int zze = ((zzaca) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzactVar.zze(Float.intBitsToFloat(((zzaca) this.zza).zzd()));
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzaca) this.zza).zzd())));
                    zzacc zzaccVar2 = this.zza;
                    if (zzaccVar2.zzp()) {
                        return;
                    }
                    zzf = zzaccVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzadi.zza();
        }
        int zze2 = ((zzaca) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((zzaca) this.zza).zzd())));
        } while (this.zza.zzb() < zzb2);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    @Deprecated
    public final void zzC(List list, zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                list.add(zzP(zzaerVar, zzacmVar));
                zzacc zzaccVar = this.zza;
                if (!zzaccVar.zzp() && this.zzd == 0) {
                    zzf = zzaccVar.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzadi.zza();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzadaVar.zzg(((zzaca) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Integer.valueOf(((zzaca) this.zza).zze()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzaduVar.zzf(((zzaca) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzh());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Long.valueOf(((zzaca) this.zza).zzh()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzF(List list, zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                list.add(zzQ(zzaerVar, zzacmVar));
                zzacc zzaccVar = this.zza;
                if (!zzaccVar.zzp() && this.zzd == 0) {
                    zzf = zzaccVar.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzadi.zza();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzadaVar.zzg(((zzaca) this.zza).zzd());
                        zzacc zzaccVar = this.zza;
                        if (zzaccVar.zzp()) {
                            return;
                        }
                        zzf2 = zzaccVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzadi.zza();
            }
            int zze = ((zzaca) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzadaVar.zzg(((zzaca) this.zza).zzd());
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                    zzacc zzaccVar2 = this.zza;
                    if (zzaccVar2.zzp()) {
                        return;
                    }
                    zzf = zzaccVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzadi.zza();
        }
        int zze2 = ((zzaca) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
        } while (this.zza.zzb() < zzb2);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzaca) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzaduVar.zzf(((zzaca) this.zza).zzg());
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzg());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzaca) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzg()));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Long.valueOf(((zzaca) this.zza).zzg()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzadaVar.zzg(zzacc.zzs(((zzaca) this.zza).zze()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzadaVar.zzg(zzacc.zzs(((zzaca) this.zza).zze()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzacc.zzs(((zzaca) this.zza).zze())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Integer.valueOf(zzacc.zzs(((zzaca) this.zza).zze())));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzaduVar.zzf(zzacc.zzt(((zzaca) this.zza).zzh()));
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzaduVar.zzf(zzacc.zzt(((zzaca) this.zza).zzh()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzacc.zzt(((zzaca) this.zza).zzh())));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Long.valueOf(zzacc.zzt(((zzaca) this.zza).zzh())));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzK(List list, boolean z) throws IOException {
        String zzt;
        int zzf;
        int zzf2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzadn) && !z) {
                zzadn zzadnVar = (zzadn) list;
                do {
                    zzadnVar.zzi(zzp());
                    zzacc zzaccVar = this.zza;
                    if (zzaccVar.zzp()) {
                        return;
                    }
                    zzf2 = zzaccVar.zzf();
                } while (zzf2 == this.zzb);
                this.zzd = zzf2;
                return;
            }
            do {
                if (z) {
                    zzt = zzu();
                } else {
                    zzt = zzt();
                }
                list.add(zzt);
                zzacc zzaccVar2 = this.zza;
                if (zzaccVar2.zzp()) {
                    return;
                }
                zzf = zzaccVar2.zzf();
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzadi.zza();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzadaVar.zzg(((zzaca) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Integer.valueOf(((zzaca) this.zza).zze()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzaduVar.zzf(((zzaca) this.zza).zzh());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzaduVar.zzf(((zzaca) this.zza).zzh());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzaca) this.zza).zzh()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Long.valueOf(((zzaca) this.zza).zzh()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final boolean zzO() throws IOException {
        int i;
        zzacc zzaccVar = this.zza;
        if (!zzaccVar.zzp() && (i = this.zzb) != this.zzc) {
            return zzaccVar.zzr(i);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzaca) this.zza).zzg());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzaca) this.zza).zzd());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
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

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zze() throws IOException {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzf() throws IOException {
        zzS(5);
        return ((zzaca) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzg() throws IOException {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzh() throws IOException {
        zzS(5);
        return ((zzaca) this.zza).zzd();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzi() throws IOException {
        zzS(0);
        return zzacc.zzs(((zzaca) this.zza).zze());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final int zzj() throws IOException {
        zzS(0);
        return ((zzaca) this.zza).zze();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzk() throws IOException {
        zzS(1);
        return ((zzaca) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzl() throws IOException {
        zzS(0);
        return ((zzaca) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzm() throws IOException {
        zzS(1);
        return ((zzaca) this.zza).zzg();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzn() throws IOException {
        zzS(0);
        return zzacc.zzt(((zzaca) this.zza).zzh());
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final long zzo() throws IOException {
        zzS(0);
        return ((zzaca) this.zza).zzh();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final zzaby zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    @Deprecated
    public final Object zzr(zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        zzS(3);
        return zzP(zzaerVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final Object zzs(zzaer zzaerVar, zzacm zzacmVar) throws IOException {
        zzS(2);
        return zzQ(zzaerVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzabn) {
            zzabn zzabnVar = (zzabn) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzabnVar.zze(this.zza.zzq());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzabnVar.zze(this.zza.zzq());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzq()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf = zzaccVar.zzf();
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzadi.zza();
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzacj) {
            zzacj zzacjVar = (zzacj) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i == 2) {
                    int zze = ((zzaca) this.zza).zze();
                    zzU(zze);
                    int zzb = this.zza.zzb() + zze;
                    do {
                        zzacjVar.zze(Double.longBitsToDouble(((zzaca) this.zza).zzg()));
                    } while (this.zza.zzb() < zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzacjVar.zze(Double.longBitsToDouble(((zzaca) this.zza).zzg()));
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zze2 = ((zzaca) this.zza).zze();
                zzU(zze2);
                int zzb2 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzaca) this.zza).zzg())));
                } while (this.zza.zzb() < zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((zzaca) this.zza).zzg())));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzb = this.zza.zzb() + ((zzaca) this.zza).zze();
                    do {
                        zzadaVar.zzg(((zzaca) this.zza).zze());
                    } while (this.zza.zzb() < zzb);
                    zzR(zzb);
                    return;
                }
                throw zzadi.zza();
            }
            do {
                zzadaVar.zzg(((zzaca) this.zza).zze());
                zzacc zzaccVar = this.zza;
                if (zzaccVar.zzp()) {
                    return;
                }
                zzf2 = zzaccVar.zzf();
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzb2 = this.zza.zzb() + ((zzaca) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zze()));
                } while (this.zza.zzb() < zzb2);
                zzR(zzb2);
                return;
            }
            throw zzadi.zza();
        }
        do {
            list.add(Integer.valueOf(((zzaca) this.zza).zze()));
            zzacc zzaccVar2 = this.zza;
            if (zzaccVar2.zzp()) {
                return;
            }
            zzf = zzaccVar2.zzf();
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzaeq
    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzadaVar.zzg(((zzaca) this.zza).zzd());
                        zzacc zzaccVar = this.zza;
                        if (zzaccVar.zzp()) {
                            return;
                        }
                        zzf2 = zzaccVar.zzf();
                    } while (zzf2 == this.zzb);
                    this.zzd = zzf2;
                    return;
                }
                throw zzadi.zza();
            }
            int zze = ((zzaca) this.zza).zze();
            zzT(zze);
            int zzb = this.zza.zzb() + zze;
            do {
                zzadaVar.zzg(((zzaca) this.zza).zzd());
            } while (this.zza.zzb() < zzb);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
                    zzacc zzaccVar2 = this.zza;
                    if (zzaccVar2.zzp()) {
                        return;
                    }
                    zzf = zzaccVar2.zzf();
                } while (zzf == this.zzb);
                this.zzd = zzf;
                return;
            }
            throw zzadi.zza();
        }
        int zze2 = ((zzaca) this.zza).zze();
        zzT(zze2);
        int zzb2 = this.zza.zzb() + zze2;
        do {
            list.add(Integer.valueOf(((zzaca) this.zza).zzd()));
        } while (this.zza.zzb() < zzb2);
    }
}

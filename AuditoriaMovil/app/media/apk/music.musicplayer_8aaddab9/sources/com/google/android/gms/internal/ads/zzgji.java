package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzgji extends zzgfw<zzgkg, zzgji> implements zzghj {
    private zzgji() {
        super(zzgkg.zzf());
    }

    public /* synthetic */ zzgji(zzgjg zzgjgVar) {
        super(zzgkg.zzf());
    }

    public final String zza() {
        return ((zzgkg) this.zza).zza();
    }

    public final zzgji zzb(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzg((zzgkg) this.zza, str);
        return this;
    }

    public final zzgji zzc(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzh((zzgkg) this.zza, str);
        return this;
    }

    public final zzgji zzd(zzgjk zzgjkVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzi((zzgkg) this.zza, zzgjkVar);
        return this;
    }

    public final List<zzgkd> zze() {
        return Collections.unmodifiableList(((zzgkg) this.zza).zzc());
    }

    public final zzgji zzf(zzgkd zzgkdVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzj((zzgkg) this.zza, zzgkdVar);
        return this;
    }

    public final String zzg() {
        return ((zzgkg) this.zza).zzd();
    }

    public final zzgji zzh(String str) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzk((zzgkg) this.zza, str);
        return this;
    }

    public final zzgji zzi() {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzl((zzgkg) this.zza);
        return this;
    }

    public final zzgji zzj(zzgjx zzgjxVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzm((zzgkg) this.zza, zzgjxVar);
        return this;
    }

    public final zzgji zzk(zzgkf zzgkfVar) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzn((zzgkg) this.zza, zzgkfVar);
        return this;
    }

    public final zzgji zzl(Iterable<String> iterable) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzo((zzgkg) this.zza, iterable);
        return this;
    }

    public final zzgji zzm(Iterable<String> iterable) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzp((zzgkg) this.zza, iterable);
        return this;
    }

    public final zzgji zzn(int i2) {
        if (this.zzb) {
            zzae();
            this.zzb = false;
        }
        zzgkg.zzq((zzgkg) this.zza, i2);
        return this;
    }
}

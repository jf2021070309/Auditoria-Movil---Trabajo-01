package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public class zzauf extends IOException {
    public final zzaub zza;

    public zzauf(IOException iOException, zzaub zzaubVar, int i2) {
        super(iOException);
        this.zza = zzaubVar;
    }

    public zzauf(String str, zzaub zzaubVar, int i2) {
        super(str);
        this.zza = zzaubVar;
    }

    public zzauf(String str, IOException iOException, zzaub zzaubVar, int i2) {
        super(str, iOException);
        this.zza = zzaubVar;
    }
}

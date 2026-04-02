package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzauf extends IOException {
    public final zzaub zza;

    public zzauf(IOException iOException, zzaub zzaubVar, int i) {
        super(iOException);
        this.zza = zzaubVar;
    }

    public zzauf(String str, zzaub zzaubVar, int i) {
        super(str);
        this.zza = zzaubVar;
    }

    public zzauf(String str, IOException iOException, zzaub zzaubVar, int i) {
        super(str, iOException);
        this.zza = zzaubVar;
    }
}

package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaja {
    private final ByteArrayOutputStream zza = new ByteArrayOutputStream(512);
    private final DataOutputStream zzb = new DataOutputStream(this.zza);

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzaiz zzaizVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzaizVar.zza);
            String str = zzaizVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzaizVar.zzc);
            this.zzb.writeLong(zzaizVar.zzd);
            this.zzb.write(zzaizVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

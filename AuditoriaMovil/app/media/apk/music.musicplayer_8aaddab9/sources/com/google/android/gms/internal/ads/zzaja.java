package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzaja {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzaja() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

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
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}

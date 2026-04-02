package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class zzax implements DialogInterface.OnClickListener {
    final /* synthetic */ zzay zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzX(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

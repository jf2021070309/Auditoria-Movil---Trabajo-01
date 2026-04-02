package com.google.android.gms.cast.framework.media;

import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzbq implements DialogInterface.OnClickListener {
    final /* synthetic */ TracksChooserDialogFragment zza;

    public zzbq(TracksChooserDialogFragment tracksChooserDialogFragment) {
        this.zza = tracksChooserDialogFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Dialog dialog;
        Dialog dialog2;
        TracksChooserDialogFragment tracksChooserDialogFragment = this.zza;
        dialog = tracksChooserDialogFragment.zze;
        if (dialog != null) {
            dialog2 = tracksChooserDialogFragment.zze;
            dialog2.cancel();
            this.zza.zze = null;
        }
    }
}

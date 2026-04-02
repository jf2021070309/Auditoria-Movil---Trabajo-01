package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzfb extends ImageView implements View.OnClickListener {
    private final CompanionData zza;
    private final zzfm zzb;
    private final String zzc;
    private final List zzd;
    private final zzhy zze;

    public zzfb(Context context, zzfm zzfmVar, CompanionData companionData, Task task, String str, List list, zzhy zzhyVar) {
        super(context);
        this.zzb = zzfmVar;
        this.zza = companionData;
        this.zzc = str;
        this.zzd = list;
        this.zze = zzhyVar;
        setOnClickListener(this);
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzfa
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfb zzfbVar = zzfb.this;
                if (task2.isSuccessful()) {
                    zzfbVar.setImageBitmap((Bitmap) task2.getResult());
                } else {
                    zzhd.zzb("Image companion error", task2.getException());
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        for (CompanionAdSlot.ClickListener clickListener : this.zzd) {
            clickListener.onCompanionAdClick();
        }
        this.zze.zza(this.zza.clickThroughUrl());
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        zzfm zzfmVar = this.zzb;
        String companionId = this.zza.companionId();
        String str = this.zzc;
        if (!zzro.zzc(companionId) && !zzro.zzc(str)) {
            HashMap zzb = zztd.zzb(1);
            zzb.put("companionId", companionId);
            zzfmVar.zzp(new zzff(zzfd.displayContainer, zzfe.companionView, str, zzb));
        }
    }
}

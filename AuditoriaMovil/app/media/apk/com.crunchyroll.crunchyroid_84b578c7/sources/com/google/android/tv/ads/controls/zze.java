package com.google.android.tv.ads.controls;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.amazon.aps.iva.ed.d;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
final class zze extends d {
    final /* synthetic */ WhyThisAdFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(WhyThisAdFragment whyThisAdFragment, ImageView imageView) {
        super(imageView);
        this.zza = whyThisAdFragment;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadFailed(Drawable drawable) {
        FragmentManager parentFragmentManager = this.zza.getParentFragmentManager();
        a a = b.a(parentFragmentManager, parentFragmentManager);
        a.r = true;
        a.f(ErrorMessageFragment.class, null);
        a.h();
    }

    @Override // com.amazon.aps.iva.ed.d
    public final void onResourceCleared(Drawable drawable) {
        ImageView imageView;
        imageView = this.zza.zzb;
        imageView.setImageDrawable(drawable);
    }

    @Override // com.amazon.aps.iva.ed.h
    public final /* bridge */ /* synthetic */ void onResourceReady(Object obj, com.amazon.aps.iva.fd.d dVar) {
        ImageView imageView;
        imageView = this.zza.zzb;
        imageView.setImageDrawable((Drawable) obj);
    }
}

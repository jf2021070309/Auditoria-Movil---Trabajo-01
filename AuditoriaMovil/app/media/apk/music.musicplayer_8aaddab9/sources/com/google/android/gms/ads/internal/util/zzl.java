package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import b.a.a.a;
import c.d.a.e;
import c.i.d.a;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzglo;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzl implements zzbkh {
    public final /* synthetic */ zzbkj zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzl(zzs zzsVar, zzbkj zzbkjVar, Context context, Uri uri) {
        this.zza = zzbkjVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    public final void zza() {
        a.AbstractBinderC0004a abstractBinderC0004a;
        e zzc = this.zza.zzc();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (zzc != null) {
            intent.setPackage(zzc.f1609c.getPackageName());
        }
        Bundle bundle = new Bundle();
        if (zzc == null) {
            abstractBinderC0004a = null;
        } else {
            abstractBinderC0004a = (a.AbstractBinderC0004a) zzc.f1608b;
            Objects.requireNonNull(abstractBinderC0004a);
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", abstractBinderC0004a);
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.setPackage(zzglo.zza(this.zzb));
        Context context = this.zzb;
        intent.setData(this.zzc);
        Object obj = c.i.d.a.a;
        a.C0034a.b(context, intent, null);
        this.zza.zzb((Activity) this.zzb);
    }
}

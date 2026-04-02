package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.q0;
import com.amazon.aps.iva.f8.r0;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzbf extends zzal {
    private static final Logger zza = new Logger("MediaRouterProxy");
    private final f0 zzb;
    private final CastOptions zzc;
    private final Map zzd = new HashMap();
    private zzbn zze;
    private boolean zzf;

    public zzbf(Context context, f0 f0Var, final CastOptions castOptions, com.google.android.gms.cast.internal.zzn zznVar) {
        this.zzb = f0Var;
        this.zzc = castOptions;
        if (Build.VERSION.SDK_INT <= 32) {
            zza.i("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        zza.d("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.zze = new zzbn(castOptions);
        Intent intent = new Intent(context, r0.class);
        intent.setPackage(context.getPackageName());
        boolean z = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.zzf = z;
        if (z) {
            zzo.zzd(zzml.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.cast.zzbc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzbf.this.zzp(castOptions, task);
            }
        });
    }

    private final void zzt(e0 e0Var, int i) {
        Set<f0.a> set = (Set) this.zzd.get(e0Var);
        if (set != null) {
            for (f0.a aVar : set) {
                this.zzb.a(e0Var, aVar, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu */
    public final void zzq(e0 e0Var) {
        Set<f0.a> set = (Set) this.zzd.get(e0Var);
        if (set != null) {
            for (f0.a aVar : set) {
                this.zzb.i(aVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final Bundle zzb(String str) {
        this.zzb.getClass();
        for (f0.h hVar : f0.f()) {
            if (hVar.c.equals(str)) {
                return hVar.r;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final String zzc() {
        this.zzb.getClass();
        return f0.g().c;
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzd(Bundle bundle, final int i) {
        final e0 b = e0.b(bundle);
        if (b == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzt(b, i);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    zzbf.this.zzo(b, i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zze(Bundle bundle, zzao zzaoVar) {
        e0 b = e0.b(bundle);
        if (b == null) {
            return;
        }
        if (!this.zzd.containsKey(b)) {
            this.zzd.put(b, new HashSet());
        }
        ((Set) this.zzd.get(b)).add(new zzat(zzaoVar));
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzf() {
        for (Set<f0.a> set : this.zzd.values()) {
            for (f0.a aVar : set) {
                this.zzb.i(aVar);
            }
        }
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzg(Bundle bundle) {
        final e0 b = e0.b(bundle);
        if (b == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzq(b);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    zzbf.this.zzq(b);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzh() {
        this.zzb.getClass();
        f0.b();
        f0.h hVar = f0.c().r;
        if (hVar != null) {
            f0.j(hVar);
            return;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzi(String str) {
        zza.d("select route with routeId = %s", str);
        this.zzb.getClass();
        for (f0.h hVar : f0.f()) {
            if (hVar.c.equals(str)) {
                zza.d("media route is found and selected", new Object[0]);
                this.zzb.getClass();
                f0.j(hVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzj(int i) {
        this.zzb.getClass();
        f0.l(i);
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzk() {
        f0.h hVar;
        this.zzb.getClass();
        f0.b();
        f0.d c = f0.c();
        if (c == null) {
            hVar = null;
        } else {
            hVar = c.s;
        }
        if (hVar != null) {
            this.zzb.getClass();
            if (f0.g().c.equals(hVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzl() {
        this.zzb.getClass();
        f0.b();
        f0.h hVar = f0.c().r;
        if (hVar != null) {
            this.zzb.getClass();
            if (f0.g().c.equals(hVar.c)) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzm(Bundle bundle, int i) {
        boolean z;
        e0 b = e0.b(bundle);
        if (b == null) {
            return false;
        }
        this.zzb.getClass();
        f0.b();
        f0.d c = f0.c();
        c.getClass();
        if (b.d()) {
            return false;
        }
        if ((i & 2) != 0 || !c.o) {
            q0 q0Var = c.q;
            if (q0Var != null && q0Var.c && c.g()) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<f0.h> arrayList = c.h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                f0.h hVar = arrayList.get(i2);
                if (((i & 1) != 0 && hVar.f()) || ((z && !hVar.f() && hVar.d() != c.f) || !hVar.j(b))) {
                }
            }
            return false;
        }
        return true;
    }

    public final zzbn zzn() {
        return this.zze;
    }

    public final /* synthetic */ void zzo(e0 e0Var, int i) {
        synchronized (this.zzd) {
            zzt(e0Var, i);
        }
    }

    public final void zzp(CastOptions castOptions, Task task) {
        boolean z;
        CastOptions castOptions2;
        boolean z2;
        String str;
        boolean z3 = false;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z2 = true;
            } else {
                z2 = false;
            }
            Logger logger = zza;
            Object[] objArr = new Object[1];
            if (true != z2) {
                str = "not existed";
            } else {
                str = "existed";
            }
            objArr[0] = str;
            logger.d("The module-to-client output switcher flag %s", objArr);
            if (z2) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Logger logger2 = zza;
                logger2.i("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions.zzh()));
                if (z && castOptions.zzh()) {
                    z3 = true;
                }
                if (this.zzb == null && (castOptions2 = this.zzc) != null) {
                    boolean zzf = castOptions2.zzf();
                    boolean zze = castOptions2.zze();
                    q0.a aVar = new q0.a();
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        aVar.b = z3;
                    }
                    if (i >= 30) {
                        aVar.d = zzf;
                    }
                    if (i >= 30) {
                        aVar.c = zze;
                    }
                    f0.k(new q0(aVar));
                    logger2.i("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(this.zzf), Boolean.valueOf(z3), Boolean.valueOf(zzf), Boolean.valueOf(zze));
                    if (zzf) {
                        f0 f0Var = this.zzb;
                        zzbb zzbbVar = new zzbb((zzbn) Preconditions.checkNotNull(this.zze));
                        f0Var.getClass();
                        f0.b();
                        f0.c().B = zzbbVar;
                        zzo.zzd(zzml.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        Logger logger22 = zza;
        logger22.i("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions.zzh()));
        if (z) {
            z3 = true;
        }
        if (this.zzb == null) {
        }
    }

    public final void zzr(MediaSessionCompat mediaSessionCompat) {
        f0.d.C0244d c0244d;
        this.zzb.getClass();
        f0.b();
        f0.d c = f0.c();
        c.E = mediaSessionCompat;
        if (mediaSessionCompat != null) {
            c0244d = new f0.d.C0244d(mediaSessionCompat);
        } else {
            c0244d = null;
        }
        f0.d.C0244d c0244d2 = c.D;
        if (c0244d2 != null) {
            c0244d2.a();
        }
        c.D = c0244d;
        if (c0244d != null) {
            c.n();
        }
    }

    public final boolean zzs() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbvd extends zzbvf {
    private static final zzbxr zzb = new zzbxr();
    private Map<Class<? extends NetworkExtras>, NetworkExtras> zza;

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final zzbvj zzb(String str) throws RemoteException {
        zzbvj zzbwkVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvd.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    MediationAdapter mediationAdapter = (MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    return new zzbwk(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.zza.get(mediationAdapter.getAdditionalParametersType()));
                } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwf((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } else {
                    if (Adapter.class.isAssignableFrom(cls)) {
                        return new zzbwf((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                    sb.append("Could not instantiate mediation adapter: ");
                    sb.append(str);
                    sb.append(" (not a valid adapter).");
                    zzcgt.zzi(sb.toString());
                    throw new RemoteException();
                }
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                zzcgt.zzj(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzcgt.zzd("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbwkVar = new zzbwf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzbwkVar = new zzbwf(new AdUrlAdapter());
            } else if (!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    CustomEventAdapter customEventAdapter = new CustomEventAdapter();
                    zzbwkVar = new zzbwk(customEventAdapter, (CustomEventExtras) this.zza.get(customEventAdapter.getAdditionalParametersType()));
                }
                throw new RemoteException();
            } else {
                zzbwkVar = new zzbwf(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
            }
            return zzbwkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzc(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            zzcgt.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            zzcgt.zzi(sb.toString());
            return false;
        }
    }

    public final void zze(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final zzbxn zzf(String str) throws RemoteException {
        return new zzbxy((RtbAdapter) Class.forName(str, false, zzbxr.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }
}

package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.c.b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzlf {
    private static final Logger zza = Logger.getLogger(zzlf.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzki());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzlf() {
    }

    @Deprecated
    public static zzju zza(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap concurrentMap = zze;
            Locale locale = Locale.US;
            zzju zzjuVar = (zzju) concurrentMap.get(str.toLowerCase(locale));
            if (zzjuVar == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                                if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase(locale).startsWith("tink")) {
                                        format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                                    }
                                } else {
                                    format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                                }
                            } else {
                                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                            }
                        } else {
                            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                        }
                    } else {
                        format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                    }
                } else {
                    format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return zzjuVar;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzkb zzb(String str) throws GeneralSecurityException {
        return ((zzki) zzb.get()).zzb(str);
    }

    public static synchronized zzvo zzc(zzvt zzvtVar) throws GeneralSecurityException {
        zzvo zza2;
        synchronized (zzlf.class) {
            zzkb zzb2 = zzb(zzvtVar.zzf());
            if (((Boolean) zzd.get(zzvtVar.zzf())).booleanValue()) {
                zza2 = zzb2.zza(zzvtVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzvtVar.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzaef zzd(zzvt zzvtVar) throws GeneralSecurityException {
        zzaef zzb2;
        synchronized (zzlf.class) {
            zzkb zzb3 = zzb(zzvtVar.zzf());
            if (((Boolean) zzd.get(zzvtVar.zzf())).booleanValue()) {
                zzb2 = zzb3.zzb(zzvtVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzvtVar.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzlc zzlcVar = (zzlc) zzf.get(cls);
        if (zzlcVar == null) {
            return null;
        }
        return zzlcVar.zza();
    }

    public static Object zzf(zzvo zzvoVar, Class cls) throws GeneralSecurityException {
        return zzg(zzvoVar.zzg(), zzvoVar.zzf(), cls);
    }

    public static Object zzg(String str, zzaby zzabyVar, Class cls) throws GeneralSecurityException {
        return ((zzki) zzb.get()).zza(str, cls).zzd(zzabyVar);
    }

    public static Object zzh(String str, zzaef zzaefVar, Class cls) throws GeneralSecurityException {
        return ((zzki) zzb.get()).zza(str, cls).zze(zzaefVar);
    }

    public static Object zzi(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzg(str, zzaby.zzn(bArr), cls);
    }

    public static Object zzj(zzlb zzlbVar, Class cls) throws GeneralSecurityException {
        zzlc zzlcVar = (zzlc) zzf.get(cls);
        if (zzlcVar != null) {
            if (zzlcVar.zza().equals(zzlbVar.zzc())) {
                return zzlcVar.zzc(zzlbVar);
            }
            throw new GeneralSecurityException(b.a("Wrong input primitive class, expected ", zzlcVar.zza().toString(), ", got ", zzlbVar.zzc().toString()));
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(zzlbVar.zzc().getName()));
    }

    public static synchronized Map zzk() {
        Map unmodifiableMap;
        synchronized (zzlf.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzl(zzpr zzprVar, zzpa zzpaVar, boolean z) throws GeneralSecurityException {
        synchronized (zzlf.class) {
            AtomicReference atomicReference = zzb;
            zzki zzkiVar = new zzki((zzki) atomicReference.get());
            zzkiVar.zzc(zzprVar, zzpaVar);
            String zzd2 = zzprVar.zzd();
            String zzd3 = zzpaVar.zzd();
            zzp(zzd2, zzprVar.zza().zzc(), true);
            zzp(zzd3, Collections.emptyMap(), false);
            if (!((zzki) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzle(zzprVar));
                zzq(zzprVar.zzd(), zzprVar.zza().zzc());
            }
            ConcurrentMap concurrentMap = zzd;
            concurrentMap.put(zzd2, Boolean.TRUE);
            concurrentMap.put(zzd3, Boolean.FALSE);
            atomicReference.set(zzkiVar);
        }
    }

    public static synchronized void zzm(zzkb zzkbVar, boolean z) throws GeneralSecurityException {
        synchronized (zzlf.class) {
            try {
                if (zzkbVar != null) {
                    AtomicReference atomicReference = zzb;
                    zzki zzkiVar = new zzki((zzki) atomicReference.get());
                    zzkiVar.zzd(zzkbVar);
                    if (zzna.zza(1)) {
                        String zzf2 = zzkbVar.zzf();
                        zzp(zzf2, Collections.emptyMap(), z);
                        zzd.put(zzf2, Boolean.valueOf(z));
                        atomicReference.set(zzkiVar);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zzn(zzpa zzpaVar, boolean z) throws GeneralSecurityException {
        synchronized (zzlf.class) {
            AtomicReference atomicReference = zzb;
            zzki zzkiVar = new zzki((zzki) atomicReference.get());
            zzkiVar.zze(zzpaVar);
            String zzd2 = zzpaVar.zzd();
            zzp(zzd2, zzpaVar.zza().zzc(), true);
            if (!((zzki) atomicReference.get()).zzf(zzd2)) {
                zzc.put(zzd2, new zzle(zzpaVar));
                zzq(zzd2, zzpaVar.zza().zzc());
            }
            zzd.put(zzd2, Boolean.TRUE);
            atomicReference.set(zzkiVar);
        }
    }

    public static synchronized void zzo(zzlc zzlcVar) throws GeneralSecurityException {
        synchronized (zzlf.class) {
            if (zzlcVar != null) {
                Class zzb2 = zzlcVar.zzb();
                ConcurrentMap concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzlc zzlcVar2 = (zzlc) concurrentMap.get(zzb2);
                    if (!zzlcVar.getClass().getName().equals(zzlcVar2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzlcVar2.getClass().getName(), zzlcVar.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb2, zzlcVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static synchronized void zzp(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzlf.class) {
            if (z) {
                ConcurrentMap concurrentMap = zzd;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((zzki) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.pal.zzaef, java.lang.Object] */
    private static void zzq(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzkk.zzd(str, ((zzoy) entry.getValue()).zza.zzas(), ((zzoy) entry.getValue()).zzb));
        }
    }
}

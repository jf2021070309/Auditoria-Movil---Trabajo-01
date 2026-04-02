package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class zzfum {
    private static final Logger zza = Logger.getLogger(zzfum.class.getName());
    private static final ConcurrentMap<String, zzful> zzb = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzfuk> zzc = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzfth<?>> zze = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzfue<?, ?>> zzf = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzftp> zzg = new ConcurrentHashMap();

    private zzfum() {
    }

    @Deprecated
    public static zzfth<?> zza(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap<String, zzfth<?>> concurrentMap = zze;
            Locale locale = Locale.US;
            zzfth<?> zzfthVar = concurrentMap.get(str.toLowerCase(locale));
            if (zzfthVar == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
                } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                    format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                    format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                    format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                    format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                } else if (str.toLowerCase(locale).startsWith("tink")) {
                    format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return zzfthVar;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static synchronized <P> void zzb(zzftm<P> zzftmVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfum.class) {
            if (zzftmVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String zzd2 = zzftmVar.zzd();
            zzp(zzd2, zzftmVar.getClass(), Collections.emptyMap(), z);
            zzb.putIfAbsent(zzd2, new zzfuh(zzftmVar));
            zzd.put(zzd2, Boolean.valueOf(z));
        }
    }

    public static synchronized <KeyProtoT extends zzghi> void zzc(zzftu<KeyProtoT> zzftuVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfum.class) {
            String zzb2 = zzftuVar.zzb();
            zzp(zzb2, zzftuVar.getClass(), zzftuVar.zzh().zze(), true);
            if (!zzfvw.zza(zzftuVar.zzj())) {
                String valueOf = String.valueOf(zzftuVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
            ConcurrentMap<String, zzful> concurrentMap = zzb;
            if (!concurrentMap.containsKey(zzb2)) {
                concurrentMap.put(zzb2, new zzfui(zzftuVar));
                zzc.put(zzb2, new zzfuk(zzftuVar));
                zzq(zzb2, zzftuVar.zzh().zze());
            }
            zzd.put(zzb2, Boolean.TRUE);
        }
    }

    public static synchronized <KeyProtoT extends zzghi, PublicKeyProtoT extends zzghi> void zzd(zzfug<KeyProtoT, PublicKeyProtoT> zzfugVar, zzftu<PublicKeyProtoT> zzftuVar, boolean z) throws GeneralSecurityException {
        Class<?> zze2;
        synchronized (zzfum.class) {
            zzp("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzfugVar.getClass(), zzfugVar.zzh().zze(), true);
            zzp("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzftuVar.getClass(), Collections.emptyMap(), false);
            if (!zzfvw.zza(1)) {
                String valueOf = String.valueOf(zzfugVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            } else if (!zzfvw.zza(1)) {
                String valueOf2 = String.valueOf(zzftuVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 61);
                sb2.append("failed to register key manager ");
                sb2.append(valueOf2);
                sb2.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb2.toString());
            } else {
                ConcurrentMap<String, zzful> concurrentMap = zzb;
                if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (zze2 = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze()) != null && !zze2.getName().equals(zzftuVar.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzfugVar.getClass().getName(), zze2.getName(), zzftuVar.getClass().getName()));
                }
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze() == null) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfuj(zzfugVar, zzftuVar));
                    zzc.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfuk(zzfugVar));
                    zzq("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzfugVar.zzh().zze());
                }
                ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zzfui(zzftuVar));
                }
                concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            }
        }
    }

    public static synchronized <B, P> void zze(zzfue<B, P> zzfueVar) throws GeneralSecurityException {
        synchronized (zzfum.class) {
            if (zzfueVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> zzb2 = zzfueVar.zzb();
            ConcurrentMap<Class<?>, zzfue<?, ?>> concurrentMap = zzf;
            if (concurrentMap.containsKey(zzb2)) {
                zzfue<?, ?> zzfueVar2 = concurrentMap.get(zzb2);
                if (!zzfueVar.getClass().getName().equals(zzfueVar2.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzfueVar2.getClass().getName(), zzfueVar.getClass().getName()));
                }
            }
            concurrentMap.put(zzb2, zzfueVar);
        }
    }

    public static zzftm<?> zzf(String str) throws GeneralSecurityException {
        return zzo(str).zzb();
    }

    public static synchronized zzgar zzg(zzgau zzgauVar) throws GeneralSecurityException {
        zzgar zzf2;
        synchronized (zzfum.class) {
            zzftm<?> zzf3 = zzf(zzgauVar.zza());
            if (!zzd.get(zzgauVar.zza()).booleanValue()) {
                String valueOf = String.valueOf(zzgauVar.zza());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            zzf2 = zzf3.zzf(zzgauVar.zzc());
        }
        return zzf2;
    }

    public static synchronized zzghi zzh(zzgau zzgauVar) throws GeneralSecurityException {
        zzghi zzc2;
        synchronized (zzfum.class) {
            zzftm<?> zzf2 = zzf(zzgauVar.zza());
            if (!zzd.get(zzgauVar.zza()).booleanValue()) {
                String valueOf = String.valueOf(zzgauVar.zza());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            zzc2 = zzf2.zzc(zzgauVar.zzc());
        }
        return zzc2;
    }

    public static <P> P zzi(String str, zzghi zzghiVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzr(str, cls).zzb(zzghiVar);
    }

    public static <P> P zzj(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zzs(str, zzgex.zzt(bArr), cls);
    }

    public static <P> P zzk(zzgar zzgarVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzs(zzgarVar.zza(), zzgarVar.zzc(), cls);
    }

    public static <B, P> P zzl(zzfud<B> zzfudVar, Class<P> cls) throws GeneralSecurityException {
        zzfue<?, ?> zzfueVar = zzf.get(cls);
        if (zzfueVar == null) {
            String name = zzfudVar.zze().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        } else if (zzfueVar.zzc().equals(zzfudVar.zze())) {
            return (P) zzfueVar.zza(zzfudVar);
        } else {
            String obj = zzfueVar.zzc().toString();
            String obj2 = zzfudVar.zze().toString();
            throw new GeneralSecurityException(a.t(new StringBuilder(obj2.length() + obj.length() + 44), "Wrong input primitive class, expected ", obj, ", got ", obj2));
        }
    }

    public static synchronized Map<String, zzftp> zzm() {
        Map<String, zzftp> unmodifiableMap;
        synchronized (zzfum.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static Class<?> zzn(Class<?> cls) {
        zzfue<?, ?> zzfueVar = zzf.get(cls);
        if (zzfueVar == null) {
            return null;
        }
        return zzfueVar.zzc();
    }

    private static synchronized zzful zzo(String str) throws GeneralSecurityException {
        zzful zzfulVar;
        synchronized (zzfum.class) {
            ConcurrentMap<String, zzful> concurrentMap = zzb;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzfulVar = concurrentMap.get(str);
        }
        return zzfulVar;
    }

    private static synchronized <KeyProtoT extends zzghi, KeyFormatProtoT extends zzghi> void zzp(String str, Class cls, Map<String, zzftr<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        synchronized (zzfum.class) {
            ConcurrentMap<String, zzful> concurrentMap = zzb;
            zzful zzfulVar = concurrentMap.get(str);
            if (zzfulVar != null && !zzfulVar.zzc().equals(cls)) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzfulVar.zzc().getName(), cls.getName()));
            } else if (z) {
                ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
                if (concurrentMap2.containsKey(str) && !concurrentMap2.get(str).booleanValue()) {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                } else if (concurrentMap.containsKey(str)) {
                    for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            String key = entry.getKey();
                            StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 79 + str.length());
                            sb.append("Attempted to register a new key template ");
                            sb.append(key);
                            sb.append(" from an existing key manager of type ");
                            sb.append(str);
                            throw new GeneralSecurityException(sb.toString());
                        }
                    }
                } else {
                    for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            String valueOf = String.valueOf(entry2.getKey());
                            throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                        }
                    }
                }
            }
        }
    }

    private static <KeyFormatProtoT extends zzghi> void zzq(String str, Map<String, zzftr<KeyFormatProtoT>> map) {
        for (Map.Entry<String, zzftr<KeyFormatProtoT>> entry : map.entrySet()) {
            zzg.put(entry.getKey(), zzftp.zzc(str, entry.getValue().zza.zzao(), entry.getValue().zzb));
        }
    }

    private static <P> zzftm<P> zzr(String str, Class<P> cls) throws GeneralSecurityException {
        zzful zzo = zzo(str);
        if (zzo.zzd().contains(cls)) {
            return zzo.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzo.zzc());
        Set<Class<?>> zzd2 = zzo.zzd();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzd2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(sb2.length() + name.length() + 77 + valueOf.length());
        a.M(sb3, "Primitive type ", name, " not supported by key manager of type ", valueOf);
        throw new GeneralSecurityException(a.r(sb3, ", supported primitives: ", sb2));
    }

    private static <P> P zzs(String str, zzgex zzgexVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzr(str, cls).zza(zzgexVar);
    }
}

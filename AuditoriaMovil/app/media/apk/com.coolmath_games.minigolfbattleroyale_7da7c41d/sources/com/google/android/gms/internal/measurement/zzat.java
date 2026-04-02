package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzat implements Iterable<zzap>, zzap {
    private final String zza;

    public zzat(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzap> iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(Typography.quote);
        sb.append(str);
        sb.append(Typography.quote);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbK(String str, zzg zzgVar, List<zzap> list) {
        String str2;
        Object obj;
        String str3;
        String str4;
        char c;
        zzat zzatVar;
        int i;
        zzap zzahVar;
        double doubleValue;
        Matcher matcher;
        double min;
        double min2;
        zzat zzatVar2;
        int i2;
        int i3;
        zzg zzgVar2;
        int i4;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                obj = "charAt";
                str3 = "hasOwnProperty";
                if (str.equals(str3)) {
                    str4 = "toString";
                    c = 2;
                    break;
                }
                c = 65535;
                str4 = "toString";
                break;
            case -1776922004:
                obj = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1464939364:
                obj = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1361633751:
                obj = "charAt";
                if (str.equals(obj)) {
                    str3 = "hasOwnProperty";
                    c = 0;
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    c = 1;
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c = 11;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c = 16;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 3;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            default:
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
                break;
        }
        String str5 = AdError.UNDEFINED_DOMAIN;
        String str6 = obj;
        switch (c) {
            case 0:
                zzh.zzc(str6, 1, list);
                int zzi = list.size() > 0 ? (int) zzh.zzi(zzgVar.zza(list.get(0)).zzd().doubleValue()) : 0;
                String str7 = this.zza;
                if (zzi < 0 || zzi >= str7.length()) {
                    return zzap.zzm;
                }
                return new zzat(String.valueOf(str7.charAt(zzi)));
            case 1:
                zzatVar = this;
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder(zzatVar.zza);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        sb.append(zzgVar.zza(list.get(i5)).zzc());
                    }
                    return new zzat(sb.toString());
                }
                return zzatVar;
            case 2:
                zzh.zza(str3, 1, list);
                String str8 = this.zza;
                zzap zza = zzgVar.zza(list.get(0));
                if ("length".equals(zza.zzc())) {
                    return zzaf.zzk;
                }
                double doubleValue2 = zza.zzd().doubleValue();
                return (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str8.length()) ? zzaf.zzl : zzaf.zzk;
            case 3:
                zzh.zzc("indexOf", 2, list);
                String str9 = this.zza;
                if (list.size() > 0) {
                    str5 = zzgVar.zza(list.get(0)).zzc();
                }
                zzahVar = new zzah(Double.valueOf(str9.indexOf(str5, (int) zzh.zzi(list.size() < 2 ? 0.0d : zzgVar.zza(list.get(1)).zzd().doubleValue()))));
                return zzahVar;
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str10 = this.zza;
                if (list.size() > 0) {
                    str5 = zzgVar.zza(list.get(0)).zzc();
                }
                String str11 = str5;
                return new zzah(Double.valueOf(str10.lastIndexOf(str11, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza(list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(doubleValue)))));
            case 5:
                zzh.zzc("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() > 0 ? zzgVar.zza(list.get(0)).zzc() : "").matcher(this.zza);
                return matcher2.find() ? new zzae(Arrays.asList(new zzat(matcher2.group()))) : zzap.zzg;
            case 6:
                zzatVar = this;
                zzh.zzc("replace", 2, list);
                zzap zzapVar = zzap.zzf;
                if (list.size() > 0) {
                    str5 = zzgVar.zza(list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzapVar = zzgVar.zza(list.get(1));
                    }
                }
                String str12 = str5;
                String str13 = zzatVar.zza;
                int indexOf = str13.indexOf(str12);
                if (indexOf >= 0) {
                    if (zzapVar instanceof zzai) {
                        zzapVar = ((zzai) zzapVar).zza(zzgVar, Arrays.asList(new zzat(str12), new zzah(Double.valueOf(indexOf)), zzatVar));
                    }
                    String substring = str13.substring(0, indexOf);
                    String zzc = zzapVar.zzc();
                    String substring2 = str13.substring(indexOf + str12.length());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(zzc).length() + String.valueOf(substring2).length());
                    sb2.append(substring);
                    sb2.append(zzc);
                    sb2.append(substring2);
                    zzahVar = new zzat(sb2.toString());
                    return zzahVar;
                }
                return zzatVar;
            case 7:
                zzh.zzc("search", 1, list);
                if (list.size() > 0) {
                    str5 = zzgVar.zza(list.get(0)).zzc();
                }
                if (Pattern.compile(str5).matcher(this.zza).find()) {
                    return new zzah(Double.valueOf(matcher.start()));
                }
                return new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzc("slice", 2, list);
                String str14 = this.zza;
                double zzi2 = zzh.zzi(list.size() > 0 ? zzgVar.zza(list.get(0)).zzd().doubleValue() : 0.0d);
                if (zzi2 < 0.0d) {
                    min = Math.max(str14.length() + zzi2, 0.0d);
                } else {
                    min = Math.min(zzi2, str14.length());
                }
                int i6 = (int) min;
                double zzi3 = zzh.zzi(list.size() > 1 ? zzgVar.zza(list.get(1)).zzd().doubleValue() : str14.length());
                if (zzi3 < 0.0d) {
                    min2 = Math.max(str14.length() + zzi3, 0.0d);
                } else {
                    min2 = Math.min(zzi3, str14.length());
                }
                zzatVar2 = new zzat(str14.substring(i6, Math.max(0, ((int) min2) - i6) + i6));
                return zzatVar2;
            case '\t':
                zzh.zzc("split", 2, list);
                String str15 = this.zza;
                if (str15.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String zzc2 = zzgVar.zza(list.get(0)).zzc();
                    long zzh = list.size() > 1 ? zzh.zzh(zzgVar.zza(list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (zzh == 0) {
                        return new zzae();
                    }
                    String[] split = str15.split(Pattern.quote(zzc2), ((int) zzh) + 1);
                    int length2 = split.length;
                    if (!zzc2.equals("") || length2 <= 0) {
                        i2 = length2;
                        i3 = 0;
                    } else {
                        boolean equals = split[0].equals("");
                        i2 = length2 - 1;
                        if (!split[i2].equals("")) {
                            i2 = length2;
                        }
                        i3 = equals;
                    }
                    if (length2 > zzh) {
                        i2--;
                    }
                    for (int i7 = i3; i7 < i2; i7++) {
                        arrayList.add(new zzat(split[i7]));
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzc("substring", 2, list);
                String str16 = this.zza;
                if (list.size() > 0) {
                    zzgVar2 = zzgVar;
                    i4 = (int) zzh.zzi(zzgVar2.zza(list.get(0)).zzd().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    i4 = 0;
                }
                if (list.size() > 1) {
                    length = (int) zzh.zzi(zzgVar2.zza(list.get(1)).zzd().doubleValue());
                } else {
                    length = str16.length();
                }
                int min3 = Math.min(Math.max(i4, 0), str16.length());
                int min4 = Math.min(Math.max(length, 0), str16.length());
                zzatVar2 = new zzat(str16.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return zzatVar2;
            case 11:
                zzh.zza(str2, 0, list);
                return new zzat(this.zza.toUpperCase());
            case '\f':
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case '\r':
                zzh.zza("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzatVar = this;
                zzh.zza(str4, 0, list);
                return zzatVar;
            case 15:
                zzh.zza("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzd() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator<zzap> zzf() {
        return new zzar(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzt() {
        return new zzat(this.zza);
    }
}

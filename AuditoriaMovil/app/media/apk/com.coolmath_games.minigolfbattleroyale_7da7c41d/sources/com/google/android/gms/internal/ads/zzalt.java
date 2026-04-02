package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.CharCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzalt {
    private static final ArrayList<zzalr> zza = new ArrayList<>();
    private static final Pattern zzb = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzi(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzi(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzc(String str, String str2) {
        char c;
        zzals zzh;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                if (str2 == null || (zzh = zzh(str2)) == null) {
                    return false;
                }
                int i = zzh.zzb;
                char c2 = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : CharCompanionObject.MIN_VALUE : (char) 16 : '\f' : (char) 11 : '\n';
                return (c2 == 0 || c2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String zzd(String str) {
        zzals zzh;
        String zza2 = zzflf.zza(str.trim());
        if (zza2.startsWith("avc1") || zza2.startsWith("avc3")) {
            return "video/avc";
        }
        if (zza2.startsWith("hev1") || zza2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (zza2.startsWith("dvav") || zza2.startsWith("dva1") || zza2.startsWith("dvhe") || zza2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (zza2.startsWith("av01")) {
            return "video/av01";
        }
        if (zza2.startsWith("vp9") || zza2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (zza2.startsWith("vp8") || zza2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String str2 = null;
        if (zza2.startsWith("mp4a")) {
            if (zza2.startsWith("mp4a.") && (zzh = zzh(zza2)) != null) {
                str2 = zze(zzh.zza);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (zza2.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (zza2.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (zza2.startsWith("ac-3") || zza2.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (zza2.startsWith("ec-3") || zza2.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (zza2.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (zza2.startsWith("ac-4") || zza2.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (zza2.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (zza2.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (zza2.startsWith("dtsh") || zza2.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (zza2.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd";
            }
            if (zza2.startsWith("opus")) {
                return "audio/opus";
            }
            if (zza2.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (zza2.startsWith("flac")) {
                return "audio/flac";
            }
            if (zza2.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (zza2.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (zza2.contains("cea708")) {
                return "application/cea-708";
            }
            if (zza2.contains("eia608") || zza2.contains("cea608")) {
                return "application/cea-608";
            }
            int size = zza.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                zzalr zzalrVar = zza.get(i);
                String str3 = zzalrVar.zzb;
                if (zza2.startsWith(null)) {
                    String str4 = zzalrVar.zza;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    public static String zze(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzi(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zza.size();
        for (int i = 0; i < size; i++) {
            zzalr zzalrVar = zza.get(i);
            String str2 = zzalrVar.zza;
            if (str.equals(null)) {
                int i2 = zzalrVar.zzc;
                return 0;
            }
        }
        return -1;
    }

    public static String zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 2;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    static zzals zzh(String str) {
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group != null) {
                String group2 = matcher.group(2);
                try {
                    return new zzals(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            throw null;
        }
        return null;
    }

    private static String zzi(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}

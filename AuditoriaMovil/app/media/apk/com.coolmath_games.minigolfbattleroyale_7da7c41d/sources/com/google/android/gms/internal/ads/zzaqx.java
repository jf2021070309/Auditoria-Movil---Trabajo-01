package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.mediationsdk.IronSourceSegment;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaqx {
    private static final int zza = zzave.zzl("nam");
    private static final int zzb = zzave.zzl("trk");
    private static final int zzc = zzave.zzl("cmt");
    private static final int zzd = zzave.zzl("day");
    private static final int zze = zzave.zzl("ART");
    private static final int zzf = zzave.zzl("too");
    private static final int zzg = zzave.zzl("alb");
    private static final int zzh = zzave.zzl("com");
    private static final int zzi = zzave.zzl("wrt");
    private static final int zzj = zzave.zzl("lyr");
    private static final int zzk = zzave.zzl(IronSourceSegment.GENDER);
    private static final int zzl = zzave.zzl("covr");
    private static final int zzm = zzave.zzl("gnre");
    private static final int zzn = zzave.zzl("grp");
    private static final int zzo = zzave.zzl("disk");
    private static final int zzp = zzave.zzl("trkn");
    private static final int zzq = zzave.zzl("tmpo");
    private static final int zzr = zzave.zzl("cpil");
    private static final int zzs = zzave.zzl("aART");
    private static final int zzt = zzave.zzl("sonm");
    private static final int zzu = zzave.zzl("soal");
    private static final int zzv = zzave.zzl("soar");
    private static final int zzw = zzave.zzl("soaa");
    private static final int zzx = zzave.zzl("soco");
    private static final int zzy = zzave.zzl("rtng");
    private static final int zzz = zzave.zzl("pgap");
    private static final int zzA = zzave.zzl("sosn");
    private static final int zzB = zzave.zzl("tvsh");
    private static final int zzC = zzave.zzl("----");
    private static final String[] zzD = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0037, B:14:0x003e, B:17:0x0047, B:19:0x004b, B:22:0x0055, B:24:0x0059, B:27:0x0063, B:29:0x0069, B:32:0x0073, B:34:0x0077, B:37:0x0081, B:39:0x0086, B:41:0x0092, B:48:0x00ac, B:49:0x00c3, B:50:0x00d5, B:53:0x00de, B:55:0x00e2, B:58:0x00ec, B:60:0x00f0, B:63:0x00fa, B:65:0x00fe, B:68:0x0108, B:70:0x010c, B:73:0x0116, B:75:0x011a, B:78:0x0124, B:80:0x0128, B:83:0x0132, B:85:0x0136, B:88:0x0140, B:90:0x0144, B:93:0x014e, B:95:0x0152, B:98:0x015c, B:100:0x0160, B:103:0x016a, B:106:0x0172, B:108:0x0178, B:110:0x018b, B:111:0x0192, B:113:0x0196, B:114:0x019d, B:120:0x01a6, B:121:0x01ac, B:123:0x01b4, B:127:0x01bf, B:190:0x028f, B:192:0x029b, B:194:0x02a5, B:193:0x02a0, B:133:0x01dd, B:135:0x01e1, B:137:0x01ed, B:138:0x01fe, B:140:0x020a, B:142:0x0214, B:141:0x020f, B:145:0x021b, B:147:0x021f, B:150:0x0225, B:152:0x0229, B:155:0x022f, B:157:0x0233, B:160:0x023d, B:162:0x0241, B:165:0x024b, B:167:0x024f, B:170:0x0259, B:172:0x025d, B:175:0x0267, B:177:0x026b, B:180:0x0275, B:182:0x0279, B:185:0x0281, B:187:0x0285, B:197:0x02ac, B:200:0x02b6), top: B:205:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #0 {all -> 0x01d6, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0037, B:14:0x003e, B:17:0x0047, B:19:0x004b, B:22:0x0055, B:24:0x0059, B:27:0x0063, B:29:0x0069, B:32:0x0073, B:34:0x0077, B:37:0x0081, B:39:0x0086, B:41:0x0092, B:48:0x00ac, B:49:0x00c3, B:50:0x00d5, B:53:0x00de, B:55:0x00e2, B:58:0x00ec, B:60:0x00f0, B:63:0x00fa, B:65:0x00fe, B:68:0x0108, B:70:0x010c, B:73:0x0116, B:75:0x011a, B:78:0x0124, B:80:0x0128, B:83:0x0132, B:85:0x0136, B:88:0x0140, B:90:0x0144, B:93:0x014e, B:95:0x0152, B:98:0x015c, B:100:0x0160, B:103:0x016a, B:106:0x0172, B:108:0x0178, B:110:0x018b, B:111:0x0192, B:113:0x0196, B:114:0x019d, B:120:0x01a6, B:121:0x01ac, B:123:0x01b4, B:127:0x01bf, B:190:0x028f, B:192:0x029b, B:194:0x02a5, B:193:0x02a0, B:133:0x01dd, B:135:0x01e1, B:137:0x01ed, B:138:0x01fe, B:140:0x020a, B:142:0x0214, B:141:0x020f, B:145:0x021b, B:147:0x021f, B:150:0x0225, B:152:0x0229, B:155:0x022f, B:157:0x0233, B:160:0x023d, B:162:0x0241, B:165:0x024b, B:167:0x024f, B:170:0x0259, B:172:0x025d, B:175:0x0267, B:177:0x026b, B:180:0x0275, B:182:0x0279, B:185:0x0281, B:187:0x0285, B:197:0x02ac, B:200:0x02b6), top: B:205:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzart zza(com.google.android.gms.internal.ads.zzaux r13) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.zza(com.google.android.gms.internal.ads.zzaux):com.google.android.gms.internal.ads.zzart");
    }

    private static zzasc zzb(int i, String str, zzaux zzauxVar) {
        int zzr2 = zzauxVar.zzr();
        if (zzauxVar.zzr() == zzaqk.zzaH) {
            zzauxVar.zzj(8);
            return new zzasc(str, null, zzauxVar.zzw(zzr2 - 16));
        }
        String zzg2 = zzaqk.zzg(i);
        Log.w("MetadataUtil", zzg2.length() != 0 ? "Failed to parse text attribute: ".concat(zzg2) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzasa zzc(int i, String str, zzaux zzauxVar, boolean z, boolean z2) {
        int zze2 = zze(zzauxVar);
        if (z2) {
            zze2 = Math.min(1, zze2);
        }
        if (zze2 >= 0) {
            if (z) {
                return new zzasc(str, null, Integer.toString(zze2));
            }
            return new zzary("und", str, Integer.toString(zze2));
        }
        String zzg2 = zzaqk.zzg(i);
        Log.w("MetadataUtil", zzg2.length() != 0 ? "Failed to parse uint8 attribute: ".concat(zzg2) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzasc zzd(int i, String str, zzaux zzauxVar) {
        int zzr2 = zzauxVar.zzr();
        if (zzauxVar.zzr() == zzaqk.zzaH && zzr2 >= 22) {
            zzauxVar.zzj(10);
            int zzm2 = zzauxVar.zzm();
            if (zzm2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(zzm2);
                String sb2 = sb.toString();
                int zzm3 = zzauxVar.zzm();
                if (zzm3 > 0) {
                    StringBuilder sb3 = new StringBuilder(sb2.length() + 12);
                    sb3.append(sb2);
                    sb3.append("/");
                    sb3.append(zzm3);
                    sb2 = sb3.toString();
                }
                return new zzasc(str, null, sb2);
            }
        }
        String zzg2 = zzaqk.zzg(i);
        Log.w("MetadataUtil", zzg2.length() != 0 ? "Failed to parse index/count attribute: ".concat(zzg2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzaux zzauxVar) {
        zzauxVar.zzj(4);
        if (zzauxVar.zzr() == zzaqk.zzaH) {
            zzauxVar.zzj(8);
            return zzauxVar.zzl();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
public final class zzpy {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzpu zza(String str) throws IOException {
        long j2;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzamr.zzb(newPullParser, "x:xmpmeta")) {
                zzfoj<zzpt> zzi = zzfoj.zzi();
                long j3 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzamr.zzb(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 4; i3++) {
                            String zzc2 = zzamr.zzc(newPullParser, strArr[i3]);
                            if (zzc2 != null) {
                                if (Integer.parseInt(zzc2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = zzb;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= 4) {
                                            break;
                                        }
                                        String zzc3 = zzamr.zzc(newPullParser, strArr2[i4]);
                                        if (zzc3 != null) {
                                            j2 = Long.parseLong(zzc3);
                                            if (j2 == -1) {
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                    j2 = -9223372036854775807L;
                                    String[] strArr3 = zzc;
                                    while (true) {
                                        if (i2 >= 2) {
                                            zzi = zzfoj.zzi();
                                            break;
                                        }
                                        String zzc4 = zzamr.zzc(newPullParser, strArr3[i2]);
                                        if (zzc4 != null) {
                                            zzi = zzfoj.zzk(new zzpt("image/jpeg", "Primary", 0L, 0L), new zzpt("video/mp4", "MotionPhoto", Long.parseLong(zzc4), 0L));
                                            break;
                                        }
                                        i2++;
                                    }
                                    j3 = j2;
                                }
                            }
                        }
                        return null;
                    } else if (zzamr.zzb(newPullParser, "Container:Directory")) {
                        zzi = zzb(newPullParser, "Container", "Item");
                    } else if (zzamr.zzb(newPullParser, "GContainer:Directory")) {
                        zzi = zzb(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!zzamr.zza(newPullParser, "x:xmpmeta"));
                if (zzi.isEmpty()) {
                    return null;
                }
                return new zzpu(j3, zzi);
            }
            throw zzaha.zzb("Couldn't find xmp metadata", null);
        } catch (zzaha | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfoj<zzpt> zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfog zzu = zzfoj.zzu();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (zzamr.zzb(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String zzc2 = zzamr.zzc(xmlPullParser, concat3);
                String zzc3 = zzamr.zzc(xmlPullParser, concat4);
                String zzc4 = zzamr.zzc(xmlPullParser, concat5);
                String zzc5 = zzamr.zzc(xmlPullParser, concat6);
                if (zzc2 == null || zzc3 == null) {
                    return zzfoj.zzi();
                }
                zzu.zze((zzfog) new zzpt(zzc2, zzc3, zzc4 != null ? Long.parseLong(zzc4) : 0L, zzc5 != null ? Long.parseLong(zzc5) : 0L));
            }
        } while (!zzamr.zza(xmlPullParser, concat2));
        return zzu.zzf();
    }
}

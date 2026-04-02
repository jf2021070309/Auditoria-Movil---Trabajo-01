package com.google.android.gms.internal.auth;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes.dex */
public final class zzgn {
    public static String zza(zzeb zzebVar) {
        StringBuilder sb = new StringBuilder(zzebVar.zzd());
        for (int i2 = 0; i2 < zzebVar.zzd(); i2++) {
            byte zza = zzebVar.zza(i2);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb.append(CoreConstants.ESCAPE_CHAR);
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zza);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

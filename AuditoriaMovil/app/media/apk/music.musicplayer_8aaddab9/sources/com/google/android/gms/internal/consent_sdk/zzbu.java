package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzbu {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 1;
    public static final int zze = 2;
    public static final int zzf = 3;
    public static final int zzg = 1;
    public static final int zzh = 2;
    public static final int zzi = 3;
    public static final int zzj = 4;
    public static final int zzk = 5;
    public static final int zzl = 6;
    public static final int zzm = 7;
    public static final int zzn = 8;
    private static final /* synthetic */ int[] zzo = {1, 2, 3};
    private static final /* synthetic */ int[] zzp = {1, 2, 3};
    private static final /* synthetic */ int[] zzq = {1, 2, 3, 4, 5, 6, 7, 8};

    public static int zza(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        nextString.hashCode();
        char c2 = 65535;
        switch (nextString.hashCode()) {
            case 64208429:
                if (nextString.equals("CLEAR")) {
                    c2 = 0;
                    break;
                }
                break;
            case 82862015:
                if (nextString.equals("WRITE")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1856333582:
                if (nextString.equals("UNKNOWN_ACTION_TYPE")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return zzf;
            case 1:
                return zze;
            case 2:
                return zzd;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
        }
    }

    public static void zza(int i2, JsonWriter jsonWriter) throws IOException {
        if (i2 == 0) {
            throw null;
        }
        int i3 = zzbq.zza[i2 - 1];
        if (i3 == 1) {
            jsonWriter.value("UNKNOWN");
        } else if (i3 == 2) {
            jsonWriter.value("ANDROID");
        } else if (i3 != 3) {
        } else {
            jsonWriter.value("IOS");
        }
    }

    public static int[] zza() {
        return (int[]) zzo.clone();
    }

    public static int zzb(JsonReader jsonReader) throws IOException {
        String nextString = jsonReader.nextString();
        nextString.hashCode();
        char c2 = 65535;
        switch (nextString.hashCode()) {
            case -2058725357:
                if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1969035850:
                if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1263695752:
                if (nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                    c2 = 2;
                    break;
                }
                break;
            case -954325659:
                if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    c2 = 3;
                    break;
                }
                break;
            case -918677260:
                if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                    c2 = 4;
                    break;
                }
                break;
            case 429411856:
                if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    c2 = 5;
                    break;
                }
                break;
            case 467888915:
                if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1725474845:
                if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return zzk;
            case 1:
                return zzm;
            case 2:
                return zzg;
            case 3:
                return zzi;
            case 4:
                return zzn;
            case 5:
                return zzj;
            case 6:
                return zzh;
            case 7:
                return zzl;
            default:
                throw new IOException(nextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
        }
    }

    public static int[] zzb() {
        return (int[]) zzp.clone();
    }

    public static int[] zzc() {
        return (int[]) zzq.clone();
    }
}

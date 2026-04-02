package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeea implements zzbzk {
    private static zzfgk zzb(String str) {
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str)) {
            return zzfgk.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfgk.JAVASCRIPT;
        }
        return zzfgk.NONE;
    }

    private static zzfgj zzj(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return zzfgj.ONE_PIXEL;
                }
                return zzfgj.UNSPECIFIED;
            }
            return zzfgj.DEFINED_BY_JAVASCRIPT;
        }
        return zzfgj.BEGIN_TO_RENDER;
    }

    private static zzfgh zzk(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfgh.VIDEO;
            }
            return zzfgh.NATIVE_DISPLAY;
        }
        return zzfgh.HTML_DISPLAY;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final boolean zza(Context context) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("Omid flag is disabled");
            return false;
        } else if (zzfga.zzb()) {
            return true;
        } else {
            zzfga.zza(context);
            return zzfga.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final String zzc(Context context) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zzd(String str, WebView webView, String str2, String str3, String str4, zzbzm zzbzmVar, zzbzl zzbzlVar, String str5) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            zzfgl zza = zzfgl.zza("Google", str);
            zzfgk zzb = zzb("javascript");
            zzfgh zzk = zzk(zzbzlVar.toString());
            if (zzb == zzfgk.NONE) {
                com.google.android.gms.ads.internal.util.zze.zzi("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzk == null) {
                String valueOf = String.valueOf(zzbzlVar);
                String.valueOf(valueOf).length();
                com.google.android.gms.ads.internal.util.zze.zzi("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(valueOf)));
                return null;
            } else {
                zzfgk zzb2 = zzb(str4);
                if (zzk != zzfgh.VIDEO || zzb2 != zzfgk.NONE) {
                    return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzk, zzj(zzbzmVar.toString()), zzb, zzb2, true), zzfge.zza(zza, webView, str5, "")));
                }
                String valueOf2 = String.valueOf(str4);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final IObjectWrapper zze(String str, WebView webView, String str2, String str3, String str4, String str5, zzbzm zzbzmVar, zzbzl zzbzlVar, String str6) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            zzfgl zza = zzfgl.zza(str5, str);
            zzfgk zzb = zzb("javascript");
            zzfgk zzb2 = zzb(str4);
            zzfgh zzk = zzk(zzbzlVar.toString());
            if (zzb == zzfgk.NONE) {
                com.google.android.gms.ads.internal.util.zze.zzi("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzk == null) {
                String valueOf = String.valueOf(zzbzlVar);
                String.valueOf(valueOf).length();
                com.google.android.gms.ads.internal.util.zze.zzi("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(valueOf)));
                return null;
            } else if (zzk != zzfgh.VIDEO || zzb2 != zzfgk.NONE) {
                return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzk, zzj(zzbzmVar.toString()), zzb, zzb2, true), zzfge.zzb(zza, webView, str6, "")));
            } else {
                String valueOf2 = String.valueOf(str4);
                com.google.android.gms.ads.internal.util.zze.zzi(valueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfgc) {
                ((zzfgc) unwrap).zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzg(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfgc) {
                ((zzfgc) unwrap).zzc();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzh(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfgc) {
                ((zzfgc) unwrap).zzb(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzk
    public final void zzi(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdu)).booleanValue() && zzfga.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfgc) {
                ((zzfgc) unwrap).zzd(view, zzfgi.NOT_VISIBLE, "Ad overlay");
            }
        }
    }
}

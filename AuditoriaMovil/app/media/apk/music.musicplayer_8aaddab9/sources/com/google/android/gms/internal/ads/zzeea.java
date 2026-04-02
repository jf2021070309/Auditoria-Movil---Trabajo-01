package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzeea implements zzbzk {
    private static zzfgk zzb(String str) {
        return "native".equals(str) ? zzfgk.NATIVE : "javascript".equals(str) ? zzfgk.JAVASCRIPT : zzfgk.NONE;
    }

    private static zzfgj zzj(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        return c2 != 0 ? c2 != 1 ? c2 != 2 ? zzfgj.UNSPECIFIED : zzfgj.ONE_PIXEL : zzfgj.DEFINED_BY_JAVASCRIPT : zzfgj.BEGIN_TO_RENDER;
    }

    private static zzfgh zzk(String str) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c2 = 1;
            }
            c2 = 65535;
        } else {
            if (str.equals("video")) {
                c2 = 2;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
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
            zzcgt.zzi("Omid flag is disabled");
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
            zzfgk zzfgkVar = zzfgk.NONE;
            if (zzb == zzfgkVar) {
                zzcgt.zzi("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzk == null) {
                String valueOf = String.valueOf(zzbzlVar);
                valueOf.length();
                zzcgt.zzi("Omid html session error; Unable to parse creative type: ".concat(valueOf));
                return null;
            } else {
                zzfgk zzb2 = zzb(str4);
                if (zzk != zzfgh.VIDEO || zzb2 != zzfgkVar) {
                    return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzk, zzj(zzbzmVar.toString()), zzb, zzb2, true), zzfge.zza(zza, webView, str5, "")));
                }
                String valueOf2 = String.valueOf(str4);
                zzcgt.zzi(valueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
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
            zzfgk zzfgkVar = zzfgk.NONE;
            if (zzb == zzfgkVar) {
                zzcgt.zzi("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzk == null) {
                String valueOf = String.valueOf(zzbzlVar);
                valueOf.length();
                zzcgt.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf));
                return null;
            } else if (zzk != zzfgh.VIDEO || zzb2 != zzfgkVar) {
                return ObjectWrapper.wrap(zzfgc.zze(zzfgd.zza(zzk, zzj(zzbzmVar.toString()), zzb, zzb2, true), zzfge.zzb(zza, webView, str6, "")));
            } else {
                String valueOf2 = String.valueOf(str4);
                zzcgt.zzi(valueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
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

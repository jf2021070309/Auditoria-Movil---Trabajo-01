package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzbyj extends zzbyp {
    public static final Set<String> zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcml zzk;
    private final Activity zzl;
    private zzcob zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbyq zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbyj(zzcml zzcmlVar, zzbyq zzbyqVar) {
        super(zzcmlVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcmlVar;
        this.zzl = zzcmlVar.zzj();
        this.zzp = zzbyqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025b A[Catch: all -> 0x0487, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:127:0x025b, B:128:0x0260, B:130:0x0262, B:132:0x0282, B:134:0x0286, B:136:0x0293, B:138:0x02cf, B:170:0x0389, B:177:0x03b8, B:178:0x03d0, B:179:0x03f1, B:181:0x03f9, B:182:0x0400, B:183:0x0427, B:186:0x042a, B:188:0x043a, B:190:0x0444, B:192:0x0454, B:193:0x0469, B:189:0x043f, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a5, B:175:0x03ab, B:176:0x03b2, B:137:0x02cc, B:195:0x046b, B:196:0x0470, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:100:0x01e9, B:102:0x01ee, B:104:0x01f1, B:106:0x01f5, B:109:0x01fb, B:91:0x0199, B:95:0x01b9, B:93:0x01a6, B:94:0x01b2, B:97:0x01c2, B:98:0x01d6, B:99:0x01e2, B:110:0x020c, B:116:0x0236, B:122:0x0246, B:119:0x023c, B:121:0x0244, B:113:0x022e, B:115:0x0234, B:123:0x024d, B:124:0x0253, B:198:0x0472, B:199:0x0477, B:201:0x0479, B:202:0x047e, B:204:0x0480, B:205:0x0485), top: B:210:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0262 A[Catch: all -> 0x0487, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:127:0x025b, B:128:0x0260, B:130:0x0262, B:132:0x0282, B:134:0x0286, B:136:0x0293, B:138:0x02cf, B:170:0x0389, B:177:0x03b8, B:178:0x03d0, B:179:0x03f1, B:181:0x03f9, B:182:0x0400, B:183:0x0427, B:186:0x042a, B:188:0x043a, B:190:0x0444, B:192:0x0454, B:193:0x0469, B:189:0x043f, B:171:0x0390, B:172:0x0397, B:173:0x039e, B:174:0x03a5, B:175:0x03ab, B:176:0x03b2, B:137:0x02cc, B:195:0x046b, B:196:0x0470, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:100:0x01e9, B:102:0x01ee, B:104:0x01f1, B:106:0x01f5, B:109:0x01fb, B:91:0x0199, B:95:0x01b9, B:93:0x01a6, B:94:0x01b2, B:97:0x01c2, B:98:0x01d6, B:99:0x01e2, B:110:0x020c, B:116:0x0236, B:122:0x0246, B:119:0x023c, B:121:0x0244, B:113:0x022e, B:115:0x0234, B:123:0x024d, B:124:0x0253, B:198:0x0472, B:199:0x0477, B:201:0x0479, B:202:0x047e, B:204:0x0480, B:205:0x0485), top: B:210:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyj.zza(java.util.Map):void");
    }

    public final void zzb(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzaf(this.zzm);
                }
                if (z) {
                    zzj("default");
                    zzbyq zzbyqVar = this.zzp;
                    if (zzbyqVar != null) {
                        zzbyqVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    public final void zzc(int i2, int i3, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i2;
            this.zze = i3;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }

    public final void zze(int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }
}

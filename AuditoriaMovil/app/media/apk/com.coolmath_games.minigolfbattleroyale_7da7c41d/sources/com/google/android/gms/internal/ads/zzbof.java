package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbof extends UnifiedNativeAd {
    private final zzboe zza;
    private final zzbmi zzc;
    private final NativeAd.AdChoicesInfo zze;
    private final List<NativeAd.Image> zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List<MuteThisAdReason> zzf = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(3:2|3|(2:5|(6:8|(4:13|(1:15)(1:22)|(3:17|18|19)(1:21)|20)|23|(0)(0)|20|6)))|(3:25|26|(2:28|(5:31|(1:33)(1:40)|(3:35|36|37)(1:39)|38|29)))|42|43|(7:45|46|47|48|(2:50|51)|53|54)|59|46|47|48|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
        com.google.android.gms.internal.ads.zzcgt.zzg("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[Catch: RemoteException -> 0x00bc, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00bc, blocks: (B:45:0x00a7, B:47:0x00af), top: B:55:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbof(com.google.android.gms.internal.ads.zzboe r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzf = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzf()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbmh     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            com.google.android.gms.internal.ads.zzbmh r3 = (com.google.android.gms.internal.ads.zzbmh) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            com.google.android.gms.internal.ads.zzbmf r3 = new com.google.android.gms.internal.ads.zzbmf     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzb     // Catch: android.os.RemoteException -> L5b
            com.google.android.gms.internal.ads.zzbmi r4 = new com.google.android.gms.internal.ads.zzbmi     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgt.zzg(r0, r6)
        L5f:
            com.google.android.gms.internal.ads.zzboe r6 = r5.zza     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.zzz()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.internal.ads.zzbgm r2 = com.google.android.gms.internal.ads.zzbgl.zzb(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.zzf     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.internal.ads.zzbgn r4 = new com.google.android.gms.internal.ads.zzbgn     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgt.zzg(r0, r6)
        L92:
            com.google.android.gms.internal.ads.zzboe r6 = r5.zza     // Catch: android.os.RemoteException -> La0
            com.google.android.gms.internal.ads.zzbmh r6 = r6.zzh()     // Catch: android.os.RemoteException -> La0
            if (r6 == 0) goto La4
            com.google.android.gms.internal.ads.zzbmi r2 = new com.google.android.gms.internal.ads.zzbmi     // Catch: android.os.RemoteException -> La0
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La0
            goto La5
        La0:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgt.zzg(r0, r6)
        La4:
            r2 = r1
        La5:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzboe r6 = r5.zza     // Catch: android.os.RemoteException -> Lbc
            com.google.android.gms.internal.ads.zzblz r6 = r6.zzq()     // Catch: android.os.RemoteException -> Lbc
            if (r6 == 0) goto Lc0
            com.google.android.gms.internal.ads.zzbma r6 = new com.google.android.gms.internal.ads.zzbma     // Catch: android.os.RemoteException -> Lbc
            com.google.android.gms.internal.ads.zzboe r2 = r5.zza     // Catch: android.os.RemoteException -> Lbc
            com.google.android.gms.internal.ads.zzblz r2 = r2.zzq()     // Catch: android.os.RemoteException -> Lbc
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lbc
            r1 = r6
            goto Lc0
        Lbc:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzcgt.zzg(r0, r6)
        Lc0:
            r5.zze = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbof.<init>(com.google.android.gms.internal.ads.zzboe):void");
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (RemoteException e) {
            zzcgt.zzg("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzw = this.zza.zzw();
            if (zzw != null) {
                return zzw;
            }
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzF() != null) {
                return new zzbhw(this.zza.zzF());
            }
            return null;
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzbgz zzbgzVar;
        try {
            zzbgzVar = this.zza.zzH();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            zzbgzVar = null;
        }
        return ResponseInfo.zzb(zzbgzVar);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double zzk = this.zza.zzk();
            if (zzk == -1.0d) {
                return null;
            }
            return Double.valueOf(zzk);
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzn() != null) {
                this.zzd.zza(this.zza.zzn());
            }
        } catch (RemoteException e) {
            zzcgt.zzg("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (muteThisAdReason instanceof zzbgn) {
                        this.zza.zzB(((zzbgn) muteThisAdReason).zza());
                        return;
                    } else {
                        zzcgt.zzf("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                zzcgt.zzg("", e);
            }
            zzcgt.zzf("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzC(new zzbgj(muteThisAdListener));
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzI(new zzbil(onPaidEventListener));
        } catch (RemoteException e) {
            zzcgt.zzg("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzx(new zzbop(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzcgt.zzg("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            IObjectWrapper zzv = this.zza.zzv();
            if (zzv != null) {
                return ObjectWrapper.unwrap(zzv);
            }
            return null;
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
            return null;
        }
    }
}

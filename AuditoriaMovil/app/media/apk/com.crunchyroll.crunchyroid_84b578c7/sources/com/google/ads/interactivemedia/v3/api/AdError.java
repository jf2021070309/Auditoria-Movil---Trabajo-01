package com.google.ads.interactivemedia.v3.api;

import com.amazon.aps.iva.n4.a;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.annotation.KeepForSdk;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class AdError extends Exception {
    private final AdErrorCode zza;
    private final AdErrorType zzb;

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN),
        VAST_LOAD_TIMEOUT(MediaError.DetailedErrorCode.SEGMENT_NETWORK),
        VAST_TOO_MANY_REDIRECTS(302),
        VIDEO_PLAY_ERROR(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN),
        OVERLAY_AD_LOADING_FAILED(502),
        VAST_NONLINEAR_ASSET_MISMATCH(503),
        COMPANION_AD_LOADING_FAILED(603),
        UNKNOWN_ERROR(MediaError.DetailedErrorCode.APP),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(WebSocketProtocol.CLOSE_NO_STATUS_CODE),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206),
        ADS_PLAYER_NOT_PROVIDED(1207);
        
        private final int zzb;

        AdErrorCode(int i) {
            this.zzb = i;
        }

        public static AdErrorCode getErrorCodeByNumber(int i) {
            AdErrorCode[] values;
            for (AdErrorCode adErrorCode : values()) {
                if (adErrorCode.getErrorNumber() == i) {
                    return adErrorCode;
                }
            }
            if (i == 1204) {
                return INTERNAL_ERROR;
            }
            return UNKNOWN_ERROR;
        }

        public int getErrorNumber() {
            return this.zzb;
        }

        @Override // java.lang.Enum
        public String toString() {
            String name = name();
            int i = this.zzb;
            return "AdErrorCode [name: " + name + ", number: " + i + "]";
        }
    }

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public enum AdErrorType {
        LOAD,
        PLAY
    }

    public AdError(AdErrorType adErrorType, int i, String str) {
        this(adErrorType, AdErrorCode.getErrorCodeByNumber(i), str);
    }

    public AdErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeNumber() {
        return this.zza.getErrorNumber();
    }

    public AdErrorType getErrorType() {
        return this.zzb;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    @KeepForSdk
    public String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zza);
        return b.c(a.b("AdError [errorType: ", valueOf, ", errorCode: ", valueOf2, ", message: "), getMessage(), "]");
    }

    public AdError(AdErrorType adErrorType, AdErrorCode adErrorCode, String str) {
        super(str);
        this.zzb = adErrorType;
        this.zza = adErrorCode;
    }
}

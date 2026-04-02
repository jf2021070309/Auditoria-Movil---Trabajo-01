package androidx.media;

import android.util.Log;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f468b;

    /* renamed from: c  reason: collision with root package name */
    public int f469c;

    /* renamed from: d  reason: collision with root package name */
    public int f470d;

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {
        public int a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f471b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f472c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f473d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl.a a(int i2) {
            if (i2 != 10) {
                this.f473d = i2;
                int i3 = 2;
                switch (i2) {
                    case 0:
                        this.f471b = 1;
                        break;
                    case 1:
                        this.f471b = 4;
                        break;
                    case 2:
                        this.f471b = 4;
                        break;
                    case 3:
                        this.f471b = 2;
                        break;
                    case 4:
                        this.f471b = 4;
                        break;
                    case 5:
                        this.f471b = 4;
                        break;
                    case 6:
                        this.f471b = 1;
                        this.f472c |= 4;
                        break;
                    case 7:
                        this.f472c |= 1;
                        this.f471b = 4;
                        break;
                    case 8:
                        this.f471b = 4;
                        break;
                    case 9:
                        this.f471b = 4;
                        break;
                    case 10:
                        this.f471b = 1;
                        break;
                    default:
                        Log.e("AudioAttributesCompat", "Invalid stream type " + i2 + " for AudioAttributesCompat");
                        break;
                }
                switch (i2) {
                    case 0:
                    case 6:
                        break;
                    case 1:
                    case 7:
                        i3 = 13;
                        break;
                    case 2:
                        i3 = 6;
                        break;
                    case 3:
                        i3 = 1;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 5;
                        break;
                    case 8:
                        i3 = 3;
                        break;
                    case 9:
                    default:
                        i3 = 0;
                        break;
                    case 10:
                        i3 = 11;
                        break;
                }
                this.a = i3;
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f471b, this.f472c, this.a, this.f473d);
        }
    }

    public AudioAttributesImplBase() {
        this.a = 0;
        this.f468b = 0;
        this.f469c = 0;
        this.f470d = -1;
    }

    public AudioAttributesImplBase(int i2, int i3, int i4, int i5) {
        this.a = 0;
        this.f468b = 0;
        this.f469c = 0;
        this.f470d = -1;
        this.f468b = i2;
        this.f469c = i3;
        this.a = i4;
        this.f470d = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            if (this.f468b == audioAttributesImplBase.f468b) {
                int i2 = this.f469c;
                int i3 = audioAttributesImplBase.f469c;
                int i4 = audioAttributesImplBase.f470d;
                int i5 = 4;
                if (i4 == -1) {
                    int i6 = audioAttributesImplBase.a;
                    SparseIntArray sparseIntArray = AudioAttributesCompat.a;
                    if ((i3 & 1) != 1) {
                        if ((i3 & 4) != 4) {
                            switch (i6) {
                                case 2:
                                    i5 = 0;
                                    break;
                                case 3:
                                    i5 = 8;
                                    break;
                                case 4:
                                    break;
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    i5 = 5;
                                    break;
                                case 6:
                                    i5 = 2;
                                    break;
                                case 11:
                                    i5 = 10;
                                    break;
                                case 12:
                                default:
                                    i5 = 3;
                                    break;
                                case 13:
                                    i5 = 1;
                                    break;
                            }
                        } else {
                            i5 = 6;
                        }
                    } else {
                        i5 = 7;
                    }
                } else {
                    i5 = i4;
                }
                if (i5 == 6) {
                    i3 |= 4;
                } else if (i5 == 7) {
                    i3 |= 1;
                }
                return i2 == (i3 & 273) && this.a == audioAttributesImplBase.a && this.f470d == i4;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f468b), Integer.valueOf(this.f469c), Integer.valueOf(this.a), Integer.valueOf(this.f470d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f470d != -1) {
            sb.append(" stream=");
            sb.append(this.f470d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.a;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = e.a.d.a.a.e("unknown usage ", i2);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f468b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f469c).toUpperCase());
        return sb.toString();
    }
}

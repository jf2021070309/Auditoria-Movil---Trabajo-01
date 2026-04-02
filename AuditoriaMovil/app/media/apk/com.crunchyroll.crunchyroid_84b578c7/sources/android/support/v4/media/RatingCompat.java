package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int b;
    public final float c;
    public Object d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static float a(Rating rating) {
            return rating.getPercentRating();
        }

        public static int b(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float c(Rating rating) {
            return rating.getStarRating();
        }

        public static boolean d(Rating rating) {
            return rating.hasHeart();
        }

        public static boolean e(Rating rating) {
            return rating.isRated();
        }

        public static boolean f(Rating rating) {
            return rating.isThumbUp();
        }

        public static Rating g(boolean z) {
            return Rating.newHeartRating(z);
        }

        public static Rating h(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating i(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        public static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static Rating k(int i) {
            return Rating.newUnratedRating(i);
        }
    }

    public RatingCompat(int i, float f) {
        this.b = i;
        this.c = f;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b2 = b.b(rating);
            if (b.e(rating)) {
                float f = 1.0f;
                switch (b2) {
                    case 1:
                        if (!b.d(rating)) {
                            f = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        if (!b.f(rating)) {
                            f = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat2 = d(b.c(rating), b2);
                        break;
                    case 6:
                        float a2 = b.a(rating);
                        if (a2 >= 0.0f && a2 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, a2);
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat2 = e(b2);
            }
            ratingCompat2.d = obj;
        }
        return ratingCompat2;
    }

    public static RatingCompat d(float f, int i) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat e(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public final float b() {
        int i = this.b;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.c;
        }
        return -1.0f;
    }

    public final boolean c() {
        if (this.c >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.b);
        sb.append(" rating=");
        float f = this.c;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
    }
}

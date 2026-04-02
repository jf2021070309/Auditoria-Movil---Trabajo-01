package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
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

        public static Rating h(float f2) {
            return Rating.newPercentageRating(f2);
        }

        public static Rating i(int i2, float f2) {
            return Rating.newStarRating(i2, f2);
        }

        public static Rating j(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static Rating k(int i2) {
            return Rating.newUnratedRating(i2);
        }
    }

    public RatingCompat(int i2, float f2) {
        this.a = i2;
        this.f14b = f2;
    }

    public static RatingCompat b(Object obj) {
        RatingCompat ratingCompat;
        float f2;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int b2 = b.b(rating);
            if (!b.e(rating)) {
                switch (b2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(b2, -1.0f);
                        break;
                }
            } else {
                switch (b2) {
                    case 1:
                        ratingCompat = new RatingCompat(1, b.d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, b.f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c2 = b.c(rating);
                        if (b2 == 3) {
                            f2 = 3.0f;
                        } else if (b2 == 4) {
                            f2 = 4.0f;
                        } else if (b2 != 5) {
                            Log.e("Rating", "Invalid rating style (" + b2 + ") for a star rating");
                            break;
                        } else {
                            f2 = 5.0f;
                        }
                        if (c2 >= 0.0f && c2 <= f2) {
                            ratingCompat2 = new RatingCompat(b2, c2);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                        break;
                    case 6:
                        float a2 = b.a(rating);
                        if (a2 >= 0.0f && a2 <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, a2);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                    default:
                        return null;
                }
            }
            ratingCompat2.f15c = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.a;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Rating:style=");
        y.append(this.a);
        y.append(" rating=");
        float f2 = this.f14b;
        y.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return y.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.f14b);
    }
}

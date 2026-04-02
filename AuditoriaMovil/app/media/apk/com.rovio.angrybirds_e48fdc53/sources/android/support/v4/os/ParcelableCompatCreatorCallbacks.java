package android.support.v4.os;

import android.os.Parcel;
/* JADX WARN: Classes with same name are omitted:
  classes2.dex
 */
@Deprecated
/* loaded from: classes.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}

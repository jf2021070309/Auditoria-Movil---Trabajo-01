package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object getValueObject(String str) {
        return null;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        Iterator<FastJsonResponse.Field<?, ?>> it = getFieldMappings().values().iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                FastJsonResponse.Field<?, ?> next = it.next();
                if (isFieldSet(next)) {
                    i = getFieldValue(next).hashCode() + (i2 * 31);
                } else {
                    i = i2;
                }
            } else {
                return i2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().isInstance(obj)) {
            FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
            for (FastJsonResponse.Field<?, ?> field : getFieldMappings().values()) {
                if (isFieldSet(field)) {
                    if (fastJsonResponse.isFieldSet(field) && getFieldValue(field).equals(fastJsonResponse.getFieldValue(field))) {
                    }
                    return false;
                } else if (fastJsonResponse.isFieldSet(field)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

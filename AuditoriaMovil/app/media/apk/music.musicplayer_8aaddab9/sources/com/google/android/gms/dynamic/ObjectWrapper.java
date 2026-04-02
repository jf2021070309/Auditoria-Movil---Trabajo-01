package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import e.a.d.a.a;
import java.lang.reflect.Field;
@RetainForClient
@KeepForSdk
/* loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final T zza;

    private ObjectWrapper(T t) {
        this.zza = t;
    }

    @KeepForSdk
    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).zza;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 == 1) {
            Preconditions.checkNotNull(field);
            if (field.isAccessible()) {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            } catch (NullPointerException e3) {
                throw new IllegalArgumentException("Binder object is null.", e3);
            }
        }
        throw new IllegalArgumentException(a.R(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }

    @KeepForSdk
    public static <T> IObjectWrapper wrap(T t) {
        return new ObjectWrapper(t);
    }
}

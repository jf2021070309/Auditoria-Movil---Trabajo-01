package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    private static final Builder zalx = new zab(new String[0], null);
    private boolean mClosed;
    private final int zale;
    private final String[] zalp;
    private Bundle zalq;
    private final CursorWindow[] zalr;
    private final int zals;
    private final Bundle zalt;
    private int[] zalu;
    private int zalv;
    private boolean zalw;

    /* loaded from: classes2.dex */
    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.mClosed = false;
        this.zalw = true;
        this.zale = i;
        this.zalp = strArr;
        this.zalr = cursorWindowArr;
        this.zals = i2;
        this.zalt = bundle;
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private final String[] zalp;
        private final ArrayList<HashMap<String, Object>> zaly;
        private final String zalz;
        private final HashMap<Object, Integer> zama;
        private boolean zamb;
        private String zamc;

        private Builder(String[] strArr, String str) {
            this.zalp = (String[]) Preconditions.checkNotNull(strArr);
            this.zaly = new ArrayList<>();
            this.zalz = str;
            this.zama = new HashMap<>();
            this.zamb = false;
            this.zamc = null;
        }

        public Builder zaa(HashMap<String, Object> hashMap) {
            int intValue;
            Asserts.checkNotNull(hashMap);
            if (this.zalz == null) {
                intValue = -1;
            } else {
                Object obj = hashMap.get(this.zalz);
                if (obj == null) {
                    intValue = -1;
                } else {
                    Integer num = this.zama.get(obj);
                    if (num == null) {
                        this.zama.put(obj, Integer.valueOf(this.zaly.size()));
                        intValue = -1;
                    } else {
                        intValue = num.intValue();
                    }
                }
            }
            if (intValue == -1) {
                this.zaly.add(hashMap);
            } else {
                this.zaly.remove(intValue);
                this.zaly.add(intValue, hashMap);
            }
            this.zamb = false;
            return this;
        }

        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (zab) null);
        }

        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (zab) null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ Builder(String[] strArr, String str, zab zabVar) {
            this(strArr, null);
        }
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.zalw = true;
        this.zale = 1;
        this.zalp = (String[]) Preconditions.checkNotNull(strArr);
        this.zalr = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zals = i;
        this.zalt = bundle;
        zaca();
    }

    private DataHolder(CursorWrapper cursorWrapper, int i, Bundle bundle) {
        this(cursorWrapper.getColumnNames(), zaa(cursorWrapper), i, bundle);
    }

    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new CursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zalp, zaa(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.zalp, zaa(builder, -1), i, bundle);
    }

    public final void zaca() {
        this.zalq = new Bundle();
        for (int i = 0; i < this.zalp.length; i++) {
            this.zalq.putInt(this.zalp[i], i);
        }
        this.zalu = new int[this.zalr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.zalr.length; i3++) {
            this.zalu[i3] = i2;
            i2 += this.zalr[i3].getNumRows() - (i2 - this.zalr[i3].getStartPosition());
        }
        this.zalv = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zalp, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zalr, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zale);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final int getStatusCode() {
        return this.zals;
    }

    public final Bundle getMetadata() {
        return this.zalt;
    }

    private static CursorWindow[] zaa(CursorWrapper cursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            while (i < count) {
                if (!cursorWrapper.moveToPosition(i)) {
                    break;
                }
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i);
                    cursorWrapper.fillWindow(i, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i = window2.getNumRows() + window2.getStartPosition();
            }
            cursorWrapper.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    private static CursorWindow[] zaa(Builder builder, int i) {
        int i2;
        boolean z;
        CursorWindow cursorWindow;
        if (builder.zalp.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList subList = (i < 0 || i >= builder.zaly.size()) ? builder.zaly : builder.zaly.subList(0, i);
        int size = subList.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow2);
        cursorWindow2.setNumColumns(builder.zalp.length);
        int i3 = 0;
        boolean z2 = false;
        while (i3 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    Log.d("DataHolder", new StringBuilder(72).append("Allocating additional cursor window for large data set (row ").append(i3).append(")").toString());
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(builder.zalp.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) subList.get(i3);
                boolean z3 = true;
                for (int i4 = 0; i4 < builder.zalp.length && z3; i4++) {
                    String str = builder.zalp[i4];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z3 = cursorWindow2.putNull(i3, i4);
                    } else if (obj instanceof String) {
                        z3 = cursorWindow2.putString((String) obj, i3, i4);
                    } else if (obj instanceof Long) {
                        z3 = cursorWindow2.putLong(((Long) obj).longValue(), i3, i4);
                    } else if (obj instanceof Integer) {
                        z3 = cursorWindow2.putLong(((Integer) obj).intValue(), i3, i4);
                    } else if (obj instanceof Boolean) {
                        z3 = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i3, i4);
                    } else if (obj instanceof byte[]) {
                        z3 = cursorWindow2.putBlob((byte[]) obj, i3, i4);
                    } else if (obj instanceof Double) {
                        z3 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i3, i4);
                    } else if (obj instanceof Float) {
                        z3 = cursorWindow2.putDouble(((Float) obj).floatValue(), i3, i4);
                    } else {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    }
                }
                if (z3) {
                    i2 = i3;
                    z = false;
                    cursorWindow = cursorWindow2;
                } else if (z2) {
                    throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", new StringBuilder(74).append("Couldn't populate window data for row ").append(i3).append(" - allocating new window.").toString());
                    cursorWindow2.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i3);
                    cursorWindow3.setNumColumns(builder.zalp.length);
                    arrayList.add(cursorWindow3);
                    i2 = i3 - 1;
                    cursorWindow = cursorWindow3;
                    z = true;
                }
                z2 = z;
                cursorWindow2 = cursorWindow;
                i3 = i2 + 1;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList.get(i5)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    private final void zaa(String str, int i) {
        if (this.zalq == null || !this.zalq.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else {
            if (i < 0 || i >= this.zalv) {
                throw new CursorIndexOutOfBoundsException(i, this.zalv);
            }
        }
    }

    public final boolean hasColumn(String str) {
        return this.zalq.containsKey(str);
    }

    public final long getLong(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getLong(i, this.zalq.getInt(str));
    }

    public final int getInteger(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getInt(i, this.zalq.getInt(str));
    }

    public final String getString(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getString(i, this.zalq.getInt(str));
    }

    public final boolean getBoolean(String str, int i, int i2) {
        zaa(str, i);
        return Long.valueOf(this.zalr[i2].getLong(i, this.zalq.getInt(str))).longValue() == 1;
    }

    public final float zaa(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getFloat(i, this.zalq.getInt(str));
    }

    public final double zab(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getDouble(i, this.zalq.getInt(str));
    }

    public final byte[] getByteArray(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].getBlob(i, this.zalq.getInt(str));
    }

    public final void zaa(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zaa(str, i);
        this.zalr[i2].copyStringToBuffer(i, this.zalq.getInt(str), charArrayBuffer);
    }

    public final boolean hasNull(String str, int i, int i2) {
        zaa(str, i);
        return this.zalr[i2].isNull(i, this.zalq.getInt(str));
    }

    public final int getCount() {
        return this.zalv;
    }

    public final int getWindowIndex(int i) {
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zalv);
        while (true) {
            if (i2 >= this.zalu.length) {
                break;
            } else if (i < this.zalu[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == this.zalu.length) {
            return i2 - 1;
        }
        return i2;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (int i = 0; i < this.zalr.length; i++) {
                    this.zalr[i].close();
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.zalw && this.zalr.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", new StringBuilder(String.valueOf(obj).length() + 178).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(obj).append(")").toString());
            }
        } finally {
            super.finalize();
        }
    }

    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, null);
    }

    public static DataHolder empty(int i) {
        return new DataHolder(zalx, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, zab zabVar) {
        this(builder, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, zab zabVar) {
        this(builder, i, bundle, -1);
    }
}

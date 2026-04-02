package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);
    @SafeParcelable.VersionField(id = 1000)
    public final int zaa;
    public Bundle zab;
    public int[] zac;
    public int zad;
    public boolean zae;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Builder {
        private final String[] zaa;
        private final ArrayList<HashMap<String, Object>> zab = new ArrayList<>();
        private final HashMap<Object, Integer> zac = new HashMap<>();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @KeepForSdk
        public DataHolder build(int i2) {
            return new DataHolder(this, i2);
        }

        @KeepForSdk
        public DataHolder build(int i2, Bundle bundle) {
            return new DataHolder(this, i2, bundle);
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        public Builder zaa(HashMap<String, Object> hashMap) {
            Asserts.checkNotNull(hashMap);
            this.zab.add(hashMap);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i2;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i3;
        this.zaj = bundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataHolder(android.database.Cursor r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L2e
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L2e
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 >= r2) goto L63
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L63
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L44
            r6.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L44:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L76
        L4f:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L56
            goto L63
        L56:
            r1.add(r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r6
            goto L2f
        L63:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L76:
            r8 = move-exception
            r0.close()
            goto L7c
        L7b:
            throw r8
        L7c:
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    private DataHolder(Builder builder, int i2, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i2, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i2;
        this.zaj = bundle;
        zad();
    }

    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, null);
    }

    @KeepForSdk
    public static DataHolder empty(int i2) {
        return new DataHolder(zaf, i2, (Bundle) null);
    }

    private final void zae(String str, int i2) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else {
            if (i2 < 0 || i2 >= this.zad) {
                throw new CursorIndexOutOfBoundsException(i2, this.zad);
            }
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i2) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i3 = 0;
        boolean z = false;
        while (i3 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i3);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i3);
                int i4 = 0;
                boolean z2 = true;
                while (true) {
                    if (i4 < builder.zaa.length) {
                        if (!z2) {
                            break;
                        }
                        String str = builder.zaa[i4];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i3, i4);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i3, i4);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i3, i4);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong(((Integer) obj).intValue(), i3, i4);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i3, i4);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i3, i4);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i3, i4);
                        } else if (!(obj instanceof Float)) {
                            String obj2 = obj.toString();
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + obj2.length());
                            sb.append("Unsupported object for column ");
                            sb.append(str);
                            sb.append(": ");
                            sb.append(obj2);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            z2 = cursorWindow.putDouble(((Float) obj).floatValue(), i3, i4);
                        }
                        i4++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (z) {
                    throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                cursorWindow.freeLastRow();
                cursorWindow = new CursorWindow(false);
                cursorWindow.setStartPosition(i3);
                cursorWindow.setNumColumns(builder.zaa.length);
                arrayList2.add(cursorWindow);
                i3--;
                z = true;
                i3++;
            } catch (RuntimeException e2) {
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList2.get(i5)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.zae) {
                this.zae = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.zah;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String str, int i2, int i3) {
        zae(str, i2);
        return Long.valueOf(this.zah[i3].getLong(i2, this.zab.getInt(str))).longValue() == 1;
    }

    @KeepForSdk
    public byte[] getByteArray(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getBlob(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getInt(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getLong(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @KeepForSdk
    public String getString(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getString(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i2) {
        int length;
        int i3 = 0;
        Preconditions.checkState(i2 >= 0 && i2 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i3 >= length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == length ? i3 - 1 : i3;
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].isNull(i2, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zag, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i2, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i2 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getDouble(i2, this.zab.getInt(str));
    }

    public final float zab(String str, int i2, int i3) {
        zae(str, i2);
        return this.zah[i3].getFloat(i2, this.zab.getInt(str));
    }

    public final void zac(String str, int i2, int i3, CharArrayBuffer charArrayBuffer) {
        zae(str, i2);
        this.zah[i3].copyStringToBuffer(i2, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i3 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i3], i3);
            i3++;
        }
        this.zac = new int[this.zah.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i2 >= cursorWindowArr.length) {
                this.zad = i4;
                return;
            }
            this.zac[i2] = i4;
            i4 += this.zah[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
            i2++;
        }
    }
}

package com.google.android.gms.common.data;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zamd;
    private ArrayList<Integer> zame;

    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zamd = false;
    }

    protected abstract T getEntry(int i, int i2);

    protected abstract String getPrimaryDataMarkerColumn();

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final T get(int i) {
        int i2;
        zacb();
        int zah = zah(i);
        if (i < 0 || i == this.zame.size()) {
            i2 = 0;
        } else {
            if (i == this.zame.size() - 1) {
                i2 = this.mDataHolder.getCount() - this.zame.get(i).intValue();
            } else {
                i2 = this.zame.get(i + 1).intValue() - this.zame.get(i).intValue();
            }
            if (i2 == 1) {
                int zah2 = zah(i);
                int windowIndex = this.mDataHolder.getWindowIndex(zah2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn != null && this.mDataHolder.getString(childDataMarkerColumn, zah2, windowIndex) == null) {
                    i2 = 0;
                }
            }
        }
        return getEntry(zah, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zacb();
        return this.zame.size();
    }

    private final void zacb() {
        synchronized (this) {
            if (!this.zamd) {
                int count = this.mDataHolder.getCount();
                this.zame = new ArrayList<>();
                if (count > 0) {
                    this.zame.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    int i = 1;
                    while (i < count) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78).append("Missing value for markerColumn: ").append(primaryDataMarkerColumn).append(", at row: ").append(i).append(", for window: ").append(windowIndex).toString());
                        }
                        if (string2.equals(string)) {
                            string2 = string;
                        } else {
                            this.zame.add(Integer.valueOf(i));
                        }
                        i++;
                        string = string2;
                    }
                }
                this.zamd = true;
            }
        }
    }

    private final int zah(int i) {
        if (i < 0 || i >= this.zame.size()) {
            throw new IllegalArgumentException(new StringBuilder(53).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        }
        return this.zame.get(i).intValue();
    }

    protected String getChildDataMarkerColumn() {
        return null;
    }
}

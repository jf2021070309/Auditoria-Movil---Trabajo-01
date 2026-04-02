package com.amazon.aps.iva.u4;

import com.amazon.aps.iva.v4.y;
/* compiled from: LayoutProto.java */
/* loaded from: classes.dex */
public enum h implements y.a {
    UNKNOWN_TYPE(0),
    ROW(1),
    COLUMN(2),
    BOX(3),
    TEXT(4),
    LAZY_COLUMN(5),
    LIST_ITEM(6),
    CHECK_BOX(7),
    BUTTON(8),
    SPACER(9),
    SWITCH(10),
    ANDROID_REMOTE_VIEWS(11),
    REMOTE_VIEWS_ROOT(12),
    IMAGE(13),
    LINEAR_PROGRESS_INDICATOR(14),
    CIRCULAR_PROGRESS_INDICATOR(15),
    LAZY_VERTICAL_GRID(16),
    VERTICAL_GRID_ITEM(17),
    RADIO_GROUP(18),
    RADIO_BUTTON(19),
    RADIO_ROW(20),
    RADIO_COLUMN(21),
    UNRECOGNIZED(-1);
    
    public static final int ANDROID_REMOTE_VIEWS_VALUE = 11;
    public static final int BOX_VALUE = 3;
    public static final int BUTTON_VALUE = 8;
    public static final int CHECK_BOX_VALUE = 7;
    public static final int CIRCULAR_PROGRESS_INDICATOR_VALUE = 15;
    public static final int COLUMN_VALUE = 2;
    public static final int IMAGE_VALUE = 13;
    public static final int LAZY_COLUMN_VALUE = 5;
    public static final int LAZY_VERTICAL_GRID_VALUE = 16;
    public static final int LINEAR_PROGRESS_INDICATOR_VALUE = 14;
    public static final int LIST_ITEM_VALUE = 6;
    public static final int RADIO_BUTTON_VALUE = 19;
    public static final int RADIO_COLUMN_VALUE = 21;
    public static final int RADIO_GROUP_VALUE = 18;
    public static final int RADIO_ROW_VALUE = 20;
    public static final int REMOTE_VIEWS_ROOT_VALUE = 12;
    public static final int ROW_VALUE = 1;
    public static final int SPACER_VALUE = 9;
    public static final int SWITCH_VALUE = 10;
    public static final int TEXT_VALUE = 4;
    public static final int UNKNOWN_TYPE_VALUE = 0;
    public static final int VERTICAL_GRID_ITEM_VALUE = 17;
    private static final y.b<h> internalValueMap = new a();
    private final int value;

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public class a implements y.b<h> {
    }

    /* compiled from: LayoutProto.java */
    /* loaded from: classes.dex */
    public static final class b implements y.c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.v4.y.c
        public final boolean isInRange(int i) {
            if (h.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    h(int i) {
        this.value = i;
    }

    public static h forNumber(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return ROW;
            case 2:
                return COLUMN;
            case 3:
                return BOX;
            case 4:
                return TEXT;
            case 5:
                return LAZY_COLUMN;
            case 6:
                return LIST_ITEM;
            case 7:
                return CHECK_BOX;
            case 8:
                return BUTTON;
            case 9:
                return SPACER;
            case 10:
                return SWITCH;
            case 11:
                return ANDROID_REMOTE_VIEWS;
            case 12:
                return REMOTE_VIEWS_ROOT;
            case 13:
                return IMAGE;
            case 14:
                return LINEAR_PROGRESS_INDICATOR;
            case 15:
                return CIRCULAR_PROGRESS_INDICATOR;
            case 16:
                return LAZY_VERTICAL_GRID;
            case 17:
                return VERTICAL_GRID_ITEM;
            case 18:
                return RADIO_GROUP;
            case 19:
                return RADIO_BUTTON;
            case 20:
                return RADIO_ROW;
            case 21:
                return RADIO_COLUMN;
            default:
                return null;
        }
    }

    public static y.b<h> internalGetValueMap() {
        return internalValueMap;
    }

    public static y.c internalGetVerifier() {
        return b.a;
    }

    @Override // com.amazon.aps.iva.v4.y.a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h valueOf(int i) {
        return forNumber(i);
    }
}

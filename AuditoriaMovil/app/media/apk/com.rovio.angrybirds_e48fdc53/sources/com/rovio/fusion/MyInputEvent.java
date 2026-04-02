package com.rovio.fusion;
/* loaded from: classes2.dex */
public class MyInputEvent {
    public static final int EVENT_AXIS = 2;
    public static final int EVENT_HOVER = 3;
    public static final int EVENT_KEY = 0;
    public static final int EVENT_TOUCH = 1;
    public int m_axis;
    public int m_event;
    public int m_eventClass = 3;
    public int m_index;
    public int m_keyCode;
    public int m_unicodeChar;
    public float m_value;
    public float m_x;
    public float m_y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MyInputEvent(int i, int i2, int i3, int i4) {
        this.m_event = i;
        this.m_keyCode = i2;
        this.m_unicodeChar = i3;
        this.m_index = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MyInputEvent(int i, float f, float f2, int i2) {
        this.m_event = i;
        this.m_x = f;
        this.m_y = f2;
        this.m_index = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MyInputEvent(int i, float f, float f2) {
        this.m_event = i;
        this.m_x = f;
        this.m_y = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MyInputEvent(int i, float f, int i2) {
        this.m_axis = i;
        this.m_value = f;
        this.m_index = i2;
    }
}

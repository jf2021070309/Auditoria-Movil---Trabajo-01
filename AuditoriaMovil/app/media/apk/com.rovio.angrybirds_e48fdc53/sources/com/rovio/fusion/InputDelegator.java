package com.rovio.fusion;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class InputDelegator {
    private InputHandler a;

    /* loaded from: classes2.dex */
    public interface InputHandler {
        void processInput(MyInputEvent myInputEvent);

        void processInput(ArrayList<MyInputEvent> arrayList);
    }

    public InputDelegator(InputHandler inputHandler) {
        this.a = inputHandler;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = (action & 65280) >> 8;
        int i2 = action & 255;
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            float x = motionEvent.getX(i3);
            float y = motionEvent.getY(i3);
            if (i2 == 5) {
                i2 = 0;
            } else if (i2 == 6) {
                i2 = 1;
            }
            if (i3 == i || (i2 != 0 && i2 != 1)) {
                this.a.processInput(new MyInputEvent(i2, x, y, pointerId));
            }
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 9 || action == 7 || action == 10) {
            this.a.processInput(new MyInputEvent(action, motionEvent.getX(), motionEvent.getY()));
            return true;
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            this.a.processInput(new MyInputEvent(1, i, keyEvent.getUnicodeChar(), keyEvent.getDeviceId()));
        }
        return a(i);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            this.a.processInput(new MyInputEvent(0, i, keyEvent.getUnicodeChar(), keyEvent.getDeviceId()));
        }
        return a(i);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        InputDevice device = motionEvent.getDevice();
        if ((device.getSources() & 16) == 0 && (device.getSources() & 1025) == 0) {
            return false;
        }
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            float a = a(device, motionEvent, 0);
            float a2 = a(device, motionEvent, 1);
            float a3 = a(device, motionEvent, 15);
            float a4 = a(device, motionEvent, 16);
            float a5 = a(device, motionEvent, 12);
            float a6 = a(device, motionEvent, 13);
            float a7 = a(device, motionEvent, 11);
            float a8 = a(device, motionEvent, 14);
            float a9 = a(device, motionEvent, 23);
            float a10 = a(device, motionEvent, 22);
            float a11 = a(device, motionEvent, 17);
            float a12 = a(device, motionEvent, 18);
            if (device.getName().length() < "Samsung".length() || !device.getName().substring(0, "Samsung".length()).equals("Samsung")) {
                a6 = a8;
                f = a7;
            } else {
                f = a5;
            }
            if (device.getName().length() < "Thunder".length() || !device.getName().substring(0, "Thunder".length()).equals("Thunder")) {
                f2 = a12;
                f3 = a11;
            } else {
                f2 = a10;
                f3 = a9;
            }
            ArrayList<MyInputEvent> arrayList = new ArrayList<>();
            arrayList.add(new MyInputEvent(1, a, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(2, a2, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(3, f, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(4, a6, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(5, f3, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(6, f2, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(7, a9, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(8, a10, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(9, a3, motionEvent.getDeviceId()));
            arrayList.add(new MyInputEvent(10, a4, motionEvent.getDeviceId()));
            this.a.processInput(arrayList);
        }
        return true;
    }

    private float a(InputDevice inputDevice, MotionEvent motionEvent, int i) {
        InputDevice.MotionRange motionRange = inputDevice.getMotionRange(i);
        float axisValue = motionEvent.getAxisValue(i);
        if (motionRange == null || Math.abs(axisValue) >= motionRange.getFlat()) {
            return axisValue;
        }
        return 0.0f;
    }

    private boolean a(int i) {
        return i == 4 || i == 82 || i == 96 || i == 97 || i == 99 || i == 100 || i == 106 || i == 107 || i == 102 || i == 103 || i == 23 || i == 21 || i == 22 || i == 19 || i == 20;
    }
}

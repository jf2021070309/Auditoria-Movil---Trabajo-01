package com.rovio.fusion;

import android.content.Intent;
import android.net.Uri;
import com.rovio.fusion.InputDelegator;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class MyInputHandler extends ActivityListener implements InputDelegator.InputHandler {
    private static final boolean ENABLE_LOGGING = false;
    private ArrayList<MyInputEvent> a = new ArrayList<>();

    public native void nativeInput(int i, float f, float f2, int i2);

    public native void nativeInputAxis(int i, float f, int i2);

    public native void nativeKeyInput(int i, int i2, int i3, int i4);

    public native void nativeLoadFromUrl(String str);

    public MyInputHandler() {
        Globals.registerActivityListener((ActivityListener) this);
    }

    @Override // com.rovio.fusion.ActivityListener, com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
        final Uri data;
        a("onNewIntent");
        if (!isHistoryIntent(intent) && (data = intent.getData()) != null) {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.MyInputHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    MyInputHandler.this.a("loadFromUrl(URI: " + data.toString() + ")");
                    MyInputHandler.this.nativeLoadFromUrl(data.toString());
                }
            });
        }
    }

    @Override // com.rovio.fusion.InputDelegator.InputHandler
    public void processInput(MyInputEvent myInputEvent) {
        synchronized (this.a) {
            this.a.add(myInputEvent);
        }
    }

    @Override // com.rovio.fusion.InputDelegator.InputHandler
    public void processInput(ArrayList<MyInputEvent> arrayList) {
        synchronized (this.a) {
            this.a.addAll(arrayList);
        }
    }

    public void handleEvents() {
        synchronized (this.a) {
            for (int i = 0; i < this.a.size(); i++) {
                MyInputEvent myInputEvent = this.a.get(i);
                switch (myInputEvent.m_eventClass) {
                    case 0:
                        int i2 = myInputEvent.m_unicodeChar;
                        if (myInputEvent.m_keyCode == 66) {
                            i2 = 10;
                        } else if (myInputEvent.m_keyCode == 67) {
                            i2 = 8;
                        }
                        nativeKeyInput(myInputEvent.m_keyCode, myInputEvent.m_event, i2, myInputEvent.m_index);
                        break;
                    case 1:
                        nativeInput(myInputEvent.m_event, myInputEvent.m_x, myInputEvent.m_y, myInputEvent.m_index);
                        break;
                    case 2:
                        nativeInputAxis(myInputEvent.m_axis, myInputEvent.m_value, myInputEvent.m_index);
                        break;
                    case 3:
                        nativeInput(myInputEvent.m_event, myInputEvent.m_x, myInputEvent.m_y, 0);
                        break;
                }
            }
            this.a.clear();
        }
        Globals.runAppThreadRunnables();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
    }

    private static boolean isHistoryIntent(Intent intent) {
        return (intent.getFlags() & 1048576) != 0;
    }
}

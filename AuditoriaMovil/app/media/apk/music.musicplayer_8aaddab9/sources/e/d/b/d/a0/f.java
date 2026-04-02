package e.d.b.d.a0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;
/* loaded from: classes2.dex */
public class f implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector a;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.a.onTouchEvent(motionEvent);
        }
        return false;
    }
}

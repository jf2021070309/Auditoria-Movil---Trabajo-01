package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
/* loaded from: classes3.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;
    private static final String[] HOUR_CLOCK_VALUES = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] HOUR_CLOCK_24_VALUES = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static final String[] MINUTE_CLOCK_VALUES = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    private String[] getHourClockValues() {
        if (this.time.format == 1) {
            return HOUR_CLOCK_24_VALUES;
        }
        return HOUR_CLOCK_VALUES;
    }

    private int getHourRotation() {
        return (this.time.getHourForDisplay() * DEGREES_PER_HOUR) % 360;
    }

    private void performHapticFeedback(int i, int i2) {
        TimeModel timeModel = this.time;
        if (timeModel.minute != i2 || timeModel.hour != i) {
            this.timePickerView.performHapticFeedback(4);
        }
    }

    private void updateCurrentLevel() {
        TimeModel timeModel = this.time;
        int i = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            i = 2;
        }
        this.timePickerView.setCurrentLevel(i);
    }

    private void updateTime() {
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
    }

    private void updateValues() {
        updateValues(HOUR_CLOCK_VALUES, TimeModel.NUMBER_FORMAT);
        updateValues(MINUTE_CLOCK_VALUES, TimeModel.ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        if (this.time.format == 0) {
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f, boolean z) {
        boolean z2;
        this.broadcasting = true;
        TimeModel timeModel = this.time;
        int i = timeModel.minute;
        int i2 = timeModel.hour;
        if (timeModel.selection == 10) {
            this.timePickerView.setHandRotation(this.hourRotation, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) com.amazon.aps.iva.d3.a.getSystemService(this.timePickerView.getContext(), AccessibilityManager.class);
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                setSelection(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.time.setMinute(((round + 15) / DEGREES_PER_HOUR) * 5);
                this.minuteRotation = this.time.minute * 6;
            }
            this.timePickerView.setHandRotation(this.minuteRotation, z);
        }
        this.broadcasting = false;
        updateTime();
        performHapticFeedback(i2, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i) {
        this.time.setPeriod(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        if (this.broadcasting) {
            return;
        }
        TimeModel timeModel = this.time;
        int i = timeModel.hour;
        int i2 = timeModel.minute;
        int round = Math.round(f);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            timeModel2.setMinute((round + 3) / 6);
            this.minuteRotation = (float) Math.floor(this.time.minute * 6);
        } else {
            int i3 = (round + 15) / DEGREES_PER_HOUR;
            if (timeModel2.format == 1) {
                i3 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    i3 += 12;
                }
            }
            this.time.setHour(i3);
            this.hourRotation = getHourRotation();
        }
        if (!z) {
            updateTime();
            performHapticFeedback(i, i2);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        setSelection(i, true);
    }

    public void setSelection(int i, boolean z) {
        boolean z2;
        String[] hourClockValues;
        int hourContentDescriptionResId;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.timePickerView.setAnimateOnTouchUp(z2);
        this.time.selection = i;
        TimePickerView timePickerView = this.timePickerView;
        if (z2) {
            hourClockValues = MINUTE_CLOCK_VALUES;
        } else {
            hourClockValues = getHourClockValues();
        }
        if (z2) {
            hourContentDescriptionResId = R.string.material_minute_suffix;
        } else {
            hourContentDescriptionResId = this.time.getHourContentDescriptionResId();
        }
        timePickerView.setValues(hourClockValues, hourContentDescriptionResId);
        updateCurrentLevel();
        TimePickerView timePickerView2 = this.timePickerView;
        if (z2) {
            f = this.minuteRotation;
        } else {
            f = this.hourRotation;
        }
        timePickerView2.setHandRotation(f, z);
        this.timePickerView.setActiveSelection(i);
        this.timePickerView.setMinuteHourDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, com.amazon.aps.iva.p3.a
            public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
                super.onInitializeAccessibilityNodeInfo(view, lVar);
                lVar.k(view.getResources().getString(TimePickerClockPresenter.this.time.getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.this.time.getHourForDisplay())));
            }
        });
        this.timePickerView.setHourClickDelegate(new ClickActionDelegate(this.timePickerView.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, com.amazon.aps.iva.p3.a
            public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
                super.onInitializeAccessibilityNodeInfo(view, lVar);
                lVar.k(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.time.minute)));
            }
        });
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
    }

    private void updateValues(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i], str);
        }
    }
}

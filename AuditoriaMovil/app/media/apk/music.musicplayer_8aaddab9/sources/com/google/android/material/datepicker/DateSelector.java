package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c.i.j.b;
import e.d.b.d.m.s;
import java.util.Collection;
/* loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    boolean B();

    Collection<Long> I();

    S K();

    void Q(long j2);

    String a(Context context);

    Collection<b<Long, Long>> f();

    View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, s<S> sVar);

    int y(Context context);
}

package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.HollowObject;
import com.netflix.hollow.HollowObjectSchema;

@SuppressWarnings("all")
public class AbsoluteScheduleHollow extends HollowObject {

    public AbsoluteScheduleHollow(AbsoluteScheduleDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public long _getMovieId() {
        return delegate().getMovieId(ordinal);
    }

    public Long _getMovieIdBoxed() {
        return delegate().getMovieIdBoxed(ordinal);
    }

    public String _getPhaseTag() {
        return delegate().getPhaseTag(ordinal);
    }

    public boolean _isPhaseTagEqual(String testValue) {
        return delegate().isPhaseTagEqual(ordinal, testValue);
    }

    public long _getStartDate() {
        return delegate().getStartDate(ordinal);
    }

    public Long _getStartDateBoxed() {
        return delegate().getStartDateBoxed(ordinal);
    }

    public long _getEndDate() {
        return delegate().getEndDate(ordinal);
    }

    public Long _getEndDateBoxed() {
        return delegate().getEndDateBoxed(ordinal);
    }

    public VMSHollowInputAPI api() {
        return typeApi().getAPI();
    }

    public AbsoluteScheduleTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected AbsoluteScheduleDelegate delegate() {
        return (AbsoluteScheduleDelegate)delegate;
    }

}
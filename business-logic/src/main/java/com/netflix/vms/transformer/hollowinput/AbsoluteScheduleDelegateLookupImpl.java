package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;

@SuppressWarnings("all")
public class AbsoluteScheduleDelegateLookupImpl extends HollowObjectAbstractDelegate implements AbsoluteScheduleDelegate {

    private final AbsoluteScheduleTypeAPI typeAPI;

    public AbsoluteScheduleDelegateLookupImpl(AbsoluteScheduleTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public long getMovieId(int ordinal) {
        return typeAPI.getMovieId(ordinal);
    }

    public Long getMovieIdBoxed(int ordinal) {
        return typeAPI.getMovieIdBoxed(ordinal);
    }

    public String getPhaseTag(int ordinal) {
        return typeAPI.getPhaseTag(ordinal);
    }

    public boolean isPhaseTagEqual(int ordinal, String testValue) {
        return typeAPI.isPhaseTagEqual(ordinal, testValue);
    }

    public long getStartDate(int ordinal) {
        return typeAPI.getStartDate(ordinal);
    }

    public Long getStartDateBoxed(int ordinal) {
        return typeAPI.getStartDateBoxed(ordinal);
    }

    public long getEndDate(int ordinal) {
        return typeAPI.getEndDate(ordinal);
    }

    public Long getEndDateBoxed(int ordinal) {
        return typeAPI.getEndDateBoxed(ordinal);
    }

    public AbsoluteScheduleTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}
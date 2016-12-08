package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;

@SuppressWarnings("all")
public class OverrideScheduleDelegateLookupImpl extends HollowObjectAbstractDelegate implements OverrideScheduleDelegate {

    private final OverrideScheduleTypeAPI typeAPI;

    public OverrideScheduleDelegateLookupImpl(OverrideScheduleTypeAPI typeAPI) {
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

    public long getAvailabilityOffset(int ordinal) {
        return typeAPI.getAvailabilityOffset(ordinal);
    }

    public Long getAvailabilityOffsetBoxed(int ordinal) {
        return typeAPI.getAvailabilityOffsetBoxed(ordinal);
    }

    public OverrideScheduleTypeAPI getTypeAPI() {
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